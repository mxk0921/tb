package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class c3b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static WeakReference<Activity> f16816a;
    public static dxj c;
    public static boolean b = false;
    public static final AtomicBoolean d = new AtomicBoolean(false);

    static {
        t2o.a(729809104);
    }

    public static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5af6300e", new Object[]{context});
        } else if (context != null) {
            if (!(context instanceof Application)) {
                context = context.getApplicationContext();
            }
            SharedPreferences.Editor edit = context.getSharedPreferences("homeDoubleRowTapCount", 0).edit();
            edit.putInt("homeMiniDetailCount", 0);
            edit.putInt("homeNewDetailCount", 0);
            edit.apply();
        }
    }

    public static Activity c() {
        Activity activity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("c0156d7d", new Object[0]);
        }
        WeakReference<Activity> weakReference = f16816a;
        if (weakReference == null) {
            activity = null;
        } else {
            activity = weakReference.get();
        }
        if (activity == null) {
            return null;
        }
        if (nx9.q(activity) || nx9.r(activity)) {
            return activity;
        }
        return null;
    }

    public static String d(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("680863ad", new Object[]{str, context});
        }
        a(context, "homeMiniDetailCount");
        uqa.b("preloadWeex", "preLoadNewDetailWeex", "onClick, nav to mini fragment targetUrl:" + str);
        return str;
    }

    public static String e(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("198e554", new Object[]{str, context});
        }
        a(context, "homeNewDetailCount");
        if (c == null) {
            c = new dxj("taobao.homePage");
        }
        if (!c.c()) {
            return str;
        }
        uqa.b("preloadWeex", "preLoadNewDetailWeex", "onClick, nav to new fragment targetUrl" + str);
        return str;
    }

    public static String f(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("32efd784", new Object[]{str, context});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (str.contains("market.wapa.taobao.com/app/mini-detail/mini-detail/index") || str.contains("market.m.taobao.com/app/mini-detail/mini-detail/index")) {
            return d(str, context);
        }
        return str.contains("//item.taobao.com/item.htm") ? e(str, context) : str;
    }

    public static void g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8caea9d", new Object[]{context});
            return;
        }
        b = h(context);
        b(context);
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b09d0b73", new Object[0])).booleanValue();
        }
        if (c == null) {
            c = new dxj("taobao.homePage");
        }
        return b && c.c();
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f640114", new Object[0])).booleanValue();
        }
        if (c == null) {
            c = new dxj("taobao.homePage");
        }
        return c.c();
    }

    public static void k(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3629476b", new Object[]{activity});
            return;
        }
        if (c == null) {
            c = new dxj("taobao.homePage");
        }
        c.e(activity);
        uqa.b("basement", "preLoadNewDetailWeex", "preloadDoubleRowNewDetailWeex executed");
    }

    public static void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3d68e73", new Object[0]);
            return;
        }
        uqa.b("preloadWeex", "preLoadNewDetailWeex", "preloadNextPageWeex start");
        Activity c2 = c();
        if (c2 != null) {
            if (!d.get()) {
                uqa.b("preloadWeex", "preLoadNewDetailWeex", "can't preload, discard preload");
            } else if (!j()) {
                uqa.b("preloadWeex", "preLoadNewDetailWeex", "mini场景/双列流newdetail场景/首页沉浸式场景开关都没开，不进行预加载");
            } else {
                g(c2);
                if (i()) {
                    k(c2);
                }
                uqa.b("preloadWeex", "preLoadNewDetailWeex", "preloadNextPageWeex end");
            }
        }
    }

    public static void m(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a989aea", new Object[]{activity});
        } else if ((nx9.q(activity) || nx9.r(activity)) && activity != null) {
            f16816a = new WeakReference<>(activity);
        }
    }

    public static void n(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8c744b4", new Object[]{new Boolean(z)});
            return;
        }
        d.set(z);
        TLog.loge("preloadWeex", "preLoadNewDetailWeex", "setPreloadStatus: " + z);
    }

    public static void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff11e21e", new Object[]{context, str});
            return;
        }
        uqa.b("preloadWeex", "preLoadNewDetailWeex", "addTapCount start countKey: " + str);
        if (context != null) {
            if (!(context instanceof Application)) {
                context = context.getApplicationContext();
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences("homeDoubleRowTapCount", 0);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putInt(str, sharedPreferences.getInt(str, 0) + 1);
            edit.apply();
            uqa.b("preloadWeex", "preLoadNewDetailWeex", "addTapCount end countKey: " + str);
        }
    }

    public static boolean h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("df3818e", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        if (!(context instanceof Application)) {
            context = context.getApplicationContext();
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("homeDoubleRowTapCount", 0);
        int i = sharedPreferences.getInt("homeMiniDetailCount", 0);
        int i2 = sharedPreferences.getInt("homeNewDetailCount", 0);
        if (i == 0 && i2 == 0) {
            uqa.b("preloadWeex", "preLoadNewDetailWeex", "isDoubleRowInNewDetailBucket: false, miniCount: " + i + ", newCount: " + i2);
            return false;
        } else if (i2 > i) {
            uqa.b("preloadWeex", "preLoadNewDetailWeex", "isDoubleRowInNewDetailBucket: true, miniCount: " + i + ", newCount: " + i2);
            return true;
        } else {
            uqa.b("preloadWeex", "preLoadNewDetailWeex", "isDoubleRowInNewDetailBucket: false, miniCount: " + i + ", newCount: " + i2);
            return false;
        }
    }
}
