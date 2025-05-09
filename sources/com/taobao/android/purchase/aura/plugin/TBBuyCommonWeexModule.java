package com.taobao.android.purchase.aura.plugin;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import tb.ck;
import tb.p8r;
import tb.pvh;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TBBuyCommonWeexModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String MODULE_NAME = "AliBuyCommonModule";
    private final p8r mMessageChannel = new p8r(getInstance().getUIContext());

    static {
        t2o.a(708837521);
    }

    public TBBuyCommonWeexModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    private void invokeOnReceiveMessage(String str, JSONObject jSONObject, pvh pvhVar, pvh pvhVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8fcd036", new Object[]{this, str, jSONObject, pvhVar, pvhVar2});
            return;
        }
        p8r p8rVar = this.mMessageChannel;
        if (p8rVar != null) {
            try {
                p8rVar.c(str, jSONObject, pvhVar, pvhVar2);
            } catch (Throwable th) {
                ck.b b = ck.b.b();
                b.l(MODULE_NAME).i("LightBuy/common").g("info", th.toString());
                ck.g().f("invokeOnReceiveMessage exception", b.a());
            }
        }
    }

    public static /* synthetic */ Object ipc$super(TBBuyCommonWeexModule tBBuyCommonWeexModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/purchase/aura/plugin/TBBuyCommonWeexModule");
    }

    public static void registerModule() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c7a6ff6", new Object[0]);
        } else {
            MUSEngine.registerModule(MODULE_NAME, TBBuyCommonWeexModule.class);
        }
    }

    @MUSMethod
    public void verifyRP(JSONObject jSONObject, pvh pvhVar, pvh pvhVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee22d444", new Object[]{this, jSONObject, pvhVar, pvhVar2});
        } else {
            invokeOnReceiveMessage("verifyRP", jSONObject, pvhVar, pvhVar2);
        }
    }
}
