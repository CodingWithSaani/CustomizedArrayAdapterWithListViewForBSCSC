package com.tutorials180.customizedarrayadapterwithlistviewforbscsc.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.tutorials180.customizedarrayadapterwithlistviewforbscsc.Models.HumanModel;
import com.tutorials180.customizedarrayadapterwithlistviewforbscsc.R;

import java.util.ArrayList;

public class CustomizedArrayAdapter extends ArrayAdapter<HumanModel> {

    private ArrayList<HumanModel> objectArrayList;
    private Context context;
    public CustomizedArrayAdapter(@NonNull Context context, int resource, ArrayList<HumanModel> objectArrayList) {
        super(context, resource,objectArrayList);

        this.context=context;
        this.objectArrayList=objectArrayList;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View singleRow=convertView;
        if(singleRow==null) {
            singleRow = LayoutInflater.from(parent.getContext()
            ).inflate(R.layout.single_row, parent, false);
        }


        ImageView avatarIV=singleRow.findViewById(R.id.singleRow_IV);
        TextView userNameTV=singleRow.findViewById(R.id.singleRow_TV);

        avatarIV.setImageResource(objectArrayList.get(position).getAvatarReference());
        userNameTV.setText(objectArrayList.get(position).getUserName());

        return singleRow;
    }










}
