package tb;

import android.content.Context;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class tn8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("541b3ede", new Object[]{context, new Boolean(z)})).booleanValue();
        }
        i1r a2 = o1r.a(context);
        if (Build.VERSION.SDK_INT >= 30) {
            return a2.b("OptAppExitAnr", z);
        }
        if (!a2.b("OptAppExitAnr", z) || !a2.b("DelAnrOnLowOs", false)) {
            return false;
        }
        return true;
    }
}
