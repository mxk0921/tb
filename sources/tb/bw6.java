package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class bw6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f16678a;

    static {
        t2o.a(912262773);
    }

    public static synchronized boolean a(Context context) {
        boolean z = false;
        synchronized (bw6.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7e5a578d", new Object[]{context})).booleanValue();
            }
            if (f16678a == null) {
                try {
                    if ((context.getApplicationInfo().flags & 2) != 0) {
                        z = true;
                    }
                } catch (Throwable unused) {
                }
                f16678a = Boolean.valueOf(z);
            }
            return f16678a.booleanValue();
        }
    }
}
