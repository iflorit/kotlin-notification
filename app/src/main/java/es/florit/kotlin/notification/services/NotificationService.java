package es.florit.kotlin.notification.services;

import android.app.IntentService;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.support.v4.app.NotificationCompat;

/**
 * Created by ismael on 28/6/17.
 */

public class NotificationService extends IntentService {

    private NotificationManager mNotificationManager;

    public NotificationService() {
        super(NotificationService.class.getSimpleName());
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {

        mNotificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(getApplicationContext())
                .setSmallIcon(android.R.drawable.ic_dialog_info)
                .setContentTitle("Kotlin Notification")
                .setContentText("Notificación activa")
                .setWhen(System.currentTimeMillis())
                .setLights(Color.MAGENTA, 10000, 0)
                .setPriority(Notification.PRIORITY_MAX)
                .setOngoing(true);

        mNotificationManager.notify(1234567890, builder.build());
    }
}

