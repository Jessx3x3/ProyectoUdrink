package com.example.pruebalanzadora.vuelvetealcocteludrink;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PrincipalActivity extends AppCompatActivity {

    Button siguiente;
    Button no;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        siguiente = (Button)findViewById(R.id.btnSi);
        no = (Button)findViewById(R.id.btnNo);
        siguiente.setOnClickListener(new View.OnClickListener(){

            @Override
                public void onClick(View w){

                Intent siguiente = new Intent(PrincipalActivity.this, Cocteles.class);
                startActivity(siguiente);

            }
        });

    }

}
