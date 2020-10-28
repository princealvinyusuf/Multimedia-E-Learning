package com.polibatam.meler.praktikum;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.listener.OnLoadCompleteListener;
import com.github.barteksc.pdfviewer.listener.OnPageChangeListener;
import com.github.barteksc.pdfviewer.listener.OnPageErrorListener;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;
import com.polibatam.meler.R;
import com.shockwave.pdfium.PdfDocument;

import java.util.List;

public class PDFPraktikumActivity extends AppCompatActivity implements OnPageChangeListener, OnLoadCompleteListener,
        OnPageErrorListener {

    private static final String TAG = PDFPraktikumActivity.class.getSimpleName();
    public static final String SAMPLE_FILE = "sample.pdf";
    private PDFView pdfView;
    Integer pageNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p_d_f);

        pdfView = findViewById(R.id.pdfView);

        afterViews();
    }


    @Override
    public void loadComplete(int nbPages) {
        printBookmarksTree(pdfView.getTableOfContents(), "-");
    }

    public void printBookmarksTree(List<PdfDocument.Bookmark> tree, String sep) {
        for (PdfDocument.Bookmark b : tree) {

            Log.e(TAG, String.format("%s %s, p %d", sep, b.getTitle(), b.getPageIdx()));

            if (b.hasChildren()) {
                printBookmarksTree(b.getChildren(), sep + "-");
            }
        }
    }

    @Override
    public void onPageChanged(int page, int pageCount) {
        Praktikum praktikum = getIntent().getParcelableExtra(SAMPLE_FILE);
        pageNumber = page;
        setTitle(String.format("%s %s / %s", praktikum.getPageName(), page + 1, pageCount));
    }

    @Override
    public void onPageError(int page, Throwable t) {
        Log.e(TAG, "Cannot load page " + page);
    }

    void afterViews() {
        Praktikum praktikum = getIntent().getParcelableExtra(SAMPLE_FILE);
        pdfView.setBackgroundColor(Color.LTGRAY);
        displayFromAsset();
        setTitle(praktikum.getPageName());
    }

    private void displayFromAsset() {
        Praktikum praktikum = getIntent().getParcelableExtra(SAMPLE_FILE);

        pdfView.fromAsset(praktikum.getPdfName())
                .defaultPage(pageNumber)
                .onPageChange(this)
                .enableAnnotationRendering(true)
                .onLoad(this)
                .scrollHandle(new DefaultScrollHandle(this))
                .spacing(10) // in dp
                .onPageError(this)
                .load();
    }

}