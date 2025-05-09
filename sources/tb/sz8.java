package tb;

import android.os.Build;
import android.os.Trace;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class sz8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f28370a;

    static {
        boolean a2 = e1r.a();
        f28370a = a2;
        if (a2) {
            c();
        }
    }

    public static void a(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60aa8876", new Object[]{str, str2, new Integer(i)});
        } else if (f28370a && Build.VERSION.SDK_INT >= 29) {
            String str3 = str + "_" + str2;
            Trace.beginAsyncSection(str3.substring(0, Math.min(str3.length(), 127)), i);
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeb3d417", new Object[]{str, str2});
        } else if (f28370a) {
            String str3 = str + "_" + str2;
            Trace.beginSection(str3.substring(0, Math.min(str3.length(), 127)));
        }
    }

    public static void d(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61a63384", new Object[]{str, str2, new Integer(i)});
        } else if (f28370a && Build.VERSION.SDK_INT >= 29) {
            String str3 = str + "_" + str2;
            Trace.endAsyncSection(str3.substring(0, Math.min(str3.length(), 127)), i);
        }
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fcca111", new Object[0]);
        } else if (f28370a) {
            Trace.endSection();
        }
    }

    public static void c() {
        try {
            Method declaredMethod = Class.forName("android.os.Trace").getDeclaredMethod("setAppTracingAllowed", Boolean.TYPE);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, Boolean.TRUE);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
