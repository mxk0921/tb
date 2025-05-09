package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXScrollerLayout;
import com.taobao.android.dinamicx.widget.DXSliderLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.c;
import com.taobao.android.dinamicx.widget.d;
import com.taobao.android.dinamicx.widget.f;
import com.taobao.android.dinamicx.widget.g;
import com.taobao.android.dinamicx.widget.h;
import com.taobao.android.dinamicx.widget.i;
import com.taobao.android.dinamicx.widget.k;
import com.taobao.android.dinamicx.widget.q;
import com.taobao.android.dinamicx.widget.r;
import tb.di6;
import tb.ef5;
import tb.he5;
import tb.je5;
import tb.my5;
import tb.rl6;
import tb.s4z;
import tb.u26;
import tb.wd5;
import tb.xd5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class gy5 implements kxb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final lxb b;
    public final lxb c;
    public final qub d;
    public final qub e;
    public final qub f;
    public final qub g;
    public final qub h;
    public final qub i;
    public final qub j;
    public final qub k;
    public final qub l;
    public final qub m;
    public final qub n;
    public final qub o;
    public final qub p;
    public final qub q;
    public final qub r;
    public final qub s;
    public final qub t;
    public final qub x;

    /* renamed from: a  reason: collision with root package name */
    public kxb f20310a = null;
    public final qub u = new r.a(new k56());
    public final qub v = new r.a(new m56());
    public final qub w = new rl6.a(new h56());
    public final qub y = new s4z.a(new n56());

    static {
        t2o.a(444596497);
        t2o.a(444596623);
    }

    public gy5() {
        me5 me5Var = new me5();
        le5 le5Var = new le5();
        this.d = new sn6(new DXWidgetNode.c(), le5Var);
        this.e = new sn6(new he5.a(), me5Var);
        this.f = new sn6(new wd5.a(), me5Var);
        this.g = new sn6(new q.b(), le5Var);
        this.h = new sn6(new je5.a(), me5Var);
        this.i = new sn6(new g.b(), le5Var);
        this.j = new sn6(new f.d(), me5Var);
        this.k = new sn6(new f.d(), me5Var);
        this.l = new sn6(new d.c(), le5Var);
        this.m = new sn6(new xd5.a(), me5Var);
        this.n = new sn6(new my5.a(), me5Var);
        this.o = new sn6(new di6.d(), le5Var);
        this.p = new sn6(new ef5.e(), le5Var);
        this.q = new sn6(new h.a(), me5Var);
        this.r = new sn6(new k.a(), me5Var);
        this.s = new sn6(new u26.a(), me5Var);
        this.t = new sn6(new c.a(), me5Var);
        this.x = new sn6(new i.a(), me5Var);
    }

    @Override // tb.kxb
    public qub get(long j) {
        qub qubVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qub) ipChange.ipc$dispatch("a3667fbc", new Object[]{this, new Long(j)});
        }
        kxb kxbVar = this.f20310a;
        if (kxbVar != null && (qubVar = kxbVar.get(j)) != null) {
            return qubVar;
        }
        if (j == 29525406863L) {
            return this.d;
        }
        if (j == p38.DXTEXTVIEW_TEXTVIEW) {
            return this.h;
        }
        if (j == 6637736565700605658L) {
            return this.m;
        }
        if (j == 8095935013984139892L) {
            return this.q;
        }
        if (j == 5971992526290704869L) {
            return this.r;
        }
        if (j == -7401881896881775333L) {
            return this.t;
        }
        if (j == i.DX_GRID_LAYOUT) {
            return this.x;
        }
        if (j == DXScrollerLayout.DX_SCROLLER_LAYOUT) {
            return this.u;
        }
        if (j == -3496644918488563383L) {
            return this.i;
        }
        if (j == DXSliderLayout.DX_SLIDER_LAYOUT) {
            return this.v;
        }
        if (j == 7821310614898040L) {
            return this.e;
        }
        if (j == -7675176749284896753L) {
            return this.f;
        }
        if (j == 4596163952226405054L) {
            return this.g;
        }
        if (j == 7700670404894374791L) {
            return this.j;
        }
        if (j == 8840950490744612256L) {
            return this.k;
        }
        if (j == d.DX_WIDGET_ANIMATEDVIEW) {
            return this.l;
        }
        if (j == my5.DXGRIDITEM_GRIDITEM) {
            return this.n;
        }
        if (j == di6.DXTEXTINPUTVIEW_TEXTINPUTVIEW) {
            return this.o;
        }
        if (j == ef5.DXCALENDARVIEW_CALENDARVIEW) {
            return this.p;
        }
        if (j == -2672413305820574652L) {
            return this.y;
        }
        if (j == 2372426597927978788L) {
            return this.s;
        }
        if (j == yb6.DX_SCROLLER_INDICATOR) {
            return this.w;
        }
        return null;
    }
}
