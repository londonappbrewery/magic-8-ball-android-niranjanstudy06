package com.londonappbrewery.magiceightball;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.sql.BatchUpdateException;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         final ImageView ballDisplay = (ImageView) findViewById(R.id.Magicball);

        final int[] array = {R.drawable.ball1,R.drawable.ball2,R.drawable.ball3,R.drawable.ball4,R.drawable.ball5};

        Button pushbutton;

        pushbutton = (Button) findViewById(R.id.Tossbutton);

        pushbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int Randomnumber;
                Random randomnumber = new Random();
                int number = randomnumber.nextInt(5);

                ballDisplay.setImageResource(array[number]);


            }
        });
    }
}
