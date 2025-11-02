package z.gnstc.uwv.receiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import z.gnstc.uwv.work.HWork

class ScreenOffReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action == Intent.ACTION_SCREEN_OFF) {
            HWork.setAutoFreeze(true)
        }
    }
}