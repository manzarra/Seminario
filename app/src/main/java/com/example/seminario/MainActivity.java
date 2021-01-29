package com.example.seminario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void linear(View view) {
        setContentView(R.layout.linearlayout);
    }

    public void bitmap(View view) {
        setContentView(R.layout.ninebitmaps);
    }

    public void vetores(View view) {
        setContentView(R.layout.vetores);
    }

    public void global(View view) {
        setContentView(R.layout.globais);
    }

    public void voltar(View view) {
        setContentView(R.layout.activity_main);
    }
}