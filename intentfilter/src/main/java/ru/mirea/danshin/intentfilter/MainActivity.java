package ru.mirea.danshin.intentfilter;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//    Uri address = Uri.parse("https://www.mirea.ru/");
//    Intent openLinkIntent = new Intent(Intent.ACTION_VIEW, address);
//    if (openLinkIntent.resolveActivity(getPackageManager()) != null) {
//        startActivity(openLinkIntent);
//    }
//    else {
//        Log.d("Intent", "Не получается обработать намерение!");
//    }
//
//    Intent shareIntent = new Intent(Intent.ACTION_SEND);
//    shareIntent.setType("text/plain");
//    shareIntent.putExtra(Intent.EXTRA_SUBJECT, "MIREA");
//    shareIntent.putExtra(Intent.EXTRA_TEXT, "Даньшин Даниил Витальевич");
//    void startActivity(Intent.createChooser(shareIntent, "Даньшин Даниил Витальевич"));
//
//    Intent shareIntent = Intent.createChooser(sendIntent, null);
//    startActivity(shareIntent);

    Toast toast = Toast.makeText(getApplicationContext(), "Здравствуй MIREA!", Toast.LENGTH_SHORT);
//    toast.show();
}