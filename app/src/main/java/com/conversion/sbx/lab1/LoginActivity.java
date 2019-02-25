package com.conversion.sbx.lab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    TextView nameemail;
    TextView password;
    TextView reg1;
    TextView reg2;
    TextView reg3;
    ImageView icon;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        nameemail = findViewById(R.id.Name_Email);
        password = findViewById(R.id.Password);
        reg1 = findViewById(R.id.reg1);
        reg2 = findViewById(R.id.textView2);
        reg3 = findViewById(R.id.reg3);
        icon = findViewById(R.id.facebookicon);
        btn = findViewById(R.id.Submit);
    }
}
