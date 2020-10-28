package com.polibatam.meler.jawaban;

import android.os.Parcel;
import android.os.Parcelable;

public class Jawaban implements Parcelable {
    private String title;
    private String description;
    private String pdfName;
    private String pageName;

    public Jawaban() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPdfName() {
        return pdfName;
    }

    public void setPdfName(String pdfName) {
        this.pdfName = pdfName;
    }

    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    protected Jawaban(Parcel in) {
        title = in.readString();
        description = in.readString();
        pdfName = in.readString();
        pageName = in.readString();
    }

    public static final Creator<Jawaban> CREATOR = new Creator<Jawaban>() {
        @Override
        public Jawaban createFromParcel(Parcel in) {
            return new Jawaban(in);
        }

        @Override
        public Jawaban[] newArray(int size) {
            return new Jawaban[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(title);
        dest.writeString(description);
        dest.writeString(pdfName);
        dest.writeString(pageName);
    }
}
