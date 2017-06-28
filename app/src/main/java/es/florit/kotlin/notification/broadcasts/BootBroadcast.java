package es.florit.kotlin.notification.broadcasts;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import es.florit.kotlin.notification.services.NotificationService;

/**
 * Created by ismael on 28/6/17.
 */

public class BootBroadcast extends BroadcastReceiver {
    @Override
    public void onReceive(Context ctx, Intent intent) {
        ctx.startService(new Intent(ctx, NotificationService.class));
    }
}