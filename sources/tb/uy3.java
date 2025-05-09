package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class uy3 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ColdStartSplashManager";

    /* renamed from: a  reason: collision with root package name */
    public static usg f29669a;
    public static Application b;

    static {
        t2o.a(736100359);
    }

    public static Application a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("5749e470", new Object[0]);
        }
        if (b == null) {
            tm1.a(TAG, "coldStartNewEnable mApplication is null");
            b = Globals.getApplication();
        }
        return b;
    }

    public static void b(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        c(application);
        Application a2 = a();
        if (a2 == null) {
            tm1.a(TAG, "ColdStart init mApplication is null");
            return;
        }
        nh2.m(a2);
        usg d = usg.d();
        f29669a = d;
        d.e().f(a2);
        tm1.a(TAG, "coldStartNewEnable:" + nh2.f24729a);
        if (nh2.f24729a) {
            tm1.a(TAG, "ColdStart start loadAdCache");
            f29669a.a().b();
            tm1.a(TAG, "ColdStart enableOptimizedCodeSwitch true");
            a2.registerActivityLifecycleCallbacks(new ai2());
        }
    }

    public static void c(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bac3b6a", new Object[]{application});
        } else if (application != null) {
            b = application;
        } else {
            tm1.a(TAG, "coldStartNewEnable application is null");
            if (Globals.getApplication() != null) {
                b = Globals.getApplication();
            } else {
                tm1.a(TAG, "coldStartNewEnable Globals application is null");
            }
        }
    }
}
