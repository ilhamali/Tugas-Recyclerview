package com.example.keluargaku;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class KeluargaAdapter extends RecyclerView.Adapter<KeluargaAdapter.KeluargaViewHolder> {
    private ArrayList<Keluarga> dataList;

    public KeluargaAdapter(ArrayList<Keluarga> dataList) {
        this.dataList = dataList;
    }
    @NonNull
    @Override
    public KeluargaAdapter.KeluargaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.view_rv_item, parent, false);
        return new KeluargaViewHolder(view);
    }
    public void onBindViewHolder(KeluargaViewHolder holder, int position) {
        holder.gambar.setImageResource(dataList.get(position).getGambar());
        holder.nama.setText(dataList.get(position).getNama());
        holder.status.setText(dataList.get(position).getStatus());
    }
    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class KeluargaViewHolder extends RecyclerView.ViewHolder{
        private TextView  nama, status;
        private ImageView gambar;

        public KeluargaViewHolder(View itemView) {
            super(itemView);
            gambar = (ImageView) itemView.findViewById(R.id.gambar);
            nama = (TextView) itemView.findViewById(R.id.nama);
            status = (TextView) itemView.findViewById(R.id.status);
        }


    }
}
