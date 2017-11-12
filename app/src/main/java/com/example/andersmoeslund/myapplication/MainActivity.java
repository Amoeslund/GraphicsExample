package com.example.andersmoeslund.myapplication;


import android.graphics.Color;
import android.os.Bundle;
import android.app.Activity;


public class MainActivity extends Activity {

    GraphicsDrawer canvasView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        canvasView = new GraphicsDrawer(this);
        canvasView.setBackgroundColor(Color.WHITE);
        setContentView(canvasView);
    }
}