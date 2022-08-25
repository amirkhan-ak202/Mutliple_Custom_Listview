package com.example.mutliple_custom_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ArrayCustomAdapter extends ArrayAdapter<Person_Info> {
    private Context mcontext;
    int mresource;
    public ArrayCustomAdapter(@NonNull Context context, int resource, @NonNull List<Person_Info> objects) {
        super(context, resource, objects);
        mcontext=context;
        mresource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
      String name = getItem(position).getName();
      String birthday=getItem(position).getBirthdate();
      String sex =getItem(position).getSex();

      Person_Info person_info = new Person_Info(name,birthday,sex);
        LayoutInflater inflater= LayoutInflater.from(mcontext);
        convertView = inflater.inflate(mresource,parent,false);

        TextView tvname = (TextView) convertView.findViewById(R.id.textview1);
        TextView tvbirthday = (TextView) convertView.findViewById(R.id.textview2);
        TextView tvsex =(TextView) convertView.findViewById(R.id.textview3);

        tvname.setText(name);
        tvbirthday.setText(birthday);
        tvsex.setText(sex);
        return convertView;

    }
}
