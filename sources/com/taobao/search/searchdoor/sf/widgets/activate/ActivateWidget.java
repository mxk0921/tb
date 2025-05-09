package com.taobao.search.searchdoor.sf.widgets.activate;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.collection.ArrayMap;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.ability.localization.Localization;
import com.alibaba.aliweex.bundle.WeexPageFragment;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.change.app.icon.biz.ChangeAppIconBridge;
import com.taobao.android.searchbaseframe.business.srp.list.uikit.XSRecyclerPool;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.weex.WeexErrorType;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex_ability.page.WeexContainerFragment;
import com.taobao.downgrade.Downgrade;
import com.taobao.schedule.ViewProxy;
import com.taobao.search.common.util.ClientIntelligenceHelper;
import com.taobao.search.musie.InterceptFrameLayout;
import com.taobao.search.searchdoor.SearchDoorActivity;
import com.taobao.search.searchdoor.activate.NestedScrollContainer;
import com.taobao.search.searchdoor.activate.data.ActivateBean;
import com.taobao.search.searchdoor.ai.AISearchConfigManager;
import com.taobao.search.searchdoor.searchbar.data.SearchBarHintBean;
import com.taobao.search.searchdoor.sf.widgets.SearchDoorContext;
import com.taobao.search.searchdoor.sf.widgets.activate.a;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.ActivateCellBean;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.ActivateTypedBean;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.HistoryCellBean;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.features.SmoothRecyclerScrollFeature;
import com.taobao.uikit.feature.view.TRecyclerView;
import com.taobao.weex.WXSDKInstance;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import mtopsdk.mtop.domain.MethodEnum;
import tb.aa0;
import tb.b4p;
import tb.ba0;
import tb.c2p;
import tb.ca0;
import tb.da0;
import tb.ea0;
import tb.g6p;
import tb.h0p;
import tb.h2p;
import tb.h8x;
import tb.ha0;
import tb.hk4;
import tb.i0p;
import tb.i2p;
import tb.i5p;
import tb.ia0;
import tb.igw;
import tb.j6x;
import tb.ja0;
import tb.k0p;
import tb.kgw;
import tb.kl7;
import tb.l0p;
import tb.l3p;
import tb.la0;
import tb.m6x;
import tb.o2p;
import tb.o4p;
import tb.phw;
import tb.r4p;
import tb.rpc;
import tb.sen;
import tb.snl;
import tb.t2o;
import tb.u0p;
import tb.ude;
import tb.v5p;
import tb.vfw;
import tb.vnd;
import tb.vxm;
import tb.x1p;
import tb.xjt;
import tb.xnd;
import tb.y1p;
import tb.y90;
import tb.yak;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ActivateWidget extends phw<Void, View, SearchDoorContext> implements View.OnTouchListener, a.g, vnd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public volatile ja0 f11645a;
    public final SearchDoorContext b;
    public String c;
    public String d;
    public final ActivateAdapter<c2p> e;
    public final LinearLayoutManager f;
    public final com.taobao.search.searchdoor.sf.widgets.activate.a g;
    public InterceptFrameLayout i;
    public WeexPageFragment j;
    public WeexContainerFragment k;
    public String l;
    public final boolean m;
    public final boolean p;
    public NestedScrollContainer r;
    public final m6x h = new m6x();
    public final Map<String, TemplateBean> n = new ConcurrentHashMap();
    public final Map<String, rpc.c> o = new ConcurrentHashMap();
    public final AtomicBoolean q = new AtomicBoolean(false);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements j6x {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.j6x
        public void E1(WeexInstance weexInstance, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f794a71b", new Object[]{this, weexInstance, new Boolean(z)});
            }
        }

        @Override // tb.j6x
        public void H0(WeexInstance weexInstance, boolean z, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("99cc9148", new Object[]{this, weexInstance, new Boolean(z), weexErrorType, str});
            }
        }

        @Override // tb.j6x
        public void I1(WeexInstance weexInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("68c948df", new Object[]{this, weexInstance});
            }
        }

        @Override // tb.j6x
        public void K0(WeexInstance weexInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad8178b2", new Object[]{this, weexInstance});
            }
        }

        @Override // tb.j6x
        public void K1(WeexInstance weexInstance, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a414e261", new Object[]{this, weexInstance, new Boolean(z)});
            } else {
                ActivateWidget.u2(ActivateWidget.this);
            }
        }

        @Override // tb.j6x
        public void d2(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7a7821b2", new Object[]{this, weexInstance, weexErrorType, str});
            }
        }

        @Override // tb.j6x
        public void e2(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("52b846bb", new Object[]{this, weexInstance, weexErrorType, str});
            }
        }

        @Override // tb.j6x
        public void l2(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("55726f6d", new Object[]{this, weexInstance, weexErrorType, str});
            }
        }

        @Override // tb.j6x
        public void z1(WeexInstance weexInstance, boolean z, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8bee002", new Object[]{this, weexInstance, new Boolean(z), weexErrorType, str});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b extends WeexPageFragment.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == -1005279751) {
                super.onRenderSuccess((WXSDKInstance) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/sf/widgets/activate/ActivateWidget$11");
        }

        @Override // com.alibaba.aliweex.bundle.WeexPageFragment.b, tb.gbe
        public void onRenderSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c414a5f9", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
                return;
            }
            super.onRenderSuccess(wXSDKInstance, i, i2);
            ActivateWidget.this.postEvent(y1p.a(wXSDKInstance.getRootView()));
            ActivateWidget.u2(ActivateWidget.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("channelSrp", ActivateWidget.this.getModel().d());
            sen.d("ClearHistory", hashMap);
            ActivateWidget.this.g.j();
            dialogInterface.cancel();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d(ActivateWidget activateWidget) {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
            } else {
                dialogInterface.cancel();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ActivateBean f11650a;

        public e(ActivateBean activateBean) {
            this.f11650a = activateBean;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            ActivateWidget.this.g.l(this.f11650a);
            dialogInterface.cancel();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class f implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f(ActivateWidget activateWidget) {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
            } else {
                dialogInterface.cancel();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f11651a;

        public g(long j) {
            this.f11651a = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            y90 y90Var = y90.INSTANCE;
            ja0 j = y90Var.j(ActivateWidget.this.b.d());
            long currentTimeMillis = System.currentTimeMillis() - this.f11651a;
            try {
                vxm vxmVar = vxm.b;
                snl snlVar = snl.f28161a;
                vxmVar.b(snlVar.f(ActivateWidget.v2(ActivateWidget.this)).b()).a("show_cache_cost", String.valueOf(currentTimeMillis));
                vxmVar.b(snlVar.f(ActivateWidget.w2(ActivateWidget.this)).b()).a("cache_total", String.valueOf(y90Var.f()));
                vxmVar.b(snlVar.f(ActivateWidget.x2(ActivateWidget.this)).b()).a("cache_convert", String.valueOf(y90Var.g()));
                vxmVar.b(snlVar.f(ActivateWidget.y2(ActivateWidget.this)).b()).a("cache_read", String.valueOf(y90Var.i()));
            } catch (Exception unused) {
            }
            if (j != null && !j.x) {
                ActivateWidget.z2(ActivateWidget.this).set(true);
                ActivateWidget activateWidget = ActivateWidget.this;
                System.currentTimeMillis();
                activateWidget.getClass();
                ActivateWidget.A2(ActivateWidget.this, j);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class h implements hk4<ja0> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        /* renamed from: a */
        public void accept(ja0 ja0Var) throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("870eba5f", new Object[]{this, ja0Var});
                return;
            }
            ActivateWidget.A2(ActivateWidget.this, ja0Var);
            List<ActivateTypedBean> list = ja0Var.g;
            if (list != null && !((ArrayList) list).isEmpty()) {
                ActivateWidget activateWidget = ActivateWidget.this;
                if (activateWidget.m) {
                    return;
                }
                if (ja0Var.x) {
                    y90.INSTANCE.r(activateWidget.b.d(), ja0Var.p, ja0Var);
                    return;
                }
                ActivateWidget.z2(activateWidget).set(true);
                y90.INSTANCE.q(ja0Var.p);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class i extends u0p {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i(ActivateWidget activateWidget, String str) {
            super(str);
        }

        public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
            if (str.hashCode() == 1569381830) {
                super.accept((Throwable) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/sf/widgets/activate/ActivateWidget$5");
        }

        @Override // tb.u0p
        /* renamed from: a */
        public void accept(Throwable th) throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5d8addc6", new Object[]{this, th});
                return;
            }
            super.accept(th);
            TLogTracker.i("Default", "-1", th.getMessage());
            AppMonitor.Alarm.commitFail("Page_SearchItemList", "SearchDoorMain", "30001", th.getMessage());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class j implements hk4<ja0> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public j() {
        }

        /* renamed from: a */
        public void accept(ja0 ja0Var) throws Exception {
            Map<String, TemplateBean> map;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("870eba5f", new Object[]{this, ja0Var});
            } else if (!o4p.H1() || ((map = ja0Var.j) != null && !map.isEmpty())) {
                com.taobao.android.weex_framework.c cVar = new com.taobao.android.weex_framework.c();
                Intent intent = ActivateWidget.this.getActivity().getIntent();
                if (intent == null || intent.getData() == null) {
                    ActivateWidget.this.c().l().d("ActivateWidget", "No bundleUrl");
                } else {
                    cVar.q(intent.getData().toString());
                }
                cVar.r(SearchDoorActivity.PAGE_NAME);
                xjt.c(cVar, ja0Var.j, yak.f31939a, ja0Var.n);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class k implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ja0 f11654a;

        public k(ja0 ja0Var) {
            this.f11654a = ja0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ActivateWidget.B2(ActivateWidget.this, this.f11654a.m);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class l implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f11655a;

        public l(List list) {
            this.f11655a = list;
        }

        /* JADX WARN: Type inference failed for: r1v4, types: [android.view.View] */
        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (ActivateWidget.C2(ActivateWidget.this) != null) {
                ActivateWidget.C2(ActivateWidget.this).setVisibility(8);
            }
            ActivateWidget.this.getView().setVisibility(0);
            ActivateWidget.t2(ActivateWidget.this).m0(this.f11655a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class m implements View.OnTouchListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public m() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
            }
            if (motionEvent.getAction() == 2) {
                ActivateWidget.this.postEvent(h0p.a());
            }
            return false;
        }
    }

    static {
        t2o.a(815793144);
        t2o.a(815793172);
        t2o.a(815793101);
    }

    public ActivateWidget(Activity activity, ude udeVar, SearchDoorContext searchDoorContext, ViewGroup viewGroup, vfw vfwVar) {
        super(activity, udeVar, searchDoorContext, viewGroup, vfwVar);
        this.f = new LinearLayoutManager(activity) { // from class: com.taobao.search.searchdoor.sf.widgets.activate.ActivateWidget.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                if (str.hashCode() == -579854207) {
                    super.onLayoutCompleted((RecyclerView.State) objArr[0]);
                    return null;
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/sf/widgets/activate/ActivateWidget$1");
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public void onLayoutCompleted(RecyclerView.State state) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("dd702081", new Object[]{this, state});
                    return;
                }
                super.onLayoutCompleted(state);
                ActivateWidget.q2(ActivateWidget.this);
            }
        };
        this.b = searchDoorContext;
        com.taobao.search.searchdoor.sf.widgets.activate.a aVar = new com.taobao.search.searchdoor.sf.widgets.activate.a(this, searchDoorContext.c());
        this.g = aVar;
        this.e = new ActivateAdapter<>(activity, this, new c2p(searchDoorContext, this, aVar));
        this.m = ((o2p) udeVar).s;
        boolean n = ((xnd) activity).n();
        this.p = n;
        if (n) {
            aVar.o();
        }
        subscribeEvent(this);
    }

    public static /* synthetic */ void A2(ActivateWidget activateWidget, ja0 ja0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("254c75f7", new Object[]{activateWidget, ja0Var});
        } else {
            activateWidget.I2(ja0Var);
        }
    }

    public static /* synthetic */ void B2(ActivateWidget activateWidget, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4629c450", new Object[]{activateWidget, str});
        } else {
            activateWidget.J2(str);
        }
    }

    public static /* synthetic */ InterceptFrameLayout C2(ActivateWidget activateWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InterceptFrameLayout) ipChange.ipc$dispatch("50f96c8f", new Object[]{activateWidget});
        }
        return activateWidget.i;
    }

    public static /* synthetic */ Object ipc$super(ActivateWidget activateWidget, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -211767613:
                super.onComponentDestroy();
                return null;
            case 217607196:
                super.onCtxResume();
                return null;
            case 299066517:
                super.onCtxPause();
                return null;
            case 593843865:
                super.onCtxDestroy();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/sf/widgets/activate/ActivateWidget");
        }
    }

    public static /* synthetic */ void q2(ActivateWidget activateWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8304a90e", new Object[]{activateWidget});
        } else {
            activateWidget.M2();
        }
    }

    public static /* synthetic */ Activity s2(ActivateWidget activateWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("aea62db", new Object[]{activateWidget});
        }
        return activateWidget.mActivity;
    }

    public static /* synthetic */ ActivateAdapter t2(ActivateWidget activateWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActivateAdapter) ipChange.ipc$dispatch("c7c8300f", new Object[]{activateWidget});
        }
        return activateWidget.e;
    }

    public static /* synthetic */ void u2(ActivateWidget activateWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be7a0e9e", new Object[]{activateWidget});
        } else {
            activateWidget.O2();
        }
    }

    public static /* synthetic */ Activity v2(ActivateWidget activateWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("f095bf5c", new Object[]{activateWidget});
        }
        return activateWidget.mActivity;
    }

    public static /* synthetic */ Activity w2(ActivateWidget activateWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("d6411bdd", new Object[]{activateWidget});
        }
        return activateWidget.mActivity;
    }

    public static /* synthetic */ Activity x2(ActivateWidget activateWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("bbec785e", new Object[]{activateWidget});
        }
        return activateWidget.mActivity;
    }

    public static /* synthetic */ Activity y2(ActivateWidget activateWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("a197d4df", new Object[]{activateWidget});
        }
        return activateWidget.mActivity;
    }

    public static /* synthetic */ AtomicBoolean z2(ActivateWidget activateWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("ade40188", new Object[]{activateWidget});
        }
        return activateWidget.q;
    }

    @Override // tb.vnd
    public final void B1(WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49a16e30", new Object[]{this, wXSDKInstance});
        } else {
            this.h.c(wXSDKInstance);
        }
    }

    public final void D2(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f02e8f7f", new Object[]{this, map});
        } else if (map != null && o4p.b2()) {
            String f2 = ClientIntelligenceHelper.e().f(ClientIntelligenceHelper.INVOKE_ID_SEARCH_DOOR_MAIN_PAGE, SearchDoorActivity.PAGE_NAME, Integer.valueOf(o4p.W()));
            if (!TextUtils.isEmpty(f2)) {
                map.put("bxFeature", f2);
            }
        }
    }

    public void E2(List<ActivateTypedBean> list, ja0 ja0Var) {
        ActivateCellBean activateCellBean;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17aaa43d", new Object[]{this, list, ja0Var});
        } else if (TextUtils.equals("all", this.b.g())) {
            SearchDoorContext searchDoorContext = this.b;
            SearchBarHintBean u = searchDoorContext.u(searchDoorContext.g());
            if (u != null && (activateCellBean = u.discovery) != null) {
                int indexOf = list.indexOf(ja0Var.f);
                if (indexOf >= 0) {
                    if (!activateCellBean.aboveHistory) {
                        indexOf++;
                    }
                    list.add(indexOf, activateCellBean);
                    return;
                }
                list.add(0, activateCellBean);
            }
        }
    }

    public final void F2(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b65b782", new Object[]{this, map});
        } else if ("degrade".equals(Downgrade.getInstance().getDowngradeStrategy("search").getTacticsPerformance())) {
            map.put("devicePerformanceLevel", "low");
            l3p l3pVar = l3p.INSTANCE;
            if (l3pVar.h()) {
                map.put("devicePerformanceType", "NonVideo");
            }
            if (l3pVar.g()) {
                map.put("devicePerformanceType", "NonIntelligEnd");
            }
            if (l3pVar.f()) {
                map.put("devicePerformanceType", "DPicDegraded");
            }
        }
    }

    public void G2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("858dee8e", new Object[]{this});
        } else {
            kl7.a(this.mActivity, "", Localization.q(R.string.taobao_app_1005_1_22843), Localization.q(R.string.app_confirm), new c(), Localization.q(R.string.app_cancel), new d(this));
        }
    }

    public final void H2(aa0 aa0Var) {
        ActivateBean activateBean;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("716883b5", new Object[]{this, aa0Var});
        } else if (aa0Var != null && (activateBean = aa0Var.f15621a) != null) {
            kl7.a(this.mActivity, "", Localization.q(R.string.taobao_app_1005_1_16653), Localization.q(R.string.app_confirm), new e(activateBean), Localization.q(R.string.app_cancel), new f(this));
        }
    }

    public final void I2(ja0 ja0Var) {
        List<ActivateTypedBean> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b35748f", new Object[]{this, ja0Var});
            return;
        }
        if (ja0Var != null && !ja0Var.w) {
            a(ja0Var.y);
            postEvent(ca0.a(ja0Var));
            h2p.c().h(Integer.valueOf(this.b.hashCode()), ja0Var.o);
            Boolean bool = ja0Var.u;
            if (bool != null) {
                AISearchConfigManager.INSTANCE.m(bool.booleanValue());
            }
        }
        if (ja0Var == null || (TextUtils.isEmpty(ja0Var.m) && ((list = ja0Var.g) == null || ((ArrayList) list).size() == 0))) {
            b4p.b("ActivateWidget", "activate cell list is empty");
            AppMonitor.Alarm.commitFail("Page_SearchItemList", "SearchDoorMain", "10001", "EMPTY_RES");
            return;
        }
        if (!ja0Var.w) {
            ((ConcurrentHashMap) this.n).clear();
            Map<String, TemplateBean> map = ja0Var.j;
            if (map != null) {
                ((ConcurrentHashMap) this.n).putAll(map);
            }
            ((ConcurrentHashMap) this.o).putAll(ja0Var.n);
        }
        this.f11645a = ja0Var;
        if (!ja0Var.w) {
            T2(ja0Var.i);
        }
        if (!TextUtils.isEmpty(ja0Var.m)) {
            this.mActivity.runOnUiThread(new k(ja0Var));
        } else {
            ArrayList arrayList = new ArrayList();
            List<ActivateTypedBean> list2 = ja0Var.g;
            if (list2 != null) {
                arrayList.addAll(list2);
            }
            E2(arrayList, ja0Var);
            this.mActivity.runOnUiThread(new l(arrayList));
            b4p.g("ActivateWidget", "需要展示激活页数据:" + ja0Var);
        }
        AppMonitor.Alarm.commitSuccess("Page_SearchItemList", "SearchDoorMain");
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [android.view.View] */
    public final void J2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4dcc909", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            InterceptFrameLayout interceptFrameLayout = this.i;
            if (interceptFrameLayout == null) {
                this.i = new InterceptFrameLayout(getActivity());
                getContainer().addView(this.i, -1, -1);
                this.i.setId(kgw.a());
            } else {
                interceptFrameLayout.setVisibility(0);
                getView().setVisibility(8);
            }
            if (TextUtils.isEmpty(this.l)) {
                this.l = str;
                if (L2(str)) {
                    this.k = WeexContainerFragment.C2(str, str, null, null, null);
                    FragmentTransaction beginTransaction = ((FragmentActivity) getActivity()).getSupportFragmentManager().beginTransaction();
                    beginTransaction.add(this.i.getId(), this.k);
                    beginTransaction.commit();
                    this.i.setOnInterceptTouchEventListener(new m());
                    this.k.Q2(new a());
                    return;
                }
                WeexPageFragment weexPageFragment = (WeexPageFragment) WeexPageFragment.newInstanceWithUrl((FragmentActivity) getActivity(), WeexPageFragment.class, str, str, this.i.getId());
                this.j = weexPageFragment;
                weexPageFragment.setRenderListener(new b());
                this.j.setUserTrackEnable(false);
            }
        }
    }

    public void K2() {
        SearchBarHintBean u;
        ActivateCellBean activateCellBean;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ef45156", new Object[]{this});
        } else if (!o4p.h0()) {
            String g2 = this.b.g();
            Map<String, String> z = this.b.z();
            if (!(!TextUtils.equals(g2, "all") || (u = this.b.u(g2)) == null || (activateCellBean = u.discovery) == null || activateCellBean.activateItems == null)) {
                StringBuilder sb = new StringBuilder();
                for (ActivateBean activateBean : u.discovery.activateItems) {
                    if (sb.length() > 0) {
                        sb.append(";");
                    }
                    sb.append(activateBean.keyword);
                }
                String sb2 = sb.toString();
                if (!TextUtils.isEmpty(sb2)) {
                    z.put("multi_hintq_show", sb2);
                }
            }
            SearchBarHintBean u2 = this.b.u("all");
            if (u2 != null) {
                if (TextUtils.equals(u2.aac, "true")) {
                    z.put("isAacUser", "true");
                }
                if (!TextUtils.isEmpty(u2.iconName)) {
                    z.put(ChangeAppIconBridge.KEY_ICONNAME, u2.iconName);
                }
            }
            D2(z);
            F2(z);
            Q2(g2, this.b.v(), z);
        }
    }

    public final boolean L2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("37161c5d", new Object[]{this, str})).booleanValue();
        }
        return TextUtils.equals(g6p.e(str, h8x.KEY_WEEX_MODE), "dom");
    }

    public final void M2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5102518a", new Object[]{this});
        } else if (this.p && this.q.get()) {
            O2();
        }
    }

    public final void N2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70364e95", new Object[]{this});
            return;
        }
        for (int i2 = 0; i2 < this.e.getItemCount(); i2++) {
            if (this.e.U(i2) instanceof HistoryCellBean) {
                this.e.notifyItemChanged(i2);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View] */
    public final void O2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cb438c9", new Object[]{this});
        } else if (getView() != 0) {
            getView().post(new la0(this));
        }
    }

    public void P2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a08b8954", new Object[]{this, str});
        } else {
            this.g.i(str);
        }
    }

    public void Q2(String str, String str2, Map<String, String> map) {
        ia0 ia0Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c3d5c5a", new Object[]{this, str, str2, map});
            return;
        }
        map.put(r4p.KEY_GRAY_HAIR, String.valueOf("true".equals(getModel().q(r4p.KEY_SEARCH_ELDER_HOME_OPEN))));
        if (map.containsKey("bxFeature")) {
            ia0Var = new ia0(this.c, this.d, "suggest", str, str2, map, MethodEnum.POST);
        } else {
            ia0Var = new ia0(this.c, this.d, "suggest", str, str2, map, MethodEnum.GET);
        }
        new i5p.c().c(ia0Var).b(new ha0(str, this.p)).d(new v5p("Default")).a().e().i(new j()).j().n(new h(), new i(this, i2p.TYPE_ACTIVATE));
    }

    public void R2(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba7d4e52", new Object[]{this, str, str2});
            return;
        }
        this.c = str;
        this.d = str2;
    }

    public void S2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8b4f48c", new Object[]{this});
        } else {
            y90.INSTANCE.h().execute(new g(System.currentTimeMillis()));
        }
    }

    public final void T2(ArrayMap<String, SearchBarHintBean> arrayMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d33697de", new Object[]{this, arrayMap});
        } else if (arrayMap == null) {
            b4p.b("ActivateWidget", "searchBarHintGroup from activate is null");
        } else {
            for (Map.Entry<String, SearchBarHintBean> entry : arrayMap.entrySet()) {
                if (entry == null) {
                    b4p.b("ActivateWidget", "searchBarHintEntry is null");
                } else {
                    this.b.T(entry.getKey(), entry.getValue());
                }
            }
        }
    }

    public final void U2(SearchBarHintBean searchBarHintBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bfea3cb", new Object[]{this, searchBarHintBean});
        } else if (searchBarHintBean != null) {
            R2(searchBarHintBean.displayText, searchBarHintBean.searchText);
        }
    }

    @Override // tb.vnd
    public void Z(WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f3397ed", new Object[]{this, wXSDKInstance});
        } else {
            this.h.b(wXSDKInstance);
        }
    }

    public final void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14a94ff3", new Object[]{this, map});
        } else if (map != null) {
            this.b.Y(map);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View] */
    @Override // tb.phw, tb.khq
    public void findAllViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1d31fad", new Object[]{this});
        } else {
            ViewProxy.setOnTouchListener(getView(), this);
        }
    }

    @Override // tb.abx
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return "ActivateWidget";
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View] */
    public void hide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
            return;
        }
        this.b.I(getActivity(), "suggestPage");
        getView().setVisibility(8);
        InterceptFrameLayout interceptFrameLayout = this.i;
        if (interceptFrameLayout != null) {
            interceptFrameLayout.setVisibility(8);
        }
    }

    @Override // tb.vnd
    public final TemplateBean o1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateBean) ipChange.ipc$dispatch("5cdb49ef", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (TemplateBean) ((ConcurrentHashMap) this.n).get(str);
    }

    @Override // tb.abx
    public void onComponentDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f360aec3", new Object[]{this});
            return;
        }
        super.onComponentDestroy();
        WeexPageFragment weexPageFragment = this.j;
        if (weexPageFragment != null) {
            weexPageFragment.destroyWeex();
        }
        InterceptFrameLayout interceptFrameLayout = this.i;
        if (interceptFrameLayout != null) {
            igw.a(interceptFrameLayout);
        }
    }

    @Override // tb.phw
    public View onCreateView() {
        TRecyclerView tRecyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ebecba09", new Object[]{this});
        }
        if (this.p) {
            this.r = new NestedScrollContainer(this.mActivity);
            RecyclerView recyclerView = new RecyclerView(this.mActivity);
            recyclerView.setNestedScrollingEnabled(true);
            this.r.addView(recyclerView, new FrameLayout.LayoutParams(-1, -1));
            tRecyclerView = recyclerView;
        } else {
            TRecyclerView tRecyclerView2 = new TRecyclerView(this.mActivity);
            tRecyclerView2.addFeature(new SmoothRecyclerScrollFeature());
            tRecyclerView = tRecyclerView2;
        }
        tRecyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        tRecyclerView.setOverScrollMode(2);
        tRecyclerView.setHasFixedSize(true);
        tRecyclerView.setLayoutManager(this.f);
        tRecyclerView.setAdapter(this.e);
        tRecyclerView.setOnTouchListener(this);
        if (tRecyclerView.getItemAnimator() != null) {
            tRecyclerView.getItemAnimator().setChangeDuration(0L);
        }
        tRecyclerView.setRecycledViewPool(new XSRecyclerPool());
        if (this.p) {
            return this.r;
        }
        return tRecyclerView;
    }

    @Override // tb.abx
    public void onCtxDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23655699", new Object[]{this});
            return;
        }
        super.onCtxDestroy();
        h2p.c().e(Integer.valueOf(this.b.hashCode()));
    }

    @Override // tb.abx
    public void onCtxPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11d36495", new Object[]{this});
            return;
        }
        super.onCtxPause();
        this.b.I(getActivity(), "hide");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [android.view.View] */
    @Override // tb.abx
    public void onCtxResume() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf86c1c", new Object[]{this});
            return;
        }
        super.onCtxResume();
        SearchDoorContext searchDoorContext = this.b;
        Activity activity = getActivity();
        if (getView().getVisibility() == 0) {
            str = "activatePage";
        } else {
            str = "suggestPage";
        }
        searchDoorContext.I(activity, str);
        N2();
    }

    public void onEventMainThread(k0p k0pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("448a68e3", new Object[]{this, k0pVar});
        } else {
            U2(k0pVar.f22330a);
        }
    }

    @Override // com.taobao.search.searchdoor.sf.widgets.activate.a.g
    public void onHistoryDeleted(HistoryCellBean historyCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a89c853", new Object[]{this, historyCellBean});
        } else {
            postEvent(ea0.a(historyCellBean));
        }
    }

    @Override // com.taobao.search.searchdoor.sf.widgets.activate.a.g
    public void onHistoryUpdated(HistoryCellBean historyCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("800ee4f5", new Object[]{this, historyCellBean});
            return;
        }
        if (this.f11645a == null) {
            this.f11645a = new ja0();
        }
        List<ActivateTypedBean> dataList = this.e.getDataList();
        if (dataList == null) {
            dataList = new ArrayList<>();
        }
        E2(dataList, this.f11645a);
        N2();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
        }
        if (motionEvent.getAction() == 2) {
            postEvent(h0p.a());
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [android.view.View] */
    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        this.b.I(getActivity(), "activatePage");
        if (this.m) {
            this.b.N(false);
        } else {
            this.b.N(true);
            onHistoryUpdated(this.g.o());
            N2();
        }
        InterceptFrameLayout interceptFrameLayout = this.i;
        if (interceptFrameLayout != null) {
            interceptFrameLayout.setVisibility(0);
        } else if (getView() != 0) {
            getView().setVisibility(0);
        }
    }

    @Override // tb.vnd
    public rpc.c t1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rpc.c) ipChange.ipc$dispatch("ac4c6847", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (rpc.c) ((ConcurrentHashMap) this.o).get(str);
    }

    public void onEventMainThread(l0p l0pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28b435cd", new Object[]{this, l0pVar});
        } else {
            U2(l0pVar.f23041a);
        }
    }

    public void onEventMainThread(i0p i0pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a21771b", new Object[]{this, i0pVar});
        } else if (!i0pVar.b()) {
            hide();
        } else {
            show();
        }
    }

    public void onEventMainThread(x1p x1pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b303c57e", new Object[]{this, x1pVar});
        } else {
            P2(x1pVar.f31074a);
        }
    }

    public void onEventMainThread(ba0 ba0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aeb8323", new Object[]{this, ba0Var});
        } else {
            K2();
        }
    }

    public void onEventMainThread(aa0 aa0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca09b672", new Object[]{this, aa0Var});
        } else {
            H2(aa0Var);
        }
    }

    public void onEventMainThread(da0 da0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff32e2fe", new Object[]{this, da0Var});
        } else {
            G2();
        }
    }
}
