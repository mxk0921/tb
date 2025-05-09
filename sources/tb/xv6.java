package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class xv6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f31623a;

    static {
        t2o.a(442499260);
    }

    public static void a(Context context) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{context});
        } else if (f31623a == null) {
            try {
                if ((context.getApplicationInfo().flags & 2) != 0) {
                    z = true;
                }
            } catch (Exception unused) {
            }
            f31623a = Boolean.valueOf(z);
        }
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4500e523", new Object[0])).booleanValue();
        }
        Boolean bool = f31623a;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }
}
