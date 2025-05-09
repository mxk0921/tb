package tb;

import android.os.Trace;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class hha {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f20639a = false;
    public static boolean b = false;

    static {
        t2o.a(295699254);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{str, str2});
            return;
        }
        v2s.o().A().b("gl-" + str, str2);
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb83980", new Object[]{str, str2});
            return;
        }
        v2s.o().A().c("gl-" + str, str2);
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e38e584", new Object[]{str, str2});
            return;
        }
        v2s.o().A().a("gl-" + str, str2);
    }

    public static void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("169a128b", new Object[]{str, str2});
        } else if (f20639a) {
            a(str, str2);
        }
    }

    public static void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93231f5", new Object[]{str});
        } else if (b) {
            Trace.beginSection(str);
        }
    }

    public static void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afd1c6dd", new Object[0]);
        } else if (b) {
            Trace.endSection();
        }
    }

    public static void g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("625b1491", new Object[]{str, str2});
            return;
        }
        v2s.o().A().e("gl-" + str, str2);
    }
}
