package com.taobao.android.lightbuy.message.module;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import tb.ck;
import tb.fog;
import tb.gog;
import tb.pvh;
import tb.s6x;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class LightBuyMUSModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String MODULE_NAME = "LightBuyModule";
    private final fog mMessageChannel = new fog(new s6x(getInstance()));

    static {
        t2o.a(708837409);
    }

    public LightBuyMUSModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    private void invokeOnReceiveMessage(String str, JSONObject jSONObject, gog gogVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f38f18ff", new Object[]{this, str, jSONObject, gogVar});
            return;
        }
        try {
            this.mMessageChannel.g(str, jSONObject, gogVar);
        } catch (Throwable th) {
            ck.b b = ck.b.b();
            b.l(MODULE_NAME).i("LightBuy/common").g("info", th.toString());
            ck.g().f("invokeOnReceiveMessage exception", b.a());
        }
    }

    public static /* synthetic */ Object ipc$super(LightBuyMUSModule lightBuyMUSModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/lightbuy/message/module/LightBuyMUSModule");
    }

    public static void registerModule() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c7a6ff6", new Object[0]);
            return;
        }
        ck.g().f("LightBuyMUSModule register!!", ck.b.b().l(MODULE_NAME).i("LightBuy/common").g("message", "LightBuyMUSModule register!!").a());
        MUSEngine.registerModule(MODULE_NAME, LightBuyMUSModule.class);
    }

    @MUSMethod
    public void closePage(JSONObject jSONObject, pvh pvhVar, pvh pvhVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fe89a14", new Object[]{this, jSONObject, pvhVar, pvhVar2});
        } else {
            invokeOnReceiveMessage("closePage", jSONObject, new gog(pvhVar));
        }
    }

    @MUSMethod
    public void downgradeNative(JSONObject jSONObject, pvh pvhVar, pvh pvhVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c1546f", new Object[]{this, jSONObject, pvhVar, pvhVar2});
        } else {
            invokeOnReceiveMessage("downgradeNative", jSONObject, new gog(pvhVar));
        }
    }

    @MUSMethod
    public void fireEventCall(JSONObject jSONObject, pvh pvhVar, pvh pvhVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9938999", new Object[]{this, jSONObject, pvhVar, pvhVar2});
        } else {
            invokeOnReceiveMessage("fireEventCall", jSONObject, new gog(pvhVar));
        }
    }

    @MUSMethod
    public void fireEventSyncCall(JSONObject jSONObject, pvh pvhVar, pvh pvhVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ed61fbe", new Object[]{this, jSONObject, pvhVar, pvhVar2});
        } else {
            invokeOnReceiveMessage("fireEventAsyncCall", jSONObject, new gog(pvhVar));
        }
    }

    @MUSMethod
    public void getPerformanceInfo(JSONObject jSONObject, pvh pvhVar, pvh pvhVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93a8e613", new Object[]{this, jSONObject, pvhVar, pvhVar2});
        } else {
            invokeOnReceiveMessage("getPerformanceInfo", jSONObject, new gog(pvhVar));
        }
    }

    @Override // com.taobao.android.weex_framework.module.MUSModule
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            this.mMessageChannel.b();
        }
    }

    @MUSMethod
    public void refreshCart(JSONObject jSONObject, pvh pvhVar, pvh pvhVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("218e1ca0", new Object[]{this, jSONObject, pvhVar, pvhVar2});
        } else {
            invokeOnReceiveMessage("refreshCart", jSONObject, new gog(pvhVar));
        }
    }

    @MUSMethod
    public void sendRequest(JSONObject jSONObject, pvh pvhVar, pvh pvhVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc7f88d4", new Object[]{this, jSONObject, pvhVar, pvhVar2});
        } else {
            this.mMessageChannel.d(jSONObject, new gog(pvhVar), new gog(pvhVar2));
        }
    }

    @MUSMethod
    public void viewDidAppear(JSONObject jSONObject, pvh pvhVar, pvh pvhVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4601d5ec", new Object[]{this, jSONObject, pvhVar, pvhVar2});
        } else {
            invokeOnReceiveMessage("viewDidAppear", jSONObject, new gog(pvhVar));
        }
    }
}
