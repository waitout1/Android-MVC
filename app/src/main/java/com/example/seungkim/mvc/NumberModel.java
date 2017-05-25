package com.example.seungkim.mvc;


public class NumberModel {
    public interface OnNumberChangeListener{
        void onNumberChange(int number);
    }

    private OnNumberChangeListener onNumberChangeListener;
    private int number;

    public NumberModel(){}

    public void changeNumber(){
        number = (int) (Math.random() * 99);

        if(onNumberChangeListener != null){
            onNumberChangeListener.onNumberChange(number);
        }
    }

    public void setOnNumberChangeListener(OnNumberChangeListener onNumberChangeListener) {
        this.onNumberChangeListener = onNumberChangeListener;
    }
}

