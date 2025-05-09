package com.taobao.android.searchbaseframe.xsl.refact;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.meta.logic.BaseMetaPageController;
import com.taobao.android.meta.structure.childpage.MetaChildPageWidget;
import com.taobao.android.meta.structure.state.page.MetaPageStateWidget;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.meta.uikit.MetaLayout;
import com.taobao.android.searchbaseframe.xsl.module.XslSearchResult;
import com.taobao.android.searchbaseframe.xsl.page.uikit.XslBackgroundView;
import com.taobao.android.searchbaseframe.xsl.refact.XslPageWidget;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import tb.a07;
import tb.acx;
import tb.ay4;
import tb.box;
import tb.ckf;
import tb.cox;
import tb.d1a;
import tb.fox;
import tb.g1a;
import tb.gsi;
import tb.isi;
import tb.iuc;
import tb.jox;
import tb.juc;
import tb.k4k;
import tb.kae;
import tb.ksi;
import tb.kuc;
import tb.lox;
import tb.nde;
import tb.njg;
import tb.o02;
import tb.ouc;
import tb.phw;
import tb.qrl;
import tb.ssi;
import tb.stc;
import tb.t2o;
import tb.t48;
import tb.ude;
import tb.uee;
import tb.vfw;
import tb.x3u;
import tb.xhv;
import tb.y64;
import tb.ynx;
import tb.ytc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class XslPageWidget extends ksi<XslDataSource, y64, box, XslSearchResult> implements uee, t48 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BG_TYPE_IMAGE = "image";
    public static final String BG_TYPE_IMAGE_LOCAL = "_image_local_";
    public static final a Companion = new a(null);
    public final njg h;
    public final fox i;
    public x3u j;
    public final fox k;
    public x3u l;
    public final XslBackgroundView m;
    public final HashSet<t48> n = new HashSet<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(993002089);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(993002088);
        t2o.a(993002067);
        t2o.a(993001907);
    }

    public static /* synthetic */ Object ipc$super(XslPageWidget xslPageWidget, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -336807415) {
            return super.onCreateView();
        }
        if (hashCode == 581789757) {
            super.M2((MetaResult) objArr[0]);
            return null;
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/searchbaseframe/xsl/refact/XslPageWidget");
    }

    public static final xhv o(XslPageWidget xslPageWidget, ynx ynxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("2547a5f3", new Object[]{xslPageWidget, ynxVar});
        }
        ckf.g(xslPageWidget, "this$0");
        if (ynxVar != null) {
            if (ckf.b(ynxVar.b(), "image")) {
                xslPageWidget.m.setImageUrl(ynxVar.a());
            } else if (ckf.b(ynxVar.b(), BG_TYPE_IMAGE_LOCAL)) {
                xslPageWidget.m.setResource(ynxVar.a());
            }
        }
        return xhv.INSTANCE;
    }

    public static final xhv p(XslPageWidget xslPageWidget, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("9acb871b", new Object[]{xslPageWidget, bool});
        }
        ckf.g(xslPageWidget, "this$0");
        XslBackgroundView xslBackgroundView = xslPageWidget.m;
        ckf.d(bool);
        xslBackgroundView.setBgAnimation(bool.booleanValue());
        return xhv.INSTANCE;
    }

    public static final xhv q(XslPageWidget xslPageWidget, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("a1d4c2b4", new Object[]{xslPageWidget, num});
        }
        ckf.g(xslPageWidget, "this$0");
        ROOT_VIEW view = xslPageWidget.k.getView();
        ckf.d(view);
        ckf.d(num);
        ((LinearLayout) view).setBackgroundColor(num.intValue());
        return xhv.INSTANCE;
    }

    public static final xhv r(XslPageWidget xslPageWidget, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("4377c871", new Object[]{xslPageWidget, num});
        }
        ckf.g(xslPageWidget, "this$0");
        ROOT_VIEW view = xslPageWidget.i.getView();
        ckf.d(view);
        ckf.d(num);
        ((LinearLayout) view).setBackgroundColor(num.intValue());
        return xhv.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [android.view.View, java.lang.Object] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final tb.xhv s(com.taobao.android.searchbaseframe.xsl.refact.XslPageWidget r4, java.lang.Integer r5) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.searchbaseframe.xsl.refact.XslPageWidget.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0018
            java.lang.String r1 = "732efc72"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r4 = 1
            r2[r4] = r5
            java.lang.Object r4 = r0.ipc$dispatch(r1, r2)
            tb.xhv r4 = (tb.xhv) r4
            return r4
        L_0x0018:
            java.lang.String r0 = "this$0"
            tb.ckf.g(r4, r0)
            tb.fox r4 = r4.i
            android.view.View r4 = r4.getView()
            tb.ckf.d(r4)
            tb.ckf.d(r5)
            int r5 = r5.intValue()
            tb.znx.b(r4, r5)
            tb.xhv r4 = tb.xhv.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.searchbaseframe.xsl.refact.XslPageWidget.s(com.taobao.android.searchbaseframe.xsl.refact.XslPageWidget, java.lang.Integer):tb.xhv");
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [android.view.View, java.lang.Object] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final tb.xhv t(com.taobao.android.searchbaseframe.xsl.refact.XslPageWidget r4, java.lang.Integer r5) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.searchbaseframe.xsl.refact.XslPageWidget.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0018
            java.lang.String r1 = "a2e63073"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r4 = 1
            r2[r4] = r5
            java.lang.Object r4 = r0.ipc$dispatch(r1, r2)
            tb.xhv r4 = (tb.xhv) r4
            return r4
        L_0x0018:
            java.lang.String r0 = "this$0"
            tb.ckf.g(r4, r0)
            tb.fox r4 = r4.i
            android.view.View r4 = r4.getView()
            tb.ckf.d(r4)
            tb.ckf.d(r5)
            int r5 = r5.intValue()
            tb.znx.a(r4, r5)
            tb.xhv r4 = tb.xhv.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.searchbaseframe.xsl.refact.XslPageWidget.t(com.taobao.android.searchbaseframe.xsl.refact.XslPageWidget, java.lang.Integer):tb.xhv");
    }

    public static final gsi u(box boxVar, XslPageWidget xslPageWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gsi) ipChange.ipc$dispatch("fca47cb9", new Object[]{boxVar, xslPageWidget});
        }
        ckf.g(boxVar, "$metaConfig");
        ckf.g(xslPageWidget, "this$0");
        return new gsi(boxVar.q(), xslPageWidget);
    }

    public static final xhv v(XslPageWidget xslPageWidget, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("24c65e94", new Object[]{xslPageWidget, num});
        }
        ckf.g(xslPageWidget, "this$0");
        MetaLayout j = ((juc) xslPageWidget.t2()).j();
        ckf.d(num);
        j.setListStart(num.intValue());
        return xhv.INSTANCE;
    }

    public static final xhv w(XslPageWidget xslPageWidget, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("7adb366b", new Object[]{xslPageWidget, bool});
        }
        ckf.g(xslPageWidget, "this$0");
        MetaPageStateWidget K2 = xslPageWidget.K2();
        if (K2 != null) {
            K2.L(ckf.b(bool, Boolean.TRUE));
        }
        return xhv.INSTANCE;
    }

    public static final ay4 x(XslPageWidget xslPageWidget, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ay4) ipChange.ipc$dispatch("5dfee5ff", new Object[]{xslPageWidget, str});
        }
        ckf.g(xslPageWidget, "this$0");
        ckf.g(str, AdvanceSetting.NETWORK_TYPE);
        return xslPageWidget.J2().M();
    }

    public static final ay4 y(XslPageWidget xslPageWidget, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ay4) ipChange.ipc$dispatch("7b01140", new Object[]{xslPageWidget, str});
        }
        ckf.g(xslPageWidget, "this$0");
        ckf.g(str, AdvanceSetting.NETWORK_TYPE);
        return xslPageWidget.J2().o0();
    }

    public static final ssi z(JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ssi) ipChange.ipc$dispatch("1e0e0a2a", new Object[]{jSONObject, new Integer(i)});
        }
        if (jSONObject == null) {
            return null;
        }
        jox joxVar = new jox(jSONObject);
        return new ssi(joxVar.a(), joxVar.e(), joxVar.b(), joxVar.c(), 0, true, false);
    }

    @Override // tb.uee
    public void A0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f9a70f3", new Object[]{this, new Boolean(z)});
        } else {
            J2().U().g(Boolean.valueOf(!z));
        }
    }

    @Override // tb.uee
    public void A1(final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b41269b", new Object[]{this, jSONObject});
        } else {
            J2().h0().g(new ouc() { // from class: tb.xtz
                @Override // tb.ouc
                public final ssi a(int i) {
                    ssi z;
                    z = XslPageWidget.z(JSONObject.this, i);
                    return z;
                }
            });
        }
    }

    @Override // tb.uee
    public boolean E(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("28bd52ef", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (F2(i) != null) {
            return true;
        }
        return false;
    }

    @Override // tb.uee
    public void I1(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6660468", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        J2().i1().g(Integer.valueOf(i));
        J2().h1().g(Integer.valueOf(i2));
    }

    @Override // tb.ksi
    public void M2(MetaResult<y64> metaResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22ad683d", new Object[]{this, metaResult});
            return;
        }
        ckf.g(metaResult, "result");
        super.M2(metaResult);
        XslSearchResult xslSearchResult = (XslSearchResult) metaResult;
        e3().f();
        fox foxVar = this.i;
        ArrayList<isi> arrayList = xslSearchResult.topHeaders;
        ckf.f(arrayList, "topHeaders");
        h3(foxVar, arrayList);
        fox foxVar2 = this.k;
        ArrayList<isi> arrayList2 = xslSearchResult.tabHeaders;
        ckf.f(arrayList2, "tabHeaders");
        h3(foxVar2, arrayList2);
        e3().a();
    }

    @Override // tb.uee
    public void N1(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ed2874f", new Object[]{this, new Integer(i)});
        } else {
            ((juc) t2()).j().setListStart(i);
        }
    }

    @Override // tb.uee
    public void O0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc407cbd", new Object[]{this, new Integer(i)});
        } else {
            J2().d0().g(Integer.valueOf(i));
        }
    }

    @Override // tb.uee
    public void Q1(t48 t48Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("909d47c5", new Object[]{this, t48Var});
        } else if (t48Var != null) {
            this.n.add(t48Var);
        }
    }

    @Override // tb.uee
    public boolean T0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("98aef25b", new Object[]{this})).booleanValue();
        }
        BaseMetaPageController<XslDataSource, y64, XslSearchResult> G2 = G2();
        ckf.e(G2, "null cannot be cast to non-null type com.taobao.android.searchbaseframe.xsl.refact.XslController");
        return ((cox) G2).S();
    }

    @Override // tb.uee
    public void T1(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40057825", new Object[]{this, new Integer(i)});
        } else {
            J2().i().g(Integer.valueOf(i));
        }
    }

    @Override // tb.uee
    public void U0(int i) {
        XslChildPageWidget xslChildPageWidget;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b040e9dc", new Object[]{this, new Integer(i)});
            return;
        }
        MetaChildPageWidget F2 = F2(i);
        if (F2 instanceof XslChildPageWidget) {
            xslChildPageWidget = (XslChildPageWidget) F2;
        } else {
            xslChildPageWidget = null;
        }
        if (xslChildPageWidget != null) {
            xslChildPageWidget.v3();
        }
    }

    @Override // tb.uee
    public void U1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab18c9ef", new Object[]{this, str});
        } else {
            J2().u().g(Integer.valueOf(qrl.b(str, 0)));
        }
    }

    @Override // tb.uee
    public void X1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75cb3ab7", new Object[]{this, new Boolean(z)});
        } else {
            J2().j1().g(Boolean.valueOf(!z));
        }
    }

    @Override // tb.uee
    public void Z1(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a7a5499", new Object[]{this, new Integer(i)});
        } else {
            J2().z().g(Integer.valueOf(i));
        }
    }

    public final void Z2(FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f994039", new Object[]{this, frameLayout});
            return;
        }
        J2().f1().d(new g1a() { // from class: tb.ytz
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv o;
                o = XslPageWidget.o(XslPageWidget.this, (ynx) obj);
                return o;
            }
        });
        J2().g1().d(new g1a() { // from class: tb.ztz
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv p;
                p = XslPageWidget.p(XslPageWidget.this, (Boolean) obj);
                return p;
            }
        });
        frameLayout.addView(this.m, 0, new ViewGroup.LayoutParams(-1, -1));
    }

    public final x3u a3(fox foxVar, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3u) ipChange.ipc$dispatch("5af01a3", new Object[]{this, foxVar, new Boolean(z), str});
        }
        foxVar.ensureView();
        x3u x3uVar = new x3u(foxVar);
        x3uVar.r(z);
        x3uVar.t(str);
        ((juc) t2()).h(x3uVar);
        return x3uVar;
    }

    public final void b3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9a4a961", new Object[]{this});
        } else {
            J2().m1().d(new g1a() { // from class: tb.fuz
                @Override // tb.g1a
                public final Object invoke(Object obj) {
                    xhv q;
                    q = XslPageWidget.q(XslPageWidget.this, (Integer) obj);
                    return q;
                }
            });
        }
    }

    public final void c3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("399e9b21", new Object[]{this});
            return;
        }
        J2().n1().d(new g1a() { // from class: tb.guz
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv r;
                r = XslPageWidget.r(XslPageWidget.this, (Integer) obj);
                return r;
            }
        });
        J2().p1().d(new g1a() { // from class: tb.huz
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv s;
                s = XslPageWidget.s(XslPageWidget.this, (Integer) obj);
                return s;
            }
        });
        J2().o1().d(new g1a() { // from class: tb.iuz
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv t;
                t = XslPageWidget.t(XslPageWidget.this, (Integer) obj);
                return t;
            }
        });
    }

    @Override // tb.uee
    public void d2(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29d5ad4b", new Object[]{this, str, str2});
        } else {
            J2().f1().g(new ynx(str, str2));
        }
    }

    public final boolean d3(MetaLayout metaLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c721ce0", new Object[]{this, metaLayout})).booleanValue();
        }
        if (metaLayout == null || metaLayout.getTotalHeaderHeight() == metaLayout.getCurrentHeaderHeight()) {
            return true;
        }
        return false;
    }

    public final gsi e3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gsi) ipChange.ipc$dispatch("685eb0ad", new Object[]{this});
        }
        return (gsi) this.h.getValue();
    }

    @Override // tb.uee
    public void f1(kuc kucVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa416bcc", new Object[]{this, kucVar});
            return;
        }
        ckf.g(kucVar, "callback");
        J2().a0().g(kucVar);
    }

    @Override // tb.uee
    public void f2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fc9fa6c", new Object[]{this, new Boolean(z)});
        } else {
            J2().g1().g(Boolean.valueOf(z));
        }
    }

    @Override // tb.uee
    public phw<?, ?, ?> g0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (phw) ipChange.ipc$dispatch("6fd25092", new Object[]{this, new Integer(i)});
        }
        return F2(i);
    }

    @Override // tb.uee
    public void g1(lox loxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c43ecea", new Object[]{this, loxVar});
        } else {
            J2().k1().g(loxVar);
        }
    }

    @Override // tb.abx, tb.nde
    public String getScopeTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("53eba25d", new Object[]{this});
        }
        return "udrRsltPg";
    }

    public final void h3(fox foxVar, List<isi> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c34fa989", new Object[]{this, foxVar, list});
            return;
        }
        foxVar.s2();
        for (isi isiVar : list) {
            gsi e3 = e3();
            o02 b = ((acx) getModel()).b();
            ckf.f(b, "getInitDatasource(...)");
            kae<BaseTypedBean, ?> g = e3.g(isiVar, (com.taobao.android.meta.data.a) b, new g1a() { // from class: tb.buz
                @Override // tb.g1a
                public final Object invoke(Object obj) {
                    ay4 x;
                    x = XslPageWidget.x(XslPageWidget.this, (String) obj);
                    return x;
                }
            }, new g1a() { // from class: tb.cuz
                @Override // tb.g1a
                public final Object invoke(Object obj) {
                    ay4 y;
                    y = XslPageWidget.y(XslPageWidget.this, (String) obj);
                    return y;
                }
            });
            if (g != null) {
                g.ensureView();
                g.bindWithData(isiVar.a());
                foxVar.q2(g);
            }
        }
    }

    @Override // tb.uee
    public boolean isReachBottom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("37b2447f", new Object[]{this})).booleanValue();
        }
        MetaChildPageWidget V = ((iuc) u2()).V();
        if (V != null) {
            return !V.D2(1);
        }
        return false;
    }

    @Override // tb.uee
    public boolean isReachTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36ef4cb7", new Object[]{this})).booleanValue();
        }
        if (!d3(((juc) t2()).j())) {
            return false;
        }
        MetaChildPageWidget V = ((iuc) u2()).V();
        if (V == null || (d3(((stc) V.t2()).j()) && !V.D2(-1))) {
            return true;
        }
        return false;
    }

    @Override // tb.uee
    public void k0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a5f7c26", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // tb.uee
    public void k1(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3f8942e", new Object[]{this, new Integer(i)});
        } else {
            J2().A().g(Integer.valueOf(i));
        }
    }

    @Override // tb.uee
    public void l0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a3e41b5", new Object[]{this, new Integer(i)});
        } else {
            J2().G().g(Integer.valueOf(i));
        }
    }

    @Override // tb.t48
    public void n0(nde ndeVar, String str, Object obj, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d391adbc", new Object[]{this, ndeVar, str, obj, str2, str3});
            return;
        }
        Iterator<t48> it = this.n.iterator();
        ckf.f(it, "iterator(...)");
        while (it.hasNext()) {
            t48 next = it.next();
            ckf.f(next, "next(...)");
            next.n0(ndeVar, str, obj, str2, str3);
        }
    }

    @Override // tb.uee
    public void x0(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e824c58", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        J2().p1().g(Integer.valueOf(i));
        J2().o1().g(Integer.valueOf(i2));
    }

    @Override // tb.uee
    public void z1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b566bee2", new Object[]{this, new Boolean(z)});
        } else {
            J2().O().g(Boolean.valueOf(z));
        }
    }

    /* renamed from: f3 */
    public FrameLayout onCreateView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("6075f6f2", new Object[]{this});
        }
        FrameLayout frameLayout = (FrameLayout) super.onCreateView();
        ckf.d(frameLayout);
        Z2(frameLayout);
        this.j = a3(this.i, true, "list");
        this.l = a3(this.k, false, "sticky");
        ((juc) t2()).commit();
        J2().l1().d(new g1a() { // from class: tb.duz
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv v;
                v = XslPageWidget.v(XslPageWidget.this, (Integer) obj);
                return v;
            }
        });
        c3();
        b3();
        J2().j1().d(new g1a() { // from class: tb.euz
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv w;
                w = XslPageWidget.w(XslPageWidget.this, (Boolean) obj);
                return w;
            }
        });
        return frameLayout;
    }

    public final void g3(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bd7f473", new Object[]{this, new Boolean(z)});
            return;
        }
        int childCount = ((iuc) u2()).getChildCount();
        for (int i = 0; i < childCount; i++) {
            MetaChildPageWidget F2 = F2(i);
            if (F2 != null) {
                F2.x();
                G2().D(G2().v().e().getIndex(), 0, 0, z);
                ((stc) F2.t2()).j().unfold();
            }
        }
        MetaLayout j = ((juc) t2()).j();
        x3u x3uVar = this.j;
        if (x3uVar != null) {
            j.scrollHeaderToTop(x3uVar, z, null);
        } else {
            ckf.y("topHeader");
            throw null;
        }
    }

    @Override // tb.uee
    public void i1(String str, int i, boolean z, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9943b198", new Object[]{this, str, new Integer(i), new Boolean(z), new Integer(i2)});
        } else if (str != null) {
            XslChildPageWidget xslChildPageWidget = null;
            switch (str.hashCode()) {
                case 115029:
                    if (str.equals("top")) {
                        g3(z);
                        return;
                    }
                    return;
                case 3148801:
                    if (str.equals(ytc.TYPE_FOLD)) {
                        MetaLayout j = ((juc) t2()).j();
                        x3u x3uVar = this.l;
                        if (x3uVar != null) {
                            j.scrollHeaderToTop(x3uVar, false, null);
                            MetaChildPageWidget F2 = F2(G2().v().e().getIndex());
                            if (F2 instanceof XslChildPageWidget) {
                                xslChildPageWidget = (XslChildPageWidget) F2;
                            }
                            if (xslChildPageWidget != null) {
                                xslChildPageWidget.z3(z, true);
                                return;
                            }
                            return;
                        }
                        ckf.y("tabHeader");
                        throw null;
                    }
                    return;
                case 3322014:
                    if (str.equals("list")) {
                        ((juc) t2()).j().fold();
                        MetaChildPageWidget F22 = F2(G2().v().e().getIndex());
                        if (F22 instanceof XslChildPageWidget) {
                            xslChildPageWidget = (XslChildPageWidget) F22;
                        }
                        if (xslChildPageWidget != null) {
                            xslChildPageWidget.C3(z, false);
                        }
                        G2().D(G2().v().e().getIndex(), i, -i2, z);
                        return;
                    }
                    return;
                case 35721419:
                    if (str.equals("listHeader")) {
                        MetaChildPageWidget F23 = F2(G2().v().e().getIndex());
                        if (F23 instanceof XslChildPageWidget) {
                            xslChildPageWidget = (XslChildPageWidget) F23;
                        }
                        if (xslChildPageWidget != null) {
                            xslChildPageWidget.B3(i, z);
                            return;
                        }
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    @Override // tb.uee
    public void w0(boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48495dc2", new Object[]{this, new Boolean(z), new Integer(i)});
            return;
        }
        int childCount = ((iuc) u2()).getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            MetaChildPageWidget F2 = F2(i2);
            if (F2 != null) {
                F2.x();
                G2().F(G2().v().e().getIndex(), 0, z);
                ((stc) F2.t2()).j().unfold();
            }
        }
        MetaLayout j = ((juc) t2()).j();
        x3u x3uVar = this.j;
        if (x3uVar != null) {
            j.scrollHeaderToTop(x3uVar, z, null);
        } else {
            ckf.y("topHeader");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XslPageWidget(final box boxVar, Activity activity, ude udeVar, acx<XslDataSource> acxVar, ViewGroup viewGroup, vfw vfwVar) {
        super(boxVar, activity, udeVar, acxVar, viewGroup, vfwVar);
        ckf.g(boxVar, "metaConfig");
        ckf.g(activity, "activity");
        ckf.g(udeVar, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        ckf.g(acxVar, "modelAdapter");
        this.h = kotlin.a.b(new d1a() { // from class: tb.auz
            @Override // tb.d1a
            public final Object invoke() {
                gsi u;
                u = XslPageWidget.u(box.this, this);
                return u;
            }
        });
        this.i = new fox(activity, udeVar, acxVar, viewGroup, new k4k(), true);
        this.k = new fox(activity, udeVar, acxVar, viewGroup, new k4k(), false);
        this.m = new XslBackgroundView(activity);
    }
}
