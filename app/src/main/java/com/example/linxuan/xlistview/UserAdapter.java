package com.example.linxuan.xlistview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by linxuan on 2017/8/9.
 */

public class UserAdapter extends ArrayAdapter<User> {
    private int mResourceId;

    public UserAdapter(Context context, int textViewResourceId) {
        super(context, textViewResourceId);
        mResourceId = textViewResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        User user = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(mResourceId,null);
        TextView name = (TextView) view.findViewById(R.id.name);
        TextView age = (TextView) view.findViewById(R.id.age);
        TextView sex = (TextView) view.findViewById(R.id.sex);

        name.setText(user.getName());
        age.setText(user.getAge());
        sex.setText(user.getSex());
        return view;
    }
}

class User{
    private int mAge;
    private String mName;
    private String mSex;

    public User(int age, String name, String sex) {
        mAge = age;
        mName = name;
        mSex = sex;
    }

    public String getAge() {
        return mAge + "";
    }

    public String getName() {
        return mName;
    }

    public String getSex() {
        return mSex;
    }
}