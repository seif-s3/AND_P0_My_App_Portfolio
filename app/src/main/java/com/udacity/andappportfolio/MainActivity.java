package com.udacity.andappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button p1 = (Button) findViewById(R.id.p1_button);
        Button p2 = (Button) findViewById(R.id.p2_button);
        Button p3 = (Button) findViewById(R.id.p3_button);
        Button p4 = (Button) findViewById(R.id.p4_button);
        Button p5 = (Button) findViewById(R.id.p5_button);
        Button p6 = (Button) findViewById(R.id.p6_button);

        assert p1 != null;
        assert p2 != null;
        assert p3 != null;
        assert p4 != null;
        assert p5 != null;
        assert p6 != null;

        p1.setOnClickListener(new customOnClick("Movies"));
        p2.setOnClickListener(new customOnClick("Stock Hawk"));
        p3.setOnClickListener(new customOnClick("Build it Bigger"));
        p4.setOnClickListener(new customOnClick("Make Your App Material"));
        p5.setOnClickListener(new customOnClick("Go Ubiquitous"));
        p6.setOnClickListener(new customOnClick("Capstone"));

    }

    private class customOnClick implements View.OnClickListener
    {
        private String msg;
        public customOnClick(String m)
        {
            this.msg = m;
        }
        /**
         * Called when a view has been clicked.
         *
         * @param v The view that was clicked.
         */
        @Override
        public void onClick(View v)
        {
            Toast.makeText(MainActivity.this, "This button will launch the " + msg + " app!", Toast.LENGTH_SHORT).show();
        }
    }

}
