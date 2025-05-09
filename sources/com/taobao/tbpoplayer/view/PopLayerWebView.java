package com.taobao.tbpoplayer.view;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.SystemClock;
import android.taobao.windvane.extra.uc.WVUCWebChromeClient;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.webkit.ConsoleMessage;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.factory.view.base.PopLayerBaseView;
import com.alibaba.poplayer.layermanager.PopRequest;
import com.alibaba.poplayer.track.module.OnePopModule;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.alibaba.poplayer.utils.ConsoleLogger$Level;
import com.alipay.android.phone.mobilesdk.socketcraft.monitor.MonitorItemConstants;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.browser.jsbridge.CommonJsApiManager;
import com.taobao.taobao.R;
import com.taobao.tbpoplayer.view.PopLayerWebView;
import com.taobao.tbpoplayer.view.jsbridge.PopLayerWVNativePlugin;
import com.taobao.tbpoplayer.view.jsbridge.PopLayerWVWindowPlugin;
import com.uc.webview.export.WebView;
import org.json.JSONTokener;
import tb.a9l;
import tb.dcm;
import tb.fsw;
import tb.gsu;
import tb.h1x;
import tb.hst;
import tb.pg1;
import tb.rgm;
import tb.sv6;
import tb.swo;
import tb.t2o;
import tb.wdm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class PopLayerWebView extends PopLayerBaseView<WVUCWebView, com.alibaba.poplayer.trigger.a> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = PopLayerWebView.class.getSimpleName();
    public static final String VIEW_TYPE = "webview";
    private swo mScreenTypeListener;
    private String mUrl;
    private boolean mWebViewAddEnable = true;
    private long mLoadUrlStartTime = 0;
    private StringBuilder mJsErrorMessageSb = new StringBuilder();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a extends WVUCWebViewClient {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(Context context) {
            super(context);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -332805219) {
                super.onPageFinished((WebView) objArr[0], (String) objArr[1]);
                return null;
            } else if (hashCode == 1373550412) {
                super.onReceivedError((WebView) objArr[0], ((Number) objArr[1]).intValue(), (String) objArr[2], (String) objArr[3]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tbpoplayer/view/PopLayerWebView$1");
            }
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec29cb9d", new Object[]{this, webView, str});
                return;
            }
            super.onPageFinished(webView, str);
            try {
                ((com.alibaba.poplayer.trigger.a) PopLayerWebView.access$100(PopLayerWebView.this)).k().M = String.valueOf(SystemClock.elapsedRealtime() - PopLayerWebView.access$200(PopLayerWebView.this));
            } catch (Throwable th) {
                wdm.h("PopLayerWebView.WVUCWebView.onPageFinished.error.", th);
            }
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51deb74c", new Object[]{this, webView, new Integer(i), str, str2});
                return;
            }
            super.onReceivedError(webView, i, str, str2);
            try {
                wdm.f(wdm.CATEGORY_CONTAINER_LIFE_CYCLE, com.alibaba.poplayer.trigger.a.R(PopLayerWebView.access$000(PopLayerWebView.this)), "WVUCWebView onReceivedError.");
                PopLayerWebView popLayerWebView = PopLayerWebView.this;
                OnePopModule.OnePopLoseReasonCode onePopLoseReasonCode = OnePopModule.OnePopLoseReasonCode.OnViewErrorClose;
                popLayerWebView.close(onePopLoseReasonCode, i + "", str, null);
            } catch (Throwable th) {
                wdm.h("PopLayerWebView.WVUCWebView.onReceivedError.error.", th);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b extends WVUCWebChromeClient {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(Context context) {
            super(context);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == -634514222) {
                return new Boolean(super.onConsoleMessage((ConsoleMessage) objArr[0]));
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tbpoplayer/view/PopLayerWebView$2");
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebChromeClient, com.uc.webview.export.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("da2e14d2", new Object[]{this, consoleMessage})).booleanValue();
            }
            try {
                PopLayerWebView.access$300(PopLayerWebView.this, consoleMessage, true);
            } catch (Throwable th) {
                wdm.h("H5 WVUCWebChromeClient onConsoleMessage error", th);
            }
            return super.onConsoleMessage(consoleMessage);
        }
    }

    static {
        t2o.a(790626521);
    }

    public PopLayerWebView(Context context) {
        super(context);
    }

    public static /* synthetic */ PopRequest access$000(PopLayerWebView popLayerWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopRequest) ipChange.ipc$dispatch("8fff8739", new Object[]{popLayerWebView});
        }
        return popLayerWebView.mPopRequest;
    }

    public static /* synthetic */ PopRequest access$100(PopLayerWebView popLayerWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopRequest) ipChange.ipc$dispatch("70814f18", new Object[]{popLayerWebView});
        }
        return popLayerWebView.mPopRequest;
    }

    public static /* synthetic */ long access$200(PopLayerWebView popLayerWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1d9fbfbf", new Object[]{popLayerWebView})).longValue();
        }
        return popLayerWebView.mLoadUrlStartTime;
    }

    public static /* synthetic */ void access$300(PopLayerWebView popLayerWebView, ConsoleMessage consoleMessage, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51c88ddc", new Object[]{popLayerWebView, consoleMessage, new Boolean(z)});
        } else {
            popLayerWebView.sendLog(consoleMessage, z);
        }
    }

    private WVUCWebView buildWebView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVUCWebView) ipChange.ipc$dispatch("21184501", new Object[]{this, context});
        }
        WVUCWebView wVUCWebView = new WVUCWebView(context);
        wVUCWebView.setWebViewClient(new a(context));
        wVUCWebView.setWebChromeClient(new b(context));
        wdm.d("buildWebView,use default UC webview.", new Object[0]);
        return wVUCWebView;
    }

    public static /* synthetic */ Object ipc$super(PopLayerWebView popLayerWebView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1896705494:
                super.syncJumpToUrlInfo((String) objArr[0]);
                return null;
            case 406417345:
                super.resetContext((Context) objArr[0]);
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tbpoplayer/view/PopLayerWebView");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$109(Context context, com.alibaba.poplayer.trigger.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ffee02f", new Object[]{this, context, aVar});
            return;
        }
        try {
            doInit(context, aVar);
            loadUrl(this.mUrl);
        } catch (Throwable th) {
            wdm.h("PopLayerWebview.post.doInit.error", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onActivityPaused$111() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f375c8d", new Object[]{this});
            return;
        }
        try {
            WVUCWebView webView = getWebView();
            if (webView != null) {
                webView.onPause();
            }
        } catch (Throwable th) {
            wdm.h("H5 onActivityPaused error", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onActivityResumed$110() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b79ce3f", new Object[]{this});
            return;
        }
        try {
            WVUCWebView webView = getWebView();
            if (webView != null) {
                webView.onResume();
            }
        } catch (Throwable th) {
            wdm.h("H5 onActivityResumed error", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMeOnMainThread() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1233145", new Object[]{this});
            return;
        }
        try {
            InnerView innerview = this.mInnerView;
            if (innerview != 0) {
                ((WVUCWebView) innerview).getSettings().setJavaScriptEnabled(false);
                if (((WVUCWebView) this.mInnerView).getParent() != null) {
                    removeView((View) this.mInnerView);
                }
                WVUCWebView wVUCWebView = (WVUCWebView) this.mInnerView;
                fsw.o(wVUCWebView);
                wVUCWebView.destroy();
                if (!a9l.w().I()) {
                    destroy();
                }
                this.mInnerView = null;
            }
            removeCloseButton();
            rgm.h().r(((com.alibaba.poplayer.trigger.a) this.mPopRequest).O());
            swo swoVar = this.mScreenTypeListener;
            if (swoVar != null) {
                swoVar.d();
            }
            this.mPopRequest = null;
            wdm.d("%s.destroyView.success", TAG);
        } finally {
            try {
            } finally {
            }
        }
    }

    private void sendLog(ConsoleMessage consoleMessage, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32993973", new Object[]{this, consoleMessage, new Boolean(z)});
            return;
        }
        String str = consoleMessage.message() + "\n@source-" + consoleMessage.sourceId() + ":lineNumber-" + consoleMessage.lineNumber();
        if (ConsoleMessage.MessageLevel.ERROR == consoleMessage.messageLevel()) {
            StringBuilder sb = this.mJsErrorMessageSb;
            sb.append(str);
            sb.append("\n\n");
        }
        consoleLog(str, ConsoleLogger$Level.find(h1x.WEBCONSOLE_LOGCAT_MAP.get(consoleMessage.messageLevel()).charValue()));
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public void destroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a84ec6", new Object[]{this});
            return;
        }
        super.destroyView();
        hst.c(new Runnable() { // from class: tb.zem
            @Override // java.lang.Runnable
            public final void run() {
                PopLayerWebView.this.removeMeOnMainThread();
            }
        });
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public SpannableStringBuilder getInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableStringBuilder) ipChange.ipc$dispatch("e6e304e", new Object[]{this});
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        try {
            if (this.mJsErrorMessageSb.length() > 0) {
                sv6.a(spannableStringBuilder, "JsError", this.mJsErrorMessageSb.toString(), null, new ForegroundColorSpan(-65536));
            }
            if (getWebView() != null) {
                sv6.a(spannableStringBuilder, MonitorItemConstants.KEY_URL, getWebView().getUrl(), null, null);
            }
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
        JSONObject jSONObject = new JSONObject();
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

    public WVUCWebView getWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVUCWebView) ipChange.ipc$dispatch("151ffdcd", new Object[]{this});
        }
        return (WVUCWebView) this.mInnerView;
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public void onActivityPaused() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3aec0f63", new Object[]{this});
            return;
        }
        super.onActivityPaused();
        hst.c(new Runnable() { // from class: tb.bfm
            @Override // java.lang.Runnable
            public final void run() {
                PopLayerWebView.this.lambda$onActivityPaused$111();
            }
        });
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public void onActivityResumed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a0dbf0", new Object[]{this});
            return;
        }
        super.onActivityResumed();
        hst.c(new Runnable() { // from class: tb.afm
            @Override // java.lang.Runnable
            public final void run() {
                PopLayerWebView.this.lambda$onActivityResumed$110();
            }
        });
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public void onReceiveEvent(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12978511", new Object[]{this, str, str2});
        } else if (getWebView() != null) {
            getWebView().fireEvent(str, str2);
        }
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public void resetContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18396fc1", new Object[]{this, context});
            return;
        }
        super.resetContext(context);
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

    public void init(final Context context, final com.alibaba.poplayer.trigger.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4406111c", new Object[]{this, context, aVar});
        } else {
            post(new Runnable() { // from class: tb.yem
                @Override // java.lang.Runnable
                public final void run() {
                    PopLayerWebView.this.lambda$init$109(context, aVar);
                }
            });
        }
    }

    private void doInit(Context context, com.alibaba.poplayer.trigger.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("178313c7", new Object[]{this, context, aVar});
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        org.json.JSONObject jSONObject = null;
        try {
            super.init(context, (Context) aVar);
            String str = aVar.K().params;
            if (!TextUtils.isEmpty(str)) {
                jSONObject = (org.json.JSONObject) new JSONTokener(str).nextValue();
            }
        } catch (Throwable th) {
            wdm.h("PopLayerView init fail.", th);
        }
        if (jSONObject == null) {
            OnePopModule.OnePopLoseReasonCode onePopLoseReasonCode = OnePopModule.OnePopLoseReasonCode.OnViewErrorClose;
            close(onePopLoseReasonCode, "PARAMS_PARSE_ERROR", "params=" + aVar.K().params, "");
            return;
        }
        setVisibility(4);
        setPopRequest(aVar);
        if (a9l.w().V()) {
            setUseCacheMark(false);
            setUseTouchPointBitmap(true);
        }
        BaseConfigItem K = aVar.K();
        if (K == null) {
            wdm.d("PopLayerWebView init error.configItem=null.", new Object[0]);
            close(OnePopModule.OnePopLoseReasonCode.OnViewErrorClose, "CONFIG_NULL", "", "");
            return;
        }
        this.mUrl = jSONObject.optString("url");
        setWebView(buildWebView(context));
        if (!a9l.w().B()) {
            setHardwareAcceleration(jSONObject.optBoolean("enableHardwareAcceleration", true));
        }
        setPenetrateAlpha((int) (K.modalThreshold * 255.0d));
        showCloseButton(K.showCloseBtn);
        aVar.k().L = String.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime);
        swo swoVar = new swo(context);
        this.mScreenTypeListener = swoVar;
        swoVar.b(this);
    }

    private void setWebView(WVUCWebView wVUCWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("766db43f", new Object[]{this, wVUCWebView});
        } else if (wVUCWebView != this.mInnerView) {
            fsw.g(wVUCWebView, "Base", PopLayerWVWindowPlugin.class);
            fsw.g(wVUCWebView, "WVNative", PopLayerWVNativePlugin.class);
            InnerView innerview = this.mInnerView;
            if (innerview != 0) {
                removeView((View) innerview);
            }
            removeCloseButton();
            this.mInnerView = wVUCWebView;
            if (wVUCWebView.getView() != null) {
                wVUCWebView.getView().setTag(R.id.poplayer_view_id, PopLayerBaseView.POPLAYER_VIEW_TAG);
            }
            try {
                h1x.a(getContext(), this);
            } catch (Throwable th) {
                wdm.h("PopLayerWebView.setWebView.initWebViewCompat.error", th);
            }
            try {
                if (this.mWebViewAddEnable) {
                    addInnerView();
                } else {
                    wdm.a("PopLayerWebView try add webview, WebView had destroyed,url:" + this.mUrl);
                }
            } catch (Throwable th2) {
                wdm.h("PopLayerWebView.setWebView.error", th2);
            }
            wdm.d("%s.setWebView.success", TAG);
        }
    }

    public void loadUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89757c7a", new Object[]{this, str});
        } else if (getWebView() != null && !TextUtils.isEmpty(str)) {
            CommonJsApiManager.initCommonJsbridge();
            wdm.d("Load url : %s.", str);
            try {
                getWebView().loadUrl(str);
                this.mLoadUrlStartTime = SystemClock.elapsedRealtime();
            } catch (Exception e) {
                wdm.h("loadUrl.error.", e);
            }
        }
    }
}
