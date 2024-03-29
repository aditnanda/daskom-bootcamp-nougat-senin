package com.fittechinova.myapplicationsenin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText etTlp;
    private Button btnSkuy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etTlp = findViewById(R.id.et_tlp);
        btnSkuy = findViewById(R.id.btn_skuy);

        btnSkuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, etTlp.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
