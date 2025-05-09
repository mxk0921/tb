package com.taobao.tbpoplayer.view;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.poplayer.factory.view.base.PopLayerBaseView;
import com.alibaba.poplayer.layermanager.PopRequest;
import com.alibaba.poplayer.track.module.OnePopModule;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.alibaba.security.realidentity.g4;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbpoplayer.view.PopLayerWeexView;
import com.taobao.weex.TBWXSDKEngine;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.WXSDKManager;
import com.taobao.weex.common.WXException;
import com.taobao.weex.common.WXRenderStrategy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;
import org.json.JSONTokener;
import tb.a9l;
import tb.c21;
import tb.dcm;
import tb.gbe;
import tb.gsu;
import tb.pg1;
import tb.rgm;
import tb.sv6;
import tb.swo;
import tb.t2o;
import tb.wdm;
import tb.xem;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class PopLayerWeexView extends PopLayerBaseView<View, com.alibaba.poplayer.trigger.a> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String VIEW_TYPE = "weex";
    private static boolean isRegisterTrackingModule = false;
    private xem mInstance;
    private swo mScreenTypeListener;
    private String weexSource;
    private String weexUrl;
    private long mRenderStartTimeStamp = 0;
    private boolean mIsRenderDone = false;
    private volatile boolean mInitDone = false;
    private volatile boolean mIsWeexWaitTimeEnbale = false;
    private List<Pair<String, String>> mLostReceivedEvent = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements WXSDKManager.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13418a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ com.alibaba.poplayer.trigger.a c;

        public a(String str, Context context, com.alibaba.poplayer.trigger.a aVar) {
            this.f13418a = str;
            this.b = context;
            this.c = aVar;
        }

        @Override // com.taobao.weex.WXSDKManager.a
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c4e0fc68", new Object[]{this, str, str2});
                return;
            }
            wdm.d("PopLayerWeexView.init.onInitFail.", new Object[0]);
            PopLayerWeexView popLayerWeexView = PopLayerWeexView.this;
            PopLayerWeexView.access$300(popLayerWeexView, popLayerWeexView.getPopRequest(), "WEEX_INIT_FAIL", "");
        }

        @Override // com.taobao.weex.WXSDKManager.a
        public void onInitSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb2dd3fb", new Object[]{this});
                return;
            }
            String str = this.f13418a;
            wdm.g(wdm.CATEGORY_CONTAINER_LIFE_CYCLE, str, "PopLayerWeexView.init.setInitListener.onInitSuccess.mIsClosed=" + PopLayerWeexView.access$000(PopLayerWeexView.this));
            if (!PopLayerWeexView.access$100(PopLayerWeexView.this)) {
                PopLayerWeexView.access$200(PopLayerWeexView.this, this.b, this.c);
            }
        }
    }

    static {
        t2o.a(790626526);
    }

    public PopLayerWeexView(Context context) {
        super(context);
    }

    public static /* synthetic */ boolean access$000(PopLayerWeexView popLayerWeexView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dc3721cc", new Object[]{popLayerWeexView})).booleanValue();
        }
        return popLayerWeexView.mIsClosed;
    }

    public static /* synthetic */ boolean access$100(PopLayerWeexView popLayerWeexView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0fbc2b", new Object[]{popLayerWeexView})).booleanValue();
        }
        return popLayerWeexView.mIsClosed;
    }

    public static /* synthetic */ PopRequest access$1000(PopLayerWeexView popLayerWeexView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopRequest) ipChange.ipc$dispatch("2e1a1489", new Object[]{popLayerWeexView});
        }
        return popLayerWeexView.mPopRequest;
    }

    public static /* synthetic */ long access$1100(PopLayerWeexView popLayerWeexView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ec8aef4c", new Object[]{popLayerWeexView})).longValue();
        }
        return popLayerWeexView.mRenderStartTimeStamp;
    }

    public static /* synthetic */ void access$200(PopLayerWeexView popLayerWeexView, Context context, com.alibaba.poplayer.trigger.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ac92f0b", new Object[]{popLayerWeexView, context, aVar});
        } else {
            popLayerWeexView.doInit(context, aVar);
        }
    }

    public static /* synthetic */ void access$300(PopLayerWeexView popLayerWeexView, PopRequest popRequest, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5fdf0c5", new Object[]{popLayerWeexView, popRequest, str, str2});
        } else {
            popLayerWeexView.closeOnException(popRequest, str, str2);
        }
    }

    public static /* synthetic */ Object access$400(PopLayerWeexView popLayerWeexView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("b484fc6e", new Object[]{popLayerWeexView});
        }
        return popLayerWeexView.mInnerView;
    }

    public static /* synthetic */ Object access$500(PopLayerWeexView popLayerWeexView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a5d68bef", new Object[]{popLayerWeexView});
        }
        return popLayerWeexView.mInnerView;
    }

    public static /* synthetic */ Object access$602(PopLayerWeexView popLayerWeexView, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ce21e696", new Object[]{popLayerWeexView, obj});
        }
        popLayerWeexView.mInnerView = obj;
        return obj;
    }

    public static /* synthetic */ Object access$700(PopLayerWeexView popLayerWeexView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8879aaf1", new Object[]{popLayerWeexView});
        }
        return popLayerWeexView.mInnerView;
    }

    public static /* synthetic */ boolean access$800(PopLayerWeexView popLayerWeexView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4afbf4c4", new Object[]{popLayerWeexView})).booleanValue();
        }
        return popLayerWeexView.mIsRenderDone;
    }

    public static /* synthetic */ boolean access$802(PopLayerWeexView popLayerWeexView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b99919a", new Object[]{popLayerWeexView, new Boolean(z)})).booleanValue();
        }
        popLayerWeexView.mIsRenderDone = z;
        return z;
    }

    public static /* synthetic */ List access$900(PopLayerWeexView popLayerWeexView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("50cb4148", new Object[]{popLayerWeexView});
        }
        return popLayerWeexView.mLostReceivedEvent;
    }

    private void closeOnException(final PopRequest popRequest, final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("908619ff", new Object[]{this, popRequest, str, str2});
            return;
        }
        try {
            Runnable ofmVar = new Runnable() { // from class: tb.ofm
                @Override // java.lang.Runnable
                public final void run() {
                    PopLayerWeexView.this.lambda$closeOnException$107(str, str2, popRequest);
                }
            };
            if (Looper.myLooper() != Looper.getMainLooper()) {
                post(ofmVar);
            } else {
                ofmVar.run();
            }
        } catch (Throwable th) {
            wdm.h("PopLayerWeexView.closeOnException error.", th);
        }
    }

    private void doInit(Context context, com.alibaba.poplayer.trigger.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("178313c7", new Object[]{this, context, aVar});
            return;
        }
        this.mInitDone = true;
        interceptWeexUserTrackModule(aVar);
        swo swoVar = new swo(context);
        this.mScreenTypeListener = swoVar;
        swoVar.b(this);
        this.mInstance.registerRenderListener(new b(aVar));
        try {
            if (this.mIsWeexWaitTimeEnbale) {
                renderWeex((com.alibaba.poplayer.trigger.a) this.mPopRequest);
            } else {
                c21.h().post(new Runnable() { // from class: tb.nfm
                    @Override // java.lang.Runnable
                    public final void run() {
                        PopLayerWeexView.this.lambda$doInit$105();
                    }
                });
            }
            wdm.d("PopLayerWeexView.init.start.renderWeex.", new Object[0]);
        } catch (Throwable th) {
            wdm.h("PopLayerWeexView.createView error.", th);
        }
    }

    private void initParams(com.alibaba.poplayer.trigger.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47e07d70", new Object[]{this, aVar});
            return;
        }
        JSONObject jSONObject = null;
        try {
            String str = aVar.K().params;
            if (!TextUtils.isEmpty(str)) {
                jSONObject = (JSONObject) new JSONTokener(str).nextValue();
            }
        } catch (Throwable th) {
            wdm.h("PopLayerWeexView init fail.", th);
        }
        if (jSONObject == null) {
            closeOnException(aVar, "PARAMS_PARSE_ERROR", "params=" + aVar.K().params);
            return;
        }
        try {
            this.weexUrl = jSONObject.optString("weexUrl");
            this.weexSource = jSONObject.optString("weexSource");
        } catch (Throwable th2) {
            wdm.h("PopLayerWeexView.initParams error.", th2);
        }
    }

    private void interceptWeexUserTrackModule(final PopRequest popRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2222c7c", new Object[]{this, popRequest});
        } else if (a9l.w().U()) {
            this.mInstance.J0("userTrack", new WXSDKInstance.t() { // from class: tb.pfm
                @Override // com.taobao.weex.WXSDKInstance.t
                public final WXSDKInstance.u a(String str, String str2, JSONArray jSONArray, com.alibaba.fastjson.JSONObject jSONObject) {
                    WXSDKInstance.u lambda$interceptWeexUserTrackModule$106;
                    lambda$interceptWeexUserTrackModule$106 = PopLayerWeexView.lambda$interceptWeexUserTrackModule$106(PopRequest.this, str, str2, jSONArray, jSONObject);
                    return lambda$interceptWeexUserTrackModule$106;
                }
            });
        }
    }

    public static /* synthetic */ Object ipc$super(PopLayerWeexView popLayerWeexView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1896705494:
                super.syncJumpToUrlInfo((String) objArr[0]);
                return null;
            case 571929693:
                super.init((Context) objArr[0], (Context) ((PopRequest) objArr[1]));
                return null;
            case 988548963:
                super.onActivityPaused();
                return null;
            case 1889590256:
                super.onActivityResumed();
                return null;
            case 1890078406:
                super.destroyView();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tbpoplayer/view/PopLayerWeexView");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$closeOnException$107(String str, String str2, PopRequest popRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a40650", new Object[]{this, str, str2, popRequest});
            return;
        }
        try {
            OnePopModule.OnePopLoseReasonCode onePopLoseReasonCode = OnePopModule.OnePopLoseReasonCode.OnViewErrorClose;
            close(onePopLoseReasonCode, str + "", str2, null);
            wdm.c(wdm.CATEGORY_CONTAINER_LIFE_CYCLE, com.alibaba.poplayer.trigger.a.R(popRequest), str2);
        } catch (Throwable th) {
            wdm.h("PopLayerWeexView.closeOnException.Runnable.error.", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doInit$105() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6de9a91", new Object[]{this});
        } else {
            renderWeex((com.alibaba.poplayer.trigger.a) this.mPopRequest);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$104(String str, com.alibaba.poplayer.trigger.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22ec2abe", new Object[]{this, str, aVar});
        } else if (!this.mInitDone) {
            wdm.g(wdm.CATEGORY_CONTAINER_LIFE_CYCLE, str, "PopLayerWeexView.init.setInitListener.WEEX_INIT_OUT_OF_TIME");
            closeOnException(aVar, "WEEX_INIT_OUT_OF_TIME", "");
        }
    }

    private void renderWeex(com.alibaba.poplayer.trigger.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d64b3bcf", new Object[]{this, aVar});
            return;
        }
        try {
            String str = aVar.K().indexID;
            if (this.mInstance == null) {
                wdm.g(wdm.CATEGORY_CONTAINER_LIFE_CYCLE, str, "PopLayerWeexView.init.renderWeex mInstance == null");
                return;
            }
            if (!TextUtils.isEmpty(this.weexSource)) {
                wdm.g(wdm.CATEGORY_CONTAINER_LIFE_CYCLE, str, "PopLayerWeexView.init.renderWeex.load weexSource");
                this.mInstance.T0("PopLayer.IndexId=" + str, this.weexSource, null, null, WXRenderStrategy.APPEND_ASYNC);
            } else if (!TextUtils.isEmpty(this.weexUrl)) {
                wdm.g(wdm.CATEGORY_CONTAINER_LIFE_CYCLE, str, "PopLayerWeexView.init.renderWeex.load url=" + this.weexUrl);
                xem xemVar = this.mInstance;
                String str2 = this.weexUrl;
                xemVar.X0(str2, str2, null, null, WXRenderStrategy.APPEND_ASYNC);
            }
            aVar.k().L = String.valueOf(SystemClock.elapsedRealtime() - aVar.k().s0);
            this.mRenderStartTimeStamp = SystemClock.elapsedRealtime();
            wdm.g(wdm.CATEGORY_CONTAINER_LIFE_CYCLE, str, "PopLayerWeexView.init.costTime=" + (SystemClock.elapsedRealtime() - aVar.k().s0));
        } catch (Throwable th) {
            wdm.h("PopLayerWeexView.renderWeex error.", th);
            com.alibaba.poplayer.trigger.a popRequest = getPopRequest();
            closeOnException(popRequest, "RENDER_MAIN_ERROR", "renderWeex.exception.weexurl=" + this.weexUrl);
        }
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public void destroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a84ec6", new Object[]{this});
            return;
        }
        super.destroyView();
        try {
            xem xemVar = this.mInstance;
            if (xemVar != null) {
                xemVar.onActivityDestroy();
            }
            this.mInnerView = null;
            removeCloseButton();
            rgm.h().r(((com.alibaba.poplayer.trigger.a) this.mPopRequest).O());
            swo swoVar = this.mScreenTypeListener;
            if (swoVar != null) {
                swoVar.d();
            }
        } catch (Throwable th) {
            wdm.h("PopLayerWeexView.destroyView.error.", th);
        }
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public SpannableStringBuilder getInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableStringBuilder) ipChange.ipc$dispatch("e6e304e", new Object[]{this});
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        try {
            sv6.a(spannableStringBuilder, "WeexUrl", this.weexUrl, null, null);
            sv6.a(spannableStringBuilder, pg1.ATOM_EXT_Event, getPopRequest().L().toString(), null, null);
        } catch (Throwable th) {
            sv6.a(spannableStringBuilder, "Error", "getInfo Error.Message:" + th.getMessage(), null, null);
        }
        return spannableStringBuilder;
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public String getNativeNotifyInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58e6e2f5", new Object[]{this});
        }
        com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
        try {
            if (getPopRequest() != null) {
                BaseConfigItem K = getPopRequest().K();
                jSONObject.put("uuid", (Object) K.uuid);
                jSONObject.put("PopTimes", (Object) (dcm.f().c(K.uuid, -1) + ""));
                jSONObject.put(pg1.ATOM_EXT_Event, (Object) getPopRequest().L().toString());
            }
        } catch (Throwable th) {
            wdm.h("getNativeNotifyInfo.error.", th);
        }
        return jSONObject.toJSONString();
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public void onReceiveEvent(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12978511", new Object[]{this, str, str2});
            return;
        }
        try {
            wdm.d("PopLayerWeexView.onReceiveEvent{%s,%s}.mIsRenderDone=%s", str, str2, Boolean.valueOf(this.mIsRenderDone));
            if (!this.mIsRenderDone) {
                this.mLostReceivedEvent.add(new Pair<>(str, str2));
                return;
            }
            xem xemVar = this.mInstance;
            if (xemVar != null) {
                xemVar.B(str, JSON.parseObject(str2));
            }
        } catch (Throwable th) {
            wdm.h("PopLayerWeexView.onReceiveEvent error.", th);
        }
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public void resetContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18396fc1", new Object[]{this, context});
            return;
        }
        xem xemVar = this.mInstance;
        if (xemVar != null) {
            xemVar.setContext(context);
        }
        if (a9l.w().A()) {
            Context context2 = getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context);
            }
        }
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public void syncJumpToUrlInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ef2922a", new Object[]{this, str});
            return;
        }
        super.syncJumpToUrlInfo(str);
        gsu.a((com.alibaba.poplayer.trigger.a) this.mPopRequest);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements gbe {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.alibaba.poplayer.trigger.a f13419a;

        public b(com.alibaba.poplayer.trigger.a aVar) {
            this.f13419a = aVar;
        }

        @Override // tb.gbe
        public void onException(WXSDKInstance wXSDKInstance, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88f82eeb", new Object[]{this, wXSDKInstance, str, str2});
            } else {
                PopLayerWeexView.access$300(PopLayerWeexView.this, this.f13419a, str, str2);
            }
        }

        @Override // tb.gbe
        public void onRefreshSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d57f8320", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
            } else {
                wdm.d("PopLayerWeexView.weexInstance.onRefreshSuccess: {%s,%s}.", Integer.valueOf(i), Integer.valueOf(i2));
            }
        }

        @Override // tb.gbe
        public void onRenderSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c414a5f9", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
                return;
            }
            try {
                wdm.d("PopLayerWeexView.onRenderSuccess.mIsRenderDone=%s", Boolean.valueOf(PopLayerWeexView.access$800(PopLayerWeexView.this)));
                if (!PopLayerWeexView.access$800(PopLayerWeexView.this)) {
                    PopLayerWeexView.access$802(PopLayerWeexView.this, true);
                    PopLayerWeexView.this.addInnerView();
                    PopLayerWeexView.this.showCloseButton(this.f13419a.K().showCloseBtn);
                    if (!PopLayerWeexView.access$900(PopLayerWeexView.this).isEmpty()) {
                        for (Pair pair : PopLayerWeexView.access$900(PopLayerWeexView.this)) {
                            PopLayerWeexView.this.onReceiveEvent((String) pair.first, (String) pair.second);
                        }
                    }
                    ((com.alibaba.poplayer.trigger.a) PopLayerWeexView.access$1000(PopLayerWeexView.this)).k().M = String.valueOf(SystemClock.elapsedRealtime() - PopLayerWeexView.access$1100(PopLayerWeexView.this));
                    View rootView = wXSDKInstance.getRootView();
                    if (rootView != null) {
                        rootView.setImportantForAccessibility(2);
                    }
                }
            } catch (Throwable th) {
                wdm.h("PopLayerWeexView.onRenderSuccess.error.", th);
            }
        }

        @Override // tb.gbe
        public void onViewCreated(WXSDKInstance wXSDKInstance, View view) {
            View childAt;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9eab5f0f", new Object[]{this, wXSDKInstance, view});
                return;
            }
            wdm.d("PopLayerWeexView.onViewCreated.start.", new Object[0]);
            if (view == null) {
                PopLayerWeexView.access$300(PopLayerWeexView.this, this.f13419a, "RENDER_VIEW_CREATED_NULL", "weexRenderOnViewCreatedViewIsNull");
                return;
            }
            try {
                if ((view instanceof ViewGroup) && (childAt = ((ViewGroup) view).getChildAt(0)) != null) {
                    childAt.setBackgroundColor(0);
                }
                if (PopLayerWeexView.access$400(PopLayerWeexView.this) != null) {
                    PopLayerWeexView popLayerWeexView = PopLayerWeexView.this;
                    popLayerWeexView.removeView((View) PopLayerWeexView.access$500(popLayerWeexView));
                    wdm.d("PopLayerWeexView.onViewCreated.mInnerView already been added.remove it.", new Object[0]);
                }
                PopLayerWeexView.this.removeCloseButton();
                PopLayerWeexView.access$602(PopLayerWeexView.this, view);
                ((View) PopLayerWeexView.access$700(PopLayerWeexView.this)).setClickable(true);
                wdm.d("PopLayerWeexView.onViewCreated.done.", new Object[0]);
            } catch (Throwable th) {
                wdm.h("PopLayerWeexView.onViewCreated.error.", th);
            }
        }
    }

    public void init(Context context, final com.alibaba.poplayer.trigger.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4406111c", new Object[]{this, context, aVar});
            return;
        }
        super.init(context, (Context) aVar);
        if (!isRegisterTrackingModule) {
            try {
                WXSDKEngine.registerModule("PopLayerTrackingEventModule", PopLayerTrackingEventModule.class);
            } catch (WXException e) {
                e.printStackTrace();
            }
            isRegisterTrackingModule = true;
        }
        wdm.d("PopLayerWeexView.init.registerModule.PopLayerTrackingEventModule.done.", new Object[0]);
        setVisibility(4);
        setPenetrateAlpha((int) (aVar.K().modalThreshold * 255.0d));
        setFindTextureSurfaceViewRectWhenTouch(aVar.K().enableSpecialViewTouchIntercept);
        setPopRequest(aVar);
        if (a9l.w().Z()) {
            setUseCacheMark(false);
            setUseTouchPointBitmap(true);
        }
        final String P = com.alibaba.poplayer.trigger.a.P(aVar);
        this.mIsWeexWaitTimeEnbale = a9l.w().T(context);
        wdm.g(wdm.CATEGORY_CONTAINER_LIFE_CYCLE, P, "PopLayerWeexView.init.isWeexInitWaitTimeEnable=" + this.mIsWeexWaitTimeEnbale);
        initParams(aVar);
        if (this.mIsWeexWaitTimeEnbale) {
            xem xemVar = new xem(context);
            this.mInstance = xemVar;
            xemVar.m0 = new WeakReference<>(this);
            TBWXSDKEngine.initSDKEngine();
            this.mInstance.r1(this.weexUrl);
            wdm.g(wdm.CATEGORY_CONTAINER_LIFE_CYCLE, P, "PopLayerWeexView.init.setInitListener");
            this.mInstance.i1(new a(P, context, aVar));
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: tb.qfm
                @Override // java.lang.Runnable
                public final void run() {
                    PopLayerWeexView.this.lambda$init$104(P, aVar);
                }
            }, a9l.w().v());
        } else if (!WXEnvironment.JsFrameworkInit) {
            wdm.d("PopLayerWeexView.init.isWeexInitWaitTimeEnable=false.WEEX_NOT_INIT.", new Object[0]);
            closeOnException(aVar, "WEEX_NOT_INIT", "weexNotInit");
        } else {
            xem xemVar2 = new xem(context);
            this.mInstance = xemVar2;
            xemVar2.m0 = new WeakReference<>(this);
            doInit(context, aVar);
        }
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public void onActivityPaused() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3aec0f63", new Object[]{this});
            return;
        }
        try {
            super.onActivityPaused();
            xem xemVar = this.mInstance;
            if (xemVar != null) {
                xemVar.B("WV.Event.APP.Background", new HashMap());
                wdm.d("send event:WV.Event.APP.Background", new Object[0]);
                this.mInstance.onActivityPause();
            }
        } catch (Throwable th) {
            wdm.h("Weex onActivityPaused error", th);
        }
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public void onActivityResumed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a0dbf0", new Object[]{this});
            return;
        }
        try {
            super.onActivityResumed();
            xem xemVar = this.mInstance;
            if (xemVar != null) {
                xemVar.B("WV.Event.APP.Active", new HashMap());
                wdm.d("send event:WV.Event.APP.Active", new Object[0]);
                this.mInstance.onActivityResume();
            }
        } catch (Throwable th) {
            wdm.h("Weex onActivityResumed error", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ WXSDKInstance.u lambda$interceptWeexUserTrackModule$106(PopRequest popRequest, String str, String str2, JSONArray jSONArray, com.alibaba.fastjson.JSONObject jSONObject) {
        boolean z = true;
        z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXSDKInstance.u) ipChange.ipc$dispatch("4b8d7ff7", new Object[]{popRequest, str, str2, jSONArray, jSONObject});
        }
        try {
        } catch (Throwable th) {
            wdm.h("PopLayerWeexView.ModuleIntercept.fail.", th);
        }
        if ("userTrack".equals(str)) {
            if (!TextUtils.isEmpty(str2)) {
                if (!"commit".equals(str2)) {
                    if ("commitut".equals(str2)) {
                    }
                }
                if (jSONArray != null && g4.b.i.equals(jSONArray.getString(0))) {
                    String R = com.alibaba.poplayer.trigger.a.R(popRequest);
                    wdm.f("pageLifeCycle", R, "this page is using userTrack enter.intercepted.methodStr=" + str2);
                    return new WXSDKInstance.u(z, null);
                }
            }
        }
        z = false;
        return new WXSDKInstance.u(z, null);
    }
}
