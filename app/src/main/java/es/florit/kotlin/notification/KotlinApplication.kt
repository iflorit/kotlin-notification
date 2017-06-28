package es.florit.kotlin.notification

import android.app.Application
import android.app.Notification
import android.app.NotificationManager
import android.content.Context
import android.graphics.Color
import android.support.v4.app.NotificationCompat


/**
 * Created by ismael on 28/6/17.
 */
class KotlinApplication : Application() {

    var mNotificationManager: NotificationManager? = null

    override fun onCreate() {
        super.onCreate()

        mNotificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        val builder = NotificationCompat.Builder(
                baseContext)
                .setSmallIcon(android.R.drawable.ic_dialog_info)
                .setContentTitle("Kotlin Notification")
                .setContentText("Notificación activa")
                .setWhen(System.currentTimeMillis())
                .setLights(Color.MAGENTA, 10000, 0)
                .setPriority(Notification.PRIORITY_MAX)
                .setOngoing(true)

        mNotificationManager?.notify(1234567890, builder.build());
    }
}