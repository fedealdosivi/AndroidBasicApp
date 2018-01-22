package com.example.federicopalomero.acamicaexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button secondActivity=(Button) findViewById(R.id.btnGoToAct);
        secondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity.this, SecondActivity.class);
                startActivity(i);
            }
        });
    }

    @Override//cuando cambiamos de actividad
    protected void onPause() {
        super.onPause();
        Log.d( "onPause"," Entro al pause");
    }

    @Override//Se ejecuta cuando la visual ya esta visualizada
    protected void onResume() {
        super.onResume();
        Log.d( "onResume"," Entro al resume");
    }

    @Override//cuando la activity una vez iniciada esta por ser mostrada
    protected void onStart() {
        super.onStart();
        Log.d( "onStart"," Entro al start");
    }

    @Override//ya no se muestra en pantalla
    protected void onStop() {
        super.onStop();
        Log.d( "onStop"," Entro al stop");
    }

    @Override// cuando se necesita eliminar la actividad
    protected void onDestroy() {
        super.onDestroy();
        Log.d( "onDestroy"," Entro al destroy");
    }


}
