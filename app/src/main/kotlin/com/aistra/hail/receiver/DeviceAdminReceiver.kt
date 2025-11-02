package z.gnstc.uwv.receiver

import android.app.admin.DeviceAdminReceiver
import android.content.Context
import android.content.Intent
import z.gnstc.uwv.R
import z.gnstc.uwv.utils.HPolicy

class DeviceAdminReceiver : DeviceAdminReceiver() {
    override fun onEnabled(context: Context, intent: Intent) {
        super.onEnabled(context, intent)
        HPolicy.enableBackupService()
        HPolicy.setOrganizationName(context.getString(R.string.app_name))
    }
}