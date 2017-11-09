package com.example.auser.java110901;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String name[]={"Bob","Nick","Joy","Any","Roy"};
    MyAdapter adapter;
ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv=(ListView)findViewById(R.id.listview);

        adapter =new MyAdapter(MainActivity.this,name);
        lv.setAdapter(adapter);

    }
//  顯示在右上方．．．ｓｈｏｗ
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add("show");
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        StringBuffer sb =new StringBuffer();
        int i ;
        for(i=0;i<name.length;i++){
            if(adapter.b[i]){
                sb.append(name[i]+",");
            }
        }
        Toast.makeText(MainActivity.this, sb.toString(), Toast.LENGTH_SHORT).show();
        return super.onOptionsItemSelected(item);
    }
}
