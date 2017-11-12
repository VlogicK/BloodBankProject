package com.example.android.bloodbank;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
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
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
}
