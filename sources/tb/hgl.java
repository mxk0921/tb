package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.avplayer.r;
import tb.mer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class hgl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final FluidContext f20628a;
    public final prp b;

    static {
        t2o.a(468714048);
        t2o.a(468714045);
    }

    public hgl(prp prpVar) {
        this.f20628a = prpVar.U();
        this.b = prpVar;
        f();
    }

    public atb a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (atb) ipChange.ipc$dispatch("26b6f08b", new Object[]{this});
        }
        ir9.b("OutsideContinuedPlayManager", "createInstance");
        r e = e();
        e.V(mfj.u(this.b.U()));
        mer.b bVar = new mer.b((Activity) this.b.R());
        mfj.b(bVar, this.f20628a);
        bVar.d(this.f20628a.getInstanceConfig().getPlayScenes());
        return bVar.c(e);
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70c6308e", new Object[]{this})).booleanValue();
        }
        r e = e();
        boolean c = c();
        if (e == null || !c) {
            return false;
        }
        return true;
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0fc11ed", new Object[]{this})).booleanValue();
        }
        return ogi.e().b(d());
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe2dfd1b", new Object[]{this});
        }
        return this.b.U().getInstanceConfig().getPreCoverKey();
    }

    public r e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r) ipChange.ipc$dispatch("8dda9aaa", new Object[]{this});
        }
        return ogi.e().i(d());
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9344b335", new Object[]{this});
        }
    }
}
