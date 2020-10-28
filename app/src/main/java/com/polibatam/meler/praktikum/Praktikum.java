package com.polibatam.meler.praktikum;

import android.os.Parcel;
import android.os.Parcelable;

public class Praktikum implements Parcelable {
    private int image;
    private String title;
    private String subtitle;
    private String pdfName;
    private String pageName;

    protected Praktikum(Parcel in) {
        image = in.readInt();
        title = in.readString();
        subtitle = in.readString();
        pdfName = in.readString();
        pageName = in.readString();
    }

    public static final Creator<Praktikum> CREATOR = new Creator<Praktikum>() {
        @Override
        public Praktikum createFromParcel(Parcel in) {
            return new Praktikum(in);
        }

        @Override
        public Praktikum[] newArray(int size) {
            return new Praktikum[size];
        }
    };

    public Praktikum() {
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(image);
        dest.writeString(title);
        dest.writeString(subtitle);
        dest.writeString(pdfName);
        dest.writeString(pageName);
    }
}
