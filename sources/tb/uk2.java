package tb;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class uk2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(464519250);
    }

    public static void a(boolean z, BroadcastReceiver broadcastReceiver, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7d39ef3", new Object[]{new Boolean(z), broadcastReceiver, strArr});
            return;
        }
        Application application = Globals.getApplication();
        if (application != null && strArr != null && broadcastReceiver != null) {
            IntentFilter intentFilter = new IntentFilter();
            for (String str : strArr) {
                intentFilter.addAction(str);
            }
            if (z) {
                LocalBroadcastManager.getInstance(application).registerReceiver(broadcastReceiver, intentFilter);
            } else {
                application.registerReceiver(broadcastReceiver, intentFilter);
            }
        }
    }

    public static void b(boolean z, BroadcastReceiver broadcastReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3520265", new Object[]{new Boolean(z), broadcastReceiver});
            return;
        }
        Application application = Globals.getApplication();
        if (application != null) {
            if (z) {
                LocalBroadcastManager.getInstance(application).unregisterReceiver(broadcastReceiver);
            } else {
                application.unregisterReceiver(broadcastReceiver);
            }
        }
    }
}
