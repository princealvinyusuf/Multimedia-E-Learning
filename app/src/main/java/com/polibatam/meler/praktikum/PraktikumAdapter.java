package com.polibatam.meler.praktikum;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.polibatam.meler.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class PraktikumAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Praktikum> praktikums = new ArrayList<>();

    public void setPraktikums(ArrayList<Praktikum> praktikums) {
        this.praktikums = praktikums;
    }

    public PraktikumAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return praktikums.size();
    }

    @Override
    public Object getItem(int position) {
        return praktikums.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View itemView = convertView;
        if (itemView == null) {
            itemView = LayoutInflater.from(context).inflate(R.layout.item_praktikum, parent, false);
        }

        ViewHolder viewHolder = new ViewHolder(itemView);

        Praktikum praktikum = (Praktikum) getItem(position);
        viewHolder.bind(praktikum);
        return itemView;
    }

    private class ViewHolder {
        private TextView txtTitle;
        private TextView txtSubtitle;
        private CircleImageView imgPhoto;

        ViewHolder(View view) {
            txtTitle = view.findViewById(R.id.txt_title);
            txtSubtitle = view.findViewById(R.id.txt_subtitle);
            imgPhoto = view.findViewById(R.id.img_photo);
        }

        void bind(Praktikum praktikum) {
            txtTitle.setText(praktikum.getTitle());
            txtSubtitle.setText(praktikum.getSubtitle());
            imgPhoto.setImageResource(praktikum.getImage());
        }
    }
}
