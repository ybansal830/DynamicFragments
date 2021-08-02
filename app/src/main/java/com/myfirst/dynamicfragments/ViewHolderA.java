package com.myfirst.dynamicfragments;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

public class ViewHolderA extends RecyclerView.ViewHolder {

    private ImageView image;
    private TextView title,subtitle;

    public ViewHolderA(@NonNull View itemView) {
        super(itemView);
        initViews();
    }

    private void initViews() {
        image = itemView.findViewById(R.id.image);
        title = itemView.findViewById(R.id.title);
        subtitle = itemView.findViewById(R.id.subtitle);
    }

    public void setData(ResponseDTO responseDTO){
        Glide.with(image).load(responseDTO.getImage()).into(image);
        title.setText(responseDTO.getTitle());
        subtitle.setText(responseDTO.getSubTitle());
    }
}
