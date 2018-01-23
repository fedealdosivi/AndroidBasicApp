package com.example.federicopalomero.acamicaexample;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by federico.palomero on 1/22/2018.
 */

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        final EditText username= (EditText)findViewById(R.id.userText);
        final EditText passwod=(EditText)findViewById(R.id.pwText);
        final Button login=(Button)findViewById(R.id.btnLogIn);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SecondActivity.this, username.getText().toString() + passwod.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
