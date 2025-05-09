package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class keg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f22615a = "LightVane.";

    static {
        t2o.a(507510815);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{str, str2});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(f22615a);
        sb.append(str);
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb83980", new Object[]{str, str2});
            return;
        }
        Log.e(f22615a + str, str2);
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e38e584", new Object[]{str, str2});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(f22615a);
        sb.append(str);
    }

    public static void d(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("508f0fac", new Object[]{new Integer(i), str, str2});
        } else if (i == 2) {
            e(str, str2);
        } else if (i == 3) {
            a(str, str2);
        } else if (i == 4) {
            c(str, str2);
        } else if (i == 5) {
            f(str, str2);
        } else if (i != 6) {
            e(str, str2);
        } else {
            b(str, str2);
        }
    }

    public static void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("625b1491", new Object[]{str, str2});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(f22615a);
        sb.append(str);
    }

    public static void f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefb3f92", new Object[]{str, str2});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(f22615a);
        sb.append(str);
    }
}
