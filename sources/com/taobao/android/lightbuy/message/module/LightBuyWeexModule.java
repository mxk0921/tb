package com.taobao.android.lightbuy.message.module;

import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexMethod;
import com.taobao.android.weex.WeexModule;
import com.taobao.android.weex.b;
import tb.ck;
import tb.d7x;
import tb.f4x;
import tb.fog;
import tb.gog;
import tb.s6x;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class LightBuyWeexModule implements WeexModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String MODULE_NAME = "LightBuyModule";
    private fog mMessageChannel;

    static {
        t2o.a(708837410);
        t2o.a(982515802);
    }

    private void invokeOnReceiveMessage(String str, JSONObject jSONObject, gog gogVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f38f18ff", new Object[]{this, str, jSONObject, gogVar});
            return;
        }
        fog fogVar = this.mMessageChannel;
        if (fogVar != null) {
            try {
                fogVar.g(str, jSONObject, gogVar);
            } catch (Throwable th) {
                ck.b b = ck.b.b();
                b.l(MODULE_NAME).i("LightBuy/common").g("info", th.toString());
                ck.g().f("invokeOnReceiveMessage exception", b.a());
            }
        }
    }

    public static void registerModule() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c7a6ff6", new Object[0]);
        } else {
            b.d().registerModule(MODULE_NAME, LightBuyWeexModule.class);
        }
    }

    @WeexMethod(uiThread = false)
    public void closePage(JSONObject jSONObject, f4x f4xVar, f4x f4xVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cecc5e", new Object[]{this, jSONObject, f4xVar, f4xVar2});
        } else {
            invokeOnReceiveMessage("closePage", jSONObject, new gog(f4xVar));
        }
    }

    @WeexMethod(uiThread = false)
    public void downgradeNative(JSONObject jSONObject, f4x f4xVar, f4x f4xVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea0fb2b9", new Object[]{this, jSONObject, f4xVar, f4xVar2});
        } else {
            invokeOnReceiveMessage("downgradeNative", jSONObject, new gog(f4xVar));
        }
    }

    @WeexMethod(uiThread = false)
    public void fireEventAsyncCall(JSONObject jSONObject, f4x f4xVar, f4x f4xVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1af538f", new Object[]{this, jSONObject, f4xVar, f4xVar2});
        } else {
            invokeOnReceiveMessage("fireEventAsyncCall", jSONObject, new gog(f4xVar));
        }
    }

    @WeexMethod(uiThread = true)
    public void fireEventCall(JSONObject jSONObject, f4x f4xVar, f4x f4xVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61310fe3", new Object[]{this, jSONObject, f4xVar, f4xVar2});
        } else {
            invokeOnReceiveMessage("fireEventCall", jSONObject, new gog(f4xVar));
        }
    }

    @WeexMethod(uiThread = false)
    public void getPerformanceInfo(JSONObject jSONObject, f4x f4xVar, f4x f4xVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa86d45d", new Object[]{this, jSONObject, f4xVar, f4xVar2});
        } else {
            invokeOnReceiveMessage("getPerformanceInfo", jSONObject, new gog(f4xVar));
        }
    }

    @Override // com.taobao.android.weex.WeexModule
    public void onInit(String str, d7x d7xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb16df30", new Object[]{this, str, d7xVar});
            return;
        }
        Log.e(MODULE_NAME, "onInit ");
        this.mMessageChannel = new fog(new s6x(d7xVar.getInstance()));
    }

    @Override // com.taobao.android.weex.WeexModule
    public void onJSThreadDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5d6488f", new Object[]{this});
            return;
        }
        Log.e(MODULE_NAME, "onJSThreadDestroy ");
        fog fogVar = this.mMessageChannel;
        if (fogVar != null) {
            fogVar.b();
        }
    }

    @Override // com.taobao.android.weex.WeexModule
    public void onMainThreadDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e24a1dbf", new Object[]{this});
        } else {
            Log.e(MODULE_NAME, "onJSThreadDestroy ");
        }
    }

    @WeexMethod(uiThread = false)
    public void refreshCart(JSONObject jSONObject, f4x f4xVar, f4x f4xVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc17eea", new Object[]{this, jSONObject, f4xVar, f4xVar2});
        } else {
            invokeOnReceiveMessage("refreshCart", jSONObject, new gog(f4xVar));
        }
    }

    @WeexMethod(uiThread = false)
    public void sendRequest(JSONObject jSONObject, f4x f4xVar, f4x f4xVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94d0bb1e", new Object[]{this, jSONObject, f4xVar, f4xVar2});
            return;
        }
        fog fogVar = this.mMessageChannel;
        if (fogVar != null) {
            fogVar.d(jSONObject, new gog(f4xVar), new gog(f4xVar2));
        }
    }
}
