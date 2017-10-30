package com.admin.mylogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText etname,etpassword;
    Button btnlogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etname=(EditText)findViewById(R.id.etname);
        etpassword=(EditText)findViewById(R.id.etpassword);
        btnlogin=(Button)findViewById(R.id.btnlogin);


        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            String username=etname.getText().toString();
                String password=etpassword.getText().toString();
                if( username.length()==0)
                {
                    Toast.makeText(getApplicationContext(),"username blank", Toast.LENGTH_LONG).show();
                    etname.requestFocus();
                    return;
                }
                if(password.length()==0)
                {
                    Toast.makeText(getApplicationContext(),"password blank",Toast.LENGTH_LONG).show();
                    etpassword.requestFocus();
                    return;
                }
                if (username.equals("vinay")&& password.equals("123"))
                {
                    Intent i=new Intent(getApplicationContext(),WeightActivity.class);
                    i.putExtra("name",username);
                    startActivity(i);
                    finish();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Invalid Login",Toast.LENGTH_LONG).show();
                    etname.setText("");
                    etpassword.setText("");
                    etname.requestFocus();
                }
            }//end of onclick
        });//end of btn
    }
}
