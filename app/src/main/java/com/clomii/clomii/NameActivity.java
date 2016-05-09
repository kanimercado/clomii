package com.clomii.clomii;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class NameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);

        String nameValue = getIntent().getStringExtra("NameValue");
        TextView tvNameValue = (TextView)findViewById(R.id.nombre);
        
        String dedicatoriaValue = getIntent().getStringExtra("DedicatoriaValue");

    }

    public void ir(View v)
    {
        Intent intent = new Intent(getApplicationContext(),GenderActivity.class);
        TextView nombre = (TextView)findViewById(R.id.nombre);
        intent.putExtra("NameValue", nombre.getText().toString());

        TextView dedicatoria = (TextView)findViewById(R.id.dedicatoria);
        intent.putExtra("DedicatoriaValue", dedicatoria.getText().toString());

        //Elegir String name String Value
        startActivity(intent);
    }


}
