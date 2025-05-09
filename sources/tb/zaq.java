package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import tb.tz8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class zaq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final zaq DEFAULT = new zaq();
    public static final boolean c;

    /* renamed from: a  reason: collision with root package name */
    public oz8 f32656a;
    public long b;

    static {
        try {
            uqq uqqVar = oz8.ERROR_CODE;
            c = true;
        } catch (Throwable unused) {
            c = false;
        }
    }

    public static zaq e(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zaq) ipChange.ipc$dispatch("86db4f64", new Object[]{str, new Long(j)});
        }
        if (!c || TextUtils.isEmpty(str)) {
            return DEFAULT;
        }
        tz8 tz8Var = FalcoGlobalTracer.get();
        if (tz8Var == null) {
            return DEFAULT;
        }
        tz8.a d = tz8Var.d(str, "Apm");
        d.g(j);
        vy8 c2 = d.c();
        zaq zaqVar = new zaq();
        zaqVar.f(c2);
        return zaqVar;
    }

    public zaq a(long j) {
        oz8 oz8Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zaq) ipChange.ipc$dispatch("bee5d1d3", new Object[]{this, new Long(j)});
        }
        if (c && (oz8Var = this.f32656a) != null) {
            oz8Var.H(j);
        }
        return this;
    }

    public long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("490f0b94", new Object[]{this})).longValue();
        }
        return this.b;
    }

    public zaq c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zaq) ipChange.ipc$dispatch("59e5c3fe", new Object[]{this, str});
        }
        return d(str, System.currentTimeMillis());
    }

    public zaq d(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zaq) ipChange.ipc$dispatch("fec2ebd8", new Object[]{this, str, new Long(j)});
        }
        if (!c || this.f32656a == null || TextUtils.isEmpty(str)) {
            return DEFAULT;
        }
        tz8 tz8Var = FalcoGlobalTracer.get();
        if (tz8Var == null) {
            return DEFAULT;
        }
        tz8.a d = tz8Var.d(str, "Apm");
        d.g(j);
        d.f(this.f32656a);
        vy8 c2 = d.c();
        zaq zaqVar = new zaq();
        zaqVar.f(c2);
        zaqVar.b = j;
        return zaqVar;
    }

    public final void f(oz8 oz8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4da32c6", new Object[]{this, oz8Var});
        } else {
            this.f32656a = oz8Var;
        }
    }
}
