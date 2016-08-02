package com.example.power.webbrowser;

/**
 * Created by Manish on 02-08-2016.
 */
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Manish on 02-08-2016.
 */

public class MyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        Intent newIntent = new Intent(context, MainActivity.class);
       // newIntent.putExtra("Msg", message);
        newIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(newIntent);

        Toast.makeText(context, "Custom Intent Detected.", Toast.LENGTH_LONG).show();


    }
}
