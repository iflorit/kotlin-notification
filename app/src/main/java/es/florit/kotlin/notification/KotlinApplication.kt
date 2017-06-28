package es.florit.kotlin.notification

import android.app.Application
import android.content.Intent
import es.florit.kotlin.notification.services.NotificationService


/**
 * Created by ismael on 28/6/17.
 */
class KotlinApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        onNotification()
    }

    fun onNotification() {
        val intent = Intent(this, NotificationService::class.java)
        startService(intent)
    }

    fun offNotification() {
        val intent = Intent(this, NotificationService::class.java)
        stopService(intent)
    }
}