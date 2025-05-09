package com.taobao.android.icart.engine;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.alibaba.ability.hub.AbilityHubAdapter;
import com.alibaba.ability.localization.Localization;
import com.alibaba.ability.localization.constants.Language;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.android.icart.core.QueryParamsManager;
import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.alibaba.android.icart.core.performance.cache.CartFirstPageCache;
import com.alibaba.android.icart.core.view.ViewManager;
import com.alibaba.android.nextrpc.request.AttachedResponse;
import com.alibaba.android.nextrpc.stream.internal.response.StreamRemoteMainResponse;
import com.alibaba.android.ultron.trade.data.request.DataInfo;
import com.alibaba.android.ultron.trade.data.request.PageInfo;
import com.alibaba.android.ultron.vfw.core.ViewEngine;
import com.alibaba.android.ultron.vfw.viewholder.BundleLineComponent;
import com.alibaba.android.ultron.vfw.viewholder.RecyclerViewHolder;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.android.detail2.core.framework.view.manager.ListViewManager;
import com.taobao.android.icart.broadcast.CartWVBroadcast;
import com.taobao.android.icart.broadcast.MainAddCartEventHandler;
import com.taobao.android.icart.manager.CartPopupWindowManager;
import com.taobao.android.icart.manager.ListTopManager;
import com.taobao.android.icart.recommend.CartRecommendRefreshScene;
import com.taobao.android.icart.theme.CartThemeManager;
import com.taobao.android.icart.utils.DxRegisterUtil;
import com.taobao.android.icart.utils.ICartWVService;
import com.taobao.android.icart.widget.CartRecyclerView;
import com.taobao.android.icart.widget.ScrollInstanceLinearLayoutManager;
import com.taobao.android.icart.widget.touch.DragFloatLayer;
import com.taobao.android.icart.widget.touch.DragManager;
import com.taobao.android.icart.widget.touch.DragParentFrameLayout;
import com.taobao.android.icart.widget.touch.TipsLineFollower;
import com.taobao.android.opencart.broadcast.CartRefreshCheckBroadcast;
import com.taobao.android.opencart.broadcast.TBCartWVService;
import com.taobao.android.tbelder.TBElder;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.ptr.PtrBase;
import com.taobao.ptr.PullBase;
import com.taobao.tao.Globals;
import com.taobao.tao.TBMainHost;
import com.taobao.taobao.R;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import mtopsdk.mtop.domain.MtopResponse;
import tb.ac4;
import tb.bd3;
import tb.blq;
import tb.c9x;
import tb.ce3;
import tb.cqv;
import tb.ct1;
import tb.de3;
import tb.ed3;
import tb.epx;
import tb.et6;
import tb.f8e;
import tb.fd3;
import tb.fsb;
import tb.fsw;
import tb.g8e;
import tb.guk;
import tb.hav;
import tb.hb3;
import tb.hmb;
import tb.i1z;
import tb.i2b;
import tb.ic3;
import tb.imb;
import tb.ir6;
import tb.jc3;
import tb.je3;
import tb.juv;
import tb.kc3;
import tb.kmb;
import tb.la3;
import tb.lcu;
import tb.lj9;
import tb.lof;
import tb.lu;
import tb.ly;
import tb.m9v;
import tb.mc3;
import tb.mmi;
import tb.na3;
import tb.neb;
import tb.o6g;
import tb.p38;
import tb.pav;
import tb.pb6;
import tb.q70;
import tb.qb3;
import tb.ra3;
import tb.rhx;
import tb.s2d;
import tb.sc;
import tb.sca;
import tb.sf7;
import tb.sgv;
import tb.t2o;
import tb.u55;
import tb.u60;
import tb.ub3;
import tb.ux;
import tb.v9v;
import tb.vav;
import tb.vc3;
import tb.vqm;
import tb.vxm;
import tb.x55;
import tb.xq;
import tb.xw7;
import tb.yc3;
import tb.ykl;
import tb.ypj;
import tb.yua;
import tb.z9v;
import tb.zgp;
import tb.zq;
import tb.zxb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class CartVEngine implements f8e, g8e, Localization.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final long A;
    public boolean B;
    public volatile f8e.a C;
    public volatile boolean D;
    public volatile boolean E;
    public Bundle F;
    public final AtomicBoolean G;
    public final AtomicBoolean H;
    public mmi I;
    public boolean J;
    public boolean K;
    public DragFloatLayer<String> L;
    public DragParentFrameLayout M;
    public final z9v N;
    public String O;
    public ListTopManager P;
    public ux Q;
    public final boolean R;
    public final boolean S;
    public final ypj T;
    public final AtomicLong U;

    /* renamed from: a  reason: collision with root package name */
    public PtrBase f7951a;
    public CartRecyclerView b;
    public View c;
    public kmb d;
    public zxb e;
    public RecyclerView f;
    public lu g;
    public zgp h;
    public vqm i;
    public LinearLayout j;
    public yua k;
    public CartThemeManager l;
    public long m;
    public long n;
    public int o;
    public MainAddCartEventHandler p;
    public CartWVBroadcast q;
    public fd3 r;
    public boolean s;
    public long t;
    public boolean u;
    public OnScreenChangedListener v;
    public Activity w;
    public Fragment x;
    public View y;
    public final boolean z;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b extends ly<RecyclerView> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/engine/CartVEngine$11");
        }

        /* renamed from: b */
        public void a(RecyclerView recyclerView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2de3ba5", new Object[]{this, recyclerView});
            } else if (recyclerView != null) {
                CartVEngine.t(CartVEngine.this, recyclerView);
                CartVEngine.s(CartVEngine.this).setTag(i2b.VIEW_PROVIDER_RECOMMEND_CONTAINER);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c extends ux {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            if (str.hashCode() == 1688447688) {
                super.l((fsb) objArr[0], (StreamRemoteMainResponse) objArr[1], (List) objArr[2]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/engine/CartVEngine$12");
        }

        @Override // tb.ojd
        public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ddd7a0a5", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
                return;
            }
            CartVEngine.w(CartVEngine.this, false);
            CartVEngine.x(CartVEngine.this).n(true);
        }

        @Override // tb.ojd
        public void b(int i, MtopResponse mtopResponse, Object obj, fsb fsbVar, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e4ca5d12", new Object[]{this, new Integer(i), mtopResponse, obj, fsbVar, map});
                return;
            }
            CartVEngine.w(CartVEngine.this, true);
            CartVEngine.x(CartVEngine.this).n(true);
        }

        @Override // tb.ux
        public void h(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8700e9de", new Object[]{this, new Integer(i), mtopResponse, obj});
            } else {
                CartVEngine.x(CartVEngine.this).n(true);
            }
        }

        @Override // tb.ux
        public void l(fsb fsbVar, StreamRemoteMainResponse streamRemoteMainResponse, List<AttachedResponse> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("64a3aac8", new Object[]{this, fsbVar, streamRemoteMainResponse, list});
                return;
            }
            super.l(fsbVar, streamRemoteMainResponse, list);
            CartVEngine.w(CartVEngine.this, true);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements ScrollInstanceLinearLayoutManager.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        public void a(RecyclerView.State state) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dd702081", new Object[]{this, state});
                return;
            }
            CartVEngine.z(CartVEngine.this);
            i1z.b(CartVEngine.m(CartVEngine.this));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements neb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // tb.neb
        public void a(List<IDMComponent> list, RecyclerViewHolder recyclerViewHolder, int i) {
            View view;
            int i2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ae0ba1b", new Object[]{this, list, recyclerViewHolder, new Integer(i)});
                return;
            }
            lof.a(CartVEngine.O(CartVEngine.this), list, recyclerViewHolder, i);
            if (i < list.size()) {
                IDMComponent iDMComponent = list.get(i);
                if (CartVEngine.k(CartVEngine.this).B().u() && (iDMComponent instanceof BundleLineComponent) && (view = recyclerViewHolder.itemView) != null && view.getLayoutParams() != null) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (i == 0) {
                        int i3 = sca.i(CartVEngine.k(CartVEngine.this));
                        if (i3 != -1) {
                            i2 = CartVEngine.O(CartVEngine.this).e().d0(i3);
                        } else {
                            i2 = CartVEngine.O(CartVEngine.this).e().d0(3.0f);
                        }
                    } else {
                        i2 = pb6.f(CartVEngine.B(CartVEngine.this), 9.0f);
                    }
                    if (layoutParams.height != i2) {
                        layoutParams.height = i2;
                        view.setLayoutParams(layoutParams);
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class f implements CartRecyclerView.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // com.taobao.android.icart.widget.CartRecyclerView.c
        public void a() {
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aaaaf3ef", new Object[]{this});
                return;
            }
            if (TBMainHost.b().getContext() == CartVEngine.this.getActivity()) {
                z = true;
            }
            kmb O = CartVEngine.O(CartVEngine.this);
            juv.d(O, "Page_ShoppingCart_LoadMore", "isMain=" + z);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class g implements PtrBase.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a extends ux {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/engine/CartVEngine$18$1");
            }

            @Override // tb.ojd
            public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ddd7a0a5", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
                } else {
                    CartVEngine.x(CartVEngine.this).n(true);
                }
            }

            @Override // tb.ojd
            public void b(int i, MtopResponse mtopResponse, Object obj, fsb fsbVar, Map<String, ?> map) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("e4ca5d12", new Object[]{this, new Integer(i), mtopResponse, obj, fsbVar, map});
                    return;
                }
                if (CartVEngine.k(CartVEngine.this).K()) {
                    CartVEngine.k(CartVEngine.this).r();
                    ac4.a(CartVEngine.O(CartVEngine.this));
                    ir6.g((u55) fsbVar);
                    ir6.h(fsbVar, CartVEngine.B(CartVEngine.this));
                }
                CartVEngine.x(CartVEngine.this).n(true);
            }

            @Override // tb.ux
            public void h(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8700e9de", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                CartVEngine.X(CartVEngine.this, "onPullStartToRefresh#onRejectResponse").refreshComplete("");
                CartVEngine.x(CartVEngine.this).n(true);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class b extends ux {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public b() {
            }

            public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/engine/CartVEngine$18$2");
            }

            @Override // tb.ojd
            public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ddd7a0a5", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
                }
            }

            @Override // tb.ojd
            public void b(int i, MtopResponse mtopResponse, Object obj, fsb fsbVar, Map<String, ?> map) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("e4ca5d12", new Object[]{this, new Integer(i), mtopResponse, obj, fsbVar, map});
                }
            }

            @Override // tb.ux
            public void h(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8700e9de", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    CartVEngine.X(CartVEngine.this, "onPullEndToRefresh#onRejectResponse").refreshComplete("");
                }
            }
        }

        public g() {
        }

        @Override // com.taobao.ptr.PtrBase.e
        public void a(PtrBase ptrBase) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc9b6974", new Object[]{this, ptrBase});
                return;
            }
            boolean g = CartVEngine.x(CartVEngine.this).g();
            if (g || !CartVEngine.x(CartVEngine.this).f()) {
                CartVEngine.m(CartVEngine.this).resetScroll();
                hav.d(c9x.CART_BIZ_NAME, "正在预加载下一页或者首屏请求还没成功，不允许上拉加载更多,prefetching：" + g);
                return;
            }
            hav.g(c9x.CART_BIZ_NAME, "CartVEngine", ListViewManager.PULL_END_PULL_LOAD_MORE_TEXT);
            CartVEngine.O(CartVEngine.this).f0(false, null, new b());
        }

        @Override // com.taobao.ptr.PtrBase.e
        public void b(PtrBase ptrBase) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("da00fd4d", new Object[]{this, ptrBase});
                return;
            }
            i1z.a();
            z9v u = z9v.u(CartVEngine.this.getActivity());
            ic3.i(CartVEngine.this.getActivity(), "mtop.trade.query.bag");
            u.e("isPullToRefresh", "true");
            u.D("apmClientBeforeNetworkLogicProcess", null);
            if (CartVEngine.J(CartVEngine.this) == 0) {
                CartVEngine.L(CartVEngine.this, System.currentTimeMillis());
            }
            if (CartVEngine.k(CartVEngine.this).J() && TBMainHost.b().getContext() == CartVEngine.this.getActivity()) {
                CartVEngine.O(CartVEngine.this).W().a();
            }
            CartVEngine.k(CartVEngine.this).s();
            CartVEngine.C(CartVEngine.this).setVisibility(8);
            CartVEngine.O(CartVEngine.this).i0(false, null, new a());
            kmb O = CartVEngine.O(CartVEngine.this);
            StringBuilder sb = new StringBuilder("isFirst=");
            if (CartVEngine.I(CartVEngine.this) != 1) {
                z = false;
            }
            sb.append(z);
            juv.d(O, "Page_ShoppingCart_Refresh", sb.toString(), "interval=" + (System.currentTimeMillis() - (CartVEngine.M(CartVEngine.this) / 1000.0d)), "intervalFromLoad=" + (System.currentTimeMillis() - CartVEngine.K(CartVEngine.this)), "refreshCount=" + CartVEngine.I(CartVEngine.this), "cartItemCount=" + sca.s(CartVEngine.k(CartVEngine.this)));
            CartVEngine.N(CartVEngine.this, System.currentTimeMillis());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class h implements PullBase.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        @Override // com.taobao.ptr.PullBase.e
        public void a(PullBase pullBase, int i) {
            boolean z = true;
            int i2 = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e50fea3f", new Object[]{this, pullBase, new Integer(i)});
                return;
            }
            CartVEngine cartVEngine = CartVEngine.this;
            if (i == 0) {
                z = false;
            }
            CartVEngine.E(cartVEngine, z);
            View C = CartVEngine.C(CartVEngine.this);
            if (!CartVEngine.D(CartVEngine.this)) {
                i2 = 8;
            }
            C.setVisibility(i2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class i implements lj9.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i() {
        }

        @Override // tb.lj9.c
        public void onError() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("11bc4f70", new Object[]{this});
                return;
            }
            CartVEngine.n(CartVEngine.this, false);
            if (CartVEngine.y(CartVEngine.this) != null) {
                CartVEngine.y(CartVEngine.this).b(CartVEngine.this);
            } else {
                ub3.g("prefetchLoadCallbackError", "onError mPrefetchResult=null");
            }
        }

        @Override // tb.lj9.c
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
                return;
            }
            if (CartVEngine.k(CartVEngine.this).c() != null) {
                CartVEngine.n(CartVEngine.this, true);
            }
            if (CartVEngine.y(CartVEngine.this) != null) {
                CartVEngine.y(CartVEngine.this).a(CartVEngine.this);
                et6 l = CartVEngine.k(CartVEngine.this).B().l();
                if (l != null) {
                    ViewEngine t = CartVEngine.O(CartVEngine.this).e().t();
                    t.N().n(l.e());
                    t.C();
                    List<IDMComponent> components = CartVEngine.k(CartVEngine.this).c() != null ? CartVEngine.k(CartVEngine.this).c().getComponents() : null;
                    ra3.c(CartVEngine.O(CartVEngine.this), components, "prefetch");
                    ra3.e(CartVEngine.O(CartVEngine.this), components);
                    return;
                }
                return;
            }
            ub3.g("prefetchLoadCallbackError", "onSuccess mPrefetchResult=null");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class j implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            juv.b(CartVEngine.O(CartVEngine.this), "Page_ShoppingCart_Float_ScrollToTop", new String[0]);
            CartVEngine.this.scrollToTop();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class k implements s2d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public k(CartVEngine cartVEngine) {
        }

        @Override // tb.s2d
        public void onCallback(ExecuteResult executeResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
            } else if (executeResult instanceof ErrorResult) {
                hav.a("CartVEngine", "关闭失败");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class l implements OnScreenChangedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public l() {
        }

        @Override // com.taobao.android.autosize.OnScreenChangedListener
        public /* synthetic */ void onActivityChanged(Activity activity, int i, Configuration configuration) {
            guk.a(this, activity, i, configuration);
        }

        @Override // com.taobao.android.autosize.OnScreenChangedListener
        public void onScreenChanged(int i, Configuration configuration) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cfdcd1d", new Object[]{this, new Integer(i), configuration});
            } else if (CartVEngine.B(CartVEngine.this) != null) {
                imb h0 = CartVEngine.O(CartVEngine.this).e().h0();
                if (h0 instanceof CartPopupWindowManager) {
                    CartPopupWindowManager cartPopupWindowManager = (CartPopupWindowManager) h0;
                    cartPopupWindowManager.a0(i);
                    cartPopupWindowManager.d0();
                }
                CartVEngine.O(CartVEngine.this).e().A0(127, rhx.a(CartVEngine.B(CartVEngine.this)).width());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class m implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            long j;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (CartVEngine.P(CartVEngine.this)) {
                j = CartVEngine.Q(CartVEngine.this);
            } else {
                j = CartVEngine.R(CartVEngine.this);
            }
            ce3.a(j, CartVEngine.l(CartVEngine.this), CartVEngine.P(CartVEngine.this));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class n extends ux {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public n() {
        }

        public static /* synthetic */ Object ipc$super(n nVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/engine/CartVEngine$24");
        }

        @Override // tb.ojd
        public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ddd7a0a5", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
            }
        }

        @Override // tb.ojd
        public void b(int i, MtopResponse mtopResponse, Object obj, fsb fsbVar, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e4ca5d12", new Object[]{this, new Integer(i), mtopResponse, obj, fsbVar, map});
                return;
            }
            try {
                boolean z = CartVEngine.k(CartVEngine.this).w().getControlParas().isShot2024ItemV2Gray;
                de3.h(z);
                if (z) {
                    CartVEngine.H(CartVEngine.this).setBackgroundColor(CartVEngine.H(CartVEngine.this).getResources().getColor(R.color.icart_background_v2));
                }
                m9v.d(c9x.CART_BIZ_NAME).p("isShot2024ItemV2Gray", z);
                m9v.d(c9x.CART_BIZ_NAME).p("weexForceNative", sca.y(CartVEngine.k(CartVEngine.this)));
            } catch (Throwable unused) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class o implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                CartVEngine.u(CartVEngine.this, "whenRecyclerViewLayoutComplete", null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class p implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public p() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            hav.d("CartVEngine", "延迟发送首页请求");
            CartVEngine.S(CartVEngine.this, false, false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class q implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public q() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                CartVEngine.T(CartVEngine.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class r extends ux {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public r() {
        }

        public static /* synthetic */ Object ipc$super(r rVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/engine/CartVEngine$4");
        }

        @Override // tb.ojd
        public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ddd7a0a5", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
            }
        }

        @Override // tb.ojd
        public void b(int i, MtopResponse mtopResponse, Object obj, fsb fsbVar, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e4ca5d12", new Object[]{this, new Integer(i), mtopResponse, obj, fsbVar, map});
            } else {
                ((RecyclerView) CartVEngine.O(CartVEngine.this).e().o()).scrollToPosition(0);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class s implements zxb.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public s() {
        }

        @Override // tb.zxb.a
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a3473a7", new Object[]{this, new Boolean(z)});
            }
        }

        @Override // tb.zxb.a
        public void b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("66fb6f18", new Object[]{this, new Boolean(z)});
            } else if (z && CartVEngine.U(CartVEngine.this)) {
                CartVEngine.V(CartVEngine.this, null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class t implements vqm.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public t() {
        }

        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e9d25a5c", new Object[]{this, new Boolean(z)});
                return;
            }
            blq Y = CartVEngine.O(CartVEngine.this).Y();
            if (Y != null && Y.d()) {
                Y.a(1);
            }
            if (CartVEngine.W(CartVEngine.this) != null && CartVEngine.W(CartVEngine.this).getState() == PtrBase.State.REFRESHING) {
                CartVEngine.W(CartVEngine.this).refreshComplete(Localization.q(R.string.app_load_completed));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class u implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public u() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                CartVEngine.X(CartVEngine.this, "queryFirstPageWithAnimation").setRefreshing(PullBase.Mode.PULL_FROM_START, true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class v implements ypj {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public v() {
        }

        @Override // tb.ypj
        public void onCurrentTabClicked() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f77f6793", new Object[]{this});
            } else if (CartVEngine.O(CartVEngine.this).e().y()) {
                imb h0 = CartVEngine.O(CartVEngine.this).e().h0();
                if (h0 != null) {
                    h0.scrollToTop();
                }
            } else {
                CartVEngine.this.scrollToTop();
            }
        }

        @Override // tb.ypj
        public void onCurrentTabDoubleTap() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c22ad2be", new Object[]{this});
            }
        }

        @Override // tb.ypj
        public void onCurrentTabLongClicked() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("79eae8f7", new Object[]{this});
            }
        }

        @Override // tb.ypj
        public void onNavigationTabMessageChanged(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3fd5f3e0", new Object[]{this, str});
            }
        }
    }

    static {
        t2o.a(478150729);
        t2o.a(479199247);
        t2o.a(479199249);
        t2o.a(82837508);
        qb3.a();
    }

    public CartVEngine(Activity activity, String str, boolean z, f8e.a aVar) {
        this.u = false;
        this.G = new AtomicBoolean();
        this.H = new AtomicBoolean(false);
        this.J = false;
        this.K = false;
        this.R = vav.a(c9x.CART_BIZ_NAME, "lazyInitDragLayout", true);
        this.S = vav.a(c9x.CART_BIZ_NAME, "lazyInitPtrLayout", true);
        this.T = new v();
        this.U = new AtomicLong(-1L);
        if (str != null) {
            setInstanceId(str);
        }
        this.N = z9v.u(activity);
        this.A = System.currentTimeMillis();
        this.w = activity;
        this.z = z;
        this.C = aVar;
        Y(activity);
        ICartWVService.register(this);
    }

    public static /* synthetic */ void A(CartVEngine cartVEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c45cb77", new Object[]{cartVEngine});
        } else {
            cartVEngine.A0();
        }
    }

    public static /* synthetic */ Activity B(CartVEngine cartVEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("c54c9692", new Object[]{cartVEngine});
        }
        return cartVEngine.w;
    }

    public static /* synthetic */ View C(CartVEngine cartVEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c4fbd537", new Object[]{cartVEngine});
        }
        return cartVEngine.c;
    }

    public static /* synthetic */ boolean D(CartVEngine cartVEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25cf9a98", new Object[]{cartVEngine})).booleanValue();
        }
        return cartVEngine.s;
    }

    public static /* synthetic */ boolean E(CartVEngine cartVEngine, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b3aa646", new Object[]{cartVEngine, new Boolean(z)})).booleanValue();
        }
        cartVEngine.s = z;
        return z;
    }

    public static /* synthetic */ DragFloatLayer F(CartVEngine cartVEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DragFloatLayer) ipChange.ipc$dispatch("91504247", new Object[]{cartVEngine});
        }
        return cartVEngine.L;
    }

    public static /* synthetic */ DragFloatLayer G(CartVEngine cartVEngine, DragFloatLayer dragFloatLayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DragFloatLayer) ipChange.ipc$dispatch("1791f885", new Object[]{cartVEngine, dragFloatLayer});
        }
        cartVEngine.L = dragFloatLayer;
        return dragFloatLayer;
    }

    public static /* synthetic */ View H(CartVEngine cartVEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6f9cf714", new Object[]{cartVEngine});
        }
        return cartVEngine.y;
    }

    public static /* synthetic */ int I(CartVEngine cartVEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("af5969a4", new Object[]{cartVEngine})).intValue();
        }
        return cartVEngine.o;
    }

    public static /* synthetic */ int J(CartVEngine cartVEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3ca69a9c", new Object[]{cartVEngine})).intValue();
        }
        int i2 = cartVEngine.o;
        cartVEngine.o = 1 + i2;
        return i2;
    }

    public static /* synthetic */ long K(CartVEngine cartVEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dd320404", new Object[]{cartVEngine})).longValue();
        }
        return cartVEngine.n;
    }

    public static /* synthetic */ long L(CartVEngine cartVEngine, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5025302a", new Object[]{cartVEngine, new Long(j2)})).longValue();
        }
        cartVEngine.n = j2;
        return j2;
    }

    public static /* synthetic */ long M(CartVEngine cartVEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b0a9e63", new Object[]{cartVEngine})).longValue();
        }
        return cartVEngine.m;
    }

    public static /* synthetic */ long N(CartVEngine cartVEngine, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dd5fe1ab", new Object[]{cartVEngine, new Long(j2)})).longValue();
        }
        cartVEngine.m = j2;
        return j2;
    }

    public static /* synthetic */ kmb O(CartVEngine cartVEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmb) ipChange.ipc$dispatch("39dc6f8c", new Object[]{cartVEngine});
        }
        return cartVEngine.d;
    }

    public static /* synthetic */ boolean P(CartVEngine cartVEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fba7e29d", new Object[]{cartVEngine})).booleanValue();
        }
        return cartVEngine.z;
    }

    public static /* synthetic */ long Q(CartVEngine cartVEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("29807cec", new Object[]{cartVEngine})).longValue();
        }
        return cartVEngine.t;
    }

    public static /* synthetic */ long R(CartVEngine cartVEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5759174b", new Object[]{cartVEngine})).longValue();
        }
        return cartVEngine.A;
    }

    public static /* synthetic */ void S(CartVEngine cartVEngine, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("969a1fe2", new Object[]{cartVEngine, new Boolean(z), new Boolean(z2)});
        } else {
            cartVEngine.I0(z, z2);
        }
    }

    public static /* synthetic */ void T(CartVEngine cartVEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3f25041", new Object[]{cartVEngine});
        } else {
            cartVEngine.L0();
        }
    }

    public static /* synthetic */ boolean U(CartVEngine cartVEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("11caeaa4", new Object[]{cartVEngine})).booleanValue();
        }
        return cartVEngine.R;
    }

    public static /* synthetic */ void V(CartVEngine cartVEngine, je3.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa7cfd69", new Object[]{cartVEngine, bVar});
        } else {
            cartVEngine.n0(bVar);
        }
    }

    public static /* synthetic */ PtrBase W(CartVEngine cartVEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PtrBase) ipChange.ipc$dispatch("c1d1533c", new Object[]{cartVEngine});
        }
        return cartVEngine.f7951a;
    }

    public static /* synthetic */ PtrBase X(CartVEngine cartVEngine, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PtrBase) ipChange.ipc$dispatch("f6ecee33", new Object[]{cartVEngine, str});
        }
        return cartVEngine.c0(str);
    }

    public static /* synthetic */ zxb k(CartVEngine cartVEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zxb) ipChange.ipc$dispatch("46992054", new Object[]{cartVEngine});
        }
        return cartVEngine.e;
    }

    public static /* synthetic */ boolean l(CartVEngine cartVEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2c8fe6c9", new Object[]{cartVEngine})).booleanValue();
        }
        return cartVEngine.D;
    }

    public static /* synthetic */ CartRecyclerView m(CartVEngine cartVEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CartRecyclerView) ipChange.ipc$dispatch("edbdbab8", new Object[]{cartVEngine});
        }
        return cartVEngine.b;
    }

    public static /* synthetic */ boolean n(CartVEngine cartVEngine, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ec83e035", new Object[]{cartVEngine, new Boolean(z)})).booleanValue();
        }
        cartVEngine.D = z;
        return z;
    }

    public static /* synthetic */ void o(CartVEngine cartVEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0b19f6", new Object[]{cartVEngine});
        } else {
            cartVEngine.d0();
        }
    }

    public static /* synthetic */ boolean p(CartVEngine cartVEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ce3b459", new Object[]{cartVEngine})).booleanValue();
        }
        return cartVEngine.u0();
    }

    public static /* synthetic */ lu q(CartVEngine cartVEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lu) ipChange.ipc$dispatch("6b2d37cf", new Object[]{cartVEngine});
        }
        return cartVEngine.g;
    }

    public static /* synthetic */ void r(CartVEngine cartVEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9894e913", new Object[]{cartVEngine});
        } else {
            cartVEngine.r0();
        }
    }

    public static /* synthetic */ RecyclerView s(CartVEngine cartVEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("3de7f719", new Object[]{cartVEngine});
        }
        return cartVEngine.f;
    }

    public static /* synthetic */ RecyclerView t(CartVEngine cartVEngine, RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("346e802e", new Object[]{cartVEngine, recyclerView});
        }
        cartVEngine.f = recyclerView;
        return recyclerView;
    }

    public static /* synthetic */ PtrBase u(CartVEngine cartVEngine, String str, je3.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PtrBase) ipChange.ipc$dispatch("9670242d", new Object[]{cartVEngine, str, bVar});
        }
        return cartVEngine.q0(str, bVar);
    }

    public static /* synthetic */ zgp v(CartVEngine cartVEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zgp) ipChange.ipc$dispatch("ee7ae398", new Object[]{cartVEngine});
        }
        return cartVEngine.h;
    }

    public static /* synthetic */ boolean w(CartVEngine cartVEngine, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3609edab", new Object[]{cartVEngine, new Boolean(z)})).booleanValue();
        }
        cartVEngine.K = z;
        return z;
    }

    public static /* synthetic */ vqm x(CartVEngine cartVEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vqm) ipChange.ipc$dispatch("496ebb67", new Object[]{cartVEngine});
        }
        return cartVEngine.i;
    }

    public static /* synthetic */ f8e.a y(CartVEngine cartVEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f8e.a) ipChange.ipc$dispatch("87c4e4a2", new Object[]{cartVEngine});
        }
        return cartVEngine.C;
    }

    public static /* synthetic */ void z(CartVEngine cartVEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e6d3118", new Object[]{cartVEngine});
        } else {
            cartVEngine.M0();
        }
    }

    public final void A0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f13a285", new Object[]{this});
            return;
        }
        CartRecyclerView cartRecyclerView = this.b;
        if (cartRecyclerView != null && cartRecyclerView.getScrollState() == 0) {
            sf7.b(this.d);
        }
    }

    public final void C0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b22c8539", new Object[]{this});
            return;
        }
        if (this.r == null) {
            this.r = new fd3(this.d);
        }
        this.r.c();
        if (this.p == null) {
            this.p = new MainAddCartEventHandler(this);
        }
        if (this.q == null) {
            this.q = new CartWVBroadcast(this);
        }
        this.p.a();
        this.q.h();
    }

    public final void D0(zxb zxbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa7380e6", new Object[]{this, zxbVar});
            return;
        }
        K0(zxbVar);
        n nVar = new n();
        this.Q = nVar;
        zxbVar.q(nVar);
    }

    public final void E0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8c7425a", new Object[]{this});
            return;
        }
        this.v = new l();
        TBAutoSizeConfig.x().d0(this.v);
    }

    public void F0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("154bcf74", new Object[]{this});
            return;
        }
        fsw.i(ICartWVService.JS_BRIDGE_NAME, ICartWVService.class, true);
        TBCartWVService.registerPlugin();
    }

    public final void G0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7693ae52", new Object[]{this});
            return;
        }
        z9v.u(getActivity()).e("fromPrefetch", String.valueOf(this.z));
        if (TBMainHost.b().getContext() == this.w && !v0()) {
            pav.k(new m());
        }
    }

    public final void H0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79390955", new Object[]{this});
            return;
        }
        kmb kmbVar = this.d;
        if (kmbVar != null && kmbVar.e() != null && (this.d.e().o() instanceof RecyclerView) && sgv.f("cart")) {
            sgv.c("cart", this.d.e().r(), (RecyclerView) this.d.e().o(), this.d.e().p());
        }
    }

    public final void J0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97044d52", new Object[]{this});
            return;
        }
        fd3 fd3Var = this.r;
        if (fd3Var != null) {
            fd3Var.d();
        }
        MainAddCartEventHandler mainAddCartEventHandler = this.p;
        if (mainAddCartEventHandler != null) {
            mainAddCartEventHandler.c();
        }
        CartWVBroadcast cartWVBroadcast = this.q;
        if (cartWVBroadcast != null) {
            cartWVBroadcast.j();
        }
    }

    public final void K0(zxb zxbVar) {
        ux uxVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47329e7f", new Object[]{this, zxbVar});
        } else if (zxbVar != null && (uxVar = this.Q) != null) {
            zxbVar.R(uxVar);
        }
    }

    public final void M0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60e6208", new Object[]{this});
        } else if (this.b.getChildCount() > 0 && this.x != null) {
            ic3.d(getActivity(), this.e, this.x, this.b);
            B0();
            A0();
            if (this.S) {
                pav.i(new o(), 0L);
            }
        }
    }

    public final void Y(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0574c05", new Object[]{this, activity});
            return;
        }
        this.w = activity;
        q70.a(getActivity());
        a0();
        this.N.B("createVEngine", false, null);
    }

    @Override // tb.g8e
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7751f22e", new Object[]{this});
        } else {
            new Handler(Looper.getMainLooper()).post(new u());
        }
    }

    public final void a0() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b1da043", new Object[]{this});
            return;
        }
        j0();
        if (this.z && this.d.b0() && this.e.F()) {
            z = true;
        }
        w0(z);
        t0();
        m0();
        o0();
        F0();
        ViewGroup viewGroup = (ViewGroup) this.y.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this.y);
        }
        z0(10001);
        if (z) {
            lj9.h();
        }
    }

    public final void b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33236102", new Object[]{this});
        } else {
            pav.i(new p(), vav.e(c9x.CART_BIZ_NAME, "delaySendFirstPageRequestMills", 200));
        }
    }

    @Override // tb.f8e
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7322d16", new Object[]{this})).booleanValue();
        }
        return this.z;
    }

    public final PtrBase c0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PtrBase) ipChange.ipc$dispatch("e9c41882", new Object[]{this, str});
        }
        return q0(str, null);
    }

    @Override // tb.f8e
    public void d(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46d220ac", new Object[]{this, fragment});
            return;
        }
        this.d.m0(fragment);
        this.x = fragment;
        try {
            vxm.b.j(fragment).a("dx_scroll_hitchrate_icard_key", "656090");
        } catch (Exception e2) {
            ub3.g("reportForDXHitchPerformance", e2.getMessage());
        }
    }

    public final void d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c83a4375", new Object[]{this});
        } else if (this.g == null && !this.d.W().v()) {
            ed3 ed3Var = new ed3(this.b, this.d, "auto");
            this.g = ed3Var;
            this.b.setCartRecommend(ed3Var);
        }
    }

    @Override // tb.f8e
    public boolean e() {
        int childCount;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("67fe14dd", new Object[]{this})).booleanValue();
        }
        CartRecyclerView cartRecyclerView = this.b;
        if (cartRecyclerView == null || (childCount = cartRecyclerView.getChildCount()) <= 0) {
            return false;
        }
        Object tag = this.b.getChildAt(childCount - 1).getTag(R.id.icart_recommend_flow_view);
        if (!(tag instanceof String)) {
            return false;
        }
        return Boolean.parseBoolean(tag.toString());
    }

    public final ct1.a e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ct1.a) ipChange.ipc$dispatch("b9591b2", new Object[]{this});
        }
        return new w();
    }

    @Override // tb.f8e
    public boolean f(int i2, KeyEvent keyEvent) {
        kmb kmbVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f42cd860", new Object[]{this, new Integer(i2), keyEvent})).booleanValue();
        }
        if (i2 != 4 || (kmbVar = this.d) == null || !kmbVar.e().y()) {
            return false;
        }
        if (!this.d.Y().d()) {
            this.d.e().k(false);
            this.d.Y().a(1);
        }
        return true;
    }

    public final ct1.b f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ct1.b) ipChange.ipc$dispatch("8e22a02e", new Object[]{this});
        }
        return new a();
    }

    @Override // tb.f8e
    public kmb g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmb) ipChange.ipc$dispatch("6c84c8c2", new Object[]{this});
        }
        return this.d;
    }

    public final String g0(Uri uri) {
        String queryParameter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fa0ea8ff", new Object[]{this, uri});
        }
        if (uri == null || (queryParameter = uri.getQueryParameter("holdCustomExParams")) == null) {
            return null;
        }
        return queryParameter;
    }

    @Override // tb.f8e
    public Activity getActivity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("81223f9c", new Object[]{this});
        }
        return this.w;
    }

    @Override // tb.g8e
    public String getInstanceId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5c00da33", new Object[]{this});
        }
        return this.O;
    }

    @Override // tb.f8e
    public String getUTPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("34b6390a", new Object[]{this});
        }
        return this.d.W().o();
    }

    @Override // tb.f8e
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29c8a5b4", new Object[]{this});
            return;
        }
        this.J = false;
        z0(10008);
    }

    @Override // tb.f8e
    public void i(LoginAction loginAction) {
        kmb kmbVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e52feba", new Object[]{this, loginAction});
        } else if (loginAction == null || !loginAction.equals(LoginAction.NOTIFY_LOGIN_SUCCESS) || (kmbVar = this.d) == null || this.y == null) {
            hav.g(c9x.CART_BIZ_NAME, "CartVEngine", "切换账号，对象异常，无法刷新购物车");
        } else {
            kmbVar.a0();
        }
    }

    public final boolean i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8eb6da46", new Object[]{this})).booleanValue();
        }
        if (this.e.d() != null) {
            return false;
        }
        if (!this.d.b0() || !this.e.F()) {
            return true;
        }
        return false;
    }

    @Override // tb.f8e
    public boolean isDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35b933fb", new Object[]{this})).booleanValue();
        }
        return this.E;
    }

    @Override // tb.f8e
    public boolean isResumed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a7649b58", new Object[]{this})).booleanValue();
        }
        Fragment fragment = this.x;
        if (fragment == null || !fragment.isResumed()) {
            return false;
        }
        return true;
    }

    @Override // tb.f8e
    public boolean isSupportVisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("acaff78", new Object[]{this})).booleanValue();
        }
        return this.J;
    }

    @Override // tb.f8e
    public hmb j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hmb) ipChange.ipc$dispatch("6facd536", new Object[]{this});
        }
        return this.P;
    }

    public void j0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        vc3 vc3Var = new vc3(this.w);
        this.d = vc3Var;
        vc3Var.v0(this);
        this.d.n0(this);
        zxb P = this.d.d();
        this.e = P;
        if (this.O != null) {
            P.B().W(this.O);
        }
        zxb zxbVar = this.e;
        if (zxbVar != null) {
            zxbVar.o(new s());
        }
        D0(this.e);
        vqm U = this.d.U();
        this.i = U;
        U.o(new t());
        s0(this.d, this.e);
    }

    public final void k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("653e742b", new Object[]{this});
        } else {
            this.d.d().k(e0());
        }
    }

    public final void l0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b69e6f4c", new Object[]{this});
        } else {
            this.d.d().l(f0());
        }
    }

    public final void m0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1ae4861", new Object[]{this});
            return;
        }
        this.h = new zgp(this.d);
        this.d.Y().h(this.j);
        this.P = new ListTopManager(this.d, new j());
        if (this.l == null) {
            this.l = new CartThemeManager(this.d);
        }
    }

    public final void n0(je3.b bVar) {
        DragParentFrameLayout dragParentFrameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8939773", new Object[]{this, bVar});
        } else if (this.M == null) {
            if (bVar == null) {
                dragParentFrameLayout = (DragParentFrameLayout) this.y.findViewById(R.id.drag_parent_layout);
            } else {
                dragParentFrameLayout = bVar.k();
            }
            this.M = dragParentFrameLayout;
            this.L = (DragFloatLayer) ((ViewStub) this.y.findViewById(R.id.drag_layer_viewstub)).inflate();
            TipsLineFollower tipsLineFollower = new TipsLineFollower(this.d);
            DragManager dragManager = new DragManager(this.d, this.b, this.L, tipsLineFollower);
            xw7 xw7Var = new xw7(this.d, dragManager, this.L);
            this.L.setBound(200, 200);
            this.L.attach(this.b, dragManager);
            xw7Var.e();
            this.M.attach(this.L);
            this.M.addView(tipsLineFollower, -2, -2);
            this.L.setFollower(tipsLineFollower);
        }
    }

    public final void o0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8876706b", new Object[]{this});
            return;
        }
        l0();
        k0();
        C0();
        if (ykl.a()) {
            this.d.e().t().h1(View.MeasureSpec.makeMeasureSpec(rhx.a(this.w).width(), 1073741824));
            E0();
        }
        CartRefreshCheckBroadcast.f(Globals.getApplication());
    }

    @Override // tb.f8e
    public void onActivityResult(int i2, int i3, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i2), new Integer(i3), intent});
            return;
        }
        UnifyLog.e("CartVEngine", "requestCode=" + i2 + ",resultCode=" + i3);
        this.d.s(i2, i3, intent);
    }

    @Override // com.alibaba.ability.localization.Localization.a
    public void onChange(Language language, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c58b74d", new Object[]{this, language, str});
            return;
        }
        try {
            boolean isVisible = this.x.isVisible();
            this.d.d().B().S(true);
            if (isVisible) {
                b();
            }
        } catch (Exception unused) {
        }
    }

    @Override // tb.f8e
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        this.t = System.currentTimeMillis();
        this.E = false;
        y0();
        this.F = bundle;
        if (this.d.W().w()) {
            ub3.j(0.002f);
        }
        Localization.a(this);
    }

    @Override // tb.f8e
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        p0();
        return this.y;
    }

    @Override // tb.f8e
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else if (!this.E) {
            this.E = true;
            hb3.a();
            z0(10006);
            J0();
            kmb kmbVar = this.d;
            if (kmbVar != null) {
                kmbVar.t();
                if (this.d.e() != null && this.d.e().q0()) {
                    this.d.Y().a(1);
                    this.d.e().k(true);
                }
            }
            if (getActivity() == TBMainHost.b().getContext()) {
                com.taobao.tao.navigation.a.T(3, null);
            }
            lu luVar = this.g;
            if (luVar != null) {
                luVar.h();
            }
            CartVEngineFactory.removeCartVEngine(getActivity());
            lj9.c();
            TBAutoSizeConfig.x().h0(this.v);
            CartFirstPageCache.clear();
            mmi mmiVar = this.I;
            if (mmiVar != null) {
                mmiVar.a();
            }
            p38.t();
            sf7.a();
            Localization.s(this);
            mc3.f(this.O);
            ICartWVService.unregister(this);
            K0(this.e);
        }
    }

    @Override // tb.f8e
    public void onDestroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b8f9ee7", new Object[]{this});
        }
    }

    @Override // tb.f8e
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
        } else {
            h0(intent);
        }
    }

    @Override // tb.f8e
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        this.J = false;
        this.d.u();
        zgp zgpVar = this.h;
        if (zgpVar != null) {
            zgpVar.l();
        }
        z0(10004);
        cqv.m(this.d.W().o(), null, this, new String[0]);
    }

    @Override // tb.f8e
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        this.J = true;
        if (getActivity() == TBMainHost.b().getContext()) {
            com.taobao.tao.navigation.a.T(3, this.T);
        }
        this.d.W().z();
        this.d.v();
        zgp zgpVar = this.h;
        if (zgpVar != null && zgpVar.i()) {
            this.h.k(getActivity());
        }
        if (v9v.i("cart_switch", "asyncUpdatePageProperties", true)) {
            pav.k(new q());
        } else {
            L0();
        }
        String o2 = this.d.W().o();
        UTAnalytics.getInstance().getDefaultTracker().updatePageName(getActivity(), o2);
        z0(10003);
        cqv.l(o2, null, this, new String[0]);
        lu luVar = this.g;
        if (luVar != null) {
            luVar.i();
        }
        b();
        epx.c();
    }

    @Override // tb.f8e
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        } else {
            z0(10002);
        }
    }

    @Override // tb.f8e
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        z0(10005);
        o6g.a();
        epx.b();
        H0();
    }

    @Override // tb.f8e
    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
        }
    }

    @Override // tb.f8e
    public void onVisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2444749a", new Object[]{this});
            return;
        }
        this.J = true;
        z0(10007);
        b();
    }

    public final PtrBase q0(String str, je3.b bVar) {
        PtrBase ptrBase;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PtrBase) ipChange.ipc$dispatch("4d8cde58", new Object[]{this, str, bVar});
        }
        PtrBase ptrBase2 = this.f7951a;
        if (ptrBase2 != null) {
            return ptrBase2;
        }
        try {
            if (bVar == null) {
                ptrBase = (PtrBase) this.y.findViewById(R.id.cart_refresh);
            } else {
                ptrBase = bVar.n();
            }
            this.f7951a = ptrBase;
            this.k = new yua(getActivity(), this.d);
            this.f7951a.getStartLayout().setLoadingDelegate(this.k);
            this.f7951a.setOnRefreshListener(new g());
            this.f7951a.addOnScrollListener(new h());
        } catch (Throwable th) {
            ub3.g("CartVEngine", "initPullToRefreshLayoutError:" + th.getMessage());
        }
        return this.f7951a;
    }

    public final void r0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21535c13", new Object[]{this});
            return;
        }
        this.g.d();
        this.g.c(new b());
    }

    public final void s0(kmb kmbVar, zxb zxbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79bf9071", new Object[]{this, kmbVar, zxbVar});
            return;
        }
        QueryParamsManager W = kmbVar.W();
        String p2 = W.p(na3.sQueryParamsKeyDefaultFilterItem);
        if (p2 != null) {
            zxbVar.W(p2);
        }
        z9v.u(kmbVar.getContext()).q("搜索界面", String.valueOf(QueryParamsManager.CartFeedFlowType.search.equalsIgnoreCase(W.k())));
    }

    @Override // tb.g8e
    public void scrollToTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2787c14", new Object[]{this});
            return;
        }
        CartRecyclerView cartRecyclerView = this.b;
        if (cartRecyclerView != null) {
            cartRecyclerView.resetScroll();
            this.b.scrollToPosition(0);
        }
        RecyclerView recyclerView = this.f;
        if (recyclerView != null) {
            recyclerView.scrollToPosition(0);
        }
    }

    @Override // tb.f8e
    public void setInstanceId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b03f3a3", new Object[]{this, str});
            return;
        }
        this.O = str;
        zxb zxbVar = this.e;
        if (zxbVar != null && zxbVar.B() != null) {
            this.e.B().W(str);
        }
    }

    public final void t0() {
        View view;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        LinearLayout linearLayout3;
        CartRecyclerView cartRecyclerView;
        View view2;
        ViewGroup viewGroup;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        this.d.c0();
        je3.b g2 = je3.g(getActivity());
        if (g2 != null) {
            z = false;
        }
        this.d.G(1001);
        if (z) {
            view = je3.h(getActivity());
        } else {
            view = g2.q();
        }
        this.y = view;
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ViewManager Z = this.d.e();
        Z.E0((ViewGroup) this.y);
        if (z) {
            linearLayout = (LinearLayout) this.y.findViewById(R.id.status_container);
        } else {
            linearLayout = g2.r();
        }
        this.j = linearLayout;
        if (z) {
            linearLayout2 = (LinearLayout) this.y.findViewById(R.id.cart_top_layout);
        } else {
            linearLayout2 = g2.m();
        }
        if (z) {
            linearLayout3 = (LinearLayout) this.y.findViewById(R.id.cart_bottom_layout);
        } else {
            linearLayout3 = g2.j();
        }
        if (z) {
            cartRecyclerView = (CartRecyclerView) this.y.findViewById(R.id.cart_recycler_view);
        } else {
            cartRecyclerView = g2.p();
        }
        this.b = cartRecyclerView;
        cartRecyclerView.setFooterView(linearLayout3);
        this.b.setCartPresenter(this.d);
        if (z) {
            view2 = this.y.findViewById(R.id.ptr_loading);
        } else {
            view2 = g2.o();
        }
        this.c = view2;
        ScrollInstanceLinearLayoutManager scrollInstanceLinearLayoutManager = new ScrollInstanceLinearLayoutManager(getActivity());
        scrollInstanceLinearLayoutManager.z(new d());
        CartRecyclerView cartRecyclerView2 = this.b;
        cartRecyclerView2.setLayoutManager(scrollInstanceLinearLayoutManager.y(cartRecyclerView2));
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setChangeDuration(0L);
        defaultItemAnimator.setSupportsChangeAnimations(false);
        this.b.setItemAnimator(defaultItemAnimator);
        this.b.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.taobao.android.icart.engine.CartVEngine.14
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass14 r5, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == -1177043419) {
                    super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                    return null;
                } else if (hashCode == 1361287682) {
                    super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                    return null;
                } else {
                    int hashCode2 = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/icart/engine/CartVEngine$14");
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
                if (i2 == 0) {
                    if (CartVEngine.s(CartVEngine.this) != null && CartVEngine.s(CartVEngine.this).getParent() == null) {
                        CartVEngine.s(CartVEngine.this).scrollToPosition(0);
                    }
                    CartVEngine.A(CartVEngine.this);
                    la3.d(CartVEngine.O(CartVEngine.this), recyclerView, R.id.cart_ptr_loading_more);
                    return;
                }
                sf7.a();
                z9v.u(CartVEngine.B(CartVEngine.this)).d();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                boolean z2;
                int[] findFirstVisibleItemPositions;
                boolean z3 = true;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i2), new Integer(i3)});
                    return;
                }
                super.onScrolled(recyclerView, i2, i3);
                CartVEngine.C(CartVEngine.this).setVisibility(8);
                if (CartVEngine.s(CartVEngine.this) != null) {
                    if (!(CartVEngine.s(CartVEngine.this).getLayoutManager() instanceof StaggeredGridLayoutManager) || CartVEngine.s(CartVEngine.this).getParent() == null || (findFirstVisibleItemPositions = ((StaggeredGridLayoutManager) CartVEngine.s(CartVEngine.this).getLayoutManager()).findFirstVisibleItemPositions(null)) == null || findFirstVisibleItemPositions.length <= 0 || findFirstVisibleItemPositions[0] <= 0 || CartVEngine.m(CartVEngine.this).getChildCount() <= 1) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (!CartVEngine.O(CartVEngine.this).e().r0() || z2) {
                        CartVEngine.s(CartVEngine.this).scrollToPosition(0);
                    }
                }
                if (!CartVEngine.D(CartVEngine.this) && !CartVEngine.O(CartVEngine.this).Y().d() && CartVEngine.k(CartVEngine.this).c() != null && !CartVEngine.k(CartVEngine.this).c().d()) {
                    if (CartVEngine.F(CartVEngine.this) == null && CartVEngine.H(CartVEngine.this) != null) {
                        CartVEngine cartVEngine = CartVEngine.this;
                        CartVEngine.G(cartVEngine, (DragFloatLayer) CartVEngine.H(cartVEngine).findViewById(R.id.drag_layer));
                    }
                    vqm x = CartVEngine.x(CartVEngine.this);
                    if (CartVEngine.F(CartVEngine.this) == null || !CartVEngine.F(CartVEngine.this).isDraging()) {
                        z3 = false;
                    }
                    x.h(recyclerView, i2, i3, z3);
                }
            }
        });
        this.d.r(linearLayout2, this.b, linearLayout3);
        this.b.setAccessibilityDelegateCompat(new RecyclerViewAccessibilityDelegate(this, this.b) { // from class: com.taobao.android.icart.engine.CartVEngine.15
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public int e = 0;

            public static /* synthetic */ Object ipc$super(AnonymousClass15 r2, String str, Object... objArr) {
                if (str.hashCode() == -1710490298) {
                    return new Boolean(super.onRequestSendAccessibilityEvent((ViewGroup) objArr[0], (View) objArr[1], (AccessibilityEvent) objArr[2]));
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/engine/CartVEngine$15");
            }

            @Override // androidx.core.view.AccessibilityDelegateCompat
            public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup2, View view3, AccessibilityEvent accessibilityEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("9a0bfd46", new Object[]{this, viewGroup2, view3, accessibilityEvent})).booleanValue();
                }
                if (accessibilityEvent == null || accessibilityEvent.getEventType() != 32768) {
                    return super.onRequestSendAccessibilityEvent(viewGroup2, view3, accessibilityEvent);
                }
                if (viewGroup2 instanceof CartRecyclerView) {
                    CartRecyclerView cartRecyclerView3 = (CartRecyclerView) viewGroup2;
                    int childAdapterPosition = cartRecyclerView3.getChildAdapterPosition(view3);
                    int i2 = this.e;
                    if (i2 < childAdapterPosition) {
                        cartRecyclerView3.smoothScrollToPosition(childAdapterPosition + 1);
                    } else if (i2 > childAdapterPosition) {
                        cartRecyclerView3.smoothScrollToPosition(Math.max(0, childAdapterPosition - 1));
                    }
                    this.e = childAdapterPosition;
                }
                return true;
            }
        });
        if (!this.R) {
            n0(g2);
        }
        if (!this.S) {
            q0(sc.initView, g2);
        }
        if (z) {
            viewGroup = (ViewGroup) this.y.findViewById(R.id.cart_bottom_float_layout);
        } else {
            viewGroup = g2.l();
        }
        Z.D0(new CartPopupWindowManager(this.d, viewGroup));
        try {
            DxRegisterUtil.a(this.d.getContext(), this.d.e().t().Q().b(), this.d.g());
        } catch (Exception unused) {
        }
        Z.c0(new e());
        this.b.setOnEndViewExposure(new f());
    }

    public final boolean u0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6031f01", new Object[]{this})).booleanValue();
        }
        lu luVar = this.g;
        if (luVar == null || !luVar.e() || this.d.b() == null || this.d.b().d()) {
            return false;
        }
        return true;
    }

    public final boolean v0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("143929b4", new Object[]{this})).booleanValue();
        }
        if (this.F != null) {
            return true;
        }
        return false;
    }

    public final void w0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b10eb69", new Object[]{this, new Boolean(z)});
        } else if (z) {
            hav.d("CartVEngine", "loadDataBeforeInitView#prefetch");
            lj9.i(new i());
            lj9.f(this);
        } else if (this.d.b0() && this.d.d().F()) {
            hav.d("CartVEngine", "loadDataBeforeInitView#loadCacheData");
            x0();
        } else if (!this.z) {
            hav.d("CartVEngine", "loadDataBeforeInitView#sendFirstPageRequest");
            I0(false, false);
        }
    }

    public final void x0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("caa94330", new Object[]{this});
        } else if (!this.H.getAndSet(true)) {
            hb3.b();
            this.d.d0(null, false);
        }
    }

    public final void y0() {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bc36c7b", new Object[]{this});
        } else if (this.D) {
            b0();
        } else {
            if (this.H.get() || !this.d.b0() || !this.d.d().F()) {
                z = false;
            }
            hav.d("CartVEngine", "loadFirstPageOnCreate#loadCacheData=" + z);
            if (z) {
                x0();
            }
            if (z) {
                b0();
            } else {
                I0(false, false);
            }
        }
    }

    public final void z0(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e8619db", new Object[]{this, new Integer(i2)});
            return;
        }
        kmb kmbVar = this.d;
        if (kmbVar != null && kmbVar.g() != null) {
            lcu d2 = this.d.g().d();
            d2.l("cartLifecycle");
            d2.m("lifecycle", Integer.valueOf(i2));
            this.d.g().h(d2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements ct1.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.ct1.b
        public void a(PageInfo pageInfo, DataInfo dataInfo) {
            PtrBase ptrBase;
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1cbf0fa3", new Object[]{this, pageInfo, dataInfo});
                return;
            }
            p38.v();
            fsb c = CartVEngine.k(CartVEngine.this).c();
            if (c == null || !c.d()) {
                z = false;
            }
            CartVEngine cartVEngine = CartVEngine.this;
            if (z) {
                ptrBase = CartVEngine.W(cartVEngine);
            } else {
                ptrBase = CartVEngine.u(cartVEngine, "onBuildRequestFinish", null);
            }
            if (ptrBase != null) {
                ptrBase.refreshComplete(Localization.q(R.string.app_load_completed));
            }
            if (CartVEngine.m(CartVEngine.this) != null) {
                CartVEngine.m(CartVEngine.this).resetScroll();
            }
            if (!CartVEngine.O(CartVEngine.this).d().L() && c != null) {
                if (!z) {
                    de3.f(false);
                    CartVEngine.O(CartVEngine.this).e().t().j1(false);
                    if (pageInfo == PageInfo.FIRST_PAGE && CartVEngine.O(CartVEngine.this).W().w() && !CartVEngine.O(CartVEngine.this).W().u()) {
                        int s = sca.s(CartVEngine.k(CartVEngine.this));
                        if (CartVEngine.q(CartVEngine.this) != null) {
                            CartVEngine.q(CartVEngine.this).m(s);
                        }
                    }
                    if (CartVEngine.v(CartVEngine.this) != null) {
                        CartVEngine.v(CartVEngine.this).m(CartVEngine.O(CartVEngine.this).d());
                    }
                    if (CartVEngine.v(CartVEngine.this) != null && CartVEngine.v(CartVEngine.this).i() && CartVEngine.this.isResumed()) {
                        CartVEngine.v(CartVEngine.this).k(CartVEngine.this.getActivity());
                    }
                    if (CartVEngine.O(CartVEngine.this).d().G()) {
                        if (ptrBase != null && dataInfo == DataInfo.NORMAL_DATA) {
                            ptrBase.setMode(PullBase.Mode.BOTH);
                        }
                        if (CartVEngine.m(CartVEngine.this) != null) {
                            CartVEngine.m(CartVEngine.this).removeEndView(CartVEngine.s(CartVEngine.this));
                            CartVEngine.m(CartVEngine.this).hideCushionView();
                            return;
                        }
                        return;
                    }
                    if (ptrBase != null) {
                        ptrBase.setMode(PullBase.Mode.PULL_FROM_START);
                    }
                    CartVEngine.o(CartVEngine.this);
                    if (CartVEngine.p(CartVEngine.this)) {
                        CartVEngine.m(CartVEngine.this).hideCushionView();
                        if (CartVEngine.q(CartVEngine.this) != null) {
                            CartVEngine.r(CartVEngine.this);
                            CartVEngine.q(CartVEngine.this).k();
                            CartVEngine.q(CartVEngine.this).a();
                            CartVEngine.q(CartVEngine.this).j(CartRecommendRefreshScene.build);
                        }
                    } else if (CartVEngine.m(CartVEngine.this) != null) {
                        CartVEngine.m(CartVEngine.this).removeEndView(CartVEngine.s(CartVEngine.this));
                        CartVEngine.m(CartVEngine.this).showCushionView(false);
                    }
                } else if (ptrBase == null) {
                } else {
                    if (CartVEngine.O(CartVEngine.this).d().G()) {
                        ptrBase.setMode(PullBase.Mode.BOTH);
                    } else {
                        ptrBase.setMode(PullBase.Mode.PULL_FROM_START);
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class w implements ct1.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public w() {
        }

        @Override // tb.ct1.a
        public void a() {
            PtrBase W;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1118edb", new Object[]{this});
                return;
            }
            p38.v();
            boolean G = CartVEngine.O(CartVEngine.this).d().G();
            if (vav.a(c9x.CART_BIZ_NAME, "refreshPTRWhenUpdate", true) && (W = CartVEngine.W(CartVEngine.this)) != null) {
                if (G) {
                    W.setMode(PullBase.Mode.BOTH);
                } else {
                    W.setMode(PullBase.Mode.PULL_FROM_START);
                }
            }
            if (!CartVEngine.O(CartVEngine.this).d().L()) {
                CartVEngine.m(CartVEngine.this).resetScroll();
                if (!G || !vav.a(c9x.CART_BIZ_NAME, "doNotLoadRecommendWhenAdjustOnMain", true)) {
                    CartVEngine.o(CartVEngine.this);
                    if (CartVEngine.p(CartVEngine.this)) {
                        CartVEngine.q(CartVEngine.this).a();
                        if (CartVEngine.q(CartVEngine.this).g()) {
                            CartVEngine.r(CartVEngine.this);
                            CartVEngine.q(CartVEngine.this).k();
                            CartVEngine.q(CartVEngine.this).j("adjust");
                        }
                        CartVEngine.m(CartVEngine.this).hideCushionView();
                    } else if (CartVEngine.q(CartVEngine.this) != null && CartVEngine.q(CartVEngine.this).a() && CartVEngine.m(CartVEngine.this).hasEndView(CartVEngine.s(CartVEngine.this))) {
                        CartVEngine.m(CartVEngine.this).removeEndView(CartVEngine.s(CartVEngine.this));
                        CartVEngine.m(CartVEngine.this).showCushionView(false);
                    }
                } else {
                    CartVEngine.m(CartVEngine.this).hideCushionView();
                }
            }
        }
    }

    public final void L0() {
        String str;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65c7fd52", new Object[]{this});
            return;
        }
        try {
            z = u60.a(getActivity());
        } catch (Throwable unused) {
        }
        HashMap hashMap = new HashMap();
        hashMap.put("voiceIsOpen", String.valueOf(z));
        hashMap.put("bizName", c9x.CART_BIZ_NAME);
        hashMap.put(c9x.CART_BIZ_NAME, "true");
        QueryParamsManager W = this.d.W();
        if (!W.w()) {
            str = W.h();
        } else if (Localization.o()) {
            str = "a2141.oversea_cart";
        } else {
            str = "a2141.7631563";
        }
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("spm-cnt", str);
        }
        if (TBElder.b()) {
            hashMap.put("oldPeople", "true");
        }
        UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(getActivity(), hashMap);
    }

    public final void Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e892b877", new Object[]{this});
            return;
        }
        this.d.e().k(false);
        try {
            new AbilityHubAdapter(new zq(c9x.CART_BIZ_NAME, "nativeFragment").a(getActivity())).j("stdPop", "close", new xq().p(null), null, new k(this));
        } catch (Throwable th) {
            hav.a("CartVEngine", "关闭失败:" + th.getMessage());
        }
    }

    public final void h0(Intent intent) {
        String g0;
        kmb kmbVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6708e626", new Object[]{this, intent});
        } else if (intent != null && TBMainHost.b().getContext() == getActivity() && (g0 = g0(intent.getData())) != null && (kmbVar = this.d) != null) {
            kmbVar.e().k(true);
            this.d.d().W("");
            this.d.W().y(g0);
            HashMap hashMap = new HashMap();
            hashMap.put(RequestConfig.IS_ICART_IS_FIRST_REQUEST, "true");
            this.d.i0(true, hashMap, null);
        }
    }

    public final void B0() {
        kmb kmbVar;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4067559e", new Object[]{this});
            return;
        }
        zxb zxbVar = this.e;
        if (zxbVar != null && zxbVar.d() != null && (kmbVar = this.d) != null && !this.u) {
            try {
                String str = "time=" + (System.currentTimeMillis() - this.t);
                StringBuilder sb = new StringBuilder("isMain=");
                sb.append(TBMainHost.b().getContext() == getActivity());
                String sb2 = sb.toString();
                StringBuilder sb3 = new StringBuilder("isRecreate=");
                if (this.F != null) {
                    z = true;
                }
                sb3.append(z);
                juv.d(kmbVar, "Page_ShoppingCart_RenderTime", str, sb2, sb3.toString());
                this.u = true;
            } catch (Exception e2) {
                UnifyLog.e("CartVEngine", e2.getMessage());
            }
        }
    }

    public final void I0(boolean z, boolean z2) {
        boolean z3 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffc8db1f", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else if (z2 || !this.G.getAndSet(true)) {
            c cVar = new c();
            yc3 yc3Var = new yc3();
            HashMap hashMap = new HashMap();
            hashMap.put(RequestConfig.IS_ICART_IS_FIRST_REQUEST, "true");
            long currentTimeMillis = System.currentTimeMillis();
            if (z2) {
                this.U.set(currentTimeMillis);
                yc3Var.g(1);
                yc3Var.h(currentTimeMillis);
            } else {
                long andSet = this.U.getAndSet(-1L);
                if (andSet > 0) {
                    yc3Var.h(andSet);
                }
            }
            hav.g(c9x.CART_BIZ_NAME, "CartVEngine", "#发起首屏请求,本地模式：" + z2);
            yc3Var.i(z);
            yc3Var.f(hashMap);
            this.d.g0(yc3Var, cVar);
        } else {
            Activity activity = getActivity();
            boolean z4 = this.K;
            if (this.e.d() == null) {
                z3 = false;
            }
            kc3.a(activity, z4, z3);
        }
    }

    @Override // tb.f8e
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cff01c4", new Object[]{this});
            return;
        }
        boolean B = this.d.d().B().B();
        hav.g(c9x.CART_BIZ_NAME, "CartVEngine", "#界面恢复，是否要刷新界面：" + B);
        if (B) {
            this.d.d().B().S(false);
            juv.d(this.d, "Page_ShoppingCart_Notification_Refresh", new String[0]);
            Z();
            this.d.i0(true, null, new r());
            zgp zgpVar = this.h;
            if (zgpVar != null && zgpVar.j()) {
                if (this.I == null) {
                    this.I = new mmi(this.d.getContext(), "addCartSuccess", null);
                }
                this.I.d("{\"needRefresh\":true}");
            }
        }
    }

    public final void p0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8295eb7", new Object[]{this});
        } else if (!this.B) {
            G0();
            if (i0()) {
                this.d.Y().i(1);
            }
            et6 E = this.e.E();
            if (!(!this.D || E == null || this.d.b() == null)) {
                bd3 bd3Var = new bd3();
                bd3Var.l("mtop.trade.query.bag");
                jc3.a(getActivity(), System.currentTimeMillis());
                fsb c2 = this.e.c();
                if (c2 instanceof u55) {
                    x55.e(getActivity(), null, ((u55) c2).z(), 0L, 0L);
                }
                this.N.B("apmClientBeforeNetworkLogicProcess", false, null);
                this.N.D("apmClientAfterNetworkLogicProcess", null);
                de3.f(true);
                this.d.e().u0(E, 127, bd3Var);
            }
            this.B = true;
        }
    }

    public CartVEngine(Activity activity, String str) {
        this(activity, str, false, null);
    }
}
