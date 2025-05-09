package com.alibaba.triver.triver_shop.newShop.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.ext.BizExtKt;
import com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.nav.Nav;
import com.taobao.flowcustoms.afc.AfcCustomSdk;
import com.taobao.taobao.R;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveLifeCycleEnum;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenBizCodeEnum;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenLiveRoom;
import com.taobao.taolive.room.openarchitecture.listener.PlatformListenerEnum;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.ut.mini.UTAnalytics;
import java.util.Hashtable;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import tb.a07;
import tb.a1v;
import tb.aqp;
import tb.bmc;
import tb.brf;
import tb.ckf;
import tb.d1a;
import tb.dzd;
import tb.g1a;
import tb.jbt;
import tb.jpu;
import tb.kew;
import tb.kqu;
import tb.lbt;
import tb.njg;
import tb.npp;
import tb.q4q;
import tb.qbt;
import tb.r54;
import tb.t2o;
import tb.ups;
import tb.v2d;
import tb.v3i;
import tb.wpd;
import tb.x2d;
import tb.xhv;
import tb.yj4;
import tb.yrk;
import tb.z9u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class Tab3LiveContentRender implements wpd, dzd, v2d, x2d, LifecycleObserver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f3165a;
    public final ups b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;
    public boolean g;
    public TaoliveOpenLiveRoom h;
    public View i;
    public ViewGroup j;
    public final njg k;
    public final boolean l;
    public final boolean m;
    public final njg n;
    public final int o;
    public LiveStatus p;
    public final View q;
    public final njg r;
    public final Tab3LiveContentRender$liveRoomStatusChangeListener$1 s;
    public final boolean t;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class LiveStatus extends Enum<LiveStatus> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final LiveStatus LIVING = new LiveStatus("LIVING", 0);
        public static final LiveStatus ERROR = new LiveStatus("ERROR", 1);
        public static final LiveStatus END = new LiveStatus("END", 2);
        public static final LiveStatus RETRY_LOADING = new LiveStatus("RETRY_LOADING", 3);
        private static final /* synthetic */ LiveStatus[] $VALUES = $values();

        private static final /* synthetic */ LiveStatus[] $values() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (LiveStatus[]) ipChange.ipc$dispatch("ca6c62db", new Object[0]) : new LiveStatus[]{LIVING, ERROR, END, RETRY_LOADING};
        }

        private LiveStatus(String str, int i) {
        }

        public static /* synthetic */ Object ipc$super(LiveStatus liveStatus, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/Tab3LiveContentRender$LiveStatus");
        }

        public static LiveStatus valueOf(String str) {
            Object valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                valueOf = ipChange.ipc$dispatch("14d92806", new Object[]{str});
            } else {
                valueOf = Enum.valueOf(LiveStatus.class, str);
            }
            return (LiveStatus) valueOf;
        }

        public static LiveStatus[] values() {
            Object clone;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                clone = ipChange.ipc$dispatch("554aeb7", new Object[0]);
            } else {
                clone = $VALUES.clone();
            }
            return (LiveStatus[]) clone;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a extends yrk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/Tab3LiveContentRender$doLiveRoomInit$1");
        }

        @Override // tb.yrk
        public void z(Map<String, String> map) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4c9cacc9", new Object[]{this, map});
            } else if (map != null && (str = map.get("isMuted")) != null) {
                ShopDataParser o = Tab3LiveContentRender.x(Tab3LiveContentRender.this).o();
                ShopDataParser.g Q0 = o == null ? null : o.Q0();
                if (Q0 != null) {
                    Q0.c(ckf.b(str, "true"));
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements q4q {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.q4q
        public final void onSmallWindowClick(View view, String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("265e0e99", new Object[]{this, view, str, str2, str3});
                return;
            }
            ShopDataParser o = Tab3LiveContentRender.x(Tab3LiveContentRender.this).o();
            if (o != null && o.W0() != null) {
                Tab3LiveContentRender tab3LiveContentRender = Tab3LiveContentRender.this;
                ShopDataParser o2 = Tab3LiveContentRender.x(tab3LiveContentRender).o();
                String str4 = null;
                Nav from = Nav.from(o2 == null ? null : o2.Q());
                StringBuilder sb = new StringBuilder("https://shop");
                ShopDataParser o3 = Tab3LiveContentRender.x(tab3LiveContentRender).o();
                if (o3 != null) {
                    str4 = o3.W0();
                }
                sb.append((Object) str4);
                sb.append(".taobao.com?shop_navi=live");
                from.toUri(sb.toString());
            }
        }
    }

    static {
        t2o.a(766509754);
        t2o.a(766509633);
        t2o.a(806355757);
        t2o.a(806355734);
        t2o.a(806355736);
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [com.alibaba.triver.triver_shop.newShop.view.Tab3LiveContentRender$liveRoomStatusChangeListener$1] */
    public Tab3LiveContentRender(Context context, ups upsVar, boolean z, boolean z2) {
        ckf.g(context, "context");
        ckf.g(upsVar, "tabBarItemDataModel");
        this.f3165a = context;
        this.b = upsVar;
        this.c = z;
        this.t = z2;
        this.d = "PageShop_LiveWatch";
        this.e = "a2141.b49677444";
        this.f = "https://img.alicdn.com/imgextra/i2/O1CN01rZcLuK236rJa0IcKT_!!6000000007207-2-tps-52-20.png";
        this.k = kotlin.a.b(new Tab3LiveContentRender$rootView$2(this));
        aqp.a aVar = aqp.Companion;
        this.l = aVar.s0();
        this.m = aVar.C0();
        this.n = kotlin.a.b(new Tab3LiveContentRender$shopHeaderExtraView$2(this));
        kew.P(Integer.valueOf(aVar.J0(40)));
        this.o = kew.P(Integer.valueOf(aVar.I0(36)));
        this.p = LiveStatus.LIVING;
        View K = kew.K(context, R.layout.view_tab3_live_loading_layout);
        if (K == null) {
            K = null;
        } else {
            TUrlImageView tUrlImageView = (TUrlImageView) K.findViewById(R.id.view_tab3_live_progress_icon);
            if (tUrlImageView != null) {
                tUrlImageView.setImageUrl("https://img.alicdn.com/imgextra/i2/O1CN01Lz8fBP1FtCKzfI6Ig_!!6000000000544-54-tps-72-72.apng");
                tUrlImageView.setSkipAutoSize(true);
            }
            xhv xhvVar = xhv.INSTANCE;
        }
        this.q = K;
        this.r = kotlin.a.b(new Tab3LiveContentRender$liveErrorView$2(this));
        this.s = new bmc() { // from class: com.alibaba.triver.triver_shop.newShop.view.Tab3LiveContentRender$liveRoomStatusChangeListener$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.z2d
            public void g() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("dcbec7b7", new Object[]{this});
                } else {
                    npp.Companion.b("tab3 onPrelive");
                }
            }

            @Override // tb.a3d
            public void h() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("79dc178c", new Object[]{this});
                    return;
                }
                npp.Companion.b("tab3 liveRoomUserLeave");
                Tab3LiveContentRender.this.K();
            }

            @Override // tb.y2d
            public void i() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ae1f44ae", new Object[]{this});
                    return;
                }
                npp.Companion.b("tab3 playerError");
                Tab3LiveContentRender.this.K();
            }

            @Override // tb.y2d
            public void j() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c610301b", new Object[]{this});
                    return;
                }
                npp.Companion.b("tab3 playerFirstFrameRender");
                if (Tab3LiveContentRender.r(Tab3LiveContentRender.this)) {
                    r54.C(new Tab3LiveContentRender$liveRoomStatusChangeListener$1$playerFirstFrameRender$1(Tab3LiveContentRender.this));
                } else {
                    Tab3LiveContentRender.this.L();
                }
            }

            @Override // tb.z2d
            public void k() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f9880272", new Object[]{this});
                } else {
                    npp.Companion.b("tab3 onLive");
                }
            }

            @Override // tb.w2d
            public void l() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("da11895b", new Object[]{this});
                } else {
                    npp.Companion.b("tab3 onStreamPlay");
                }
            }

            @Override // tb.a3d
            public void o() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ab030dfb", new Object[]{this});
                    return;
                }
                npp.Companion.b("tab3 liveRoomEnd");
                Tab3LiveContentRender.this.J();
            }

            @Override // tb.w2d
            public void q() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c3bffdd", new Object[]{this});
                    return;
                }
                npp.Companion.b("tab3 streamPause");
                Tab3LiveContentRender.this.K();
            }

            @Override // tb.z2d
            public void r() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7ebae02d", new Object[]{this});
                    return;
                }
                npp.Companion.b("tab3 onReplay");
                Tab3LiveContentRender.this.J();
            }
        };
    }

    public static final /* synthetic */ void A(Tab3LiveContentRender tab3LiveContentRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2afcc8d", new Object[]{tab3LiveContentRender});
        } else {
            tab3LiveContentRender.O();
        }
    }

    public static final /* synthetic */ void B(Tab3LiveContentRender tab3LiveContentRender, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f938b14", new Object[]{tab3LiveContentRender, new Boolean(z)});
        } else {
            tab3LiveContentRender.P(z);
        }
    }

    public static final /* synthetic */ void o(Tab3LiveContentRender tab3LiveContentRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52276565", new Object[]{tab3LiveContentRender});
        } else {
            tab3LiveContentRender.C();
        }
    }

    public static final /* synthetic */ Context q(Tab3LiveContentRender tab3LiveContentRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("d7b0df11", new Object[]{tab3LiveContentRender});
        }
        return tab3LiveContentRender.f3165a;
    }

    public static final /* synthetic */ boolean r(Tab3LiveContentRender tab3LiveContentRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab108a5c", new Object[]{tab3LiveContentRender})).booleanValue();
        }
        return tab3LiveContentRender.m;
    }

    public static final /* synthetic */ LiveStatus u(Tab3LiveContentRender tab3LiveContentRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveStatus) ipChange.ipc$dispatch("b0732661", new Object[]{tab3LiveContentRender});
        }
        return tab3LiveContentRender.p;
    }

    public static final /* synthetic */ View v(Tab3LiveContentRender tab3LiveContentRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("dd7a2489", new Object[]{tab3LiveContentRender});
        }
        return tab3LiveContentRender.q;
    }

    public static final /* synthetic */ String w(Tab3LiveContentRender tab3LiveContentRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b73b9729", new Object[]{tab3LiveContentRender});
        }
        return tab3LiveContentRender.f;
    }

    public static final /* synthetic */ ups x(Tab3LiveContentRender tab3LiveContentRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ups) ipChange.ipc$dispatch("f88137a1", new Object[]{tab3LiveContentRender});
        }
        return tab3LiveContentRender.b;
    }

    public static final /* synthetic */ TaoliveOpenLiveRoom y(Tab3LiveContentRender tab3LiveContentRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoliveOpenLiveRoom) ipChange.ipc$dispatch("72d43e55", new Object[]{tab3LiveContentRender});
        }
        return tab3LiveContentRender.h;
    }

    public static final /* synthetic */ FrameLayout z(Tab3LiveContentRender tab3LiveContentRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("fa0c8d72", new Object[]{tab3LiveContentRender});
        }
        return tab3LiveContentRender.I();
    }

    public final void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc819f40", new Object[]{this});
            return;
        }
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.h;
        if (taoliveOpenLiveRoom != null) {
            taoliveOpenLiveRoom.callPlatform(PlatformListenerEnum.callReportAction, new Object[0]);
        }
    }

    public final View F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("eff6d054", new Object[]{this});
        }
        return (View) this.r.getValue();
    }

    public final FrameLayout G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("f5b37835", new Object[]{this});
        }
        return (FrameLayout) this.k.getValue();
    }

    public final View H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("d77aa9c5", new Object[]{this});
        }
        return (View) this.n.getValue();
    }

    public final void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("879aaf64", new Object[]{this});
            return;
        }
        LiveStatus liveStatus = this.p;
        LiveStatus liveStatus2 = LiveStatus.ERROR;
        if (liveStatus != liveStatus2) {
            this.p = liveStatus2;
            N(false);
            View F = F();
            if (F != null) {
                kew.h(F);
            }
            ViewGroup viewGroup = this.j;
            if (viewGroup != null) {
                viewGroup.addView(F());
            }
            View view = this.q;
            if (view != null) {
                kew.h(view);
            }
        }
    }

    public final void L() {
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f50be4be", new Object[]{this});
            return;
        }
        LiveStatus liveStatus = this.p;
        LiveStatus liveStatus2 = LiveStatus.LIVING;
        if (liveStatus != liveStatus2) {
            this.p = liveStatus2;
            N(true);
            if (!(F().getParent() == null || (viewGroup = this.j) == null)) {
                viewGroup.removeView(F());
            }
            M();
        }
    }

    public final void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("568fe89f", new Object[]{this});
            return;
        }
        View view = this.q;
        if (view != null) {
            kew.h(view);
        }
    }

    public final void N(boolean z) {
        ShopDataParser.b w0;
        g1a<Boolean, xhv> f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a84f283", new Object[]{this, new Boolean(z)});
            return;
        }
        ShopDataParser o = this.b.o();
        if (o != null && (w0 = o.w0()) != null && (f = w0.f()) != null) {
            f.invoke(Boolean.valueOf(z));
        }
    }

    public final void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90c0b918", new Object[]{this});
            return;
        }
        View F = F();
        ckf.f(F, "liveErrorView");
        kew.h(F);
        ViewGroup viewGroup = this.j;
        if (viewGroup != null) {
            View view = this.q;
            if (view != null) {
                kew.a(viewGroup, view);
            } else {
                return;
            }
        }
        this.p = LiveStatus.RETRY_LOADING;
        r54.E(new Tab3LiveContentRender$showRetryLoading$1(this), 5000L);
    }

    @Override // tb.wpd
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c090532a", new Object[]{this})).booleanValue();
        }
        return this.g;
    }

    @Override // tb.v2d
    public void b(String str, String str2, String str3) {
        ShopDataParser.b w0;
        g1a<Boolean, xhv> c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22ad806b", new Object[]{this, str, str2, str3});
            return;
        }
        ShopDataParser o = this.b.o();
        if (o != null && (w0 = o.w0()) != null && (c = w0.c()) != null) {
            c.invoke(Boolean.TRUE);
        }
    }

    @Override // tb.v2d
    public void c(String str, String str2, String str3) {
        ShopDataParser.b w0;
        g1a<Boolean, xhv> c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a59b963a", new Object[]{this, str, str2, str3});
            return;
        }
        ShopDataParser o = this.b.o();
        if (o != null && (w0 = o.w0()) != null && (c = w0.c()) != null) {
            c.invoke(Boolean.FALSE);
        }
    }

    @Override // tb.x2d
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae2dbcc", new Object[]{this});
        }
    }

    @Override // tb.wpd
    public void destroyView() {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a84ec6", new Object[]{this});
            return;
        }
        try {
            G().removeAllViews();
            TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.h;
            if (taoliveOpenLiveRoom != null) {
                taoliveOpenLiveRoom.callLifeCycle(TaoliveLifeCycleEnum.onWillDisappear, null);
            }
            TaoliveOpenLiveRoom taoliveOpenLiveRoom2 = this.h;
            if (taoliveOpenLiveRoom2 != null) {
                taoliveOpenLiveRoom2.callLifeCycle(TaoliveLifeCycleEnum.onDidDisappear, null);
            }
            TaoliveOpenLiveRoom taoliveOpenLiveRoom3 = this.h;
            if (taoliveOpenLiveRoom3 != null) {
                taoliveOpenLiveRoom3.callLifeCycle(TaoliveLifeCycleEnum.onDestory, null);
            }
            obj = Result.m1108constructorimpl(xhv.INSTANCE);
        } catch (Throwable th) {
            obj = Result.m1108constructorimpl(kotlin.b.a(th));
        }
        Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
        if (th2 != null) {
            npp.Companion.c("catching block has error", th2);
        }
    }

    @Override // tb.v2d
    public void e(boolean z) {
        ShopDataParser.b w0;
        g1a<Boolean, xhv> b2;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dcea941", new Object[]{this, new Boolean(z)});
            return;
        }
        View H = H();
        if (H != null) {
            if (z) {
                i = 8;
            }
            H.setVisibility(i);
        }
        ShopDataParser o = this.b.o();
        if (o != null && (w0 = o.w0()) != null && (b2 = w0.b()) != null) {
            b2.invoke(Boolean.valueOf(z));
        }
    }

    @Override // tb.dzd
    public Float f() {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Float) ipChange.ipc$dispatch("9548d518", new Object[]{this});
        }
        ShopDataParser o = this.b.o();
        if (o == null) {
            f = 0.0f;
        } else {
            f = o.m0();
        }
        return Float.valueOf(f);
    }

    @Override // tb.wpd
    public void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f577597a", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    @Override // tb.wpd
    public View getContentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ce219891", new Object[]{this});
        }
        kew.h(G());
        kew.Y(G());
        return G();
    }

    @Override // tb.wpd
    public void h(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c682d848", new Object[]{this, new Float(f)});
        } else {
            wpd.a.f(this, f);
        }
    }

    @Override // tb.wpd
    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("975ab1a6", new Object[]{this})).booleanValue();
        }
        return wpd.a.e(this);
    }

    @Override // tb.wpd
    public void j() {
        ShopDataParser.b w0;
        g1a<Boolean, xhv> e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f8288af", new Object[]{this});
            return;
        }
        wpd.a.c(this);
        r54.E(new Tab3LiveContentRender$onViewSelectedByViewPager$1(this), 400L);
        ShopDataParser o = this.b.o();
        if (!(o == null || (w0 = o.w0()) == null || (e = w0.e()) == null)) {
            e.invoke(Boolean.TRUE);
        }
        try {
            ShopExtKt.F(this.b.o());
            TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.h;
            D();
            if (taoliveOpenLiveRoom != null) {
                JSONObject E = E();
                TaoliveOpenLiveRoom taoliveOpenLiveRoom2 = this.h;
                if (taoliveOpenLiveRoom2 != null) {
                    taoliveOpenLiveRoom2.callLifeCycle(TaoliveLifeCycleEnum.onCreate, E);
                }
                TaoliveOpenLiveRoom taoliveOpenLiveRoom3 = this.h;
                if (taoliveOpenLiveRoom3 != null) {
                    taoliveOpenLiveRoom3.callLifeCycle(TaoliveLifeCycleEnum.onWillAppear, null);
                }
                TaoliveOpenLiveRoom taoliveOpenLiveRoom4 = this.h;
                if (taoliveOpenLiveRoom4 != null) {
                    taoliveOpenLiveRoom4.callLifeCycle(TaoliveLifeCycleEnum.onDidAppear, null);
                }
            }
        } catch (Throwable th) {
            npp.Companion.d(th);
            K();
        }
        View H = H();
        ckf.f(H, "shopHeaderExtraView");
        kew.g0(H);
    }

    @Override // tb.wpd
    public void k() {
        Object obj;
        ShopDataParser.b w0;
        g1a<Boolean, xhv> e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("345056d6", new Object[]{this});
            return;
        }
        wpd.a.d(this);
        ShopDataParser o = this.b.o();
        if (!(o == null || (w0 = o.w0()) == null || (e = w0.e()) == null)) {
            e.invoke(Boolean.FALSE);
        }
        try {
            TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.h;
            if (taoliveOpenLiveRoom != null) {
                taoliveOpenLiveRoom.callLifeCycle(TaoliveLifeCycleEnum.onPause, null);
            }
            TaoliveOpenLiveRoom taoliveOpenLiveRoom2 = this.h;
            if (taoliveOpenLiveRoom2 != null) {
                taoliveOpenLiveRoom2.callLifeCycle(TaoliveLifeCycleEnum.onStop, null);
            }
            TaoliveOpenLiveRoom taoliveOpenLiveRoom3 = this.h;
            if (taoliveOpenLiveRoom3 != null) {
                taoliveOpenLiveRoom3.callLifeCycle(TaoliveLifeCycleEnum.onDestory, null);
            }
            obj = Result.m1108constructorimpl(xhv.INSTANCE);
        } catch (Throwable th) {
            obj = Result.m1108constructorimpl(kotlin.b.a(th));
        }
        Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
        if (th2 != null) {
            npp.Companion.c("catching block has error", th2);
        }
        Q();
        UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(this.f3165a);
    }

    @Override // tb.dzd
    public Float l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Float) ipChange.ipc$dispatch("6afaae6e", new Object[]{this});
        }
        float f = 0.0f;
        if (!this.t) {
            return Float.valueOf(0.0f);
        }
        ShopDataParser o = this.b.o();
        if (o != null) {
            f = o.l0();
        }
        return Float.valueOf(f + this.o);
    }

    @Override // tb.dzd
    public View m() {
        ShopDataParser.ShopViewContext m1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fda446e1", new Object[]{this});
        }
        ShopDataParser o = this.b.o();
        ViewGroup viewGroup = null;
        if (!(o == null || (m1 = o.m1()) == null)) {
            viewGroup = m1.o();
        }
        if (viewGroup != null) {
            return viewGroup;
        }
        View decorView = ((Activity) this.f3165a).getWindow().getDecorView();
        ckf.f(decorView, "context as Activity).window.decorView");
        return decorView;
    }

    @Override // tb.x2d
    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b00893f", new Object[]{this});
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onActivityFinish() {
        FragmentActivity fragmentActivity;
        Lifecycle lifecycle;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8226c848", new Object[]{this});
            return;
        }
        Context context = this.f3165a;
        if (context instanceof FragmentActivity) {
            fragmentActivity = (FragmentActivity) context;
        } else {
            fragmentActivity = null;
        }
        if (fragmentActivity != null && (lifecycle = fragmentActivity.getLifecycle()) != null) {
            lifecycle.removeObserver(this);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onActivityPaused() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3aec0f63", new Object[]{this});
        } else if (a()) {
            Q();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public final void onActivityStart() {
        Object obj;
        TaoliveOpenLiveRoom taoliveOpenLiveRoom;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b48c417b", new Object[]{this});
            return;
        }
        try {
            if (this.l && a() && (taoliveOpenLiveRoom = this.h) != null) {
                taoliveOpenLiveRoom.callLifeCycle(TaoliveLifeCycleEnum.onStart, null);
            }
            obj = Result.m1108constructorimpl(xhv.INSTANCE);
        } catch (Throwable th) {
            obj = Result.m1108constructorimpl(kotlin.b.a(th));
        }
        Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
        if (th2 != null) {
            npp.Companion.c("catching block has error", th2);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onActivityStop() {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ac47b7", new Object[]{this});
            return;
        }
        try {
            TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.h;
            if (taoliveOpenLiveRoom != null) {
                taoliveOpenLiveRoom.callLifeCycle(TaoliveLifeCycleEnum.onStop, null);
            }
            obj = Result.m1108constructorimpl(xhv.INSTANCE);
        } catch (Throwable th) {
            obj = Result.m1108constructorimpl(kotlin.b.a(th));
        }
        Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
        if (th2 != null) {
            npp.Companion.c("catching block has error", th2);
        }
    }

    @Override // tb.wpd
    public void onPause() {
        TaoliveOpenLiveRoom taoliveOpenLiveRoom;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        wpd.a.a(this);
        if (a() && (taoliveOpenLiveRoom = this.h) != null) {
            taoliveOpenLiveRoom.callLifeCycle(TaoliveLifeCycleEnum.onPause, null);
        }
    }

    @Override // tb.wpd
    public void onResume() {
        TaoliveOpenLiveRoom taoliveOpenLiveRoom;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        wpd.a.b(this);
        if (a() && (taoliveOpenLiveRoom = this.h) != null) {
            taoliveOpenLiveRoom.callLifeCycle(TaoliveLifeCycleEnum.onResume, null);
        }
    }

    @Override // tb.x2d
    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa10b06d", new Object[]{this});
        }
    }

    @Override // tb.x2d
    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f0ba0ba", new Object[]{this});
        }
    }

    @Override // tb.v2d
    public void t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aed10667", new Object[]{this, str});
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class VerticalSwipeDetectorLayout extends FrameLayout {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private boolean alreadyDetect;
        private float startX;
        private float startY;
        public final /* synthetic */ Tab3LiveContentRender this$0;
        private final int touchSlop;

        static {
            t2o.a(766509756);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VerticalSwipeDetectorLayout(Tab3LiveContentRender tab3LiveContentRender, Context context) {
            super(context);
            ckf.g(tab3LiveContentRender, "this$0");
            ckf.g(context, "context");
            this.this$0 = tab3LiveContentRender;
            this.touchSlop = ViewConfiguration.get(context).getScaledTouchSlop() * 2;
        }

        public static /* synthetic */ Object ipc$super(VerticalSwipeDetectorLayout verticalSwipeDetectorLayout, String str, Object... objArr) {
            if (str.hashCode() == 2075560917) {
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/Tab3LiveContentRender$VerticalSwipeDetectorLayout");
        }

        public final boolean getAlreadyDetect() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f13b2770", new Object[]{this})).booleanValue();
            }
            return this.alreadyDetect;
        }

        public final float getStartX() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("8ff8f9a3", new Object[]{this})).floatValue();
            }
            return this.startX;
        }

        public final float getStartY() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("90071124", new Object[]{this})).floatValue();
            }
            return this.startY;
        }

        public final int getTouchSlop() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("aa4b321d", new Object[]{this})).intValue();
            }
            return this.touchSlop;
        }

        public final void setAlreadyDetect(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cd55faf4", new Object[]{this, new Boolean(z)});
            } else {
                this.alreadyDetect = z;
            }
        }

        public final void setStartX(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("58c17e1", new Object[]{this, new Float(f)});
            } else {
                this.startX = f;
            }
        }

        public final void setStartY(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("740f080", new Object[]{this, new Float(f)});
            } else {
                this.startY = f;
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
            }
            if (motionEvent == null) {
                return false;
            }
            if (kew.E(motionEvent)) {
                this.startX = motionEvent.getX();
                this.startY = motionEvent.getY();
                this.alreadyDetect = false;
            }
            if (kew.F(motionEvent) && !this.alreadyDetect && Math.abs(motionEvent.getY() - this.startY) > Math.abs(motionEvent.getX() - this.startX) && r54.c(this.startX, this.startY, motionEvent.getX(), motionEvent.getY()) > this.touchSlop) {
                this.alreadyDetect = true;
                a1v.o("PageShop_LiveWatch", "swipe_up_and_down", null, 4, null);
            }
            return super.dispatchTouchEvent(motionEvent);
        }
    }

    public final FrameLayout I() {
        View findViewById;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("63cf053b", new Object[]{this});
        }
        View inflate = View.inflate(this.f3165a, R.layout.view_tab3_live_root_layout, null);
        if (inflate != null) {
            FrameLayout frameLayout = (FrameLayout) inflate;
            View findViewById2 = frameLayout.findViewById(R.id.view_tab3_live_mask);
            this.i = findViewById2;
            if (!(findViewById2 == null || (findViewById = findViewById2.findViewById(R.id.view_shop_tab_3_top_gray_shadow)) == null)) {
                ShopDataParser o = this.b.o();
                if (o != null && o.M1()) {
                    findViewById.setBackgroundResource(R.drawable.view_flagshop_tab3_live_header_bg);
                    kew.e(findViewById, kew.P(364));
                } else {
                    kew.e(findViewById, kew.P(150));
                }
            }
            if (this.c) {
                View findViewById3 = frameLayout.findViewById(R.id.bottomMask);
                ckf.f(findViewById3, "frameLayout.findViewById<View>(R.id.bottomMask)");
                kew.C(findViewById3);
            }
            this.j = (ViewGroup) frameLayout.findViewById(R.id.shop_view_tab3_container);
            frameLayout.setBackgroundColor(Color.parseColor("#363b47"));
            VerticalSwipeDetectorLayout verticalSwipeDetectorLayout = new VerticalSwipeDetectorLayout(this, this.f3165a);
            kew.a(verticalSwipeDetectorLayout, frameLayout);
            return verticalSwipeDetectorLayout;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
    }

    public final JSONObject E() {
        ShopDataParser.f P0;
        ShopDataParser o;
        ShopDataParser.g Q0;
        Object E0;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("217ba0ad", new Object[]{this});
        }
        JSONObject i = this.b.i();
        String str = null;
        if (i == null) {
            return null;
        }
        JSONObject jSONObject = (JSONObject) i.clone();
        ShopDataParser o2 = this.b.o();
        JSONObject k = brf.k((o2 == null || (E0 = o2.E0("live")) == null) ? null : E0.toString());
        if (k != null) {
            jSONObject.putAll(k);
            ShopDataParser o3 = this.b.o();
            if (o3 != null) {
                o3.p2("live");
            }
        }
        ShopDataParser o4 = this.b.o();
        jSONObject.put((JSONObject) "shop_id", o4 == null ? null : o4.W0());
        ShopDataParser o5 = this.b.o();
        if (o5 != null) {
            str = o5.N0();
        }
        jSONObject.put((JSONObject) "seller_id", str);
        jSONObject.put((JSONObject) "shop_spm", this.e);
        ShopDataParser o6 = this.b.o();
        if (!(o6 == null || (P0 = o6.P0()) == null || !P0.c() || (o = this.b.o()) == null || (Q0 = o.Q0()) == null)) {
            z = Q0.a();
        }
        jSONObject.put((JSONObject) yj4.PARAM_IS_LIVE_MUTE, (String) Boolean.valueOf(z));
        return jSONObject;
    }

    public final void P(boolean z) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e093322f", new Object[]{this, new Boolean(z)});
            return;
        }
        Hashtable hashtable = new Hashtable();
        String h = this.b.h();
        if (h == null) {
            ShopDataParser o = this.b.o();
            h = o == null ? null : o.N0();
        }
        hashtable.put("accountId", h);
        String str = "";
        hashtable.put("accountType", str);
        JSONObject i = this.b.i();
        if (!(i == null || (string = i.getString("livesource")) == null)) {
            str = string;
        }
        hashtable.put("followSource", str);
        if (z) {
            TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.h;
            if (taoliveOpenLiveRoom != null) {
                taoliveOpenLiveRoom.callPlatform(PlatformListenerEnum.onFollowAction, hashtable);
                return;
            }
            return;
        }
        TaoliveOpenLiveRoom taoliveOpenLiveRoom2 = this.h;
        if (taoliveOpenLiveRoom2 != null) {
            taoliveOpenLiveRoom2.callPlatform(PlatformListenerEnum.onUnfollowAciton, hashtable);
        }
    }

    public final void Q() {
        Object callPlatform;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2587d24", new Object[]{this});
            return;
        }
        ShopDataParser o = this.b.o();
        String str = null;
        Pair a2 = jpu.a("seller_id", o == null ? null : o.N0());
        ShopDataParser o2 = this.b.o();
        Pair a3 = jpu.a("shop_id", o2 == null ? null : o2.W0());
        ShopDataParser o3 = this.b.o();
        Map<String, String> k = kotlin.collections.a.k(a2, a3, jpu.a(z9u.KEY_ACCOUNT_ID, o3 == null ? null : o3.N0()));
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.h;
        if (!(taoliveOpenLiveRoom == null || (callPlatform = taoliveOpenLiveRoom.callPlatform(PlatformListenerEnum.callFetchUTArgsWithParams, new Object[0])) == null || !(callPlatform instanceof Map))) {
            Map<String, String> T = r54.T((Map) callPlatform);
            if (T.containsValue("spm-url") && kqu.m(T)) {
                T.remove("spm-url");
            }
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(this.f3165a, T);
        }
        a1v.i(this.f3165a, this.e, this.d);
        UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(this.f3165a, k);
        Context context = this.f3165a;
        ShopDataParser o4 = this.b.o();
        if (o4 != null) {
            str = o4.s0();
        }
        a1v.g(context, "identityCode", str);
        UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(kotlin.collections.a.k(jpu.a("spm-url", this.e)));
    }

    public final void D() {
        Lifecycle lifecycle;
        d1a<Integer> L0;
        Integer invoke;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1b09949", new Object[]{this});
        } else if (this.h == null) {
            Map<String, Object> f = v3i.f(jpu.a("aliveChanel", "TaoBaoShopTab"));
            lbt lbtVar = new lbt();
            lbtVar.h(this);
            lbtVar.g(this.s);
            lbtVar.i(this);
            lbtVar.f(new a());
            jbt b2 = qbt.h().b(this.f3165a, TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_ShopTab3.toString(), this, lbtVar, f);
            qbt.h().g(b2);
            this.h = qbt.h().c(b2);
            ShopDataParser o = this.b.o();
            int intValue = (o == null || (L0 = o.L0()) == null || (invoke = L0.invoke()) == null) ? 0 : invoke.intValue();
            int i = intValue == 0 ? -1 : intValue;
            FrameLayout G = G();
            View H = H();
            int p = kew.p(Float.valueOf(20.0f));
            ShopDataParser o2 = this.b.o();
            G.addView(H, kew.l(0, p, (o2 == null ? 0 : o2.m0()) + kew.P(20), 0, kew.P(Float.valueOf(12.0f)), 0, 0, 105, null));
            ViewGroup viewGroup = this.j;
            ckf.d(viewGroup);
            viewGroup.addView(qbt.h().d(b2, this.h), kew.j(0, i, 0, 0, 0, 0, 0, 125, null));
            JSONObject E = E();
            TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.h;
            if (taoliveOpenLiveRoom != null) {
                taoliveOpenLiveRoom.callLifeCycle(TaoliveLifeCycleEnum.onCreate, E);
            }
            TaoliveOpenLiveRoom taoliveOpenLiveRoom2 = this.h;
            FragmentActivity fragmentActivity = null;
            if (taoliveOpenLiveRoom2 != null) {
                taoliveOpenLiveRoom2.callLifeCycle(TaoliveLifeCycleEnum.onWillAppear, null);
            }
            TaoliveOpenLiveRoom taoliveOpenLiveRoom3 = this.h;
            if (taoliveOpenLiveRoom3 != null) {
                taoliveOpenLiveRoom3.callLifeCycle(TaoliveLifeCycleEnum.onDidAppear, null);
            }
            Map f2 = v3i.f(jpu.a(DataReceiveMonitor.CB_LISTENER, new b()));
            TaoliveOpenLiveRoom taoliveOpenLiveRoom4 = this.h;
            if (taoliveOpenLiveRoom4 != null) {
                taoliveOpenLiveRoom4.callPlatform(PlatformListenerEnum.setSmallWindowClickListener, f2);
            }
            ShopDataParser o3 = this.b.o();
            ShopDataParser.b w0 = o3 == null ? null : o3.w0();
            if (w0 != null) {
                w0.j(new Tab3LiveContentRender$doLiveRoomInit$2(this));
            }
            ShopDataParser o4 = this.b.o();
            ShopDataParser.b w02 = o4 == null ? null : o4.w0();
            if (w02 != null) {
                w02.g(new Tab3LiveContentRender$doLiveRoomInit$3(this));
            }
            Context context = this.f3165a;
            if (context instanceof FragmentActivity) {
                fragmentActivity = (FragmentActivity) context;
            }
            if (fragmentActivity != null && (lifecycle = fragmentActivity.getLifecycle()) != null) {
                lifecycle.addObserver(this);
            }
        }
    }

    public final void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75e4f5f7", new Object[]{this});
            return;
        }
        LiveStatus liveStatus = this.p;
        LiveStatus liveStatus2 = LiveStatus.END;
        if (liveStatus != liveStatus2) {
            this.p = liveStatus2;
            N(false);
            String str = null;
            View inflate = View.inflate(this.f3165a, R.layout.view_tab3_live_end_layout, null);
            ViewGroup viewGroup = this.j;
            if (viewGroup != null) {
                viewGroup.removeAllViews();
            }
            ViewGroup viewGroup2 = this.j;
            if (viewGroup2 != null) {
                viewGroup2.addView(inflate, kew.j(0, 0, 0, 0, 0, 0, 0, 127, null));
            }
            Context context = this.f3165a;
            ShopDataParser o = this.b.o();
            if (o != null) {
                str = o.N0();
            }
            BizExtKt.h(context, "mtop.mediaplatform.live.getshopliveinfoList", AfcCustomSdk.SDK_VERSION, kotlin.collections.a.k(jpu.a("sellerId", str), jpu.a("pre", "true")), new Tab3LiveContentRender$onLiveEnd$1(inflate, this), Tab3LiveContentRender$onLiveEnd$2.INSTANCE, false, false, false, null, false, null, null, 8128, null);
        }
    }

    public /* synthetic */ Tab3LiveContentRender(Context context, ups upsVar, boolean z, boolean z2, int i, a07 a07Var) {
        this(context, upsVar, (i & 4) != 0 ? false : z, (i & 8) != 0 ? true : z2);
    }
}
