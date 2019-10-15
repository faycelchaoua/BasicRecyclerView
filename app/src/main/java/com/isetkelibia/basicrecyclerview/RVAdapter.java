package com.isetkelibia.basicrecyclerview;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Vector;

public class RVAdapter extends RecyclerView.Adapter<StringHolder> {
    private Vector<String> elements;

    RVAdapter() {
        elements = new Vector<>();
        for (int i = 0; i < 100; i++)
            elements.add("Salut " + i);
    }

    @NonNull
    public StringHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater lf = LayoutInflater.from(parent.getContext());
        TextView v = (TextView) lf.inflate(R.layout.itemlayout, parent, false);
        return new StringHolder(v);
    }

    public void onBindViewHolder(StringHolder holder, int position) {
        String aAfficher = elements.elementAt(position);
        holder.setText(aAfficher);
    }

    public int getItemCount() {
        return elements.size();
    }
}