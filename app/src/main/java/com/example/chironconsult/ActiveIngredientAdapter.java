package com.example.chironconsult;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ActiveIngredientAdapter extends RecyclerView.Adapter<ActiveIngredientAdapter.ActiveIngredientHolder> {
    private List<ActiveIngredient> activeIngredientNameList = new ArrayList<>();

    @NonNull
    @Override
    public ActiveIngredientHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list_content, parent, false);
        return new ActiveIngredientHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ActiveIngredientHolder holder, int position) {
        ActiveIngredient currentActiveIngredient = activeIngredientNameList.get(position);
        holder.activeIngredientNameTextView.setText(currentActiveIngredient.getIngredientName());
    }

    @Override
    public int getItemCount() {
        return activeIngredientNameList.size();
    }

    public void setActiveIngredientNameList(List<ActiveIngredient> activeIngredientNameList) {
        this.activeIngredientNameList = activeIngredientNameList;
        notifyDataSetChanged(); //to be changed for more accurate method later
    }

    class ActiveIngredientHolder extends RecyclerView.ViewHolder {
        private TextView activeIngredientNameTextView;

        public ActiveIngredientHolder(@NonNull View itemView) {
            super(itemView);
            activeIngredientNameTextView = itemView.findViewById(R.id.content);
        }
    }
}
