package com.example.android.bloodbank;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vaasudevkala on 12/11/17.
 */

public class CustomAdapter extends BaseAdapter implements View.OnClickListener {

    ArrayList<ListModel> bankDetails;
    Context mContext;

    private static class ViewHolder{

            TextView name;
            TextView address;
            TextView phone;
            ImageView call,navigate,share;

    }

    public CustomAdapter(ArrayList<ListModel> bankDetails, Context mContext) {
        this.bankDetails = bankDetails;
        this.mContext = mContext;
    }



    @Override
    public void onClick(View view) {

    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {

        ViewHolder viewHolder;
        if(convertView  == null){

            convertView= LayoutInflater.from(mContext).inflate(R.layout.list_view_layout,null);
            viewHolder=new ViewHolder();

            TextView name=(TextView)convertView.findViewById(R.id.nameTextView);
            EditText address=(EditText)convertView.findViewById(R.id.addressEditText);
            TextView phone=(TextView)convertView.findViewById(R.id.phoneTextView);
            ImageView call=(ImageView)convertView.findViewById(R.id.callNow);
            ImageView navigate=(ImageView)convertView.findViewById(R.id.navigate);
            ImageView share=(ImageView)convertView.findViewById(R.id.share);

            viewHolder.name=name;
            viewHolder.address=address;
            viewHolder.phone=phone;
            viewHolder.call=call;
            viewHolder.navigate=navigate;
            viewHolder.share=share;

            convertView.setTag(viewHolder);

        }

        viewHolder=(ViewHolder)convertView.getTag();








        return null;
    }
}
