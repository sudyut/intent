package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Second extends AppCompatActivity {
    TextView t2,txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        t2=(TextView)findViewById(R.id.t2);
        txt=(TextView)findViewById(R.id.txt);
        Bundle b1=getIntent().getExtras();
        String s=b1.getString("user");
        t2.setText("i love u "+s);
    }
    public void change(View view)
    {

    }
}
