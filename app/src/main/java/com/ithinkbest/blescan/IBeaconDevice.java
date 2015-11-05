package com.ithinkbest.blescan;

import android.bluetooth.BluetoothDevice;

import java.util.Date;

/**
 * Created by MARK on 2015/11/6.
 */
public class IBeaconDevice {
    BluetoothDevice bluetoothDevice;
    Date lastScanDate;
   // String uuid;
    int major;
    int minor;

//    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//    Date date = new Date();
//    System.out.println(dateFormat.format(date)); //2014/08/06 15:59:48
    //iPhone 當 iBeacon 時, MAC 會變


    public IBeaconDevice() {
    }

    public BluetoothDevice getBluetoothDevice() {
        return bluetoothDevice;
    }

    public void setBluetoothDevice(BluetoothDevice bluetoothDevice) {
        this.bluetoothDevice = bluetoothDevice;
    }

    public Date getLastScanDate() {
        return lastScanDate;
    }

    public void setLastScanDate(Date lastScanDate) {
        this.lastScanDate = lastScanDate;
    }

    public int getMajor() {
        return major;
    }

    public void setMajor(int major) {
        this.major = major;
    }

    public int getMinor() {
        return minor;
    }

    public void setMinor(int minor) {
        this.minor = minor;
    }
}
