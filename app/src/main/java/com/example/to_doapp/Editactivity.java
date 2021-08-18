package com.example.to_doapp;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.to_doapp.R;

public class Editactivity extends AppCompatActivity {

    EditText updateItemTxt;
    Button btnSave;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editactivity);

        updateItemTxt = findViewById(R.id.updateItemTxt);
        btnSave = findViewById(R.id.saveBtn);
        //getSupportActionBar().setTitle("Edit Item");

        updateItemTxt.setText(getIntent().getStringExtra(MainActivity.KEY_ITEM_TEXT));
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();

                intent.putExtra(MainActivity.KEY_ITEM_TEXT, updateItemTxt.getText().toString());
                intent.putExtra(MainActivity.KEY_ITEM_POSITION, getIntent().getExtras().getInt(MainActivity.KEY_ITEM_POSITION));

                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }
}

