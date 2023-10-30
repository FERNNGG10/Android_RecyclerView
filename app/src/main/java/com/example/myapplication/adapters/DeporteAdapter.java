package com.example.myapplication.adapters;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.MainActivity2;
import com.example.myapplication.R;
import com.example.myapplication.models.Deporte;

import java.util.List;

public class DeporteAdapter extends RecyclerView.Adapter<DeporteAdapter.viewHolder> {
    List<Deporte> Lista_Deportes;
    public DeporteAdapter(List<Deporte>lista_Deportes)
    {
        Lista_Deportes=lista_Deportes;
    }

    @NonNull
    @Override
    public DeporteAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater ly = LayoutInflater.from(parent.getContext());
        View v= ly.inflate(R.layout.item_deporte,parent,false);
        return new viewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull DeporteAdapter.viewHolder holder, int position) {
        Deporte c =Lista_Deportes.get(position);
        holder.setData(c);
    }

    @Override
    public int getItemCount() {
        return  Lista_Deportes.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView txtDeporte,txtOrigen;
        Deporte deporte;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            txtDeporte=itemView.findViewById(R.id.txDeporte);
            txtOrigen=itemView.findViewById(R.id.txOrigen);
            onClick(itemView);
            itemView.setOnClickListener(this);

        }

        public void setData(Deporte d)
        {
            deporte=d;
            txtDeporte.setText(deporte.getNombre());
            txtOrigen.setText(deporte.getOrigen());
        }

        @Override
        public void onClick(View v) {

            Intent intent = new Intent(v.getContext(), MainActivity2.class);
            intent.putExtra("deporte_nombre", txtDeporte.getText().toString());
            v.getContext().startActivity(intent);



        }
    }
}
