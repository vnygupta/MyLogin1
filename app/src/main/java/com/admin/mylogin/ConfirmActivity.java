package com.admin.mylogin;

import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ConfirmActivity extends AppCompatActivity {
    TextView tvmessage;
    Button btnlogout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);

         btnlogout=(Button)findViewById(R.id.btnlogout);
        tvmessage=(TextView)findViewById(R.id.tvmessage);

        Intent i=getIntent();
        String username= i.getStringExtra("name");
        String weight= i.getStringExtra("weight");
        tvmessage.setText("hello= "+ username+ "  your weight is = "+weight);

        btnlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}
