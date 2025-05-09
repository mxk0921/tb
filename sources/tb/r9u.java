package tb;

import android.os.Build;
import android.os.Trace;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class r9u {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(989856417);
    }

    public static void a(bf1 bf1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("febe42a5", new Object[]{bf1Var});
        } else if (Build.VERSION.SDK_INT >= 29) {
            Trace.beginAsyncSection(bf1Var.f16350a, bf1Var.b);
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5235938d", new Object[]{str});
            return;
        }
        Trace.beginSection("WindVane#" + str);
    }

    public static void c(bf1 bf1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29e1f433", new Object[]{bf1Var});
        } else if (Build.VERSION.SDK_INT >= 29) {
            Trace.endAsyncSection(bf1Var.f16350a, bf1Var.b);
        }
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fcca111", new Object[0]);
        } else {
            Trace.endSection();
        }
    }
}
