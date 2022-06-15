package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Players extends AppCompatActivity {
    String name1;
    String name2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_players);
    }
    public void onClick(View view){
        Intent intent = new Intent(this, Game.class);
        EditText Name1 = findViewById(R.id.Name1);
        EditText Name2 = findViewById(R.id.Name2);

        name1 = Name1.getText().toString();
        name2 = Name2.getText().toString();

        intent.putExtra("name1", name1);
        intent.putExtra("name2", name2);
        this.finish();
        startActivity(intent);
    }
    public void onExitClick(View view){
        //Intent intent = new Intent(this, MainActivity.class);
        this.finish();
        //startActivity(intent);
    }
}