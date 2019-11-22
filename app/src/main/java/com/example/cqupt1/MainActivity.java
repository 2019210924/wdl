package com.example.cqupt1;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import static com.example.cqupt1.R.id.lv;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private TextView textView1, textView2;
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);


        intID();
        List<Map<String, Object>> data = new ArrayList<Map<String, Object>>();
        Map map1 = new HashMap<String, Object>();
        map1.put("name", "FIRST");
        map1.put("type", "根，紧握在地下");
        map1.put("image",R.drawable.aa);
        data.add(map1);
        Map map2 = new HashMap<String, Object>();
        map2.put("name", "SECOND");
        map2.put("type", "叶，相触在云中");
        map2.put("image",R.drawable.b);
        data.add(map2);
        Map map3 = new HashMap<String, Object>();
        map3.put("name", "THIRD");
        map3.put("type", "不仅爱你伟岸的身躯");
        map3.put("image",R.drawable.a);
        data.add(map3);
        Map map4 = new HashMap<String, Object>();
        map4.put("name", "FORTH");
        map4.put("type", "也爱你坚持的位置");
        map4.put("image",R.drawable.bb);
        data.add(map4);
        Map map5 = new HashMap<String, Object>();
        map5.put("name", "LAST");
        map5.put("type", "脚下的土地");
        map5.put("image",R.drawable.cc);
        data.add(map5);


        SimpleAdapter adapter =new SimpleAdapter(this,
                data,
                R.layout.list_view_item,
                new String[]{"name","type","image"},
                new int[]{R.id.lv_item1,R.id.lv_item2,R.id.image});
        lv.setAdapter(adapter);


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                if(position == 0){
                    Intent intent1 = new Intent(MainActivity.this,CActivity.class);
                    startActivity(intent1);
                }

                if (position == 1){
                    Intent intent2 = new Intent(MainActivity.this,CqActivity.class);
                    startActivity(intent2);
                }

                if (position == 2){
                    Intent intent3  = new Intent(MainActivity.this,CquActivity.class);
                    startActivity(intent3);
                }

                if (position == 3){
                    Intent intent4 = new Intent(MainActivity.this,CqupActivity.class);
                    startActivity(intent4);
                }


                else{
                    Intent intent5 = new Intent(MainActivity.this,CquptActivity.class);
                    startActivity(intent5);
                }

            }
        });

        }

    private void intID() {
        lv = findViewById(R.id.lv);
        textView1 = findViewById(R.id.lv_item1);
        textView2 = findViewById(R.id.lv_item2);
        imageView = findViewById(R.id.image);

    }


}
