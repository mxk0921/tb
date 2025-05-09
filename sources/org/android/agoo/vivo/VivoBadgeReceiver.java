package org.android.agoo.vivo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.utl.ALog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class VivoBadgeReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_MPM_MESSAGE_BOX_UNREAD = "msg.action.ACTION_MPM_MESSAGE_BOX_UNREAD";
    public static final String EXTRA_KEY_TIP_NUMBER = "tipNumber";
    public static final String EXTRA_KEY_TIP_TYPE = "tipType";
    public static final int FLAG_RECEIVER_INCLUDE_BACKGROUND = 16777216;
    private static final String TAG = "VivoBadgeReceiver";

    public static /* synthetic */ Object ipc$super(VivoBadgeReceiver vivoBadgeReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in org/android/agoo/vivo/VivoBadgeReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        try {
            String str = TAG;
            ALog.d(str, "onReceive badge broadcast", new Object[0]);
            int intExtra = intent.getIntExtra("tipType", -1);
            int intExtra2 = intent.getIntExtra("tipNumber", 0);
            Intent intent2 = new Intent();
            intent2.setAction("launcher.action.CHANGE_APPLICATION_NOTIFICATION_NUM");
            intent2.putExtra("packageName", context.getPackageName());
            intent2.putExtra("className", "com.taobao.tao.welcome.Welcome");
            if (intExtra2 <= 0 || intExtra != 0) {
                ALog.d(str, "onReceive badge reset ", new Object[0]);
                intent2.putExtra("notificationNum", 0);
            } else {
                ALog.d(str, "onReceive badge tipNum ", Integer.valueOf(intExtra2));
                intent2.putExtra("notificationNum", intExtra2);
            }
            if (Build.VERSION.SDK_INT >= 26) {
                intent2.addFlags(16777216);
            }
            context.sendBroadcast(intent2);
        } catch (Exception e) {
            ALog.e(TAG, "onReceive badge error ", e, new Object[0]);
            e.printStackTrace();
        }
    }
}
