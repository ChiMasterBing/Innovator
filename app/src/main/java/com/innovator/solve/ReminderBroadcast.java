package com.innovator.solve;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import com.innovator.solve.R;

public class ReminderBroadcast extends BroadcastReceiver {
    //sets notification
    @Override
    public void onReceive(Context context, Intent intent) {
        //Still need to change to different message if goal met, possibly different reminders so not repetitive
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "notif")
                .setSmallIcon(R.drawable.ic_notifications_black_24dp)
                .setContentTitle("SOLve Practice Reminder")
                .setContentText("Time to practice! Keep up the progress, you're doing great!")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT);

        NotificationManagerCompat notifManager = NotificationManagerCompat.from(context);

        notifManager.notify(1, builder.build()); //define ID as any number

    }
}
