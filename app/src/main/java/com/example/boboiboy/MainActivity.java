package com.example.boboiboy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        List<Item> items = new ArrayList<Item>();
        items.add(new Item("Boboiboy", "Elemental", R.drawable.boboiboy));
        items.add(new Item("Gopal", "Tukaran makanan", R.drawable.gopal));
        items.add(new Item("Ying", "Lari laju", R.drawable.ying));
        items.add(new Item("Yaya", "Bisa terbang dan kuat", R.drawable.yaya));
        items.add(new Item("Fang", "Bayangan", R.drawable.fang));
        items.add(new Item("Boboiboy", "Elemental", R.drawable.boboiboy));
        items.add(new Item("Gopal", "Tukaran makanan", R.drawable.gopal));
        items.add(new Item("Ying", "Lari laju", R.drawable.ying));
        items.add(new Item("Yaya", "Bisa terbang dan kuat", R.drawable.yaya));
        items.add(new Item("Fang", "Bayangan", R.drawable.fang));
        items.add(new Item("Boboiboy", "Elemental", R.drawable.boboiboy));
        items.add(new Item("Gopal", "Tukaran makanan", R.drawable.gopal));
        items.add(new Item("Ying", "Lari laju", R.drawable.ying));
        items.add(new Item("Yaya", "Bisa terbang dan kuat", R.drawable.yaya));
        items.add(new Item("Fang", "Bayangan", R.drawable.fang));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(), items));
    }
}