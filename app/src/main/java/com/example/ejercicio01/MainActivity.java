package com.example.ejercicio01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private String click;
    private EditText user;
    private EditText pass;
    private TextView muestra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.clickBTN);
        muestra = findViewById(R.id.mensaje);
        user = findViewById(R.id.UserName);
        pass = findViewById(R.id.PassWord);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click=user.getText().toString();
                muestra.setText(click);
            }
        });
        btn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                click=pass.getText().toString();
                muestra.setText(click);
                return false;
            }
        });

    }


}
