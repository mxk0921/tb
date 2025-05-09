package tb;

import android.app.Activity;
import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import tb.i35;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class rsu extends sgg implements jqk, i35.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements xgq<String, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(rsu rsuVar) {
        }

        @Override // tb.xgq
        public void a(q35<String, Void> q35Var, fn8 fn8Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fda77ec5", new Object[]{this, q35Var, fn8Var});
            } else {
                cn8.a(LauncherRuntime.g, q35Var, fn8Var);
            }
        }
    }

    public rsu(vh4 vh4Var) {
        super(vh4Var);
    }

    public static /* synthetic */ Object ipc$super(rsu rsuVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/schedulers/UCScheduler");
    }

    @Override // tb.sgg
    public n35<String, Void> B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n35) ipChange.ipc$dispatch("de4e5542", new Object[]{this});
        }
        int a2 = jrt.a(vu3.b.GEO_NOT_SUPPORT);
        return new n35<>(k35.b(wzi.LAUNCHER, a2, a2, 5, this));
    }

    @Override // tb.sgg
    public n35<String, Void> D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n35) ipChange.ipc$dispatch("bd24f637", new Object[]{this});
        }
        return null;
    }

    @Override // tb.sgg
    public void Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4532f39e", new Object[]{this});
        }
    }

    @Override // tb.jqk
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9512450", new Object[]{this});
        }
    }

    @Override // tb.jqk
    public void c(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7633f59", new Object[]{this, activity});
        }
    }

    @Override // tb.jqk
    public void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a4f161b", new Object[]{this, context});
        }
    }

    @Override // tb.jqk
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13d26d4d", new Object[]{this});
        }
    }

    @Override // tb.jqk
    public void h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77c71dda", new Object[]{this, context});
            return;
        }
        q35<String, Void> H = H("u-a");
        this.b.l(v35.f(H));
        P(H, new a(this));
    }

    @Override // tb.jqk
    public void j(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5839169b", new Object[]{this, activity});
        }
    }

    @Override // tb.jqk
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d226240a", new Object[]{this});
        }
    }

    @Override // tb.jqk
    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("979dd451", new Object[]{this});
        }
    }

    @Override // tb.jqk
    public void s(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2f5e321", new Object[]{this, activity});
        }
    }

    @Override // tb.jqk
    public void u(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4593a2c6", new Object[]{this, activity});
        }
    }

    @Override // tb.i35.a
    public boolean v(j35 j35Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("54f22aac", new Object[]{this, j35Var})).booleanValue();
        }
        return false;
    }

    @Override // tb.sgg
    public jqk y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jqk) ipChange.ipc$dispatch("5a18ef58", new Object[]{this});
        }
        return this;
    }
}
