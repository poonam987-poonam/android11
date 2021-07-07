package com.example.loginform;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.view.*;
import android.view.View.OnClickListener;
import android.widget.*;

public class MainActivity extends Activity implements OnClickListener{
           
            EditText name;
            EditText pass;
            Button login;
            Button cancel;
           
                @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=(EditText )findViewById(R.id.editText1);
        pass=(EditText )findViewById(R.id.editText2);
        login=(Button )findViewById(R.id.button1);
        cancel=(Button )findViewById(R.id.button2);
        login.setOnClickListener(this);
        cancel.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

            @SuppressLint("ShowToast") @Override
            public void onClick(View v) {
                        String na=name.getText().toString();
                        String pa=pass.getText().toString();
                        switch(v.getId())
                        {
                        case R.id.button1:
                                                if(na.equals("chaitu") && pa.equals("root") || pa.equals("admin")){
                                                            Intent i = new Intent(this,Second.class);
                                                            i.putExtra("c1", na);
                                                            startActivity(i);
                                                }
                                                else
                                                {
                                    Toast.makeText(this,"check #username or #Password", 3600).show();                                                                     
                                                }
                                    break;
                       
                        case R.id.button2:
                                    name.setText("");
                                    pass.setText("");
                                    break;
                                   
                        default:
                                   
                           break;
                        }
                       
                        }
           
}