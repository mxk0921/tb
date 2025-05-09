package tb;

import android.os.Trace;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class w35 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f30431a;

    static {
        boolean c = q1r.c(".dag_systrace_x_open");
        f30431a = c;
        if (c) {
            b();
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5235938d", new Object[]{str});
        } else if (f30431a) {
            Trace.beginSection(str.substring(0, Math.min(str.length(), 127)));
        }
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a02127e2", new Object[0]);
        } else if (f30431a) {
            Trace.endSection();
        }
    }

    public static void b() {
        try {
            Method declaredMethod = Class.forName("android.os.Trace").getDeclaredMethod("setAppTracingAllowed", Boolean.TYPE);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, Boolean.TRUE);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
