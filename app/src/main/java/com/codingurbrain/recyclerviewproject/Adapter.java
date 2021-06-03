package com.codingurbrain.recyclerviewproject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private List<ViewModel> models = new ArrayList<>();


    public Adapter(final List<ViewModel> viewModels) {
        if (viewModels != null) {
            this.models.addAll(viewModels);
        }
    }


    @NonNull
    @Override
    public Adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        final View view = LayoutInflater.from(parent.getContext()).inflate(viewType, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.MyViewHolder holder, int position) {
        ((MyViewHolder) holder).bindData(models.get(position));
    }

    @Override
    public int getItemCount() {
        return models.size();
    }
    @Override
    public int getItemViewType(final int position) {
        return R.layout.recyclerview_list_items;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView simpletextview;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            simpletextview = (TextView) itemView.findViewById(R.id.items);
        }

        public void bindData(final ViewModel viewModel) {
            simpletextview.setText(viewModel.getSimpleText());
        }
    }
}
