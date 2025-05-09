package tb;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class wxv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("899dd03", new Object[0])).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return true;
        }
        return false;
    }

    public static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f23aa56f", new Object[]{context});
        } else {
            LocalBroadcastManager.getInstance(context).sendBroadcast(new Intent("com.taobao.interact.publish.action.BACK"));
        }
    }
}
