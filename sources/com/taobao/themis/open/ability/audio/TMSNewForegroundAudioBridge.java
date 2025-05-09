package com.taobao.themis.open.ability.audio;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.idst.nls.nlsclientsdk.requests.Constant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.ability.base.annotation.APIMethod;
import com.taobao.themis.kernel.ability.base.annotation.BindingApiContext;
import com.taobao.themis.kernel.ability.base.annotation.BindingCallback;
import com.taobao.themis.kernel.ability.base.annotation.BindingParam;
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
import tb.fi1;
import tb.j8s;
import tb.p8s;
import tb.t2o;
import tb.tmu;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 !2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J/\u0010\f\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\rJ/\u0010\u000e\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000e\u0010\rJ;\u0010\u0010\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0010\u0010\u0011JS\u0010\u0016\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u0018\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0018\u0010\rJ/\u0010\u0019\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0019\u0010\rJ/\u0010\u001a\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u001a\u0010\rJ9\u0010\u001d\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\u001c\u001a\u00020\u001b2\b\b\u0001\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010\u001f\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u001f\u0010\rJ\u000f\u0010 \u001a\u00020\u0004H\u0016¢\u0006\u0004\b \u0010\u0003¨\u0006#"}, d2 = {"Lcom/taobao/themis/open/ability/audio/TMSNewForegroundAudioBridge;", "Ltb/j8s;", "<init>", "()V", "Ltb/xhv;", "onInitialized", "Lcom/taobao/themis/kernel/ability/base/ApiContext;", "apiContext", "", "audioPlayerId", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "callback", "startMonitorForegroundAudio", "(Lcom/taobao/themis/kernel/ability/base/ApiContext;Ljava/lang/String;Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;)V", "stopMonitorForegroundAudio", "optionName", "getForegroundAudioOption", "(Lcom/taobao/themis/kernel/ability/base/ApiContext;Ljava/lang/String;Ljava/lang/String;Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;)V", "option", "Lcom/alibaba/fastjson/JSONObject;", "params", "appXDomain", "setForegroundAudioOption", "(Lcom/taobao/themis/kernel/ability/base/ApiContext;Ljava/lang/String;Ljava/lang/String;Lcom/alibaba/fastjson/JSONObject;Ljava/lang/String;Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;)V", "playForegroundAudio", "pauseForegroundAudio", "stopForegroundAudio", "", "position", "seekForegroundAudio", "(Lcom/taobao/themis/kernel/ability/base/ApiContext;Ljava/lang/String;ILcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;)V", "destroyForegroundAudio", "onFinalized", "Companion", "a", "themis_open_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSNewForegroundAudioBridge implements j8s {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, MegaPlayerInstance> f13629a = new HashMap<>();
    public final Application.ActivityLifecycleCallbacks b = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(843055183);
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
            for (Map.Entry entry : TMSNewForegroundAudioBridge.access$getPlayers$p(TMSNewForegroundAudioBridge.this).entrySet()) {
                String str = (String) entry.getKey();
                try {
                    ((MegaPlayerInstance) entry.getValue()).pause();
                } catch (Throwable th) {
                    TMSLogger.c("TMSForegroundAudioBridge", "onActivityPaused, pause player " + str + " error: " + ((Object) th.getMessage()), th);
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
        t2o.a(843055182);
        t2o.a(839909427);
    }

    public static final /* synthetic */ HashMap access$getPlayers$p(TMSNewForegroundAudioBridge tMSNewForegroundAudioBridge) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("8db669f8", new Object[]{tMSNewForegroundAudioBridge});
        }
        return tMSNewForegroundAudioBridge.f13629a;
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
            return;
        }
        ITMSPage c = apiContext.c();
        if (c == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.b("TMSForegroundAudioBridge", "stopForegroundAudio page is null");
            return;
        }
        String str2 = TextUtils.isEmpty(str) ? "DEFAULT_PLAYER" : str;
        MegaPlayerInstance megaPlayerInstance = this.f13629a.get(str2);
        if (megaPlayerInstance == null) {
            megaPlayerInstance = new MegaPlayerInstance(str, c);
            this.f13629a.put(str2, megaPlayerInstance);
        }
        this.f13629a.remove(str2);
        megaPlayerInstance.destroy();
        fi1.c(bridgeCallback, str);
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
            String str3 = TextUtils.isEmpty(str) ? "DEFAULT_PLAYER" : str;
            MegaPlayerInstance megaPlayerInstance = this.f13629a.get(str3);
            if (megaPlayerInstance == null) {
                megaPlayerInstance = new MegaPlayerInstance(str, c);
                this.f13629a.put(str3, megaPlayerInstance);
            }
            switch (str2.hashCode()) {
                case -2129294769:
                    if (str2.equals("startTime")) {
                        fi1.a(bridgeCallback, str, "startTime", Integer.valueOf(megaPlayerInstance.K()));
                        return;
                    }
                    break;
                case -1992012396:
                    if (str2.equals("duration")) {
                        fi1.a(bridgeCallback, str, "duration", Float.valueOf(megaPlayerInstance.getDuration()));
                        return;
                    }
                    break;
                case -1522036513:
                    if (str2.equals("buffered")) {
                        fi1.a(bridgeCallback, str, "buffered", Integer.valueOf(megaPlayerInstance.b()));
                        return;
                    }
                    break;
                case -995321554:
                    if (str2.equals("paused")) {
                        fi1.a(bridgeCallback, str, "paused", Boolean.valueOf(megaPlayerInstance.g()));
                        return;
                    }
                    break;
                case -810883302:
                    if (str2.equals(Constant.PROP_TTS_VOLUME)) {
                        fi1.a(bridgeCallback, str, Constant.PROP_TTS_VOLUME, Float.valueOf(megaPlayerInstance.L()));
                        return;
                    }
                    break;
                case 114148:
                    if (str2.equals("src")) {
                        fi1.a(bridgeCallback, str, "src", megaPlayerInstance.J());
                        return;
                    }
                    break;
                case 3327652:
                    if (str2.equals("loop")) {
                        fi1.a(bridgeCallback, str, "loop", Boolean.valueOf(megaPlayerInstance.I()));
                        return;
                    }
                    break;
                case 393706882:
                    if (str2.equals("isRecordAudioPlayState")) {
                        fi1.a(bridgeCallback, str, "isRecordAudioPlayState", Boolean.FALSE);
                        return;
                    }
                    break;
                case 601235430:
                    if (str2.equals(tmu.CURRENT_TIME)) {
                        fi1.a(bridgeCallback, str, tmu.CURRENT_TIME, Float.valueOf(megaPlayerInstance.a()));
                        return;
                    }
                    break;
                case 1439562083:
                    if (str2.equals("autoplay")) {
                        fi1.a(bridgeCallback, str, "autoplay", Boolean.valueOf(megaPlayerInstance.F()));
                        return;
                    }
                    break;
                case 1763557332:
                    if (str2.equals("obeyMuteSwitch")) {
                        fi1.a(bridgeCallback, str, "obeyMuteSwitch", Boolean.TRUE);
                        return;
                    }
                    break;
            }
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.b("TMSForegroundAudioBridge", "getForegroundAudioOption can't find optionName");
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
            for (MegaPlayerInstance megaPlayerInstance : this.f13629a.values()) {
                megaPlayerInstance.destroy();
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
        String str2 = TextUtils.isEmpty(str) ? "DEFAULT_PLAYER" : str;
        MegaPlayerInstance megaPlayerInstance = this.f13629a.get(str2);
        if (megaPlayerInstance == null) {
            megaPlayerInstance = new MegaPlayerInstance(str, c);
            this.f13629a.put(str2, megaPlayerInstance);
        }
        if (megaPlayerInstance.pause()) {
            fi1.c(bridgeCallback, str);
        } else {
            fi1.b(bridgeCallback);
        }
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
        if (c == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.b("TMSForegroundAudioBridge", "playForegroundAudio page is null");
            return;
        }
        String str2 = TextUtils.isEmpty(str) ? "DEFAULT_PLAYER" : str;
        MegaPlayerInstance megaPlayerInstance = this.f13629a.get(str2);
        if (megaPlayerInstance == null) {
            megaPlayerInstance = new MegaPlayerInstance(str, c);
            this.f13629a.put(str2, megaPlayerInstance);
        }
        if (megaPlayerInstance.play()) {
            fi1.c(bridgeCallback, str);
        } else {
            fi1.b(bridgeCallback);
        }
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
        if (c == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.b("TMSForegroundAudioBridge", "stopForegroundAudio page is null");
            return;
        }
        String str2 = TextUtils.isEmpty(str) ? "DEFAULT_PLAYER" : str;
        MegaPlayerInstance megaPlayerInstance = this.f13629a.get(str2);
        if (megaPlayerInstance == null) {
            megaPlayerInstance = new MegaPlayerInstance(str, c);
            this.f13629a.put(str2, megaPlayerInstance);
        }
        if (megaPlayerInstance.seek(i)) {
            fi1.c(bridgeCallback, str);
        } else {
            fi1.b(bridgeCallback);
        }
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
        if (c == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.b("TMSForegroundAudioBridge", "stopForegroundAudio page is null");
            return;
        }
        String str2 = TextUtils.isEmpty(str) ? "DEFAULT_PLAYER" : str;
        MegaPlayerInstance megaPlayerInstance = this.f13629a.get(str2);
        if (megaPlayerInstance == null) {
            megaPlayerInstance = new MegaPlayerInstance(str, c);
            this.f13629a.put(str2, megaPlayerInstance);
        }
        if (megaPlayerInstance.stop()) {
            fi1.c(bridgeCallback, str);
        } else {
            fi1.b(bridgeCallback);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e5, code lost:
        if (r9.equals("isRecordAudioPlayState") == false) goto L_0x0171;
     */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0180 A[SYNTHETIC] */
    @com.taobao.themis.kernel.ability.base.annotation.ThreadType(com.taobao.themis.kernel.executor.ExecutorType.AUDIO)
    @com.taobao.themis.kernel.ability.base.annotation.APIMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setForegroundAudioOption(@com.taobao.themis.kernel.ability.base.annotation.BindingApiContext com.taobao.themis.kernel.ability.base.ApiContext r5, @com.taobao.themis.kernel.ability.base.annotation.BindingParam({"audioPlayerID"}) java.lang.String r6, @com.taobao.themis.kernel.ability.base.annotation.BindingParam({"option"}) java.lang.String r7, @com.taobao.themis.kernel.ability.base.annotation.BindingRequest com.alibaba.fastjson.JSONObject r8, @com.taobao.themis.kernel.ability.base.annotation.BindingParam({"__appxDomain"}) java.lang.String r9, @com.taobao.themis.kernel.ability.base.annotation.BindingCallback com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback r10) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.open.ability.audio.TMSNewForegroundAudioBridge.setForegroundAudioOption(com.taobao.themis.kernel.ability.base.ApiContext, java.lang.String, java.lang.String, com.alibaba.fastjson.JSONObject, java.lang.String, com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback):void");
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
        if (c == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.b("TMSForegroundAudioBridge", "startMonitorForegroundAudio page is null");
            return;
        }
        String str2 = TextUtils.isEmpty(str) ? "DEFAULT_PLAYER" : str;
        MegaPlayerInstance megaPlayerInstance = this.f13629a.get(str2);
        if (megaPlayerInstance == null) {
            megaPlayerInstance = new MegaPlayerInstance(str, c);
            this.f13629a.put(str2, megaPlayerInstance);
        }
        megaPlayerInstance.S(true);
        fi1.c(bridgeCallback, str);
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
        if (c == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.b("TMSForegroundAudioBridge", "stopMonitorForegroundAudio page is null");
            return;
        }
        String str2 = TextUtils.isEmpty(str) ? "DEFAULT_PLAYER" : str;
        MegaPlayerInstance megaPlayerInstance = this.f13629a.get(str2);
        if (megaPlayerInstance == null) {
            megaPlayerInstance = new MegaPlayerInstance(str, c);
            this.f13629a.put(str2, megaPlayerInstance);
        }
        megaPlayerInstance.S(false);
        fi1.c(bridgeCallback, str);
    }
}
