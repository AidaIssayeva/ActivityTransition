package com.example.adityanarayan.activitytransition;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class customListAdapter extends RecyclerView.Adapter<customListAdapter.VH> {
    private final Context context;
    private final String[] values;
    private final int[] imgs;


    public customListAdapter(Context context, String[] values, int[] imgs) {
        this.context = context;
        this.values = values;
        this.imgs = imgs;

    }

    @Override
    public void onBindViewHolder(VH holder, int position) {
        holder.myText.setText(values[position]);
        holder.myImage.setImageResource(imgs[position]);
        final int pos = position;
        holder.myImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent send = new Intent((Activity) context, Second.class);

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation((Activity) context, v, "picture");
                send.putExtra("image", imgs[pos]);


                ActivityCompat.startActivity((Activity) context, send, options.toBundle());

            }
        });

    }

    @Override
    public VH onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row, parent, false);
        return new VH(itemView);

    }


    @Override
    public int getItemCount() {
        return values.length;
    }


    public class VH extends RecyclerView.ViewHolder {
        ImageView myImage;
        TextView myText;

        public VH(View itemView) {
            super(itemView);
            myImage = (ImageView) itemView.findViewById(R.id.image);
            myText = (TextView) itemView.findViewById(R.id.text);
        }


    }

}
