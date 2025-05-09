package tb;

import android.app.Activity;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.meta.structure.list.MetaListWidget;
import com.taobao.android.searchbaseframe.business.common.list.BaseListView;
import com.taobao.android.searchbaseframe.xsl.refact.XslChildPageWidget;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class box extends bsi {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final lsi<Boolean> n0;
    public final lsi<Boolean> r0;
    public final lsi<ynx> o0 = new lsi<>(null);
    public final lsi<Integer> p0 = new lsi<>(0, false);
    public final lsi<Integer> q0 = new lsi<>(0, false);
    public final lsi<Integer> s0 = new lsi<>(0, false);
    public final lsi<Integer> t0 = new lsi<>(0, false);
    public final lsi<Integer> u0 = new lsi<>(0, false);
    public final lsi<Integer> v0 = new lsi<>(0, false);
    public final lsi<Integer> w0 = new lsi<>(0, false);
    public final lsi<lox> x0 = new lsi<>(null);
    public final lsi<Boolean> y0 = new lsi<>(Boolean.FALSE, false);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class e implements lcc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.lcc
        public boolean a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ea80cb71", new Object[]{this, str})).booleanValue();
            }
            return true;
        }
    }

    static {
        t2o.a(993002077);
    }

    public box() {
        Boolean bool = Boolean.TRUE;
        this.n0 = new lsi<>(bool, false);
        this.r0 = new lsi<>(bool, false);
        Y0(true);
        V0(true);
        X0(new ay4() { // from class: tb.rtz
            @Override // tb.ay4
            public final Object a(Object obj) {
                BaseListView.a y1;
                y1 = box.y1((Void) obj);
                return y1;
            }
        });
        t0(new ay4() { // from class: tb.stz
            @Override // tb.ay4
            public final Object a(Object obj) {
                XslChildPageWidget z1;
                z1 = box.z1(box.this, (x02) obj);
                return z1;
            }
        });
        H0(new ay4() { // from class: tb.ttz
            @Override // tb.ay4
            public final Object a(Object obj) {
                iox A1;
                A1 = box.A1((bsi) obj);
                return A1;
            }
        });
        P0(false);
        G0(new ay4() { // from class: tb.utz
            @Override // tb.ay4
            public final Object a(Object obj) {
                hox B1;
                B1 = box.B1((MetaListWidget) obj);
                return B1;
            }
        });
        B0(new e());
        D0(true);
    }

    public static final iox A1(bsi bsiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iox) ipChange.ipc$dispatch("4ed27a87", new Object[]{bsiVar});
        }
        ckf.d(bsiVar);
        return new iox(bsiVar);
    }

    public static final hox B1(MetaListWidget metaListWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hox) ipChange.ipc$dispatch("ad224dbe", new Object[]{metaListWidget});
        }
        ckf.d(metaListWidget);
        return new hox(metaListWidget);
    }

    public static /* synthetic */ Object ipc$super(box boxVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/xsl/refact/XslConfig");
    }

    public static final BaseListView.a y1(Void r4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseListView.a) ipChange.ipc$dispatch("7ca8c2ae", new Object[]{r4});
        }
        return new kox();
    }

    public static final XslChildPageWidget z1(box boxVar, x02 x02Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (XslChildPageWidget) ipChange.ipc$dispatch("8e400db7", new Object[]{boxVar, x02Var});
        }
        ckf.g(boxVar, "this$0");
        Activity activity = x02Var.f31046a;
        ckf.f(activity, "activity");
        ude udeVar = x02Var.b;
        ckf.f(udeVar, a.MSG_SOURCE_PARENT);
        acx<com.taobao.android.meta.data.a<asi, MetaResult<asi>>> K = boxVar.K(x02Var);
        ckf.e(K, "null cannot be cast to non-null type com.taobao.android.searchbaseframe.business.srp.widget.WidgetModelAdapter<com.taobao.android.searchbaseframe.xsl.refact.XslDataSource>");
        return new XslChildPageWidget(activity, udeVar, K, x02Var.d, x02Var.e);
    }

    public final lsi<ynx> f1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lsi) ipChange.ipc$dispatch("17035d34", new Object[]{this});
        }
        return this.o0;
    }

    public final lsi<Boolean> g1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lsi) ipChange.ipc$dispatch("39a5e9b7", new Object[]{this});
        }
        return this.n0;
    }

    public final lsi<Integer> h1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lsi) ipChange.ipc$dispatch("9dceecb5", new Object[]{this});
        }
        return this.v0;
    }

    public final lsi<Integer> i1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lsi) ipChange.ipc$dispatch("951bb72b", new Object[]{this});
        }
        return this.u0;
    }

    public final lsi<Boolean> j1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lsi) ipChange.ipc$dispatch("1c084549", new Object[]{this});
        }
        return this.r0;
    }

    public final lsi<lox> k1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lsi) ipChange.ipc$dispatch("e6263196", new Object[]{this});
        }
        return this.x0;
    }

    public final lsi<Integer> l1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lsi) ipChange.ipc$dispatch("5dec0493", new Object[]{this});
        }
        return this.w0;
    }

    public final lsi<Integer> m1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lsi) ipChange.ipc$dispatch("536be506", new Object[]{this});
        }
        return this.q0;
    }

    public final lsi<Integer> n1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lsi) ipChange.ipc$dispatch("c0af3b46", new Object[]{this});
        }
        return this.p0;
    }

    public final lsi<Integer> o1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lsi) ipChange.ipc$dispatch("b141460d", new Object[]{this});
        }
        return this.t0;
    }

    public final lsi<Integer> p1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lsi) ipChange.ipc$dispatch("8d2f9cd3", new Object[]{this});
        }
        return this.s0;
    }

    public final lsi<Boolean> q1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lsi) ipChange.ipc$dispatch("ea829dda", new Object[]{this});
        }
        return this.y0;
    }
}
