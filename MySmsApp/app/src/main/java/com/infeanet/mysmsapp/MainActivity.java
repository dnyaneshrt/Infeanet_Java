package com.infeanet.mysmsapp;

import android.Manifest;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.hbb20.CountryCodePicker;

public class MainActivity extends AppCompatActivity {

    EditText et_number,et_sms_desc;
    ImageButton btn_call, btn_sms;

    CountryCodePicker countryCodePicker;

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

        et_number= findViewById(R.id.et_number);
        et_sms_desc=findViewById(R.id.et_sms_desc);
        btn_call=findViewById(R.id.btn_call);
        btn_sms=findViewById(R.id.btn_sms);
        countryCodePicker=findViewById(R.id.ccp);


        //android 6.0 onwards we have to give runtime permissions.

        //step 1: check the permission status is granted or not?
        int call_status=ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE);
        int sms_status=ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.SEND_SMS);



        btn_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check the status is granted or not
             if(call_status== PackageManager.PERMISSION_GRANTED)
             {
                 Toast.makeText(MainActivity.this, "call_if", Toast.LENGTH_SHORT).show();
                 call();//written the calling logic
             }else
             {
                 Toast.makeText(MainActivity.this, "call_else", Toast.LENGTH_SHORT).show();
                 ActivityCompat.requestPermissions(MainActivity.this,new String[]{ Manifest.permission.CALL_PHONE},25);
             }
            }
        });
        btn_sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //code to send sms.
                if(sms_status==PackageManager.PERMISSION_GRANTED)
                {
                    Toast.makeText(MainActivity.this, "sms_if", Toast.LENGTH_SHORT).show();
                    sendSMS();
                }else {
                    Toast.makeText(MainActivity.this, "sms_else", Toast.LENGTH_SHORT).show();
                    ActivityCompat.requestPermissions(MainActivity.this,new String[]{ Manifest.permission.SEND_SMS},35);
                }

            }
        });

    }

    private void sendSMS() {
        String mobile_number=et_number.getText().toString();
        String smsDesc=et_sms_desc.getText().toString();
        String[] numbers= mobile_number.split(",");

       for(String number:numbers)
       {
           //get SMSManager Object
           SmsManager smsManager=SmsManager.getDefault();
           Intent si=new Intent(MainActivity.this,SingleClick.class);
           PendingIntent p_s=PendingIntent.getActivity(MainActivity.this,0,si,PendingIntent.FLAG_MUTABLE);

           Intent di=new Intent(MainActivity.this,DoubleClick.class);
           PendingIntent p_d=PendingIntent.getActivity(MainActivity.this,0,di,PendingIntent.FLAG_MUTABLE);

           smsManager.sendTextMessage(number,null,smsDesc,p_s,p_d);
       }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults, int deviceId) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults, deviceId);
        if(grantResults[0]==PackageManager.PERMISSION_GRANTED &&requestCode==25)
        {
            call();
        }if(grantResults[1]==PackageManager.PERMISSION_GRANTED&&requestCode==35)
        {
            sendSMS();
        }
        else
        {
            Toast.makeText(this, "user does not have call permission", Toast.LENGTH_SHORT).show();
        }
    }

    public void call()
    {
        String ccp= countryCodePicker.getSelectedCountryCode().toString();
        String mobile_number=et_number.getText().toString();
        String full_phone_number=ccp.concat(mobile_number);
        Intent intent=new Intent();
        intent.setAction(Intent.ACTION_CALL);
        System.out.println("full_phone_number :"+full_phone_number);
        intent.setData(Uri.parse("tel:"+full_phone_number));
        startActivity(intent);

    }
}