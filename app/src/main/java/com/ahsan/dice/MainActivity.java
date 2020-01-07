package com.ahsan.dice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
   // ImageView left_dice,right_dice2;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       final ImageView left_dice = findViewById(R.id.image_leftdice);
       final ImageView right_dice2 = findViewById(R.id.image_rightdice);
        btn = findViewById(R.id.roll_button);

        //adding dice array

      final int[] diceArray = {R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6};

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random randomnumgenerator =  new Random();
                int number = randomnumgenerator.nextInt(6);
                Log.d("Dice","Tha random num is "+number);

                left_dice.setImageResource(diceArray[number]);

                number = randomnumgenerator.nextInt(6);

                right_dice2.setImageResource(diceArray[number]);
            }
        });
    }
}
