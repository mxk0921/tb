package com.taobao.android.order.bundle;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.ability.localization.Localization;
import com.alibaba.android.ultron.vfw.weex2.UltronWeex2DialogFragment;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridStage;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.utils.UltronTradeHybridSwitcherHelper;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.UemAnalysis;
import com.taobao.android.behavir.BehaviR;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.nav.Nav;
import com.taobao.android.order.bundle.base.TBOrderBaseActivity;
import com.taobao.android.order.bundle.base.parallelbiz.ParallelBizValueHelper;
import com.taobao.android.order.bundle.constants.CoreConstants;
import com.taobao.android.order.bundle.ultron.view.DetailBundleLineComponent;
import com.taobao.android.order.bundle.widget.AKVerticalGestureHandler;
import com.taobao.android.order.bundle.widget.CustomLinearSmoothScroller;
import com.taobao.android.order.bundle.widget.OffsetBodyWrapper;
import com.taobao.android.order.bundle.widget.TBOrderWeexScrollHelper;
import com.taobao.android.order.bundle.widget.recycle.OrderLinearLayoutManager;
import com.taobao.android.order.bundle.widget.recycle.OrderRecyclerView;
import com.taobao.android.order.bundle.widget.recycle.ScrollListener;
import com.taobao.android.order.constants.OrderBizCode;
import com.taobao.android.order.core.OrderConfigs;
import com.taobao.android.order.core.request.DataStatus;
import com.taobao.android.order.core.request.PageStatus;
import com.taobao.android.order.map.model.OrderMapBubbleModel;
import com.taobao.android.order.map.model.OrderMapLifeCycleModel;
import com.taobao.android.order.map.model.OrderMapStatusModel;
import com.taobao.android.preload.core.task.PreloadTaskEntity;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.taobao.uikit.extend.component.TBErrorView;
import com.taobao.uikit.extend.component.error.Error;
import com.ut.mini.UTAnalytics;
import com.ut.share.utils.Constants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.a4l;
import tb.acq;
import tb.ae2;
import tb.aid;
import tb.ar0;
import tb.bzb;
import tb.c2u;
import tb.c2v;
import tb.cw6;
import tb.d9x;
import tb.dbl;
import tb.dbv;
import tb.ddl;
import tb.dkv;
import tb.dpj;
import tb.drr;
import tb.exi;
import tb.f2u;
import tb.g4d;
import tb.gb0;
import tb.h15;
import tb.hav;
import tb.hl5;
import tb.hqv;
import tb.ib2;
import tb.icl;
import tb.idl;
import tb.jel;
import tb.jf3;
import tb.jjx;
import tb.jql;
import tb.juk;
import tb.jxt;
import tb.k6v;
import tb.kjf;
import tb.le7;
import tb.lor;
import tb.lrr;
import tb.mcl;
import tb.me7;
import tb.ncl;
import tb.nl2;
import tb.nrm;
import tb.o9l;
import tb.otn;
import tb.p6v;
import tb.pcl;
import tb.qbv;
import tb.r56;
import tb.rq7;
import tb.s6h;
import tb.scl;
import tb.skn;
import tb.t2o;
import tb.t8;
import tb.te2;
import tb.tnn;
import tb.u3o;
import tb.ua2;
import tb.v9v;
import tb.vcu;
import tb.vel;
import tb.vvo;
import tb.wbl;
import tb.wpg;
import tb.xbr;
import tb.ye7;
import tb.yv6;
import tb.z9v;
import tb.zk5;
import tb.zw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TBOrderDetailActivity extends TBOrderBaseActivity implements aid, bzb, g4d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public OffsetBodyWrapper A;
    public String B;
    public scl C;
    public String D;
    public String E;
    public String F;
    public String H;
    public boolean L;
    public TBOrderWeexScrollHelper N;
    public String P;
    public OrderRecyclerView l;
    public LinearLayout m;
    public LinearLayout n;
    public View o;
    public String u;
    public zw v;
    public u3o w;
    public boolean x;
    public ScrollListener y;
    public ViewGroup z;
    public String p = "";
    public String q = "";
    public String r = "";
    public boolean s = true;
    public boolean t = true;
    public boolean G = true;
    public boolean I = false;
    public boolean J = false;
    public boolean K = false;
    public final otn M = new otn();
    public HashMap<String, Object> O = null;
    public final BroadcastReceiver Q = new BroadcastReceiver() { // from class: com.taobao.android.order.bundle.TBOrderDetailActivity.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/TBOrderDetailActivity$1");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            try {
                if (intent.getBooleanExtra(gb0.INTENT_KEY_ORDER_DETAIL_NEED_REFRESH, false)) {
                    TBOrderDetailActivity.I3(TBOrderDetailActivity.this, true);
                }
                if (TBOrderDetailActivity.H3(TBOrderDetailActivity.this) && intent.getBooleanExtra(nl2.IMMEDIATELY_REFRESH, false)) {
                    TBOrderDetailActivity.J3(TBOrderDetailActivity.this, "EventRefresh");
                }
            } catch (Exception e) {
                idl.d(TBOrderDetailActivity.K3(TBOrderDetailActivity.this), "BroadcastException", e.getMessage());
            }
        }
    };
    public final BroadcastReceiver R = new BroadcastReceiver() { // from class: com.taobao.android.order.bundle.TBOrderDetailActivity.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/TBOrderDetailActivity$2");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent == null || !TextUtils.equals("com.alipay.android.app.pay.ACTION_PAY_SUCCESS", intent.getAction()) || context == null) {
                idl.c(idl.a.a(TBOrderDetailActivity.M3(TBOrderDetailActivity.this), "payResultOfDetail").sampling(1.0f).message("支付失败").success(false));
            } else {
                gb0.b(context.getApplicationContext(), false);
                gb0.c(context.getApplicationContext(), false);
                idl.c(idl.a.a(TBOrderDetailActivity.L3(TBOrderDetailActivity.this), "payResultOfDetail").sampling(0.1f).message("支付成功").success(true));
            }
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements juk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.juk
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f638eac", new Object[]{this});
            } else {
                te2.a(TBOrderDetailActivity.Q3(TBOrderDetailActivity.this), TBOrderDetailActivity.this.t1());
            }
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
            } else {
                TBOrderDetailActivity.this.q3().g(TBOrderDetailActivity.this);
            }
        }
    }

    static {
        t2o.a(713031688);
        t2o.a(614465609);
        t2o.a(297795640);
        t2o.a(297795646);
    }

    public static /* synthetic */ boolean H3(TBOrderDetailActivity tBOrderDetailActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64a958c7", new Object[]{tBOrderDetailActivity})).booleanValue();
        }
        return tBOrderDetailActivity.s;
    }

    public static /* synthetic */ boolean I3(TBOrderDetailActivity tBOrderDetailActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a56db377", new Object[]{tBOrderDetailActivity, new Boolean(z)})).booleanValue();
        }
        tBOrderDetailActivity.s = z;
        return z;
    }

    public static /* synthetic */ void J3(TBOrderDetailActivity tBOrderDetailActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87845dac", new Object[]{tBOrderDetailActivity, str});
        } else {
            tBOrderDetailActivity.d4(str);
        }
    }

    public static /* synthetic */ String K3(TBOrderDetailActivity tBOrderDetailActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9adc9ebf", new Object[]{tBOrderDetailActivity});
        }
        return tBOrderDetailActivity.o3();
    }

    public static /* synthetic */ String L3(TBOrderDetailActivity tBOrderDetailActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a2058100", new Object[]{tBOrderDetailActivity});
        }
        return tBOrderDetailActivity.o3();
    }

    public static /* synthetic */ String M3(TBOrderDetailActivity tBOrderDetailActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a92e6341", new Object[]{tBOrderDetailActivity});
        }
        return tBOrderDetailActivity.o3();
    }

    public static /* synthetic */ scl N3(TBOrderDetailActivity tBOrderDetailActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (scl) ipChange.ipc$dispatch("dec55cad", new Object[]{tBOrderDetailActivity});
        }
        return tBOrderDetailActivity.C;
    }

    public static /* synthetic */ ScrollListener O3(TBOrderDetailActivity tBOrderDetailActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScrollListener) ipChange.ipc$dispatch("f8bb9eff", new Object[]{tBOrderDetailActivity});
        }
        return tBOrderDetailActivity.y;
    }

    public static /* synthetic */ OrderRecyclerView P3(TBOrderDetailActivity tBOrderDetailActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OrderRecyclerView) ipChange.ipc$dispatch("d9b20d65", new Object[]{tBOrderDetailActivity});
        }
        return tBOrderDetailActivity.l;
    }

    public static /* synthetic */ com.alibaba.android.ultron.vfw.instance.a Q3(TBOrderDetailActivity tBOrderDetailActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.ultron.vfw.instance.a) ipChange.ipc$dispatch("9be93469", new Object[]{tBOrderDetailActivity});
        }
        return tBOrderDetailActivity.B3();
    }

    public static /* synthetic */ Object ipc$super(TBOrderDetailActivity tBOrderDetailActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1104351997:
                super.s3((Bundle) objArr[0]);
                return null;
            case 143326307:
                super.onBackPressed();
                return null;
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
            case 1667413429:
                super.t3();
                return null;
            case 1877256764:
                super.onCreate((Bundle) objArr[0], (PersistableBundle) objArr[1]);
                return null;
            case 2058746343:
                return new Boolean(super.dispatchGenericMotionEvent((MotionEvent) objArr[0]));
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/TBOrderDetailActivity");
        }
    }

    @Override // com.taobao.android.order.bundle.base.TBOrderBaseActivity
    public BroadcastReceiver A3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BroadcastReceiver) ipChange.ipc$dispatch("e449fead", new Object[]{this});
        }
        return this.R;
    }

    @Override // tb.bzb
    public void K1(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2f9f5dd", new Object[]{this, new Integer(i)});
            return;
        }
        OffsetBodyWrapper offsetBodyWrapper = this.A;
        if (offsetBodyWrapper != null) {
            offsetBodyWrapper.resetState(i);
        }
    }

    @Override // tb.g4d
    public void L1(OrderMapLifeCycleModel orderMapLifeCycleModel) {
        vel velVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edef9fb9", new Object[]{this, orderMapLifeCycleModel});
        } else if ("onMapLoaded".equals(orderMapLifeCycleModel.code) && (velVar = this.f) != null) {
            velVar.i();
        }
    }

    public final void R3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("561a0649", new Object[]{this});
            return;
        }
        boolean equals = "true".equals(jql.c(getIntent()));
        if (q3() == null) {
            return;
        }
        if (!cw6.b() || !equals) {
            q3().o(tnn.COMPONENT_TAG, tnn.CREATOR);
        }
    }

    @Override // tb.pqb
    public void U1(JSONObject jSONObject, DataStatus dataStatus, PageStatus pageStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48a82554", new Object[]{this, jSONObject, dataStatus, pageStatus});
        } else {
            h2(null, dataStatus, pageStatus);
        }
    }

    @Override // tb.g4d
    public View V0(Context context, OrderMapBubbleModel orderMapBubbleModel, DXRuntimeContext dXRuntimeContext, icl iclVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("46bb1c8d", new Object[]{this, context, orderMapBubbleModel, dXRuntimeContext, iclVar});
        }
        com.alibaba.android.ultron.vfw.instance.a B3 = B3();
        if (B3 == null) {
            return null;
        }
        return jel.b(context, orderMapBubbleModel, B3.A().b(), iclVar);
    }

    public final void V3(MtopResponse mtopResponse, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("123fedeb", new Object[]{this, mtopResponse, str});
            return;
        }
        lor.c("TBOrderDetailActivity", "handleMtopResponseByH5", "DownGradeTOH5Detail downGrade = " + str);
        dpj.a(this, this.p, str);
        overridePendingTransition(0, 0);
        finish();
    }

    public final void W3(String str, String str2, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee44d207", new Object[]{this, str, str2, mtopResponse});
            return;
        }
        lor.c("TBOrderDetailActivity", "handleMtopResponseByUrl", "DownGradeByUrl downGrade = " + str2);
        Nav.from(this).toUri(str);
        overridePendingTransition(0, 0);
        finish();
    }

    @Override // tb.pqb
    public void X(String str, MtopResponse mtopResponse, DataStatus dataStatus, PageStatus pageStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc8b03e2", new Object[]{this, str, mtopResponse, dataStatus, pageStatus});
        } else if (mtopResponse != null) {
            if (mtopResponse.isApiSuccess()) {
                if (dbl.d()) {
                    V3(mtopResponse, "ReturnH5");
                } else {
                    U3(mtopResponse, CoreConstants.DOWNGRADLE_V2TOV1);
                }
            } else if (mtopResponse.isMtopServerError() || mtopResponse.isMtopSdkError() || mtopResponse.isSessionInvalid()) {
                if (o9l.c()) {
                    h4(mtopResponse);
                    q3().f(exi.a(), null);
                    z3();
                    k4();
                    return;
                }
                U3(mtopResponse, mtopResponse.getRetCode());
            } else if ("ReturnH5".equals(mtopResponse.getRetCode())) {
                V3(mtopResponse, mtopResponse.getRetCode());
            } else if (ncl.CODE_REDIRECT_302.equals(mtopResponse.getRetCode())) {
                org.json.JSONObject dataJsonObject = mtopResponse.getDataJsonObject();
                String optString = dataJsonObject != null ? dataJsonObject.optString(Constants.WEIBO_REDIRECTURL_KEY) : null;
                if (!TextUtils.isEmpty(optString)) {
                    W3(optString, mtopResponse.getRetCode(), mtopResponse);
                    return;
                }
                h4(mtopResponse);
                q3().f(exi.a(), null);
                z3();
                k4();
            }
        }
    }

    public void X3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb3ae8d", new Object[]{this});
            return;
        }
        if (this.o == null) {
            this.o = findViewById(R.id.net_error_view);
        }
        this.o.setVisibility(8);
        this.l.setVisibility(0);
    }

    public final void Y3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("871b8e20", new Object[]{this});
            return;
        }
        this.C = new scl(this.A, this.l);
        this.y = new ScrollListener(q3(), this.l);
        q3().k(ib2.BINDINGXSCROLLANIMINIT, new ib2.b(this.y));
        this.C.l(this.y);
        this.C.k(new AKVerticalGestureHandler(new lrr(this), new t8(), false, this));
        this.A.setBusiness(this.C);
    }

    public final void Z3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5290783d", new Object[]{this});
            return;
        }
        String g = jql.g(getIntent());
        this.p = g;
        if (TextUtils.isEmpty(g)) {
            finish();
        }
        this.r = jql.f(getIntent());
        this.u = UemAnalysis.getTraceId();
        this.B = jql.l(getIntent(), CoreConstants.IN_PARAMS_VIEW_LOGISTICS);
        this.F = jql.l(getIntent(), "pageFrom");
        this.D = jql.l(getIntent(), CoreConstants.IN_PARAMS_ORDER_CODE);
        this.E = jql.l(getIntent(), CoreConstants.IN_PARAMS_SELECT_INDEX);
        this.H = jql.l(getIntent(), CoreConstants.IN_PARAMS_SCROLL_COMPONENT_KEY);
        this.P = jql.l(getIntent(), UltronWeex2DialogFragment.BROADCAST_ULTRON_HYBRID_DIALOG_DOWNGRADE_PAGE);
    }

    public final void a4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        C3(4473924);
        this.l = (OrderRecyclerView) findViewById(R.id.recycler_view);
        OrderLinearLayoutManager orderLinearLayoutManager = new OrderLinearLayoutManager(this) { // from class: com.taobao.android.order.bundle.TBOrderDetailActivity.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str, Object... objArr) {
                if (str.hashCode() == -579854207) {
                    super.onLayoutCompleted((RecyclerView.State) objArr[0]);
                    return null;
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/TBOrderDetailActivity$3");
            }

            @Override // com.taobao.android.order.bundle.widget.recycle.OrderLinearLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public void onLayoutCompleted(RecyclerView.State state) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("dd702081", new Object[]{this, state});
                    return;
                }
                super.onLayoutCompleted(state);
                if (state.getItemCount() > 0) {
                    z9v.u(TBOrderDetailActivity.this).B("apmClientLayoutComplete", false, null);
                }
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a873752a", new Object[]{this, recyclerView, state, new Integer(i)});
                    return;
                }
                CustomLinearSmoothScroller customLinearSmoothScroller = new CustomLinearSmoothScroller(recyclerView.getContext());
                customLinearSmoothScroller.setTargetPosition(i);
                startSmoothScroll(customLinearSmoothScroller);
            }
        };
        orderLinearLayoutManager.A(this.f);
        OrderRecyclerView orderRecyclerView = this.l;
        orderRecyclerView.setLayoutManager(orderLinearLayoutManager.y(orderRecyclerView));
        this.l.bizType = OrderConfigs.BizNameType.ORDER_DETAIL;
        this.m = (LinearLayout) findViewById(R.id.top_layout);
        this.n = (LinearLayout) findViewById(R.id.bottom_layout);
        this.o = findViewById(R.id.net_error_view);
        this.z = (ViewGroup) findViewById(R.id.background_container);
        this.A = (OffsetBodyWrapper) findViewById(R.id.body_wrapper);
        View findViewById = findViewById(R.id.mask_layout);
        drr drrVar = new drr(this);
        if (findViewById instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) findViewById;
            viewGroup.removeAllViews();
            drrVar.c(viewGroup).a();
        }
        updateSkeleton(drrVar.d());
        xbr xbrVar = new xbr(this);
        View view = this.o;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).removeAllViews();
            xbrVar.c((ViewGroup) this.o).a();
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

    public final boolean c4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2da952b", new Object[]{this})).booleanValue();
        }
        if (p3() == ParallelBizValueHelper.PageType.logistics_detail) {
            return true;
        }
        return false;
    }

    public final void d4(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dbd1c41", new Object[]{this, str});
            return;
        }
        hav.d("TBOrderDetailActivity", str);
        if (q3() != null) {
            F3();
            q3().g(this);
            this.s = false;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ab5f9e7", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!dbl.n()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        try {
            return super.dispatchGenericMotionEvent(motionEvent);
        } catch (Throwable unused) {
            return false;
        }
    }

    public void e4(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c662229b", new Object[]{this, jSONObject});
            return;
        }
        u3o u3oVar = this.w;
        if (u3oVar != null && u3oVar.j() != null && jSONObject != null) {
            try {
                String str = this.w.j().get("extParams");
                if (!TextUtils.isEmpty(str)) {
                    JSONObject parseObject = JSON.parseObject(str);
                    for (String str2 : jSONObject.keySet()) {
                        parseObject.put(str2, jSONObject.get(str2));
                    }
                    this.w.j().put("extParams", parseObject.toJSONString());
                } else {
                    this.w.j().put("extParams", jSONObject.toJSONString());
                }
                q3().p();
                d4("ReloadWithParams");
            } catch (Throwable unused) {
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
        try {
            wpg.c(getIntent(), this);
        } catch (Exception e) {
            idl.d(o3(), "OrderDetail#LinkBackXException", e.getMessage());
        }
        if (!this.K && this.J) {
            this.M.e(this);
        }
        super.finish();
        zw zwVar = this.v;
        if (zwVar != null) {
            zwVar.b();
        }
        OffsetBodyWrapper offsetBodyWrapper = this.A;
        if (offsetBodyWrapper != null) {
            offsetBodyWrapper.release();
        }
        this.K = false;
        this.J = false;
        lor.c("TBOrderDetailActivity", "finish", new String[0]);
    }

    public void g4(zw zwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("396d7a03", new Object[]{this, zwVar});
        } else {
            this.v = zwVar;
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

    @Override // tb.pqb
    public void h2(MtopResponse mtopResponse, DataStatus dataStatus, PageStatus pageStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("329d6593", new Object[]{this, mtopResponse, dataStatus, pageStatus});
            return;
        }
        i4(mtopResponse);
        z3();
        k4();
        l4(mtopResponse);
        HashMap hashMap = new HashMap();
        hashMap.put("orderId", this.p);
        c2v.getInstance().updatePageProperties(hashMap);
        if (!(mtopResponse == null || mtopResponse.getDataJsonObject() == null)) {
            this.A.initBodyWrapper(mtopResponse.getDataJsonObject().optJSONObject("global"));
        }
        if (!TextUtils.isEmpty(this.H) && q3() != null) {
            q3().q(this.H);
        }
        X3();
        this.M.f(mtopResponse);
    }

    @Override // tb.g4d
    public void j1(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf424d78", new Object[]{this, str, obj});
            return;
        }
        if (this.O == null) {
            this.O = new HashMap<>();
        }
        this.O.put(str, obj);
    }

    public void j4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31e3cc05", new Object[]{this});
        } else {
            this.A.updateBodyOffset();
        }
    }

    public final void k4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f5be1ff", new Object[]{this});
        } else if (this.G) {
            this.G = false;
            this.k = new s6h(this);
            View findViewById = findViewById(R.id.mask_layout);
            if (findViewById instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) findViewById;
                viewGroup.removeAllViews();
                this.k.c(viewGroup).a();
            }
            View d = this.k.d();
            if (d != null) {
                d.setVisibility(8);
            }
        }
    }

    public final void l4(MtopResponse mtopResponse) {
        org.json.JSONObject optJSONObject;
        org.json.JSONObject optJSONObject2;
        org.json.JSONObject optJSONObject3;
        org.json.JSONObject optJSONObject4;
        org.json.JSONObject optJSONObject5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87ea7da3", new Object[]{this, mtopResponse});
        } else if (mtopResponse != null) {
            try {
                if (mtopResponse.getDataJsonObject() != null && (optJSONObject = mtopResponse.getDataJsonObject().optJSONObject("global")) != null && (optJSONObject2 = optJSONObject.optJSONObject("events")) != null && (optJSONObject3 = optJSONObject2.optJSONObject("utExplosure")) != null && (optJSONObject4 = optJSONObject3.optJSONObject("fields")) != null && (optJSONObject5 = optJSONObject4.optJSONObject("args")) != null) {
                    this.q = optJSONObject5.optString("orderStatus");
                    hav.g("TBOrderDetailActivity", "updateOrderStatus:", "orderStatus = " + this.q);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @Override // com.taobao.android.order.bundle.base.BaseActivity
    public com.taobao.android.order.core.a n3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.order.core.a) ipChange.ipc$dispatch("81c72e58", new Object[]{this});
        }
        this.w = S3();
        return com.taobao.android.order.core.a.a(new OrderConfigs.b(this).H(this.w).v(this.m, this.l, this.n, this.z).x(OrderConfigs.BizNameType.ORDER_DETAIL).N(this.u).L(this.f).A(new ye7(this)).z(new me7()).y());
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (i == 1001 && c2u.a(this)) {
            String t1 = t1();
            ParallelBizValueHelper.PageType p3 = p3();
            com.taobao.android.order.bundle.base.parallelbiz.a.b(p3, t1 + "_Click_Enable_Notification", null);
        }
        if (q3() != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("requestCode", (Object) Integer.valueOf(i));
            q3().j("action_orderdetail_onpageback", jSONObject);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
            return;
        }
        this.K = true;
        this.M.e(this);
        super.onBackPressed();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle, PersistableBundle persistableBundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe4aa3c", new Object[]{this, bundle, persistableBundle});
            return;
        }
        super.onCreate(bundle, persistableBundle);
        hav.d("TBOrderDetailActivity", "onCreate");
    }

    @Override // com.taobao.android.order.bundle.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        hav.d("TBOrderDetailActivity", "onStart");
        TBOrderWeexScrollHelper tBOrderWeexScrollHelper = this.N;
        if (tBOrderWeexScrollHelper != null) {
            tBOrderWeexScrollHelper.k(Lifecycle.Event.ON_START);
        }
    }

    @Override // com.taobao.android.order.bundle.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        hav.d("TBOrderDetailActivity", "onStop");
        TBOrderWeexScrollHelper tBOrderWeexScrollHelper = this.N;
        if (tBOrderWeexScrollHelper != null) {
            tBOrderWeexScrollHelper.k(Lifecycle.Event.ON_STOP);
        }
    }

    @Override // tb.aid
    public void p2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9ce3764", new Object[]{this, new Boolean(z)});
        } else {
            this.J = z;
        }
    }

    @Override // com.taobao.uikit.actionbar.ITBPublicMenu
    public Bundle pageUserInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("65615653", new Object[]{this});
        }
        return jjx.a(this, this.p);
    }

    @Override // com.taobao.android.order.bundle.base.TBOrderBaseActivity, com.taobao.android.order.bundle.base.BaseActivity
    public void t3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6362b5b5", new Object[]{this});
            return;
        }
        super.t3();
        Y3();
    }

    @Override // tb.g4d
    public Object u0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("cde98e9", new Object[]{this, str});
        }
        HashMap<String, Object> hashMap = this.O;
        if (hashMap == null) {
            return null;
        }
        return hashMap.get(str);
    }

    public void updateSkeleton(View view) {
        ImageView imageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b0a7f5", new Object[]{this, view});
            return;
        }
        if (view == null) {
            imageView = null;
        } else {
            imageView = (ImageView) view.findViewById(R.id.skeleton_iv);
        }
        int i = f2u.g(this).heightPixels;
        int i2 = f2u.g(this).widthPixels;
        if (imageView == null || !c4()) {
            Bitmap d = f2u.d(getResources(), R.drawable.babel_order_detail_loading, i2, i);
            if (imageView != null && d != null) {
                imageView.setImageBitmap(d);
                return;
            }
            return;
        }
        Bitmap d2 = f2u.d(getResources(), R.drawable.babel_order_logistic_loading, i2, i);
        if (d2 != null) {
            imageView.setImageBitmap(d2);
        }
    }

    @Override // tb.g4d
    public List<OrderMapBubbleModel> v2(Context context, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2adb0256", new Object[]{this, context, dXRuntimeContext});
        }
        com.alibaba.android.ultron.vfw.instance.a B3 = B3();
        if (B3 == null) {
            return null;
        }
        return jel.a(B3.w());
    }

    @Override // com.taobao.android.order.bundle.base.BaseActivity
    public void w3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48d708ff", new Object[]{this});
            return;
        }
        com.taobao.android.order.core.a q3 = q3();
        q3.o(jf3.COMPONENT_TAG, jf3.CREATOR);
        q3.o(DetailBundleLineComponent.COMPONENT_TAG, le7.CREATOR);
        if (!c4()) {
            R3();
        }
        q3.n(skn.SUBSCRIBER_ID, new skn());
        q3.n(ar0.SUBSCRIBER_ID, new ar0());
        q3.n(ua2.SUBSCRIBER_ID, new ua2());
        q3.k("ultronAlipayBindV2", new k6v.a(B3(), ua2.SUBSCRIBER_ID));
        q3.k("ultronReallyPayV2", new k6v.a(B3(), skn.SUBSCRIBER_ID));
        q3.k("ultronAliPayV2", new k6v.a(B3(), ar0.SUBSCRIBER_ID));
        q3.l(Long.valueOf((long) zk5.DX_PARSER_GET_FESTIVAL), new zk5());
        q3.l(Long.valueOf((long) hl5.DX_PARSER_GET_STATUS_BAR_HEIGHT), new hl5());
        q3.m(Long.valueOf((long) r56.DXNAVIBARMOREVIEW_NAVIBARMOREVIEW), new r56());
        DXWidgetNode dXWidgetNode = (DXWidgetNode) mcl.b("com.taobao.android.order.bundle.dinamicX.view.DXBabelAMapViewWidgetNode");
        if (dXWidgetNode != null) {
            q3.m(2720428826385695965L, dXWidgetNode);
        }
        DXWidgetNode dXWidgetNode2 = (DXWidgetNode) mcl.b("com.taobao.android.order.map.common.dx.DXBabelAMapViewV4WidgetNode");
        if (dXWidgetNode2 != null) {
            q3.m(3824218203085984617L, dXWidgetNode2);
        }
        q3.k(dkv.UPDATEMAPAREAHEIGHT, new dkv.a());
        q3.k(nrm.PRELOADGOODSDETAIL, new nrm.b());
        q3.k(rq7.KEY, new rq7.a());
        q3.k(a4l.OPENNOTIFICATIONSETTING, new a4l.a());
        q3.k(p6v.ULTRONBUYNOW, new p6v.b());
        q3.k(vcu.TRADEONSTAGE, new vcu.a());
    }

    @Override // tb.g4d
    public void y(OrderMapStatusModel orderMapStatusModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acad4fff", new Object[]{this, orderMapStatusModel});
        } else {
            d4("Reload");
        }
    }

    public u3o S3() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u3o) ipChange.ipc$dispatch("38f46215", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("bizOrderId", this.p);
        if (cw6.b()) {
            jql.r(hashMap, getIntent());
            hashMap.put(CoreConstants.USE_V2, "true");
        }
        if (!TextUtils.isEmpty(this.F)) {
            hashMap.put("pageFrom", this.F);
        }
        hashMap.put(CoreConstants.IN_PARAM_ARCHIVE, String.valueOf(b4()));
        hashMap.put("appName", pcl.a());
        hashMap.put("appVersion", pcl.b());
        hashMap.put("extParams", T3());
        hashMap.putAll(jql.d(getIntent()));
        u3o v = new u3o(this).a(dbl.z()).I("1.0").G("UNIT_TRADE").v(Boolean.parseBoolean(this.B));
        if (c4()) {
            str = "logisticDetail";
        } else {
            str = ae2.BizKeyOrderDetail;
        }
        return v.b(str).B(true).A(hashMap);
    }

    public final void U3(MtopResponse mtopResponse, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69317ac7", new Object[]{this, mtopResponse, str});
            return;
        }
        dpj.c(this, this.p, "true", str);
        overridePendingTransition(0, 0);
        finish();
    }

    public final void f4() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a1d929", new Object[]{this});
            return;
        }
        try {
            if (c4()) {
                if (!(getIntent() == null || getIntent().getData() == null || TextUtils.isEmpty(getIntent().getData().toString()))) {
                    String uri = getIntent().getData().toString();
                    String l = jql.l(getIntent(), PreloadTaskEntity.SOURCE_FROM);
                    String l2 = jql.l(getIntent(), "downgrade2native");
                    h15 indicator = idl.a.a(OrderBizCode.logisticsDetail, "nativeLogisticsDetailPV").sampling(v9v.d(UltronTradeHybridSwitcherHelper.ORANGE_KEY_LOGISTICS_DETAIL, "nativeLogisticsDetailPVSampling", 0.01f)).indicator("c1", uri);
                    idl.c(indicator.message("sourceFrom: " + l + ", downgrade2native: " + l2).success(true));
                    return;
                }
                return;
            }
            String c = ParallelBizValueHelper.c(ParallelBizValueHelper.PageType.order_detail);
            h15 sampling = idl.a.a(OrderBizCode.orderDetail, "nativeOrderDetailPV").sampling(v9v.d(wbl.NEW_BABEL_ORDER, "nativeOrderDetailPVSampling", 1.0E-5f));
            if (TextUtils.isEmpty(this.p)) {
                str = "unknown";
            } else {
                str = this.p;
            }
            h15 indicator2 = sampling.indicator("c1", str);
            String str2 = this.q;
            idl.c(indicator2.message("pageName: " + c + ", orderStatus: " + str2).success(true));
        } catch (Throwable unused) {
        }
    }

    public final void i4(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70685b86", new Object[]{this, mtopResponse});
        } else if (c4()) {
            if (mtopResponse == null || mtopResponse.getDataJsonObject() == null || mtopResponse.getDataJsonObject().optJSONObject("data") == null || !mtopResponse.getDataJsonObject().optJSONObject("data").has("weexInfoFlow")) {
                R3();
                return;
            }
            TBOrderWeexScrollHelper tBOrderWeexScrollHelper = this.N;
            if (tBOrderWeexScrollHelper != null) {
                tBOrderWeexScrollHelper.p(false);
            }
            if (this.l != null) {
                this.N = new TBOrderWeexScrollHelper(this.A, this.l);
            }
        }
    }

    public final void m4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65c7fd52", new Object[]{this});
        } else if (TextUtils.isEmpty(this.p)) {
            idl.c(idl.a.a(OrderBizCode.orderDetail, "odetail2UTReport").sampling(0.01f).message("orderId丢失").success(false));
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("newOrderId", this.p);
            hashMap.put("olVersion", "2");
            boolean c4 = c4();
            if (!TextUtils.isEmpty(this.q)) {
                hashMap.put("orderStatus", this.q);
            } else {
                h15 sampling = idl.a.a(OrderBizCode.orderDetail, "odetail2UTReport").sampling(0.01f);
                idl.c(sampling.message("orderStatus丢失，是否为物流详情页 - " + c4).success(false));
            }
            if (c4) {
                hashMap.put("spm-cnt", ParallelBizValueHelper.d(ParallelBizValueHelper.PageType.logistics_detail));
            } else {
                Map<String, String> pageProperties = UTAnalytics.getInstance().getDefaultTracker().getPageProperties(this);
                if (pageProperties == null || pageProperties.isEmpty() || !pageProperties.containsKey("spm-cnt")) {
                    hashMap.put("spm-cnt", ParallelBizValueHelper.d(ParallelBizValueHelper.PageType.order_detail));
                }
            }
            com.taobao.android.order.bundle.base.parallelbiz.a.e(this, hashMap);
        }
    }

    @Override // com.taobao.android.order.bundle.base.TBOrderBaseActivity, com.taobao.android.order.bundle.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        hav.d("TBOrderDetailActivity", "onDestroy");
        BroadcastReceiver broadcastReceiver = this.Q;
        if (broadcastReceiver != null) {
            nl2.h(this, broadcastReceiver);
        }
        ddl.e();
        TBOrderWeexScrollHelper tBOrderWeexScrollHelper = this.N;
        if (tBOrderWeexScrollHelper != null) {
            tBOrderWeexScrollHelper.p(true);
        }
        qbv.j().d(ae2.BizKeyOrderDetail);
        qbv.j().a(UltronTradeHybridStage.ON_CONTAINER_DESTROY, ae2.BizKeyOrderDetail, null);
        if (UltronTradeHybridSwitcherHelper.e("waitPay", "")) {
            qbv.j().a(UltronTradeHybridStage.ON_CONTAINER_DESTROY, "waitPay", null);
        }
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
        hav.d("TBOrderDetailActivity", "onPause");
        BehaviR.getInstance().commitLeave(ParallelBizValueHelper.c(ParallelBizValueHelper.PageType.order_detail), null, this, hqv.c(UTAnalytics.getInstance().getDefaultTracker().getPageAllProperties(this)));
        if (!this.L) {
            this.L = true;
            jxt.d(this, this.p, this.l);
        }
        TBOrderWeexScrollHelper tBOrderWeexScrollHelper = this.N;
        if (tBOrderWeexScrollHelper != null) {
            tBOrderWeexScrollHelper.k(Lifecycle.Event.ON_PAUSE);
        }
        vvo.k().s(t1());
    }

    @Override // com.taobao.android.order.bundle.base.TBOrderBaseActivity, com.taobao.android.order.bundle.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        vel velVar;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        hav.d("TBOrderDetailActivity", "onResume begin");
        this.t = false;
        if (this.s) {
            if (this.x) {
                str = "FirstScreen";
            } else {
                str = "Reload";
            }
            d4(str);
            this.s = false;
        }
        m4();
        com.taobao.android.order.bundle.base.parallelbiz.a.d(this, p3());
        BehaviR.getInstance().commitEnter(ParallelBizValueHelper.c(ParallelBizValueHelper.PageType.order_detail), null, this, hqv.c(UTAnalytics.getInstance().getDefaultTracker().getPageAllProperties(this)));
        zw zwVar = this.v;
        if (zwVar != null) {
            zwVar.d();
        }
        f2u.e(this.l);
        TBOrderWeexScrollHelper tBOrderWeexScrollHelper = this.N;
        if (tBOrderWeexScrollHelper != null) {
            tBOrderWeexScrollHelper.k(Lifecycle.Event.ON_RESUME);
        }
        vvo.k().p(t1(), new a());
        hav.d("TBOrderDetailActivity", "onResume end");
        if (this.x && (velVar = this.f) != null) {
            velVar.f().put("on_Resume_end_time", Long.valueOf(System.currentTimeMillis()));
        }
        this.x = false;
        if (UltronTradeHybridSwitcherHelper.c() && (TextUtils.equals(this.P, ParallelBizValueHelper.c(ParallelBizValueHelper.PageType.logistics_detail)) || TextUtils.equals(this.P, dbv.BIZ_ORDER_DETAIL))) {
            LocalBroadcastManager.getInstance(this).sendBroadcast(new Intent(UltronWeex2DialogFragment.BROADCAST_ULTRON_HYBRID_DIALOG_DOWNGRADE_ACTION));
        }
        d9x.e();
        f4();
    }

    @Override // tb.pqb
    public void B1(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f4f8313", new Object[]{this, jSONObject});
            return;
        }
        if (jSONObject != null && "true".equals(jSONObject.getString("delayRefresh"))) {
            this.s = true;
        } else if (this.t) {
            this.s = true;
        } else {
            d4("Reload");
        }
        gb0.d(this, false);
    }

    public final String T3() {
        String str;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aab0fd27", new Object[]{this});
        }
        Object a2 = mcl.a("com.taobao.android.order.bundle.dinamicX.view.amap.utils.LogisticDetailDataUtil", "isDegradeMap", this.B, String.class);
        boolean z2 = !(a2 instanceof Boolean) || ((Boolean) a2).booleanValue();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isLogisticDetail", (Object) this.B);
            if (z2 || !this.I) {
                z = true;
            }
            idl.a a3 = idl.a.a(o3(), "OrderMapLoadFailed");
            if (!z) {
                str = "加载成功";
            } else if (!this.I) {
                str = "远程模块加载失败导致降级";
            } else if (z2) {
                str = "客户端降级开关导致降级";
            } else {
                str = "降级";
            }
            idl.c(a3.tag(str).sampling(z ? 0.05f : 0.001f).success(true ^ z));
            jSONObject.put("isDegradeMap", (Object) Boolean.valueOf(z));
            JSONObject jSONObject2 = new JSONObject();
            if (!TextUtils.isEmpty(this.D)) {
                jSONObject2.put(CoreConstants.IN_PARAMS_ORDER_CODE, (Object) this.D);
            }
            if (!TextUtils.isEmpty(this.E)) {
                jSONObject2.put(CoreConstants.IN_PARAMS_SELECT_INDEX, (Object) this.E);
            }
            if (!jSONObject2.isEmpty()) {
                jSONObject.put("logistic", (Object) jSONObject2.toJSONString());
            }
            String l = jql.l(getIntent(), "exParams");
            if (!TextUtils.isEmpty(l)) {
                jSONObject.putAll(JSON.parseObject(l));
            }
            if (kjf.a()) {
                jSONObject.put("inner", (Object) "1");
            }
            return jSONObject.toJSONString();
        } catch (Throwable unused) {
            return "{\"isLogisticDetail\":\"" + this.B + "\",\"isDegradeMap\":\"" + z2 + "\",\"logistic\":{\"orderCode\":\"" + this.D + "\",\"selectIndex\":\"" + this.E + "\"}}";
        }
    }

    public final boolean b4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eab0d0c3", new Object[]{this})).booleanValue();
        }
        return "1".equals(this.r) || "true".equalsIgnoreCase(this.r);
    }

    public void h4(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c27764fd", new Object[]{this, mtopResponse});
            return;
        }
        this.o.setVisibility(0);
        this.l.setVisibility(8);
        TBErrorView tBErrorView = (TBErrorView) this.o.findViewById(R.id.tb_order_error_view);
        if (tBErrorView != null) {
            if (v9v.i("babelorder", "enableSetTopic", true)) {
                if (c4()) {
                    tBErrorView.setTopic("logistic_detail");
                } else {
                    tBErrorView.setTopic("order_detail");
                }
            }
            tBErrorView.setButton(TBErrorView.ButtonType.BUTTON_LEFT, Localization.q(R.string.order_biz_refresh), new b());
            if (mtopResponse != null) {
                tBErrorView.setError(Error.Factory.fromMtopResponse(mtopResponse.getResponseCode(), mtopResponse.getMappingCode(), mtopResponse.getRetCode(), mtopResponse.getRetMsg()));
            }
        }
    }

    @Override // com.taobao.android.order.bundle.base.TBOrderBaseActivity, com.taobao.android.order.bundle.base.BaseActivity
    public void s3(Bundle bundle) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be2ced03", new Object[]{this, bundle});
            return;
        }
        super.s3(bundle);
        hav.d("TBOrderDetailActivity", "onActivityCreate begin");
        setContentView(R.layout.activity_order_detail);
        Z3();
        a4();
        nl2.b(this, this.Q);
        this.x = true;
        if (!yv6.a() && !ddl.d()) {
            z = false;
        }
        this.I = z;
        String o3 = o3();
        if (!this.I) {
            hav.b(ncl.f24644a, "OrderAmapRemoteLoadErr", "地图远程模块加载失败");
        }
        this.K = false;
        idl.f(o3, 0.001f);
        hav.d("TBOrderDetailActivity", "onActivityCreate end");
    }
}
