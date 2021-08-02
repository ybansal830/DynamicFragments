package com.myfirst.dynamicfragments;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterA extends RecyclerView.Adapter<ViewHolderA> {

    private List<ResponseDTO> responseDTOS;

    public AdapterA(List<ResponseDTO> responseDTOS) {
        this.responseDTOS = responseDTOS;
    }

    @NonNull
    @Override
    public ViewHolderA onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_view,parent,
                false);
        return new ViewHolderA(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderA holder, int position) {
        holder.setData(responseDTOS.get(position));
    }

    @Override
    public int getItemCount() {
        return responseDTOS.size();
    }
}
