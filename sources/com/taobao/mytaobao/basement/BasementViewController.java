package com.taobao.mytaobao.basement;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridInstanceRenderMode;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.mytaobao.base.MtbGlobalEnv;
import com.taobao.mytaobao.basement.Bridge.MtbBasementWeexApiPlugin;
import com.taobao.mytaobao.basement.weex.BasementFeedDataProvider;
import com.taobao.mytaobao.basement.weex.BasementWeexView;
import com.taobao.mytaobao.scroll.WeexNestedScrollHelper;
import com.taobao.mytaobao.view.MTPtrRecyclerView;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import tb.a8x;
import tb.dgw;
import tb.evd;
import tb.ew;
import tb.h9x;
import tb.hqb;
import tb.l3j;
import tb.o32;
import tb.opc;
import tb.p3j;
import tb.pg1;
import tb.pvh;
import tb.qyd;
import tb.r32;
import tb.r4v;
import tb.ryo;
import tb.s0m;
import tb.s32;
import tb.sc;
import tb.suv;
import tb.sxl;
import tb.t2o;
import tb.t32;
import tb.tvh;
import tb.tyo;
import tb.u32;
import tb.u3j;
import tb.uib;
import tb.uuo;
import tb.uuu;
import tb.uv6;
import tb.v32;
import tb.vib;
import tb.w6o;
import tb.z6t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class BasementViewController implements evd, uib {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final MTPtrRecyclerView f11163a;
    public volatile boolean b;
    public MTBBasementFrameLayout c;
    public MTBBasementContainerView d;
    public final Activity e;
    public boolean f;
    public u32 g;
    public hqb h;
    public RecyclerView.OnScrollListener i;
    public final ew j;
    public BasementExposureManager k;
    public boolean l;
    public boolean m;
    public Runnable n;
    public final i o;
    public final ryo p;
    public final v32 s = new v32();
    public boolean t = false;
    public final h q = new h();
    public final tyo r = new tyo();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f11165a;

        public a(int i) {
            this.f11165a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!BasementViewController.this.I(this.f11165a)) {
                BasementViewController.b(BasementViewController.this).d();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            BasementViewController.d(BasementViewController.this).smoothScrollToPosition(0);
            suv.d(u3j.b, "Page_MyTaobao_click-returnTop", "a2141.7631743.1102.1", null, null);
            if (BasementViewController.q(BasementViewController.this)) {
                BasementViewController.this.F("returnTopTap");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                BasementViewController.d(BasementViewController.this).safeAddEndView(BasementViewController.u(BasementViewController.this), true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ImageView f11168a;
        public final /* synthetic */ int b;

        public d(ImageView imageView, int i) {
            this.f11168a = imageView;
            this.b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!BasementViewController.v(BasementViewController.this)) {
                if (this.f11168a.getVisibility() != 0) {
                    uv6.i("dsw", "加载placeHolder return");
                    return;
                }
                uv6.i("dsw", "加载placeHolder");
                s0m.B().T(uuo.r(this.b)).into(this.f11168a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                BasementViewController.y(BasementViewController.this, "renderSuccessBackground", false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (BasementViewController.z(BasementViewController.this) != null && BasementViewController.B(BasementViewController.this) == null) {
                BasementViewController.C(BasementViewController.this, new BasementExposureManager(BasementViewController.d(BasementViewController.this), BasementViewController.z(BasementViewController.this)));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class h implements vib {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ boolean f11173a;

            public a(boolean z) {
                this.f11173a = z;
            }

            @Override // java.lang.Runnable
            public void run() {
                int i = 0;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (BasementViewController.u(BasementViewController.this) != null) {
                    View findViewById = BasementViewController.u(BasementViewController.this).findViewById(R.id.mtb_back_to_mainpage);
                    if (this.f11173a) {
                        i = 8;
                    }
                    findViewById.setVisibility(i);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                RecyclerView.LayoutManager layoutManager = BasementViewController.d(BasementViewController.this).getLayoutManager();
                if (layoutManager instanceof LinearLayoutManager) {
                    BasementViewController.d(BasementViewController.this).smoothScrollToPosition(((LinearLayoutManager) layoutManager).findLastVisibleItemPosition());
                }
            }
        }

        static {
            t2o.a(745537587);
            t2o.a(745537596);
        }

        public h() {
        }

        @Override // tb.vib
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5fa7b794", new Object[]{this});
            } else {
                BasementViewController.this.U();
            }
        }

        @Override // tb.vib
        public void b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("77a82e66", new Object[]{this, new Boolean(z)});
            } else {
                uuu.a(new a(z));
            }
        }

        @Override // tb.vib
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c65f170a", new Object[]{this});
            } else {
                uuu.a(new b());
            }
        }

        @Override // tb.vib
        public JSONObject d(pvh pvhVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("5c7159ad", new Object[]{this, pvhVar});
            }
            return BasementFeedDataProvider.INSTANCE.B(pvhVar);
        }

        @Override // tb.vib
        public void e(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b1d1cc3e", new Object[]{this, str, str2});
                return;
            }
            if (!TextUtils.isEmpty(str2)) {
                HashMap hashMap = new HashMap();
                hashMap.put("spm-url", str2);
                UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(hashMap);
            }
            Nav.from(BasementViewController.m(BasementViewController.this)).toUri(str);
            MtbGlobalEnv.i = str;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public WeexNestedScrollHelper f11175a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                FrameLayout flEndViewContainer;
                boolean z = false;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                if (BasementViewController.d(BasementViewController.this).getFlEndViewContainer() == null) {
                    flEndViewContainer = BasementViewController.u(BasementViewController.this);
                } else {
                    flEndViewContainer = BasementViewController.d(BasementViewController.this).getFlEndViewContainer();
                }
                int top = flEndViewContainer.getTop();
                qyd S = z6t.S();
                if (BasementViewController.d(BasementViewController.this).getHeight() - top > 0) {
                    z = true;
                }
                S.c(z);
            }
        }

        static {
            t2o.a(745537590);
        }

        public i() {
        }

        public static /* synthetic */ WeexNestedScrollHelper a(i iVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WeexNestedScrollHelper) ipChange.ipc$dispatch("64af38b1", new Object[]{iVar});
            }
            return iVar.f11175a;
        }

        public static /* synthetic */ WeexNestedScrollHelper b(i iVar, WeexNestedScrollHelper weexNestedScrollHelper) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WeexNestedScrollHelper) ipChange.ipc$dispatch("81820297", new Object[]{iVar, weexNestedScrollHelper});
            }
            iVar.f11175a = weexNestedScrollHelper;
            return weexNestedScrollHelper;
        }

        public static /* synthetic */ void c(i iVar, MTBBasementContainerView mTBBasementContainerView, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f554173d", new Object[]{iVar, mTBBasementContainerView, str});
            } else {
                iVar.j(mTBBasementContainerView, str);
            }
        }

        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("226c8326", new Object[]{this});
                return;
            }
            WeexNestedScrollHelper weexNestedScrollHelper = this.f11175a;
            if (weexNestedScrollHelper != null) {
                weexNestedScrollHelper.k();
            }
            this.f11175a = null;
        }

        public JSONObject f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("1c49e2c0", new Object[]{this, str});
            }
            if (BasementViewController.t(BasementViewController.this) == null) {
                return null;
            }
            return BasementViewController.t(BasementViewController.this).a(str);
        }

        public void h(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6045bbfa", new Object[]{this, str, str2});
            } else {
                i(str, str2, 0);
            }
        }

        public void k(String str, JSONObject jSONObject) {
            BasementWeexView basementWeexView;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f530a64d", new Object[]{this, str, jSONObject});
                return;
            }
            if (BasementViewController.z(BasementViewController.this) == null) {
                basementWeexView = null;
            } else {
                basementWeexView = BasementViewController.z(BasementViewController.this).getWeexView();
            }
            if (basementWeexView != null) {
                r32.d(basementWeexView, str, jSONObject);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class b implements o32<WeexInstance> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ MTBBasementContainerView f11177a;
            public final /* synthetic */ String b;
            public final /* synthetic */ BasementWeexView c;
            public final /* synthetic */ String d;
            public final /* synthetic */ int e;
            public final /* synthetic */ int f;

            /* compiled from: Taobao */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
            public class a extends opc {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* compiled from: Taobao */
                /* renamed from: com.taobao.mytaobao.basement.BasementViewController$i$b$a$a  reason: collision with other inner class name */
                /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
                public class View$OnClickListenerC0631a implements View.OnClickListener {
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public View$OnClickListenerC0631a() {
                    }

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                            return;
                        }
                        if (i.a(i.this) != null) {
                            i.a(i.this).k();
                            i.b(i.this, null);
                        }
                        if (b.this.f11177a.getWeexView() != null) {
                            b.this.f11177a.getWeexView().dispose();
                            b bVar = b.this;
                            i.c(i.this, bVar.f11177a, bVar.b);
                        }
                    }
                }

                public a() {
                }

                public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                    int hashCode = str.hashCode();
                    if (hashCode == -871580117) {
                        super.onRenderFailed((com.taobao.android.weex_framework.a) objArr[0], ((Number) objArr[1]).intValue(), (String) objArr[2], ((Boolean) objArr[3]).booleanValue());
                        return null;
                    } else if (hashCode == 724233032) {
                        super.onRenderSuccess((com.taobao.android.weex_framework.a) objArr[0]);
                        return null;
                    } else {
                        int hashCode2 = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/mytaobao/basement/BasementViewController$WeexBasementController$2$1");
                    }
                }

                @Override // tb.opc, tb.npc
                public void onRenderSuccess(com.taobao.android.weex_framework.a aVar) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("2b2aeb48", new Object[]{this, aVar});
                        return;
                    }
                    super.onRenderSuccess(aVar);
                    uv6.i("dsw", sxl.RENDER_SUCCESS_TIME);
                    s32.c().k("TaoFriend_HomePage0");
                    i.b(i.this, new WeexNestedScrollHelper(BasementViewController.d(BasementViewController.this), b.this.c));
                }

                @Override // tb.opc, tb.npc
                public void onRenderFailed(com.taobao.android.weex_framework.a aVar, int i, String str, boolean z) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("cc0cbe2b", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
                        return;
                    }
                    super.onRenderFailed(aVar, i, str, z);
                    uv6.i("dsw", "onRenderFailed");
                    s32.c().j("TaoFriend_HomePage0", String.valueOf(i), str);
                    b.this.f11177a.showErrorPage(new View$OnClickListenerC0631a());
                    if (!z6t.S().d()) {
                        z6t.S().e("WebLoad", z6t.Q());
                        z6t.S().f(3);
                    }
                }
            }

            public b(MTBBasementContainerView mTBBasementContainerView, String str, BasementWeexView basementWeexView, String str2, int i, int i2) {
                this.f11177a = mTBBasementContainerView;
                this.b = str;
                this.c = basementWeexView;
                this.d = str2;
                this.e = i;
                this.f = i2;
            }

            /* renamed from: b */
            public void a(boolean z, String str, WeexInstance weexInstance) {
                tvh tvhVar;
                boolean z2 = true;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("73a2cc39", new Object[]{this, new Boolean(z), str, weexInstance});
                    return;
                }
                if (weexInstance == null) {
                    uv6.l("getWxInstanceFailed");
                    tvhVar = null;
                    z2 = false;
                } else {
                    tvh adapterMUSInstance = ((WeexInstanceImpl) weexInstance).getAdapterMUSInstance();
                    if (adapterMUSInstance == null || !"true".equals(adapterMUSInstance.getTag("mtbRenderSuccess"))) {
                        z2 = false;
                    }
                    uv6.l("getWxInstanceSuccess");
                    tvhVar = adapterMUSInstance;
                }
                TLog.loge("mtbMainLink", "预取weexInstance回调，errorMsg=" + str);
                a aVar = new a();
                this.c.addRenderListener(new a8x());
                this.c.addRenderListener(aVar);
                this.c.setUp(BasementViewController.n(BasementViewController.this).m().getLifecycle(), this.d, this.e, this.f, tvhVar, BasementViewController.n(BasementViewController.this).n().p(), BasementViewController.n(BasementViewController.this).n().q());
                if (z2) {
                    TLog.loge("mtbMainLink", "补发renderSuccess");
                    BasementViewController.this.U();
                }
            }
        }

        public void e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3e62f28", new Object[]{this, str});
                return;
            }
            WeexNestedScrollHelper weexNestedScrollHelper = this.f11175a;
            if (weexNestedScrollHelper != null) {
                weexNestedScrollHelper.h(false);
            }
            if (str.equals("returnTopTap") || str.equals("mtbTabTap") || str.equals("headerTap") || str.equals("mtbTabDoubleTap") || str.equals("backPress")) {
                k(r32.f, null);
            }
        }

        public final void g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("758fad00", new Object[]{this, str});
            } else if (!BasementViewController.h(BasementViewController.this)) {
                BasementViewController.i(BasementViewController.this, true);
                z6t.W("开始创建weex容器");
                FrameLayout frameLayout = (FrameLayout) BasementViewController.u(BasementViewController.this).findViewById(R.id.fl_basement_h5);
                BasementViewController.A(BasementViewController.this, new MTBBasementContainerView(BasementViewController.m(BasementViewController.this)));
                BasementViewController.z(BasementViewController.this).setId(R.id.fl_basement);
                frameLayout.removeAllViews();
                frameLayout.addView(BasementViewController.z(BasementViewController.this), -1, -1);
                BasementViewController.z(BasementViewController.this).setAlpha(0.0f);
                uv6.l("beforeInitData 6.7");
                j(BasementViewController.z(BasementViewController.this), str);
            }
        }

        public void i(String str, String str2, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a8723649", new Object[]{this, str, str2, new Integer(i)});
            } else if (!BasementViewController.e(BasementViewController.this)) {
                BasementViewController.f(BasementViewController.this, true);
                if (MtbGlobalEnv.o == 0) {
                    MtbGlobalEnv.o = System.currentTimeMillis();
                }
                uv6.l("beforeInitData 6.3");
                z6t.S().b("NaitveRender");
                z6t.W("启动淘友圈weex加载任务,来源=" + str);
                sc.b("basementInit");
                uv6.l("beforeInitData 6.4");
                BasementViewController.p(BasementViewController.this);
                uv6.l("beforeInitData 6.5");
                BasementViewController.r(BasementViewController.this, i);
                z6t.S().e("NaitveRender", null);
                g(str2);
                sc.c("basementInit");
            }
        }

        public final void j(MTBBasementContainerView mTBBasementContainerView, String str) {
            int i;
            int i2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fdfb556f", new Object[]{this, mTBBasementContainerView, str});
                return;
            }
            uv6.d("loadBasementWeexView");
            try {
                uv6.l("beforeInitData 6.70");
                String a2 = h9x.a(false, str);
                uv6.l("beforeInitData 6.71");
                BasementViewController.u(BasementViewController.this).post(new a());
                uv6.l("beforeInitData 6.72");
                s32.c().f("TaoFriendNativeWeexLoad", 1.0d);
                s32.c().a(s32.POINT_LOAD_WEB, s32.MEASURE_LOAD_WEB);
                uv6.l("beforeInitData 6.73");
                String uri = Uri.parse(a2).buildUpon().appendQueryParameter("renderMode", UltronTradeHybridInstanceRenderMode.TEXTURE).appendQueryParameter("wx_opaque", "0").build().toString();
                uv6.l("beforeInitData 6.731");
                BasementWeexView basementWeexView = new BasementWeexView(mTBBasementContainerView.getContext());
                uv6.l("beforeInitData 6.74");
                z6t.W("开始loadWeexUrl," + uri);
                uv6.l("beforeInitData 6.75");
                if (BasementViewController.n(BasementViewController.this).j() != null) {
                    i2 = BasementViewController.n(BasementViewController.this).j().getWidth();
                    i = BasementViewController.n(BasementViewController.this).h();
                } else {
                    i2 = 0;
                    i = 0;
                }
                uv6.l("beforeInitData 6.8");
                TLog.loge("mtbMainLink", "预取weexInstance");
                BasementViewController.n(BasementViewController.this).n().s(BasementViewController.n(BasementViewController.this).i(), new b(mTBBasementContainerView, str, basementWeexView, uri, i2, i));
                uv6.l("beforeInitData 6.9");
                mTBBasementContainerView.installWeex(basementWeexView);
                uv6.l("beforeInitData 6.10");
            } catch (Exception e) {
                s32.c().j("TaoFriend_HomePage0", "-1001", e.toString());
            }
            uv6.f();
        }
    }

    static {
        t2o.a(745537578);
        t2o.a(745537607);
        t2o.a(745537553);
    }

    public BasementViewController(MTPtrRecyclerView mTPtrRecyclerView, ew ewVar) {
        uv6.l("controller 0");
        Activity i2 = ewVar.i();
        this.f11163a = mTPtrRecyclerView;
        uv6.l("controller 1");
        this.e = i2;
        this.j = ewVar;
        this.g = new u32(this, i2);
        i iVar = new i();
        this.o = iVar;
        uv6.l("controller 2");
        this.p = new ryo(iVar);
        uv6.l("controller 3");
        uv6.l("controller 4");
    }

    public static /* synthetic */ MTBBasementContainerView A(BasementViewController basementViewController, MTBBasementContainerView mTBBasementContainerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MTBBasementContainerView) ipChange.ipc$dispatch("c1e7f4c", new Object[]{basementViewController, mTBBasementContainerView});
        }
        basementViewController.d = mTBBasementContainerView;
        return mTBBasementContainerView;
    }

    public static /* synthetic */ BasementExposureManager B(BasementViewController basementViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BasementExposureManager) ipChange.ipc$dispatch("f4cb4539", new Object[]{basementViewController});
        }
        return basementViewController.k;
    }

    public static /* synthetic */ BasementExposureManager C(BasementViewController basementViewController, BasementExposureManager basementExposureManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BasementExposureManager) ipChange.ipc$dispatch("6b90f0a5", new Object[]{basementViewController, basementExposureManager});
        }
        basementViewController.k = basementExposureManager;
        return basementExposureManager;
    }

    public static /* synthetic */ u32 b(BasementViewController basementViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u32) ipChange.ipc$dispatch("87bd851c", new Object[]{basementViewController});
        }
        return basementViewController.g;
    }

    public static /* synthetic */ u32 c(BasementViewController basementViewController, u32 u32Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u32) ipChange.ipc$dispatch("7ab7b4d6", new Object[]{basementViewController, u32Var});
        }
        basementViewController.g = u32Var;
        return u32Var;
    }

    public static /* synthetic */ MTPtrRecyclerView d(BasementViewController basementViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MTPtrRecyclerView) ipChange.ipc$dispatch("5afecd27", new Object[]{basementViewController});
        }
        return basementViewController.f11163a;
    }

    public static /* synthetic */ boolean e(BasementViewController basementViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f87ce671", new Object[]{basementViewController})).booleanValue();
        }
        return basementViewController.l;
    }

    public static /* synthetic */ boolean f(BasementViewController basementViewController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("388c338d", new Object[]{basementViewController, new Boolean(z)})).booleanValue();
        }
        basementViewController.l = z;
        return z;
    }

    public static /* synthetic */ boolean g(BasementViewController basementViewController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f301d40e", new Object[]{basementViewController, new Boolean(z)})).booleanValue();
        }
        basementViewController.m = z;
        return z;
    }

    public static /* synthetic */ boolean h(BasementViewController basementViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4847d2f", new Object[]{basementViewController})).booleanValue();
        }
        return basementViewController.b;
    }

    public static /* synthetic */ boolean i(BasementViewController basementViewController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad77748f", new Object[]{basementViewController, new Boolean(z)})).booleanValue();
        }
        basementViewController.b = z;
        return z;
    }

    public static /* synthetic */ Runnable j(BasementViewController basementViewController, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("5e97f68e", new Object[]{basementViewController, runnable});
        }
        basementViewController.n = runnable;
        return runnable;
    }

    public static /* synthetic */ void k(BasementViewController basementViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("108c13e9", new Object[]{basementViewController});
        } else {
            basementViewController.T();
        }
    }

    public static /* synthetic */ RecyclerView.OnScrollListener l(BasementViewController basementViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.OnScrollListener) ipChange.ipc$dispatch("b1036563", new Object[]{basementViewController});
        }
        return basementViewController.i;
    }

    public static /* synthetic */ Activity m(BasementViewController basementViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("56b72e61", new Object[]{basementViewController});
        }
        return basementViewController.e;
    }

    public static /* synthetic */ ew n(BasementViewController basementViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ew) ipChange.ipc$dispatch("38713d17", new Object[]{basementViewController});
        }
        return basementViewController.j;
    }

    public static /* synthetic */ i o(BasementViewController basementViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("70f4675e", new Object[]{basementViewController});
        }
        return basementViewController.o;
    }

    public static /* synthetic */ void p(BasementViewController basementViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e9f0cc4", new Object[]{basementViewController});
        } else {
            basementViewController.S();
        }
    }

    public static /* synthetic */ boolean q(BasementViewController basementViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9d30afe", new Object[]{basementViewController})).booleanValue();
        }
        return basementViewController.f;
    }

    public static /* synthetic */ void r(BasementViewController basementViewController, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab5ec9d5", new Object[]{basementViewController, new Integer(i2)});
        } else {
            basementViewController.H(i2);
        }
    }

    public static /* synthetic */ boolean s(BasementViewController basementViewController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("91faa0a0", new Object[]{basementViewController, new Boolean(z)})).booleanValue();
        }
        basementViewController.f = z;
        return z;
    }

    public static /* synthetic */ v32 t(BasementViewController basementViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v32) ipChange.ipc$dispatch("b19abdab", new Object[]{basementViewController});
        }
        return basementViewController.s;
    }

    public static /* synthetic */ MTBBasementFrameLayout u(BasementViewController basementViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MTBBasementFrameLayout) ipChange.ipc$dispatch("7278cbf", new Object[]{basementViewController});
        }
        return basementViewController.c;
    }

    public static /* synthetic */ boolean v(BasementViewController basementViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d5daa1bc", new Object[]{basementViewController})).booleanValue();
        }
        return basementViewController.t;
    }

    public static /* synthetic */ ryo w(BasementViewController basementViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ryo) ipChange.ipc$dispatch("2ca6a58f", new Object[]{basementViewController});
        }
        return basementViewController.p;
    }

    public static /* synthetic */ void x(BasementViewController basementViewController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a65891e", new Object[]{basementViewController, new Boolean(z)});
        } else {
            basementViewController.Q(z);
        }
    }

    public static /* synthetic */ void y(BasementViewController basementViewController, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7653c55", new Object[]{basementViewController, str, new Boolean(z)});
        } else {
            basementViewController.E(str, z);
        }
    }

    public static /* synthetic */ MTBBasementContainerView z(BasementViewController basementViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MTBBasementContainerView) ipChange.ipc$dispatch("ad5beaab", new Object[]{basementViewController});
        }
        return basementViewController.d;
    }

    public final void E(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6722dfdc", new Object[]{this, str, new Boolean(z)});
        } else if (!this.f && this.m && this.d != null) {
            this.f = true;
            BasementExposureManager basementExposureManager = this.k;
            if (basementExposureManager != null) {
                basementExposureManager.c(true);
            }
            if (this.h != null) {
                t32.b().c(str, this.j);
                this.h.a();
            }
            r32.b(this.d, true, z);
            r4v.a(s32.MODULE_NAME, 19997, "enterBasementCheck", Integer.valueOf(com.taobao.mytaobao.basement.a.d() ? 1 : 0), str, null);
        }
    }

    public void F(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd3005be", new Object[]{this, str});
        } else if (this.f && this.m && this.d != null) {
            this.o.e(str);
            this.f = false;
            BasementExposureManager basementExposureManager = this.k;
            if (basementExposureManager != null) {
                basementExposureManager.c(false);
            }
            r32.b(this.d, false, false);
            if (this.h != null) {
                t32.b().d(str, this.j);
                this.h.c();
            }
        }
    }

    public i G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("b956cf29", new Object[]{this});
        }
        return this.o;
    }

    public boolean J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd89b4be", new Object[]{this})).booleanValue();
        }
        return this.l;
    }

    public void K(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("944987b8", new Object[]{this, str});
            return;
        }
        w6o w6oVar = new w6o();
        w6oVar.f30487a = true;
        V(w6oVar);
        this.o.h("initByMTop", str);
    }

    public void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.t = true;
        V(w6o.b);
    }

    public void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b8f9ee7", new Object[]{this});
        } else {
            this.r.c();
        }
    }

    public void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("caf0acc3", new Object[]{this});
            return;
        }
        TLog.loge("basementLog", "onDowngradeToOldBasementContainer触发resetData, thread=" + Thread.currentThread().getName());
        V(w6o.b);
    }

    public void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3251f996", new Object[]{this});
            return;
        }
        TLog.loge("basementLog", "onRemoveBasementContainer触发resetData, thread=" + Thread.currentThread().getName());
        V(w6o.b);
    }

    public void P() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        StringBuilder sb = new StringBuilder("Basement onResume,renderSuccess=");
        sb.append(this.m);
        sb.append(",view=");
        if (this.d == null) {
            str = pg1.ATOM_EXT_Null;
        } else {
            str = "notNull";
        }
        sb.append(str);
        TLog.loge(t32.TAG, sb.toString());
        Runnable runnable = this.n;
        if (runnable != null) {
            runnable.run();
            this.n = null;
        }
    }

    public void R(hqb hqbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d9acb1f", new Object[]{this, hqbVar});
        } else {
            this.h = hqbVar;
        }
    }

    public final void S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8578757e", new Object[]{this});
            return;
        }
        MtbBasementWeexApiPlugin.setBasementWeexBridgeAbility(this.q, this.j.m());
        RecyclerView.OnScrollListener onScrollListener = new RecyclerView.OnScrollListener() { // from class: com.taobao.mytaobao.basement.BasementViewController.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass5 r5, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == -1177043419) {
                    super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                    return null;
                } else if (hashCode == 1361287682) {
                    super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                    return null;
                } else {
                    int hashCode2 = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/mytaobao/basement/BasementViewController$5");
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i2)});
                    return;
                }
                super.onScrollStateChanged(recyclerView, i2);
                BasementViewController.w(BasementViewController.this).e(i2);
                if (i2 == 0) {
                    BasementViewController.this.r.e(false);
                } else {
                    BasementViewController.this.r.e(true);
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i2), new Integer(i3)});
                    return;
                }
                super.onScrolled(recyclerView, i2, i3);
                if (i3 < 0) {
                    BasementViewController.x(BasementViewController.this, true);
                } else if (i3 > 0) {
                    BasementViewController.x(BasementViewController.this, false);
                }
            }
        };
        this.i = onScrollListener;
        this.f11163a.addOnScrollListener(onScrollListener);
    }

    public final void T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fa5a177", new Object[]{this});
            return;
        }
        BasementExposureManager basementExposureManager = this.k;
        if (basementExposureManager != null) {
            basementExposureManager.b();
            this.k = null;
        }
    }

    public void V(w6o w6oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1efffd7", new Object[]{this, w6oVar});
            return;
        }
        TLog.loge("basementLog", "resetData, thread=" + Thread.currentThread().getName());
        uuu.a(new g(w6oVar));
    }

    public void W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22248188", new Object[]{this});
            return;
        }
        BasementExposureManager basementExposureManager = this.k;
        if (basementExposureManager != null) {
            basementExposureManager.c.d(false);
        }
    }

    public void X(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fe400b9", new Object[]{this, new Integer(i2)});
        } else {
            this.f11163a.post(new a(i2));
        }
    }

    @Override // tb.uib
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4544ba49", new Object[]{this})).booleanValue();
        }
        return this.f;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ w6o f11171a;

        public g(w6o w6oVar) {
            this.f11171a = w6oVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            TLog.loge("basementLog", "real resetData");
            BasementViewController.f(BasementViewController.this, false);
            BasementViewController.g(BasementViewController.this, false);
            BasementViewController.i(BasementViewController.this, false);
            BasementViewController.j(BasementViewController.this, null);
            BasementViewController.s(BasementViewController.this, false);
            BasementViewController.k(BasementViewController.this);
            if (BasementViewController.z(BasementViewController.this) != null) {
                BasementViewController.z(BasementViewController.this).onDestroy();
                BasementViewController.A(BasementViewController.this, null);
            }
            if (BasementViewController.l(BasementViewController.this) != null) {
                BasementViewController.d(BasementViewController.this).removeOnScrollListener(BasementViewController.l(BasementViewController.this));
            }
            BasementViewController.d(BasementViewController.this).resetBasementData();
            TLog.loge("basementWeexLog", "resetData scrollEnable=true");
            BasementViewController.d(BasementViewController.this).setScrollEnable(true);
            BasementViewController.b(BasementViewController.this).c();
            if (!this.f11171a.f30487a) {
                BasementViewController basementViewController = BasementViewController.this;
                BasementViewController basementViewController2 = BasementViewController.this;
                BasementViewController.c(basementViewController, new u32(basementViewController2, BasementViewController.m(basementViewController2)));
            }
            BasementFeedDataProvider.INSTANCE.z(this.f11171a.f30487a);
            com.taobao.mytaobao.basement.a k = BasementViewController.n(BasementViewController.this).k();
            if (k != null) {
                k.o();
            }
            BasementViewController.o(BasementViewController.this).d();
            BasementViewController.w(BasementViewController.this).b();
            l3j.INSTANCE.w();
        }
    }

    public void D(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ec017e4", new Object[]{this, new Integer(i2)});
        } else if (i2 == 0 && this.l) {
            O();
        } else if (1 == i2 && this.l) {
            N();
        } else if (3 == i2 && !this.l) {
            String b2 = com.taobao.mytaobao.basement.a.b();
            if (!TextUtils.isEmpty(b2)) {
                K(b2);
            } else {
                z6t.W("【错误】检查容器状态，weexUrl=null");
            }
        }
    }

    public final void H(int i2) {
        int i3;
        int i4;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e093a3a", new Object[]{this, new Integer(i2)});
            return;
        }
        this.c = (MTBBasementFrameLayout) View.inflate(this.e, R.layout.mtb_second_floor_opt, null);
        uv6.l("beforeInitData 6.51");
        this.c.setTag(dgw.APM_VIEW_TOKEN, dgw.APM_VIEW_VALID);
        int h2 = this.j.h();
        if (i2 > 0) {
            i3 = i2;
        } else if (this.j.j() != null) {
            i3 = this.j.j().getWidth();
        } else {
            i3 = this.f11163a.getWidth();
        }
        uv6.l("beforeInitData 6.52");
        boolean z2 = h2 > 0;
        if (i3 <= 0) {
            z = false;
        }
        if (z && z2) {
            TLog.loge("basementWeexLog", "setLayoutParams 第一次初始化basementHeight, 有值," + h2);
            this.c.setLayoutParams(new ViewGroup.MarginLayoutParams(i3, h2));
        }
        uv6.l("beforeInitData 6.53");
        ImageView imageView = (ImageView) this.c.findViewById(R.id.basement_background_pic);
        TUrlImageView tUrlImageView = (TUrlImageView) this.c.findViewById(R.id.mtb_back_to_mainpage);
        tUrlImageView.setOnClickListener(new b());
        uv6.l("beforeInitData 6.54");
        uuu.a(new c());
        uv6.l("beforeInitData 6.55");
        this.f11163a.setBasementView(this.c);
        tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i3/O1CN0102AGvY1sfhbYFAQhR_!!6000000005794-2-tps-78-78.png");
        if (TextUtils.equals("2", MtbGlobalEnv.c()) || TextUtils.equals("3", MtbGlobalEnv.c())) {
            i4 = R.drawable.mtb_basement_placeholder2;
        } else {
            i4 = R.drawable.mtb_basement_placeholder;
        }
        imageView.setVisibility(0);
        uv6.l("beforeInitData 6.56");
        uv6.i("dsw", "准备加载placeHolder");
        p3j.a(new d(imageView, i4), 1000L);
        uv6.l("beforeInitData 6.57");
        X(i2);
        uv6.l("beforeInitData 6.6");
    }

    public boolean I(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2099de0", new Object[]{this, new Integer(i2)})).booleanValue();
        }
        int h2 = this.j.h();
        if (this.c.getLayoutParams() != null && this.c.getLayoutParams().height > 0) {
            if (this.c.getLayoutParams().height == h2) {
                TLog.loge("basementWeexLog", "optimizeInitBasementSize, height没变化，return");
                if (!MtbGlobalEnv.s()) {
                    return true;
                }
            } else {
                TLog.loge("basementWeexLog", "optimizeInitBasementSize, height有变化，old=" + this.c.getLayoutParams().height + ",new=" + h2);
            }
        }
        if (i2 <= 0) {
            i2 = this.f11163a.getWidth();
        }
        if (h2 == 0 || i2 == 0) {
            return false;
        }
        TLog.loge("basementWeexLog", "optimizeInitBasementSize, setLayoutHeight, " + h2 + " width=" + i2);
        this.c.setParamsWidthAndHeight(i2, h2);
        return true;
    }

    public final void Q(boolean z) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f76b389", new Object[]{this, new Boolean(z)});
        } else if (this.b) {
            boolean canScrollVertically = this.f11163a.canScrollVertically(1);
            boolean isCloseToTheBottom = this.f11163a.isCloseToTheBottom();
            if (!canScrollVertically && !this.f && !z) {
                if (this.f11163a.calcVerticalScrollOffset() > 0) {
                    z2 = false;
                }
                E("scroll", z2);
            } else if (z && !isCloseToTheBottom && this.f) {
                F("scroll");
            }
        }
    }

    public void U() {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fa7b794", new Object[]{this});
        } else if (this.d != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isDowngradePrestrain", (Object) Integer.valueOf(com.taobao.mytaobao.basement.a.g() ? 1 : 0));
            z6t.S().e("WebLoad", jSONObject);
            this.m = true;
            ImageView imageView = (ImageView) this.c.findViewById(R.id.basement_background_pic);
            imageView.setImageDrawable(null);
            z6t.W("收到前端renderSuccess");
            imageView.setVisibility(8);
            if (this.f11163a.canScrollVertically(1) || this.f) {
                z = false;
            }
            int calcVerticalScrollOffset = this.f11163a.calcVerticalScrollOffset();
            if (z && calcVerticalScrollOffset <= 0) {
                z = false;
            }
            if (z) {
                if (this.j.m().isResumed()) {
                    E("renderSuccessForeground", false);
                } else {
                    this.n = new e();
                }
            }
            this.d.setAlpha(1.0f);
            this.c.post(new f());
            sc.c("basementRender");
            s32.c().e();
            z6t.W("renderSuccess");
        }
    }
}
