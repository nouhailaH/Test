package com.example.appmayar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

String [] names;
LayoutInflater inflater;

public CustomAdapter(Context context ,String [] names)
{
this.names=names;
}

    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {


        view= inflater.inflate(R.layout.item,null);

        TextView n = view.findViewById(R.id.text1);
        n.setText(names[position]);

        return null;
    }
}
