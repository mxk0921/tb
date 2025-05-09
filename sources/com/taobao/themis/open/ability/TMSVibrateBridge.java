package com.taobao.themis.open.ability;

import android.app.Application;
import android.os.Vibrator;
import com.alibaba.ability.impl.hapticsengine.HapticsEngineAbility;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.ability.base.annotation.APIMethod;
import com.taobao.themis.kernel.ability.base.annotation.AutoCallback;
import com.taobao.themis.kernel.ability.base.annotation.BindingApiContext;
import com.taobao.themis.kernel.ability.base.annotation.ThreadType;
import com.taobao.themis.kernel.adapter.IEnvironmentService;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import kotlin.Metadata;
import tb.a07;
import tb.ckf;
import tb.j8s;
import tb.p8s;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u00020\b2\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\nJ\u0019\u0010\f\u001a\u00020\b2\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u0003¨\u0006\u0010"}, d2 = {"Lcom/taobao/themis/open/ability/TMSVibrateBridge;", "Ltb/j8s;", "<init>", "()V", "Ltb/xhv;", "onInitialized", "Lcom/taobao/themis/kernel/ability/base/ApiContext;", "apiContext", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeResponse;", "vibrateLong", "(Lcom/taobao/themis/kernel/ability/base/ApiContext;)Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeResponse;", HapticsEngineAbility.API_VIBRATE, "vibrateShort", "onFinalized", "Companion", "a", "themis_open_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSVibrateBridge implements j8s {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(843055127);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(843055126);
        t2o.a(839909427);
    }

    public final BridgeResponse a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("9ec6b3bd", new Object[]{this, new Integer(i)});
        }
        try {
            IEnvironmentService iEnvironmentService = (IEnvironmentService) p8s.b(IEnvironmentService.class);
            Application applicationContext = iEnvironmentService == null ? null : iEnvironmentService.getApplicationContext();
            if (applicationContext == null) {
                BridgeResponse bridgeResponse = BridgeResponse.UNKNOWN_ERROR;
                ckf.f(bridgeResponse, "UNKNOWN_ERROR");
                return bridgeResponse;
            }
            Object systemService = applicationContext.getApplicationContext().getSystemService("vibrator");
            if (systemService != null) {
                ((Vibrator) systemService).vibrate(i);
                BridgeResponse bridgeResponse2 = BridgeResponse.SUCCESS;
                ckf.f(bridgeResponse2, "{\n            val applic…esponse.SUCCESS\n        }");
                return bridgeResponse2;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.os.Vibrator");
        } catch (Throwable th) {
            TMSLogger.c("TMSVibrateBridge", th.getMessage(), th);
            BridgeResponse bridgeResponse3 = BridgeResponse.UNKNOWN_ERROR;
            ckf.f(bridgeResponse3, "{\n            TMSLogger.…e.UNKNOWN_ERROR\n        }");
            return bridgeResponse3;
        }
    }

    @Override // tb.j8s
    public void onFinalized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1b9dee", new Object[]{this});
        }
    }

    @Override // tb.j8s
    public void onInitialized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f2f17c", new Object[]{this});
        }
    }

    @ThreadType(ExecutorType.NORMAL)
    @AutoCallback
    @APIMethod
    public final BridgeResponse vibrate(@BindingApiContext ApiContext apiContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("4b6f7663", new Object[]{this, apiContext});
        }
        ckf.g(apiContext, "apiContext");
        return a(400);
    }

    @ThreadType(ExecutorType.NORMAL)
    @AutoCallback
    @APIMethod
    public final BridgeResponse vibrateLong(@BindingApiContext ApiContext apiContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("a6126b7f", new Object[]{this, apiContext});
        }
        ckf.g(apiContext, "apiContext");
        return a(400);
    }

    @ThreadType(ExecutorType.NORMAL)
    @AutoCallback
    @APIMethod
    public final BridgeResponse vibrateShort(@BindingApiContext ApiContext apiContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("5f192a41", new Object[]{this, apiContext});
        }
        ckf.g(apiContext, "apiContext");
        return a(40);
    }
}
