package com.example.chironconsult;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Button button_DrugDataBase;
    private ActiveIngredientViewModel activeIngredientViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*  activeIngredientViewModel = new ViewModelProvider(this,
                ViewModelProvider.AndroidViewModelFactory.getInstance(this.getApplication())).get(ActiveIngredientViewModel.class);
        activeIngredientViewModel.getAllActiveIngredients().observe(this, new Observer<List<ActiveIngredient>>() {
            @Override
            public void onChanged(List<ActiveIngredient> activeIngredients) {
                //update RecyclerView
                //this will be triggered whenever data in livedataobject changes
                Toast.makeText(MainActivity.this, "onChanged", Toast.LENGTH_SHORT).show();
            }
        });
*/
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