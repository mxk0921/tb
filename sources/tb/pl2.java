package tb;

import android.content.Context;
import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class pl2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(416284673);
    }

    public static boolean a(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59399d44", new Object[]{context, intent})).booleanValue();
        }
        boolean sendBroadcast = LocalBroadcastManager.getInstance(context.getApplicationContext()).sendBroadcast(intent);
        TLog.logd("", intent.getAction() + "; sendResult=" + sendBroadcast);
        return sendBroadcast;
    }
}
