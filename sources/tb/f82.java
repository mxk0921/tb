package tb;

import android.app.Application;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.UserActionBridge;
import com.taobao.android.behavix.adapter.BXBRBridge;
import com.taobao.android.behavix.adapter.BehaviXAppAdapter;
import com.taobao.android.behavix.utils.Debuggable;
import com.taobao.android.testutils.JsBridgeBehaviXConfig;
import com.taobao.android.ucp.bridge.NativeDelegate;
import com.taobao.orange.OConstant;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import tb.o0r;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class f82 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "BehaviX";
    public static volatile Application b;
    public static String c;
    public static String e;

    /* renamed from: a  reason: collision with root package name */
    public static final f82 f19094a = new f82();
    public static int d = -1;
    public static boolean f = false;
    public static volatile boolean g = false;
    public static long h = 0;

    static {
        t2o.a(404750447);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        try {
            fsw.h(JsBridgeBehaviXConfig.NAME, JsBridgeBehaviXConfig.class);
            fsw.h("TBUserActionJSBridge", UserActionBridge.class);
        } catch (Exception e2) {
            q82.f("initJSBridge_fail", null, null, e2);
        }
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("92150ca3", new Object[0]);
        }
        return c;
    }

    public static Application d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("5749e470", new Object[0]);
        }
        return b;
    }

    public static int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4565d855", new Object[0])).intValue();
        }
        return d;
    }

    public static f82 f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f82) ipChange.ipc$dispatch("7938b63", new Object[0]);
        }
        return f19094a;
    }

    public static String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2e0d7a8", new Object[0]);
        }
        return e;
    }

    public static void h(Application application, HashMap<String, Object> hashMap) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
        } else if (!g) {
            h = System.nanoTime();
            if (application == null || hashMap == null) {
                TLog.loge("BehaviX", "BehaviX", "application and params cannot be null");
                return;
            }
            TLog.loge("BehaviX", "behavix init start");
            if (BehaviXAppAdapter.c(hashMap)) {
                str = "taobao";
            } else {
                str = (String) hashMap.get("appName");
            }
            Object obj = hashMap.get(OConstant.LAUNCH_ENVINDEX);
            if (obj instanceof Integer) {
                d = ((Integer) obj).intValue();
            }
            Object obj2 = hashMap.get("usingNGNextLaunch");
            if (obj2 instanceof Boolean) {
                f = ((Boolean) obj2).booleanValue();
            }
            String str2 = (String) hashMap.get("ttid");
            String str3 = (String) hashMap.get("userId");
            if (TextUtils.isEmpty(str)) {
                TLog.loge("BehaviX", "BehaviX", "appName cannot be null");
                return;
            }
            qm1.a();
            f().i(application, str, str2);
            bkt.c().f(hashMap);
            if (!TextUtils.isEmpty(str3)) {
                f().l(str3);
            }
            if (wl0.a() == null) {
                TLog.loge("BehaviX", "BehaviX", "br init failed");
            }
            BXBRBridge.d();
            TLog.loge("BehaviX", "behavix init end");
        }
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ac4252c", new Object[0])).booleanValue();
        }
        return g;
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c34f3a9", new Object[0])).booleanValue();
        }
        return "1".equals(NativeDelegate.getCppStaticVariable(NativeDelegate.StaticVariableName.CPP_LAUNCH_END));
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("514e1cae", new Object[0])).booleanValue();
        }
        return f;
    }

    public final void b(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{this, application});
            return;
        }
        application.registerActivityLifecycleCallbacks(i82.d());
        i82.d().e(g82.a());
        i82.d().e(uim.c());
    }

    public void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b37585c0", new Object[]{this, str});
        } else {
            iaa.f21189a = str;
        }
    }

    public void i(Application application, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("408007bc", new Object[]{this, application, str, str2});
        } else if (!g && application != null) {
            try {
                c = str;
                e = str2;
                b = application;
                lzo.b().c(application);
                Debuggable.init(application);
                uep.c();
                pow.d(application);
                if (gwv.v()) {
                    p3v.getInstance().registerListener(fvv.k());
                } else if (v82.n(o0r.c.K_ENABLE_REGISTER_UTPLUGIN, true)) {
                    p3v.getInstance().registerListener(fvv.k());
                    TLog.logi("BehaviX", "BehaviX", "utplugin_init ");
                }
                b(application);
                a();
                bkt.c().d();
                uim.d();
            } catch (Exception e2) {
                q82.f("init_error", null, null, e2);
            }
            g = true;
        }
    }
}
