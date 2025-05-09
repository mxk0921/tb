package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class th {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f28715a;

    static {
        t2o.a(79691956);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5966e863", new Object[]{str});
        } else if (c()) {
            throw new IllegalStateException(str);
        }
    }

    public static void b(Context context) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{context});
        } else if (f28715a == null) {
            try {
                if ((context.getApplicationInfo().flags & 2) != 0) {
                    z = true;
                }
            } catch (Exception unused) {
            }
            f28715a = Boolean.valueOf(z);
        }
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4500e523", new Object[0])).booleanValue();
        }
        Boolean bool = f28715a;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static void d(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec28ac7f", new Object[]{th});
        } else if (th != null) {
            ck.g().b("AURADebugUtils", "printStackTraceWhenDebug", th.getMessage());
            if (c()) {
                th.printStackTrace();
            }
        }
    }
}
