package com.carlos.actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //String msn = this.getIntent().getExtras().getString("msn");
        //TextView txt = findViewById(R.id.txt);
        //txt.setText(msn);
        LoadComponents();
    }


    private void LoadComponents() {
        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
    }
   @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn1:{
                Intent actividad1 = new Intent(this,Actividad1.class);
                actividad1.putExtra("msn", "Vamos a la actividad 1");
                this.startActivity(actividad1);
                break;
            }
            case R.id.btn2:{
                Intent actividad2 = new Intent(this,Actividad2.class);
                actividad2.putExtra("msn", "Vamos a la actividad 2");
                this.startActivity(actividad2);
                break;
            }
            case R.id.btn3:{
                Intent actividad3 = new Intent(this,Actividad3.class);
                actividad3.putExtra("msn", "Vamos a la actividad 3");
                this.startActivity(actividad3);
                break;
            }
            case R.id.btn4:{
                Intent actividad4 = new Intent(this,Actividad4.class);
                actividad4.putExtra("msn", "Vamos a la actividad 4");
                this.startActivity(actividad4);
                break;
            }
        }

    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "OnResume", Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "OnPause", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart", Toast.LENGTH_LONG).show();
    }
}