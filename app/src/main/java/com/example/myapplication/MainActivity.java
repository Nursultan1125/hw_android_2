package com.example.myapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    ImageView imageViewA, imageViewB, imageViewC, imageViewD;
    EditText editTextView;
    Controller controller;
    ActionBar appbar;
    TextView textLevel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        appbar = getSupportActionBar();

        imageViewA = findViewById(R.id.imageA);
        imageViewB = findViewById(R.id.imageB);
        imageViewC = findViewById(R.id.imageC);
        imageViewD = findViewById(R.id.imageD);
        editTextView = findViewById(R.id.editTextView);
        textLevel = findViewById(R.id.textLevel);
        controller = new Controller(this);

        assert appbar != null;
        appbar.setTitle("4 фото 1 слово");

        showImage(controller.getCurrentQuestion());
    }

    public void onClickOk(View view){
        controller.onClickButton(editTextView.getText().toString());
    }

    public void clearTextEdit(){
        editTextView.setText("");
    }

    public void setTextLevel(String level){
        textLevel.setText("Уровень " + level);
    }

    public void showImage(Question question){
        imageViewA.setImageResource(question.getImages()[0]);
        imageViewB.setImageResource(question.getImages()[1]);
        imageViewC.setImageResource(question.getImages()[2]);
        imageViewD.setImageResource(question.getImages()[3]);
    }

    public void showAlertDialog(String text){
        new AlertDialog.Builder(this)
                .setTitle(text)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        controller.reset();
                        controller.update();
                    }
                })
                .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                })
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
    }
}