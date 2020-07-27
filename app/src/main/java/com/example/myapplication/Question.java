package com.example.myapplication;

public class Question {

    private String answer;
    private int[] images;

    Question(int[] images, String answer) {
        this.answer = answer;
        this.images = images;
    }

    static final Question[] QUESTIONS = {
            new Question(new int[]{R.drawable.baseball1, R.drawable.baseball2, R.drawable.baseball3, R.drawable.baseball4}, "Baseball"),
            new Question(new int[]{R.drawable.football1, R.drawable.football2, R.drawable.football3, R.drawable.football4}, "Football"),
            new Question(new int[]{R.drawable.chess1, R.drawable.chess2, R.drawable.chess3, R.drawable.chess4}, "Chess"),
            new Question(new int[]{R.drawable.bishkek1, R.drawable.bishkek2, R.drawable.bishkek3, R.drawable.bishkek4}, "Bishkek"),
            new Question(new int[]{R.drawable.france1, R.drawable.france2, R.drawable.france3, R.drawable.france4}, "France"),
    };

    boolean isRightAnswer(String answer){
        return this.answer.equals(answer);
    }


    public int[] getImages() {
        return images;
    }

    public String getAnswer(){
        return answer;
    }
}
