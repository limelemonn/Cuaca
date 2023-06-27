package com.vitaniapermatasari_202102334.cuaca;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class CuacaViewHolder  extends RecyclerView.ViewHolder {
    public ImageView cuacaImageView;
    public TextView namaTextView, deskripsiText, tglWaktuView,suhuTextView;


    public CuacaViewHolder (View itemview){
       super(itemview);

        cuacaImageView = (ImageView) itemview.findViewById(R.id.cuacaImageView);
        namaTextView =  (TextView) itemview.findViewById(R.id.namaTextView);
        deskripsiText = (TextView) itemview.findViewById(R.id.deskripsiTextView);
        tglWaktuView = (TextView) itemview.findViewById(R.id.tglWaktuTextView);
        suhuTextView = (TextView) itemview.findViewById(R.id.suhuTextView);

    }
}
