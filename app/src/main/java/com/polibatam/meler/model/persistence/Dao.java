package com.polibatam.meler.model.persistence;

import android.content.Context;

import com.polibatam.meler.model.data.Course;
import com.polibatam.meler.model.data.Section;
import com.polibatam.meler.model.data.Level;

import java.util.List;

public abstract class Dao {
    protected abstract void populateDatabase(Context context);
    protected abstract List<String> getCourseNames();
    protected abstract List<Course> getCourses();
    protected abstract Section getSection(int lessonId, int sectionNumber);
    protected abstract String getQuestions(int lessonId);
    protected abstract String getLessonTitle(int lessonid);
    protected abstract Level getLevel();
    protected abstract int updateResult(int lessonid, int newResult);

}