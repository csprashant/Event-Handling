package com.example.eventhandlingexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
Button btn;
ImageView iv;
TextView tv;
RadioButton rbtn;
FloatingActionButton faBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.btn);
        iv=findViewById(R.id.iv);
        tv=findViewById(R.id.tv);
        rbtn=findViewById(R.id.rbtn);
        faBtn=findViewById(R.id.fabtn);
        btn.setOnClickListener(v -> Toast.makeText(MainActivity.this,"Button",Toast.LENGTH_SHORT).show());
        faBtn.setOnClickListener(v->Toast.makeText(MainActivity.this,"Floating Action Button",Toast.LENGTH_SHORT).show());
        iv.setOnClickListener(v->Toast.makeText(MainActivity.this,"Image View",Toast.LENGTH_SHORT).show());
        tv.setOnClickListener(a-> Toast.makeText(MainActivity.this,"Text View",Toast.LENGTH_SHORT).show());
        rbtn.setOnClickListener(v-> Toast.makeText(MainActivity.this,"Radio Button",Toast.LENGTH_SHORT).show());
    }

}