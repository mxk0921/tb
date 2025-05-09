package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.DinamicViewHelper;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class tl7 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "Dinamic";

    /* renamed from: a  reason: collision with root package name */
    public static boolean f28782a = false;
    public static final Map<String, gyi> b = new HashMap();
    public static boolean c = false;
    public static Context d;

    static {
        t2o.a(444596230);
    }

    public static Context a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[0]);
        }
        return d;
    }

    public static nm7 b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nm7) ipChange.ipc$dispatch("dd4aa362", new Object[]{str});
        }
        return DinamicViewHelper.getEventHandler(str);
    }

    public static gyi c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gyi) ipChange.ipc$dispatch("d1d10ad3", new Object[]{str});
        }
        Map<String, gyi> map = b;
        if (((HashMap) map).containsKey(str)) {
            return (gyi) ((HashMap) map).get(str);
        }
        gyi a2 = gyi.a(str);
        ((HashMap) map).put(str, a2);
        return a2;
    }

    public static sn7 d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sn7) ipChange.ipc$dispatch("e429334a", new Object[]{str});
        }
        return DinamicViewHelper.getViewConstructor(str);
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c8ec72e", new Object[0])).booleanValue();
        }
        return f28782a;
    }

    public static void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7da871d8", new Object[]{new Boolean(z)});
            return;
        }
        try {
            boolean a2 = owo.a();
            f();
            if (a2 || z) {
                owo.c();
            }
        } catch (Exception e) {
            if (f()) {
                e.printStackTrace();
            }
        }
    }

    public static void h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d85eaff", new Object[]{context});
        } else {
            d = context;
        }
    }

    public static void e(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b35b22e3", new Object[]{context, new Boolean(z)});
        } else if (!c) {
            f28782a = z;
            d = context.getApplicationContext();
            ((HashMap) b).put("default", gyi.a("default"));
            zm7.b("monitor");
            c = true;
        }
    }
}
