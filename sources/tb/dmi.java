package tb;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class dmi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(683671555);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd669f22", new Object[0])).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        return false;
    }

    public static void b(Context context, String str, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6f283d1", new Object[]{context, str, bundle});
            return;
        }
        Intent intent = new Intent();
        intent.setPackage(str);
        intent.setAction("com.alibaba.android.split.core.splitinstall.receiver.SplitInstallUpdateIntentService");
        intent.putExtra("session_state", bundle);
        intent.addFlags(1073741824);
        if (a()) {
            intent.addFlags(2097152);
        }
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }
}
