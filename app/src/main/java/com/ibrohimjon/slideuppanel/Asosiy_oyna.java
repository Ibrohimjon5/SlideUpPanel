package com.ibrohimjon.slideuppanel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Asosiy_oyna extends AppCompatActivity {

    ImageView btb_click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asosiy_oyna);

        btb_click = findViewById(R.id.btb_click);

        btb_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Salom ",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
