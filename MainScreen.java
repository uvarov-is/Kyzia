package com.example.uvarov_is.kyza;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.widget.Toast;

import static com.example.uvarov_is.kyza.R.string.TextToast;

public class MainScreen extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
        Toast toastHello = Toast.makeText(getApplicationContext(), getString(TextToast), Toast.LENGTH_LONG);
        toastHello.setGravity(Gravity.CENTER_HORIZONTAL, 0, 0);
        toastHello.show();
    }
}
