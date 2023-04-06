package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView text;
    Button btra,brot,bsca,balp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        find();


    }
    public void click(View v){
        Animation move= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.translate);
        text.startAnimation(move);

    }
    public void find(){
        text=findViewById(R.id.name);
        btra=findViewById(R.id.tr);
        brot=findViewById(R.id.rot);
        bsca=findViewById(R.id.sca);
        balp=findViewById(R.id.alp);

    }
}