package com.clomii.clomii;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class GenderActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender);

        String nameValue = getIntent().getStringExtra("NameValue");
        TextView name = (TextView)findViewById(R.id.nombre);
        name.setText("TU CLOMII SE LLAMA: " + nameValue);

        String dedicatoriaValue = getIntent().getStringExtra("DedicatoriaValue");
        TextView dedicatoria = (TextView)findViewById(R.id.dedicatoria);
        dedicatoria.setText("TU DEDICATORIA ES ESTA: " + dedicatoriaValue);

    }

    public void irHombre(View v)
    {
        Intent intent = new Intent(getApplicationContext(),AvatarHombreActivity.class);

        TextView nombre = (TextView)findViewById(R.id.nombre);
        intent.putExtra("NameValue", nombre.getText().toString());

        TextView dedicatoria = (TextView)findViewById(R.id.dedicatoria);
        intent.putExtra("DedicatoriaValue", dedicatoria.getText().toString());

        //Elegir String name String Value
        startActivity(intent);
    }

    public void irMujer(View v)
    {
        Intent i = new Intent(getApplicationContext(),AvatarMujerActivity.class);
        String nameValue = getIntent().getStringExtra("NameValue");
        i.putExtra("NameValue", nameValue);
        String dedicatoriaValue = getIntent().getStringExtra("DedicatoriaValue");
        i.putExtra("DedicatoriaValue", dedicatoriaValue);
        //Elegir String name String Value
        startActivity(i);
    }

}
