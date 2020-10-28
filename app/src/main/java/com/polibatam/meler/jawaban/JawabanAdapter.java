package com.polibatam.meler.jawaban;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.polibatam.meler.R;

import java.util.ArrayList;

public class JawabanAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Jawaban> jawabans = new ArrayList<>();

    public void setJawabans(ArrayList<Jawaban> jawabans) {
        this.jawabans = jawabans;
    }

    public JawabanAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return jawabans.size();
    }

    @Override
    public Object getItem(int position) {
        return jawabans.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View itemView = view;
        if (itemView == null) {
            itemView = LayoutInflater.from(context).inflate(R.layout.item_jawaban, viewGroup, false);
        }

        ViewHolder viewHolder = new ViewHolder(itemView);

        Jawaban jawaban = (Jawaban) getItem(i);
        viewHolder.bind(jawaban);
        return itemView;
    }

    private class ViewHolder {
        private TextView txtTitle;
        private TextView txtDescription;

        ViewHolder(View view) {
            txtTitle = view.findViewById(R.id.txtTitle);
            txtDescription = view.findViewById(R.id.txtDescription);
        }

        void bind(Jawaban jawaban) {
            txtTitle.setText(jawaban.getTitle());
            txtDescription.setText(jawaban.getDescription());
        }
    }

}


