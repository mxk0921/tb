package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXCheckBoxWidgetNode;
import com.taobao.android.dinamicx.widget.DXImageWidgetNode;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.dinamicx.widget.DXScrollerLayout;
import com.taobao.android.dinamicx.widget.DXSliderLayout;
import com.taobao.android.dinamicx.widget.DXSwitchWidgetNode;
import com.taobao.android.dinamicx.widget.DXViewPager;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.c;
import com.taobao.android.dinamicx.widget.d;
import com.taobao.android.dinamicx.widget.g;
import com.taobao.android.dinamicx.widget.h;
import com.taobao.android.dinamicx.widget.i;
import com.taobao.android.dinamicx.widget.k;
import com.taobao.android.dinamicx.widget.n;
import com.taobao.android.dinamicx.widget.p;
import com.taobao.android.dinamicx.widget.q;
import tb.bi6;
import tb.cx5;
import tb.di6;
import tb.eb6;
import tb.ef5;
import tb.ei6;
import tb.gi6;
import tb.mf6;
import tb.my5;
import tb.ny5;
import tb.u26;
import tb.xg5;
import tb.y06;
import tb.yb6;
import tb.zb6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ly5 implements kxb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final qub f23636a = new DXWidgetNode.c();
    public final qub b = new DXSwitchWidgetNode.a();
    public final qub c = new DXCheckBoxWidgetNode.a();
    public final qub d = new q.b();
    public final qub e = new gi6.b();
    public final qub f = new g.b();
    public final qub g = new DXImageWidgetNode.e();
    public final qub h = new DXImageWidgetNode.e();
    public final qub i = new d.c();
    public final qub j = new cx5.a();
    public final qub k = new my5.a();
    public final qub l = new p.d();
    public final qub m = new mf6.a();
    public final qub n = new di6.d();
    public final qub o = new ef5.e();
    public final qub p = new zb6.a();
    public final qub q = new h.a();
    public final qub r = new k.a();
    public final qub s = new u26.a();
    public final qub t = new c.a();
    public final qub u = new DXScrollerLayout.a();
    public final qub v = new DXRecyclerLayout.k();
    public final qub w = new DXViewPager.d();
    public final qub x = new bi6.a();
    public final qub y = new DXSliderLayout.i();
    public final qub z = new n.a();
    public final qub A = new yb6.a();
    public final qub B = new i.a();
    public final qub C = new eb6.d();
    public final qub D = new ei6.e();
    public final qub E = new y06.f();
    public final qub F = new ny5.a();
    public final qub G = new xg5.a();
    public kxb H = null;

    static {
        t2o.a(444596508);
        t2o.a(444596623);
    }

    @Override // tb.kxb
    public qub get(long j) {
        qub qubVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qub) ipChange.ipc$dispatch("a3667fbc", new Object[]{this, new Long(j)});
        }
        kxb kxbVar = this.H;
        if (kxbVar != null && (qubVar = kxbVar.get(j)) != null) {
            return qubVar;
        }
        if (j == 29525406863L) {
            return this.f23636a;
        }
        if (j == p38.DXTEXTVIEW_TEXTVIEW) {
            return this.e;
        }
        if (j == 6637736565700605658L) {
            return this.j;
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
            return this.B;
        }
        if (j == DXScrollerLayout.DX_SCROLLER_LAYOUT) {
            return this.u;
        }
        if (j == -3496644918488563383L) {
            return this.f;
        }
        if (j == DXSliderLayout.DX_SLIDER_LAYOUT) {
            return this.y;
        }
        if (j == 7821310614898040L) {
            return this.b;
        }
        if (j == -7675176749284896753L) {
            return this.c;
        }
        if (j == 4596163952226405054L) {
            return this.d;
        }
        if (j == 7700670404894374791L) {
            return this.g;
        }
        if (j == 8840950490744612256L) {
            return this.h;
        }
        if (j == d.DX_WIDGET_ANIMATEDVIEW) {
            return this.i;
        }
        if (j == my5.DXGRIDITEM_GRIDITEM) {
            return this.k;
        }
        if (j == p.DXTABHEADERLAYOUT_TABHEADERLAYOUT) {
            return this.l;
        }
        if (j == mf6.DXTABITEM_TABITEM) {
            return this.m;
        }
        if (j == di6.DXTEXTINPUTVIEW_TEXTINPUTVIEW) {
            return this.n;
        }
        if (j == ef5.DXCALENDARVIEW_CALENDARVIEW) {
            return this.o;
        }
        if (j == zb6.DXSECTIONLAYOUT_SECTIONLAYOUT) {
            return this.p;
        }
        if (j == 2372426597927978788L) {
            return this.s;
        }
        if (j == DXRecyclerLayout.DXRECYCLERLAYOUT_RECYCLERLAYOUT) {
            return this.v;
        }
        if (j == DXViewPager.DXVIEWPAGER_VIEWPAGER) {
            return this.w;
        }
        if (j == -2672413305820574652L) {
            return this.x;
        }
        if (j == n.DX_PAGE_INDICATOR) {
            return this.z;
        }
        if (j == yb6.DX_SCROLLER_INDICATOR) {
            return this.A;
        }
        if (j == eb6.DXRICHTEXT_RICHTEXT) {
            return this.C;
        }
        if (j == ei6.DXTEXTSPAN_TEXTSPAN) {
            return this.D;
        }
        if (j == y06.DXIMAGESPAN_IMAGESPAN) {
            return this.E;
        }
        if (j == ny5.DXGROUPSPAN_GROUPSPAN) {
            return this.F;
        }
        if (j == 4861660327064501257L) {
            return this.G;
        }
        return null;
    }
}
