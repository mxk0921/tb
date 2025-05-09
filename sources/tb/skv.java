package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class skv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String c = skv.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public int f28119a = 0;
    public final HashMap<String, String> b;

    static {
        t2o.a(779092910);
    }

    public skv(cba cbaVar) {
        if (cbaVar != null) {
            this.b = cbaVar.Z();
        } else {
            this.b = new HashMap<>();
        }
    }

    public final String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("619ce96c", new Object[]{this, new Integer(i)});
        }
        if (i == 0) {
            return "STATE_INIT";
        }
        if (i == 1) {
            return "STATE_ON_WILL_APPEAR";
        }
        if (i != 2) {
            return "";
        }
        return "STATE_ON_DID_APPEAR";
    }

    public final void g(ux9 ux9Var, String str, int i, String str2, int i2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9152760d", new Object[]{this, ux9Var, str, new Integer(i), str2, new Integer(i2), str3});
            return;
        }
        String str4 = c;
        x5t.h(str4, "reportError curState" + a(i2) + " opportunity = " + str3 + " liveContextKey = " + str2 + " hash = " + i);
        HashMap hashMap = new HashMap();
        hashMap.put("liveId", str);
        hashMap.put("curState", a(i2));
        hashMap.put("opportunity", str3);
        hashMap.put("isNewTrigger", "true");
        rbu.K(ux9Var, "LifeCycleMistake", hashMap);
    }

    public void b(ux9 ux9Var, String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20fd28f9", new Object[]{this, ux9Var, str, new Integer(i), str2});
            return;
        }
        String str3 = c;
        x5t.h(str3, "onDestroy liveContextKey = " + str2 + " hash = " + i);
        this.f28119a = 0;
        this.b.remove(str2);
    }

    public void e(ux9 ux9Var, String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6894b02e", new Object[]{this, ux9Var, str, new Integer(i), str2});
            return;
        }
        String str3 = c;
        x5t.h(str3, "onWillAppear liveContextKey = " + str2 + " hash = " + i);
        int i2 = this.f28119a;
        if (i2 == 0) {
            this.f28119a = 1;
            this.b.put(str2, "onWillAppear");
            return;
        }
        g(ux9Var, str, i, str2, i2, "onWillAppear");
        this.f28119a = 1;
    }

    public void c(ux9 ux9Var, String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36c9f97f", new Object[]{this, ux9Var, str, new Integer(i), str2});
            return;
        }
        String str3 = c;
        x5t.h(str3, "onDidAppear liveContextKey = " + str2 + " hash = " + i);
        int i2 = this.f28119a;
        if (i2 == 1) {
            this.f28119a = 2;
            this.b.put(str2, "onDidAppear");
            return;
        }
        g(ux9Var, str, i, str2, i2, "onDidAppear");
        this.f28119a = 2;
    }

    public void d(ux9 ux9Var, String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("225fbdb1", new Object[]{this, ux9Var, str, new Integer(i), str2});
            return;
        }
        String str3 = c;
        x5t.h(str3, "onDidDisAppear liveContextKey = " + str2 + " hash = " + i);
        int i2 = this.f28119a;
        if (i2 == 2) {
            this.f28119a = 0;
            this.b.remove(str2);
            return;
        }
        g(ux9Var, str, i, str2, i2, "onDidDisappear");
        this.f28119a = 0;
    }

    public void f(ux9 ux9Var, String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7760d4a2", new Object[]{this, ux9Var, str, new Integer(i), str2});
            return;
        }
        String str3 = c;
        x5t.h(str3, "onWillDisAppear liveContextKey = " + str2 + " hash = " + i);
        int i2 = this.f28119a;
        if (i2 == 1) {
            this.f28119a = 0;
            this.b.remove(str2);
            return;
        }
        g(ux9Var, str, i, str2, i2, "onWillDisappear");
        this.f28119a = 0;
    }
}
