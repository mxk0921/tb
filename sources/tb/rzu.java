package tb;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class rzu implements tzu {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static boolean e = true;
    public static boolean f = false;
    public static boolean g = false;
    public static final rzu h = new rzu();

    /* renamed from: a  reason: collision with root package name */
    public boolean f27703a = true;
    public boolean b = false;
    public boolean c = true;
    public boolean d = false;

    static {
        t2o.a(962593149);
        t2o.a(962593305);
    }

    public static rzu getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rzu) ipChange.ipc$dispatch("4d5e3da4", new Object[0]);
        }
        return h;
    }

    public static void setEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("183c4dc8", new Object[]{new Boolean(z)});
        } else {
            e = z;
        }
    }

    public final void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1eb8b96", new Object[]{this, map});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().send(new szu("UT", 1023, "/tracking.init.rdy", null, null, map).build());
        }
    }

    public final void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe67e5a6", new Object[]{this, context});
        } else if (e && context != null) {
            nhh.m("UTAppLaunch", "1023 sendLaunch");
            if (this.f27703a) {
                this.b = u51.l(context);
                b(context);
                this.f27703a = false;
            } else if (this.b) {
                c();
            }
        }
    }

    @Override // tb.tzu
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
        } else if (this.c) {
            this.c = false;
            d(wu3.c().b());
        }
    }

    @Override // tb.tzu
    public void onActivityDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
        }
    }

    @Override // tb.tzu
    public void onActivityPaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
        }
    }

    @Override // tb.tzu
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
        }
    }

    @Override // tb.tzu
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
        }
    }

    @Override // tb.tzu
    public void onActivityStarted(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
        } else if (this.c) {
            this.c = false;
            d(wu3.c().b());
        }
    }

    @Override // tb.tzu
    public void onActivityStopped(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
        }
    }

    @Override // tb.tzu
    public void onSwitchBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74060788", new Object[]{this});
            return;
        }
        this.c = false;
        this.d = true;
    }

    @Override // tb.tzu
    public void onSwitchForeground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcb4091d", new Object[]{this});
        } else if (!this.c && this.d) {
            d(wu3.c().b());
        }
    }

    public static void checkFirstLaunch(Context context) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a016f2a6", new Object[]{context});
        } else if (e && !f) {
            f = true;
            File databasePath = context.getDatabasePath("ut.db");
            if (databasePath == null || !databasePath.exists()) {
                z = true;
            }
            g = z;
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b98a83f", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("_is_hl", "1");
        a(hashMap);
        nhh.f("UTAppLaunch", "sendHotLaunch _is_hl", 1);
    }

    public final void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad0c5d26", new Object[]{this, context});
        } else if (context != null) {
            HashMap hashMap = new HashMap();
            if (g) {
                hashMap.put("_is_ft", "1");
            } else {
                hashMap.put("_is_ft", "0");
            }
            hashMap.put("_is_hl", "0");
            a(hashMap);
            nhh.f("UTAppLaunch", "sendAppLaunch _is_ft", Boolean.valueOf(g));
        }
    }
}
