package tb;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class l52 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static Intent a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("cc12aefd", new Object[]{context});
        }
        try {
            return context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        } catch (Throwable unused) {
            return null;
        }
    }
}
