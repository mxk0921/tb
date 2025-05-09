package tb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.constans.GLRenderType;
import com.taobao.taolive.sdk.model.common.LiveItem;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class iwp implements jqd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f21616a;
    public final xea b;
    public final boolean c;
    public final a1o d;
    public final Handler e = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FrameLayout f21617a;
        public final /* synthetic */ LiveItem b;

        public a(FrameLayout frameLayout, LiveItem liveItem) {
            this.f21617a = frameLayout;
            this.b = liveItem;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                iwp.d(iwp.this, this.f21617a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FrameLayout f21618a;
        public final /* synthetic */ LiveItem b;
        public final /* synthetic */ gwp c;

        public b(FrameLayout frameLayout, LiveItem liveItem, gwp gwpVar) {
            this.f21618a = frameLayout;
            this.b = liveItem;
            this.c = gwpVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                iwp.e(iwp.this, this.f21618a, this.b, this.c);
            }
        }
    }

    static {
        t2o.a(295699114);
        t2o.a(295699052);
    }

    public iwp(xea xeaVar, Context context, boolean z) {
        this.f21616a = context;
        this.b = xeaVar;
        this.c = z;
        a1o a1oVar = new a1o(null, false);
        this.d = a1oVar;
        a1oVar.i(xeaVar);
    }

    public static /* synthetic */ void d(iwp iwpVar, FrameLayout frameLayout, LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79e7892", new Object[]{iwpVar, frameLayout, liveItem});
        } else {
            iwpVar.i(frameLayout, liveItem);
        }
    }

    public static /* synthetic */ void e(iwp iwpVar, FrameLayout frameLayout, LiveItem liveItem, gwp gwpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dff96", new Object[]{iwpVar, frameLayout, liveItem, gwpVar});
        } else {
            iwpVar.h(frameLayout, liveItem, gwpVar);
        }
    }

    @Override // tb.jqd
    public void a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c1710c0", new Object[]{this, viewGroup});
        } else if (viewGroup != null && viewGroup.getChildCount() >= 1) {
            View childAt = viewGroup.getChildAt(0);
            if (childAt instanceof DXRootView) {
                DXRootView dXRootView = (DXRootView) childAt;
                this.b.q().j().j().c(new xm6(dXRootView));
                viewGroup.removeAllViews();
                ikr.f().g(dXRootView);
            }
        }
    }

    @Override // tb.jqd
    public void c(FrameLayout frameLayout, LiveItem liveItem, gwp gwpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1ecdd95", new Object[]{this, frameLayout, liveItem, gwpVar});
        } else if (wda.z()) {
            this.e.post(new b(frameLayout, liveItem, gwpVar));
        } else {
            h(frameLayout, liveItem, gwpVar);
        }
    }

    public final JSONObject f(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("4cd787f7", new Object[]{this, liveItem});
        }
        JSONObject parseJsonObject = liveItem.parseJsonObject();
        this.d.g(this.b, parseJsonObject, false, GLRenderType.SMALL_CARD);
        return parseJsonObject;
    }

    public final String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca44bb09", new Object[]{this});
        }
        if (this.c) {
            return "taolive_goods_showcase_pcg";
        }
        return "taolive_gl_item_showcase3";
    }

    public final void h(FrameLayout frameLayout, LiveItem liveItem, gwp gwpVar) {
        LiveItem liveItem2;
        DXWidgetNode dXWidgetNode;
        LiveItem liveItem3;
        boolean z = true;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("678d1cb2", new Object[]{this, frameLayout, liveItem, gwpVar});
        } else if (frameLayout != null && frameLayout.getChildCount() >= 1) {
            DXWidgetNode dXWidgetNode2 = null;
            if (gwpVar == null) {
                liveItem2 = null;
            } else {
                liveItem2 = gwpVar.c;
            }
            iha.G(liveItem2, liveItem);
            liveItem.nativeConfigInfos.put("enableNewHotSaleAtmosphere", (Object) Boolean.TRUE);
            View childAt = frameLayout.getChildAt(0);
            if (childAt instanceof DXRootView) {
                DXRootView dXRootView = (DXRootView) childAt;
                DXWidgetNode expandWidgetNode = dXRootView.getExpandWidgetNode();
                if (expandWidgetNode != null) {
                    dXWidgetNode2 = expandWidgetNode.queryWidgetNodeByUserId("good_content");
                    dXWidgetNode = expandWidgetNode.queryWidgetNodeByUserId("good_atmosphere_content");
                } else {
                    dXWidgetNode = null;
                }
                if (!(gwpVar == null || (liveItem3 = gwpVar.c) == null)) {
                    if (pfa.M(liveItem3) == pfa.M(liveItem)) {
                        z = false;
                    }
                    z2 = z;
                }
                if (dXWidgetNode2 == null || z2) {
                    ikr.f().m(dXRootView, f(liveItem), this.b);
                    ikr.f().h(dXRootView);
                    return;
                }
                j(dXRootView, liveItem);
                ikr.f().i(dXWidgetNode2);
                if (dXWidgetNode != null) {
                    ikr.f().i(dXWidgetNode);
                }
                ikr.f().h(dXRootView);
            }
        }
    }

    public final void j(DXRootView dXRootView, LiveItem liveItem) {
        JSONObject data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73877889", new Object[]{this, dXRootView, liveItem});
        } else if (dXRootView != null && (data = dXRootView.getData()) != null) {
            data.clear();
            data.putAll(f(liveItem));
        }
    }

    @Override // tb.jqd
    public void b(FrameLayout frameLayout, LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47166032", new Object[]{this, frameLayout, liveItem});
        } else if (!qvs.P() || !hjr.E("enableBanShowShowCase", false)) {
            xea xeaVar = this.b;
            if (!(xeaVar == null || xeaVar.q() == null || this.b.q().w() == null)) {
                this.b.q().w().a("hasShowShowCase", "true");
            }
            if (wda.z()) {
                this.e.post(new a(frameLayout, liveItem));
            } else {
                i(frameLayout, liveItem);
            }
        }
    }

    public final void i(FrameLayout frameLayout, LiveItem liveItem) {
        DXRootView dXRootView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3abff4f", new Object[]{this, frameLayout, liveItem});
            return;
        }
        h4s.b("AnimationLifeCycle/ShowCaseRender");
        liveItem.nativeConfigInfos.put("enableNewHotSaleAtmosphere", (Object) Boolean.TRUE);
        String g = g();
        if (frameLayout.getChildAt(0) instanceof DXRootView) {
            DXRootView dXRootView2 = (DXRootView) frameLayout.getChildAt(0);
            if (g.equals(dXRootView2.getDxTemplateItem().f7343a)) {
                DXRootView dXRootView3 = (DXRootView) frameLayout.getChildAt(0);
                ikr.f().m(dXRootView3, f(liveItem), this.b);
                ikr.f().h(dXRootView3);
                return;
            }
            this.b.q().j().j().c(new xm6(dXRootView2));
            frameLayout.removeAllViews();
        }
        xm6 a2 = this.b.q().j().j().a(g.hashCode());
        if (a2 != null) {
            dXRootView = a2.a();
        } else {
            dXRootView = ikr.f().a(this.f21616a, g);
        }
        if (dXRootView == null) {
            hha.b("ShowcaseRenderCommon", "renderNormalCard | empty. templateName=".concat(g));
            return;
        }
        frameLayout.removeAllViews();
        frameLayout.addView(dXRootView);
        ikr.f().m(dXRootView, f(liveItem), this.b);
        ikr.f().h(dXRootView);
        h4s.e();
    }
}
