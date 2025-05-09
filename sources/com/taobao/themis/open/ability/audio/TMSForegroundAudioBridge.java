package com.taobao.themis.open.ability.audio;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.idst.nls.nlsclientsdk.requests.Constant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.ability.base.annotation.APIMethod;
import com.taobao.themis.kernel.ability.base.annotation.BindingApiContext;
import com.taobao.themis.kernel.ability.base.annotation.BindingCallback;
import com.taobao.themis.kernel.ability.base.annotation.BindingParam;
import com.taobao.themis.kernel.ability.base.annotation.BindingRequest;
import com.taobao.themis.kernel.ability.base.annotation.ThreadType;
import com.taobao.themis.kernel.adapter.IEnvironmentService;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.page.ITMSPage;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import tb.a07;
import tb.ckf;
import tb.f7m;
import tb.j8s;
import tb.p8s;
import tb.t2o;
import tb.tmu;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 !2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\r\u001a\u00020\n2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\r\u0010\fJ;\u0010\u000f\u001a\u00020\n2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010JS\u0010\u0015\u001a\u00020\n2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u0017\u001a\u00020\n2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0017\u0010\fJ/\u0010\u0018\u001a\u00020\n2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0018\u0010\fJ/\u0010\u0019\u001a\u00020\n2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0019\u0010\fJ9\u0010\u001c\u001a\u00020\n2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u001b\u001a\u00020\u001a2\b\b\u0001\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010\u001e\u001a\u00020\n2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u001e\u0010\fJ\u000f\u0010\u001f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001f\u0010\u0003J\u000f\u0010 \u001a\u00020\nH\u0016¢\u0006\u0004\b \u0010\u0003¨\u0006#"}, d2 = {"Lcom/taobao/themis/open/ability/audio/TMSForegroundAudioBridge;", "Ltb/j8s;", "<init>", "()V", "Lcom/taobao/themis/kernel/ability/base/ApiContext;", "apiContext", "", "audioPlayerId", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "callback", "Ltb/xhv;", "startMonitorForegroundAudio", "(Lcom/taobao/themis/kernel/ability/base/ApiContext;Ljava/lang/String;Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;)V", "stopMonitorForegroundAudio", "optionName", "getForegroundAudioOption", "(Lcom/taobao/themis/kernel/ability/base/ApiContext;Ljava/lang/String;Ljava/lang/String;Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;)V", "option", "Lcom/alibaba/fastjson/JSONObject;", "params", "appXDomain", "setForegroundAudioOption", "(Lcom/taobao/themis/kernel/ability/base/ApiContext;Ljava/lang/String;Ljava/lang/String;Lcom/alibaba/fastjson/JSONObject;Ljava/lang/String;Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;)V", "playForegroundAudio", "pauseForegroundAudio", "stopForegroundAudio", "", "position", "seekForegroundAudio", "(Lcom/taobao/themis/kernel/ability/base/ApiContext;Ljava/lang/String;ILcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;)V", "destroyForegroundAudio", "onInitialized", "onFinalized", "Companion", "a", "themis_open_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSForegroundAudioBridge implements j8s {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, f7m> f13627a = new HashMap<>();
    public final Application.ActivityLifecycleCallbacks b = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(843055180);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements Application.ActivityLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            } else {
                ckf.g(activity, "activity");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            } else {
                ckf.g(activity, "activity");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
                return;
            }
            ckf.g(activity, "activity");
            for (Map.Entry entry : TMSForegroundAudioBridge.access$getPlayers$p(TMSForegroundAudioBridge.this).entrySet()) {
                String str = (String) entry.getKey();
                f7m f7mVar = (f7m) entry.getValue();
                if (f7mVar != null) {
                    try {
                        f7mVar.M(null);
                    } catch (Throwable th) {
                        TMSLogger.c("TMSForegroundAudioBridge", ckf.p("onActivityPaused, pause player error: ", th.getMessage()), th);
                    }
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            } else {
                ckf.g(activity, "activity");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
                return;
            }
            ckf.g(activity, "activity");
            ckf.g(bundle, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
            } else {
                ckf.g(activity, "activity");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            } else {
                ckf.g(activity, "activity");
            }
        }
    }

    static {
        t2o.a(843055179);
        t2o.a(839909427);
    }

    public static final /* synthetic */ HashMap access$getPlayers$p(TMSForegroundAudioBridge tMSForegroundAudioBridge) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("71be7446", new Object[]{tMSForegroundAudioBridge});
        }
        return tMSForegroundAudioBridge.f13627a;
    }

    @ThreadType(ExecutorType.AUDIO)
    @APIMethod
    public final void destroyForegroundAudio(@BindingApiContext ApiContext apiContext, @BindingParam({"audioPlayerID"}) String str, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e4a8555", new Object[]{this, apiContext, str, bridgeCallback});
            return;
        }
        ckf.g(apiContext, "apiContext");
        ckf.g(bridgeCallback, "callback");
        if (str == null || str.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.b("TMSForegroundAudioBridge", "stopForegroundAudio audioPlayerId is null or empty");
        } else if (apiContext.c() == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.b("TMSForegroundAudioBridge", "stopForegroundAudio page is null");
        } else {
            if (TextUtils.isEmpty(str)) {
                str = "DEFAULT_PLAYER";
            }
            f7m f7mVar = this.f13627a.get(str);
            if (f7mVar == null) {
                f7mVar = new f7m(str);
                this.f13627a.put(str, f7mVar);
            }
            this.f13627a.remove(str);
            f7mVar.P();
            f7mVar.L(bridgeCallback);
        }
    }

    @Override // tb.j8s
    public void onFinalized() {
        Application applicationContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1b9dee", new Object[]{this});
            return;
        }
        IEnvironmentService iEnvironmentService = (IEnvironmentService) p8s.b(IEnvironmentService.class);
        if (!(iEnvironmentService == null || (applicationContext = iEnvironmentService.getApplicationContext()) == null)) {
            applicationContext.unregisterActivityLifecycleCallbacks(this.b);
        }
        try {
            for (f7m f7mVar : this.f13627a.values()) {
                if (f7mVar != null) {
                    f7mVar.P();
                }
            }
            f7m.Companion.a().removeCallbacksAndMessages(null);
        } catch (Throwable th) {
            TMSLogger.c("TMSForegroundAudioBridge", ckf.p("onFinalized releaseMediaPlayer error: ", th.getMessage()), th);
        }
    }

    @Override // tb.j8s
    public void onInitialized() {
        Application applicationContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f2f17c", new Object[]{this});
            return;
        }
        IEnvironmentService iEnvironmentService = (IEnvironmentService) p8s.b(IEnvironmentService.class);
        if (iEnvironmentService != null && (applicationContext = iEnvironmentService.getApplicationContext()) != null) {
            applicationContext.registerActivityLifecycleCallbacks(this.b);
        }
    }

    @ThreadType(ExecutorType.AUDIO)
    @APIMethod
    public final void pauseForegroundAudio(@BindingApiContext ApiContext apiContext, @BindingParam({"audioPlayerID"}) String str, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50346651", new Object[]{this, apiContext, str, bridgeCallback});
            return;
        }
        ckf.g(apiContext, "apiContext");
        ckf.g(bridgeCallback, "callback");
        if (str == null || str.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.b("TMSForegroundAudioBridge", "pauseForegroundAudio audioPlayerId is null or empty");
            return;
        }
        ITMSPage c = apiContext.c();
        if (!(c instanceof ITMSPage)) {
            c = null;
        }
        if (c == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.b("TMSForegroundAudioBridge", "pauseForegroundAudio page is null");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = "DEFAULT_PLAYER";
        }
        f7m f7mVar = this.f13627a.get(str);
        if (f7mVar == null) {
            f7mVar = new f7m(str);
            this.f13627a.put(str, f7mVar);
        }
        f7mVar.o(c);
        f7mVar.M(bridgeCallback);
    }

    @ThreadType(ExecutorType.AUDIO)
    @APIMethod
    public final void playForegroundAudio(@BindingApiContext ApiContext apiContext, @BindingParam({"audioPlayerID"}) String str, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3020490f", new Object[]{this, apiContext, str, bridgeCallback});
            return;
        }
        ckf.g(apiContext, "apiContext");
        ckf.g(bridgeCallback, "callback");
        if (str == null || str.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.b("TMSForegroundAudioBridge", "playForegroundAudio audioPlayerId is null or empty");
            return;
        }
        ITMSPage c = apiContext.c();
        if (!(c instanceof ITMSPage)) {
            c = null;
        }
        if (c == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.b("TMSForegroundAudioBridge", "playForegroundAudio page is null");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = "DEFAULT_PLAYER";
        }
        f7m f7mVar = this.f13627a.get(str);
        if (f7mVar == null) {
            f7mVar = new f7m(str);
            this.f13627a.put(str, f7mVar);
        }
        f7mVar.o(c);
        TMSLogger.a("TMSForegroundAudioBridge", ckf.p("playForegroundAudio: ", Integer.valueOf(this.f13627a.size())));
        f7mVar.N(bridgeCallback);
    }

    @ThreadType(ExecutorType.AUDIO)
    @APIMethod
    public final void seekForegroundAudio(@BindingApiContext ApiContext apiContext, @BindingParam({"audioPlayerID"}) String str, @BindingParam({"position"}) int i, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fd9f8a2", new Object[]{this, apiContext, str, new Integer(i), bridgeCallback});
            return;
        }
        ckf.g(apiContext, "apiContext");
        ckf.g(bridgeCallback, "callback");
        if (str == null || str.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.b("TMSForegroundAudioBridge", "stopForegroundAudio audioPlayerId is null or empty");
            return;
        }
        ITMSPage c = apiContext.c();
        if (!(c instanceof ITMSPage)) {
            c = null;
        }
        if (c == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.b("TMSForegroundAudioBridge", "stopForegroundAudio page is null");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = "DEFAULT_PLAYER";
        }
        f7m f7mVar = this.f13627a.get(str);
        if (f7mVar == null) {
            f7mVar = new f7m(str);
            this.f13627a.put(str, f7mVar);
        }
        f7mVar.o(c);
        f7mVar.T(i, bridgeCallback);
    }

    @ThreadType(ExecutorType.AUDIO)
    @APIMethod
    public final void setForegroundAudioOption(@BindingApiContext ApiContext apiContext, @BindingParam({"audioPlayerID"}) String str, @BindingParam({"option"}) String str2, @BindingRequest JSONObject jSONObject, @BindingParam({"__appxDomain"}) String str3, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94619b00", new Object[]{this, apiContext, str, str2, jSONObject, str3, bridgeCallback});
            return;
        }
        ckf.g(apiContext, "apiContext");
        ckf.g(bridgeCallback, "callback");
        ITMSPage c = apiContext.c();
        if (!(c instanceof ITMSPage)) {
            c = null;
        }
        if (c == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.b("TMSForegroundAudioBridge", "stopMonitorForegroundAudio page is null");
        } else if (str == null || str.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.b("TMSForegroundAudioBridge", "stopMonitorForegroundAudio audioPlayerId is null or empty");
        } else if (jSONObject == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.b("TMSForegroundAudioBridge", "stopMonitorForegroundAudio params is null");
        } else {
            JSONObject jSONObject2 = jSONObject.getJSONObject("option");
            if (jSONObject2 == null) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
                TMSLogger.b("TMSForegroundAudioBridge", "stopMonitorForegroundAudio kv is null");
                return;
            }
            if (TextUtils.isEmpty(str)) {
                str = "DEFAULT_PLAYER";
            }
            f7m f7mVar = this.f13627a.get(str);
            if (f7mVar == null) {
                f7mVar = new f7m(str);
                this.f13627a.put(str, f7mVar);
            }
            f7mVar.o(c);
            if (jSONObject2.containsKey("src")) {
                String string = jSONObject2.getString("src");
                ckf.f(string, "kv.getString(TMSAudioConstant.ATTR_SRC)");
                f7mVar.Y(string, bridgeCallback, false, str3, c);
            } else if (jSONObject2.containsKey("autoplay")) {
                f7mVar.V(bridgeCallback, jSONObject2.getBooleanValue("autoplay"));
            } else if (jSONObject2.containsKey("loop")) {
                f7mVar.X(jSONObject2.getBooleanValue("loop"), bridgeCallback);
            } else if (jSONObject2.containsKey("startTime")) {
                f7mVar.Z(jSONObject2.getIntValue("startTime"), bridgeCallback);
            } else if (jSONObject2.containsKey(Constant.PROP_TTS_VOLUME)) {
                f7mVar.a0(jSONObject2.getFloatValue(Constant.PROP_TTS_VOLUME), bridgeCallback);
            } else if (jSONObject2.containsKey("isRecordAudioPlayState")) {
                Boolean bool = jSONObject2.getBoolean("isRecordAudioPlayState");
                ckf.f(bool, "kv.getBoolean(TMSAudioCo…t.ATTR_RECORD_PLAY_STATE)");
                f7mVar.W(bool.booleanValue(), bridgeCallback);
            } else {
                f7mVar.K(bridgeCallback);
                TMSLogger.a("ForeGroundAudioBridge", ckf.p("InvalidParam : ", jSONObject));
            }
        }
    }

    @ThreadType(ExecutorType.AUDIO)
    @APIMethod
    public final void startMonitorForegroundAudio(@BindingApiContext ApiContext apiContext, @BindingParam({"audioPlayerID"}) String str, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2b65973", new Object[]{this, apiContext, str, bridgeCallback});
            return;
        }
        ckf.g(apiContext, "apiContext");
        ckf.g(bridgeCallback, "callback");
        if (str == null || str.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.b("TMSForegroundAudioBridge", "startMonitorForegroundAudio audioPlayerId is null or empty");
            return;
        }
        ITMSPage c = apiContext.c();
        if (!(c instanceof ITMSPage)) {
            c = null;
        }
        if (c == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.b("TMSForegroundAudioBridge", "startMonitorForegroundAudio page is null");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = "DEFAULT_PLAYER";
        }
        f7m f7mVar = this.f13627a.get(str);
        if (f7mVar == null) {
            f7mVar = new f7m(str);
            this.f13627a.put(str, f7mVar);
        }
        f7mVar.o(c);
        f7mVar.L(bridgeCallback);
    }

    @ThreadType(ExecutorType.AUDIO)
    @APIMethod
    public final void stopForegroundAudio(@BindingApiContext ApiContext apiContext, @BindingParam({"audioPlayerID"}) String str, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cd3375d", new Object[]{this, apiContext, str, bridgeCallback});
            return;
        }
        ckf.g(apiContext, "apiContext");
        ckf.g(bridgeCallback, "callback");
        if (str == null || str.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.b("TMSForegroundAudioBridge", "stopForegroundAudio audioPlayerId is null or empty");
            return;
        }
        ITMSPage c = apiContext.c();
        if (!(c instanceof ITMSPage)) {
            c = null;
        }
        if (c == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.b("TMSForegroundAudioBridge", "stopForegroundAudio page is null");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = "DEFAULT_PLAYER";
        }
        f7m f7mVar = this.f13627a.get(str);
        if (f7mVar == null) {
            f7mVar = new f7m(str);
            this.f13627a.put(str, f7mVar);
        }
        f7mVar.o(c);
        f7mVar.c0(bridgeCallback);
    }

    @ThreadType(ExecutorType.AUDIO)
    @APIMethod
    public final void stopMonitorForegroundAudio(@BindingApiContext ApiContext apiContext, @BindingParam({"audioPlayerID"}) String str, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("935b39d3", new Object[]{this, apiContext, str, bridgeCallback});
            return;
        }
        ckf.g(apiContext, "apiContext");
        ckf.g(bridgeCallback, "callback");
        if (str == null || str.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.b("TMSForegroundAudioBridge", "stopMonitorForegroundAudio audioPlayerId is null or empty");
            return;
        }
        ITMSPage c = apiContext.c();
        if (!(c instanceof ITMSPage)) {
            c = null;
        }
        if (c == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.b("TMSForegroundAudioBridge", "stopMonitorForegroundAudio page is null");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = "DEFAULT_PLAYER";
        }
        f7m f7mVar = this.f13627a.get(str);
        if (f7mVar == null) {
            f7mVar = new f7m(str);
            this.f13627a.put(str, f7mVar);
        }
        f7mVar.Q();
        f7mVar.L(bridgeCallback);
    }

    @ThreadType(ExecutorType.AUDIO)
    @APIMethod
    public final void getForegroundAudioOption(@BindingApiContext ApiContext apiContext, @BindingParam({"audioPlayerID"}) String str, @BindingParam({"optionName"}) String str2, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23660832", new Object[]{this, apiContext, str, str2, bridgeCallback});
            return;
        }
        ckf.g(apiContext, "apiContext");
        ckf.g(bridgeCallback, "callback");
        ITMSPage c = apiContext.c();
        if (!(c instanceof ITMSPage)) {
            c = null;
        }
        if (c == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.b("TMSForegroundAudioBridge", "getForegroundAudioOption page is null");
        } else if (str == null || str.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.b("TMSForegroundAudioBridge", "getForegroundAudioOption audioPlayerId is null or empty");
        } else if (str2 == null || str2.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.b("TMSForegroundAudioBridge", "getForegroundAudioOption optionName is null or empty");
        } else {
            if (TextUtils.isEmpty(str)) {
                str = "DEFAULT_PLAYER";
            }
            f7m f7mVar = this.f13627a.get(str);
            if (f7mVar == null) {
                f7mVar = new f7m(str);
                this.f13627a.put(str, f7mVar);
            }
            switch (str2.hashCode()) {
                case -2129294769:
                    if (str2.equals("startTime")) {
                        f7mVar.F(bridgeCallback);
                        return;
                    }
                    break;
                case -1992012396:
                    if (str2.equals("duration")) {
                        JSONObject t = f7mVar.t();
                        if (f7mVar.u()) {
                            t.put((JSONObject) "duration", (String) Float.valueOf(f7mVar.D().getDuration() / 1000.0f));
                        } else {
                            t.put((JSONObject) "duration", (String) Float.valueOf(0.0f));
                        }
                        bridgeCallback.sendBridgeResponse(new BridgeResponse(t));
                        return;
                    }
                    break;
                case -1522036513:
                    if (str2.equals("buffered")) {
                        JSONObject t2 = f7mVar.t();
                        t2.put((JSONObject) "buffered", (String) Integer.valueOf(f7mVar.w()));
                        if (f7mVar.H()) {
                            t2.put((JSONObject) "buffered", (String) 100);
                        }
                        bridgeCallback.sendBridgeResponse(new BridgeResponse(t2));
                        return;
                    }
                    break;
                case -995321554:
                    if (str2.equals("paused")) {
                        JSONObject t3 = f7mVar.t();
                        t3.put((JSONObject) "paused", (String) Boolean.valueOf(!f7mVar.I()));
                        bridgeCallback.sendBridgeResponse(new BridgeResponse(t3));
                        return;
                    }
                    break;
                case -810883302:
                    if (str2.equals(Constant.PROP_TTS_VOLUME)) {
                        f7mVar.G(bridgeCallback);
                        return;
                    }
                    break;
                case 114148:
                    if (str2.equals("src")) {
                        f7mVar.E(bridgeCallback);
                        return;
                    }
                    break;
                case 3327652:
                    if (str2.equals("loop")) {
                        f7mVar.C(bridgeCallback);
                        return;
                    }
                    break;
                case 393706882:
                    if (str2.equals("isRecordAudioPlayState")) {
                        f7mVar.A(bridgeCallback);
                        return;
                    }
                    break;
                case 601235430:
                    if (str2.equals(tmu.CURRENT_TIME)) {
                        JSONObject t4 = f7mVar.t();
                        if (f7mVar.u()) {
                            t4.put((JSONObject) tmu.CURRENT_TIME, (String) Float.valueOf(f7mVar.D().getCurrentPosition() / 1000.0f));
                        } else {
                            t4.put((JSONObject) tmu.CURRENT_TIME, (String) Float.valueOf(0.0f));
                        }
                        bridgeCallback.sendBridgeResponse(new BridgeResponse(t4));
                        return;
                    }
                    break;
                case 1439562083:
                    if (str2.equals("autoplay")) {
                        f7mVar.v(bridgeCallback);
                        return;
                    }
                    break;
                case 1763557332:
                    if (str2.equals("obeyMuteSwitch")) {
                        JSONObject t5 = f7mVar.t();
                        t5.put((JSONObject) "obeyMuteSwitch", (String) Boolean.TRUE);
                        bridgeCallback.sendBridgeResponse(new BridgeResponse(t5));
                        return;
                    }
                    break;
            }
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.b("TMSForegroundAudioBridge", "getForegroundAudioOption can't find optionName");
        }
    }
}
