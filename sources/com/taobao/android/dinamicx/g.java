package com.taobao.android.dinamicx;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.model.DXLongSparseArray;
import com.taobao.android.dinamicx.monitor.DXTraceUtil;
import com.taobao.android.dinamicx.view.DXNativeFrameLayout;
import com.taobao.android.dinamicx.view.DXNativeLinearLayout;
import com.taobao.android.dinamicx.view.DXNativeTextView;
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
import com.taobao.android.dinamicx.widget.r;
import com.taobao.android.dinamicx.widget.s;
import com.taobao.android.dinamicx.widget.t;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.ai5;
import tb.ak5;
import tb.at5;
import tb.awb;
import tb.bi6;
import tb.bk5;
import tb.bn5;
import tb.bt5;
import tb.ci5;
import tb.ck5;
import tb.cn5;
import tb.co5;
import tb.ct5;
import tb.cx5;
import tb.di5;
import tb.di6;
import tb.dk5;
import tb.do5;
import tb.dp5;
import tb.dt5;
import tb.e36;
import tb.eb5;
import tb.eb6;
import tb.ef5;
import tb.ei5;
import tb.ei6;
import tb.ek5;
import tb.en5;
import tb.eo5;
import tb.eq5;
import tb.evb;
import tb.fh5;
import tb.fk5;
import tb.fl5;
import tb.fo5;
import tb.fwb;
import tb.fy5;
import tb.gb6;
import tb.gi5;
import tb.gi6;
import tb.gk5;
import tb.gq5;
import tb.gy5;
import tb.h56;
import tb.hc5;
import tb.hdb;
import tb.hn5;
import tb.hp5;
import tb.hub;
import tb.hvb;
import tb.hy5;
import tb.i36;
import tb.ic5;
import tb.il5;
import tb.ip5;
import tb.ixb;
import tb.jd5;
import tb.jhy;
import tb.ji5;
import tb.jj5;
import tb.jk5;
import tb.jo5;
import tb.jt5;
import tb.jv5;
import tb.k56;
import tb.kc6;
import tb.kj5;
import tb.kk5;
import tb.kl5;
import tb.kwb;
import tb.ky5;
import tb.l76;
import tb.li5;
import tb.lk5;
import tb.lsl;
import tb.lv5;
import tb.ly5;
import tb.m56;
import tb.md6;
import tb.mf6;
import tb.mk5;
import tb.mub;
import tb.mv5;
import tb.mvb;
import tb.my5;
import tb.n56;
import tb.nk5;
import tb.nl5;
import tb.ny5;
import tb.ob6;
import tb.oj5;
import tb.oo5;
import tb.owb;
import tb.p26;
import tb.p38;
import tb.pd6;
import tb.pj5;
import tb.pq5;
import tb.ps5;
import tb.pwb;
import tb.qj5;
import tb.ql5;
import tb.qo5;
import tb.qub;
import tb.rj5;
import tb.rk5;
import tb.rl5;
import tb.rl6;
import tb.rn5;
import tb.ro5;
import tb.rw5;
import tb.s4z;
import tb.sl5;
import tb.so5;
import tb.sq5;
import tb.st5;
import tb.t26;
import tb.t2o;
import tb.tm5;
import tb.tn5;
import tb.to5;
import tb.tq5;
import tb.ts5;
import tb.u26;
import tb.um5;
import tb.un5;
import tb.uq5;
import tb.us5;
import tb.vn5;
import tb.vo5;
import tb.vq5;
import tb.vt5;
import tb.wh5;
import tb.wm5;
import tb.wn5;
import tb.wp5;
import tb.wq5;
import tb.ws5;
import tb.xg5;
import tb.xh5;
import tb.xk5;
import tb.xp5;
import tb.xq5;
import tb.xs5;
import tb.xv5;
import tb.y06;
import tb.y16;
import tb.yb6;
import tb.yo5;
import tb.ys5;
import tb.ywb;
import tb.zb6;
import tb.zg5;
import tb.zh5;
import tb.zj5;
import tb.zs5;
import tb.zub;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final ky5 f7313a = new ky5();
    public static final ly5 b = new ly5();
    public static final hy5 c = new hy5();
    public static final gy5 d = new gy5();
    public static final DXLongSparseArray<evb> e;
    public static final DXLongSparseArray<mvb> f;
    public static final DXLongSparseArray<qub> g;
    public static final DXLongSparseArray<qub> h;
    public static hvb i;
    public static s j;
    public static pwb k;
    public static fwb l;
    public static hub m;
    public static IDXHardwareInterface n;
    public static s o;
    public static zub p;
    public static t q;
    public static mub r;
    public static owb s;
    public static ywb t;
    public static IDXApmManager u;
    public static kwb v;
    public static ixb w;
    public static final Map<String, hdb> x;
    public static awb y;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                DXTraceUtil.b("DXSDKCore#ThreadNodeOpt#run");
                DXTraceUtil.b("DXSDKCore#ThreadNodeOpt#R文件");
                new DXWidgetNode();
                DXTraceUtil.c();
                new h();
                new k();
                new DXSwitchWidgetNode();
                new gi6();
                new com.taobao.android.dinamicx.widget.g();
                new u26();
                new DXImageWidgetNode();
                new d();
                new DXNativeTextView(DinamicXEngine.x());
                new DXNativeFrameLayout(DinamicXEngine.x());
                new DXNativeLinearLayout(DinamicXEngine.x());
                new DXScrollerLayout();
                new DXSliderLayout();
            } catch (Throwable th) {
                try {
                    f fVar = new f("dinamicx");
                    f.a aVar = new f.a("Engine", "Engine_InitEnv", f.DXERROR_ENGINE_CREATE_VIEW_IN_GLOBAL_CENTER);
                    aVar.e = xv5.a(th);
                    fVar.c.add(aVar);
                    ic5.p(fVar);
                } catch (Throwable unused) {
                }
            }
            DXTraceUtil.c();
        }
    }

    static {
        t2o.a(444596498);
        DXLongSparseArray<evb> dXLongSparseArray = new DXLongSparseArray<>(150);
        e = dXLongSparseArray;
        DXLongSparseArray<mvb> dXLongSparseArray2 = new DXLongSparseArray<>(10);
        f = dXLongSparseArray2;
        DXLongSparseArray<qub> dXLongSparseArray3 = new DXLongSparseArray<>(50);
        g = dXLongSparseArray3;
        DXLongSparseArray<qub> dXLongSparseArray4 = new DXLongSparseArray<>(50);
        h = dXLongSparseArray4;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        x = concurrentHashMap;
        DXTraceUtil.b("DXSDKCore#ThreadNodeOpt");
        new Thread(null, new a(), "DXGlobalCenter").start();
        DXTraceUtil.c();
        try {
            if (eb5.E()) {
                concurrentHashMap.put("DXLog", new i36());
            } else {
                DXTraceUtil.b("DXSDKCore#mapInit");
                dXLongSparseArray.put(33556442494L, new rw5());
                dXLongSparseArray.put(l76.DX_PARSER_PARENTSUBDATA, new l76());
                dXLongSparseArray.put(17177078638764L, new fh5());
                dXLongSparseArray.put(5326177973899923051L, new md6());
                dXLongSparseArray.put(4390557269728183382L, new p26());
                dXLongSparseArray.put(t26.DX_PARSER_LISTDATA, new t26());
                dXLongSparseArray.put(jv5.DX_PARSER_EVENTCHAINDATA, new jv5());
                dXLongSparseArray.put(lv5.DX_PARSER_EVENTCHAINEVENTDATA, new lv5());
                dXLongSparseArray.put(gb6.DX_PARSER_ROOTDATA, new gb6());
                dXLongSparseArray.put(-8601334994478314885L, new xk5());
                dXLongSparseArray.put(-7155988592997126393L, new rk5());
                dXLongSparseArray.put(pd6.DX_PARSER_SUBDATAINDEX, new pd6());
                dXLongSparseArray.put(-1464634009013122078L, new ps5());
                dXLongSparseArray.put(wh5.DX_PARSER_ABILITYHUB, new wh5());
                dXLongSparseArray.put(dk5.DX_PARSER_DXEVENTPROP, new dk5());
                dXLongSparseArray.put(ob6.DX_PARSER_SCREEN, new ob6());
                dXLongSparseArray.put(10152737943856105L, new uq5());
                dXLongSparseArray.put(2104823241333621454L, new tq5());
                dXLongSparseArray.put(-2766900241128002095L, new vq5());
                dXLongSparseArray.put(8985048662794750L, new sq5());
                dXLongSparseArray.put(38192572096L, new ct5());
                dXLongSparseArray.put(6473685290962691181L, new pq5());
                dXLongSparseArray.put(5399508804610334190L, new st5());
                dXLongSparseArray.put(8474741157368783341L, new mk5());
                dXLongSparseArray.put(522748242L, new tn5());
                dXLongSparseArray.put(17466137112765L, new fk5());
                dXLongSparseArray.put(516230118L, new ci5());
                dXLongSparseArray.put(803695L, new vo5());
                dXLongSparseArray.put(523960308L, new qo5());
                dXLongSparseArray.put(10224770040602390L, new dt5());
                dXLongSparseArray.put(bi6.DXTEMPLATE_IF, new tm5());
                dXLongSparseArray.put(33857357437L, new ek5());
                dXLongSparseArray.put(2311459087270464967L, new ji5());
                dXLongSparseArray.put(6743940140328071192L, new li5());
                dXLongSparseArray.put(2043810233379508043L, new nk5());
                dXLongSparseArray.put(-1423751599996947415L, new jk5());
                dXLongSparseArray.put(-3695355688016560275L, new gi5());
                dXLongSparseArray.put(3521945216952772436L, new um5());
                dXLongSparseArray.put(7193167627824317654L, new wm5());
                dXLongSparseArray.put(18043027130931L, new hn5());
                dXLongSparseArray.put(5581002430686265197L, new dp5());
                dXLongSparseArray.put(pj5.DX_PARSER_DX_ENV, new pj5());
                dXLongSparseArray.put(ai5.DX_PARSER_ADD, new ai5());
                dXLongSparseArray.put(wq5.DX_PARSER_SUB, new wq5());
                dXLongSparseArray.put(oo5.DX_PARSER_MUL, new oo5());
                dXLongSparseArray.put(zj5.DX_PARSER_DIV, new zj5());
                dXLongSparseArray.put(jo5.DX_PARSER_MOD, new jo5());
                dXLongSparseArray.put(rl5.DX_PARSER_GREATER, new rl5());
                dXLongSparseArray.put(sl5.DX_PARSER_GREATEREQUAL, new sl5());
                dXLongSparseArray.put(un5.DX_PARSER_LESS, new un5());
                dXLongSparseArray.put(vn5.DX_PARSER_LESSEQUAL, new vn5());
                dXLongSparseArray.put(ro5.DX_PARSER_NOTEQUAL, new ro5());
                dXLongSparseArray.put(us5.DX_PARSER_TODOUBLE, new us5());
                dXLongSparseArray.put(zs5.DX_PARSER_TOLONG, new zs5());
                dXLongSparseArray.put(at5.DX_PARSER_TOSTR, new at5());
                dXLongSparseArray.put(jj5.DX_PARSER_CEIL, new jj5());
                dXLongSparseArray.put(kk5.DX_PARSER_FLOOR, new kk5());
                dXLongSparseArray.put(eq5.DX_PARSER_ROUND, new eq5());
                dXLongSparseArray.put(yo5.DX_DATA_PARSER_ORANGE, new yo5());
                dXLongSparseArray.put(xh5.DX_PARSER_ABS, new xh5());
                dXLongSparseArray.put(wn5.DX_PARSER_LINEAR_GRADIENT, new wn5());
                dXLongSparseArray.put(ts5.DX_PARSER_TOBINDINGXUNIT, new ts5());
                dXLongSparseArray.put(co5.DX_PARSER_MAX, new co5());
                dXLongSparseArray.put(fo5.DX_PARSER_MIN, new fo5());
                dXLongSparseArray.put(ql5.DX_PARSER_GETVISIBLERECT, new ql5());
                dXLongSparseArray.put(bn5.DX_PARSER_ISDARKMODE, new bn5());
                dXLongSparseArray.put(kj5.DX_PARSER_COLORMAP, new kj5());
                dXLongSparseArray.put(rj5.DX_PARSER_DATAPARSERNOTFOUND, new rj5());
                dXLongSparseArray.put(gk5.DX_PARSER_EVENTHANDLERNOTFOUND, new gk5());
                dXLongSparseArray.put(jhy.DX_PARSER_WIDGETNOTFOUND, new jhy());
                dXLongSparseArray.put(qj5.DX_PARSER_DXVERSION_GREATERTHANOREQUALTO, new qj5());
                dXLongSparseArray.put(xp5.DX_PARSER_RECYCLERDATAINDEX, new xp5());
                dXLongSparseArray.put(fl5.DX_PARSER_GETRECYCLERSTATEDATASOURCE, new fl5());
                dXLongSparseArray.put(6742876832553239298L, new ei5());
                dXLongSparseArray.put(wp5.DX_DATA_PARSER_RECYCLER_CURRENT_POSITION, new wp5());
                dXLongSparseArray.put(ip5.DX_PARSER_QUERYRECYCLERCELLINDEXBYUSERID, new ip5());
                dXLongSparseArray.put(xq5.DX_PARSER_SUB_ARRAY, new xq5());
                dXLongSparseArray.put(lk5.DX_PARSER_SIZEBYFACTOR, new lk5());
                dXLongSparseArray.put(cn5.DX_PARSER_ISELDER, new cn5());
                dXLongSparseArray.put(oj5.DX_PARSER_CONTAINSSTR, new oj5());
                dXLongSparseArray.put(ak5.DX_PARSER_DXAB, new ak5());
                dXLongSparseArray.put(rn5.DX_PARSER_KV, new rn5());
                dXLongSparseArray.put(eo5.DX_PARSER_MERGEOBJ, new eo5());
                dXLongSparseArray.put(kl5.DX_PARSER_GETTEMPLATEINFO, new kl5());
                dXLongSparseArray.put(ck5.DX_PARSER_DXDEVICELEVEL, new ck5());
                dXLongSparseArray.put(-7801350391660369312L, new vt5());
                dXLongSparseArray.put(fy5.DX_PARSER_GETWIDGETPROPERTYVALUE, new fy5());
                dXLongSparseArray.put(bk5.DX_PARSER_DXDEFAULTSCALE, new bk5());
                dXLongSparseArray.put(hp5.DX_PARSER_PX, new hp5());
                dXLongSparseArray.put(di5.DX_PARSER_APTONP, new di5());
                dXLongSparseArray.put(to5.DX_PARSER_NPTOAP, new to5());
                dXLongSparseArray.put(so5.DX_PARSER_NP, new so5());
                dXLongSparseArray.put(ys5.DX_PARSER_TOJSONSTRING, new ys5());
                dXLongSparseArray.put(xs5.DX_PARSER_TOJSONOBJECT, new xs5());
                dXLongSparseArray.put(ws5.DX_PARSER_TOJSONARRAY, new ws5());
                dXLongSparseArray.put(jt5.DX_PARSER_TTID, new jt5());
                dXLongSparseArray.put(en5.DX_PARSER_ISGP, new en5());
                dXLongSparseArray.put(e36.DX_PARSER_LOCALIZEDTEXT, new e36());
                dXLongSparseArray.put(hc5.DX_PARSER_APPLOCALIZEDTEXT, new hc5());
                dXLongSparseArray.put(lsl.DX_PARSER_ISLANGUAGE, new lsl());
                dXLongSparseArray.put(zh5.DX_PARSER_ADAPTIVESCREENCONFIG, new zh5());
                dXLongSparseArray.put(gq5.DX_PARSER_SCREENINFO, new gq5());
                dXLongSparseArray.put(do5.DX_PARSER_MEGAABILITYHUB, new do5());
                dXLongSparseArray.put(nl5.DX_PARSER_GETVARIABLE, new nl5());
                dXLongSparseArray.put(il5.DX_PARSER_GET_SUB_VARIABLE, new il5());
                dXLongSparseArray.put(bt5.DX_PARSER_TRANSFORMEDDESIGNTOKEN, new bt5());
                dXLongSparseArray3.put(29525406863L, new DXWidgetNode.c());
                dXLongSparseArray3.put(7821310614898040L, new DXSwitchWidgetNode.a());
                dXLongSparseArray3.put(-7675176749284896753L, new DXCheckBoxWidgetNode.a());
                dXLongSparseArray3.put(4596163952226405054L, new q.b());
                dXLongSparseArray3.put(p38.DXTEXTVIEW_TEXTVIEW, new gi6.b());
                dXLongSparseArray3.put(-3496644918488563383L, new g.b());
                dXLongSparseArray3.put(7700670404894374791L, new DXImageWidgetNode.e());
                dXLongSparseArray3.put(8840950490744612256L, new DXImageWidgetNode.e());
                dXLongSparseArray3.put(d.DX_WIDGET_ANIMATEDVIEW, new d.c());
                dXLongSparseArray3.put(6637736565700605658L, new cx5.a());
                dXLongSparseArray3.put(my5.DXGRIDITEM_GRIDITEM, new my5.a());
                dXLongSparseArray3.put(p.DXTABHEADERLAYOUT_TABHEADERLAYOUT, new p.d());
                dXLongSparseArray3.put(mf6.DXTABITEM_TABITEM, new mf6.a());
                dXLongSparseArray3.put(di6.DXTEXTINPUTVIEW_TEXTINPUTVIEW, new di6.d());
                dXLongSparseArray3.put(ef5.DXCALENDARVIEW_CALENDARVIEW, new ef5.e());
                dXLongSparseArray3.put(zb6.DXSECTIONLAYOUT_SECTIONLAYOUT, new zb6.a());
                dXLongSparseArray3.put(8095935013984139892L, new h.a());
                dXLongSparseArray3.put(5971992526290704869L, new k.a());
                dXLongSparseArray3.put(2372426597927978788L, new u26.a());
                dXLongSparseArray3.put(-7401881896881775333L, new c.a());
                dXLongSparseArray3.put(DXScrollerLayout.DX_SCROLLER_LAYOUT, new DXScrollerLayout.a());
                dXLongSparseArray3.put(DXRecyclerLayout.DXRECYCLERLAYOUT_RECYCLERLAYOUT, new DXRecyclerLayout.k());
                dXLongSparseArray3.put(DXViewPager.DXVIEWPAGER_VIEWPAGER, new DXViewPager.d());
                dXLongSparseArray3.put(-2672413305820574652L, new bi6.a());
                dXLongSparseArray3.put(DXSliderLayout.DX_SLIDER_LAYOUT, new DXSliderLayout.i());
                dXLongSparseArray3.put(n.DX_PAGE_INDICATOR, new n.a());
                dXLongSparseArray3.put(yb6.DX_SCROLLER_INDICATOR, new yb6.a());
                dXLongSparseArray3.put(i.DX_GRID_LAYOUT, new i.a());
                dXLongSparseArray3.put(eb6.DXRICHTEXT_RICHTEXT, new eb6.d());
                dXLongSparseArray3.put(ei6.DXTEXTSPAN_TEXTSPAN, new ei6.e());
                dXLongSparseArray3.put(y06.DXIMAGESPAN_IMAGESPAN, new y06.f());
                dXLongSparseArray3.put(ny5.DXGROUPSPAN_GROUPSPAN, new ny5.a());
                dXLongSparseArray3.put(4861660327064501257L, new xg5.a());
                dXLongSparseArray4.put(DXScrollerLayout.DX_SCROLLER_LAYOUT, new r.a(new k56()));
                dXLongSparseArray4.put(DXSliderLayout.DX_SLIDER_LAYOUT, new r.a(new m56()));
                dXLongSparseArray4.put(yb6.DX_SCROLLER_INDICATOR, new rl6.a(new h56()));
                dXLongSparseArray4.put(-2672413305820574652L, new s4z.a(new n56()));
                dXLongSparseArray2.put(jd5.DX_EVENT_BINDINGX, new jd5());
                dXLongSparseArray2.put(mv5.DX_EVENT_EVENTCHAIN, new mv5());
                dXLongSparseArray2.put(kc6.DX_EVENT_SHOWDXPREVIEWURL, new kc6());
                dXLongSparseArray2.put(y16.DX_KT_EVENT_EVENTCHAIN, new y16());
                DXTraceUtil.c();
                concurrentHashMap.put("DXLog", new i36());
            }
        } catch (Throwable th) {
            try {
                f fVar = new f("dinamicx");
                f.a aVar = new f.a("Engine", "Engine_InitEnv", f.DXERROR_ENGINE_CREATE_VIEW_IN_GLOBAL_CENTER_MAP);
                aVar.e = xv5.a(th);
                ((ArrayList) fVar.c).add(aVar);
                ic5.p(fVar);
            } catch (Throwable unused) {
            }
        }
    }

    public static hub a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hub) ipChange.ipc$dispatch("307dbd73", new Object[0]);
        }
        return m;
    }

    public static IDXApmManager b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDXApmManager) ipChange.ipc$dispatch("da7a1c78", new Object[0]);
        }
        return u;
    }

    public static zub c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zub) ipChange.ipc$dispatch("e526de31", new Object[0]);
        }
        return p;
    }

    public static hvb d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hvb) ipChange.ipc$dispatch("693aa6ca", new Object[0]);
        }
        return i;
    }

    public static IDXHardwareInterface e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDXHardwareInterface) ipChange.ipc$dispatch("db13e270", new Object[0]);
        }
        return n;
    }

    public static owb f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (owb) ipChange.ipc$dispatch("4e8db193", new Object[0]);
        }
        return s;
    }

    public static pwb g(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pwb) ipChange.ipc$dispatch("70b98170", new Object[]{dXRuntimeContext});
        }
        if (l == null || !zg5.x4()) {
            return k;
        }
        return l;
    }

    public static s h(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s) ipChange.ipc$dispatch("a3908e04", new Object[]{dXRuntimeContext});
        }
        if (!zg5.v5(dXRuntimeContext)) {
            return j;
        }
        s sVar = o;
        if (sVar != null) {
            return sVar;
        }
        return j;
    }

    public static t i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t) ipChange.ipc$dispatch("8340922d", new Object[0]);
        }
        return q;
    }

    public static DXLongSparseArray<qub> j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXLongSparseArray) ipChange.ipc$dispatch("fcf5f4a5", new Object[0]);
        }
        return h;
    }

    public static DXLongSparseArray<mvb> k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXLongSparseArray) ipChange.ipc$dispatch("8a119b1b", new Object[0]);
        }
        return f;
    }

    public static hy5 l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hy5) ipChange.ipc$dispatch("6385538d", new Object[0]);
        }
        return c;
    }

    public static DXLongSparseArray<evb> m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXLongSparseArray) ipChange.ipc$dispatch("546b362c", new Object[0]);
        }
        return e;
    }

    public static ky5 n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ky5) ipChange.ipc$dispatch("abd1b69", new Object[0]);
        }
        return f7313a;
    }

    public static awb o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (awb) ipChange.ipc$dispatch("d92a4f56", new Object[0]);
        }
        return y;
    }

    public static mub p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mub) ipChange.ipc$dispatch("560c467d", new Object[0]);
        }
        return r;
    }

    public static kwb q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kwb) ipChange.ipc$dispatch("4728f3b5", new Object[0]);
        }
        return v;
    }

    public static ixb r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ixb) ipChange.ipc$dispatch("403062b9", new Object[0]);
        }
        return w;
    }

    public static ywb s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ywb) ipChange.ipc$dispatch("133db808", new Object[0]);
        }
        return t;
    }

    public static void t(ywb ywbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86b5a56e", new Object[]{ywbVar});
        } else {
            t = ywbVar;
        }
    }
}
