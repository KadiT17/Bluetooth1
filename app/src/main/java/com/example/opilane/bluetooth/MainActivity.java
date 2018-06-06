package com.example.opilane.bluetooth;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static  final String TAG = "MainActivity";
    BluetoothAdapter mBluetoothAdapter;
    ListView IvNewDevices;
    Button btnEnableDevices_Discoverable;
    public ArrayList<BluetoothDevice>nBTDevices = new ArrayList<>();
    public DeviceListAdapter nDeviceListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    Button btnOnOff = findViewById(R.id.btnONOFf);




}
