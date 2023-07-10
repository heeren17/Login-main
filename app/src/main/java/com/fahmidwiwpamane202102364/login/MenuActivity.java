package com.fahmidwiwpamane202102364.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    private Button _tampilMahasiswaButton;

    private Button _tampilMahasiswaIntent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        _tampilMahasiswaButton = findViewById(R.id.tampilMahasiswaButton);

        _tampilMahasiswaButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), TampilMahasiswaActivity.class);
                startActivity(intent);
            }
        });


    }

}