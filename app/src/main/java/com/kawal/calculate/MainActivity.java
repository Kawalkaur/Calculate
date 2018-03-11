package com.kawal.calculate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText owned, leasedIn, leasedOut;
    Button btnTotal;
    TextView total;
    int a,b,c,d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        total = findViewById(R.id.total);
        owned = findViewById(R.id.owned);
        leasedIn = findViewById(R.id.leasedIn);
        leasedOut = findViewById(R.id.leasedOut);
        btnTotal = findViewById(R.id.btnTotal);
        btnTotal.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show();
       if (view.getId() == R.id.btnTotal){
        a = Integer.parseInt(owned.getText().toString());
        b =Integer.parseInt(leasedIn.getText().toString());
        c =Integer.parseInt(leasedOut.getText().toString());
        d = (a+b)-c;
        total.setText(Integer.toString(d));
       }
    }
}
