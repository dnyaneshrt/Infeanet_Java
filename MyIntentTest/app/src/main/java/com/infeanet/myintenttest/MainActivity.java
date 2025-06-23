package com.infeanet.myintenttest;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button  btn_next, btn_youtube, btn_paytm;
    EditText et_number,et_name;

    ImageButton btn_dial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btn_dial= findViewById(R.id.btn_dial);
        btn_next=findViewById(R.id.btn_next);
        btn_youtube=findViewById(R.id.btn_youtube);
        btn_paytm=findViewById(R.id.btn_paytm);
        et_number=findViewById(R.id.et_number);
        et_name=findViewById(R.id.et_name);

        btn_dial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String mobile_number=et_number.getText().toString();
                Intent intent=new Intent();
                intent.setAction(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:"+mobile_number));
                startActivity(intent);
            }
        });


        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,MyActivity.class);
                String name=et_name.getText().toString();
                intent.putExtra("birthdayboy",name);
                startActivity(intent);
            }
        });
    }
}