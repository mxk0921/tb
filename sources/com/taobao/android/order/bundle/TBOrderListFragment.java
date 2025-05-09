package com.taobao.android.order.bundle;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.MessageQueue;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.ability.localization.Localization;
import com.alibaba.android.ultron.vfw.adapter.RecyclerViewAdapter;
import com.alibaba.android.ultron.vfw.weex2.UltronWeex2DataPrefetchCache;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridStage;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.themis.TradeHybridTMSFragment;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.utils.HybridPreRenderHelper;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.utils.UltronTradeHybridSwitcherHelper;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.android.behavir.BehaviR;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.nav.Nav;
import com.taobao.android.order.bundle.base.parallelbiz.ParallelBizValueHelper;
import com.taobao.android.order.bundle.cache.OrderLoginBroadcastReceiver;
import com.taobao.android.order.bundle.constants.CoreConstants;
import com.taobao.android.order.bundle.constants.OrderType;
import com.taobao.android.order.bundle.constants.TabType;
import com.taobao.android.order.bundle.helper.WvOrderPlugin;
import com.taobao.android.order.bundle.helper.rec.OrderRecommendWrapper;
import com.taobao.android.order.bundle.weex2.AsyncInstanceLoadManager;
import com.taobao.android.order.bundle.weex2.TBRefundInstanceManager;
import com.taobao.android.order.bundle.widget.TBOrderListSearchView;
import com.taobao.android.order.bundle.widget.TBOrderListTabLayout;
import com.taobao.android.order.bundle.widget.recycle.OrderRecyclerView;
import com.taobao.android.order.constants.OrderBizCode;
import com.taobao.android.order.core.OrderConfigs;
import com.taobao.android.order.core.container.UltronListProxy;
import com.taobao.android.order.core.request.DataStatus;
import com.taobao.android.order.core.request.PageStatus;
import com.taobao.android.order.core.ui.viewpager.SimpleViewpager;
import com.taobao.android.searchbaseframe.chitu.TBSearchChiTuJSBridge;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.performence.model.UltronPerformanceStageModel;
import com.taobao.android.weex.WeexEventTarget;
import com.taobao.android.weex.WeexInstance;
import com.taobao.browser.jsbridge.WebAppInterface;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.orange.OrangeConfig;
import com.taobao.ptr.views.recycler.accessories.FixedViewAdapter;
import com.taobao.tao.Globals;
import com.taobao.tao.tbmainfragment.SupportSecondaryBaseFragment;
import com.taobao.tao.tbmainfragment.TBMainBaseFragment;
import com.taobao.taobao.R;
import com.taobao.uikit.animation.animator.AnimatorParams;
import com.taobao.uikit.animation.api.PlaceHolderProvider;
import com.taobao.uikit.extend.component.TBErrorView;
import com.taobao.uikit.extend.component.error.Error;
import com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTTracker;
import com.ut.share.utils.Constants;
import java.lang.reflect.Field;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import mtopsdk.mtop.domain.MtopResponse;
import tb.a6r;
import tb.ae2;
import tb.afl;
import tb.bbv;
import tb.bel;
import tb.bfl;
import tb.brb;
import tb.c2u;
import tb.c2v;
import tb.cav;
import tb.ccv;
import tb.ct0;
import tb.d9x;
import tb.dbl;
import tb.dbv;
import tb.dpj;
import tb.edl;
import tb.eel;
import tb.exi;
import tb.f9v;
import tb.fdl;
import tb.fsw;
import tb.gav;
import tb.gb0;
import tb.gel;
import tb.h0u;
import tb.h15;
import tb.h4d;
import tb.h6e;
import tb.hav;
import tb.hqv;
import tb.i2e;
import tb.i4d;
import tb.idl;
import tb.jjx;
import tb.jn0;
import tb.jql;
import tb.kbv;
import tb.l2e;
import tb.ldl;
import tb.lor;
import tb.m8v;
import tb.mgw;
import tb.mrr;
import tb.ncl;
import tb.nl2;
import tb.nrr;
import tb.o65;
import tb.o9l;
import tb.orr;
import tb.otg;
import tb.pav;
import tb.pb6;
import tb.pcl;
import tb.pqb;
import tb.prr;
import tb.ptg;
import tb.q6x;
import tb.qbv;
import tb.r63;
import tb.rgv;
import tb.rhx;
import tb.rvl;
import tb.scv;
import tb.t2o;
import tb.tau;
import tb.u3o;
import tb.uel;
import tb.uvl;
import tb.v9v;
import tb.vav;
import tb.vel;
import tb.vvo;
import tb.wbl;
import tb.wqb;
import tb.yh;
import tb.ykl;
import tb.z9u;
import tb.z9v;
import tb.zel;
import tb.zw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TBOrderListFragment extends SupportSecondaryBaseFragment implements pqb, ptg.c, h4d, a6r, i4d, i2e, l2e, PlaceHolderProvider, h6e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_NEED_HIDE_BACK_BTN = "hide_back_btn";
    public static final String KEY_ORIGIN_INTENT = "originActivityIntent";
    public static final HashMap<String, JSONObject> W = new HashMap<>(4);
    public vel A;
    public bfl D;
    public h E;
    public h F;
    public String G;
    public String H;
    public mrr I;
    public ContentObserver N;
    public boolean R;
    public boolean S;
    public RecyclerView.OnScrollListener T;
    public boolean V;

    /* renamed from: a  reason: collision with root package name */
    public FragmentActivity f9090a;
    public Intent c;
    public boolean d;
    public OnScreenChangedListener e;
    public OrderLoginBroadcastReceiver f;
    public ParallelBizValueHelper.PageType g;
    public eel i;
    public OrderConfigs j;
    public View k;
    public TBSwipeRefreshLayout l;
    public otg r;
    public boolean s;
    public Map<String, Object> t;
    public View u;
    public RecyclerView v;
    public ViewGroup w;
    public WeexInstance x;
    public com.taobao.android.order.core.a y;
    public LocalBroadcastManager z;
    public final zel h = new zel();
    public boolean m = true;
    public org.json.JSONObject n = null;
    public org.json.JSONObject o = null;
    public boolean p = true;
    public OrderRecommendWrapper q = null;
    public HashMap<String, Object> B = null;
    public final UltronWeex2DataPrefetchCache C = new UltronWeex2DataPrefetchCache();
    public boolean J = false;
    public boolean K = false;
    public final AtomicBoolean L = new AtomicBoolean(false);
    public final AtomicBoolean M = new AtomicBoolean(false);
    public final BroadcastReceiver O = new BroadcastReceiver() { // from class: com.taobao.android.order.bundle.TBOrderListFragment.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/TBOrderListFragment$1");
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0070 A[Catch: Exception -> 0x009a, TryCatch #0 {Exception -> 0x009a, blocks: (B:9:0x0044, B:12:0x0053, B:17:0x0068, B:19:0x0070, B:21:0x007f, B:23:0x0095), top: B:28:0x0044 }] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x007d  */
        @Override // android.content.BroadcastReceiver
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onReceive(android.content.Context r6, android.content.Intent r7) {
            /*
                r5 = this;
                r0 = 1
                r1 = 0
                com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.android.order.bundle.TBOrderListFragment.AnonymousClass1.$ipChange
                boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r3 == 0) goto L_0x0018
                java.lang.String r3 = "3c04d85a"
                r4 = 3
                java.lang.Object[] r4 = new java.lang.Object[r4]
                r4[r1] = r5
                r4[r0] = r6
                r6 = 2
                r4[r6] = r7
                r2.ipc$dispatch(r3, r4)
                return
            L_0x0018:
                java.lang.String r6 = r7.getAction()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "action = "
                r2.<init>(r3)
                r2.append(r6)
                java.lang.String r2 = r2.toString()
                java.lang.String[] r2 = new java.lang.String[]{r2}
                java.lang.String r3 = "KEY_OrderListFragment"
                java.lang.String r4 = "BroadcastReceiver"
                tb.lor.c(r3, r4, r2)
                java.lang.String r2 = "orderListNeedRefreshAction"
                boolean r6 = r2.equals(r6)
                if (r6 == 0) goto L_0x0044
                com.taobao.android.order.bundle.TBOrderListFragment r6 = com.taobao.android.order.bundle.TBOrderListFragment.this
                com.taobao.android.order.bundle.TBOrderListFragment.p2(r6)
                goto L_0x009a
            L_0x0044:
                com.taobao.android.order.bundle.TBOrderListFragment r6 = com.taobao.android.order.bundle.TBOrderListFragment.this     // Catch: Exception -> 0x009a
                com.taobao.android.order.bundle.TBOrderListFragment.r2(r6)     // Catch: Exception -> 0x009a
                java.lang.String r6 = "orderListNeedRefresh"
                boolean r6 = r7.getBooleanExtra(r6, r1)     // Catch: Exception -> 0x009a
                if (r6 != 0) goto L_0x0053
                return
            L_0x0053:
                com.taobao.android.order.bundle.TBOrderListFragment r6 = com.taobao.android.order.bundle.TBOrderListFragment.this     // Catch: Exception -> 0x009a
                com.taobao.android.order.bundle.TBOrderListFragment.N2(r6, r0)     // Catch: Exception -> 0x009a
                java.lang.String r6 = "orderQueryParamCondition"
                java.io.Serializable r6 = r7.getSerializableExtra(r6)     // Catch: Exception -> 0x009a
                boolean r0 = r6 instanceof java.util.HashMap     // Catch: Exception -> 0x009a
                r2 = 0
                if (r0 == 0) goto L_0x0067
                java.util.HashMap r6 = (java.util.HashMap) r6     // Catch: Exception -> 0x0067
                goto L_0x0068
            L_0x0067:
                r6 = r2
            L_0x0068:
                java.lang.String r0 = "immediatelyRefresh"
                boolean r7 = r7.getBooleanExtra(r0, r1)     // Catch: Exception -> 0x009a
                if (r7 == 0) goto L_0x007d
                com.taobao.android.order.bundle.TBOrderListFragment r7 = com.taobao.android.order.bundle.TBOrderListFragment.this     // Catch: Exception -> 0x009a
                java.lang.String r0 = "EventRefresh"
                com.taobao.android.order.bundle.TBOrderListFragment.T2(r7, r0, r6)     // Catch: Exception -> 0x009a
                com.taobao.android.order.bundle.TBOrderListFragment r6 = com.taobao.android.order.bundle.TBOrderListFragment.this     // Catch: Exception -> 0x009a
                com.taobao.android.order.bundle.TBOrderListFragment.U2(r6, r2)     // Catch: Exception -> 0x009a
                goto L_0x009a
            L_0x007d:
                if (r6 == 0) goto L_0x009a
                com.taobao.android.order.bundle.TBOrderListFragment r7 = com.taobao.android.order.bundle.TBOrderListFragment.this     // Catch: Exception -> 0x009a
                tb.eel r7 = com.taobao.android.order.bundle.TBOrderListFragment.W2(r7)     // Catch: Exception -> 0x009a
                java.lang.String r7 = r7.t()     // Catch: Exception -> 0x009a
                com.taobao.android.order.bundle.constants.TabType r0 = com.taobao.android.order.bundle.constants.TabType.ALL     // Catch: Exception -> 0x009a
                java.lang.String r0 = r0.getValue()     // Catch: Exception -> 0x009a
                boolean r7 = r7.equals(r0)     // Catch: Exception -> 0x009a
                if (r7 == 0) goto L_0x009a
                com.taobao.android.order.bundle.TBOrderListFragment r7 = com.taobao.android.order.bundle.TBOrderListFragment.this     // Catch: Exception -> 0x009a
                com.taobao.android.order.bundle.TBOrderListFragment.U2(r7, r6)     // Catch: Exception -> 0x009a
            L_0x009a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.order.bundle.TBOrderListFragment.AnonymousClass1.onReceive(android.content.Context, android.content.Intent):void");
        }
    };
    public final BroadcastReceiver P = new BroadcastReceiver(this) { // from class: com.taobao.android.order.bundle.TBOrderListFragment.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/TBOrderListFragment$2");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            try {
                uvl.e(intent.getStringExtra("scene"), intent.getBooleanExtra("isResultSuccess", false), 6, intent.getStringExtra("result"));
            } catch (Exception unused) {
            }
        }
    };
    public final BroadcastReceiver Q = new BroadcastReceiver() { // from class: com.taobao.android.order.bundle.TBOrderListFragment.3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/TBOrderListFragment$3");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent == null || !TextUtils.equals("com.alipay.android.app.pay.ACTION_PAY_SUCCESS", intent.getAction()) || context == null) {
                String str = "unknown";
                if (intent != null) {
                    try {
                        if (intent.getStringExtra("resultStatus") != null) {
                            str = intent.getStringExtra("resultStatus");
                        }
                    } catch (Exception e2) {
                        m8v.a(e2);
                        return;
                    }
                }
                h15 sampling = idl.a.a(OrderBizCode.orderList, "payResultOfList").sampling(1.0f);
                idl.c(sampling.message("支付失败：" + str).success(false));
            } else {
                TBOrderListFragment.r2(TBOrderListFragment.this);
                gb0.b(context.getApplicationContext(), false);
                gb0.d(context.getApplicationContext(), false);
                idl.c(idl.a.a(OrderBizCode.orderList, "payResultOfList").sampling(0.1f).message("支付成功").success(true));
            }
        }
    };
    public boolean U = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements MessageQueue.IdleHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MtopResponse f9094a;
        public final /* synthetic */ OrderRecyclerView b;
        public final /* synthetic */ PageStatus c;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.android.order.bundle.TBOrderListFragment$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class RunnableC0470a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0470a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                a aVar = a.this;
                TBOrderListFragment.E2(TBOrderListFragment.this, aVar.f9094a, aVar.b, aVar.c);
            }
        }

        public a(MtopResponse mtopResponse, OrderRecyclerView orderRecyclerView, PageStatus pageStatus) {
            this.f9094a = mtopResponse;
            this.b = orderRecyclerView;
            this.c = pageStatus;
        }

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b5e69690", new Object[]{this})).booleanValue();
            }
            if (pav.b()) {
                TBOrderListFragment.E2(TBOrderListFragment.this, this.f9094a, this.b, this.c);
            } else {
                pav.i(new RunnableC0470a(), 0L);
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
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
            TBOrderListFragment.W2(TBOrderListFragment.this).d1(TBOrderListFragment.J2(TBOrderListFragment.this), TBOrderListFragment.K2(TBOrderListFragment.this));
            TBOrderListFragment.M2(TBOrderListFragment.this).p();
            TBOrderListFragment.M2(TBOrderListFragment.this).g(TBOrderListFragment.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static /* synthetic */ class c {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$android$order$bundle$base$parallelbiz$ParallelBizValueHelper$PageType;

        static {
            int[] iArr = new int[ParallelBizValueHelper.PageType.values().length];
            $SwitchMap$com$taobao$android$order$bundle$base$parallelbiz$ParallelBizValueHelper$PageType = iArr;
            try {
                iArr[ParallelBizValueHelper.PageType.order_detail.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$android$order$bundle$base$parallelbiz$ParallelBizValueHelper$PageType[ParallelBizValueHelper.PageType.logistics_detail.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements AsyncInstanceLoadManager.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // com.taobao.android.order.bundle.weex2.AsyncInstanceLoadManager.a
        public void c(WeexInstance weexInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eadb2214", new Object[]{this, weexInstance});
                return;
            }
            TBRefundInstanceManager.reportRumInRefundList(true, TBOrderListFragment.W2(TBOrderListFragment.this).J());
            TBRefundInstanceManager.INSTANCE.addInstanceView(TBOrderListFragment.X2(TBOrderListFragment.this), TBOrderListFragment.W2(TBOrderListFragment.this).J(), weexInstance);
        }

        @Override // com.taobao.android.order.bundle.weex2.AsyncInstanceLoadManager.a
        public void a() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("216a9675", new Object[]{this});
                return;
            }
            TBRefundInstanceManager.reportRumInRefundList(true, TBOrderListFragment.W2(TBOrderListFragment.this).J());
            TBOrderListFragment tBOrderListFragment = TBOrderListFragment.this;
            FragmentActivity X2 = TBOrderListFragment.X2(tBOrderListFragment);
            ViewGroup J = TBOrderListFragment.W2(TBOrderListFragment.this).J();
            String L = TBOrderListFragment.W2(TBOrderListFragment.this).L();
            String a3 = TBOrderListFragment.a3(TBOrderListFragment.this);
            if (TBOrderListFragment.W2(TBOrderListFragment.this).j0()) {
                str = "other";
            } else {
                str = TBOrderListFragment.W2(TBOrderListFragment.this).y();
            }
            TBOrderListFragment.c3(tBOrderListFragment, TBRefundInstanceManager.refundWeex2PreRender(X2, J, L, new TBRefundInstanceManager.b(a3, str, true)));
        }

        @Override // com.taobao.android.order.bundle.weex2.AsyncInstanceLoadManager.a
        public void b(WeexInstance weexInstance) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d4cf7169", new Object[]{this, weexInstance});
            } else if (weexInstance != null) {
                TBRefundInstanceManager tBRefundInstanceManager = TBRefundInstanceManager.INSTANCE;
                String a3 = TBOrderListFragment.a3(TBOrderListFragment.this);
                if (TBOrderListFragment.W2(TBOrderListFragment.this).j0()) {
                    str = "other";
                } else {
                    str = TBOrderListFragment.W2(TBOrderListFragment.this).y();
                }
                tBRefundInstanceManager.prepareReloadInstance(new TBRefundInstanceManager.b(a3, str, true), weexInstance);
                TBOrderListFragment.c3(TBOrderListFragment.this, weexInstance);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ParallelBizValueHelper.PageType d3 = TBOrderListFragment.d3(TBOrderListFragment.this);
            com.taobao.android.order.bundle.base.parallelbiz.a.b(d3, "_Button-" + TBOrderListFragment.W2(TBOrderListFragment.this).t(), null);
            lor.c("KEY_OrderListFragment", "onActivityCreate", "页面创建");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class f implements UltronListProxy.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // com.taobao.android.order.core.container.UltronListProxy.e
        public void onPageSelected(int i, String str) {
            q6x q6xVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("db26523d", new Object[]{this, new Integer(i), str});
            } else if (TabType.REFUND.getValue().equals(str) && TBOrderListFragment.b3(TBOrderListFragment.this) != null && TBRefundInstanceManager.getUseSurfaceView() && (q6xVar = (q6x) TBOrderListFragment.b3(TBOrderListFragment.this).getExtend(q6x.class)) != null) {
                q6xVar.a();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class g implements Animation.AnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                hav.d("KEY_OrderListFragment", "OLAppearAnimFinished");
                if (TBOrderListFragment.v2(TBOrderListFragment.this) != null) {
                    TBOrderListFragment.v2(TBOrderListFragment.this).D(true);
                }
            }
        }

        public g() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
            } else {
                pav.i(new a(), uel.g("olFragmentDelayRefreshTime", 60));
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f2883e7", new Object[]{this, animation});
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2d146c4", new Object[]{this, animation});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class h implements kbv {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final boolean f9102a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public boolean h = false;
        public final ParallelBizValueHelper.PageType i;

        static {
            t2o.a(713031729);
            t2o.a(157286954);
        }

        public h(ParallelBizValueHelper.PageType pageType) {
            this.f9102a = true;
            this.i = pageType;
            this.f9102a = v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_ORDER_LIST, "enableOListUTFragmentOpt", true);
        }

        @Override // tb.kbv
        public void b(DialogFragment dialogFragment, com.taobao.android.weex_framework.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7738412f", new Object[]{this, dialogFragment, aVar});
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0070 A[Catch: Exception -> 0x0047, TryCatch #0 {Exception -> 0x0047, blocks: (B:6:0x0018, B:9:0x001d, B:12:0x002e, B:17:0x0040, B:20:0x0049, B:21:0x004f, B:23:0x0059, B:26:0x0060, B:28:0x0064, B:31:0x0070, B:32:0x0072, B:35:0x007e, B:36:0x0080, B:39:0x008b, B:40:0x008d), top: B:43:0x0018 }] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x007e A[Catch: Exception -> 0x0047, TryCatch #0 {Exception -> 0x0047, blocks: (B:6:0x0018, B:9:0x001d, B:12:0x002e, B:17:0x0040, B:20:0x0049, B:21:0x004f, B:23:0x0059, B:26:0x0060, B:28:0x0064, B:31:0x0070, B:32:0x0072, B:35:0x007e, B:36:0x0080, B:39:0x008b, B:40:0x008d), top: B:43:0x0018 }] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x008a  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x008b A[Catch: Exception -> 0x0047, TryCatch #0 {Exception -> 0x0047, blocks: (B:6:0x0018, B:9:0x001d, B:12:0x002e, B:17:0x0040, B:20:0x0049, B:21:0x004f, B:23:0x0059, B:26:0x0060, B:28:0x0064, B:31:0x0070, B:32:0x0072, B:35:0x007e, B:36:0x0080, B:39:0x008b, B:40:0x008d), top: B:43:0x0018 }] */
        @Override // tb.kbv
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void c(androidx.fragment.app.DialogFragment r7, com.taobao.android.weex_framework.a r8) {
            /*
                r6 = this;
                r0 = 2
                r1 = 1
                com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.android.order.bundle.TBOrderListFragment.h.$ipChange
                boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r3 == 0) goto L_0x0018
                java.lang.String r3 = "6b48873a"
                r4 = 3
                java.lang.Object[] r4 = new java.lang.Object[r4]
                r5 = 0
                r4[r5] = r6
                r4[r1] = r7
                r4[r0] = r8
                r2.ipc$dispatch(r3, r4)
                return
            L_0x0018:
                boolean r7 = r6.f9102a     // Catch: Exception -> 0x0047
                if (r7 == 0) goto L_0x001d
                return
            L_0x001d:
                tb.c2v r7 = tb.c2v.getInstance()     // Catch: Exception -> 0x0047
                com.taobao.android.order.bundle.TBOrderListFragment r8 = com.taobao.android.order.bundle.TBOrderListFragment.this     // Catch: Exception -> 0x0047
                androidx.fragment.app.FragmentActivity r8 = com.taobao.android.order.bundle.TBOrderListFragment.X2(r8)     // Catch: Exception -> 0x0047
                tb.c2v$d r7 = r7.getOrNewUTPageStateObject(r8)     // Catch: Exception -> 0x0047
                if (r7 != 0) goto L_0x002e
                return
            L_0x002e:
                int[] r8 = com.taobao.android.order.bundle.TBOrderListFragment.c.$SwitchMap$com$taobao$android$order$bundle$base$parallelbiz$ParallelBizValueHelper$PageType     // Catch: Exception -> 0x0047
                com.taobao.android.order.bundle.base.parallelbiz.ParallelBizValueHelper$PageType r2 = r6.i     // Catch: Exception -> 0x0047
                int r2 = r2.ordinal()     // Catch: Exception -> 0x0047
                r8 = r8[r2]     // Catch: Exception -> 0x0047
                java.lang.String r2 = ""
                if (r8 == r1) goto L_0x0049
                if (r8 == r0) goto L_0x0040
                r8 = r2
                goto L_0x004f
            L_0x0040:
                com.taobao.android.order.bundle.base.parallelbiz.ParallelBizValueHelper$PageType r8 = com.taobao.android.order.bundle.base.parallelbiz.ParallelBizValueHelper.PageType.logistics_detail     // Catch: Exception -> 0x0047
                java.lang.String r8 = com.taobao.android.order.bundle.base.parallelbiz.ParallelBizValueHelper.d(r8)     // Catch: Exception -> 0x0047
                goto L_0x004f
            L_0x0047:
                r7 = move-exception
                goto L_0x0090
            L_0x0049:
                com.taobao.android.order.bundle.base.parallelbiz.ParallelBizValueHelper$PageType r8 = com.taobao.android.order.bundle.base.parallelbiz.ParallelBizValueHelper.PageType.order_detail     // Catch: Exception -> 0x0047
                java.lang.String r8 = com.taobao.android.order.bundle.base.parallelbiz.ParallelBizValueHelper.d(r8)     // Catch: Exception -> 0x0047
            L_0x004f:
                r7.mSpmCnt = r8     // Catch: Exception -> 0x0047
                java.lang.String r8 = r6.b     // Catch: Exception -> 0x0047
                boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch: Exception -> 0x0047
                if (r8 != 0) goto L_0x0063
                com.taobao.android.order.bundle.base.parallelbiz.ParallelBizValueHelper$PageType r8 = r6.i     // Catch: Exception -> 0x0047
                com.taobao.android.order.bundle.base.parallelbiz.ParallelBizValueHelper$PageType r0 = com.taobao.android.order.bundle.base.parallelbiz.ParallelBizValueHelper.PageType.logistics_detail     // Catch: Exception -> 0x0047
                if (r8 != r0) goto L_0x0060
                goto L_0x0063
            L_0x0060:
                java.lang.String r8 = r6.b     // Catch: Exception -> 0x0047
                goto L_0x0064
            L_0x0063:
                r8 = r2
            L_0x0064:
                r7.mSpmUrl = r8     // Catch: Exception -> 0x0047
                java.lang.String r8 = r6.c     // Catch: Exception -> 0x0047
                boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch: Exception -> 0x0047
                if (r8 == 0) goto L_0x0070
                r8 = r2
                goto L_0x0072
            L_0x0070:
                java.lang.String r8 = r6.c     // Catch: Exception -> 0x0047
            L_0x0072:
                r7.mSpmPre = r8     // Catch: Exception -> 0x0047
                java.lang.String r8 = r6.f     // Catch: Exception -> 0x0047
                boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch: Exception -> 0x0047
                if (r8 == 0) goto L_0x007e
                r8 = r2
                goto L_0x0080
            L_0x007e:
                java.lang.String r8 = r6.f     // Catch: Exception -> 0x0047
            L_0x0080:
                r7.mUtparamPre = r8     // Catch: Exception -> 0x0047
                java.lang.String r8 = r6.e     // Catch: Exception -> 0x0047
                boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch: Exception -> 0x0047
                if (r8 == 0) goto L_0x008b
                goto L_0x008d
            L_0x008b:
                java.lang.String r2 = r6.e     // Catch: Exception -> 0x0047
            L_0x008d:
                r7.mUtparamUrl = r2     // Catch: Exception -> 0x0047
                goto L_0x0096
            L_0x0090:
                r7.printStackTrace()
                tb.m8v.a(r7)
            L_0x0096:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.order.bundle.TBOrderListFragment.h.c(androidx.fragment.app.DialogFragment, com.taobao.android.weex_framework.a):void");
        }

        @Override // tb.kbv
        public void d(DialogFragment dialogFragment, com.taobao.android.weex_framework.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cbb2ac22", new Object[]{this, dialogFragment, aVar});
                return;
            }
            try {
                if (fsw.d("WebAppInterface") == null) {
                    fsw.i("WebAppInterface", WebAppInterface.class, true);
                    this.h = true;
                } else {
                    hav.d("KEY_OrderListFragment", "WebAppInterface is registered!");
                }
                if (aVar != null) {
                    if (TBOrderListFragment.O2(TBOrderListFragment.this) == null) {
                        TBOrderListFragment.Q2(TBOrderListFragment.this, new mrr());
                        TBOrderListFragment.O2(TBOrderListFragment.this).o(TBOrderListFragment.this.getPublicMenu());
                    }
                    if (aVar.getTag("ali_ms_navigation") == null) {
                        aVar.setTag("ali_ms_navigation", TBOrderListFragment.O2(TBOrderListFragment.this));
                    }
                }
                if (this.f9102a) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("spm-url", ParallelBizValueHelper.d(ParallelBizValueHelper.PageType.order_list));
                    UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(hashMap);
                }
                Map<String, String> pageAllProperties = UTAnalytics.getInstance().getDefaultTracker().getPageAllProperties(TBOrderListFragment.this.getActivity());
                if (pageAllProperties != null && !pageAllProperties.isEmpty()) {
                    String str = "";
                    this.b = TextUtils.isEmpty(pageAllProperties.get("spm-cnt")) ? str : pageAllProperties.get("spm-cnt");
                    this.c = TextUtils.isEmpty(pageAllProperties.get("spm-url")) ? str : pageAllProperties.get("spm-url");
                    this.d = TextUtils.isEmpty(pageAllProperties.get("spm-pre")) ? str : pageAllProperties.get("spm-pre");
                    this.e = TextUtils.isEmpty(pageAllProperties.get("utparam-cnt")) ? str : pageAllProperties.get("utparam-cnt");
                    this.f = TextUtils.isEmpty(pageAllProperties.get(z9u.KEY_UTPARAM_URL)) ? str : pageAllProperties.get(z9u.KEY_UTPARAM_URL);
                    if (!TextUtils.isEmpty(pageAllProperties.get("utparam-pre"))) {
                        str = pageAllProperties.get("utparam-pre");
                    }
                    this.g = str;
                    if (TBOrderListFragment.W2(TBOrderListFragment.this) != null) {
                        TBOrderListFragment.W2(TBOrderListFragment.this).f1(TBOrderListFragment.R2(TBOrderListFragment.this), true);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                m8v.a(e);
            }
        }

        @Override // tb.kbv
        public void a(DialogFragment dialogFragment, com.taobao.android.weex_framework.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("18426694", new Object[]{this, dialogFragment, aVar});
                return;
            }
            try {
                TBOrderListFragment.S2(TBOrderListFragment.this, null);
                if (this.h) {
                    fsw.p("WebAppInterface");
                    this.h = false;
                }
                String str = "";
                if (this.f9102a) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("spm-cnt", !TextUtils.isEmpty(this.b) ? this.b : str);
                    hashMap.put("spm-url", !TextUtils.isEmpty(this.c) ? this.c : str);
                    hashMap.put("spm-pre", !TextUtils.isEmpty(this.d) ? this.d : str);
                    hashMap.put("utparam-cnt", !TextUtils.isEmpty(this.e) ? this.e : str);
                    hashMap.put("utparam-pre", !TextUtils.isEmpty(this.g) ? this.g : str);
                    if (!TextUtils.isEmpty(this.f)) {
                        str = this.f;
                    }
                    hashMap.put(z9u.KEY_UTPARAM_URL, str);
                    UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(hashMap);
                } else {
                    c2v.d orNewUTPageStateObject = c2v.getInstance().getOrNewUTPageStateObject(TBOrderListFragment.X2(TBOrderListFragment.this));
                    if (orNewUTPageStateObject != null) {
                        orNewUTPageStateObject.mSpmCnt = !TextUtils.isEmpty(this.b) ? this.b : str;
                        orNewUTPageStateObject.mSpmUrl = !TextUtils.isEmpty(this.c) ? this.c : str;
                        orNewUTPageStateObject.mSpmPre = !TextUtils.isEmpty(this.d) ? this.d : str;
                        orNewUTPageStateObject.mUtparamCnt = !TextUtils.isEmpty(this.e) ? this.e : str;
                        orNewUTPageStateObject.mUtparamUrl = !TextUtils.isEmpty(this.f) ? this.f : str;
                        if (!TextUtils.isEmpty(this.g)) {
                            str = this.g;
                        }
                        orNewUTPageStateObject.mUtparamPre = str;
                    } else {
                        return;
                    }
                }
                if (TBOrderListFragment.W2(TBOrderListFragment.this) != null) {
                    TBOrderListFragment.W2(TBOrderListFragment.this).g1(TBOrderListFragment.X2(TBOrderListFragment.this), true);
                    TBOrderListFragment.W2(TBOrderListFragment.this).f1(TBOrderListFragment.R2(TBOrderListFragment.this), false);
                }
            } catch (Exception e) {
                e.printStackTrace();
                m8v.a(e);
            }
        }
    }

    static {
        t2o.a(713031713);
        t2o.a(297795600);
        t2o.a(713031979);
        t2o.a(297795642);
        t2o.a(775946324);
        t2o.a(614465730);
        t2o.a(297795644);
        t2o.a(157286894);
        t2o.a(929038343);
        t2o.a(157286907);
    }

    public static /* synthetic */ otg A2(TBOrderListFragment tBOrderListFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (otg) ipChange.ipc$dispatch("48667c11", new Object[]{tBOrderListFragment});
        }
        return tBOrderListFragment.r;
    }

    public static /* synthetic */ boolean B2(TBOrderListFragment tBOrderListFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2720945", new Object[]{tBOrderListFragment})).booleanValue();
        }
        return tBOrderListFragment.U;
    }

    public static /* synthetic */ boolean C2(TBOrderListFragment tBOrderListFragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd3b6b39", new Object[]{tBOrderListFragment, new Boolean(z)})).booleanValue();
        }
        tBOrderListFragment.U = z;
        return z;
    }

    public static /* synthetic */ org.json.JSONObject D2(TBOrderListFragment tBOrderListFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (org.json.JSONObject) ipChange.ipc$dispatch("12cdb58e", new Object[]{tBOrderListFragment});
        }
        return tBOrderListFragment.n;
    }

    public static /* synthetic */ void E2(TBOrderListFragment tBOrderListFragment, MtopResponse mtopResponse, RecyclerView recyclerView, PageStatus pageStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8905345", new Object[]{tBOrderListFragment, mtopResponse, recyclerView, pageStatus});
        } else {
            tBOrderListFragment.j3(mtopResponse, recyclerView, pageStatus);
        }
    }

    public static /* synthetic */ Activity J2(TBOrderListFragment tBOrderListFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("6ffdd60a", new Object[]{tBOrderListFragment});
        }
        return ((TBMainBaseFragment) tBOrderListFragment).mActivity;
    }

    public static /* synthetic */ ViewGroup K2(TBOrderListFragment tBOrderListFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("481d9eb8", new Object[]{tBOrderListFragment});
        }
        return tBOrderListFragment.w;
    }

    public static /* synthetic */ com.taobao.android.order.core.a M2(TBOrderListFragment tBOrderListFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.order.core.a) ipChange.ipc$dispatch("836bc165", new Object[]{tBOrderListFragment});
        }
        return tBOrderListFragment.y;
    }

    public static /* synthetic */ boolean N2(TBOrderListFragment tBOrderListFragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("825db5c7", new Object[]{tBOrderListFragment, new Boolean(z)})).booleanValue();
        }
        tBOrderListFragment.m = z;
        return z;
    }

    public static /* synthetic */ mrr O2(TBOrderListFragment tBOrderListFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mrr) ipChange.ipc$dispatch("befc4e50", new Object[]{tBOrderListFragment});
        }
        return tBOrderListFragment.I;
    }

    public static /* synthetic */ mrr Q2(TBOrderListFragment tBOrderListFragment, mrr mrrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mrr) ipChange.ipc$dispatch("1faccd20", new Object[]{tBOrderListFragment, mrrVar});
        }
        tBOrderListFragment.I = mrrVar;
        return mrrVar;
    }

    public static /* synthetic */ RecyclerView R2(TBOrderListFragment tBOrderListFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("1daacb8c", new Object[]{tBOrderListFragment});
        }
        return tBOrderListFragment.v;
    }

    public static /* synthetic */ String S2(TBOrderListFragment tBOrderListFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d20aff94", new Object[]{tBOrderListFragment, str});
        }
        tBOrderListFragment.G = str;
        return str;
    }

    public static /* synthetic */ void T2(TBOrderListFragment tBOrderListFragment, String str, HashMap hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80a91a97", new Object[]{tBOrderListFragment, str, hashMap});
        } else {
            tBOrderListFragment.z3(str, hashMap);
        }
    }

    public static /* synthetic */ Map U2(TBOrderListFragment tBOrderListFragment, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3772c16b", new Object[]{tBOrderListFragment, map});
        }
        tBOrderListFragment.t = map;
        return map;
    }

    public static /* synthetic */ eel W2(TBOrderListFragment tBOrderListFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eel) ipChange.ipc$dispatch("20f776a4", new Object[]{tBOrderListFragment});
        }
        return tBOrderListFragment.i;
    }

    public static /* synthetic */ FragmentActivity X2(TBOrderListFragment tBOrderListFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentActivity) ipChange.ipc$dispatch("45efc70", new Object[]{tBOrderListFragment});
        }
        return tBOrderListFragment.f9090a;
    }

    public static /* synthetic */ String a3(TBOrderListFragment tBOrderListFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b0955c92", new Object[]{tBOrderListFragment});
        }
        return tBOrderListFragment.H;
    }

    public static /* synthetic */ WeexInstance b3(TBOrderListFragment tBOrderListFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexInstance) ipChange.ipc$dispatch("e16bd667", new Object[]{tBOrderListFragment});
        }
        return tBOrderListFragment.x;
    }

    public static /* synthetic */ WeexInstance c3(TBOrderListFragment tBOrderListFragment, WeexInstance weexInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexInstance) ipChange.ipc$dispatch("8011eacb", new Object[]{tBOrderListFragment, weexInstance});
        }
        tBOrderListFragment.x = weexInstance;
        return weexInstance;
    }

    public static /* synthetic */ ParallelBizValueHelper.PageType d3(TBOrderListFragment tBOrderListFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ParallelBizValueHelper.PageType) ipChange.ipc$dispatch("ab47e807", new Object[]{tBOrderListFragment});
        }
        return tBOrderListFragment.g;
    }

    public static /* synthetic */ Object ipc$super(TBOrderListFragment tBOrderListFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2147180915:
                super.onSaveInstanceState((Bundle) objArr[0]);
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1002290867:
                super.onActivityCreated((Bundle) objArr[0]);
                return null;
            case 1088398452:
                return super.onCreateAnimation(((Number) objArr[0]).intValue(), ((Boolean) objArr[1]).booleanValue(), ((Number) objArr[2]).intValue());
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/TBOrderListFragment");
        }
    }

    public static /* synthetic */ void p2(TBOrderListFragment tBOrderListFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49ad9e35", new Object[]{tBOrderListFragment});
        } else {
            tBOrderListFragment.j4();
        }
    }

    public static /* synthetic */ void r2(TBOrderListFragment tBOrderListFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fb16994", new Object[]{tBOrderListFragment});
        } else {
            tBOrderListFragment.h3();
        }
    }

    public static /* synthetic */ void s2(TBOrderListFragment tBOrderListFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("845f1066", new Object[]{tBOrderListFragment});
        } else {
            tBOrderListFragment.T3();
        }
    }

    public static /* synthetic */ void u2(TBOrderListFragment tBOrderListFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a62dbc5", new Object[]{tBOrderListFragment});
        } else {
            tBOrderListFragment.L3();
        }
    }

    public static /* synthetic */ OrderConfigs v2(TBOrderListFragment tBOrderListFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OrderConfigs) ipChange.ipc$dispatch("76482ea2", new Object[]{tBOrderListFragment});
        }
        return tBOrderListFragment.j;
    }

    public static /* synthetic */ View z2(TBOrderListFragment tBOrderListFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("56209005", new Object[]{tBOrderListFragment});
        }
        return tBOrderListFragment.k;
    }

    public final void A3(HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2eee1c", new Object[]{this, hashMap});
        } else if (this.y != null) {
            if (!this.s) {
                this.j.N(null);
            }
            TBSwipeRefreshLayout tBSwipeRefreshLayout = this.l;
            if ((tBSwipeRefreshLayout == null || !tBSwipeRefreshLayout.isRefreshing()) && !this.i.f0() && !this.i.l0()) {
                this.i.d1(((TBMainBaseFragment) this).mActivity, this.w);
            }
            if (this.i.l0()) {
                this.i.X().setIsCanScroll(false);
            }
            R3();
            this.y.p();
            if (!TextUtils.isEmpty(this.i.G())) {
                HashMap<String, JSONObject> hashMap2 = W;
                if (hashMap2.get(this.i.G()) != null) {
                    this.y.f(hashMap2.get(this.i.G()), this);
                    hashMap2.remove(this.i.G());
                    this.i.N0(null);
                    this.m = false;
                    k3();
                }
            }
            g3();
            f3(hashMap);
            this.y.g(this);
            this.m = false;
            k3();
        }
    }

    public final void B3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dbd1c41", new Object[]{this, str});
        } else {
            z3(str, null);
        }
    }

    @Override // tb.h6e
    public rgv D0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rgv) ipChange.ipc$dispatch("9c85efa3", new Object[]{this, str});
        }
        eel eelVar = this.i;
        if (eelVar == null) {
            return null;
        }
        return eelVar.Q(str);
    }

    public final boolean E3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2f1d19", new Object[]{this})).booleanValue();
        }
        if (!Localization.o()) {
            return true;
        }
        try {
            if (this.i.U(this.y).b().getComponentByName("feedStream") != null) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public final void F3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6809060c", new Object[]{this});
            return;
        }
        if (this.f == null) {
            this.f = new OrderLoginBroadcastReceiver();
        }
        LoginBroadcastHelper.registerLoginReceiver(Globals.getApplication(), this.f);
    }

    public void G3() {
        if (this.i.f0()) {
            if (this.i.w() != null && v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_MY_TAOBAO, "enableAdvanceLoadRefund", true)) {
                this.i.w().addView(new View(this.f9090a), 0, mgw.e(((TBMainBaseFragment) this).mActivity) + (this.j.r() != null ? 44 : 85));
            }
            this.j.P();
            this.j.R(this.i.K());
        }
        if (this.S) {
            this.j.D(true);
        }
        if (!this.i.f0() && !this.i.l0() && !this.i.n0()) {
            this.y.f(this.i.F(), null);
        }
        if (this.i.l0()) {
            this.A.f().put("cache_load_start", Long.valueOf(System.currentTimeMillis()));
            ((UltronListProxy) this.y.c()).q0(this.i.B(), false, null, this.i.C());
            this.A.f().put("cache_load_end", Long.valueOf(System.currentTimeMillis()));
        }
        wqb c2 = this.y.c();
        if (c2 instanceof UltronListProxy) {
            edl.c((gav) c2);
            ((UltronListProxy) c2).v0(new f());
        }
        int j = dbl.j();
        if (j > 0 && dbl.w()) {
            try {
                this.v = this.j.u().i(this.k);
                Field declaredField = RecyclerView.class.getDeclaredField("mMaxFlingVelocity");
                declaredField.setAccessible(true);
                declaredField.set(this.v, Integer.valueOf(pb6.f(this.f9090a, j)));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        RecyclerView i = this.j.u().i(this.k);
        this.v = i;
        if (i != null) {
            i.addOnScrollListener(this.T);
        }
        nl2.d(this.j);
        if (this.i.f0()) {
            this.i.e1();
        }
    }

    @Override // tb.i4d
    public void H2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c322178", new Object[]{this, str});
        }
    }

    public final void I3(boolean z) {
        FragmentActivity fragmentActivity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db5487b6", new Object[]{this, new Boolean(z)});
        } else if (this.P != null && (fragmentActivity = this.f9090a) != null) {
            if (z) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addCategory("android.intent.category.DEFAULT");
                intentFilter.addAction(rvl.ALIPAY_ACTION);
                LocalBroadcastManager.getInstance(this.f9090a).registerReceiver(this.P, intentFilter);
                return;
            }
            LocalBroadcastManager.getInstance(fragmentActivity).unregisterReceiver(this.P);
        }
    }

    public final void J3(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c574c260", new Object[]{this, new Boolean(z)});
        } else if (OrderType.ORDERLIST.getValue().equals(this.i.D())) {
            if (z) {
                pav.k(new orr(this));
            } else {
                bel.a();
            }
        }
    }

    @Override // tb.ptg.c
    public Context L2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e86b45e3", new Object[]{this});
        }
        return getContext();
    }

    public final void L3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("838df391", new Object[]{this});
        } else {
            this.y.c().c(127);
        }
    }

    @Override // tb.h6e
    public rgv M0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rgv) ipChange.ipc$dispatch("e33438b6", new Object[]{this});
        }
        eel eelVar = this.i;
        if (eelVar != null) {
            return eelVar.s();
        }
        hav.g("KEY_OrderListFragment", "getUnexpectedReachMonitor:", "viewModel is null");
        return new rgv();
    }

    public void M3(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9be4702d", new Object[]{this, activity});
            return;
        }
        if (this.z == null) {
            this.z = LocalBroadcastManager.getInstance(activity);
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.alipay.android.app.pay.ACTION_PAY_SUCCESS");
        intentFilter.addAction("com.alipay.android.app.pay.ACTION_PAY_FAILED");
        BroadcastReceiver broadcastReceiver = this.Q;
        if (broadcastReceiver != null) {
            this.z.registerReceiver(broadcastReceiver, intentFilter);
        }
    }

    @Override // tb.ptg.c
    public void N(TBSwipeRefreshLayout tBSwipeRefreshLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89de43d", new Object[]{this, tBSwipeRefreshLayout});
        } else {
            this.l = tBSwipeRefreshLayout;
        }
    }

    public final void N3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57549641", new Object[]{this});
            return;
        }
        this.e = new prr(this);
        TBAutoSizeConfig.x().d0(this.e);
    }

    public final void O3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48d708ff", new Object[]{this});
        } else {
            this.i.e0(this.y);
        }
    }

    @Override // tb.l2e
    public boolean P2(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("279bed7a", new Object[]{this, str, jSONObject})).booleanValue();
        }
        eel eelVar = this.i;
        if (eelVar != null) {
            return eelVar.l(this.f9090a, str, jSONObject);
        }
        return false;
    }

    @Override // tb.ptg.c
    public void R0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50e4a91e", new Object[]{this});
            return;
        }
        OrderRecommendWrapper orderRecommendWrapper = this.q;
        if (orderRecommendWrapper != null) {
            orderRecommendWrapper.f();
        }
    }

    public final void S3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("488e0257", new Object[]{this});
            return;
        }
        RecyclerView.OnScrollListener onScrollListener = this.T;
        if (onScrollListener != null) {
            RecyclerView recyclerView = this.v;
            if (recyclerView != null) {
                recyclerView.removeOnScrollListener(onScrollListener);
            }
            RecyclerView i = this.i.W().i(this.k);
            this.v = i;
            if (i != null) {
                i.removeOnScrollListener(this.T);
                this.v.addOnScrollListener(this.T);
            }
        }
    }

    public final void T3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1ee0781", new Object[]{this});
            return;
        }
        int c2 = DXWidgetNode.DXMeasureSpec.c(rhx.a(getActivity()).width(), 1073741824);
        wqb c3 = this.y.c();
        if (c3 instanceof gav) {
            ((gav) c3).getInstance().G().h1(c2);
        }
    }

    @Override // tb.pqb
    public void U1(JSONObject jSONObject, DataStatus dataStatus, PageStatus pageStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48a82554", new Object[]{this, jSONObject, dataStatus, pageStatus});
            return;
        }
        System.currentTimeMillis();
        C3();
        if (jSONObject != null) {
            try {
                OrderRecyclerView orderRecyclerView = (OrderRecyclerView) this.j.u().i(this.k);
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                JSONObject jSONObject3 = jSONObject.getJSONObject("global");
                if (!(jSONObject2 == null || jSONObject3 == null)) {
                    if (TextUtils.equals("true", OrangeConfig.getInstance().getConfig("babelorder", "orderDetailFilterEnablePreRender", "true"))) {
                        eel eelVar = this.i;
                        eelVar.a0(this.f9090a, jSONObject, eelVar.A(orderRecyclerView));
                    }
                    if (jSONObject3.getJSONObject("pageControl") != null) {
                        this.n = new org.json.JSONObject(jSONObject3.getJSONObject("pageControl"));
                        if (jSONObject3.getJSONObject("recommendData") != null) {
                            this.o = new org.json.JSONObject(jSONObject3.getJSONObject("recommendData"));
                        }
                        this.i.U0(null, jSONObject3);
                        u3(orderRecyclerView, this.n.optString("hasMore"), jSONObject2.getString(TBSearchChiTuJSBridge.ABTEST));
                    }
                    if (orderRecyclerView != null) {
                        orderRecyclerView.resetScroll();
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                m8v.a(e2);
            }
        }
    }

    public final void U3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb2362c6", new Object[]{this});
            return;
        }
        if (TextUtils.isEmpty(this.i.O())) {
            this.i.M0(exi.c(this.d));
        } else {
            this.i.M0(exi.e(this.d));
        }
        this.y.p();
        this.y.f(this.i.F(), this);
    }

    @Override // tb.h4d
    public void V2(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("203e7a52", new Object[]{this, str, obj});
            return;
        }
        if (this.B == null) {
            this.B = new HashMap<>();
        }
        this.B.put(str, obj);
    }

    public void V3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2925f12", new Object[]{this});
        } else {
            this.M.set(true);
        }
    }

    public void Y3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4947333", new Object[]{this});
        } else if (this.f != null) {
            LoginBroadcastHelper.unregisterLoginReceiver(Globals.getApplication(), this.f);
        }
    }

    public final void a4(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8173b645", new Object[]{this, jSONObject});
        } else if (this.d) {
            jSONObject.put("foldDeviceRelatedPage", "true");
        }
    }

    public final void c4(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22323282", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            try {
                UTTracker defaultTracker = UTAnalytics.getInstance().getDefaultTracker();
                Map<String, String> pageProperties = defaultTracker.getPageProperties(getActivity());
                if (pageProperties == null) {
                    pageProperties = new HashMap<>();
                }
                pageProperties.put("spm-cnt", str);
                defaultTracker.updatePageProperties(getActivity(), pageProperties);
            } catch (Exception e2) {
                hav.b(OrderBizCode.orderList, "updatePageSpmCntException", e2.getMessage());
                m8v.a(e2);
            }
        }
    }

    public void d4(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1417410a", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            this.G = str;
        }
    }

    public final void e3(org.json.JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("530cafb8", new Object[]{this, jSONObject});
        } else if (jSONObject != null && this.i.r() != null) {
            try {
                this.i.r().put(CoreConstants.KEY_PAGE_CONTEXT, (Object) jSONObject.toString());
                this.i.M().j().put("condition", this.i.r().toJSONString());
            } catch (Exception e2) {
                m8v.a(e2);
            }
        }
    }

    public final void e4(org.json.JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a342eba4", new Object[]{this, jSONObject});
        } else if (OrderType.ORDERSEARCH.getValue().equals(this.i.D())) {
            HashMap hashMap = new HashMap();
            hashMap.put("searchKey", this.i.O());
            String optString = jSONObject.optString(CoreConstants.IN_PARAM_ORDER_SEARCH_ID);
            String optString2 = jSONObject.optString(CoreConstants.IN_PARAM_ORDER_SEARCH_ID_NEW);
            if (!TextUtils.isEmpty(optString)) {
                this.j.T(optString);
                eel eelVar = this.i;
                if (eelVar != null && !TextUtils.isEmpty(eelVar.h1())) {
                    hashMap.put(jql.QUERY_SOURCE, this.i.h1());
                }
                if (!TextUtils.isEmpty(optString2)) {
                    hashMap.put(CoreConstants.IN_PARAM_ORDER_SEARCH_ID_NEW, optString2);
                }
                hashMap.put(CoreConstants.IN_PARAM_ORDER_SEARCH_ID, optString);
                hashMap.put("isSearchResult", "true");
                if (TextUtils.equals(this.i.I(), this.i.O())) {
                    str = "1";
                } else {
                    str = "0";
                }
                hashMap.put("recommend", str);
                String l = jql.l(this.c, "utLogMap");
                String l2 = jql.l(this.c, "utArgs");
                String l3 = jql.l(this.c, "utParam");
                try {
                    if (!TextUtils.isEmpty(l)) {
                        hashMap.put("utLogMap", URLEncoder.encode(l, "UTF-8"));
                    }
                    if (!TextUtils.isEmpty(l2)) {
                        hashMap.put("utArgs", URLEncoder.encode(l2, "UTF-8"));
                    }
                    if (!TextUtils.isEmpty(l3)) {
                        hashMap.put("utParam", URLEncoder.encode(l3, "UTF-8"));
                    }
                } catch (Throwable unused) {
                }
                UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(getActivity(), hashMap);
            }
        }
    }

    public final void f3(Map<String, Object> map) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe02289e", new Object[]{this, map});
        } else if (map != null && !map.isEmpty()) {
            try {
                String str = this.i.M().j().get("condition");
                if (str == null) {
                    jSONObject = new JSONObject();
                } else {
                    jSONObject = JSON.parseObject(str);
                }
                jSONObject.putAll(map);
                this.i.M().j().put("condition", jSONObject.toJSONString());
            } catch (Exception e2) {
                hav.b(OrderConfigs.BizNameType.ORDER_LIST.getBizName(), "appendParamsToCondition", e2.getMessage());
                m8v.a(e2);
            }
        }
    }

    public final void f4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab467db4", new Object[]{this});
            return;
        }
        try {
            c4(CoreConstants.UT_ORDER_LIST_SPM_CNT);
            UTTracker defaultTracker = UTAnalytics.getInstance().getDefaultTracker();
            HashMap hashMap = new HashMap();
            hashMap.put("spm-url", CoreConstants.UT_ORDER_LIST_SPM_CNT);
            defaultTracker.updateNextPageProperties(hashMap);
        } catch (Exception e2) {
            e2.printStackTrace();
            m8v.a(e2);
        }
    }

    public final void g3() {
        Uri data;
        String queryParameter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("771790ff", new Object[]{this});
            return;
        }
        try {
            Intent intent = this.c;
            if (intent != null && (data = intent.getData()) != null && (queryParameter = data.getQueryParameter("queryParams")) != null) {
                f3(JSON.parseObject(queryParameter));
            }
        } catch (Exception e2) {
            hav.b("OrderList", "appendQueryParamsFromOriginUriToCondition", e2.getMessage());
            m8v.a(e2);
        }
    }

    public final void g4(org.json.JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95149e15", new Object[]{this, jSONObject});
        } else if (!h4(jSONObject)) {
            c4(CoreConstants.UT_ORDER_LIST_SPM_CNT);
        }
    }

    @Override // com.taobao.tao.tbmainfragment.SupportSecondaryBaseFragment
    public AnimatorParams getAnimatorParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AnimatorParams) ipChange.ipc$dispatch("844ba8d1", new Object[]{this});
        }
        AnimatorParams animatorParams = new AnimatorParams();
        animatorParams.setDuration(250);
        animatorParams.setInterpolator(new PathInterpolator(0.42f, 0.0f, 0.58f, 1.0f));
        animatorParams.setAnimateXPercent(1.0f, 0.0f);
        return animatorParams;
    }

    @Override // com.taobao.tao.tbmainfragment.SupportSecondaryBaseFragment
    public PlaceHolderProvider getPlaceHolderProvider() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PlaceHolderProvider) ipChange.ipc$dispatch("d8f17d0c", new Object[]{this});
        }
        return this;
    }

    public final void h3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5aba2fb", new Object[]{this});
            return;
        }
        bfl bflVar = this.D;
        if (bflVar != null) {
            bflVar.a(dbv.BIZ_ORDER_DETAIL);
        }
    }

    public final OrderConfigs i3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OrderConfigs) ipChange.ipc$dispatch("432d4620", new Object[]{this});
        }
        OrderConfigs h2 = this.i.h(this.c);
        this.j = h2;
        h2.G(true);
        this.j.S(this.i.N());
        this.i.T0(null);
        return this.j;
    }

    @Override // com.taobao.tao.tbmainfragment.SupportSecondaryBaseFragment
    public boolean isExitAnimNeeded() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("140d3239", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public final void j4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dee2526", new Object[]{this});
        } else if (this.i.r() != null) {
            this.i.r().put("waitPayDowngrade", (Object) "true");
            B3("WaitPayDowngrade");
        }
    }

    @Override // tb.i4d
    public OrderConfigs l0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OrderConfigs) ipChange.ipc$dispatch("c9541bf1", new Object[]{this});
        }
        return this.j;
    }

    public final void l3(MtopResponse mtopResponse, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69317ac7", new Object[]{this, mtopResponse, str});
            return;
        }
        org.json.JSONObject jSONObject = this.n;
        if (jSONObject != null && !"1".equals(jSONObject.optString("nextPageIndex"))) {
            str = CoreConstants.DOWNGRADLE_V2TOV1_NONE_FIRST;
        }
        if (TextUtils.isEmpty(jql.n(this.c))) {
            dpj.d(this.f9090a, this.i.t(), str);
        } else {
            dpj.e(this.f9090a, this.i.O(), str);
        }
        finish();
    }

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment
    public String name() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this});
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        eel eelVar = this.i;
        if (eelVar != null && eelVar.T() != null) {
            this.i.r0(new TradeHybridTMSFragment.b.a(Integer.valueOf(i), Integer.valueOf(i2), intent));
        }
    }

    @Override // com.taobao.tao.tbmainfragment.SupportSecondaryBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public Animation onCreateAnimation(int i, boolean z, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("40dfa474", new Object[]{this, new Integer(i), new Boolean(z), new Integer(i2)});
        }
        if (!this.S || !z) {
            return onSupportCreateAnimation(i, z, i2);
        }
        return super.onCreateAnimation(i, z, i2);
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        View inflate = LayoutInflater.from(this.f9090a).inflate(R.layout.activity_order_list, viewGroup, false);
        this.u = inflate;
        return inflate;
    }

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (this.i.V() != null && this.i.V().onKeyDown(i, keyEvent)) {
            return true;
        }
        if (this.i.T() != null && this.i.T().O2(Integer.valueOf(i), keyEvent)) {
            return true;
        }
        if (this.i.x() == null || !this.i.x().onKeyDown(i, keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
        }
    }

    @Override // com.taobao.tao.tbmainfragment.SupportSecondaryBaseFragment, com.taobao.tao.tbmainfragment.TBMainBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        this.p = true;
        WeexInstance weexInstance = this.x;
        if (weexInstance != null) {
            weexInstance.onActivityPause();
        }
        eel eelVar = this.i;
        if (!(eelVar == null || eelVar.T() == null)) {
            this.i.r0(TradeHybridTMSFragment.b.c.INSTANCE);
        }
        Z3();
        BehaviR.getInstance().commitLeave(ParallelBizValueHelper.c(this.g), null, this, hqv.c(UTAnalytics.getInstance().getDefaultTracker().getPageAllProperties(this.f9090a)));
        UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(((TBMainBaseFragment) this).mActivity);
    }

    @Override // com.taobao.uikit.animation.api.PlaceHolderProvider
    public Bitmap onPreloadPlaceHolder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("77c9e2ee", new Object[]{this});
        }
        return this.i.v();
    }

    @Override // com.taobao.uikit.animation.api.PlaceHolderProvider
    public Bitmap onProvidePlaceHolder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("da338756", new Object[]{this});
        }
        Bitmap v = this.i.v();
        this.i.f();
        if (v != null || TabType.REFUND.getValue().equals(this.i.t())) {
            return v;
        }
        String E = this.i.E();
        hav.d(r63.TAG, "同步获取placeHolder");
        if (TextUtils.isEmpty(E) || yh.a().f32082a < 2) {
            Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), R.drawable.order_list_fragment_loading);
            hav.d(r63.TAG, "同步获取鱼骨图end");
            return decodeResource;
        }
        Bitmap decodeFile = BitmapFactory.decodeFile(E);
        hav.d(r63.TAG, "同步获取end");
        return decodeFile;
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80049e8d", new Object[]{this, bundle});
            return;
        }
        eel eelVar = this.i;
        if (eelVar != null) {
            eelVar.o0(bundle);
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // com.taobao.tao.tbmainfragment.SupportSecondaryBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        WeexInstance weexInstance = this.x;
        if (weexInstance != null) {
            weexInstance.onActivityStart();
        }
        eel eelVar = this.i;
        if (eelVar != null && eelVar.T() != null) {
            this.i.r0(TradeHybridTMSFragment.b.e.INSTANCE);
        }
    }

    @Override // com.taobao.tao.tbmainfragment.SupportSecondaryBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onStop() {
        OrderConfigs orderConfigs;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        WeexInstance weexInstance = this.x;
        if (weexInstance != null) {
            weexInstance.onActivityStop();
        }
        eel eelVar = this.i;
        if (!(eelVar == null || eelVar.T() == null)) {
            this.i.r0(TradeHybridTMSFragment.b.f.INSTANCE);
        }
        eel eelVar2 = this.i;
        if (eelVar2 != null && (orderConfigs = this.j) != null) {
            eelVar2.x0(orderConfigs);
            this.i.y0(this.j);
        }
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment
    public Animation onSupportCreateAnimation(int i, boolean z, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("809d5243", new Object[]{this, new Integer(i), new Boolean(z), new Integer(i2)});
        }
        if (!z) {
            return AnimationUtils.loadAnimation(getContext(), R.anim.no_anim);
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(2, 1.0f, 2, 0.0f, 2, 0.0f, 2, 0.0f);
        translateAnimation.setDuration(250L);
        translateAnimation.setAnimationListener(new g());
        return translateAnimation;
    }

    public final void p3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8876706b", new Object[]{this});
        } else if (this.T == null) {
            this.T = new RecyclerView.OnScrollListener() { // from class: com.taobao.android.order.bundle.TBOrderListFragment.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass9 r5, String str, Object... objArr) {
                    int hashCode = str.hashCode();
                    if (hashCode == -1177043419) {
                        super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                        return null;
                    } else if (hashCode == 1361287682) {
                        super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                        return null;
                    } else {
                        int hashCode2 = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/order/bundle/TBOrderListFragment$9");
                    }
                }

                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                        return;
                    }
                    super.onScrolled(recyclerView, i, i2);
                    TBOrderListFragment.A2(TBOrderListFragment.this).e(recyclerView, TBOrderListFragment.z2(TBOrderListFragment.this), i, i2);
                }

                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
                        return;
                    }
                    super.onScrollStateChanged(recyclerView, i);
                    TBOrderListFragment.A2(TBOrderListFragment.this).b(recyclerView, TBOrderListFragment.z2(TBOrderListFragment.this), i);
                    if ((i != 2 || i == 0) && !TBOrderListFragment.B2(TBOrderListFragment.this) && TBOrderListFragment.D2(TBOrderListFragment.this) != null && "true".equals(TBOrderListFragment.D2(TBOrderListFragment.this).optString("hasMore"))) {
                        if (recyclerView.getAdapter().getItemCount() - ((LinearLayoutManager) recyclerView.getLayoutManager()).findLastVisibleItemPosition() < 25) {
                            TBOrderListFragment.C2(TBOrderListFragment.this, true);
                            TBOrderListFragment.this.K3();
                        }
                        if (!TBOrderListFragment.B2(TBOrderListFragment.this) && i == 0 && TBOrderListFragment.W2(TBOrderListFragment.this) != null) {
                            TBOrderListFragment.W2(TBOrderListFragment.this).A0(recyclerView);
                        }
                    }
                }
            };
        }
    }

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment, com.taobao.uikit.actionbar.ITBPublicMenu
    public Bundle pageUserInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("65615653", new Object[]{this});
        }
        return jjx.b(this, this.G);
    }

    public final void q3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e4bbd25", new Object[]{this});
        } else if (!wbl.c()) {
            hav.g("KEY_OrderListFragment", "initLogisticsWeex2Fragment", "switcher is off");
        } else {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            ParallelBizValueHelper.PageType pageType = ParallelBizValueHelper.PageType.logistics_detail;
            this.i.H0(afl.c(ParallelBizValueHelper.c(pageType), ParallelBizValueHelper.c(ParallelBizValueHelper.PageType.order_list), null, null, true, R.id.orderListWeex2FragmentContainer, displayMetrics.widthPixels, displayMetrics.heightPixels));
            if (this.F == null) {
                this.F = new h(pageType);
            }
            if (this.i.x() != null) {
                this.i.x().v3(this.F);
            }
        }
    }

    public final void r3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5fda872", new Object[]{this});
            return;
        }
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        eel eelVar = this.i;
        ParallelBizValueHelper.PageType pageType = ParallelBizValueHelper.PageType.order_detail;
        eelVar.Y0(afl.c(ParallelBizValueHelper.c(pageType), ParallelBizValueHelper.c(ParallelBizValueHelper.PageType.order_list), null, null, true, R.id.orderListWeex2FragmentContainer, displayMetrics.widthPixels, displayMetrics.heightPixels));
        if (this.i.V() != null) {
            this.i.V().w3(this.C);
            if (this.E == null) {
                this.E = new h(pageType);
            }
            this.i.V().v3(this.E);
        }
    }

    public final void s3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd87ac60", new Object[]{this});
        } else {
            this.D = new bfl(this.C);
        }
    }

    public void setPageUserInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ef7c35b", new Object[]{this, str});
        } else {
            this.G = str;
        }
    }

    @Override // tb.i2e
    public String t1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f927f6fc", new Object[]{this});
        }
        return ParallelBizValueHelper.c(this.g);
    }

    @Override // tb.ptg.c
    public void updateCurrentContainView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d2473c2", new Object[]{this, view});
        } else {
            this.k = view;
        }
    }

    @Override // tb.i4d
    public void v1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32ebfeb0", new Object[]{this});
            return;
        }
        this.A.f().put("cache_img_load_end_time", Long.valueOf(System.currentTimeMillis()));
        this.A.m(true);
        this.A.h();
    }

    @Override // tb.ptg.c
    public void w2(TBSwipeRefreshLayout tBSwipeRefreshLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("494b6a85", new Object[]{this, tBSwipeRefreshLayout});
            return;
        }
        this.V = true;
        this.l = tBSwipeRefreshLayout;
        ParallelBizValueHelper.PageType pageType = this.g;
        com.taobao.android.order.bundle.base.parallelbiz.a.b(pageType, "_Button-" + this.i.t() + "-pullStartLoad", null);
        B3("PullToRefresh");
    }

    public final void w3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        this.w = (ViewGroup) this.u.findViewById(R.id.mask_layout);
        this.i.W0((LinearLayout) this.u.findViewById(R.id.top_layout));
        this.i.b1((SimpleViewpager) this.u.findViewById(R.id.viewpager));
        this.i.G0((LinearLayout) this.u.findViewById(R.id.header_layout));
        this.i.V0((FrameLayout) this.u.findViewById(R.id.tab_layout));
    }

    @Override // tb.h4d
    public Object x2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("b327bdd5", new Object[]{this, str});
        }
        HashMap<String, Object> hashMap = this.B;
        if (hashMap == null) {
            return null;
        }
        return hashMap.get(str);
    }

    public boolean x3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2b1ad4e", new Object[]{this})).booleanValue();
        }
        return this.M.get();
    }

    @Override // tb.h4d
    public void y2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1317040f", new Object[]{this, str});
            return;
        }
        HashMap<String, Object> hashMap = this.B;
        if (hashMap != null) {
            hashMap.remove(str);
        }
    }

    public final TBErrorView y3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBErrorView) ipChange.ipc$dispatch("8fb63d3a", new Object[]{this});
        }
        View view = this.k;
        if (view == null) {
            return null;
        }
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.order_list_view_stub);
        if (viewStub == null) {
            return (TBErrorView) this.k.findViewById(R.id.order_list_layout_to_inflate).findViewById(R.id.tb_order_error_view);
        }
        return (TBErrorView) viewStub.inflate().findViewById(R.id.tb_order_error_view);
    }

    @Override // tb.ptg.c
    public String z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b04cb2e7", new Object[]{this});
        }
        return this.i.t();
    }

    public final void z3(String str, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4d563d2", new Object[]{this, str, hashMap});
        } else {
            A3(hashMap);
        }
    }

    @Override // tb.pqb
    public void B1(JSONObject jSONObject) {
        Exception e2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f4f8313", new Object[]{this, jSONObject});
        } else if (jSONObject != null && "true".equals(jSONObject.getString("delayRefresh"))) {
            this.m = true;
        } else if (this.p) {
            this.m = true;
        } else {
            HashMap<String, Object> hashMap = null;
            if (!(jSONObject == null || this.i.r() == null)) {
                try {
                    if ("true".equals(jSONObject.getString("refreshFromCancelBtn"))) {
                        this.i.O0(true);
                        jSONObject.remove("refreshFromCancelBtn");
                    }
                    HashMap<String, Object> hashMap2 = new HashMap<>(jSONObject);
                    try {
                        this.i.r().putAll(hashMap2);
                        hashMap = hashMap2;
                    } catch (Exception e3) {
                        e2 = e3;
                        hashMap = hashMap2;
                        e2.printStackTrace();
                        m8v.a(e2);
                        z3("NativeRefresh", hashMap);
                    }
                } catch (Exception e4) {
                    e2 = e4;
                }
            }
            z3("NativeRefresh", hashMap);
        }
    }

    public void D3(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfbbd261", new Object[]{this, map});
            return;
        }
        org.json.JSONObject jSONObject = this.n;
        if (jSONObject != null) {
            e3(jSONObject.optJSONObject(CoreConstants.KEY_PAGE_CONTEXT));
        }
        f3(map);
        b4(this.i.M(), false);
        this.i.d1(((TBMainBaseFragment) this).mActivity, this.w);
        this.y.g(this);
    }

    public final void H3(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5216a1e", new Object[]{this, recyclerView});
        } else if (this.J) {
            hav.g("KEY_OrderListFragment", "prefetchWhenResponse", "server degrade");
            if (!this.K) {
                h3();
                this.K = true;
            }
        } else {
            org.json.JSONObject jSONObject = this.n;
            if (jSONObject != null) {
                try {
                    if (Integer.parseInt(jSONObject.optString("nextPageIndex")) - 1 > wbl.m()) {
                        hav.g("KEY_OrderListFragment", "prefetchWhenResponse", "invalid page");
                        return;
                    }
                } catch (Exception e2) {
                    m8v.a(e2);
                }
            }
            if (recyclerView == null || !(recyclerView.getAdapter() instanceof FixedViewAdapter) || !(((FixedViewAdapter) recyclerView.getAdapter()).N() instanceof RecyclerViewAdapter)) {
                hav.g("KEY_OrderListFragment", "prefetchWhenResponse", "invalid recyclerView");
                return;
            }
            eel eelVar = this.i;
            List<IDMComponent> q = eelVar == null ? null : eelVar.q(recyclerView);
            if (q == null || q.isEmpty()) {
                hav.g("KEY_OrderListFragment", "prefetchWhenResponse", "no components");
                return;
            }
            int n = wbl.n();
            ArrayList arrayList = new ArrayList();
            for (IDMComponent iDMComponent : q) {
                if (arrayList.size() >= n) {
                    break;
                } else if (iDMComponent != null && TextUtils.equals(iDMComponent.getTag(), "item")) {
                    arrayList.add(iDMComponent);
                }
            }
            this.D.d(arrayList, this.j);
        }
    }

    @Override // tb.a6r
    public boolean J0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d44aa950", new Object[]{this})).booleanValue();
        }
        return true ^ uel.l("removeActionbarConfig", true);
    }

    public void K3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f321b347", new Object[]{this});
            return;
        }
        ParallelBizValueHelper.PageType pageType = this.g;
        com.taobao.android.order.bundle.base.parallelbiz.a.b(pageType, "_Button-" + this.i.t() + "-pullEndLoad", null);
        org.json.JSONObject jSONObject = this.n;
        if (jSONObject != null) {
            e3(jSONObject.optJSONObject(CoreConstants.KEY_PAGE_CONTEXT));
            this.i.M().j().put("page", this.n.optString("nextPageIndex"));
        }
        b4(this.i.M(), false);
        this.y.g(this);
    }

    public final void Z3() {
        FragmentActivity fragmentActivity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d7a245f", new Object[]{this});
        } else if (v9v.i(wbl.NEW_BABEL_ORDER, "enableFragmentRegisterScreenshotObserver", false) && (fragmentActivity = this.f9090a) != null && this.N != null) {
            try {
                fragmentActivity.getContentResolver().unregisterContentObserver(this.N);
                vvo.k().t(null);
                vvo.k().r(null);
                vvo.k().q(null);
                this.N = null;
            } catch (Throwable unused) {
            }
        }
    }

    public final void a(String str, String str2, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee44d207", new Object[]{this, str, str2, mtopResponse});
            return;
        }
        lor.c("KEY_OrderListFragment", "handleMtopResponseByUrl", "DownGradeByUrl downGrade = " + str2);
        idl.c(idl.a.a(OrderBizCode.orderList, CoreConstants.JS_TRACKER_ORDER_LIST_NOT_DOWNGRADE_H5).sampling(1.0f).message("onLoadError：redirectToH5").success(false));
        Nav.from(this.f9090a).toUri(str);
        finish();
    }

    public final void b4(u3o u3oVar, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bcc84bc", new Object[]{this, u3oVar, new Boolean(z)});
        } else if (u3oVar == null || OrderType.ORDERFILTER.getValue().equals(this.i.D())) {
        } else {
            if (this.i.i0()) {
                u3oVar.b("orderList_cancel");
                this.i.O0(false);
            } else if (OrderType.ORDERSEARCH.getValue().equals(this.i.D())) {
                u3oVar.b("orderList_search");
            } else {
                if (z) {
                    str = "orderList_pageload";
                } else {
                    str = "orderList_loadmore";
                }
                u3oVar.b(str);
            }
        }
    }

    public final void i4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cac2e677", new Object[]{this});
        } else if (uel.l("enableNativeHeader", true) && !ykl.a() && !Localization.o()) {
            eel eelVar = this.i;
            if (eelVar == null || !eelVar.n0()) {
                this.A.f().put("native_header_init_start", Long.valueOf(System.currentTimeMillis()));
                hav.d("NativeHeaderInit", "start");
                if (!this.i.f0()) {
                    this.i.S().addView(new TBOrderListSearchView(getContext()));
                    this.j.H(true);
                }
                TBOrderListTabLayout tBOrderListTabLayout = new TBOrderListTabLayout(getContext());
                tBOrderListTabLayout.setInitialSelectedTab(this.i.t(), getContext());
                this.i.R().addView(tBOrderListTabLayout);
                this.j.U(tBOrderListTabLayout);
                this.j.V(this.i.S());
                hav.d("NativeHeaderInit", "end");
                this.A.f().put("native_header_init_end", Long.valueOf(System.currentTimeMillis()));
            }
        }
    }

    public final void j3(MtopResponse mtopResponse, RecyclerView recyclerView, PageStatus pageStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3892619", new Object[]{this, mtopResponse, recyclerView, pageStatus});
        } else if (!this.L.get() || !v9v.i(wbl.NEW_BABEL_ORDER, "forbidIdleTaskOnDestroy", true)) {
            eel eelVar = this.i;
            eelVar.b0(this.f9090a, pageStatus, mtopResponse, eelVar.A(recyclerView));
            this.D.e(mtopResponse);
            H3(recyclerView);
            d9x.e();
            this.i.p0(this.f9090a, pageStatus);
        } else {
            hav.g("KEY_OrderListFragment", "doIdleTask:", "forbid idle task onDestroy");
        }
    }

    public final void m3(MtopResponse mtopResponse, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("123fedeb", new Object[]{this, mtopResponse, str});
            return;
        }
        lor.c("KEY_OrderListFragment", "handleMtopResponseByH5", "DownGradeTOH5List downGrade = " + str);
        idl.c(idl.a.a(OrderBizCode.orderList, CoreConstants.JS_TRACKER_ORDER_LIST_NOT_DOWNGRADE_H5).sampling(1.0f).message("onLoadError：downgradeToH5").success(false));
        dpj.b(this.f9090a, this.i.t(), str);
        finish();
    }

    public void n3() {
        TBErrorView tBErrorView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb3ae8d", new Object[]{this});
        } else if (this.k != null) {
            if (v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_MY_TAOBAO, "enableNewTBErrorView", true)) {
                ViewGroup viewGroup = (ViewGroup) this.k.findViewById(R.id.order_list_error_view);
                if (viewGroup != null) {
                    viewGroup.removeAllViews();
                    viewGroup.setVisibility(8);
                }
            } else if (((ViewStub) this.k.findViewById(R.id.order_list_view_stub)) == null && (tBErrorView = (TBErrorView) this.k.findViewById(R.id.order_list_layout_to_inflate).findViewById(R.id.tb_order_error_view)) != null) {
                tBErrorView.setVisibility(8);
            }
        }
    }

    public final void o3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1263a53", new Object[]{this});
        } else if (this.c == null) {
            Bundle arguments = getArguments();
            if (arguments == null || !(arguments.get("originActivityIntent") instanceof Intent)) {
                FragmentActivity activity = getActivity();
                this.f9090a = activity;
                this.c = activity.getIntent();
            } else {
                this.c = (Intent) arguments.get("originActivityIntent");
            }
            if (arguments != null && arguments.getBoolean(KEY_NEED_HIDE_BACK_BTN)) {
                this.d = true;
                F3();
            }
        }
    }

    @Override // tb.ptg.c
    public void u1(JSONObject jSONObject) {
        JSONObject jSONObject2;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7c1f0fa", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            JSONObject jSONObject3 = null;
            try {
                jSONObject2 = jSONObject.getJSONObject("responseMtopData");
            } catch (JSONException e2) {
                lor.b("KEY_OrderListFragment", "updateParams-parse-res", e2);
                m8v.a(e2);
                jSONObject2 = null;
            }
            if (jSONObject2 != null) {
                str = String.valueOf(UUID.randomUUID());
                if (v9v.i(wbl.NEW_BABEL_ORDER, "enablePresetResponse", false)) {
                    W.put(str, jSONObject2);
                    this.i.N0(str);
                }
            } else {
                str = null;
            }
            Object obj = jSONObject.get("openNewPage");
            if (obj instanceof JSONObject) {
                Bundle bundle = new Bundle();
                bundle.putString("tabCode", this.i.t());
                JSONObject jSONObject4 = (JSONObject) obj;
                String string = jSONObject4.getString("url");
                if (!TextUtils.isEmpty(string)) {
                    Object obj2 = jSONObject4.get("queryParams");
                    if (!TextUtils.isEmpty(str) && (obj2 instanceof JSONObject)) {
                        JSONObject jSONObject5 = (JSONObject) obj2;
                        jSONObject5.put(CoreConstants.PRESETRES_KEY, (Object) str);
                        for (String str2 : jSONObject5.keySet()) {
                            bundle.putString(str2, jSONObject5.getString(str2));
                        }
                        string = c2u.b(string, jSONObject5);
                    }
                    Nav.from(this.f9090a).withExtras(bundle).toUri(string);
                    return;
                }
            }
            if (this.i.M() != null && this.i.M().j() != null) {
                Object obj3 = jSONObject.get("extraConditionParams");
                if (obj3 instanceof JSONObject) {
                    try {
                        jSONObject3 = JSON.parseObject(this.i.M().j().get("condition"));
                    } catch (JSONException e3) {
                        lor.b("KEY_OrderListFragment", "extCondition-parse-error", e3);
                        m8v.a(e3);
                    }
                    if (jSONObject3 != null) {
                        JSONObject jSONObject6 = (JSONObject) obj3;
                        for (String str3 : jSONObject6.keySet()) {
                            jSONObject3.put(str3, (Object) jSONObject6.getString(str3));
                        }
                    }
                }
                Object obj4 = jSONObject.get("extraBizParams");
                if (obj4 instanceof JSONObject) {
                    if (jSONObject3 == null) {
                        try {
                            jSONObject3 = JSON.parseObject(this.i.M().j().get("condition"));
                        } catch (JSONException e4) {
                            lor.b("KEY_OrderListFragment", "extBiz-parse-error", e4);
                            m8v.a(e4);
                        }
                    }
                    if (jSONObject3 != null) {
                        JSONObject jSONObject7 = (JSONObject) obj4;
                        for (String str4 : jSONObject7.keySet()) {
                            jSONObject3.put(str4, (Object) jSONObject7.getString(str4));
                        }
                    }
                }
                if (jSONObject3 != null) {
                    try {
                        this.i.B0(jSONObject3);
                        this.i.M().j().put("condition", jSONObject3.toJSONString());
                    } catch (JSONException unused) {
                    }
                }
            }
        }
    }

    public final void u3(OrderRecyclerView orderRecyclerView, String str, String str2) {
        OrderRecommendWrapper.RecType recType;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ab92d9c", new Object[]{this, orderRecyclerView, str, str2});
        } else if (this.i.k0()) {
            f4();
        } else if ("true".equals(str)) {
            OrderRecommendWrapper orderRecommendWrapper = this.q;
            if (orderRecommendWrapper != null) {
                orderRecyclerView.removeEndView(orderRecommendWrapper.a());
            }
        } else {
            this.l.enableLoadMore(false);
            try {
                OrderRecommendWrapper orderRecommendWrapper2 = this.q;
                if (orderRecommendWrapper2 != null) {
                    orderRecyclerView.removeEndView(orderRecommendWrapper2.a());
                    this.q.b();
                    this.q = null;
                    orderRecyclerView.removeAllEndViews();
                }
                JSONObject jSONObject = new JSONObject();
                if (!TextUtils.isEmpty(this.i.I()) && TextUtils.equals(this.i.I(), this.i.O())) {
                    jSONObject.put(gel.PARAM_REC_QUERY, (Object) this.i.I());
                    jSONObject.put("channelSrp", (Object) "gouhou_searchfg");
                } else if (!TextUtils.isEmpty(this.i.O())) {
                    jSONObject.put(gel.PARAM_REC_QUERY, (Object) this.i.O());
                }
                String str3 = "";
                org.json.JSONObject jSONObject2 = this.o;
                if (jSONObject2 != null) {
                    str3 = jSONObject2.optString("fromPageType");
                }
                FragmentActivity fragmentActivity = this.f9090a;
                if (this.i.c1()) {
                    recType = OrderRecommendWrapper.RecType.MAIN_SEARCH;
                } else {
                    recType = OrderRecommendWrapper.RecType.GUESS;
                }
                OrderRecommendWrapper orderRecommendWrapper3 = new OrderRecommendWrapper(orderRecyclerView, fragmentActivity, recType, str3, jSONObject);
                this.q = orderRecommendWrapper3;
                orderRecommendWrapper3.e();
                zw h2 = this.q.h();
                if ("true".equals(this.i.p()) && (h2 instanceof fdl)) {
                    ((fdl) h2).r("#FFFFFF");
                }
                if (this.o != null && E3()) {
                    jSONObject.putAll(JSON.parseObject(this.o.toString()));
                    this.q.g(jSONObject, str2);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final TBErrorView v3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBErrorView) ipChange.ipc$dispatch("e1c02acf", new Object[]{this});
        }
        if (!v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_MY_TAOBAO, "enableNewTBErrorView", false)) {
            return y3();
        }
        View view = this.k;
        if (view == null) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.order_list_error_view);
        if (viewGroup == null) {
            return y3();
        }
        TBErrorView tBErrorView = new TBErrorView(getActivity());
        viewGroup.addView(tBErrorView);
        viewGroup.setVisibility(0);
        return tBErrorView;
    }

    public final void C3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8368c920", new Object[]{this});
            return;
        }
        this.U = false;
        this.i.Z(this.w);
        n3();
        TBSwipeRefreshLayout tBSwipeRefreshLayout = this.l;
        if (tBSwipeRefreshLayout != null) {
            tBSwipeRefreshLayout.setRefreshing(false);
            this.l.setLoadMore(false);
        }
        this.i.X().setIsCanScroll(true);
        idl.c(idl.a.a(OrderBizCode.orderList, CoreConstants.JS_TRACKER_ORDER_LIST_NOT_DOWNGRADE_H5).sampling(0.001f).message("onLoadSuccess").success(true));
    }

    public final void P3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8fc5b66", new Object[]{this});
        } else if (v9v.i(wbl.NEW_BABEL_ORDER, "enableFragmentRegisterScreenshotObserver", false) && this.f9090a != null && this.y != null && this.N == null) {
            try {
                vvo.k().q(t1());
                ContentObserver l = vvo.k().l(this.f9090a.getApplicationContext());
                this.N = l;
                if (l != null) {
                    vvo.k().t(this.y);
                    this.f9090a.getContentResolver().registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, this.N);
                    this.f9090a.getContentResolver().registerContentObserver(MediaStore.Images.Media.INTERNAL_CONTENT_URI, true, this.N);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void Q3() {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44d953a5", new Object[]{this});
        } else if (uel.l("enableOListTabCache", true) && OrderType.ORDERLIST.getValue().equals(this.i.D())) {
            Pair<JSONObject, String> j = nrr.j(this.f9090a, this.i.t(), nrr.SCENE_RELOADCONTAINER);
            nrr.g();
            if (j != null && (obj = j.first) != null) {
                this.i.I0((JSONObject) obj);
                this.i.J0((String) j.second);
                this.i.Z0(true);
                if (v9v.i(wbl.NEW_BABEL_ORDER, "removeMegaLoading", true)) {
                    this.i.d1(((TBMainBaseFragment) this).mActivity, this.w);
                }
                this.j.I(true);
                this.y.f(this.i.B(), null);
                this.j.I(false);
            }
        }
    }

    public final void R3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b884929", new Object[]{this});
            return;
        }
        this.i.M().j().put("page", "1");
        this.j.Y("true".equals(this.i.p()));
        if (this.i.r() != null) {
            this.i.r().remove(CoreConstants.KEY_PAGE_CONTEXT);
            String b2 = ct0.b(this.f9090a, false);
            if (!TextUtils.isEmpty(b2)) {
                this.i.r().put("installApp", (Object) b2);
            }
            a4(this.i.r());
            try {
                this.i.M().j().put("condition", this.i.r().toJSONString());
            } catch (JSONException e2) {
                m8v.a(e2);
            }
        }
        b4(this.i.M(), true);
    }

    public void W3(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c27764fd", new Object[]{this, mtopResponse});
            return;
        }
        TBErrorView v3 = v3();
        if (v3 != null) {
            if (v9v.i("babelorder", "enableSetTopic", true)) {
                if (this.i != null && OrderType.ORDERSEARCH.getValue().equals(this.i.D())) {
                    v3.setTopic("order_list_search");
                } else if (this.i == null || !OrderType.ORDERFILTER.getValue().equals(this.i.D())) {
                    v3.setTopic("order_list");
                } else {
                    v3.setTopic("order_list_filter");
                }
            }
            if (mtopResponse != null) {
                v3.setError(Error.Factory.fromMtopResponse(mtopResponse.getResponseCode(), mtopResponse.getMappingCode(), mtopResponse.getRetCode(), mtopResponse.getRetMsg()));
            }
            v3.setVisibility(0);
            v3.setButton(TBErrorView.ButtonType.BUTTON_LEFT, Localization.q(R.string.order_biz_refresh), new b());
        }
    }

    @Override // tb.pqb
    public void X(String str, MtopResponse mtopResponse, DataStatus dataStatus, PageStatus pageStatus) {
        List<IDMComponent> q;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc8b03e2", new Object[]{this, str, mtopResponse, dataStatus, pageStatus});
            return;
        }
        this.U = false;
        if (mtopResponse != null) {
            this.l.setRefreshing(false);
            this.l.setLoadMore(false);
            this.i.X().setIsCanScroll(true);
            if (mtopResponse.isApiSuccess()) {
                if (dbl.e()) {
                    m3(mtopResponse, "ReturnH5");
                } else {
                    l3(mtopResponse, CoreConstants.DOWNGRADLE_V2TOV1);
                }
            } else if (mtopResponse.isMtopServerError() || mtopResponse.isMtopSdkError() || mtopResponse.isSessionInvalid()) {
                if (o9l.b()) {
                    if (this.n == null || "1".equals(this.i.M().j().get("page"))) {
                        try {
                            if (v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_MY_TAOBAO, "enableBlockErrorView", true) && (q = this.i.q((OrderRecyclerView) this.j.u().i(this.k))) != null) {
                                if (!q.isEmpty()) {
                                    z = false;
                                }
                            }
                        } catch (Exception e2) {
                            e2.printStackTrace();
                            m8v.a(e2);
                        }
                        if (this.i.l0() || !z) {
                            h0u.c(this.f9090a, mtopResponse.getRetMsg());
                        } else {
                            U3();
                            W3(mtopResponse);
                        }
                        this.i.Z0(false);
                    } else {
                        h0u.c(this.f9090a, mtopResponse.getRetMsg());
                    }
                    this.i.Z(this.w);
                    return;
                }
                l3(mtopResponse, mtopResponse.getRetCode());
            } else if ("ReturnH5".equals(mtopResponse.getRetCode())) {
                m3(mtopResponse, "ReturnH5");
            } else if (ncl.CODE_REDIRECT_302.equals(mtopResponse.getRetCode())) {
                org.json.JSONObject dataJsonObject = mtopResponse.getDataJsonObject();
                String optString = dataJsonObject != null ? dataJsonObject.optString(Constants.WEIBO_REDIRECTURL_KEY) : null;
                if (!TextUtils.isEmpty(optString)) {
                    a(optString, mtopResponse.getRetCode(), mtopResponse);
                }
            }
        }
    }

    @Override // tb.ptg.c
    public void Z2(String str) {
        String str2;
        WeexInstance weexInstance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a7c4379", new Object[]{this, str});
            return;
        }
        boolean i = v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_MY_TAOBAO, "enableTabChangePreRender", true);
        S3();
        n3();
        this.i.j();
        String str3 = null;
        this.n = null;
        TabType tabType = TabType.REFUND;
        if (tabType.getValue().equals(this.i.t())) {
            TBRefundInstanceManager.onTabSelectedRefundList(this.x, false);
            TBRefundInstanceManager.reportRumInRefundList(false, this.i.J());
            this.i.y0(this.j);
            if (this.i.J() != null && i) {
                this.i.J().removeAllViews();
                TBRefundInstanceManager.dispatchVisibilityState(this.x, false);
            }
        }
        if (str != null) {
            this.i.C0(str);
        }
        this.i.M().j().put("tabCode", this.i.t());
        this.l.enablePullRefresh(!TextUtils.equals(this.i.t(), tabType.getValue()));
        k3();
        if (tabType.getValue().equals(str)) {
            this.i.e1();
            TBRefundInstanceManager.dispatchVisibilityState(this.x, true);
            if (i) {
                wqb c2 = this.y.c();
                if (this.i.J() == null || (weexInstance = this.x) == null) {
                    TBRefundInstanceManager.startPreRequestOnIdle(this.f9090a);
                    if (!TextUtils.isEmpty(this.j.m())) {
                        str3 = this.j.m();
                    }
                    FrameLayout frameLayout = new FrameLayout(getActivity());
                    this.i.P0(frameLayout);
                    long currentTimeMillis = System.currentTimeMillis();
                    if (c2 instanceof UltronListProxy) {
                        currentTimeMillis = ((UltronListProxy) c2).o0();
                    }
                    FragmentActivity activity = getActivity();
                    String l = Long.toString(currentTimeMillis);
                    if (this.i.j0()) {
                        str2 = "other";
                    } else {
                        str2 = "order";
                    }
                    WeexInstance refundWeex2PreRender = TBRefundInstanceManager.refundWeex2PreRender(activity, frameLayout, str3, new TBRefundInstanceManager.b(l, str2, true));
                    this.x = refundWeex2PreRender;
                    TBRefundInstanceManager.onTabSelectedRefundList(refundWeex2PreRender, true);
                    TBRefundInstanceManager.reportRumInRefundList(true, this.i.J());
                    this.j.Q(frameLayout);
                    this.i.v0(c2);
                    return;
                }
                if (!(weexInstance.getRootView() == null || this.x.getRootView().getParent() == null)) {
                    ((ViewGroup) this.x.getRootView().getParent()).removeView(this.x.getRootView());
                }
                this.i.J().addView(this.x.getRootView());
                this.x.dispatchEvent(WeexEventTarget.DOCUMENT_TARGET, "instance.expose", null);
                this.j.Q(this.i.J());
                this.i.v0(c2);
                TBRefundInstanceManager.onTabSelectedRefundList(this.x, true);
                TBRefundInstanceManager.reportRumInRefundList(true, this.i.J());
                return;
            }
        }
        Q3();
        J3(true);
        B3("SwitchTab");
    }

    public final boolean h4(org.json.JSONObject jSONObject) {
        org.json.JSONObject optJSONObject;
        org.json.JSONObject optJSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d1412a5f", new Object[]{this, jSONObject})).booleanValue();
        }
        if (jSONObject == null) {
            return false;
        }
        try {
            org.json.JSONObject optJSONObject3 = jSONObject.optJSONObject("events");
            if (optJSONObject3 == null || optJSONObject3.length() == 0 || (optJSONObject = optJSONObject3.optJSONObject("utSPM")) == null || (optJSONObject2 = optJSONObject.optJSONObject("fields")) == null) {
                return false;
            }
            String optString = optJSONObject2.optString(o65.SPM_A);
            String optString2 = optJSONObject2.optString(o65.SPM_B);
            if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                c4(optString + "." + optString2 + ".0.0");
                return true;
            }
            return false;
        } catch (Exception e2) {
            hav.b(OrderBizCode.orderList, "updateSpmException", e2.getMessage());
            m8v.a(e2);
            return false;
        }
    }

    @Override // com.taobao.tao.tbmainfragment.SupportSecondaryBaseFragment
    public boolean isFragmentAsyncAnimNeeded(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88d0725d", new Object[]{this, context})).booleanValue();
        }
        if (this.R) {
            return this.S;
        }
        if (ykl.a()) {
            this.R = true;
            this.S = false;
            return false;
        }
        o3();
        this.R = true;
        if (TabType.REFUND.getValue().equals(jql.h(this.c))) {
            this.S = false;
        } else {
            this.S = r63.c();
        }
        hav.d(r63.TAG, "异步动画：" + this.S);
        return this.S;
    }

    public final void k3() {
        brb u;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c7dbb38", new Object[]{this});
            return;
        }
        OrderConfigs orderConfigs = this.j;
        if (orderConfigs != null && (u = orderConfigs.u()) != null) {
            if (TextUtils.equals(this.i.t(), "reFund")) {
                u.c(this.k, false);
            } else {
                u.c(this.k, true);
            }
        }
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bbdbeb3", new Object[]{this, bundle});
            return;
        }
        super.onActivityCreated(bundle);
        w3();
        pav.k(new e());
        ldl.INSTANCE.f(false);
        this.i.T0(bundle);
        this.A.f().put("order_core_engine_init_start", Long.valueOf(System.currentTimeMillis()));
        this.y = com.taobao.android.order.core.a.a(i3());
        i4();
        this.y.e();
        this.A.f().put("order_core_engine_init_end", Long.valueOf(System.currentTimeMillis()));
        O3();
        G3();
        this.s = true;
        eel eelVar = this.i;
        if (eelVar != null) {
            eelVar.s0(this.f9090a, bundle);
        }
        if (this.d) {
            T3();
            N3();
        }
        this.A.f().put("on_create_finish", Long.valueOf(System.currentTimeMillis()));
    }

    @Override // com.taobao.tao.tbmainfragment.SupportSecondaryBaseFragment, com.taobao.tao.tbmainfragment.TBMainBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        if (HybridPreRenderHelper.i()) {
            AsyncInstanceLoadManager.INSTANCE.l();
        }
        FragmentActivity activity = getActivity();
        this.f9090a = activity;
        if (!(activity == null || activity.getWindow() == null)) {
            this.f9090a.getWindow().setFormat(-3);
        }
        idl.f(OrderBizCode.orderList, 0.001f);
        o3();
        ParallelBizValueHelper.PageType pageType = ParallelBizValueHelper.PageType.order_list;
        this.g = pageType;
        String b2 = ParallelBizValueHelper.b(pageType);
        f9v.v(b2);
        vav.h("tborder", this.h);
        vav.h(OrderConfigs.BizNameType.ORDER_LIST.getBizName(), this.h);
        X3(b2, bundle);
        eel d2 = ldl.INSTANCE.d();
        this.i = d2;
        if (d2 == null || !d2.Y()) {
            this.i = new eel(this.f9090a);
        } else {
            this.i.z0(getContext());
        }
        this.i.K0(this.A);
        this.i.R0(bundle != null);
        Intent intent = this.c;
        if (intent != null) {
            dpj.g(this.f9090a, intent);
        }
        pcl.d(this.f9090a.getApplicationContext());
        fsw.i(CoreConstants.ORDER_WV_TB_ODER, WvOrderPlugin.class, true);
        t3();
        if (this.i.f0()) {
            if (!TBRefundInstanceManager.isNetStart()) {
                TBRefundInstanceManager.startPreRequestOnIdle(this.f9090a);
            }
            this.i.P0(new FrameLayout(this.f9090a));
            if (HybridPreRenderHelper.i()) {
                AsyncInstanceLoadManager.INSTANCE.i(new d());
            } else {
                TBRefundInstanceManager.reportRumInRefundList(true, this.i.J());
                FragmentActivity fragmentActivity = this.f9090a;
                ViewGroup J = this.i.J();
                String L = this.i.L();
                String u = this.i.u();
                if (this.i.j0()) {
                    str = "other";
                } else {
                    str = this.i.y();
                }
                this.x = TBRefundInstanceManager.refundWeex2PreRender(fragmentActivity, J, L, new TBRefundInstanceManager.b(u, str, true));
            }
        }
        r3();
        s3();
        q3();
        this.i.d0();
        nl2.b(this.f9090a, this.O);
        nl2.c(this.f9090a);
        nl2.a(this.f9090a);
        M3(this.f9090a);
        I3(true);
        p3();
        this.L.set(false);
        this.M.set(false);
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        RecyclerView recyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        this.L.set(true);
        edl.b();
        com.taobao.android.order.core.a aVar = this.y;
        if (aVar != null) {
            wqb c2 = aVar.c();
            if (c2 instanceof UltronListProxy) {
                ((UltronListProxy) c2).v0(null);
            }
            this.y.b();
        }
        if (this.e != null) {
            TBAutoSizeConfig.x().h0(this.e);
        }
        nl2.h(this.f9090a, this.O);
        nl2.i();
        nl2.g();
        nl2.j();
        LocalBroadcastManager.getInstance(this.f9090a).unregisterReceiver(this.Q);
        RecyclerView.OnScrollListener onScrollListener = this.T;
        if (!(onScrollListener == null || (recyclerView = this.v) == null)) {
            recyclerView.removeOnScrollListener(onScrollListener);
        }
        Y3();
        if (this.i != null && TabType.REFUND.getValue().equals(this.i.t())) {
            TBRefundInstanceManager.reportRumInRefundList(false, this.i.J());
        }
        AsyncInstanceLoadManager.j();
        WeexInstance weexInstance = this.x;
        if (weexInstance != null) {
            weexInstance.destroy();
        }
        eel eelVar = this.i;
        if (!(eelVar == null || eelVar.T() == null)) {
            this.i.r0(TradeHybridTMSFragment.b.C0079b.INSTANCE);
        }
        ldl.INSTANCE.e();
        if (this.i.V() != null) {
            this.i.V().C2();
            this.E = null;
            this.i.V().v3(null);
        }
        if (this.i.x() != null) {
            this.i.x().C2();
            this.F = null;
            this.i.x().v3(null);
        }
        this.I = null;
        HashMap<String, Object> hashMap = this.B;
        if (hashMap != null) {
            hashMap.clear();
        }
        WeexInstance weexInstance2 = this.x;
        if (weexInstance2 != null) {
            weexInstance2.destroy();
        }
        eel eelVar2 = this.i;
        if (eelVar2 != null) {
            eelVar2.j();
        }
        OrderRecommendWrapper orderRecommendWrapper = this.q;
        if (orderRecommendWrapper != null) {
            orderRecommendWrapper.f();
            this.q.b();
        }
        J3(false);
        JSONObject jSONObject = new JSONObject();
        FragmentActivity fragmentActivity = this.f9090a;
        if (fragmentActivity != null) {
            jSONObject.put("context", (Object) fragmentActivity.getApplicationContext());
        }
        bbv g2 = qbv.j().g();
        if (v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_MY_TAOBAO, "enablePreRequestRefundOrderList", true) && g2.c("first_data", ae2.BizKeyRefund)) {
            jSONObject.put("enablePreRequestRefund", (Object) Boolean.TRUE);
        }
        jSONObject.put(ccv.PARAM_ASYNC_DATA_SOURCE, (Object) "true");
        qbv.j().a(UltronTradeHybridStage.ON_CONTAINER_DESTROY, "orderList", jSONObject);
        eel eelVar3 = this.i;
        if (eelVar3 != null) {
            eelVar3.k(this.f9090a);
        }
        if (uel.l("releaseOrderConfigs", true)) {
            OrderConfigs orderConfigs = this.j;
            if (orderConfigs != null) {
                orderConfigs.K(null);
                this.j.X(null);
            }
            eel eelVar4 = this.i;
            if (eelVar4 != null) {
                eelVar4.Y0(null);
                this.i.H0(null);
                this.i.X0(null);
            }
        }
        I3(false);
    }

    @Override // com.taobao.tao.tbmainfragment.SupportSecondaryBaseFragment, com.taobao.tao.tbmainfragment.TBMainBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onResume() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        this.A.f().put("on_resume_start", Long.valueOf(System.currentTimeMillis()));
        this.p = false;
        P3();
        if (vvo.k().l(this.f9090a) != null) {
            vvo.k().r(this.j);
        }
        if (this.m) {
            J3(true);
            Map<String, Object> map = this.t;
            if (map != null) {
                D3(map);
                this.t = null;
            } else {
                if (this.s) {
                    str = "FirstScreen";
                } else {
                    str = "NativeRefresh";
                }
                B3(str);
                this.m = false;
            }
        }
        tau.e(ParallelBizValueHelper.c(this.g), this);
        eel eelVar = this.i;
        if (eelVar != null) {
            eelVar.g1(this.f9090a, true);
        }
        lor.c("KEY_OrderListFragment", "onResume", "页面在前台");
        OrderRecommendWrapper orderRecommendWrapper = this.q;
        if (orderRecommendWrapper != null) {
            orderRecommendWrapper.d();
        }
        BehaviR.getInstance().commitEnter(dbv.BIZ_ORDER_LIST, null, this, hqv.c(UTAnalytics.getInstance().getDefaultTracker().getPageAllProperties(this.f9090a)));
        WeexInstance weexInstance = this.x;
        if (weexInstance != null) {
            weexInstance.onActivityResume();
        }
        eel eelVar2 = this.i;
        if (!(eelVar2 == null || eelVar2.T() == null)) {
            this.i.r0(TradeHybridTMSFragment.b.d.INSTANCE);
        }
        if (this.s) {
            this.A.f().put("on_Resume_end_time", Long.valueOf(System.currentTimeMillis()));
            this.A.f().put("ol_async_task_start", Long.valueOf(this.c.getLongExtra("olAsyncTaskStart", -1L)));
            this.A.f().put("ol_async_task_end", Long.valueOf(this.c.getLongExtra("olAsyncTaskEnd", -1L)));
        }
        this.s = false;
        UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(((TBMainBaseFragment) this).mActivity, ParallelBizValueHelper.c(this.g));
        eel eelVar3 = this.i;
        if (eelVar3 != null) {
            eelVar3.u0();
        }
    }

    public final void t3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5290783d", new Object[]{this});
            return;
        }
        this.i.c0(this.c);
        OrderType orderType = OrderType.ORDERLIST;
        if (orderType.getValue().equals(this.i.D())) {
            this.A.l(nrr.o());
            V2("isOLFirstScreen", Boolean.TRUE);
            this.i.n();
        } else {
            this.i.M0(exi.d());
        }
        if (!orderType.getValue().equals(this.i.D()) || this.i.f0()) {
            this.A.e(true, false, "其他页面");
        }
        this.i.a1(new ptg(this));
        ((ptg) this.i.W()).r(this.A);
        this.r = (otg) this.i.W();
    }

    public final void X3(String str, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("560c24c8", new Object[]{this, str, bundle});
            return;
        }
        this.A = new vel("olFragmentBuild", this.f9090a);
        long currentTimeMillis = System.currentTimeMillis();
        z9v u = z9v.u(this.f9090a);
        u.x(this.f9090a, str, ParallelBizValueHelper.a(this.g));
        cav cavVar = new cav(idl.sPid, idl.a(str));
        cavVar.d(scv.b() ? 1.0f : 0.05f);
        Intent intent = this.c;
        if (intent == null) {
            u.n("olFragmentBuild");
            u.g(cavVar);
            return;
        }
        long longExtra = intent.getLongExtra("NAV_TO_URL_START_TIME", 0L);
        long longExtra2 = this.c.getLongExtra(Nav.NAV_TO_URL_START_UPTIME, 0L);
        long longExtra3 = this.c.getLongExtra("NAV_START_ACTIVITY_TIME", 0L);
        String l = jql.l(this.c, CoreConstants.IN_PARAMS_DETAILCLICK);
        this.H = l;
        long parseLong = !TextUtils.isEmpty(l) ? Long.parseLong(this.H) : 0L;
        long j = parseLong <= 0 ? longExtra : parseLong;
        if (j <= 0 || currentTimeMillis - j <= 0) {
            hav.d("OrderPerformanceTrack", "start time invalid");
            this.A.e(true, false, null);
            return;
        }
        u.o("olFragmentBuild", j);
        u.g(cavVar);
        u.q("deathRecover", Boolean.valueOf(bundle != null));
        this.A.f().put(jn0.STAGE_KEY_CLICK_START, Long.valueOf(j));
        this.A.f().put("up_nav_start_time", Long.valueOf(longExtra2));
        this.A.f().put("on_create_time", Long.valueOf(currentTimeMillis));
        u.C("apmClientFullStageProcess", longExtra, null);
        if (longExtra > 0 && longExtra3 > 0) {
            u.C("apmClientLayoutComplete", longExtra, null);
            UltronPerformanceStageModel ultronPerformanceStageModel = new UltronPerformanceStageModel("navStage");
            ultronPerformanceStageModel.setStartMills(longExtra);
            ultronPerformanceStageModel.setEndMills(currentTimeMillis);
            u.h(ultronPerformanceStageModel, null, false);
        }
    }

    @Override // tb.pqb
    public void h2(MtopResponse mtopResponse, DataStatus dataStatus, PageStatus pageStatus) {
        TBSwipeRefreshLayout tBSwipeRefreshLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("329d6593", new Object[]{this, mtopResponse, dataStatus, pageStatus});
            return;
        }
        if (this.i.f0() && (tBSwipeRefreshLayout = this.l) != null) {
            tBSwipeRefreshLayout.enablePullRefresh(false);
        }
        this.i.D0(false);
        C3();
        try {
            OrderRecyclerView orderRecyclerView = (OrderRecyclerView) this.j.u().i(this.k);
            if (!(mtopResponse.getDataJsonObject() == null || mtopResponse.getDataJsonObject().optJSONObject("global") == null)) {
                org.json.JSONObject optJSONObject = mtopResponse.getDataJsonObject().optJSONObject("global");
                g4(optJSONObject);
                org.json.JSONObject optJSONObject2 = optJSONObject.optJSONObject("globalUtArgs");
                if (optJSONObject2 != null) {
                    e4(optJSONObject2);
                }
                String str = "false";
                if (TextUtils.isEmpty(this.i.p())) {
                    if ("true".equals(optJSONObject.optString("isBought4"))) {
                        this.i.S0("true");
                        this.i.M().j().put("forceBoughtlist4", "true");
                        this.i.X().setBackgroundColor(Color.parseColor("#F3F6F8"));
                    } else {
                        this.i.S0(str);
                    }
                }
                org.json.JSONObject optJSONObject3 = mtopResponse.getDataJsonObject().optJSONObject("hierarchy");
                boolean z = optJSONObject3 != null ? !TextUtils.isEmpty(optJSONObject3.optString("root")) : false;
                if (z) {
                    this.n = optJSONObject.optJSONObject("pageControl");
                }
                if (this.n != null) {
                    if (optJSONObject.optJSONObject("recommendData") != null) {
                        this.o = optJSONObject.optJSONObject("recommendData");
                    }
                    this.i.U0(optJSONObject, null);
                    u3(orderRecyclerView, this.n.optString("hasMore"), mtopResponse.getDataJsonObject().optString(TBSearchChiTuJSBridge.ABTEST));
                }
                org.json.JSONObject optJSONObject4 = optJSONObject.optJSONObject("tocDegradeInfo");
                if (optJSONObject4 != null) {
                    this.J = TextUtils.equals("true", optJSONObject4.optString("isCloseTradeItemDetailTimeout"));
                }
                if (orderRecyclerView != null) {
                    orderRecyclerView.resetScroll();
                }
                if (optJSONObject.optJSONObject("routeControl") != null) {
                    String optString = optJSONObject.optJSONObject("routeControl").optString("taoTmRoute");
                    if (!TextUtils.isEmpty(optString)) {
                        JSONObject parseObject = JSON.parseObject(this.i.M().j().get("condition"));
                        parseObject.put("taoTmRoute", (Object) optString);
                        this.i.M().j().put("condition", parseObject.toJSONString());
                    }
                }
                if (TextUtils.isEmpty(this.i.p())) {
                    if ("true".equals(optJSONObject.optString("isBought4"))) {
                        str = "true";
                    }
                    this.i.S0(str);
                }
                if (PageStatus.FIRST_PAGE.equals(pageStatus) && OrderType.ORDERLIST.getValue().equals(this.i.D())) {
                    org.json.JSONObject jSONObject = this.o;
                    nrr.e(this.f9090a, this.i.t(), mtopResponse.getDataJsonObject(), jSONObject != null ? jSONObject.optString("orderIdsStr") : null, z);
                    if (this.V) {
                        this.V = false;
                    } else if (getView() != null) {
                        r63.b(getView(), this.i.t(), Build.VERSION.SDK_INT >= 26);
                    }
                    this.i.q0(orderRecyclerView);
                    eel eelVar = this.i;
                    eelVar.m(eelVar.t(), optJSONObject);
                }
                if (uel.l("enableIdleLoadSuccessTask", false)) {
                    pav.g(new a(mtopResponse, orderRecyclerView, pageStatus));
                } else {
                    j3(mtopResponse, orderRecyclerView, pageStatus);
                }
                this.i.I0(null);
                this.i.J0(null);
                this.i.Z0(false);
                this.i.w0(pageStatus, optJSONObject);
                String optString2 = optJSONObject2.optString(CoreConstants.IN_PARAM_ORDER_SEARCH_ID_NEW);
                if (!TextUtils.isEmpty(optString2)) {
                    this.i.i1(optString2);
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            m8v.a(e2);
        }
    }
}
