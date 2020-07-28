package com.project.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView textViewPlayer1;
    public TextView temp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewPlayer1 = findViewById(R.id.text_view_p1);
        textViewPlayer1.setText("hello");

        temp = findViewById(R.id.textview_00);
    }
    public void makeMove(View view){
        view = (TextView)view;
        view.setText("click hoise");
    }

}