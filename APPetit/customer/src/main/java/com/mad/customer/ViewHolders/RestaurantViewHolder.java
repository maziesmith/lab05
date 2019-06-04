package com.mad.customer.ViewHolders;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.mad.customer.R;
import com.mad.customer.UI.TabApp;
import com.mad.mylibrary.Restaurateur;

public class RestaurantViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    private TextView name;
    private TextView addr;
    private TextView cuisine;
    private TextView opening;
    private ImageView img;
    private Restaurateur current;
    private String key;

    public RestaurantViewHolder(View itemView){
        super(itemView);
        name = itemView.findViewById(R.id.restaurant_name);
        addr = itemView.findViewById(R.id.listview_address);
        cuisine = itemView.findViewById(R.id.listview_cuisine);
        img = itemView.findViewById(R.id.restaurant_image);
        opening = itemView.findViewById(R.id.listview_opening);

        itemView.setOnClickListener(this);
    }

    public void setData (Restaurateur current, int position, String key){
        this.name.setText(current.getName());
        this.addr.setText(current.getAddr());
        this.cuisine.setText(current.getCuisine());
        this.opening.setText(current.getOpeningTime());
        if(!current.getPhotoUri().equals("null")) {
            Glide.with(itemView).load(current.getPhotoUri()).into(this.img);
        }
        this.current = current;
        this.key = key;

    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(view.getContext(), TabApp.class);
        intent.putExtra("res_item", current);
        intent.putExtra("key", this.key);
        view.getContext().startActivity(intent);
    }
}
