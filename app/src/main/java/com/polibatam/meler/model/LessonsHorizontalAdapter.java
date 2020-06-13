package com.polibatam.meler.model;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.polibatam.meler.R;
import com.polibatam.meler.model.data.Lesson;
import com.polibatam.meler.view.layout.FitDoughnut;
import com.polibatam.meler.view.storyboard.SectionActivity;

import java.util.ArrayList;
import java.util.List;

public class LessonsHorizontalAdapter extends RecyclerView.Adapter<LessonsHorizontalAdapter.SimpleViewHolder> {

    private Context context;
    private List<Lesson> lessons;
    private int courseId;

    public LessonsHorizontalAdapter(Context context, List<Lesson> elements, int courseId) {
        this.context = context;
        this.lessons = elements;
        this.courseId = courseId;
        if (lessons == null) {
            lessons = new ArrayList<>();
        }
    }

    public static class SimpleViewHolder extends RecyclerView.ViewHolder {
        public final TextView tvLessonTitle;
        public final RelativeLayout allView;
        public final ImageView iconLesson;
        public final FitDoughnut doughnut;

        public SimpleViewHolder(View view) {
            super(view);
            tvLessonTitle = (TextView) view.findViewById(R.id.lesson_title);
            allView = (RelativeLayout) view.findViewById(R.id.allview);
            doughnut = (FitDoughnut) view.findViewById(R.id.doughnutres);
            iconLesson = view.findViewById(R.id.lesson_icon);
        }
    }

    @Override
    public SimpleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final View v = LayoutInflater.from(this.context).inflate(R.layout.lesson_item, parent, false);
        return new SimpleViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final SimpleViewHolder holder, final int position) {
        holder.tvLessonTitle.setText(lessons.get(position).getTitle());

        String backgroundname = "course" + Integer.toString(courseId);
        holder.iconLesson.setBackgroundResource(context.getResources().getIdentifier(backgroundname,
                "drawable", context.getPackageName()));

        String iconname = "x" + Integer.toString(lessons.get(position).getId());
        holder.iconLesson.setImageResource(context.getResources().getIdentifier(iconname,
                "drawable", context.getPackageName()));

        if (lessons.get(position).getResult() > 0) {
            holder.doughnut.setVisibility(View.VISIBLE);
            holder.doughnut.animateSetPercent(((float) lessons.get(position).getResult() * 10) - 0.01f);
        }


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (lessons.get(position).getNumberOfSections() == 0) {
/*
                    Toast.makeText(context, "Sorry, this lesson is not available yet. Try instead the lessons on Multimedia Design, Animation", Toast.LENGTH_LONG).show();
*/
                    AlertDialog.Builder alertDialog = new AlertDialog.Builder(context);
                    alertDialog.setTitle("Not available");
                    alertDialog.setMessage("Sorry, this lesson is not available yet. Try instead the lessons on Multimedia Design, Animation");
                    alertDialog.setPositiveButton("OK",    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
                    alertDialog.show();
                } else {
                    Intent intent = new Intent(context, SectionActivity.class);
                    intent.putExtra("sectionn", 0);
                    intent.putExtra("lessonid", lessons.get(position).getId());
                    context.startActivity(intent);
                }
            }
        });
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemCount() {
        return this.lessons.size();
    }
}
