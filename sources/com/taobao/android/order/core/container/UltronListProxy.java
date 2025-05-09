package com.taobao.android.order.core.container;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.android.ultron.vfw.core.ViewEngine;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.utils.UltronTradeHybridSwitcherHelper;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.order.bundle.constants.CoreConstants;
import com.taobao.android.order.core.OrderConfigs;
import com.taobao.android.order.core.ui.viewpager.SimplePagerAdapter;
import com.taobao.android.order.core.ui.viewpager.SimpleViewpager;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.be5;
import tb.cdl;
import tb.d76;
import tb.et6;
import tb.fce;
import tb.fqs;
import tb.gav;
import tb.gdl;
import tb.hav;
import tb.ldv;
import tb.lht;
import tb.lr5;
import tb.qrr;
import tb.t2o;
import tb.uel;
import tb.uj8;
import tb.v9v;
import tb.vcv;
import tb.vel;
import tb.w9v;
import tb.wbl;
import tb.we6;
import tb.xln;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class UltronListProxy extends gav {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int A;
    public PagerAdapter B;
    public e C;
    public lr5 x;
    public ViewPager y;
    public final List<View> z = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements qrr.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("66cb0703", new Object[]{this, str});
                return;
            }
            UltronListProxy.this.t0();
            UltronListProxy.this.s0(str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements fce {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f9142a;

        public b(View view) {
            this.f9142a = view;
        }

        @Override // tb.fce
        public void a(ArrayList<MotionEvent> arrayList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4726ab7", new Object[]{this, arrayList});
                return;
            }
            Iterator<MotionEvent> it = arrayList.iterator();
            while (it.hasNext()) {
                UltronListProxy.h0(UltronListProxy.this).u().f(this.f9142a).dispatchTouchEvent(it.next());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f9143a;

        public c(d dVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
            et6 N;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            hav.d("UltronListProxy", "loadCacheData start");
            vcv vcvVar = new vcv();
            vcvVar.g(uel.l("skipDownloadTemplates", false));
            UltronListProxy.j0(UltronListProxy.this).W(UltronListProxy.i0(UltronListProxy.this).A() ? 118 : 127, vcvVar);
            vel k = UltronListProxy.k0(UltronListProxy.this).k();
            if (!(k == null || (N = UltronListProxy.l0(UltronListProxy.this).G().N()) == null)) {
                k.n(N.c().size());
            }
            hav.d("UltronListProxy", "loadCacheData end");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface d {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface e {
        void onPageSelected(int i, String str);
    }

    static {
        t2o.a(614465618);
    }

    public UltronListProxy(Context context, com.alibaba.android.ultron.vfw.instance.a aVar) {
        this.f19842a = aVar;
        N();
    }

    public static /* synthetic */ e d0(UltronListProxy ultronListProxy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("d35cf262", new Object[]{ultronListProxy});
        }
        return ultronListProxy.C;
    }

    public static /* synthetic */ lr5 e0(UltronListProxy ultronListProxy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lr5) ipChange.ipc$dispatch("fafcaa08", new Object[]{ultronListProxy});
        }
        return ultronListProxy.x;
    }

    public static /* synthetic */ void f0(UltronListProxy ultronListProxy, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f81b9d97", new Object[]{ultronListProxy, new Integer(i), str});
        } else {
            ultronListProxy.r0(i, str);
        }
    }

    public static /* synthetic */ OrderConfigs g0(UltronListProxy ultronListProxy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OrderConfigs) ipChange.ipc$dispatch("74b36891", new Object[]{ultronListProxy});
        }
        return ultronListProxy.c;
    }

    public static /* synthetic */ OrderConfigs h0(UltronListProxy ultronListProxy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OrderConfigs) ipChange.ipc$dispatch("b4de4f52", new Object[]{ultronListProxy});
        }
        return ultronListProxy.c;
    }

    public static /* synthetic */ OrderConfigs i0(UltronListProxy ultronListProxy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OrderConfigs) ipChange.ipc$dispatch("f5093613", new Object[]{ultronListProxy});
        }
        return ultronListProxy.c;
    }

    public static /* synthetic */ Object ipc$super(UltronListProxy ultronListProxy, String str, Object... objArr) {
        if (str.hashCode() == -680330162) {
            super.k((Context) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/core/container/UltronListProxy");
    }

    public static /* synthetic */ com.alibaba.android.ultron.vfw.instance.a j0(UltronListProxy ultronListProxy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.ultron.vfw.instance.a) ipChange.ipc$dispatch("f8fe7412", new Object[]{ultronListProxy});
        }
        return ultronListProxy.f19842a;
    }

    public static /* synthetic */ OrderConfigs k0(UltronListProxy ultronListProxy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OrderConfigs) ipChange.ipc$dispatch("755f0395", new Object[]{ultronListProxy});
        }
        return ultronListProxy.c;
    }

    public static /* synthetic */ com.alibaba.android.ultron.vfw.instance.a l0(UltronListProxy ultronListProxy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.ultron.vfw.instance.a) ipChange.ipc$dispatch("ac920e94", new Object[]{ultronListProxy});
        }
        return ultronListProxy.f19842a;
    }

    public final boolean n0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4dd2e48", new Object[]{this})).booleanValue();
        }
        for (int i = 0; i < this.c.g().size(); i++) {
            if (this.A != i) {
                View view = new View(this.b);
                view.setTag(R.id.orderListTabPlaceholder, Boolean.TRUE);
                ((ArrayList) this.z).add(view);
            } else if (!m0(this.b)) {
                return false;
            }
        }
        return true;
    }

    public long o0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f5ce1ad7", new Object[]{this})).longValue();
        }
        return this.p;
    }

    public final View p0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("704b0cc8", new Object[]{this, new Integer(i)});
        }
        View view = (View) ((ArrayList) this.z).get(i);
        if (view == null) {
            return null;
        }
        Object tag = view.getTag(R.id.orderListTabPlaceholder);
        if (tag == null || !((Boolean) tag).booleanValue()) {
            return view;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        View j = this.c.u().j(this.b);
        ((ArrayList) this.z).set(i, j);
        ((SimplePagerAdapter) this.B).h(i, j);
        return j;
    }

    public void s0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b59493a3", new Object[]{this, str});
            return;
        }
        lr5 lr5Var = this.x;
        if (lr5Var != null) {
            int b2 = lr5Var.b(str);
            if (b2 < 0 || b2 >= this.x.e()) {
                ldv.f(null, "UltronListProxy", "VIEW_NULL", "外部没有实现容器的view", null);
            } else if (this.y != null && p0(b2) != null) {
                this.y.setCurrentItem(b2);
            }
        }
    }

    public void t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2583a82", new Object[]{this});
        } else {
            this.c.F(false);
        }
    }

    public void u0(OrderConfigs orderConfigs) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b75e57c", new Object[]{this, orderConfigs});
        } else {
            this.c = orderConfigs;
        }
    }

    public void v0(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f71d3dfc", new Object[]{this, eVar});
        } else {
            this.C = eVar;
        }
    }

    @Override // tb.gav
    public void U(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("103d1c82", new Object[]{this, jSONObject});
        } else if (!((ArrayList) this.z).isEmpty() && jSONObject != null && this.c.u() != null) {
            String string = jSONObject.getString("notReload");
            this.c.u().l(jSONObject);
            if (!"true".equals(string)) {
                ViewPager viewPager = this.y;
                int currentItem = viewPager == null ? 0 : viewPager.getCurrentItem();
                if (currentItem < 0 || currentItem >= ((ArrayList) this.z).size()) {
                    uj8.a("UltronListProxy", "refreshWithParams", "POSITION_ILLEGAL");
                    return;
                }
                View view = (View) ((ArrayList) this.z).get(currentItem);
                w0(view, false);
                this.c.u().d(view, currentItem, null);
            }
        }
    }

    public final void w0(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("424ea057", new Object[]{this, view, new Boolean(z)});
        } else if (view != null && this.c.u() != null) {
            RecyclerView i = this.c.u().i(view);
            if (i != null) {
                this.c.O(i);
            }
            LinearLayout k = this.c.u().k(view);
            if (k != null) {
                this.c.B(k);
            }
            LinearLayout g = this.c.u().g(view);
            if (g != null) {
                this.c.E(g);
            }
            ViewGroup h = this.c.u().h(view);
            if (h != null) {
                this.c.C(h);
                getInstance().w0(new b(view));
            }
            if (!z || !v9v.i(wbl.NEW_BABEL_ORDER, "enableNoResetDMContext", true)) {
                a0();
            }
            j(this.c.b());
            b("receiveMsgV2", new xln());
        }
    }

    @Override // tb.gav, tb.wqb
    public void k(Context context) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d772fc4e", new Object[]{this, context});
            return;
        }
        super.k(context);
        OrderConfigs orderConfigs = this.c;
        if (orderConfigs != null && orderConfigs.b() != null && this.c.u() != null) {
            lr5 lr5Var = new lr5(this.c.g());
            this.x = lr5Var;
            int a2 = lr5Var.a();
            this.A = a2;
            this.x.d(a2);
            if (cdl.c()) {
                DinamicXEngine k = this.f19842a.G().Q().b().k();
                k.P0(7700670404894374791L, new be5());
                k.Q0(7700670404894374791L, new we6());
            } else {
                a(7700670404894374791L, new we6());
            }
            if (v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_LOGISTICS_DETAIL, "enableTouchDownOpt", false)) {
                a(8095935013984139892L, new d76());
            }
            p(Long.valueOf((long) lr5.DX_PARSER_TABINFO), this.x);
            b("tabChangeV2", new fqs(this));
            h(w9v.ULTRONSEARCHTABCLICKV2, new w9v.a(this));
            h(gdl.ORDERIMAGELOADCOMPLETE, new gdl.a(this.c.k()));
            if (v9v.i("babelorder", "tbTradeJSTrackerReportRegister", true)) {
                h(Long.toString(lht.TBTRADEJSTRACKERREPORT), new lht.a());
            }
            if (this.c.g().size() > 0) {
                z = n0();
            } else {
                z = m0(this.b);
            }
            if (!z) {
                hav.d("OrderList createContainerView", "createContainerView failed");
            } else if (this.c.b().containsKey(OrderConfigs.VIEWPAGER)) {
                this.y = (SimpleViewpager) this.c.b().get(OrderConfigs.VIEWPAGER);
                this.B = new SimplePagerAdapter(context, this.z);
                this.y.setOffscreenPageLimit(0);
                this.y.setAdapter(this.B);
                this.y.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.taobao.android.order.core.container.UltronListProxy.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                    public void onPageScrollStateChanged(int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
                        } else {
                            UltronListProxy.g0(UltronListProxy.this).u().onPageScrollStateChanged(i);
                        }
                    }

                    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                    public void onPageScrolled(int i, float f, int i2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
                        }
                    }

                    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                    public void onPageSelected(int i) {
                        ViewEngine G;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
                            return;
                        }
                        UltronListProxy.this.p = System.currentTimeMillis();
                        UltronListProxy ultronListProxy = UltronListProxy.this;
                        if (ultronListProxy.A != i) {
                            if (UltronListProxy.d0(ultronListProxy) != null) {
                                UltronListProxy.d0(UltronListProxy.this).onPageSelected(i, UltronListProxy.e0(UltronListProxy.this).d(i));
                            }
                            UltronListProxy ultronListProxy2 = UltronListProxy.this;
                            ultronListProxy2.A = Integer.MIN_VALUE;
                            UltronListProxy.f0(ultronListProxy2, i, UltronListProxy.e0(ultronListProxy2).d(i));
                            if (wbl.y() && (G = UltronListProxy.this.getInstance().G()) != null) {
                                G.z();
                            }
                        }
                    }
                });
                this.y.setCurrentItem(this.A);
                w0((View) ((ArrayList) this.z).get(this.A), true);
                if (this.c.r() instanceof qrr) {
                    ((qrr) this.c.r()).registerOnTabClickListener(new a());
                }
            }
        }
    }

    public final boolean m0(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5d088a3b", new Object[]{this, context})).booleanValue();
        }
        View j = this.c.u().j(context);
        if (j == null) {
            ldv.f(context, "UltronListProxy", "VIEW_NULL", "外部没有实现容器的view", null);
            return false;
        }
        this.z.add(j);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
        if (tb.v9v.i(tb.wbl.NEW_BABEL_ORDER, "enableNoResetDMContext", true) != false) goto L_0x0053;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void q0(com.alibaba.fastjson.JSONObject r5, boolean r6, com.taobao.android.order.core.container.UltronListProxy.d r7, java.lang.String r8) {
        /*
            r4 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.android.order.core.container.UltronListProxy.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0023
            java.lang.Boolean r3 = new java.lang.Boolean
            r3.<init>(r6)
            r6 = 5
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r1] = r4
            r6[r0] = r5
            r5 = 2
            r6[r5] = r3
            r5 = 3
            r6[r5] = r7
            r5 = 4
            r6[r5] = r8
            java.lang.String r5 = "8334476b"
            r2.ipc$dispatch(r5, r6)
            return
        L_0x0023:
            com.alibaba.android.ultron.vfw.instance.a r2 = r4.f19842a
            if (r2 != 0) goto L_0x0028
            return
        L_0x0028:
            com.taobao.android.order.core.OrderConfigs r2 = r4.c     // Catch: all -> 0x008a
            boolean r2 = r2.f()     // Catch: all -> 0x008a
            r4.l = r2     // Catch: all -> 0x008a
            com.alibaba.android.ultron.vfw.instance.a r2 = r4.f19842a     // Catch: all -> 0x008a
            tb.u55 r2 = r2.w()     // Catch: all -> 0x008a
            java.util.List r2 = r2.getComponents()     // Catch: all -> 0x008a
            if (r2 == 0) goto L_0x004e
            boolean r2 = r2.isEmpty()     // Catch: all -> 0x008a
            if (r2 == 0) goto L_0x0043
            goto L_0x004e
        L_0x0043:
            java.lang.String r2 = "newbabelorder"
            java.lang.String r3 = "enableNoResetDMContext"
            boolean r2 = tb.v9v.i(r2, r3, r0)     // Catch: all -> 0x008a
            if (r2 != 0) goto L_0x0053
        L_0x004e:
            com.alibaba.android.ultron.vfw.instance.a r2 = r4.f19842a     // Catch: all -> 0x008a
            r2.R(r5, r8)     // Catch: all -> 0x008a
        L_0x0053:
            tb.gav$g$a r5 = new tb.gav$g$a     // Catch: all -> 0x008a
            r5.<init>()     // Catch: all -> 0x008a
            tb.gav$g$a r5 = r5.d(r0)     // Catch: all -> 0x008a
            com.taobao.android.order.core.OrderConfigs r8 = r4.c     // Catch: all -> 0x008a
            android.view.ViewGroup r8 = r8.r()     // Catch: all -> 0x008a
            if (r8 == 0) goto L_0x0067
            r5.e(r0)     // Catch: all -> 0x008a
        L_0x0067:
            com.alibaba.android.ultron.vfw.instance.a r8 = r4.f19842a     // Catch: all -> 0x008a
            tb.rn2 r0 = new tb.rn2     // Catch: all -> 0x008a
            tb.gav$g r5 = r5.c()     // Catch: all -> 0x008a
            r0.<init>(r5)     // Catch: all -> 0x008a
            r8.T(r0)     // Catch: all -> 0x008a
            com.taobao.android.order.core.OrderConfigs r5 = r4.c     // Catch: all -> 0x008a
            r5.I(r1)     // Catch: all -> 0x008a
            com.taobao.android.order.core.container.UltronListProxy$c r5 = new com.taobao.android.order.core.container.UltronListProxy$c     // Catch: all -> 0x008a
            r5.<init>(r7)     // Catch: all -> 0x008a
            if (r6 == 0) goto L_0x0087
            r6 = 0
            tb.pav.i(r5, r6)     // Catch: all -> 0x008a
            goto L_0x008a
        L_0x0087:
            r5.run()     // Catch: all -> 0x008a
        L_0x008a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.order.core.container.UltronListProxy.q0(com.alibaba.fastjson.JSONObject, boolean, com.taobao.android.order.core.container.UltronListProxy$d, java.lang.String):void");
    }

    public final void r0(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ccbd354", new Object[]{this, new Integer(i), str});
            return;
        }
        lr5 lr5Var = this.x;
        if (lr5Var == null || i < 0 || i >= lr5Var.e()) {
            hav.d("UltronListProxy", "position_error");
            return;
        }
        View p0 = p0(i);
        for (int i2 = 0; i2 < ((ArrayList) this.z).size(); i2++) {
            if (i2 == i) {
                ((View) ((ArrayList) this.z).get(i2)).setVisibility(0);
            } else {
                ((View) ((ArrayList) this.z).get(i2)).setVisibility(8);
            }
        }
        w0(p0, false);
        this.x.f(i);
        this.c.J(this.x.c());
        getInstance().X(1);
        this.c.u().a(p0, i, str);
        if (this.c.r() instanceof qrr) {
            ((qrr) this.c.r()).onTabUpdate(i);
        }
    }

    @Override // tb.gav
    public void T(Context context) {
        boolean z = true;
        int i = 2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c13aefce", new Object[]{this, context});
            return;
        }
        "1".equals(I().j().get("page"));
        String str = I().j().get("condition");
        if (str == null || !str.contains(CoreConstants.BATCH_CONFIRM_GOOD_ONLINE_ORDER_IDS)) {
            z = false;
        }
        if (this.c.e() && this.c.z()) {
            this.c.F(false);
            i = 125;
        } else if (!z) {
            i = 127;
        } else if (uel.l("enableRebuildFoot", false)) {
            i = 6;
        }
        this.l = false;
        getInstance().V(i);
    }

    public UltronListProxy(OrderConfigs orderConfigs) {
        this.c = orderConfigs;
    }
}
