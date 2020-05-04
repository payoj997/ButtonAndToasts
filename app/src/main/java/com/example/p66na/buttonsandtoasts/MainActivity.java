package com.example.p66na.buttonsandtoasts;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast(View view) {
        switch (view.getId()){
            case R.id.errorButton:
                Toasty.error(this, "Error hai re baba", Toast.LENGTH_SHORT).show();
                break;
            case R.id.successButton:
                Toasty.success(this,"Chal enjoy kar",Toast.LENGTH_SHORT).show();
                break;
            case R.id.infoButton:
                Toasty.info(this,"Inform kar diya",Toast.LENGTH_SHORT).show();
                break;
            case R.id.warningButton:
                Toasty.warning(this,"Warn kar raha hu saale nikal",Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageButton:
                Toasty.normal(this,"Image dekh bey babu ka rabu ka sabu", ContextCompat.getDrawable(this,R.drawable.ic_cloud)).show();
                break;
        }
    }
}