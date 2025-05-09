package tb;

import android.app.Application;
import android.content.res.Resources;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class og8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f25373a = false;
    public static boolean b = false;

    static {
        t2o.a(989856430);
    }

    public static synchronized void a() {
        synchronized (og8.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fede197", new Object[0]);
                return;
            }
            if (!b) {
                Application application = yaa.n;
                if (application != null) {
                    f25373a = (application.getApplicationInfo().flags & 2) != 0;
                    b = true;
                } else {
                    b = false;
                }
            }
        }
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2cad2687", new Object[0])).booleanValue();
        }
        if (!b) {
            a();
        }
        return f25373a;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d57d6520", new Object[0])).booleanValue();
        }
        try {
            return Resources.getSystem().getConfiguration().locale.getLanguage().contains("zh");
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a59fb54", new Object[0])).booleanValue();
        }
        if (!v7t.h() || !b()) {
            return false;
        }
        return true;
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("571d3b83", new Object[0])).booleanValue();
        }
        Application application = yaa.n;
        if (application != null) {
            return "com.taobao.taobao".equals(application.getPackageName());
        }
        return false;
    }

    public static void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abe02abc", new Object[]{new Boolean(z)});
            return;
        }
        f25373a = z;
        b = true;
    }

    public static void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8943b85", new Object[]{new Boolean(z)});
        }
    }
}
