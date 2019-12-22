package com.example.david.sec;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {


    public static class ViewHolder extends RecyclerView.ViewHolder{

        TextView estados, capitales;
        ImageView imgEstados;
        Estados miItem;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            estados = (TextView) itemView.findViewById(R.id.tvEstado);
            capitales = (TextView) itemView.findViewById(R.id.tvCapital);
            imgEstados = (ImageView) itemView.findViewById(R.id.imgEstado);
        }
    }

    public List<Estados> estadosList;

    public RecyclerViewAdapter(List<Estados> estadosList) {
        this.estadosList = estadosList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_estados, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.miItem = estadosList.get(position);
        holder.estados.setText(holder.miItem.getEstado());
        holder.capitales.setText(holder.miItem.getCapital());

        Picasso.get()
                .load(holder.miItem.getImgEstado())
                .resize(400, 250)
                .centerCrop()
                .placeholder(R.drawable.ic_access_time_black)
                .error(R.drawable.ic_error_black)
                .into(holder.imgEstados);
    }

    @Override
    public int getItemCount() {
        return estadosList.size();
    }

}
