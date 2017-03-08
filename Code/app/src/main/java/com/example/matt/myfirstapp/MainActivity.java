package com.example.matt.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

//This is the start of the program
public class MainActivity extends AppCompatActivity implements View.OnClickListener{
  Button clicker;
  TextView mainText;
  TextView smalltext;
  Button clicker2;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    clicker = (Button)findViewById(R.id.myButton);
    mainText = (TextView)findViewById(R.id.myText);
    clicker2 = (Button)findViewById(R.id.button2);
    smalltext = (TextView)findViewById(R.id.textView2);

    mainText.setText("Dan is Awesome");
    clicker.setOnClickListener(this);
    clicker2.setOnClickListener(this);

  }

  @Override
  public void onClick(View v) {
    if(v.equals(clicker)) {
      mainText.setText("metallica is awesome");
      smalltext.setText("fuck yeah");
    }


    if(v.equals(clicker2)) {
      mainText.setText("Nirvana Rules");
      smalltext.setText("holy shit");
    }
  }
}
