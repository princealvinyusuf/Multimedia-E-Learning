package com.polibatam.meler;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.polibatam.meler.praktikum.PDFPraktikumActivity;
import com.polibatam.meler.praktikum.Praktikum;
import com.polibatam.meler.praktikum.PraktikumAdapter;

import java.util.ArrayList;

public class PraktikumActivity extends AppCompatActivity {

    private PraktikumAdapter praktikumAdapter;
    private String[] dataTitle;
    private String[] dataSubtitle;
    private String[] dataPdfName;
    private String[] dataPageName;
    private TypedArray dataImage;
    private ArrayList<Praktikum> praktikums;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Intent intent;
            switch (item.getItemId()) {

                case R.id.navigation_explore:
                    intent = new Intent(PraktikumActivity.this, MainActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);
                    return true;
                case R.id.navigation_motion:
                    intent = new Intent(PraktikumActivity.this, MotionLibraryActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);
                    return true;
                case R.id.navigation_achievement:
                    intent = new Intent(PraktikumActivity.this, AchieveActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);
                    return true;
                case R.id.navigation_praktikum:
                    return true;
                case R.id.navigation_jawaban:
                    intent = new Intent(PraktikumActivity.this, JawabanActivity.class);
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
        setContentView(R.layout.activity_praktikum);

        ListView listView = findViewById(R.id.lv_list);
        praktikumAdapter = new PraktikumAdapter(this);
        listView.setAdapter(praktikumAdapter);

        prepare();
        addItem();

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navigation.setSelectedItemId(R.id.navigation_praktikum);

        setTitle(R.string.praktikum);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(PraktikumActivity.this, praktikums.get(position).getTitle(), Toast.LENGTH_SHORT).show();

                Praktikum praktikum = new Praktikum();
                praktikum.setPdfName(praktikums.get(position).getPdfName());
                praktikum.setPageName(praktikums.get(position).getPageName());

                Intent intent = new Intent(PraktikumActivity.this, PDFPraktikumActivity.class);
                intent.putExtra(PDFPraktikumActivity.SAMPLE_FILE, praktikum);
                startActivity(intent);
            }
        });
    }

    private void prepare() {
        dataTitle = getResources().getStringArray(R.array.data_title);
        dataSubtitle = getResources().getStringArray(R.array.data_subtitle);
        dataImage = getResources().obtainTypedArray(R.array.data_image);
        dataPdfName = getResources().getStringArray(R.array.data_pdf);
        dataPageName = getResources().getStringArray(R.array.data_pageName);
    }

    private void addItem() {
        praktikums = new ArrayList<>();

        for (int i = 0; i < dataTitle.length; i++) {
            Praktikum praktikum = new Praktikum();
            praktikum.setImage(dataImage.getResourceId(i, -1));
            praktikum.setTitle(dataTitle[i]);
            praktikum.setSubtitle(dataSubtitle[i]);
            praktikum.setPdfName(dataPdfName[i]);
            praktikum.setPageName(dataPageName[i]);
            praktikums.add(praktikum);
        }

        praktikumAdapter.setPraktikums(praktikums);
    }
}