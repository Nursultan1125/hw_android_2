package com.example.myapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    ImageView imageViewA, imageViewB, imageViewC, imageViewD;
    EditText editTextView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ActionBar appbar = getSupportActionBar();

        imageViewA = findViewById(R.id.imageA);
        imageViewB = findViewById(R.id.imageB);
        imageViewC = findViewById(R.id.imageC);
        imageViewD = findViewById(R.id.imageD);
        editTextView = findViewById(R.id.editTextView);
        button = findViewById(R.id.button);

        assert appbar != null;
        appbar.setTitle("4 фото 1 слово");

        imageViewA.setImageResource(R.drawable.baseball1);
        imageViewB.setImageResource(R.drawable.baseball1);
        imageViewC.setImageResource(R.drawable.baseball1);
        imageViewD.setImageResource(R.drawable.baseball1);
    }
}