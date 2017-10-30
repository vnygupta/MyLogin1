package com.admin.mylogin;

import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class WeightActivity extends AppCompatActivity {
     TextView tvname;
    EditText eteight;
    Button btnsubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);

        tvname = (TextView) findViewById(R.id.tvname);
        eteight = (EditText) findViewById(R.id.etweight);
        btnsubmit = (Button) findViewById(R.id.btnsubmit);



        Intent i=getIntent();
        final String username =i.getStringExtra("name");
        tvname.setText("Welcome" + username);
        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String weight=eteight.getText().toString();
                if(weight.length()==0)
                {
                    Toast.makeText(getApplicationContext(),"Weight blank",Toast.LENGTH_LONG).show();
                    eteight.requestFocus();
                    return;
                }
                Intent i=new Intent(getApplicationContext(),ConfirmActivity.class);
                i.putExtra("name",username);
                i.putExtra("weight",weight);
                startActivity(i);
            }
        });

    }
}
