package com.example.opilane.bluetooth;

import android.bluetooth.BluetoothA2dp;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by opilane on 06.06.2018.
 */

public class DeviceListAdapter  extends ArrayAdapter<BluetoothDevice> {

    private LayoutInflater mLayoutInflater;
    private ArrayList<BluetoothDevice>mDevice;
    private int nViewResourceId;

    public DeviceListAdapter (Context context, int tvResourceId, ArrayList<BluetoothDevice> devises){

        super(context, tvResourceId, devises);
        this.mDevices = devises;
        mLayoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        mViewResourceId =  tvResourceId;
    }
    public View getView (int position, view convertview, ViewGroup parent){
        convertview = mLayoutInflater.inflate(mViewResourceId, null);
        BluetoothDevice device = mDevice.get(position);
        if (device != null);
    }

}
