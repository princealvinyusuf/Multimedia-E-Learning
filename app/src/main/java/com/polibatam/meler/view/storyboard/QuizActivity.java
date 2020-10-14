package com.polibatam.meler.view.storyboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.polibatam.meler.MainActivity;
import com.polibatam.meler.R;
import com.polibatam.meler.model.Preferences;
import com.polibatam.meler.model.data.Level;
import com.polibatam.meler.model.persistence.LessonsLDH;
import com.polibatam.meler.view.layout.FitDoughnut;

import java.util.ArrayList;
import java.util.List;

public class QuizActivity extends AppCompatActivity implements View.OnClickListener{
    String[] questions;
    String lessontitle;
    LessonsLDH lessonsLDH;
    int curq;
    int lessonid;
    public static final String Q_SEP = "<<-->>";
    public static final String A_SEP = "<->";
    boolean[] results;

    private TextView lessontitleTv, questiontitleTv, tap_next_label;
    private Button[] answersBt;
    private ImageView[] resqIv;
    private RelativeLayout emptyview;

    private Button btn1, btn2, btn3, btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        tap_next_label = findViewById(R.id.tap_next);
        tap_next_label.setVisibility(View.GONE);

        Intent intent = getIntent();
        lessonid = intent.getIntExtra("lessonid", 0);

        lessonsLDH = LessonsLDH.getInstance(this);
        String q = lessonsLDH.getQuestions(lessonid);
        lessontitle = lessonsLDH.getLessonTitle(lessonid);

        questions = q.split(Q_SEP);
        curq = 0;

        lessontitleTv = findViewById(R.id.lesson_title);
        questiontitleTv = findViewById(R.id.question_title);

        answersBt = new Button[]{findViewById(R.id.answer1), findViewById(R.id.answer2), findViewById(R.id.answer3), findViewById(R.id.answer4)};
        resqIv = new ImageView[]{findViewById(R.id.resq0), findViewById(R.id.resq1), findViewById(R.id.resq2),
                findViewById(R.id.resq3), findViewById(R.id.resq4),findViewById(R.id.resq5),findViewById(R.id.resq6),
                findViewById(R.id.resq7),findViewById(R.id.resq8),findViewById(R.id.resq9)};
        emptyview = findViewById(R.id.emptyview);
        emptyview.setVisibility(View.GONE);

        lessontitleTv.setText(lessontitle);

        results = new boolean[]{false, false, false, false, false, false, false, false, false, false};

        emptyview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextQuestion();
            }
        });


        btn1 = findViewById(R.id.answer1);
        btn2 = findViewById(R.id.answer2);
        btn3 = findViewById(R.id.answer3);
        btn4 = findViewById(R.id.answer4);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);

        setCurrentQuestion();

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.answer1:
                btn1.setBackground(getResources().getDrawable(R.drawable.answerboxthick));
                btn2.setBackground(getResources().getDrawable(R.drawable.answerboxthick));
                btn3.setBackground(getResources().getDrawable(R.drawable.answerboxthick));
                btn4.setBackground(getResources().getDrawable(R.drawable.answerboxthick));
                break;
            case R.id.answer2:
                btn2.setBackground(getResources().getDrawable(R.drawable.answerboxthick));
                btn1.setBackground(getResources().getDrawable(R.drawable.answerboxthick));
                btn3.setBackground(getResources().getDrawable(R.drawable.answerboxthick));
                btn4.setBackground(getResources().getDrawable(R.drawable.answerboxthick));
                break;
            case R.id.answer3:
                btn3.setBackground(getResources().getDrawable(R.drawable.answerboxthick));
                btn2.setBackground(getResources().getDrawable(R.drawable.answerboxthick));
                btn1.setBackground(getResources().getDrawable(R.drawable.answerboxthick));
                btn4.setBackground(getResources().getDrawable(R.drawable.answerboxthick));
                break;
            case R.id.answer4:
                btn4.setBackground(getResources().getDrawable(R.drawable.answerboxthick));
                btn2.setBackground(getResources().getDrawable(R.drawable.answerboxthick));
                btn3.setBackground(getResources().getDrawable(R.drawable.answerboxthick));
                btn1.setBackground(getResources().getDrawable(R.drawable.answerboxthick));
                break;
        }
    }

    private void nextQuestion(){
        if(curq == 9){
            int tot = 0;
            for(int i = 0; i<10; i++){
                if(results[i]) {
                    tot++;
                }
            }

            int ch = 5*lessonsLDH.updateResult(lessonid, tot);

            LayoutInflater inflater = this.getLayoutInflater();
            View dialogView = inflater.inflate(R.layout.result_dialog, null);

            final android.app.AlertDialog dialog = new android.app.AlertDialog.Builder(QuizActivity.this).setView(dialogView).show();

            TextView tvCompl = dialogView.findViewById(R.id.tvcompl);
            TextView tvScore = dialogView.findViewById(R.id.tvscore);
            TextView tvResult = dialogView.findViewById(R.id.tvresult);

            if(tot == 10){
                tvCompl.setText("Perfect!");
                tap_next_label.setVisibility(View.GONE);

            } else if (tot>=7){
                tvCompl.setText("Well Done!");
                tap_next_label.setVisibility(View.GONE);
            } else {
                tvCompl.setText("Try Again!");
                // Come on you can do it better TEXT
                tvCompl.setTextColor(getResources().getColor(R.color.color_red));
                TextView tvExtra = dialogView.findViewById(R.id.tvextra);
                tvExtra.setVisibility(View.VISIBLE);
                tap_next_label.setVisibility(View.GONE);
            }

            String res = "Score:\n" + Integer.toString(tot) + "/10";
            tvResult.setText(res);

            String change = "+" + Integer.toString(ch) + "\n" + Preferences.SCORE_NAME;
            tvScore.setText(change);

            // level
            Level level = lessonsLDH.getLevel();
            FitDoughnut doughnut = (FitDoughnut) dialogView.findViewById(R.id.doughnuttot);
            doughnut.animateSetPercent((float) level.getPerctot());
            TextView tvperctot = dialogView.findViewById(R.id.tvpercentage);
            String p = Integer.toString(level.getPerctot())+ "%";
            tvperctot.setText(p);
            TextView tvLev = dialogView.findViewById(R.id.tvlevel);
            tvLev.setText(level.getLiv());
            TextView tvProg = dialogView.findViewById(R.id.tvprogress);
            String prog = Integer.toString(level.getProg()) + " / " + Integer.toString(level.getTot());
            tvProg.setText(prog);

            Button btTryAgain = dialogView.findViewById(R.id.btTryAgain);
            btTryAgain.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialog.dismiss();
                    Intent intent = new Intent(QuizActivity.this, SectionActivity.class);
                    intent.putExtra("sectionn", 0);
                    intent.putExtra("lessonid", lessonid);
                    startActivity(intent);
                }
            });

            Button btHome = dialogView.findViewById(R.id.btHome);
            btHome.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    dialog.dismiss();
                    Intent intent = new Intent(QuizActivity.this, MainActivity.class);
                    startActivity(intent);
                }
            });

        } else {
            emptyview.setVisibility(View.GONE);
            curq++;
            setCurrentQuestion();
        }
    }

    // Not This
    private void setCurrentQuestion(){
        String[] parts = questions[curq].split(A_SEP);
        questiontitleTv.setText(parts[0]);
        final int correctans;
        tap_next_label.setVisibility(View.GONE);

        if(parts.length == 2){
            // true or false
//            answersBt[0].setBackground(getResources().getDrawable(R.drawable.answerbox));
//            answersBt[1].setBackground(getResources().getDrawable(R.drawable.answerbox));
            answersBt[0].setText("Benar");
            answersBt[1].setText("Salah");
            answersBt[2].setVisibility(View.GONE);
            answersBt[3].setVisibility(View.GONE);

            if(parts[1].charAt(0)== 'F'){
                correctans = 1;
            } else {
                correctans = 0;
            }
        } else {
            // 4 multiple choices

            List<Integer> list = new ArrayList<Integer>();
            list.add(0);
            list.add(1);
            list.add(2);
            list.add(3);
            java.util.Collections.shuffle(list);

            correctans = list.indexOf(0);

            for(int i = 0; i<4; i++){
                answersBt[i].setVisibility(View.VISIBLE);
//                answersBt[i].setBackground(getResources().getDrawable(R.drawable.answerbox));
                answersBt[i].setText(parts[list.get(i)+1]);

            }
        }


        // NB: resqIV = box bawah indikator soal
        answersBt[correctans].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                answersBt[correctans].setBackground(getResources().getDrawable(R.drawable.answerboxthick));
                results[curq] = true;
                resqIv[curq].setBackground(getResources().getDrawable(R.drawable.answerbox));
                emptyview.setVisibility(View.VISIBLE);
                tap_next_label.setVisibility(View.VISIBLE);

                //sampai sini
                btn1.setBackgroundColor(getResources().getColor(R.color.color_red));

                if (curq == 9) {
                    tap_next_label.setText("Tap To Finish");
                }
            }
        });

        for(int i = 0; i<4; i++){
            if(i != correctans){
                final int finalI = i;
                answersBt[i].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
//                      answersBt[correctans].setBackground(getResources().getDrawable(R.drawable.answerboxthick));
//                      answersBt[finalI].setBackground(getResources().getDrawable(R.drawable.answerboxwrong));
                        resqIv[curq].setBackground(getResources().getDrawable(R.drawable.answerbox));
                        emptyview.setVisibility(View.VISIBLE);
                        tap_next_label.setVisibility(View.VISIBLE);

                        if (curq == 9) {
                            tap_next_label.setText("Tap To Finish");
                        }
                    }
                });
            }
        }


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
                Intent intent = new Intent(QuizActivity.this, MainActivity.class);
                startActivity(intent);
                break;
        }
        return true;
    }
}
