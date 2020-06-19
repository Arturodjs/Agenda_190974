package com.example.agendatry2_190974;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText Usuariotxt;
    private EditText Passtxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button boton = (Button) findViewById(R.id.button);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario = ((EditText) findViewById(R.id.Usuariotxt)).getText().toString();
                String pass = ((EditText) findViewById(R.id.PassTxt)).getText().toString();
                if (usuario.equals("admin") && pass.equals("admin")){
                    Intent nuevoLay = new Intent(MainActivity.this, ClaseTran.class);
                    startActivity(nuevoLay);
                }
                else{
                    Toast.makeText(getApplicationContext(),"Usuario incorrecto", Toast.LENGTH_SHORT).show();
                }
            }
        });
        final Button boton_limpiar = (Button) findViewById(R.id.button2);
        boton_limpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Usuariotxt = ((EditText) findViewById(R.id.Usuariotxt));
                Passtxt = ((EditText) findViewById(R.id.PassTxt));
                Usuariotxt.setText("");
                Passtxt.setText("");
            }
        });
    }
}
