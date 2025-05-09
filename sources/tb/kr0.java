package tb;

import android.app.Application;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.android.tcrash.UncaughtCrashType;
import com.taobao.weex.WXEnvironment;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class kr0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static kr0 d;
    public static cuw e;

    /* renamed from: a  reason: collision with root package name */
    public Application f22862a;
    public npb b;
    public hac c;

    static {
        t2o.a(85983234);
    }

    public static kr0 e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kr0) ipChange.ipc$dispatch("c59f7f15", new Object[0]);
        }
        if (d == null) {
            synchronized (kr0.class) {
                try {
                    if (d == null) {
                        d = new kr0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public static void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6b0e152", new Object[0]);
            return;
        }
        e = new cuw();
        TCrashSDK.instance().addJvmUncaughtCrashListener(e);
    }

    public static synchronized void i(String str) {
        synchronized (kr0.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dab3ef7", new Object[]{str});
                return;
            }
            cuw cuwVar = e;
            if (cuwVar != null) {
                cuwVar.a(str);
            }
            TCrashSDK.instance().getCrashCaughtHeaderByType(UncaughtCrashType.NATIVE_ONLY).addHeaderInfo(WXEnvironment.WEEX_CURRENT_KEY, str);
        }
    }

    public static synchronized void j(String str) {
        synchronized (kr0.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4ea521bf", new Object[]{str});
                return;
            }
            cuw cuwVar = e;
            if (cuwVar != null) {
                cuwVar.b(str);
            }
        }
    }

    public Application a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("5749e470", new Object[]{this});
        }
        return this.f22862a;
    }

    public npb b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (npb) ipChange.ipc$dispatch("a601fb2", new Object[]{this});
        }
        return this.b;
    }

    public Context c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        Application application = this.f22862a;
        if (application != null) {
            return application.getApplicationContext();
        }
        return null;
    }

    public hac d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hac) ipChange.ipc$dispatch("79001936", new Object[]{this});
        }
        return this.c;
    }

    public void f(Application application, npb npbVar, hac hacVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20953861", new Object[]{this, application, npbVar, hacVar});
            return;
        }
        this.f22862a = application;
        this.b = npbVar;
        this.c = hacVar;
    }

    public void h(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac5093d5", new Object[]{this, str, map});
            return;
        }
        hac hacVar = this.c;
        if (hacVar != null) {
            hacVar.onStage(str, map);
        }
    }
}
