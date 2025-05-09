package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.datamodel.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class oep {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static int c = 0;

    /* renamed from: a  reason: collision with root package name */
    public final FluidContext f25332a;
    public final kep b = new kep();

    static {
        t2o.a(468713950);
        t2o.a(468713948);
    }

    public oep(FluidContext fluidContext) {
        this.f25332a = fluidContext;
    }

    public static int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bd44cdc8", new Object[0])).intValue();
        }
        return c;
    }

    public kep b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kep) ipChange.ipc$dispatch("bc01248d", new Object[]{this});
        }
        return this.b;
    }

    public void c(a aVar, boolean z) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b856550", new Object[]{this, aVar, new Boolean(z)});
            return;
        }
        a.d e = aVar.e();
        String str = e.c;
        if (str != null) {
            this.b.c(str);
        }
        if (z) {
            i = c;
            c = 1 + i;
        } else {
            i = c;
        }
        e.c = String.valueOf(i);
        ir9.b("SessionManager", "incrementSessionId: " + e.c);
        this.b.d(e.c, aVar);
    }
}
