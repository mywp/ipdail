package com.example.scorpio.ipdail;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

/**
 * Created by Scorpio on 16/3/3.
 */
public class OutCallReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String number = getResultData();
        System.out.println("哈哈，有电话打出去了");
        SharedPreferences sp = context.getSharedPreferences("config", Context.MODE_PRIVATE);
        String ipnumber = sp.getString("ipnumber", "");
        //判断是否是长途，是否有前缀等等
        setResultData(ipnumber + number);
    }
}
