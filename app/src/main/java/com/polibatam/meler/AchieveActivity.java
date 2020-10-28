package com.polibatam.meler;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.polibatam.meler.model.adapter.CoursesProgGridAdapter;
import com.polibatam.meler.model.data.Course;
import com.polibatam.meler.model.data.Level;
import com.polibatam.meler.model.persistence.LessonsLDH;
import com.polibatam.meler.view.layout.ExpandableHeightGridView;
import com.polibatam.meler.view.layout.FitDoughnut;

import java.util.ArrayList;
import java.util.List;

public class AchieveActivity extends AppCompatActivity {

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Intent intent;
            switch (item.getItemId()) {

                case R.id.navigation_explore:
                    intent = new Intent(AchieveActivity.this, MainActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);
                    return true;
                case R.id.navigation_motion:
                    intent = new Intent(AchieveActivity.this, MotionLibraryActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);
                    return true;
                case R.id.navigation_achievement:
                    return true;
                case R.id.navigation_praktikum:
                    intent = new Intent(AchieveActivity.this, PraktikumActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);
                    return true;
                case R.id.navigation_jawaban:
                    intent = new Intent(AchieveActivity.this, JawabanActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_achieve);

        setTitle(R.string.pencapaian);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navigation.setSelectedItemId(R.id.navigation_achievement);

        LessonsLDH lessonsLDH = LessonsLDH.getInstance(this);
        Level level = lessonsLDH.getLevel();

        // set up the overall level
        FitDoughnut doughnut = (FitDoughnut) findViewById(R.id.doughnuttot);
        doughnut.animateSetPercent((float) level.getPerctot());
        TextView tvperctot = findViewById(R.id.tvpercentage);
        String p = Integer.toString(level.getPerctot())+ "%";
        tvperctot.setText(p);
        TextView tvLev = findViewById(R.id.tvlevel);
        tvLev.setText(level.getLiv());
        TextView tvProg = findViewById(R.id.tvprogress);
        String prog = Integer.toString(level.getProg()) + " / " + Integer.toString(level.getTot());
        tvProg.setText(prog);

        ExpandableHeightGridView gridCourses = findViewById(R.id.gridCoursesProg);
        List<Course> courses = new ArrayList<>();
        List<String> coursesTitles = lessonsLDH.getCourseNames();
        for(int i = 0; i<coursesTitles.size(); i++){
            courses.add(new Course(coursesTitles.get(i), level.getPerccourses()[i]));
        }
        CoursesProgGridAdapter coursesAdapter = new CoursesProgGridAdapter(courses);
        gridCourses.setAdapter(coursesAdapter);
        gridCourses.setExpanded(true);
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.menu, menu);
//
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//
//        switch (item.getItemId()) {
//            case R.id.menuProfile:
//                startActivity(new Intent(this, ProfileActivity.class));
//                break;
//            case R.id.menuLogout:
//                FirebaseAuth.getInstance().signOut();
//                finish();
//                startActivity(new Intent(this, SignInActivity.class));
//                break;
//        }
//        return true;
//    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setTitle(R.string.tutupaplikasi)
                .setMessage(R.string.tinggalkanaplikasi)
                .setPositiveButton("Ya", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finishAffinity();
                        System.exit(0);
                    }

                })
                .setNegativeButton("Tidak", null)
                .show();
    }

}
