package tb;

import android.app.Activity;
import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class xi3 extends sgg implements jqk {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int l = jrt.a(vu3.b.GEO_NOT_SUPPORT);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements xgq<String, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(xi3 xi3Var) {
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

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements xgq<String, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(xi3 xi3Var) {
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

    public xi3(vh4 vh4Var) {
        super(vh4Var);
    }

    public static /* synthetic */ Object ipc$super(xi3 xi3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/schedulers/ChannelScheduler");
    }

    @Override // tb.sgg
    public n35<String, Void> B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n35) ipChange.ipc$dispatch("de4e5542", new Object[]{this});
        }
        int i = l;
        return new n35<>(k35.a(wzi.LAUNCHER, i, i, 5), this.c);
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
            return;
        }
        q35<String, Void> H = H("c-a");
        this.b.x(v35.f(H));
        P(H, new a(this));
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
        q35<String, Void> H = H("c-create");
        this.b.g(v35.f(H));
        P(H, new b(this));
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

    @Override // tb.sgg
    public jqk y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jqk) ipChange.ipc$dispatch("5a18ef58", new Object[]{this});
        }
        return this;
    }
}
