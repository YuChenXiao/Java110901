package com.example.auser.java110901;

import android.content.Context;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

/**
 * Created by auser on 2017/11/9.
 */

public class MyAdapter extends BaseAdapter {
    Context context;
    public String str[];
    public boolean b[];
    public  MyAdapter (Context context,String[] str){
        this.context =context;
        this.str=str;
        b= new boolean[str.length];
    }

    @Override
    public int getCount() {
        return 5;
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
    public View getView(final int postition, View convertview, ViewGroup parent) {
//        TextView tv =new TextView(context);
//1        tv.setText("hollo world"+postition);

        LayoutInflater inflater =LayoutInflater.from(context);
        View v =inflater.inflate(R.layout.myitem,null);
        TextView tv =(TextView)v.findViewById(R.id.textView);
        final String msg = str[postition];
        Button bt =(Button)v.findViewById(R.id.button);
        CheckBox chk =(CheckBox) v.findViewById(R.id.checkBox);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,msg,Toast.LENGTH_SHORT).show();
            }
        });
        chk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                b[postition] = isChecked;
            }
        });
        chk.setChecked(b[postition]);
        tv.setText(str[postition]);
        return v;
    }
}
