package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class cs1 extends vx {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String c;
    public opq d;
    public final kmb e;
    public final zxb f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a extends o3o {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(cs1 cs1Var, ux uxVar) {
            super(uxVar);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -573071195) {
                super.a(((Number) objArr[0]).intValue(), (MtopResponse) objArr[1], objArr[2], ((Boolean) objArr[3]).booleanValue(), (Map) objArr[4]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/data/config/bizRequest/BaseCartRequester$1");
        }

        @Override // tb.o3o, tb.ojd
        public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ddd7a0a5", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
                return;
            }
            super.a(i, mtopResponse, obj, z, map);
            mbq.a(c9x.CART_BIZ_NAME, mtopResponse);
        }
    }

    static {
        t2o.a(479199303);
    }

    public cs1(zxb zxbVar, Context context, b3o b3oVar) {
        super(zxbVar, context, b3oVar);
        this.e = zxbVar.x();
        this.f = zxbVar;
    }

    public static /* synthetic */ Object ipc$super(cs1 cs1Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/data/config/bizRequest/BaseCartRequester");
    }

    public abstract opq d(fsb fsbVar);

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91478625", new Object[]{this});
        }
        return this.c;
    }

    public abstract void g(ux uxVar, fsb fsbVar, Object obj);

    public final void h(ux uxVar, fsb fsbVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("716f4fd9", new Object[]{this, uxVar, fsbVar, obj});
            return;
        }
        this.d = d(fsbVar);
        g(new a(this, uxVar), fsbVar, obj);
        opq opqVar = this.d;
        if (opqVar != null) {
            this.c = opqVar.s();
        }
    }

    public w55 e() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w55) ipChange.ipc$dispatch("6b55904", new Object[]{this});
        }
        boolean a2 = vav.a(c9x.CART_BIZ_NAME, "useCustomHandlerForStreamRequest", true);
        w55 p = new w55(this.f30307a).l0(true).n0(true).o(this.b.f()).b(this.b.c()).z0(this.b.d()).p0(this.b.i()).j0(this.b.l()).k0(this.b.m()).v0(this.b.j()).q0(this.b.n()).a(this.b.k()).x0(this.b.o()).c(this.b.e()).v0("UNIT_TRADE").d(c9x.CART_BIZ_NAME).r0(this.b.g()).Z(false).e0(true).S(true).U(!vav.a(c9x.CART_BIZ_NAME, "ultronEnableClientOptimize", false)).p(false);
        kmb kmbVar = this.e;
        w55 n = p.n((kmbVar == null || !a2) ? null : kmbVar.L());
        if (this.f.B().f() == null) {
            z = true;
        }
        return n.c0(z);
    }
}
