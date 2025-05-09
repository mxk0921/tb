package com.taobao.taolive.room.ui.growth;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import tb.ama;
import tb.b0d;
import tb.c4o;
import tb.fkx;
import tb.ggv;
import tb.iw0;
import tb.s3c;
import tb.sjr;
import tb.t2o;
import tb.ua1;
import tb.ux9;
import tb.uyg;
import tb.v2s;
import tb.w36;
import tb.yh6;
import tb.yqq;
import tb.zvq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class GrowthFrame extends BaseFrame implements s3c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ORANGE_TAOLIVE_GROUP = "tblive";
    private static final String ORANGE_WATCH_DURATION_TRIGGER_SUBSCRIBE = "watchDurationTriggerSubscribe";
    private static final String TAG = "SubscribeFrame";
    private FrameLayout container;
    private final Handler mHandler = new Handler();
    private Runnable queryGrowthRunnable = null;
    private final zvq mSubscribeSuccessListener = new zvq();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final String f13242a;
        private final String b;
        private final String c;
        private final ux9 d;
        private final b0d e = new a();

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public class a implements b0d {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // tb.b0d
            public void onError(int i, NetResponse netResponse, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                }
            }

            @Override // tb.b0d
            public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                    return;
                }
                try {
                    FrameLayout access$000 = GrowthFrame.access$000(GrowthFrame.this);
                    Context context = access$000.getContext();
                    if (context != null) {
                        b.a(b.this, netResponse.getDataJsonObject().toString(), context, access$000);
                    }
                } catch (Throwable th) {
                    Log.e(GrowthFrame.TAG, th.toString());
                }
            }

            @Override // tb.b0d
            public void onSystemError(int i, NetResponse netResponse, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                }
            }
        }

        static {
            t2o.a(779093266);
        }

        private b(String str, String str2, String str3, ux9 ux9Var) {
            this.f13242a = str;
            this.b = str2;
            this.c = str3;
            this.d = ux9Var;
        }

        public static /* synthetic */ void a(b bVar, String str, Context context, FrameLayout frameLayout) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("32ef2f3", new Object[]{bVar, str, context, frameLayout});
            } else {
                bVar.b(str, context, frameLayout);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                new ama(this.e).K(this.f13242a, this.b);
            }
        }

        private void b(String str, Context context, FrameLayout frameLayout) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("54f5dd47", new Object[]{this, str, context, frameLayout});
                return;
            }
            JSONObject d = fkx.d(str);
            JSONObject jSONObject = d.getJSONObject(c4o.KEY_DATA_SOURCE);
            d.put("liveId", (Object) this.f13242a);
            d.put("accountId", (Object) this.c);
            if (frameLayout != null && jSONObject != null && jSONObject.getBoolean("showPanel") != null && jSONObject.getBoolean("showPanel").booleanValue()) {
                if (frameLayout.getChildAt(0) == null || !(frameLayout.getChildAt(0) instanceof DXRootView)) {
                    DXRootView a2 = w36.k().a(context, d.getString(yh6.CONFIG_KEY_TEMPLATE_NAME));
                    w36.k().h(a2, d);
                    frameLayout.addView(a2);
                    GrowthFrame.access$200(GrowthFrame.this).c(a2);
                    frameLayout.setPadding(0, 0, 0, iw0.a(context, 8.0f));
                } else {
                    w36.k().h((DXRootView) frameLayout.getChildAt(0), d);
                }
                ua1.c(this.d, GrowthFrame.access$300(GrowthFrame.this, jSONObject));
                GrowthFrame.access$200(GrowthFrame.this).b(this.d, d);
            }
        }
    }

    static {
        t2o.a(779093265);
        t2o.a(806355016);
    }

    public GrowthFrame(Context context, ux9 ux9Var) {
        super(context, ux9Var);
    }

    public static /* synthetic */ FrameLayout access$000(GrowthFrame growthFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("437a3e68", new Object[]{growthFrame});
        }
        return growthFrame.container;
    }

    public static /* synthetic */ zvq access$200(GrowthFrame growthFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zvq) ipChange.ipc$dispatch("1517569c", new Object[]{growthFrame});
        }
        return growthFrame.mSubscribeSuccessListener;
    }

    public static /* synthetic */ String access$300(GrowthFrame growthFrame, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5bb25bde", new Object[]{growthFrame, jSONObject});
        }
        return growthFrame.getTrackArg1(jSONObject);
    }

    private String getTrackArg1(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e57dba47", new Object[]{this, jSONObject});
        }
        if (!jSONObject.containsKey("jumpParam") || !(jSONObject.get("jumpParam") instanceof JSONObject) || !jSONObject.getJSONObject("jumpParam").getBoolean("isSubscription").booleanValue()) {
            return "Show-appointment-module";
        }
        return "Page_TaobaoLiveWatch_Show-small_card_subscribe";
    }

    private int getWatchDurationTriggerSubscribe() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("607dd159", new Object[]{this})).intValue();
        }
        return yqq.l(v2s.o().p().b("tblive", ORANGE_WATCH_DURATION_TRIGGER_SUBSCRIBE, "10"), 10);
    }

    public static /* synthetic */ Object ipc$super(GrowthFrame growthFrame, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case -1272916118:
                super.onDataReceived((TBLiveDataModel) objArr[0]);
                return null;
            case -553924265:
                super.onStatusChange(((Number) objArr[0]).intValue(), objArr[1]);
                return null;
            case -309961236:
                super.onCleanUp();
                return null;
            case 91531079:
                super.onViewCreated((View) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/ui/growth/GrowthFrame");
        }
    }

    @Override // tb.s3c
    public String bizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36951559", new Object[]{this});
        }
        return "GrowthFrame";
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public String getComponentName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bb5fe8c7", new Object[]{this});
        }
        return "tl_7days_subscribe";
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue();
        }
        return R.layout.taolive_subscribe_next_live_dx;
    }

    @Override // tb.s3c
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this});
        }
        return new String[]{uyg.EVENT_RANK_LIVE_HIDE_GROWTH_FRAME, uyg.EVENT_RANK_LIVE_QUERY_GROWTH_DATA};
    }

    @Override // tb.s3c
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        ux9 ux9Var = this.mFrameContext;
        if (ux9Var == null) {
            return null;
        }
        return ux9Var.C();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCleanUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed865dec", new Object[]{this});
            return;
        }
        super.onCleanUp();
        release();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent, com.taobao.taolive.sdk.controller.IComponentLifeCycle2, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        Runnable runnable = this.queryGrowthRunnable;
        if (runnable != null) {
            this.mHandler.removeCallbacks(runnable);
        }
        FrameLayout frameLayout = this.container;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        release();
    }

    @Override // tb.s3c
    public void onEvent(String str, Object obj) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if (uyg.EVENT_RANK_LIVE_HIDE_GROWTH_FRAME.equals(str) && (view = this.mContainer) != null) {
            view.setVisibility(8);
        } else if (uyg.EVENT_RANK_LIVE_QUERY_GROWTH_DATA.equals(str)) {
            this.mHandler.post(this.queryGrowthRunnable);
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onStatusChange(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("defbc957", new Object[]{this, new Integer(i), obj});
            return;
        }
        super.onStatusChange(i, obj);
        if (i == 1) {
            sjr.g().a(this);
            View view = this.mContainer;
            if (view != null && view.getVisibility() == 8) {
                this.mContainer.setVisibility(0);
            }
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onViewCreated(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574a747", new Object[]{this, view});
            return;
        }
        super.onViewCreated(view);
        if (view instanceof FrameLayout) {
            this.container = (FrameLayout) view;
        }
    }

    public void release() {
        Runnable runnable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        sjr.g().b(this);
        if (ggv.a() && (runnable = this.queryGrowthRunnable) != null) {
            this.mHandler.removeCallbacks(runnable);
        }
    }
}
