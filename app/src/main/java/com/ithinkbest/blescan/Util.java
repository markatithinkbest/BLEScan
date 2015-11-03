package com.ithinkbest.blescan;

/**
 * Created by mark on 2015/11/3.
 */
public class Util {
    public static String byteArrayToHex(byte[] a) {
        StringBuilder sb = new StringBuilder(a.length * 2);
        for(byte b: a)
            sb.append(String.format("%02x", b & 0xff));
        return sb.toString();
    }
}
