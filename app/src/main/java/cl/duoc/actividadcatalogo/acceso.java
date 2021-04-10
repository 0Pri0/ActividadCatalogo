package cl.duoc.actividadcatalogo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class acceso extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceso);

        EditText etUser = findViewById(R.id.acc_etUsuario);
        EditText etPass = findViewById(R.id.acc_etPassword);
        ImageButton ibVolver = findViewById(R.id.acc_ibVolver);
        Button bAcceder = findViewById(R.id.bAcceder);



        //Usuario BD
        String userBD = "";
        String passBD = "";

        //boton volver
        ibVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intento = new Intent(acceso.this, MainActivity.class );
                startActivity(intento);
            }
        });


        //Boton Acceder
        bAcceder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*
                if(etUser.getText().toString().equals(userBD)){

                }else{
                    etUser.setText();
                }*/
                Toast.makeText(acceso.this, "Tranquilación!!, Estamos trabajando para usted!!!", Toast.LENGTH_SHORT).show();
            }
        });

    }
}