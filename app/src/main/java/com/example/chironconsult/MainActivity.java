package com.example.chironconsult;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button_DrugDataBase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_DrugDataBase = (Button) findViewById(R.id.button_drugDatabase);
        button_DrugDataBase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openItemListActivity();
            }
        });
    }

    public void openItemListActivity() {
        Intent openItemList = new Intent(this, ItemListActivity.class);
        startActivity(openItemList);
    }
}