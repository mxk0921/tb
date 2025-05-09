package tb;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.ViewCompat;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.result.ScrollInterceptView;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class l1k implements hnd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f23053a;
    public ScrollInterceptView b;
    public int d;
    public int e;
    public int f;
    public boolean h;
    public boolean i;
    public boolean j;
    public float k;
    public float l;
    public ScrollInterceptView.a m;
    public ScrollInterceptView.b n;
    public int o;
    public c8m p;
    public boolean q;
    public boolean s;
    public u1a<? super Boolean, ? super Boolean, xhv> w;
    public d1a<xhv> x;
    public d1a<xhv> y;
    public g1a<? super MotionEvent, xhv> z;
    public int c = 300;
    public int g = -1;
    public int r = -1;
    public final Map<Integer, Float[]> t = kotlin.collections.a.k(jpu.a(0, new Float[]{Float.valueOf(0.3f), Float.valueOf(0.8f)}), jpu.a(1, new Float[]{Float.valueOf(0.1f), Float.valueOf(0.9f)}), jpu.a(2, new Float[]{Float.valueOf(0.4f), Float.valueOf(0.7f)}));
    public int u;
    public Float[] v = l(this.u);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements hpk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ hpk f23054a;
        public final /* synthetic */ l1k b;
        public final /* synthetic */ boolean c;

        public a(hpk hpkVar, l1k l1kVar, boolean z) {
            this.f23054a = hpkVar;
            this.b = l1kVar;
            this.c = z;
        }

        @Override // tb.hpk
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8d104132", new Object[]{this});
                return;
            }
            hpk hpkVar = this.f23054a;
            if (hpkVar != null) {
                hpkVar.a();
            }
            l1k.a(this.b);
        }

        @Override // tb.hpk
        public void b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6d24ee9f", new Object[]{this, new Integer(i)});
                return;
            }
            hpk hpkVar = this.f23054a;
            if (hpkVar != null) {
                hpkVar.b(i);
            }
            View b = l1k.b(this.b);
            if (b != null) {
                l1k.c(this.b, b, i, this.c);
            }
        }
    }

    static {
        t2o.a(481297440);
        t2o.a(481297438);
    }

    public l1k() {
        m1k.a();
    }

    public static final /* synthetic */ void a(l1k l1kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0bd394e", new Object[]{l1kVar});
        } else {
            l1kVar.e();
        }
    }

    public static final /* synthetic */ View b(l1k l1kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("b4471762", new Object[]{l1kVar});
        }
        return l1kVar.i();
    }

    public static final /* synthetic */ void c(l1k l1kVar, View view, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39b6cd6d", new Object[]{l1kVar, view, new Integer(i), new Boolean(z)});
        } else {
            l1kVar.r(view, i, z);
        }
    }

    public void A(ScrollInterceptView.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af23016b", new Object[]{this, aVar});
            return;
        }
        ckf.g(aVar, "provider");
        this.m = aVar;
    }

    public void B(ScrollInterceptView scrollInterceptView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17812284", new Object[]{this, scrollInterceptView});
            return;
        }
        ckf.g(scrollInterceptView, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        this.b = scrollInterceptView;
        Context context = scrollInterceptView.getContext();
        ckf.f(context, "parent.context");
        this.f23053a = context;
    }

    public void C(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10dedd9c", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }

    public void D(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2f8bd86", new Object[]{this, new Integer(i)});
        } else {
            this.f = i;
        }
    }

    public void E(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40501005", new Object[]{this, new Boolean(z)});
        } else {
            this.q = z;
        }
    }

    public void F(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b976b8e7", new Object[]{this, new Integer(i)});
        } else {
            this.e = i;
        }
    }

    public void G(ScrollInterceptView.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb7034b", new Object[]{this, bVar});
            return;
        }
        ckf.g(bVar, "callback");
        this.n = bVar;
    }

    public void H(d1a<xhv> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d86422c2", new Object[]{this, d1aVar});
        } else {
            this.y = d1aVar;
        }
    }

    public void I(u1a<? super Boolean, ? super Boolean, xhv> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("833403ce", new Object[]{this, u1aVar});
        } else {
            this.w = u1aVar;
        }
    }

    public void J(d1a<xhv> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b978b02b", new Object[]{this, d1aVar});
        } else {
            this.x = d1aVar;
        }
    }

    public void K(g1a<? super MotionEvent, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e527663e", new Object[]{this, g1aVar});
        } else {
            this.z = g1aVar;
        }
    }

    public void L(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35fae15", new Object[]{this, new Integer(i)});
            return;
        }
        if (i < 0) {
            i = 0;
        }
        this.d = i;
    }

    public void d(int i) {
        ScrollInterceptView.b bVar;
        ScrollInterceptView.b bVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a45e63c0", new Object[]{this, new Integer(i)});
            return;
        }
        if (!(this.g == -1 || i != -1 || (bVar2 = this.n) == null)) {
            bVar2.a();
        }
        int i2 = this.g;
        this.g = i;
        if (i != i2 && (bVar = this.n) != null) {
            bVar.l(i2, i);
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62eb3981", new Object[]{this});
            return;
        }
        int i = this.e;
        if (i == this.d) {
            d(3);
        } else if (i == m()) {
            d(0);
        } else {
            d(4);
        }
    }

    public final int f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1102cca5", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i > m()) {
            return m();
        }
        int i2 = this.d;
        if (i < i2) {
            return i2;
        }
        return i;
    }

    public void g(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bb68bd1", new Object[]{this, motionEvent});
            return;
        }
        ckf.g(motionEvent, "ev");
        g1a<? super MotionEvent, xhv> g1aVar = this.z;
        if (g1aVar != null) {
            g1aVar.invoke(motionEvent);
        }
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ba15e42", new Object[]{this});
        } else if (this.o == 0) {
            Context context = this.f23053a;
            if (context != null) {
                this.o = ViewConfiguration.get(context).getScaledTouchSlop();
            } else {
                ckf.y("context");
                throw null;
            }
        }
    }

    public void j(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1d6fd18", new Object[]{this, new Integer(i)});
        } else {
            k(i, 300L, true, null);
        }
    }

    public final void k(int i, long j, boolean z, hpk hpkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d7e9936", new Object[]{this, new Integer(i), new Long(j), new Boolean(z), hpkVar});
            return;
        }
        c8m c8mVar = this.p;
        if (c8mVar != null) {
            c8mVar.e();
        }
        d(2);
        c8m c8mVar2 = new c8m(this.e, i, j);
        this.p = c8mVar2;
        c8mVar2.f(new a(hpkVar, this, z));
        c8m c8mVar3 = this.p;
        if (c8mVar3 != null) {
            c8mVar3.g();
        }
    }

    public final Float[] l(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Float[]) ipChange.ipc$dispatch("d5a18b92", new Object[]{this, new Integer(i)});
        }
        if (i == 1) {
            Float[] fArr = this.t.get(1);
            ckf.d(fArr);
            return fArr;
        } else if (i != 2) {
            Float[] fArr2 = this.t.get(0);
            ckf.d(fArr2);
            return fArr2;
        } else {
            Float[] fArr3 = this.t.get(2);
            ckf.d(fArr3);
            return fArr3;
        }
    }

    public int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ba889ec6", new Object[]{this})).intValue();
        }
        ScrollInterceptView scrollInterceptView = this.b;
        if (scrollInterceptView != null) {
            return scrollInterceptView.getHeight() - this.c;
        }
        ckf.y(com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        throw null;
    }

    public int n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c7531f83", new Object[]{this})).intValue();
        }
        return this.e;
    }

    public int o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("830709d5", new Object[]{this})).intValue();
        }
        return this.g;
    }

    public final boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25fbc59f", new Object[]{this})).booleanValue();
        }
        ScrollInterceptView.a aVar = this.m;
        if (aVar == null) {
            return false;
        }
        return aVar.a();
    }

    public boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36ef4cb7", new Object[]{this})).booleanValue();
        }
        if (this.e == this.d) {
            return true;
        }
        return false;
    }

    public final void r(View view, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2272e31a", new Object[]{this, view, new Integer(i), new Boolean(z)});
            return;
        }
        int i2 = this.e;
        if (z) {
            this.e = f(i + i2);
        } else {
            this.e = i + i2;
        }
        ViewCompat.offsetTopAndBottom(view, this.e - i2);
        ScrollInterceptView.b bVar = this.n;
        if (bVar != null) {
            int i3 = this.e;
            int m = m();
            ScrollInterceptView scrollInterceptView = this.b;
            if (scrollInterceptView != null) {
                bVar.s(i2, i3, m, scrollInterceptView.getHeight());
            } else {
                ckf.y(com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
                throw null;
            }
        }
        ScrollInterceptView scrollInterceptView2 = this.b;
        if (scrollInterceptView2 != null) {
            scrollInterceptView2.notifyScrollChange();
        } else {
            ckf.y(com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
            throw null;
        }
    }

    public void s(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cbc121e", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        if (z) {
            i = f(i);
        }
        View i2 = i();
        if (i2 != null) {
            ViewCompat.offsetTopAndBottom(i2, this.e - i);
        }
        ScrollInterceptView.b bVar = this.n;
        if (bVar != null) {
            int i3 = this.e;
            int m = m();
            ScrollInterceptView scrollInterceptView = this.b;
            if (scrollInterceptView != null) {
                bVar.s(i3, i, m, scrollInterceptView.getHeight());
            } else {
                ckf.y(com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
                throw null;
            }
        }
        ScrollInterceptView scrollInterceptView2 = this.b;
        if (scrollInterceptView2 != null) {
            scrollInterceptView2.notifyScrollChange();
            this.e = i;
            return;
        }
        ckf.y(com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        throw null;
    }

    public void t(float f, long j, hpk hpkVar) {
        long j2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69163639", new Object[]{this, new Float(f), new Long(j), hpkVar});
            return;
        }
        int m = m();
        int i = this.d;
        int i2 = m - i;
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (j <= 0) {
            j2 = 0;
        } else {
            if (j > 1000) {
                j = 450;
            }
            j2 = j;
        }
        k((int) ((i2 * f) + i), j2, false, hpkVar);
    }

    public final void u(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74c14ebd", new Object[]{this, new Boolean(z)});
        } else if (!z) {
            d1a<xhv> d1aVar = this.y;
            if (d1aVar != null) {
                d1aVar.invoke();
            }
            e();
        } else {
            if (this.l - this.k >= 0.0f) {
                if (this.e < this.v[1].floatValue() * m()) {
                    u1a<? super Boolean, ? super Boolean, xhv> u1aVar = this.w;
                    if (u1aVar != null) {
                        Boolean bool = Boolean.TRUE;
                        u1aVar.invoke(bool, bool);
                    } else {
                        j(this.d);
                    }
                } else {
                    u1a<? super Boolean, ? super Boolean, xhv> u1aVar2 = this.w;
                    if (u1aVar2 != null) {
                        u1aVar2.invoke(Boolean.FALSE, Boolean.TRUE);
                    } else {
                        j(m());
                    }
                }
            } else if (this.e < this.v[0].floatValue() * m()) {
                u1a<? super Boolean, ? super Boolean, xhv> u1aVar3 = this.w;
                if (u1aVar3 != null) {
                    u1aVar3.invoke(Boolean.TRUE, Boolean.FALSE);
                } else {
                    j(this.d);
                }
            } else {
                u1a<? super Boolean, ? super Boolean, xhv> u1aVar4 = this.w;
                if (u1aVar4 != null) {
                    Boolean bool2 = Boolean.FALSE;
                    u1aVar4.invoke(bool2, bool2);
                } else {
                    j(m());
                }
            }
            y();
        }
    }

    public final boolean v(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("75bc5bf1", new Object[]{this, motionEvent})).booleanValue();
        }
        if (motionEvent.getY() >= this.e) {
            return true;
        }
        return false;
    }

    public boolean w(MotionEvent motionEvent) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        ckf.g(motionEvent, "ev");
        if (this.g == -1 || !v(motionEvent)) {
            return false;
        }
        c8m c8mVar = this.p;
        if (c8mVar != null && c8mVar.d()) {
            return true;
        }
        if (motionEvent.getAction() == 0) {
            this.h = false;
            if (motionEvent.getY() < this.f + this.e) {
                z = true;
            } else {
                z = false;
            }
            this.j = z;
        }
        if (this.h) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.i = p();
            this.h = false;
            this.l = motionEvent.getY();
            this.k = motionEvent.getY();
            return false;
        } else if (action != 2) {
            return false;
        } else {
            h();
            float y = motionEvent.getY() - this.k;
            if (this.g != 3) {
                if (Math.abs(y) < this.o) {
                    return false;
                }
                this.h = true;
                return true;
            } else if ((!this.i && !this.j) || Math.abs(y) < this.o) {
                return false;
            } else {
                this.k = motionEvent.getY();
                if (y < 0.0f) {
                    this.i = false;
                    return false;
                }
                this.h = true;
                return true;
            }
        }
    }

    public boolean x(MotionEvent motionEvent) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        ckf.g(motionEvent, "ev");
        boolean v = v(motionEvent);
        if (this.q || this.g == -1) {
            return false;
        }
        c8m c8mVar = this.p;
        if (c8mVar != null && c8mVar.d()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                u(v);
                return true;
            } else if (action != 2) {
                if (action == 3) {
                    u(v);
                    return true;
                }
            } else if (v) {
                if (this.r == -1) {
                    this.r = this.e;
                }
                h();
                d(1);
                float y = motionEvent.getY() - this.k;
                if (!this.s) {
                    if (Math.abs(y) >= this.o) {
                        z = true;
                    }
                    this.s = z;
                }
                if (!this.s) {
                    return true;
                }
                d1a<xhv> d1aVar = this.x;
                if (d1aVar != null) {
                    d1aVar.invoke();
                }
                this.k = motionEvent.getY();
                View i = i();
                if (i != null) {
                    r(i, (int) y, true);
                }
            } else if (this.y != null) {
                return true;
            } else {
                return false;
            }
        } else if (v) {
            this.r = this.e;
            this.k = motionEvent.getY();
            this.l = motionEvent.getY();
            d(1);
        } else if (this.y != null) {
            return true;
        } else {
            return false;
        }
        return true;
    }

    public final void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.r = -1;
        this.k = 0.0f;
        this.l = 0.0f;
        this.s = false;
    }

    public void z(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa41dd5f", new Object[]{this, new Integer(i)});
            return;
        }
        this.u = i;
        this.v = l(i);
    }

    public final View i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("12208855", new Object[]{this});
        }
        ScrollInterceptView scrollInterceptView = this.b;
        if (scrollInterceptView != null) {
            return scrollInterceptView.getChildAt(0);
        }
        ckf.y(com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        throw null;
    }
}
