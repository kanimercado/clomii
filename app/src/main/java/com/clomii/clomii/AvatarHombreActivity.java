package com.clomii.clomii;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class AvatarHombreActivity extends AppCompatActivity {


    private View menuPeinados;
    private View menuOjos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avatar_hombre);

// Find the view whose visibility will change
        menuPeinados = findViewById(R.id.menu_peinados);
        menuOjos = findViewById(R.id.menu_ojos);

        menuPeinados.setVisibility(View.VISIBLE);
        menuOjos.setVisibility(View.INVISIBLE);

    }

    public void seleccionarPeinados(View view) {

        menuPeinados.setVisibility(View.VISIBLE);
        menuOjos.setVisibility(View.INVISIBLE);
    }


    public void seleccionarOjos(View view) {

        menuPeinados.setVisibility(View.INVISIBLE);
        menuOjos.setVisibility(View.VISIBLE);
    }

    public void displayPeinado1 (View view) {
        ImageView flashPeinado = (ImageView)findViewById(R.id.flash_peinado);
        flashPeinado.setImageResource(R.drawable.peinado1);
    }
    public void displayPeinado2 (View view) {
        ImageView flashPeinado = (ImageView)findViewById(R.id.flash_peinado);
        flashPeinado.setImageResource(R.drawable.peinado2);
    }
    public void displayPeinado3 (View view) {
        ImageView flashPeinado = (ImageView)findViewById(R.id.flash_peinado);
        flashPeinado.setImageResource(R.drawable.peinado3);
    }
//    public void displayPeinado4 (View view) {
//        ImageView flashPeinado = (ImageView)findViewById(R.id.flash_peinado);
//        flashPeinado.setImageResource(peinado2);
//    }
//    public void displayPeinado5 (View view) {
//        ImageView flashPeinado = (ImageView)findViewById(R.id.flash_peinado);
//        flashPeinado.setImageResource(peinado1);
//    }
//    public void displayPeinado6 (View view) {
//        ImageView flashPeinado = (ImageView)findViewById(R.id.flash_peinado);
//        flashPeinado.setImageResource(peinado2);
//    }
//    public void displayPeinado7 (View view) {
//        ImageView flashPeinado = (ImageView)findViewById(R.id.flash_peinado);
//        flashPeinado.setImageResource(peinado1);
//    }
//    public void displayPeinado8 (View view) {
//        ImageView flashPeinado = (ImageView)findViewById(R.id.flash_peinado);
//        flashPeinado.setImageResource(peinado2);
//    }

    public void displayOjos1 (View view) {
        ImageView flashOjos = (ImageView) findViewById(R.id.flash_ojos);
        flashOjos.setImageResource(R.drawable.ojos1);
    }

    public void enviarMail(View view) {

        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("message/rfc822");
        i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"anibal.m@clomii.com"});
        i.putExtra(Intent.EXTRA_SUBJECT, "subject of email");
        i.putExtra(Intent.EXTRA_TEXT, "body of email");
        try {
            startActivity(Intent.createChooser(i, "Send mail..."));
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(AvatarHombreActivity.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
        }


    }

}
