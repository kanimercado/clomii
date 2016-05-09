package com.clomii.clomii;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class AvatarMujerActivity extends AppCompatActivity {


    private View menuPeinados;
    private View menuOjos;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avatar_mujer);

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

        String nameValue = getIntent().getStringExtra("NameValue");

        String dedicatoriaValue = getIntent().getStringExtra("DedicatoriaValue");

        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("message/rfc822");
        i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"anibal.m@clomii.com"});
        i.putExtra(Intent.EXTRA_SUBJECT, nameValue);
        i.putExtra(Intent.EXTRA_TEXT, dedicatoriaValue);
        try {
            startActivity(Intent.createChooser(i, "Send mail..."));
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(AvatarMujerActivity.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
        }

    }



//    ESTA COMO COMENTARIO PORQUE HACE FALLAR LA APP

//    public void takeScreenshot() {
//        Date now = new Date();
//        android.text.format.DateFormat.format("yyyy-MM-dd_hh:mm:ss", now);
//
//        try {
//            // image naming and path  to include sd card  appending name you choose for file
//            String mPath = Environment.getExternalStorageDirectory().toString() + "/" + now + ".jpg";
//
//            // create bitmap screen capture
//            View v1 = getWindow().getDecorView().getRootView();
//            v1.setDrawingCacheEnabled(true);
//            Bitmap bitmap = Bitmap.createBitmap(v1.getDrawingCache());
//            v1.setDrawingCacheEnabled(false);
//
//            File imageFile = new File(mPath);
//
//            FileOutputStream outputStream = new FileOutputStream(imageFile);
//            int quality = 100;
//            bitmap.compress(Bitmap.CompressFormat.JPEG, quality, outputStream);
//            outputStream.flush();
//            outputStream.close();
//
//            openScreenshot(imageFile);
//        } catch (Throwable e) {
//            // Several error may come out with file handling or OOM
//            e.printStackTrace();
//        }
//    }
//
//    private void openScreenshot(File imageFile) {
//        Intent intent = new Intent();
//        intent.setAction(Intent.ACTION_VIEW);
//        Uri uri = Uri.fromFile(imageFile);
//        intent.setDataAndType(uri, "image/*");
//        startActivity(intent);
//    }

}
