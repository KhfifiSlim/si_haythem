package com.dev_mobile.tp3_ex2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    Button btnCl ,btnAnnuler ;
    Integer res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnCl=findViewById(R.id.cal);
        btnAnnuler=findViewById(R.id.annuler);

        btnCl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Receive Data
                Intent j = getIntent();
                Integer int1 =Integer.valueOf(j.getStringExtra("num1"));
                Integer int2 =Integer.valueOf(j.getStringExtra("num2"));
                String p =j.getStringExtra("plus");
                String m=j.getStringExtra("moin");
                if(p!=null) {
                    res = int1 + int2;
                }
                else {
                    res=int1-int2;
                    //send data
                }
                Intent k = new Intent();
                k.putExtra("resultat",res);
                Log.i("calculer","set resultat ok="+res);
                setResult(RESULT_OK,k);
                finish();
            }
        });
        btnAnnuler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent();
                Log.i("ANNULER","set resultat non=");
                setResult(RESULT_CANCELED ,k);
                finish();
            }
        });
    }
}