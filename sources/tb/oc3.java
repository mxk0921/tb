package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class oc3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Activity f25296a;
    public String b;
    public plq c;
    public String d;
    public boolean e;
    public boolean f;

    static {
        t2o.a(479199635);
    }

    public final Activity a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("616f3928", new Object[]{this});
        }
        Activity activity = this.f25296a;
        if (activity != null) {
            return activity;
        }
        ckf.y("context");
        throw null;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5c7a1011", new Object[]{this});
        }
        String str = this.d;
        if (str != null) {
            return str;
        }
        ckf.y("engineInstanceId");
        throw null;
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a2a855c", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2b8f1723", new Object[]{this});
        }
        String str = this.b;
        if (str != null) {
            return str;
        }
        ckf.y("popId");
        throw null;
    }

    public final plq e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (plq) ipChange.ipc$dispatch("fc180a65", new Object[]{this});
        }
        plq plqVar = this.c;
        if (plqVar != null) {
            return plqVar;
        }
        ckf.y("stdPopPanel");
        throw null;
    }

    public final boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3c33646", new Object[]{this})).booleanValue();
        }
        return this.f;
    }

    public final void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c9f4391", new Object[]{this, new Boolean(z)});
        }
    }

    public final void h(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b038d46", new Object[]{this, activity});
            return;
        }
        ckf.g(activity, "<set-?>");
        this.f25296a = activity;
    }

    public final void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f0a8085", new Object[]{this, str});
            return;
        }
        ckf.g(str, "<set-?>");
        this.d = str;
    }

    public final void j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6bce4f0", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    public final void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f32c631b", new Object[]{this, str});
            return;
        }
        ckf.g(str, "<set-?>");
        this.b = str;
    }

    public final void l(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6940e00a", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    public final void m(plq plqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92f239d3", new Object[]{this, plqVar});
            return;
        }
        ckf.g(plqVar, "<set-?>");
        this.c = plqVar;
    }
}
