package com.example.owner.rccar;

import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.nio.charset.Charset;
import java.util.UUID;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    BluetoothConnectionService mBluetoothConnecttion;
    private static final UUID MY_UUID_INSECURE =
            UUID.fromString("8ce255c0-200a-11e0-ac64-0800200c9a66");

    Button btnUp;
    Button btnDown;
    Button btnLeft;
    Button btnRight;
    Button btnBluetooth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnUp = (Button) findViewById(R.id.btnUp);
        btnBluetooth = (Button) findViewById(R.id.btnBluetooth);
        btnDown = (Button) findViewById(R.id.btnDown);
        btnLeft = (Button) findViewById(R.id.btnLeft);
        btnRight = (Button) findViewById(R.id.btnRight);


        Log.d(TAG, "onCreate: Started.");

                /*TODO Add Function For Up Key*/
        btnUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: ON Button Clicked");
                makeToastMessage("Up");
            }
        });

                /*TODO Add Function For Down Key*/
        btnDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: ON Button Clicked");
                makeToastMessage("Down");
            }
        });

                /*TODO Add Function For Left Key*/
        btnLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: ON Button Clicked");
                makeToastMessage("Left");
            }
        });

                /*TODO Add Function For Right Key*/
        btnRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: ON Button Clicked");
                makeToastMessage("Right");
            }
        });
        btnBluetooth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: btnBluetooth Clicked");

                Intent intent = new Intent(MainActivity.this, BluetoothMenuActivity.class);
                startActivity(intent);
            }
        });

//        btnOn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Log.d(TAG, "onClick: ON Button Clicked");
////                byte[] bytes = "ON".getBytes(Charset.defaultCharset());
////                mBluetoothConnecttion.write(bytes);
//                makeToastMessage("Lights: ON");
//            }
//        });


    }


    //Color Picker - Couldn't figure it out
//    public void openColorPicker(){
//        AmbilWarnaDialog colorPicker = new AmbilWarnaDialog(this, mDefaultColor, new AmbilWarnaDialog.OnAmbilWarnaListener() {
//            @Override
//            public void onCancel(AmbilWarnaDialog dialog) {
//
//            }
//
//            @Override
//            public void onOk(AmbilWarnaDialog dialog, int color) {
//                mDefaultColor = color;
//                mLayout.setBackgroundColor(mDefaultColor);
//            }
//        });
//    }

    private void laterVersion(){
        makeToastMessage("Will Be Added in Future Version");
    }

    private void makeToastMessage(String msg){
        Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
    }

}
