package com.example.myapplication;


import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class Controller {
    private int level = 0;
    private MainActivity view;

    Controller(MainActivity view){
        this.view = view;
    }

    public int getLevel() {
        return level;
    }

    public Question getCurrentQuestion(){
        return Question.QUESTIONS[level];
    }
    public void onClickButton(String answer){
        if(level == Question.QUESTIONS.length - 1) {
            reset();
            view.showImage(getCurrentQuestion());
            view.setTextLevel(String.valueOf(level + 1));
            view.showAlertDialog("Вы выиграли!");
        }
        Question question = getCurrentQuestion();
        if(answer.toLowerCase().equals(question.getAnswer())) {
            level++;
            view.showImage(getCurrentQuestion());
            view.setTextLevel(String.valueOf(level + 1));
        }else {
            view.showAlertDialog("Вы проиграли!");
        }

        view.clearTextEdit();
    }
    public void reset(){
        level = 0;
    }

    public void update(){
        view.showImage(getCurrentQuestion());
        view.setTextLevel(String.valueOf(level + 1));
    }
}
