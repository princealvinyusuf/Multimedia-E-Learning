package com.polibatam.meler.view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.polibatam.meler.MainActivity;
import com.polibatam.meler.R;
import com.polibatam.meler.controller.CheckNetwork;
import com.polibatam.meler.view.register.ProfileActivity;
import com.polibatam.meler.view.register.SignInActivity;
import com.polibatam.meler.view.storyboard.AchieveActivity;
import com.polibatam.meler.view.storyboard.VideoActivity;

public class MotionLibraryActivity extends AppCompatActivity {

    GridLayout mainGrid;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Intent intent;
            switch (item.getItemId()) {

                case R.id.navigation_explore:
                    intent = new Intent(MotionLibraryActivity.this, MainActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);
                    return true;
                case R.id.navigation_profile:
                    intent = new Intent(MotionLibraryActivity.this, AchieveActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);
                    return true;
                case R.id.navigation_motion_library:
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motion_library);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navigation.setSelectedItemId(R.id.navigation_motion_library);

        final ActionBar abar = getSupportActionBar();
        View viewActionBar = getLayoutInflater().inflate(R.layout.actionbar_titletext_layout, null);
        ActionBar.LayoutParams params = new ActionBar.LayoutParams(
                ActionBar.LayoutParams.WRAP_CONTENT,
                ActionBar.LayoutParams.MATCH_PARENT,
                Gravity.CENTER);
        TextView textviewTitle = (TextView) viewActionBar.findViewById(R.id.actionbar_textview);
        textviewTitle.setText("Motion Library");
        abar.setCustomView(viewActionBar, params);
        abar.setDisplayShowCustomEnabled(true);
        abar.setDisplayShowTitleEnabled(false);

        mainGrid = (GridLayout) findViewById(R.id.mainGrid);

        setSingleEvent(mainGrid);

        if(CheckNetwork.isInternetAvailable(MotionLibraryActivity.this))
        {
//            Toast.makeText(MotionLibraryActivity.this, "Make Sure Your Internet Connection Is Stable", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(MotionLibraryActivity.this, "No Internet Connection", Toast.LENGTH_LONG).show();
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.menuProfile:
                startActivity(new Intent(this, ProfileActivity.class));
                break;
            case R.id.menuLogout:
                FirebaseAuth.getInstance().signOut();
                finish();
                startActivity(new Intent(this, SignInActivity.class));
                break;
        }
        return true;
    }

    private void setSingleEvent(GridLayout mainGrid) {
        //Loop all child item for main grid
        for (int i = 0; i < mainGrid.getChildCount(); i++) {
            //All child item is cardView, just cast object to cardView
            final CardView cardView = (CardView) mainGrid.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (finalI == 0 ) {
                        Intent intent = new Intent(MotionLibraryActivity.this, VideoActivity.class);
                        intent.putExtra(VideoActivity.EXTRA_URL, "");
                        startActivity(intent);
                    }
                    else if (finalI == 1) {
                        Intent intent = new Intent(MotionLibraryActivity.this, VideoActivity.class);
                        intent.putExtra(VideoActivity.EXTRA_URL, "https://res.cloudinary.com/polibatam/video/upload/v1592193241/Materi_1_Nirmana_gpawtw.mp4");
                        startActivity(intent);
                    }
                    else if (finalI == 2 ) {
                        Intent intent = new Intent(MotionLibraryActivity.this, VideoActivity.class);
                        intent.putExtra(VideoActivity.EXTRA_URL, "https://res.cloudinary.com/polibatam/video/upload/v1592196910/materi_2_warna_oah30m.mp4");
                        startActivity(intent);
                    }
                    else if (finalI == 3 ) {
                        Intent intent = new Intent(MotionLibraryActivity.this, VideoActivity.class);
                        intent.putExtra(VideoActivity.EXTRA_URL, "https://res.cloudinary.com/polibatam/video/upload/v1592197327/Materi_3_Tipografi_jrdqwn.mp4");
                        startActivity(intent);
                    }
                    else if (finalI == 4 ) {
                        Intent intent = new Intent(MotionLibraryActivity.this, VideoActivity.class);
                        intent.putExtra(VideoActivity.EXTRA_URL, "");
                        startActivity(intent);
                    }
                    else if (finalI == 5 ) {
                        Intent intent = new Intent(MotionLibraryActivity.this, VideoActivity.class);
                        intent.putExtra(VideoActivity.EXTRA_URL, "https://res.cloudinary.com/polibatam/video/upload/v1592195956/Materi_6_Layout_gjqeow.mp4");
                        startActivity(intent);
                    }
                    else if (finalI == 6 ) {
                        Intent intent = new Intent(MotionLibraryActivity.this, VideoActivity.class);
                        intent.putExtra(VideoActivity.EXTRA_URL, "");
                        startActivity(intent);
                    }
                    else if (finalI == 7 ) {
                        Intent intent = new Intent(MotionLibraryActivity.this, VideoActivity.class);
                        intent.putExtra(VideoActivity.EXTRA_URL, "");
                        startActivity(intent);
                    }
                    else if (finalI == 8 ) {
                        Intent intent = new Intent(MotionLibraryActivity.this, VideoActivity.class);
                        intent.putExtra(VideoActivity.EXTRA_URL, "");
                        startActivity(intent);
                    }
                    else if (finalI == 9 ) {
                        Intent intent = new Intent(MotionLibraryActivity.this, VideoActivity.class);
                        intent.putExtra(VideoActivity.EXTRA_URL, "https://res.cloudinary.com/polibatam/video/upload/v1592195450/Materi_9_ilustrasi_cnqujx.mp4");
                        startActivity(intent);
                    }
                    else {
                        Toast.makeText(MotionLibraryActivity.this, "Please select one of this item", Toast.LENGTH_SHORT).show();
                    }

                }
            });
        }
    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setTitle("Closing Meler")
                .setMessage("Are you sure you want to leave the courses?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finishAffinity();
                        System.exit(0);
                    }

                })
                .setNegativeButton("No", null)
                .show();
    }


}
