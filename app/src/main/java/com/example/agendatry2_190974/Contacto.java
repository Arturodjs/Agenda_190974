package com.example.agendatry2_190974;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class Contacto extends AppCompatActivity {

    private Context mContext;
    String latitud, longitud, name1;
    Button botonRegreso;
    Button botonMapa;
    TextView name;
    TextView sexo;
    TextView carrera;
    TextView fecha_nacimiento;
    TextView direccion;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.contact);
        mContext = this;

        getIncomingIntent();
    }
    private void getIncomingIntent(){
        if(getIntent().hasExtra("image_url") && getIntent().hasExtra("image_name")){
            String imageUrl = getIntent().getStringExtra("image_url");
            String imageName = getIntent().getStringExtra("image_name");

            setImage(imageUrl, imageName);

        }
    }
    private void setImage(String imageUrl, String imageName){

        name = findViewById(R.id.txtNombre);
        name.setText(imageName);
        ImageView image = findViewById(R.id.imgContacto);
        Glide.with(this).asBitmap().load(imageUrl).into(image);
        botonMapa = (Button) findViewById(R.id.btnMapa);
        botonRegreso = (Button) findViewById(R.id.btnRegreso);
        sexo = (TextView) findViewById(R.id.txtSexo);
        carrera = findViewById(R.id.txtCarr);
        fecha_nacimiento = findViewById(R.id.txtFecha);
        direccion = findViewById(R.id.txtDirec);
        name1 = ((TextView) name).getText().toString();

        if(name1.equals("Carlos O.")){
                sexo.setText("Genero: M");
                carrera.setText("Carrera: Ing. TICs");
                fecha_nacimiento.setText("Fecha de Nacimiento: 19/09/1999");
                direccion.setText("Direccion: PlaceHolder 1");
                latitud = "18.481102";
                longitud = "-69.913222";
        }
        else if(name1.equals("Isamar F.")){
            sexo.setText("Sexo: F");
            carrera.setText("Carrera: Ing. TICs");
            fecha_nacimiento.setText("Fecha de Nacimiento: 11/03/1996");
            direccion.setText("Direccion: PlaceHolder 2");
            latitud = "18.478705";
            longitud = "-69.93739";

        }
        else if(name1.equals("Jeanette U.")){
            sexo.setText("Sexo: F");
            carrera.setText("Carrera: Ing. TICs");
            fecha_nacimiento.setText("Fecha de Nacimiento: 08/12/1997");
            direccion.setText("Direccion: PlaceHolder 3");
            latitud = "18.511194";
            longitud = "-69.979632";
        }
        else if(name1.equals("Jesus A.")){
            sexo.setText("Sexo: M");
            carrera.setText("Carrera: Ing. TICs");
            fecha_nacimiento.setText("Fecha de Nacimiento: 01/01/1999");
            direccion.setText("Direccion: PlaceHolder 4");
            latitud = "18.519893";
            longitud = "-70.048053";
        }
        else if(name1.equals("Victor H.")){
            sexo.setText("Sexo: F");
            carrera.setText("Carrera: Ing. TICs");
            fecha_nacimiento.setText("Fecha de Nacimiento: 27/01/1991");
            direccion.setText("Direccion: PlaceHolder 5");
            latitud = "18.527104";
            longitud = "-70.13481";
        }
        botonMapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nuevoLay = new Intent(Contacto.this, MapsActivity.class );
                nuevoLay.putExtra("latitud", latitud);
                nuevoLay.putExtra("longitud", longitud);
                mContext.startActivity(nuevoLay);
            }
        });
        botonRegreso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nuevoLay = new Intent(Contacto.this, ClaseTran.class );
                mContext.startActivity(nuevoLay);
            }
        });
    }


}
