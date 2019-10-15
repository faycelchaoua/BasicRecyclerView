package com.isetkelibia.basicrecyclerview;

import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

class StringHolder extends RecyclerView.ViewHolder {
    private TextView v_;

    StringHolder(TextView v) {
        super(v);
        v_ = v;
    }

    void setText(String text) {
        v_.setText(text);
    }
}