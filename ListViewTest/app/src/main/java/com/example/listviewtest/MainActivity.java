package com.example.listviewtest;

import android.content.Context;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private String[] data={
            "Apple","Banana","Orange","Watermelon","Pear","Grape", "pineapple" ,"Strawberry","Cherry" ,"Mango","Apple","Banana","Orange","Watermelon","Pear","Grape","Pineapple","Strawberry" ,"Cherry","Mango"
    };

    public class Fruit{
        private String name;
        private int imageId;
        public Fruit(String name,int imageId){
            this.name=name;
            this.imageId=imageId;
        }
        public String getName(){
            return name;
        }
        public int getImageId(){
            return imageId;
        }
    }

    public class FruitAdapter extends ArrayAdapter<Fruit> {
        private int resourceId;

        public FruitAdapter(Context context, int textViewResourceId, List<Fruit> objects) {
            super(context, textViewResourceId, objects);
            resourceId = textViewResourceId;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            Fruit fruit =getItem(position);
            View view= LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
            ImageView fruitImage=(ImageView) view.findViewById(R.id.fruit_image);
            TextView fruitName = (TextView) view.findViewById(R.id.fruit_name);
            fruitName.setText(fruit.getName());
            return view;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.ListView_1), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_expandable_list_item_1,data);
        ListView listView=(ListView) findViewById(R.id.ListView_1);
        listView.setAdapter(adapter);
    }
}