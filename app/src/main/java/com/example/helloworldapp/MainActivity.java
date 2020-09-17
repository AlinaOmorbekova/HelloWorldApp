package com.example.helloworldapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button changetext;
    TextView thetext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        thetext = (TextView)findViewById(R.id.myname);
        changetext = (Button)findViewById(R.id.mybutton);
        changetext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                thetext.setText("I am from com-18");
            }
        });
    }
}
