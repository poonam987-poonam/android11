package com.example.loginform;
import com.example.loginform.R;
import android.os.Bundle;
import android.app.Activity;
import android.view.*;
import android.view.View.OnClickListener;
import android.widget.*;
import android.content.*;

public class Second extends Activity implements OnClickListener{
           
            Button Logout;
            @Override
            protected void onCreate(Bundle savedInstanceState) {
                        super.onCreate(savedInstanceState);
                        setContentView(R.layout.activity_second);
                        Intent i=getIntent();
                        String str = i.getStringExtra("c1");
                        TextView t1 = (TextView )findViewById(R.id.textView1);
                        t1.setText("Logged In Successfully ! "+str);
                        Logout=(Button )findViewById(R.id.button1);
        Logout.setOnClickListener(this);
            }

            @Override
            public boolean onCreateOptionsMenu(Menu menu) {
                        getMenuInflater().inflate(R.menu.activity_second, menu);
                        return true;
            }

            @Override
            public void onClick(View v1) {
switch(v1.getId())
                        {
                        case R.id.button1:
                                    Intent i = new Intent(this,MainActivity.class);
                                    startActivity(i);
                                    finish();
                                    System.exit(0);
                                    break;
                       
                        default:
                                    break;
                        }
                       
            }

}