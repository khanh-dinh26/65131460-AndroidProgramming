package com.khanhnd.vieccanlam;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CongViecAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<CongViec> dsCongViec;
    private LayoutInflater cai_bom;

    public CongViecAdapter(Context context, ArrayList<CongViec> dsCongViec) {
        this.context = context;
        this.dsCongViec = dsCongViec;
        this.cai_bom = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return dsCongViec.size();
    }

    @Override
    public Object getItem(int position) {
        return dsCongViec.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View viewHienHanh = convertView;
        if (viewHienHanh == null) {
            viewHienHanh = cai_bom.inflate(R.layout.item_congviec, null);
        }

        CongViec cv = dsCongViec.get(position);

        TextView tvTen = viewHienHanh.findViewById(R.id.tvTenCongViec);
        TextView tvNoiDung = viewHienHanh.findViewById(R.id.tvNoiDung);
        TextView tvThoiGian = viewHienHanh.findViewById(R.id.tvThoiGian);
        TextView tvDoUuTien = viewHienHanh.findViewById(R.id.tvDoUuTien);

        tvTen.setText(cv.getName());
        tvNoiDung.setText(cv.getMessage());
        tvThoiGian.setText(cv.getDate());
        tvDoUuTien.setText("Mức độ: " + cv.getPriority());

        return viewHienHanh;
    }
}