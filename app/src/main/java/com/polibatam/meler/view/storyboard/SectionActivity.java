package com.polibatam.meler.view.storyboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.polibatam.meler.MainActivity;
import com.polibatam.meler.R;
import com.polibatam.meler.model.data.Section;
import com.polibatam.meler.model.persistence.LessonsLDH;

public class SectionActivity extends AppCompatActivity {

    private TextView pageTV, sectiontitleTv, sectiontextTv;
    private ImageView navprecBt, navnextBt, sectionimage;
    private Section section;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section);

        Intent intent = getIntent();
        final int lessonid = intent.getIntExtra("lessonid", 0);
        final int sectionn = intent.getIntExtra("sectionn", 0);

        LessonsLDH lessonsLDH = LessonsLDH.getInstance(this);
        section = lessonsLDH.getSection(lessonid, sectionn);

        if (section == null) {
            Toast.makeText(SectionActivity.this, "Problems while loading section" + Integer.toString(sectionn), Toast.LENGTH_LONG).show();
        }

        pageTV= findViewById(R.id.page);
        navprecBt  = findViewById(R.id.navprec);
        navnextBt = findViewById(R.id.navnext);
        sectiontitleTv = findViewById(R.id.sectiontitle);
        sectionimage = findViewById(R.id.sectionimage);
        sectiontextTv = findViewById(R.id.sectiontext);

        getSupportActionBar().setTitle(section.getLessonTitle());


        sectiontitleTv.setText(section.getTitle());
        String imagename = "s" + Integer.toString(lessonid) + Integer.toString(sectionn);
        sectionimage.setImageResource(getResources().getIdentifier(imagename,
                "drawable", getPackageName()));
        sectiontextTv.setText(section.getText());

        String page = section.getTitle() + "  " + Integer.toString(sectionn+1)
                + "/" + Integer.toString(section.getLessonSections());
        pageTV.setText(page);

        if(sectionn == 0){
            navprecBt.setVisibility(View.GONE);
        } else {
            navprecBt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    changeSection(lessonid, sectionn-1);
                }
            });
        }

        navnextBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sectionn<section.getLessonSections()-1){
                    changeSection(lessonid, sectionn+1);
                } else {
                    startQuiz(lessonid);
                }
            }
        });
    }

    void changeSection(int lessonid, int sectionn){
        Intent intent = new Intent(SectionActivity.this, SectionActivity.class);
        intent.putExtra("sectionn", sectionn);
        intent.putExtra("lessonid", lessonid);
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        startActivity(intent);
    }

    void startQuiz(int lessonid){
        Intent intent = new Intent(SectionActivity.this, QuizActivity.class);
        intent.putExtra("lessonid", lessonid);
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.submenu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.menuClose:
                Intent intent = new Intent(SectionActivity.this, MainActivity.class);
                startActivity(intent);
                break;
        }
        return true;
    }

}
