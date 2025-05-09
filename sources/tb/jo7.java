package tb;

import android.content.Context;
import com.alibaba.android.ultron.vfw.core.ViewEngine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.exception.DinamicException;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.s;
import tb.z7v;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class jo7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ViewEngine f22109a;
    public s b = null;

    static {
        t2o.a(157286623);
    }

    public jo7(ViewEngine viewEngine) {
        this.f22109a = viewEngine;
        c();
    }

    public static jo7 a(ViewEngine viewEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jo7) ipChange.ipc$dispatch("ca9ec8b0", new Object[]{viewEngine});
        }
        if (viewEngine != null) {
            return new jo7(viewEngine);
        }
        throw new IllegalArgumentException("params viewEngine can not be null");
    }

    public s b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s) ipChange.ipc$dispatch("f1c7912b", new Object[]{this});
        }
        return this.b;
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else if (this.b == null) {
            z7v P = this.f22109a.P();
            if (P != null) {
                s d = P.d();
                this.b = d;
                if (d != null) {
                    d(this.f22109a.K(), P, this.b);
                    hav.d(this.f22109a.I(), "命中DinamicXEngineRouter预加载");
                    return;
                }
            }
            DXEngineConfig.b b = P != null ? P.b() : null;
            if (b == null) {
                b = new DXEngineConfig.b(this.f22109a.W());
            }
            this.b = new s(b.g0(this.f22109a.p0()).Q(2).X(this.f22109a.S()).Y(this.f22109a.T()).V(this.f22109a.m0()).R(this.f22109a.l0()).F());
            d(this.f22109a.K(), P, this.b);
        }
    }

    public final void d(Context context, z7v z7vVar, s sVar) {
        z7v.c a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa8d3d55", new Object[]{this, context, z7vVar, sVar});
        } else if (z7vVar != null && (a2 = z7vVar.a()) != null) {
            a2.b(context, sVar);
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        s sVar = this.b;
        if (sVar != null && sVar.k() != null) {
            this.b.k().q0();
        }
    }

    public void f(long j, ob5 ob5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3889c53c", new Object[]{this, new Long(j), ob5Var});
        } else {
            this.b.s(j, ob5Var);
        }
    }

    public void g(String str, bv bvVar) throws DinamicException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2865b421", new Object[]{this, str, bvVar});
        } else {
            this.b.C(str, bvVar);
        }
    }
}
