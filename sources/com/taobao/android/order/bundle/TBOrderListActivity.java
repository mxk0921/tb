package com.taobao.android.order.bundle;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.MessageQueue;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.DialogFragment;
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
import com.taobao.android.behavir.BehaviR;
import com.taobao.android.nav.Nav;
import com.taobao.android.order.bundle.base.TBOrderBaseActivity;
import com.taobao.android.order.bundle.base.parallelbiz.ParallelBizValueHelper;
import com.taobao.android.order.bundle.constants.CoreConstants;
import com.taobao.android.order.bundle.constants.OrderType;
import com.taobao.android.order.bundle.constants.TabType;
import com.taobao.android.order.bundle.helper.TBWebOrder;
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
import com.taobao.android.weex.WeexInstance;
import com.taobao.browser.jsbridge.WebAppInterface;
import com.taobao.orange.OrangeConfig;
import com.taobao.ptr.views.recycler.accessories.FixedViewAdapter;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.TBPublicMenu;
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
import tb.acq;
import tb.ae2;
import tb.afl;
import tb.bbv;
import tb.bel;
import tb.bfl;
import tb.brb;
import tb.c2u;
import tb.c2v;
import tb.ccv;
import tb.ct0;
import tb.d9x;
import tb.dbl;
import tb.dbv;
import tb.dpj;
import tb.edl;
import tb.eel;
import tb.exi;
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
import tb.i4d;
import tb.idl;
import tb.jjx;
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
import tb.otg;
import tb.pav;
import tb.pb6;
import tb.ptg;
import tb.q6x;
import tb.qbv;
import tb.rgv;
import tb.rvl;
import tb.t2o;
import tb.tau;
import tb.u3o;
import tb.uel;
import tb.uvl;
import tb.v9v;
import tb.vav;
import tb.vel;
import tb.vvo;
import tb.vxm;
import tb.wbl;
import tb.we6;
import tb.wqb;
import tb.yh;
import tb.ykl;
import tb.yxr;
import tb.z9u;
import tb.z9v;
import tb.zw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TBOrderListActivity extends TBOrderBaseActivity implements h4d, ptg.c, a6r, i4d, l2e, h6e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final HashMap<String, JSONObject> R = new HashMap<>(4);
    public bfl C;
    public k D;
    public k E;
    public String F;
    public mrr G;
    public String J;
    public RecyclerView.OnScrollListener O;
    public eel l;
    public OrderConfigs m;
    public View n;
    public TBSwipeRefreshLayout o;
    public ViewGroup q;
    public otg v;
    public boolean w;
    public Map<String, Object> x;
    public RecyclerView y;
    public WeexInstance z;
    public boolean p = true;
    public org.json.JSONObject r = null;
    public org.json.JSONObject s = null;
    public boolean t = true;
    public OrderRecommendWrapper u = null;
    public HashMap<String, Object> A = null;
    public final UltronWeex2DataPrefetchCache B = new UltronWeex2DataPrefetchCache();
    public boolean H = false;
    public boolean I = false;
    public final AtomicBoolean K = new AtomicBoolean(false);
    public final AtomicBoolean L = new AtomicBoolean(false);
    public final BroadcastReceiver M = new BroadcastReceiver() { // from class: com.taobao.android.order.bundle.TBOrderListActivity.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/TBOrderListActivity$1");
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0070 A[Catch: Exception -> 0x007d, TryCatch #0 {Exception -> 0x007d, blocks: (B:9:0x0044, B:12:0x0053, B:17:0x0068, B:19:0x0070, B:23:0x0081, B:25:0x0097), top: B:30:0x0044 }] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
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
                com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.android.order.bundle.TBOrderListActivity.AnonymousClass1.$ipChange
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
                java.lang.String r3 = "TBOrderListActivity"
                java.lang.String r4 = "BroadcastReceiver"
                tb.lor.c(r3, r4, r2)
                java.lang.String r2 = "orderListNeedRefreshAction"
                boolean r6 = r2.equals(r6)
                if (r6 == 0) goto L_0x0044
                com.taobao.android.order.bundle.TBOrderListActivity r6 = com.taobao.android.order.bundle.TBOrderListActivity.this
                com.taobao.android.order.bundle.TBOrderListActivity.H3(r6)
                goto L_0x00a0
            L_0x0044:
                com.taobao.android.order.bundle.TBOrderListActivity r6 = com.taobao.android.order.bundle.TBOrderListActivity.this     // Catch: Exception -> 0x007d
                com.taobao.android.order.bundle.TBOrderListActivity.I3(r6)     // Catch: Exception -> 0x007d
                java.lang.String r6 = "orderListNeedRefresh"
                boolean r6 = r7.getBooleanExtra(r6, r1)     // Catch: Exception -> 0x007d
                if (r6 != 0) goto L_0x0053
                return
            L_0x0053:
                com.taobao.android.order.bundle.TBOrderListActivity r6 = com.taobao.android.order.bundle.TBOrderListActivity.this     // Catch: Exception -> 0x007d
                com.taobao.android.order.bundle.TBOrderListActivity.U3(r6, r0)     // Catch: Exception -> 0x007d
                java.lang.String r6 = "orderQueryParamCondition"
                java.io.Serializable r6 = r7.getSerializableExtra(r6)     // Catch: Exception -> 0x007d
                boolean r0 = r6 instanceof java.util.HashMap     // Catch: Exception -> 0x007d
                r2 = 0
                if (r0 == 0) goto L_0x0067
                java.util.HashMap r6 = (java.util.HashMap) r6     // Catch: Exception -> 0x0067
                goto L_0x0068
            L_0x0067:
                r6 = r2
            L_0x0068:
                java.lang.String r0 = "immediatelyRefresh"
                boolean r7 = r7.getBooleanExtra(r0, r1)     // Catch: Exception -> 0x007d
                if (r7 == 0) goto L_0x007f
                com.taobao.android.order.bundle.TBOrderListActivity r7 = com.taobao.android.order.bundle.TBOrderListActivity.this     // Catch: Exception -> 0x007d
                java.lang.String r0 = "EventRefresh"
                com.taobao.android.order.bundle.TBOrderListActivity.V3(r7, r0, r6)     // Catch: Exception -> 0x007d
                com.taobao.android.order.bundle.TBOrderListActivity r6 = com.taobao.android.order.bundle.TBOrderListActivity.this     // Catch: Exception -> 0x007d
                com.taobao.android.order.bundle.TBOrderListActivity.W3(r6, r2)     // Catch: Exception -> 0x007d
                goto L_0x00a0
            L_0x007d:
                r6 = move-exception
                goto L_0x009d
            L_0x007f:
                if (r6 == 0) goto L_0x00a0
                com.taobao.android.order.bundle.TBOrderListActivity r7 = com.taobao.android.order.bundle.TBOrderListActivity.this     // Catch: Exception -> 0x007d
                tb.eel r7 = com.taobao.android.order.bundle.TBOrderListActivity.X3(r7)     // Catch: Exception -> 0x007d
                java.lang.String r7 = r7.t()     // Catch: Exception -> 0x007d
                com.taobao.android.order.bundle.constants.TabType r0 = com.taobao.android.order.bundle.constants.TabType.ALL     // Catch: Exception -> 0x007d
                java.lang.String r0 = r0.getValue()     // Catch: Exception -> 0x007d
                boolean r7 = r7.equals(r0)     // Catch: Exception -> 0x007d
                if (r7 == 0) goto L_0x00a0
                com.taobao.android.order.bundle.TBOrderListActivity r7 = com.taobao.android.order.bundle.TBOrderListActivity.this     // Catch: Exception -> 0x007d
                com.taobao.android.order.bundle.TBOrderListActivity.W3(r7, r6)     // Catch: Exception -> 0x007d
                goto L_0x00a0
            L_0x009d:
                r6.printStackTrace()
            L_0x00a0:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.order.bundle.TBOrderListActivity.AnonymousClass1.onReceive(android.content.Context, android.content.Intent):void");
        }
    };
    public final BroadcastReceiver N = new BroadcastReceiver(this) { // from class: com.taobao.android.order.bundle.TBOrderListActivity.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/TBOrderListActivity$2");
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
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    };
    public boolean P = false;
    public final BroadcastReceiver Q = new BroadcastReceiver() { // from class: com.taobao.android.order.bundle.TBOrderListActivity.11
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass11 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/TBOrderListActivity$11");
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
                TBOrderListActivity.I3(TBOrderListActivity.this);
                gb0.b(context.getApplicationContext(), false);
                gb0.d(context.getApplicationContext(), false);
                idl.c(idl.a.a(OrderBizCode.orderList, "payResultOfList").sampling(0.1f).message("支付成功").success(true));
            }
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            eel X3 = TBOrderListActivity.X3(TBOrderListActivity.this);
            TBOrderListActivity tBOrderListActivity = TBOrderListActivity.this;
            X3.d1(tBOrderListActivity, TBOrderListActivity.O3(tBOrderListActivity));
            TBOrderListActivity.this.q3().p();
            TBOrderListActivity.this.q3().g(TBOrderListActivity.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                TBOrderListActivity.P3(TBOrderListActivity.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                bel.b();
            } catch (Exception e) {
                hav.d("OrderList", "processRecPreRequest: " + e.toString());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static /* synthetic */ class d {
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
    public class e implements AsyncInstanceLoadManager.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // com.taobao.android.order.bundle.weex2.AsyncInstanceLoadManager.a
        public void c(WeexInstance weexInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eadb2214", new Object[]{this, weexInstance});
                return;
            }
            TBRefundInstanceManager.reportRumInRefundList(true, TBOrderListActivity.X3(TBOrderListActivity.this).J());
            TBRefundInstanceManager tBRefundInstanceManager = TBRefundInstanceManager.INSTANCE;
            TBOrderListActivity tBOrderListActivity = TBOrderListActivity.this;
            tBRefundInstanceManager.addInstanceView(tBOrderListActivity, TBOrderListActivity.X3(tBOrderListActivity).J(), weexInstance);
        }

        @Override // com.taobao.android.order.bundle.weex2.AsyncInstanceLoadManager.a
        public void b(WeexInstance weexInstance) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d4cf7169", new Object[]{this, weexInstance});
            } else if (weexInstance != null) {
                TBRefundInstanceManager tBRefundInstanceManager = TBRefundInstanceManager.INSTANCE;
                String Y3 = TBOrderListActivity.Y3(TBOrderListActivity.this);
                if (TBOrderListActivity.X3(TBOrderListActivity.this).j0()) {
                    str = "other";
                } else {
                    str = TBOrderListActivity.X3(TBOrderListActivity.this).y();
                }
                tBRefundInstanceManager.prepareReloadInstance(new TBRefundInstanceManager.b(Y3, str, false), weexInstance);
                TBOrderListActivity.a4(TBOrderListActivity.this, weexInstance);
            }
        }

        @Override // com.taobao.android.order.bundle.weex2.AsyncInstanceLoadManager.a
        public void a() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("216a9675", new Object[]{this});
                return;
            }
            TBRefundInstanceManager.reportRumInRefundList(true, TBOrderListActivity.X3(TBOrderListActivity.this).J());
            TBOrderListActivity tBOrderListActivity = TBOrderListActivity.this;
            ViewGroup J = TBOrderListActivity.X3(tBOrderListActivity).J();
            String L = TBOrderListActivity.X3(TBOrderListActivity.this).L();
            String b4 = TBOrderListActivity.b4(TBOrderListActivity.this);
            if (TBOrderListActivity.X3(TBOrderListActivity.this).j0()) {
                str = "other";
            } else {
                str = TBOrderListActivity.X3(TBOrderListActivity.this).y();
            }
            TBOrderListActivity.a4(tBOrderListActivity, TBRefundInstanceManager.refundWeex2PreRender(tBOrderListActivity, J, L, new TBRefundInstanceManager.b(b4, str, false)));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ParallelBizValueHelper.PageType p3 = TBOrderListActivity.this.p3();
            com.taobao.android.order.bundle.base.parallelbiz.a.b(p3, "_Button-" + TBOrderListActivity.X3(TBOrderListActivity.this).t(), null);
            lor.c("TBOrderListActivity", "onActivityCreate", "页面创建");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                yxr.b(3);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class h implements UltronListProxy.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        @Override // com.taobao.android.order.core.container.UltronListProxy.e
        public void onPageSelected(int i, String str) {
            q6x q6xVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("db26523d", new Object[]{this, new Integer(i), str});
            } else if (TabType.REFUND.getValue().equals(str) && TBOrderListActivity.Z3(TBOrderListActivity.this) != null && TBRefundInstanceManager.getUseSurfaceView() && (q6xVar = (q6x) TBOrderListActivity.Z3(TBOrderListActivity.this).getExtend(q6x.class)) != null) {
                q6xVar.a();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class i implements MessageQueue.IdleHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MtopResponse f9085a;
        public final /* synthetic */ OrderRecyclerView b;
        public final /* synthetic */ PageStatus c;

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
                i iVar = i.this;
                TBOrderListActivity.N3(TBOrderListActivity.this, iVar.f9085a, iVar.b, iVar.c);
            }
        }

        public i(MtopResponse mtopResponse, OrderRecyclerView orderRecyclerView, PageStatus pageStatus) {
            this.f9085a = mtopResponse;
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
                TBOrderListActivity.N3(TBOrderListActivity.this, this.f9085a, this.b, this.c);
            } else {
                pav.i(new a(), 0L);
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class j implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f9087a;
        public final /* synthetic */ org.json.JSONObject b;

        public j(JSONObject jSONObject, org.json.JSONObject jSONObject2) {
            this.f9087a = jSONObject;
            this.b = jSONObject2;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            String str2;
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            JSONObject jSONObject = this.f9087a;
            if (jSONObject == null) {
                str = this.b.optString("orderCount");
            } else {
                JSONObject jSONObject2 = jSONObject.getJSONObject("global");
                if (jSONObject2 != null) {
                    str = jSONObject2.getString("orderCount");
                } else {
                    return;
                }
            }
            if (!TextUtils.isEmpty(str)) {
                try {
                    i = Integer.parseInt(str);
                } catch (Exception e) {
                    m8v.a(e);
                }
                if (i >= 4) {
                    str2 = "itemCountMoreThan4";
                } else {
                    str2 = "itemCountNoMoreThan4";
                }
                vxm.b.a(TBOrderListActivity.this).a("bizStage", str2);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class k implements kbv {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f9088a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public boolean g = false;
        public final ParallelBizValueHelper.PageType h;

        static {
            t2o.a(713031711);
            t2o.a(157286954);
        }

        public k(ParallelBizValueHelper.PageType pageType) {
            this.h = pageType;
        }

        @Override // tb.kbv
        public void a(DialogFragment dialogFragment, com.taobao.android.weex_framework.a aVar) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("18426694", new Object[]{this, dialogFragment, aVar});
                return;
            }
            try {
                TBOrderListActivity.T3(TBOrderListActivity.this, null);
                if (this.g) {
                    fsw.p("WebAppInterface");
                    this.g = false;
                }
                c2v.d orNewUTPageStateObject = c2v.getInstance().getOrNewUTPageStateObject(TBOrderListActivity.this);
                if (orNewUTPageStateObject != null) {
                    String str6 = "";
                    if (!TextUtils.isEmpty(this.f9088a)) {
                        str = this.f9088a;
                    } else {
                        str = str6;
                    }
                    orNewUTPageStateObject.mSpmCnt = str;
                    if (!TextUtils.isEmpty(this.b)) {
                        str2 = this.b;
                    } else {
                        str2 = str6;
                    }
                    orNewUTPageStateObject.mSpmUrl = str2;
                    if (!TextUtils.isEmpty(this.c)) {
                        str3 = this.c;
                    } else {
                        str3 = str6;
                    }
                    orNewUTPageStateObject.mSpmPre = str3;
                    if (!TextUtils.isEmpty(this.d)) {
                        str4 = this.d;
                    } else {
                        str4 = str6;
                    }
                    orNewUTPageStateObject.mUtparamCnt = str4;
                    if (!TextUtils.isEmpty(this.e)) {
                        str5 = this.e;
                    } else {
                        str5 = str6;
                    }
                    orNewUTPageStateObject.mUtparamUrl = str5;
                    if (!TextUtils.isEmpty(this.f)) {
                        str6 = this.f;
                    }
                    orNewUTPageStateObject.mUtparamPre = str6;
                    if (TBOrderListActivity.X3(TBOrderListActivity.this) != null) {
                        TBOrderListActivity.X3(TBOrderListActivity.this).g1(TBOrderListActivity.this, false);
                        TBOrderListActivity.X3(TBOrderListActivity.this).f1(TBOrderListActivity.S3(TBOrderListActivity.this), false);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        @Override // tb.kbv
        public void b(DialogFragment dialogFragment, com.taobao.android.weex_framework.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7738412f", new Object[]{this, dialogFragment, aVar});
            } else if (!TextUtils.isEmpty(TBOrderListActivity.this.J)) {
                c2v.getInstance().setLastCacheKeyScmUrl(TBOrderListActivity.this.J);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0067 A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:6:0x0018, B:9:0x0025, B:14:0x0037, B:17:0x0040, B:18:0x0046, B:20:0x0050, B:23:0x0057, B:25:0x005b, B:28:0x0067, B:29:0x0069, B:32:0x0075, B:33:0x0077, B:36:0x0082, B:37:0x0084), top: B:40:0x0018 }] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0075 A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:6:0x0018, B:9:0x0025, B:14:0x0037, B:17:0x0040, B:18:0x0046, B:20:0x0050, B:23:0x0057, B:25:0x005b, B:28:0x0067, B:29:0x0069, B:32:0x0075, B:33:0x0077, B:36:0x0082, B:37:0x0084), top: B:40:0x0018 }] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0082 A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:6:0x0018, B:9:0x0025, B:14:0x0037, B:17:0x0040, B:18:0x0046, B:20:0x0050, B:23:0x0057, B:25:0x005b, B:28:0x0067, B:29:0x0069, B:32:0x0075, B:33:0x0077, B:36:0x0082, B:37:0x0084), top: B:40:0x0018 }] */
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
                com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.android.order.bundle.TBOrderListActivity.k.$ipChange
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
                tb.c2v r7 = tb.c2v.getInstance()     // Catch: Exception -> 0x003e
                com.taobao.android.order.bundle.TBOrderListActivity r8 = com.taobao.android.order.bundle.TBOrderListActivity.this     // Catch: Exception -> 0x003e
                tb.c2v$d r7 = r7.getOrNewUTPageStateObject(r8)     // Catch: Exception -> 0x003e
                if (r7 != 0) goto L_0x0025
                return
            L_0x0025:
                int[] r8 = com.taobao.android.order.bundle.TBOrderListActivity.d.$SwitchMap$com$taobao$android$order$bundle$base$parallelbiz$ParallelBizValueHelper$PageType     // Catch: Exception -> 0x003e
                com.taobao.android.order.bundle.base.parallelbiz.ParallelBizValueHelper$PageType r2 = r6.h     // Catch: Exception -> 0x003e
                int r2 = r2.ordinal()     // Catch: Exception -> 0x003e
                r8 = r8[r2]     // Catch: Exception -> 0x003e
                java.lang.String r2 = ""
                if (r8 == r1) goto L_0x0040
                if (r8 == r0) goto L_0x0037
                r8 = r2
                goto L_0x0046
            L_0x0037:
                com.taobao.android.order.bundle.base.parallelbiz.ParallelBizValueHelper$PageType r8 = com.taobao.android.order.bundle.base.parallelbiz.ParallelBizValueHelper.PageType.logistics_detail     // Catch: Exception -> 0x003e
                java.lang.String r8 = com.taobao.android.order.bundle.base.parallelbiz.ParallelBizValueHelper.d(r8)     // Catch: Exception -> 0x003e
                goto L_0x0046
            L_0x003e:
                r7 = move-exception
                goto L_0x0087
            L_0x0040:
                com.taobao.android.order.bundle.base.parallelbiz.ParallelBizValueHelper$PageType r8 = com.taobao.android.order.bundle.base.parallelbiz.ParallelBizValueHelper.PageType.order_detail     // Catch: Exception -> 0x003e
                java.lang.String r8 = com.taobao.android.order.bundle.base.parallelbiz.ParallelBizValueHelper.d(r8)     // Catch: Exception -> 0x003e
            L_0x0046:
                r7.mSpmCnt = r8     // Catch: Exception -> 0x003e
                java.lang.String r8 = r6.f9088a     // Catch: Exception -> 0x003e
                boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch: Exception -> 0x003e
                if (r8 != 0) goto L_0x005a
                com.taobao.android.order.bundle.base.parallelbiz.ParallelBizValueHelper$PageType r8 = r6.h     // Catch: Exception -> 0x003e
                com.taobao.android.order.bundle.base.parallelbiz.ParallelBizValueHelper$PageType r0 = com.taobao.android.order.bundle.base.parallelbiz.ParallelBizValueHelper.PageType.logistics_detail     // Catch: Exception -> 0x003e
                if (r8 != r0) goto L_0x0057
                goto L_0x005a
            L_0x0057:
                java.lang.String r8 = r6.f9088a     // Catch: Exception -> 0x003e
                goto L_0x005b
            L_0x005a:
                r8 = r2
            L_0x005b:
                r7.mSpmUrl = r8     // Catch: Exception -> 0x003e
                java.lang.String r8 = r6.b     // Catch: Exception -> 0x003e
                boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch: Exception -> 0x003e
                if (r8 == 0) goto L_0x0067
                r8 = r2
                goto L_0x0069
            L_0x0067:
                java.lang.String r8 = r6.b     // Catch: Exception -> 0x003e
            L_0x0069:
                r7.mSpmPre = r8     // Catch: Exception -> 0x003e
                java.lang.String r8 = r6.e     // Catch: Exception -> 0x003e
                boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch: Exception -> 0x003e
                if (r8 == 0) goto L_0x0075
                r8 = r2
                goto L_0x0077
            L_0x0075:
                java.lang.String r8 = r6.e     // Catch: Exception -> 0x003e
            L_0x0077:
                r7.mUtparamPre = r8     // Catch: Exception -> 0x003e
                java.lang.String r8 = r6.d     // Catch: Exception -> 0x003e
                boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch: Exception -> 0x003e
                if (r8 == 0) goto L_0x0082
                goto L_0x0084
            L_0x0082:
                java.lang.String r2 = r6.d     // Catch: Exception -> 0x003e
            L_0x0084:
                r7.mUtparamUrl = r2     // Catch: Exception -> 0x003e
                goto L_0x008d
            L_0x0087:
                r7.printStackTrace()
                tb.m8v.a(r7)
            L_0x008d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.order.bundle.TBOrderListActivity.k.c(androidx.fragment.app.DialogFragment, com.taobao.android.weex_framework.a):void");
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
                    this.g = true;
                } else {
                    hav.d("TBOrderListActivity", "WebAppInterface is registered!");
                }
                if (aVar != null) {
                    if (TBOrderListActivity.Q3(TBOrderListActivity.this) == null) {
                        TBOrderListActivity.R3(TBOrderListActivity.this, new mrr());
                        TBOrderListActivity.Q3(TBOrderListActivity.this).o(TBOrderListActivity.this.getPublicMenu());
                    }
                    if (aVar.getTag("ali_ms_navigation") == null) {
                        aVar.setTag("ali_ms_navigation", TBOrderListActivity.Q3(TBOrderListActivity.this));
                    }
                }
                Map<String, String> pageAllProperties = UTAnalytics.getInstance().getDefaultTracker().getPageAllProperties(TBOrderListActivity.this);
                if (pageAllProperties != null && !pageAllProperties.isEmpty()) {
                    String str = "";
                    this.f9088a = TextUtils.isEmpty(pageAllProperties.get("spm-cnt")) ? str : pageAllProperties.get("spm-cnt");
                    this.b = TextUtils.isEmpty(pageAllProperties.get("spm-url")) ? str : pageAllProperties.get("spm-url");
                    this.c = TextUtils.isEmpty(pageAllProperties.get("spm-pre")) ? str : pageAllProperties.get("spm-pre");
                    this.d = TextUtils.isEmpty(pageAllProperties.get("utparam-cnt")) ? str : pageAllProperties.get("utparam-cnt");
                    this.e = TextUtils.isEmpty(pageAllProperties.get(z9u.KEY_UTPARAM_URL)) ? str : pageAllProperties.get(z9u.KEY_UTPARAM_URL);
                    if (!TextUtils.isEmpty(pageAllProperties.get("utparam-pre"))) {
                        str = pageAllProperties.get("utparam-pre");
                    }
                    this.f = str;
                    if (TBOrderListActivity.X3(TBOrderListActivity.this) != null) {
                        TBOrderListActivity.X3(TBOrderListActivity.this).f1(TBOrderListActivity.S3(TBOrderListActivity.this), true);
                    }
                }
            } catch (Exception e) {
                m8v.a(e);
                e.printStackTrace();
            }
        }
    }

    static {
        t2o.a(713031695);
        t2o.a(297795642);
        t2o.a(713031979);
        t2o.a(775946324);
        t2o.a(614465730);
        t2o.a(157286894);
        t2o.a(157286907);
    }

    public static /* synthetic */ void H3(TBOrderListActivity tBOrderListActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5016116", new Object[]{tBOrderListActivity});
        } else {
            tBOrderListActivity.V4();
        }
    }

    public static /* synthetic */ void I3(TBOrderListActivity tBOrderListActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb052c75", new Object[]{tBOrderListActivity});
        } else {
            tBOrderListActivity.h4();
        }
    }

    public static /* synthetic */ otg J3(TBOrderListActivity tBOrderListActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (otg) ipChange.ipc$dispatch("c9ea588c", new Object[]{tBOrderListActivity});
        }
        return tBOrderListActivity.v;
    }

    public static /* synthetic */ boolean K3(TBOrderListActivity tBOrderListActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b69eaa", new Object[]{tBOrderListActivity})).booleanValue();
        }
        return tBOrderListActivity.P;
    }

    public static /* synthetic */ boolean L3(TBOrderListActivity tBOrderListActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2898274", new Object[]{tBOrderListActivity, new Boolean(z)})).booleanValue();
        }
        tBOrderListActivity.P = z;
        return z;
    }

    public static /* synthetic */ org.json.JSONObject M3(TBOrderListActivity tBOrderListActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (org.json.JSONObject) ipChange.ipc$dispatch("2b4ea673", new Object[]{tBOrderListActivity});
        }
        return tBOrderListActivity.r;
    }

    public static /* synthetic */ void N3(TBOrderListActivity tBOrderListActivity, MtopResponse mtopResponse, RecyclerView recyclerView, PageStatus pageStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8064d40", new Object[]{tBOrderListActivity, mtopResponse, recyclerView, pageStatus});
        } else {
            tBOrderListActivity.i4(mtopResponse, recyclerView, pageStatus);
        }
    }

    public static /* synthetic */ ViewGroup O3(TBOrderListActivity tBOrderListActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("25a2edf2", new Object[]{tBOrderListActivity});
        }
        return tBOrderListActivity.q;
    }

    public static /* synthetic */ void P3(TBOrderListActivity tBOrderListActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aab2e341", new Object[]{tBOrderListActivity});
        } else {
            super.finish();
        }
    }

    public static /* synthetic */ mrr Q3(TBOrderListActivity tBOrderListActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mrr) ipChange.ipc$dispatch("ab522ecb", new Object[]{tBOrderListActivity});
        }
        return tBOrderListActivity.G;
    }

    public static /* synthetic */ mrr R3(TBOrderListActivity tBOrderListActivity, mrr mrrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mrr) ipChange.ipc$dispatch("e4e32ec5", new Object[]{tBOrderListActivity, mrrVar});
        }
        tBOrderListActivity.G = mrrVar;
        return mrrVar;
    }

    public static /* synthetic */ RecyclerView S3(TBOrderListActivity tBOrderListActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("7c1ead07", new Object[]{tBOrderListActivity});
        }
        return tBOrderListActivity.y;
    }

    public static /* synthetic */ String T3(TBOrderListActivity tBOrderListActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bafe0279", new Object[]{tBOrderListActivity, str});
        }
        tBOrderListActivity.F = str;
        return str;
    }

    public static /* synthetic */ boolean U3(TBOrderListActivity tBOrderListActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("71824f06", new Object[]{tBOrderListActivity, new Boolean(z)})).booleanValue();
        }
        tBOrderListActivity.p = z;
        return z;
    }

    public static /* synthetic */ void V3(TBOrderListActivity tBOrderListActivity, String str, HashMap hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1824056", new Object[]{tBOrderListActivity, str, hashMap});
        } else {
            tBOrderListActivity.y4(str, hashMap);
        }
    }

    public static /* synthetic */ Map W3(TBOrderListActivity tBOrderListActivity, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b2d1162a", new Object[]{tBOrderListActivity, map});
        }
        tBOrderListActivity.x = map;
        return map;
    }

    public static /* synthetic */ eel X3(TBOrderListActivity tBOrderListActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eel) ipChange.ipc$dispatch("1066f5c5", new Object[]{tBOrderListActivity});
        }
        return tBOrderListActivity.l;
    }

    public static /* synthetic */ String Y3(TBOrderListActivity tBOrderListActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36671950", new Object[]{tBOrderListActivity});
        }
        return tBOrderListActivity.d;
    }

    public static /* synthetic */ WeexInstance Z3(TBOrderListActivity tBOrderListActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexInstance) ipChange.ipc$dispatch("28dc825", new Object[]{tBOrderListActivity});
        }
        return tBOrderListActivity.z;
    }

    public static /* synthetic */ WeexInstance a4(TBOrderListActivity tBOrderListActivity, WeexInstance weexInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexInstance) ipChange.ipc$dispatch("d7ee9e09", new Object[]{tBOrderListActivity, weexInstance});
        }
        tBOrderListActivity.z = weexInstance;
        return weexInstance;
    }

    public static /* synthetic */ String b4(TBOrderListActivity tBOrderListActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("38041652", new Object[]{tBOrderListActivity});
        }
        return tBOrderListActivity.d;
    }

    public static /* synthetic */ View c4(TBOrderListActivity tBOrderListActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("abf9fe6f", new Object[]{tBOrderListActivity});
        }
        return tBOrderListActivity.n;
    }

    public static /* synthetic */ Object ipc$super(TBOrderListActivity tBOrderListActivity, String str, Object... objArr) {
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
            case -1104351997:
                super.s3((Bundle) objArr[0]);
                return null;
            case -884160602:
                return new Boolean(super.onKeyDown(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
            case 188604040:
                super.onStop();
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1150324634:
                super.finish();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 1281559479:
                super.onRestart();
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/TBOrderListActivity");
        }
    }

    @Override // com.taobao.android.order.bundle.base.TBOrderBaseActivity
    public BroadcastReceiver A3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BroadcastReceiver) ipChange.ipc$dispatch("e449fead", new Object[]{this});
        }
        return this.Q;
    }

    public final void A4(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dbd1c41", new Object[]{this, str});
        } else {
            y4(str, null);
        }
    }

    @Override // tb.h6e
    public rgv D0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rgv) ipChange.ipc$dispatch("9c85efa3", new Object[]{this, str});
        }
        eel eelVar = this.l;
        if (eelVar == null) {
            return null;
        }
        return eelVar.Q(str);
    }

    public final boolean D4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2f1d19", new Object[]{this})).booleanValue();
        }
        if (!Localization.o()) {
            return true;
        }
        try {
            if (B3().b().getComponentByName("feedStream") != null) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public final void F4(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db5487b6", new Object[]{this, new Boolean(z)});
        } else if (this.N != null) {
            if (z) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addCategory("android.intent.category.DEFAULT");
                intentFilter.addAction(rvl.ALIPAY_ACTION);
                LocalBroadcastManager.getInstance(this).registerReceiver(this.N, intentFilter);
                return;
            }
            LocalBroadcastManager.getInstance(this).unregisterReceiver(this.N);
        }
    }

    public final void G4(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c574c260", new Object[]{this, new Boolean(z)});
        } else if (OrderType.ORDERLIST.getValue().equals(this.l.D())) {
            if (z) {
                pav.k(new c());
            } else {
                bel.a();
            }
        }
    }

    @Override // tb.i4d
    public void H2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c322178", new Object[]{this, str});
        } else {
            this.J = str;
        }
    }

    public final void K4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("488e0257", new Object[]{this});
            return;
        }
        RecyclerView.OnScrollListener onScrollListener = this.O;
        if (onScrollListener != null) {
            RecyclerView recyclerView = this.y;
            if (recyclerView != null) {
                recyclerView.removeOnScrollListener(onScrollListener);
            }
            RecyclerView i2 = this.l.W().i(this.n);
            this.y = i2;
            if (i2 != null) {
                i2.removeOnScrollListener(this.O);
                this.y.addOnScrollListener(this.O);
            }
        }
    }

    @Override // tb.ptg.c
    public Context L2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e86b45e3", new Object[]{this});
        }
        return this;
    }

    public void L4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2925f12", new Object[]{this});
        } else {
            this.L.set(true);
        }
    }

    @Override // tb.h6e
    public rgv M0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rgv) ipChange.ipc$dispatch("e33438b6", new Object[]{this});
        }
        eel eelVar = this.l;
        if (eelVar != null) {
            return eelVar.s();
        }
        hav.g("TBOrderListActivity", "getUnexpectedReachMonitor:", "viewModel is null");
        return new rgv();
    }

    @Override // tb.ptg.c
    public void N(TBSwipeRefreshLayout tBSwipeRefreshLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89de43d", new Object[]{this, tBSwipeRefreshLayout});
        } else {
            this.o = tBSwipeRefreshLayout;
        }
    }

    public void N4(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8173b645", new Object[]{this, jSONObject});
        }
    }

    @Override // tb.l2e
    public boolean P2(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("279bed7a", new Object[]{this, str, jSONObject})).booleanValue();
        }
        eel eelVar = this.l;
        if (eelVar != null) {
            return eelVar.l(this, str, jSONObject);
        }
        return false;
    }

    public final void P4(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22323282", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            try {
                UTTracker defaultTracker = UTAnalytics.getInstance().getDefaultTracker();
                Map<String, String> pageProperties = defaultTracker.getPageProperties(this);
                if (pageProperties == null) {
                    pageProperties = new HashMap<>();
                }
                pageProperties.put("spm-cnt", str);
                defaultTracker.updatePageProperties(this, pageProperties);
            } catch (Exception e2) {
                m8v.a(e2);
                hav.b(OrderBizCode.orderList, "updatePageSpmCntException", e2.getMessage());
            }
        }
    }

    public final void Q4(org.json.JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a342eba4", new Object[]{this, jSONObject});
        } else if (OrderType.ORDERSEARCH.getValue().equals(this.l.D())) {
            HashMap hashMap = new HashMap();
            hashMap.put("searchKey", this.l.O());
            String optString = jSONObject.optString(CoreConstants.IN_PARAM_ORDER_SEARCH_ID);
            String optString2 = jSONObject.optString(CoreConstants.IN_PARAM_ORDER_SEARCH_ID_NEW);
            if (!TextUtils.isEmpty(optString)) {
                this.m.T(optString);
                eel eelVar = this.l;
                if (eelVar != null && !TextUtils.isEmpty(eelVar.h1())) {
                    hashMap.put(jql.QUERY_SOURCE, this.l.h1());
                }
                if (!TextUtils.isEmpty(optString2)) {
                    hashMap.put(CoreConstants.IN_PARAM_ORDER_SEARCH_ID_NEW, optString2);
                }
                hashMap.put(CoreConstants.IN_PARAM_ORDER_SEARCH_ID, optString);
                hashMap.put("isSearchResult", "true");
                if (TextUtils.equals(this.l.I(), this.l.O())) {
                    str = "1";
                } else {
                    str = "0";
                }
                hashMap.put("recommend", str);
                String l = jql.l(getIntent(), "utLogMap");
                String l2 = jql.l(getIntent(), "utArgs");
                String l3 = jql.l(getIntent(), "utParam");
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
                UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(this, hashMap);
            }
        }
    }

    @Override // tb.ptg.c
    public void R0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50e4a91e", new Object[]{this});
            return;
        }
        OrderRecommendWrapper orderRecommendWrapper = this.u;
        if (orderRecommendWrapper != null) {
            orderRecommendWrapper.f();
        }
    }

    public final void R4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab467db4", new Object[]{this});
            return;
        }
        try {
            P4(CoreConstants.UT_ORDER_LIST_SPM_CNT);
            UTTracker defaultTracker = UTAnalytics.getInstance().getDefaultTracker();
            HashMap hashMap = new HashMap();
            hashMap.put("spm-url", CoreConstants.UT_ORDER_LIST_SPM_CNT);
            defaultTracker.updateNextPageProperties(hashMap);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void S4(org.json.JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95149e15", new Object[]{this, jSONObject});
        } else if (!T4(jSONObject)) {
            P4(CoreConstants.UT_ORDER_LIST_SPM_CNT);
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
        B4();
        if (jSONObject != null) {
            try {
                OrderRecyclerView orderRecyclerView = (OrderRecyclerView) this.m.u().i(this.n);
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                JSONObject jSONObject3 = jSONObject.getJSONObject("global");
                if (!(jSONObject2 == null || jSONObject3 == null)) {
                    if (TextUtils.equals("true", OrangeConfig.getInstance().getConfig("babelorder", "orderDetailFilterEnablePreRender", "true"))) {
                        eel eelVar = this.l;
                        eelVar.a0(this, jSONObject, eelVar.A(orderRecyclerView));
                    }
                    if (jSONObject3.getJSONObject("pageControl") != null) {
                        this.r = new org.json.JSONObject(jSONObject3.getJSONObject("pageControl"));
                        if (jSONObject3.getJSONObject("recommendData") != null) {
                            this.s = new org.json.JSONObject(jSONObject3.getJSONObject("recommendData"));
                        }
                        this.l.U0(null, jSONObject3);
                        r4(orderRecyclerView, this.r.optString("hasMore"), jSONObject2.getString(TBSearchChiTuJSBridge.ABTEST));
                    }
                    if (orderRecyclerView != null) {
                        orderRecyclerView.resetScroll();
                    }
                }
            } catch (Exception e2) {
                m8v.a(e2);
            }
        }
    }

    @Override // tb.h4d
    public void V2(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("203e7a52", new Object[]{this, str, obj});
            return;
        }
        if (this.A == null) {
            this.A = new HashMap<>();
        }
        this.A.put(str, obj);
    }

    public final void V4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dee2526", new Object[]{this});
        } else if (this.l.r() != null) {
            this.l.r().put("waitPayDowngrade", (Object) "true");
            A4("WaitPayDowngrade");
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    public final void d4(org.json.JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("530cafb8", new Object[]{this, jSONObject});
        } else if (jSONObject != null && this.l.r() != null) {
            try {
                this.l.r().put(CoreConstants.KEY_PAGE_CONTEXT, (Object) jSONObject.toString());
                this.l.M().j().put("condition", this.l.r().toJSONString());
            } catch (Exception e2) {
                m8v.a(e2);
            }
        }
    }

    public final void e4(org.json.JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5130fbb", new Object[]{this, jSONObject, jSONObject2});
        } else {
            pav.k(new j(jSONObject2, jSONObject));
        }
    }

    public final void f4(Map<String, Object> map) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe02289e", new Object[]{this, map});
        } else if (map != null && !map.isEmpty()) {
            try {
                String str = this.l.M().j().get("condition");
                if (str == null) {
                    jSONObject = new JSONObject();
                } else {
                    jSONObject = JSON.parseObject(str);
                }
                jSONObject.putAll(map);
                this.l.M().j().put("condition", jSONObject.toJSONString());
            } catch (Exception e2) {
                m8v.a(e2);
                hav.b(OrderConfigs.BizNameType.ORDER_LIST.getBizName(), "appendParamsToCondition", e2.getMessage());
            }
        }
    }

    @Override // android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        if (!uel.l("enableWXNavToHomePage", true) || !isTaskRoot()) {
            super.finish();
        } else {
            Nav.from(this).disableTransition().toUri("http://m.taobao.com/index.htm");
            pav.i(new b(), 100L);
        }
        OrderRecommendWrapper orderRecommendWrapper = this.u;
        if (orderRecommendWrapper != null) {
            orderRecommendWrapper.f();
            this.u.b();
        }
        G4(false);
        lor.c("TBOrderListActivity", "finish", new String[0]);
    }

    public final void g4() {
        Uri data;
        String queryParameter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("771790ff", new Object[]{this});
            return;
        }
        try {
            Intent intent = getIntent();
            if (intent != null && (data = intent.getData()) != null && (queryParameter = data.getQueryParameter("queryParams")) != null) {
                f4(JSON.parseObject(queryParameter));
            }
        } catch (Exception e2) {
            m8v.a(e2);
            hav.b("OrderList", "appendQueryParamsFromOriginUriToCondition", e2.getMessage());
        }
    }

    @Override // com.taobao.uikit.actionbar.ITBPublicMenu
    public TBPublicMenu getPublicMenu() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBPublicMenu) ipChange.ipc$dispatch("1f3d234e", new Object[]{this});
        }
        return this.j;
    }

    public final void h4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5aba2fb", new Object[]{this});
            return;
        }
        bfl bflVar = this.C;
        if (bflVar != null) {
            bflVar.a(dbv.BIZ_ORDER_DETAIL);
        }
    }

    public final void j4() {
        brb u;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c7dbb38", new Object[]{this});
            return;
        }
        OrderConfigs orderConfigs = this.m;
        if (orderConfigs != null && (u = orderConfigs.u()) != null) {
            u.c(this.n, true ^ TextUtils.equals(this.l.t(), TabType.REFUND.getValue()));
        }
    }

    @Override // tb.i4d
    public OrderConfigs l0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OrderConfigs) ipChange.ipc$dispatch("c9541bf1", new Object[]{this});
        }
        return this.m;
    }

    @Override // com.taobao.android.order.bundle.base.BaseActivity
    public com.taobao.android.order.core.a n3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.order.core.a) ipChange.ipc$dispatch("81c72e58", new Object[]{this});
        }
        OrderConfigs h2 = this.l.h(getIntent());
        this.m = h2;
        h2.S(this.l.N());
        this.l.T0(null);
        if (OrderType.ORDERLIST.getValue().equals(this.l.D()) || OrderType.MAOCHAO.getValue().equalsIgnoreCase(this.l.D())) {
            U4();
        }
        ldl.INSTANCE.f(false);
        return com.taobao.android.order.core.a.a(this.m);
    }

    public final void n4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e4bbd25", new Object[]{this});
        } else if (!wbl.c()) {
            hav.g("TBOrderListActivity", "initLogisticsWeex2Fragment", "switcher is off");
        } else {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            ParallelBizValueHelper.PageType pageType = ParallelBizValueHelper.PageType.logistics_detail;
            this.l.H0(afl.c(ParallelBizValueHelper.c(pageType), ParallelBizValueHelper.c(ParallelBizValueHelper.PageType.order_list), null, null, true, R.id.orderListWeex2FragmentContainer, displayMetrics.widthPixels, displayMetrics.heightPixels));
            if (this.E == null) {
                this.E = new k(pageType);
            }
            if (this.l.x() != null) {
                this.l.x().v3(this.E);
            }
        }
    }

    public final void o4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5fda872", new Object[]{this});
            return;
        }
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        eel eelVar = this.l;
        ParallelBizValueHelper.PageType pageType = ParallelBizValueHelper.PageType.order_detail;
        eelVar.Y0(afl.c(ParallelBizValueHelper.c(pageType), ParallelBizValueHelper.c(ParallelBizValueHelper.PageType.order_list), null, null, true, R.id.orderListWeex2FragmentContainer, displayMetrics.widthPixels, displayMetrics.heightPixels));
        if (this.l.V() != null) {
            this.l.V().w3(this.B);
            if (this.D == null) {
                this.D = new k(pageType);
            }
            this.l.V().v3(this.D);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i2), new Integer(i3), intent});
            return;
        }
        super.onActivityResult(i2, i3, intent);
        eel eelVar = this.l;
        if (eelVar != null && eelVar.T() != null) {
            this.l.r0(new TradeHybridTMSFragment.b.a(Integer.valueOf(i2), Integer.valueOf(i3), intent));
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i2), keyEvent})).booleanValue();
        }
        if (this.l.V() != null && this.l.V().onKeyDown(i2, keyEvent)) {
            return true;
        }
        if (this.l.x() != null && this.l.x().onKeyDown(i2, keyEvent)) {
            return true;
        }
        if (this.l.T() == null || !this.l.T().O2(Integer.valueOf(i2), keyEvent)) {
            return super.onKeyDown(i2, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRestart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c630bb7", new Object[]{this});
            return;
        }
        super.onRestart();
        pav.k(new g());
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80049e8d", new Object[]{this, bundle});
            return;
        }
        eel eelVar = this.l;
        if (eelVar != null) {
            eelVar.o0(bundle);
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // com.taobao.android.order.bundle.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        WeexInstance weexInstance = this.z;
        if (weexInstance != null) {
            weexInstance.onActivityStart();
        }
        eel eelVar = this.l;
        if (eelVar != null && eelVar.T() != null) {
            this.l.r0(TradeHybridTMSFragment.b.e.INSTANCE);
        }
    }

    @Override // com.taobao.android.order.bundle.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        OrderConfigs orderConfigs;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        WeexInstance weexInstance = this.z;
        if (weexInstance != null) {
            weexInstance.onActivityStop();
        }
        eel eelVar = this.l;
        if (!(eelVar == null || eelVar.T() == null)) {
            this.l.r0(TradeHybridTMSFragment.b.f.INSTANCE);
        }
        eel eelVar2 = this.l;
        if (eelVar2 != null && (orderConfigs = this.m) != null) {
            eelVar2.x0(orderConfigs);
            this.l.y0(this.m);
        }
    }

    public final void p4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd87ac60", new Object[]{this});
        } else {
            this.C = new bfl(this.B);
        }
    }

    @Override // com.taobao.uikit.actionbar.ITBPublicMenu
    public Bundle pageUserInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("65615653", new Object[]{this});
        }
        return jjx.b(this, this.F);
    }

    public void setPageUserInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ef7c35b", new Object[]{this, str});
        } else {
            this.F = str;
        }
    }

    @Override // com.taobao.android.order.bundle.base.TBOrderBaseActivity, com.taobao.android.order.bundle.base.BaseActivity
    public void t3() {
        if (this.l.f0()) {
            if (this.l.w() != null && v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_MY_TAOBAO, "enableAdvanceLoadRefund", true)) {
                this.l.w().addView(new View(this), 0, mgw.e(this) + (this.m.r() != null ? 44 : 85));
            }
            this.m.P();
            this.m.R(this.l.K());
        }
        if (!this.l.f0() && !this.l.l0() && !this.l.n0()) {
            q3().f(this.l.F(), null);
        }
        wqb c2 = q3().c();
        if (this.l.l0()) {
            this.f.f().put("cache_load_start", Long.valueOf(System.currentTimeMillis()));
            x4(c2);
            this.f.f().put("cache_load_end", Long.valueOf(System.currentTimeMillis()));
        }
        if (c2 instanceof UltronListProxy) {
            edl.c((gav) c2);
            ((UltronListProxy) c2).v0(new h());
        }
        int j2 = dbl.j();
        if (j2 > 0 && dbl.w()) {
            try {
                this.y = this.m.u().i(this.n);
                Field declaredField = RecyclerView.class.getDeclaredField("mMaxFlingVelocity");
                declaredField.setAccessible(true);
                declaredField.set(this.y, Integer.valueOf(pb6.f(this, j2)));
            } catch (Exception e2) {
                e2.printStackTrace();
                m8v.a(e2);
            }
        }
        if (this.O == null) {
            this.O = new RecyclerView.OnScrollListener() { // from class: com.taobao.android.order.bundle.TBOrderListActivity.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass7 r5, String str, Object... objArr) {
                    int hashCode = str.hashCode();
                    if (hashCode == -1177043419) {
                        super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                        return null;
                    } else if (hashCode == 1361287682) {
                        super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                        return null;
                    } else {
                        int hashCode2 = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/order/bundle/TBOrderListActivity$7");
                    }
                }

                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i2), new Integer(i3)});
                        return;
                    }
                    super.onScrolled(recyclerView, i2, i3);
                    TBOrderListActivity.J3(TBOrderListActivity.this).e(recyclerView, TBOrderListActivity.c4(TBOrderListActivity.this), i2, i3);
                }

                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrollStateChanged(RecyclerView recyclerView, int i2) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i2)});
                        return;
                    }
                    super.onScrollStateChanged(recyclerView, i2);
                    TBOrderListActivity.J3(TBOrderListActivity.this).b(recyclerView, TBOrderListActivity.c4(TBOrderListActivity.this), i2);
                    if ((i2 != 2 || i2 == 0) && !TBOrderListActivity.K3(TBOrderListActivity.this) && TBOrderListActivity.M3(TBOrderListActivity.this) != null && "true".equals(TBOrderListActivity.M3(TBOrderListActivity.this).optString("hasMore"))) {
                        if (recyclerView.getAdapter().getItemCount() - ((LinearLayoutManager) recyclerView.getLayoutManager()).findLastVisibleItemPosition() < 25) {
                            TBOrderListActivity.L3(TBOrderListActivity.this, true);
                            TBOrderListActivity.this.H4();
                        }
                        if (!TBOrderListActivity.K3(TBOrderListActivity.this) && i2 == 0 && TBOrderListActivity.X3(TBOrderListActivity.this) != null) {
                            TBOrderListActivity.X3(TBOrderListActivity.this).A0(recyclerView);
                        }
                    }
                }
            };
        }
        RecyclerView i2 = this.m.u().i(this.n);
        this.y = i2;
        if (i2 != null) {
            i2.addOnScrollListener(this.O);
        }
        nl2.d(this.m);
        if (this.l.f0()) {
            this.l.e1();
        }
        this.K.set(false);
        this.L.set(false);
        vel velVar = this.f;
        if (velVar != null) {
            velVar.f().put("on_create_finish", Long.valueOf(System.currentTimeMillis()));
        }
    }

    public final void t4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        this.q = (ViewGroup) findViewById(R.id.mask_layout);
        this.l.W0((LinearLayout) findViewById(R.id.top_layout));
        this.l.V0((FrameLayout) findViewById(R.id.tab_layout));
        this.l.G0((LinearLayout) findViewById(R.id.header_layout));
        this.l.b1((SimpleViewpager) findViewById(R.id.viewpager));
        C3(4473924);
    }

    public void u4(com.taobao.android.order.core.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f02a877a", new Object[]{this, aVar});
        } else {
            this.l.e0(aVar);
        }
    }

    @Override // tb.ptg.c
    public void updateCurrentContainView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d2473c2", new Object[]{this, view});
        } else {
            this.n = view;
        }
    }

    public boolean v4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2b1ad4e", new Object[]{this})).booleanValue();
        }
        return this.L.get();
    }

    @Override // tb.ptg.c
    public void w2(TBSwipeRefreshLayout tBSwipeRefreshLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("494b6a85", new Object[]{this, tBSwipeRefreshLayout});
            return;
        }
        this.o = tBSwipeRefreshLayout;
        ParallelBizValueHelper.PageType p3 = p3();
        com.taobao.android.order.bundle.base.parallelbiz.a.b(p3, "_Button-" + this.l.t() + "-pullStartLoad", null);
        A4("PullToRefresh");
    }

    @Override // com.taobao.android.order.bundle.base.BaseActivity
    public void w3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48d708ff", new Object[]{this});
        } else {
            u4(q3());
        }
    }

    public final TBErrorView w4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBErrorView) ipChange.ipc$dispatch("8fb63d3a", new Object[]{this});
        }
        View view = this.n;
        if (view == null) {
            return null;
        }
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.order_list_view_stub);
        if (viewStub == null) {
            return (TBErrorView) this.n.findViewById(R.id.order_list_layout_to_inflate).findViewById(R.id.tb_order_error_view);
        }
        return (TBErrorView) viewStub.inflate().findViewById(R.id.tb_order_error_view);
    }

    @Override // tb.h4d
    public Object x2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("b327bdd5", new Object[]{this, str});
        }
        HashMap<String, Object> hashMap = this.A;
        if (hashMap == null) {
            return null;
        }
        return hashMap.get(str);
    }

    public final void x4(wqb wqbVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("948b1908", new Object[]{this, wqbVar});
        } else if (wqbVar instanceof UltronListProxy) {
            UltronListProxy ultronListProxy = (UltronListProxy) wqbVar;
            JSONObject B = this.l.B();
            if (yh.a().f32082a > 1) {
                z = false;
            }
            ultronListProxy.q0(B, z, null, this.l.C());
        }
    }

    @Override // tb.h4d
    public void y2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1317040f", new Object[]{this, str});
            return;
        }
        HashMap<String, Object> hashMap = this.A;
        if (hashMap != null) {
            hashMap.remove(str);
        }
    }

    public final void y4(String str, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4d563d2", new Object[]{this, str, hashMap});
        } else {
            z4(hashMap);
        }
    }

    @Override // tb.ptg.c
    public String z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b04cb2e7", new Object[]{this});
        }
        return this.l.t();
    }

    public final void z4(HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2eee1c", new Object[]{this, hashMap});
        } else if (q3() != null) {
            if (!this.w) {
                this.m.N(null);
            }
            TBSwipeRefreshLayout tBSwipeRefreshLayout = this.o;
            if ((tBSwipeRefreshLayout == null || !tBSwipeRefreshLayout.isRefreshing()) && !this.l.f0() && !this.l.l0()) {
                this.l.d1(this, this.q);
            }
            if (this.l.l0()) {
                this.l.X().setIsCanScroll(false);
            }
            J4();
            q3().p();
            if (!TextUtils.isEmpty(this.l.G())) {
                HashMap<String, JSONObject> hashMap2 = R;
                if (hashMap2.get(this.l.G()) != null) {
                    q3().f(hashMap2.get(this.l.G()), this);
                    hashMap2.remove(this.l.G());
                    this.l.N0(null);
                    this.p = false;
                    j4();
                }
            }
            g4();
            f4(hashMap);
            q3().g(this);
            this.p = false;
            j4();
        }
    }

    @Override // tb.pqb
    public void B1(JSONObject jSONObject) {
        Exception e2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f4f8313", new Object[]{this, jSONObject});
        } else if (jSONObject != null && "true".equals(jSONObject.getString("delayRefresh"))) {
            this.p = true;
        } else if (this.t) {
            this.p = true;
        } else {
            HashMap<String, Object> hashMap = null;
            if (!(jSONObject == null || this.l.r() == null)) {
                try {
                    if ("true".equals(jSONObject.getString("refreshFromCancelBtn"))) {
                        this.l.O0(true);
                        jSONObject.remove("refreshFromCancelBtn");
                    }
                    HashMap<String, Object> hashMap2 = new HashMap<>(jSONObject);
                    try {
                        this.l.r().putAll(hashMap2);
                        hashMap = hashMap2;
                    } catch (Exception e3) {
                        e2 = e3;
                        hashMap = hashMap2;
                        e2.printStackTrace();
                        m8v.a(e2);
                        y4("NativeRefresh", hashMap);
                    }
                } catch (Exception e4) {
                    e2 = e4;
                }
            }
            y4("NativeRefresh", hashMap);
        }
    }

    public void C4(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfbbd261", new Object[]{this, map});
            return;
        }
        org.json.JSONObject jSONObject = this.r;
        if (jSONObject != null) {
            d4(jSONObject.optJSONObject(CoreConstants.KEY_PAGE_CONTEXT));
        }
        f4(map);
        O4(this.l.M(), false);
        this.l.d1(this, this.q);
        q3().g(this);
    }

    public final void E4(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5216a1e", new Object[]{this, recyclerView});
        } else if (this.H) {
            hav.g("TBOrderListActivity", "prefetchWhenResponse", "server degrade");
            if (!this.I) {
                h4();
                this.I = true;
            }
        } else {
            org.json.JSONObject jSONObject = this.r;
            if (jSONObject != null) {
                try {
                    if (Integer.parseInt(jSONObject.optString("nextPageIndex")) - 1 > wbl.m()) {
                        hav.g("TBOrderListActivity", "prefetchWhenResponse", "invalid page");
                        return;
                    }
                } catch (Throwable unused) {
                }
            }
            if (recyclerView == null || !(recyclerView.getAdapter() instanceof FixedViewAdapter) || !(((FixedViewAdapter) recyclerView.getAdapter()).N() instanceof RecyclerViewAdapter)) {
                hav.g("TBOrderListActivity", "prefetchWhenResponse", "invalid recyclerView");
                return;
            }
            eel eelVar = this.l;
            List<IDMComponent> q = eelVar == null ? null : eelVar.q(recyclerView);
            if (q == null || q.isEmpty()) {
                hav.g("TBOrderListActivity", "prefetchWhenResponse", "no components");
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
            this.C.d(arrayList, this.m);
        }
    }

    public void H4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f321b347", new Object[]{this});
            return;
        }
        ParallelBizValueHelper.PageType p3 = p3();
        com.taobao.android.order.bundle.base.parallelbiz.a.b(p3, "_Button-" + this.l.t() + "-pullEndLoad", null);
        org.json.JSONObject jSONObject = this.r;
        if (jSONObject != null) {
            d4(jSONObject.optJSONObject(CoreConstants.KEY_PAGE_CONTEXT));
            this.l.M().j().put("page", this.r.optString("nextPageIndex"));
        }
        O4(this.l.M(), false);
        q3().g(this);
    }

    @Override // tb.a6r
    public boolean J0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d44aa950", new Object[]{this})).booleanValue();
        }
        return true ^ uel.l("removeActionbarConfig", true);
    }

    public final void O4(u3o u3oVar, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bcc84bc", new Object[]{this, u3oVar, new Boolean(z)});
        } else if (u3oVar == null || OrderType.ORDERFILTER.getValue().equals(this.l.D())) {
        } else {
            if (this.l.i0()) {
                u3oVar.b("orderList_cancel");
                this.l.O0(false);
            } else if (OrderType.ORDERSEARCH.getValue().equals(this.l.D())) {
                u3oVar.b("orderList_search");
            } else if (OrderType.MAOCHAO.getValue().equalsIgnoreCase(this.l.D())) {
                u3oVar.b("orderList_maochao");
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

    public final void U4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cac2e677", new Object[]{this});
        } else if (uel.l("enableNativeHeader", true) && !ykl.a() && !Localization.o()) {
            eel eelVar = this.l;
            if (eelVar == null || !eelVar.n0()) {
                this.f.f().put("native_header_init_start", Long.valueOf(System.currentTimeMillis()));
                hav.d("NativeHeaderInit", "start");
                if (!this.l.f0()) {
                    this.l.S().addView(new TBOrderListSearchView(this));
                    this.m.H(true);
                }
                TBOrderListTabLayout tBOrderListTabLayout = new TBOrderListTabLayout(this);
                tBOrderListTabLayout.setInitialSelectedTab(this.l.t(), this);
                this.l.R().addView(tBOrderListTabLayout);
                this.m.U(tBOrderListTabLayout);
                this.m.V(this.l.S());
                hav.d("NativeHeaderInit", "end");
                this.f.f().put("native_header_init_end", Long.valueOf(System.currentTimeMillis()));
            }
        }
    }

    public final void a(String str, String str2, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee44d207", new Object[]{this, str, str2, mtopResponse});
            return;
        }
        lor.c("TBOrderListActivity", "handleMtopResponseByUrl", "DownGradeByUrl downGrade = " + str2);
        idl.c(idl.a.a(OrderBizCode.orderList, CoreConstants.JS_TRACKER_ORDER_LIST_NOT_DOWNGRADE_H5).sampling(1.0f).message("onLoadError：redirectToH5").success(false));
        Nav.from(this).toUri(str);
        finish();
    }

    public final void i4(MtopResponse mtopResponse, RecyclerView recyclerView, PageStatus pageStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3892619", new Object[]{this, mtopResponse, recyclerView, pageStatus});
        } else if (!this.K.get() || !v9v.i(wbl.NEW_BABEL_ORDER, "forbidIdleTaskOnDestroy", true)) {
            eel eelVar = this.l;
            eelVar.b0(this, pageStatus, mtopResponse, eelVar.A(recyclerView));
            this.C.e(mtopResponse);
            E4(recyclerView);
            d9x.e();
            this.l.p0(this, pageStatus);
        } else {
            hav.g("TBOrderListActivity", "doIdleTask:", "forbid idle task onDestroy");
        }
    }

    public final void k4(MtopResponse mtopResponse, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69317ac7", new Object[]{this, mtopResponse, str});
            return;
        }
        org.json.JSONObject jSONObject = this.r;
        if (jSONObject != null && !"1".equals(jSONObject.optString("nextPageIndex"))) {
            str = CoreConstants.DOWNGRADLE_V2TOV1_NONE_FIRST;
        }
        if (TextUtils.isEmpty(jql.n(getIntent()))) {
            dpj.d(this, this.l.t(), str);
        } else {
            dpj.e(this, this.l.O(), str);
        }
        overridePendingTransition(0, 0);
        finish();
    }

    public final void l4(MtopResponse mtopResponse, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("123fedeb", new Object[]{this, mtopResponse, str});
            return;
        }
        lor.c("TBOrderListActivity", "handleMtopResponseByH5", "DownGradeTOH5List downGrade = " + str);
        idl.c(idl.a.a(OrderBizCode.orderList, CoreConstants.JS_TRACKER_ORDER_LIST_NOT_DOWNGRADE_H5).sampling(1.0f).message("onLoadError：downgradeToH5").success(false));
        dpj.b(this, this.l.t(), str);
        overridePendingTransition(0, 0);
        finish();
    }

    public void m4() {
        TBErrorView tBErrorView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb3ae8d", new Object[]{this});
        } else if (this.n != null) {
            if (v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_MY_TAOBAO, "enableNewTBErrorView", true)) {
                ViewGroup viewGroup = (ViewGroup) this.n.findViewById(R.id.order_list_error_view);
                if (viewGroup != null) {
                    viewGroup.removeAllViews();
                    viewGroup.setVisibility(8);
                }
            } else if (((ViewStub) this.n.findViewById(R.id.order_list_view_stub)) == null && (tBErrorView = (TBErrorView) this.n.findViewById(R.id.order_list_layout_to_inflate).findViewById(R.id.tb_order_error_view)) != null) {
                tBErrorView.setVisibility(8);
            }
        }
    }

    public final TBErrorView s4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBErrorView) ipChange.ipc$dispatch("e1c02acf", new Object[]{this});
        }
        if (!v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_MY_TAOBAO, "enableNewTBErrorView", false)) {
            return w4();
        }
        View view = this.n;
        if (view == null) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.order_list_error_view);
        if (viewGroup == null) {
            return w4();
        }
        TBErrorView tBErrorView = new TBErrorView(this);
        viewGroup.addView(tBErrorView);
        viewGroup.setVisibility(0);
        return tBErrorView;
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
                m8v.a(e2);
                lor.b("TBOrderListActivity", "updateParams-parse-res", e2);
                jSONObject2 = null;
            }
            if (jSONObject2 != null) {
                str = String.valueOf(UUID.randomUUID());
                if (v9v.i(wbl.NEW_BABEL_ORDER, "enablePresetResponse", false)) {
                    R.put(str, jSONObject2);
                    this.l.N0(str);
                }
            } else {
                str = null;
            }
            Object obj = jSONObject.get("openNewPage");
            if (obj instanceof JSONObject) {
                Bundle bundle = new Bundle();
                bundle.putString("tabCode", this.l.t());
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
                    Nav.from(this).withExtras(bundle).toUri(string);
                    return;
                }
            }
            if (this.l.M() != null && this.l.M().j() != null) {
                Object obj3 = jSONObject.get("extraConditionParams");
                if (obj3 instanceof JSONObject) {
                    try {
                        jSONObject3 = JSON.parseObject(this.l.M().j().get("condition"));
                    } catch (JSONException e3) {
                        m8v.a(e3);
                        lor.b("TBOrderListActivity", "extCondition-parse-error", e3);
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
                            jSONObject3 = JSON.parseObject(this.l.M().j().get("condition"));
                        } catch (JSONException e4) {
                            m8v.a(e4);
                            lor.b("TBOrderListActivity", "extBiz-parse-error", e4);
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
                        this.l.B0(jSONObject3);
                        this.l.M().j().put("condition", jSONObject3.toJSONString());
                    } catch (JSONException e5) {
                        e5.printStackTrace();
                        m8v.a(e5);
                    }
                }
            }
        }
    }

    @Override // tb.i4d
    public void v1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32ebfeb0", new Object[]{this});
            return;
        }
        vel velVar = this.f;
        if (velVar == null) {
            hav.d(we6.TAG, "tracker is null");
            return;
        }
        velVar.f().put("cache_img_load_end_time", Long.valueOf(System.currentTimeMillis()));
        this.f.m(true);
        this.f.h();
        hav.d(we6.TAG, "图片缓存命中");
    }

    public final void B4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8368c920", new Object[]{this});
            return;
        }
        this.P = false;
        this.l.Z(this.q);
        m4();
        TBSwipeRefreshLayout tBSwipeRefreshLayout = this.o;
        if (tBSwipeRefreshLayout != null) {
            tBSwipeRefreshLayout.setRefreshing(false);
            this.o.setLoadMore(false);
        }
        this.l.X().setIsCanScroll(true);
        idl.c(idl.a.a(OrderBizCode.orderList, CoreConstants.JS_TRACKER_ORDER_LIST_NOT_DOWNGRADE_H5).sampling(0.001f).message("onLoadSuccess").success(true));
    }

    public final void I4() {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44d953a5", new Object[]{this});
        } else if (uel.l("enableOListTabCache", true) && OrderType.ORDERLIST.getValue().equals(this.l.D())) {
            Pair<JSONObject, String> j2 = nrr.j(this, this.l.t(), nrr.SCENE_RELOADCONTAINER);
            nrr.g();
            if (j2 != null && (obj = j2.first) != null) {
                this.l.I0((JSONObject) obj);
                this.l.J0((String) j2.second);
                this.l.Z0(true);
                if (v9v.i(wbl.NEW_BABEL_ORDER, "removeMegaLoading", true)) {
                    this.l.d1(this, this.q);
                }
                this.m.I(true);
                q3().f(this.l.B(), null);
                this.m.I(false);
            }
        }
    }

    public final void J4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b884929", new Object[]{this});
            return;
        }
        this.l.M().j().put("page", "1");
        this.m.Y("true".equals(this.l.p()));
        if (this.l.r() != null) {
            this.l.r().remove(CoreConstants.KEY_PAGE_CONTEXT);
            String b2 = ct0.b(this, false);
            if (!TextUtils.isEmpty(b2)) {
                this.l.r().put("installApp", (Object) b2);
            }
            N4(this.l.r());
            try {
                this.l.M().j().put("condition", this.l.r().toJSONString());
            } catch (JSONException e2) {
                m8v.a(e2);
            }
        }
        O4(this.l.M(), true);
    }

    public void M4(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c27764fd", new Object[]{this, mtopResponse});
            return;
        }
        TBErrorView s4 = s4();
        if (s4 != null) {
            if (v9v.i("babelorder", "enableSetTopic", true)) {
                if (this.l != null && OrderType.ORDERSEARCH.getValue().equals(this.l.D())) {
                    s4.setTopic("order_list_search");
                } else if (this.l == null || !OrderType.ORDERFILTER.getValue().equals(this.l.D())) {
                    s4.setTopic("order_list");
                } else {
                    s4.setTopic("order_list_filter");
                }
            }
            if (mtopResponse != null) {
                s4.setError(Error.Factory.fromMtopResponse(mtopResponse.getResponseCode(), mtopResponse.getMappingCode(), mtopResponse.getRetCode(), mtopResponse.getRetMsg()));
            }
            s4.setVisibility(0);
            s4.setButton(TBErrorView.ButtonType.BUTTON_LEFT, Localization.q(R.string.order_biz_refresh), new a());
        }
    }

    public final boolean T4(org.json.JSONObject jSONObject) {
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
                P4(optString + "." + optString2 + ".0.0");
                return true;
            }
            return false;
        } catch (Exception e2) {
            m8v.a(e2);
            hav.b(OrderBizCode.orderList, "updateSpmException", e2.getMessage());
            return false;
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
        this.P = false;
        if (mtopResponse != null) {
            this.o.setRefreshing(false);
            this.o.setLoadMore(false);
            this.l.X().setIsCanScroll(true);
            if (mtopResponse.isApiSuccess()) {
                if (dbl.e()) {
                    l4(mtopResponse, "ReturnH5");
                }
                k4(mtopResponse, CoreConstants.DOWNGRADLE_V2TOV1);
            } else if (mtopResponse.isMtopServerError() || mtopResponse.isMtopSdkError() || mtopResponse.isSessionInvalid()) {
                if (this.m.A()) {
                    this.l.U(q3()).V(1);
                    this.m.H(false);
                }
                if (o9l.b()) {
                    if (this.r == null || "1".equals(this.l.M().j().get("page"))) {
                        try {
                            if (v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_MY_TAOBAO, "enableBlockErrorView", true) && (q = this.l.q((OrderRecyclerView) this.m.u().i(this.n))) != null) {
                                if (!q.isEmpty()) {
                                    z = false;
                                }
                            }
                        } catch (Exception e2) {
                            m8v.a(e2);
                            e2.printStackTrace();
                        }
                        if (this.l.l0() || !z) {
                            h0u.c(this, mtopResponse.getRetMsg());
                        } else {
                            if (TextUtils.isEmpty(this.l.O())) {
                                this.l.M0(exi.b());
                            } else {
                                this.l.M0(exi.d());
                            }
                            q3().p();
                            q3().f(this.l.F(), this);
                            M4(mtopResponse);
                        }
                        this.l.Z0(false);
                    } else {
                        h0u.c(this, mtopResponse.getRetMsg());
                    }
                    this.l.Z(this.q);
                    return;
                }
                k4(mtopResponse, mtopResponse.getRetCode());
            } else if ("ReturnH5".equals(mtopResponse.getRetCode())) {
                l4(mtopResponse, "ReturnH5");
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
        boolean i2 = v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_MY_TAOBAO, "enableTabChangePreRender", true);
        K4();
        m4();
        this.l.j();
        String str3 = null;
        this.r = null;
        TabType tabType = TabType.REFUND;
        if (tabType.getValue().equals(this.l.t())) {
            TBRefundInstanceManager.onTabSelectedRefundList(this.z, false);
            TBRefundInstanceManager.reportRumInRefundList(false, this.l.J());
            this.l.y0(this.m);
            if (this.l.J() != null && i2) {
                this.l.J().removeAllViews();
                TBRefundInstanceManager.dispatchVisibilityState(this.z, false);
            }
        }
        if (str != null) {
            this.l.C0(str);
        }
        this.l.M().j().put("tabCode", this.l.t());
        this.o.enablePullRefresh(!TextUtils.equals(this.l.t(), tabType.getValue()));
        j4();
        if (tabType.getValue().equals(str)) {
            this.l.e1();
            TBRefundInstanceManager.dispatchVisibilityState(this.z, true);
            if (i2) {
                wqb c2 = q3().c();
                if (this.l.J() == null || (weexInstance = this.z) == null) {
                    TBRefundInstanceManager.startPreRequestOnIdle(this);
                    if (!TextUtils.isEmpty(this.m.m())) {
                        str3 = this.m.m();
                    }
                    FrameLayout frameLayout = new FrameLayout(this);
                    this.l.P0(frameLayout);
                    long currentTimeMillis = System.currentTimeMillis();
                    if (c2 instanceof UltronListProxy) {
                        currentTimeMillis = ((UltronListProxy) c2).o0();
                    }
                    String l = Long.toString(currentTimeMillis);
                    if (this.l.j0()) {
                        str2 = "other";
                    } else {
                        str2 = "order";
                    }
                    this.z = TBRefundInstanceManager.refundWeex2PreRender(this, frameLayout, str3, new TBRefundInstanceManager.b(l, str2, false));
                    this.m.Q(frameLayout);
                    this.l.v0(c2);
                    TBRefundInstanceManager.onTabSelectedRefundList(this.z, true);
                    TBRefundInstanceManager.reportRumInRefundList(true, this.l.J());
                    return;
                }
                if (!(weexInstance.getRootView() == null || this.z.getRootView().getParent() == null)) {
                    ((ViewGroup) this.z.getRootView().getParent()).removeView(this.z.getRootView());
                }
                this.l.J().addView(this.z.getRootView());
                this.m.Q(this.l.J());
                this.l.v0(c2);
                TBRefundInstanceManager.onTabSelectedRefundList(this.z, true);
                TBRefundInstanceManager.reportRumInRefundList(true, this.l.J());
                return;
            }
        }
        I4();
        G4(true);
        A4("SwitchTab");
    }

    @Override // com.taobao.android.order.bundle.base.TBOrderBaseActivity, com.taobao.android.order.bundle.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        OrderRecommendWrapper orderRecommendWrapper;
        RecyclerView recyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        this.K.set(true);
        edl.b();
        if (q3() != null) {
            if (q3().c() instanceof UltronListProxy) {
                ((UltronListProxy) e1()).v0(null);
            }
            q3().b();
        }
        BroadcastReceiver broadcastReceiver = this.M;
        if (broadcastReceiver != null) {
            nl2.h(this, broadcastReceiver);
        }
        nl2.i();
        nl2.j();
        RecyclerView.OnScrollListener onScrollListener = this.O;
        if (!(onScrollListener == null || (recyclerView = this.y) == null)) {
            recyclerView.removeOnScrollListener(onScrollListener);
        }
        ldl.INSTANCE.e();
        if (this.l.V() != null) {
            this.l.V().C2();
            this.D = null;
            this.l.V().v3(null);
        }
        if (this.l.x() != null) {
            this.l.x().C2();
            this.E = null;
            this.l.x().v3(null);
        }
        this.G = null;
        HashMap<String, Object> hashMap = this.A;
        if (hashMap != null) {
            hashMap.clear();
        }
        if (this.l != null && TabType.REFUND.getValue().equals(this.l.t())) {
            TBRefundInstanceManager.reportRumInRefundList(false, this.l.J());
        }
        AsyncInstanceLoadManager.j();
        WeexInstance weexInstance = this.z;
        if (weexInstance != null) {
            weexInstance.destroy();
        }
        eel eelVar = this.l;
        if (!(eelVar == null || eelVar.T() == null)) {
            this.l.r0(TradeHybridTMSFragment.b.C0079b.INSTANCE);
        }
        eel eelVar2 = this.l;
        if (eelVar2 != null) {
            eelVar2.j();
        }
        if (uel.l("enableDestroyRecommend", true) && (orderRecommendWrapper = this.u) != null) {
            orderRecommendWrapper.f();
            this.u.b();
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("context", (Object) getApplicationContext());
        jSONObject.put(ccv.PARAM_ASYNC_DATA_SOURCE, (Object) "true");
        bbv g2 = qbv.j().g();
        if (v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_MY_TAOBAO, "enablePreRequestRefundOrderList", true) && g2.c("first_data", ae2.BizKeyRefund)) {
            jSONObject.put("enablePreRequestRefund", (Object) Boolean.TRUE);
        }
        qbv.j().a(UltronTradeHybridStage.ON_CONTAINER_DESTROY, "orderList", jSONObject);
        if (uel.l("releaseInstanceContext", true)) {
            B3().b0();
        }
        if (uel.l("releaseOrderConfigs", true)) {
            OrderConfigs orderConfigs = this.m;
            if (orderConfigs != null) {
                orderConfigs.K(null);
                this.m.X(null);
            }
            eel eelVar3 = this.l;
            if (eelVar3 != null) {
                eelVar3.Y0(null);
                this.l.H0(null);
                this.l.X0(null);
            }
        }
        F4(false);
    }

    @Override // com.taobao.android.order.bundle.base.TBOrderBaseActivity, com.taobao.android.order.bundle.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        this.t = true;
        WeexInstance weexInstance = this.z;
        if (weexInstance != null) {
            weexInstance.onActivityPause();
        }
        vel velVar = this.f;
        if (velVar != null) {
            velVar.e(true, false, "首屏退出");
        }
        eel eelVar = this.l;
        if (!(eelVar == null || eelVar.T() == null)) {
            this.l.r0(TradeHybridTMSFragment.b.c.INSTANCE);
        }
        BehaviR.getInstance().commitLeave(ParallelBizValueHelper.c(p3()), null, this, hqv.c(UTAnalytics.getInstance().getDefaultTracker().getPageAllProperties(this)));
    }

    @Override // com.taobao.android.order.bundle.base.TBOrderBaseActivity, com.taobao.android.order.bundle.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        vel velVar = this.f;
        if (velVar != null) {
            velVar.f().put("on_resume_start", Long.valueOf(System.currentTimeMillis()));
        }
        this.t = false;
        if (vvo.k().l(getApplicationContext()) != null) {
            vvo.k().r(this.m);
        }
        if (this.p) {
            G4(true);
            Map<String, Object> map = this.x;
            if (map != null) {
                C4(map);
                this.x = null;
            } else {
                if (this.w) {
                    str = "FirstScreen";
                } else {
                    str = "NativeRefresh";
                }
                A4(str);
                this.p = false;
            }
        }
        tau.e(ParallelBizValueHelper.c(p3()), this);
        eel eelVar = this.l;
        if (eelVar != null) {
            eelVar.g1(this, false);
        }
        lor.c("TBOrderListActivity", "onResume", "页面在前台");
        OrderRecommendWrapper orderRecommendWrapper = this.u;
        if (orderRecommendWrapper != null) {
            orderRecommendWrapper.d();
        }
        BehaviR.getInstance().commitEnter(ParallelBizValueHelper.c(p3()), null, this, hqv.c(UTAnalytics.getInstance().getDefaultTracker().getPageAllProperties(this)));
        WeexInstance weexInstance = this.z;
        if (weexInstance != null) {
            weexInstance.onActivityResume();
        }
        eel eelVar2 = this.l;
        if (!(eelVar2 == null || eelVar2.T() == null)) {
            this.l.r0(TradeHybridTMSFragment.b.d.INSTANCE);
        }
        if (this.w && this.f != null) {
            z9v.u(this).a("d8", "tab", this.l.t());
            this.f.f().put("on_Resume_end_time", Long.valueOf(System.currentTimeMillis()));
            this.f.f().put("ol_async_task_start", Long.valueOf(getIntent().getLongExtra("olAsyncTaskStart", -1L)));
            this.f.f().put("ol_async_task_end", Long.valueOf(getIntent().getLongExtra("olAsyncTaskEnd", -1L)));
        }
        this.w = false;
        eel eelVar3 = this.l;
        if (eelVar3 != null) {
            eelVar3.u0();
        }
    }

    public final void q4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5290783d", new Object[]{this});
            return;
        }
        this.l.c0(getIntent());
        if (OrderType.ORDERLIST.getValue().equals(this.l.D()) || OrderType.MAOCHAO.getValue().equalsIgnoreCase(this.l.D())) {
            this.f.l(nrr.o());
            V2("isOLFirstScreen", Boolean.TRUE);
            this.l.n();
        } else {
            this.l.M0(exi.d());
        }
        if (this.l.f0()) {
            this.f.e(true, false, "其他页面");
        }
        this.l.a1(new ptg(this));
        ((ptg) this.l.W()).r(this.f);
        this.v = (otg) this.l.W();
    }

    public final void r4(OrderRecyclerView orderRecyclerView, String str, String str2) {
        String str3;
        OrderRecommendWrapper.RecType recType;
        String str4;
        String str5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ab92d9c", new Object[]{this, orderRecyclerView, str, str2});
        } else if (this.l.k0()) {
            R4();
        } else if ("true".equals(str)) {
            OrderRecommendWrapper orderRecommendWrapper = this.u;
            if (orderRecommendWrapper != null) {
                orderRecyclerView.removeEndView(orderRecommendWrapper.a());
            }
        } else {
            this.o.enableLoadMore(false);
            try {
                OrderRecommendWrapper orderRecommendWrapper2 = this.u;
                if (orderRecommendWrapper2 != null) {
                    orderRecyclerView.removeEndView(orderRecommendWrapper2.a());
                    this.u.b();
                    this.u = null;
                    orderRecyclerView.removeAllEndViews();
                }
                JSONObject jSONObject = new JSONObject();
                if (!TextUtils.isEmpty(this.l.I()) && TextUtils.equals(this.l.I(), this.l.O())) {
                    jSONObject.put("channelSrp", (Object) "gouhou_searchfg");
                }
                if (v9v.i("babelorder", "recommendInfoWithQueryWord", true) && !TextUtils.isEmpty(this.l.P())) {
                    if (!TextUtils.isEmpty(this.l.I()) && TextUtils.equals(this.l.O(), this.l.P())) {
                        if (TextUtils.isEmpty(this.l.I())) {
                            str5 = "";
                        } else {
                            str5 = this.l.I();
                        }
                        jSONObject.put(gel.PARAM_REC_QUERY, (Object) str5);
                    }
                    if (TextUtils.isEmpty(this.l.O())) {
                        str4 = "";
                    } else {
                        str4 = this.l.O();
                    }
                    jSONObject.put(gel.PARAM_REC_QUERY, (Object) str4);
                } else if (!TextUtils.isEmpty(this.l.I()) && TextUtils.equals(this.l.I(), this.l.O())) {
                    jSONObject.put(gel.PARAM_REC_QUERY, (Object) this.l.I());
                } else if (!TextUtils.isEmpty(this.l.O())) {
                    jSONObject.put(gel.PARAM_REC_QUERY, (Object) this.l.O());
                }
                org.json.JSONObject jSONObject2 = this.s;
                if (jSONObject2 != null) {
                    str3 = jSONObject2.optString("fromPageType");
                } else {
                    str3 = "";
                }
                if (this.l.c1()) {
                    recType = OrderRecommendWrapper.RecType.MAIN_SEARCH;
                } else {
                    recType = OrderRecommendWrapper.RecType.GUESS;
                }
                OrderRecommendWrapper orderRecommendWrapper3 = new OrderRecommendWrapper(orderRecyclerView, this, recType, str3, jSONObject);
                this.u = orderRecommendWrapper3;
                orderRecommendWrapper3.e();
                zw h2 = this.u.h();
                if ("true".equals(this.l.p()) && (h2 instanceof fdl)) {
                    ((fdl) h2).r("#FFFFFF");
                }
                if (this.s != null && D4()) {
                    jSONObject.putAll(JSON.parseObject(this.s.toString()));
                    this.u.g(jSONObject, str2);
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.taobao.android.order.bundle.base.TBOrderBaseActivity, com.taobao.android.order.bundle.base.BaseActivity
    public void s3(Bundle bundle) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be2ced03", new Object[]{this, bundle});
            return;
        }
        idl.f(OrderBizCode.orderList, 0.001f);
        dpj.g(this, getIntent());
        super.s3(bundle);
        if (HybridPreRenderHelper.i()) {
            AsyncInstanceLoadManager.INSTANCE.l();
        }
        eel d2 = ldl.INSTANCE.d();
        this.l = d2;
        if (d2 == null || !d2.Y()) {
            this.l = new eel(this);
        } else {
            this.l.z0(this);
        }
        this.l.K0(this.f);
        this.l.R0(bundle != null);
        setContentView(R.layout.activity_order_list);
        q4();
        vav.h(OrderConfigs.BizNameType.ORDER_LIST.getBizName(), this.e);
        if (this.l.f0()) {
            if (!TBRefundInstanceManager.isNetStart()) {
                TBRefundInstanceManager.startPreRequestOnIdle(this);
            }
            this.l.P0(new FrameLayout(this));
            if (HybridPreRenderHelper.i()) {
                AsyncInstanceLoadManager.INSTANCE.i(new e());
            } else {
                TBRefundInstanceManager.reportRumInRefundList(true, this.l.J());
                ViewGroup J = this.l.J();
                String L = this.l.L();
                String str2 = this.d;
                if (this.l.j0()) {
                    str = "other";
                } else {
                    str = this.l.y();
                }
                this.z = TBRefundInstanceManager.refundWeex2PreRender(this, J, L, new TBRefundInstanceManager.b(str2, str, false));
            }
        }
        t4();
        o4();
        p4();
        n4();
        this.l.d0();
        nl2.b(this, this.M);
        nl2.c(this);
        F4(true);
        fsw.i(CoreConstants.ORDER_VESSEL_WV_KEY, TBWebOrder.class, true);
        pav.k(new f());
        this.w = true;
        this.l.T0(bundle);
        eel eelVar = this.l;
        if (eelVar != null) {
            eelVar.s0(this, bundle);
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
        hav.d("TBOrderListActivity", "onLoadSuccess start");
        if (this.l.f0() && (tBSwipeRefreshLayout = this.o) != null) {
            tBSwipeRefreshLayout.enablePullRefresh(false);
        }
        this.l.D0(false);
        B4();
        try {
            OrderRecyclerView orderRecyclerView = (OrderRecyclerView) this.m.u().i(this.n);
            if (!(mtopResponse.getDataJsonObject() == null || mtopResponse.getDataJsonObject().optJSONObject("global") == null)) {
                org.json.JSONObject optJSONObject = mtopResponse.getDataJsonObject().optJSONObject("global");
                S4(optJSONObject);
                org.json.JSONObject optJSONObject2 = optJSONObject.optJSONObject("globalUtArgs");
                if (optJSONObject2 != null) {
                    Q4(optJSONObject2);
                }
                if (TextUtils.isEmpty(this.l.p())) {
                    if ("true".equals(optJSONObject.optString("isBought4"))) {
                        this.l.S0("true");
                        this.l.M().j().put("forceBoughtlist4", "true");
                        this.l.X().setBackgroundColor(Color.parseColor("#F3F6F8"));
                    } else {
                        this.l.S0("false");
                    }
                }
                org.json.JSONObject optJSONObject3 = mtopResponse.getDataJsonObject().optJSONObject("hierarchy");
                boolean isEmpty = optJSONObject3 != null ? true ^ TextUtils.isEmpty(optJSONObject3.optString("root")) : false;
                if (isEmpty) {
                    this.r = optJSONObject.optJSONObject("pageControl");
                }
                if (this.r != null) {
                    if (optJSONObject.optJSONObject("recommendData") != null) {
                        this.s = optJSONObject.optJSONObject("recommendData");
                    }
                    this.l.U0(optJSONObject, null);
                    r4(orderRecyclerView, this.r.optString("hasMore"), mtopResponse.getDataJsonObject().optString(TBSearchChiTuJSBridge.ABTEST));
                }
                org.json.JSONObject optJSONObject4 = optJSONObject.optJSONObject("tocDegradeInfo");
                if (optJSONObject4 != null) {
                    this.H = TextUtils.equals("true", optJSONObject4.optString("isCloseTradeItemDetailTimeout"));
                }
                if (orderRecyclerView != null) {
                    orderRecyclerView.resetScroll();
                }
                if (optJSONObject.optJSONObject("routeControl") != null) {
                    String optString = optJSONObject.optJSONObject("routeControl").optString("taoTmRoute");
                    if (!TextUtils.isEmpty(optString)) {
                        JSONObject parseObject = JSON.parseObject(this.l.M().j().get("condition"));
                        parseObject.put("taoTmRoute", (Object) optString);
                        this.l.M().j().put("condition", parseObject.toJSONString());
                    }
                }
                if (PageStatus.FIRST_PAGE.equals(pageStatus) && OrderType.ORDERLIST.getValue().equals(this.l.D())) {
                    org.json.JSONObject jSONObject = this.s;
                    nrr.e(this, this.l.t(), mtopResponse.getDataJsonObject(), jSONObject != null ? jSONObject.optString("orderIdsStr") : null, isEmpty);
                    this.l.q0(orderRecyclerView);
                    this.m.H(false);
                    e4(optJSONObject, this.l.B());
                    eel eelVar = this.l;
                    eelVar.m(eelVar.t(), optJSONObject);
                }
                if (uel.l("enableIdleLoadSuccessTask", false)) {
                    pav.g(new i(mtopResponse, orderRecyclerView, pageStatus));
                } else {
                    i4(mtopResponse, orderRecyclerView, pageStatus);
                }
                this.l.I0(null);
                this.l.J0(null);
                this.l.Z0(false);
                this.m.H(false);
                this.l.w0(pageStatus, optJSONObject);
                String optString2 = optJSONObject2.optString(CoreConstants.IN_PARAM_ORDER_SEARCH_ID_NEW);
                if (!TextUtils.isEmpty(optString2)) {
                    this.l.i1(optString2);
                }
                hav.d("TBOrderListActivity", "onLoadSuccess end");
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            m8v.a(e2);
        }
    }
}
