package com.example.practice;

public class Checkbox extends UIControl {
    public Checkbox() {
        super(true);
    }
    @Override
    public void render() {
        System.out.println("Render Checkbox");
    }
}
