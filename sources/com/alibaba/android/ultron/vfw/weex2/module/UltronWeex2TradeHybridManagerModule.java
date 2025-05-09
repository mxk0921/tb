package com.alibaba.android.ultron.vfw.weex2.module;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import tb.hav;
import tb.qbv;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class UltronWeex2TradeHybridManagerModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE_NAME = "TradeHybridManager";

    static {
        t2o.a(157286963);
    }

    public UltronWeex2TradeHybridManagerModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    public static /* synthetic */ Object ipc$super(UltronWeex2TradeHybridManagerModule ultronWeex2TradeHybridManagerModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/vfw/weex2/module/UltronWeex2TradeHybridManagerModule");
    }

    @MUSMethod(uiThread = true)
    public void onStage(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb77c2b6", new Object[]{this, str, str2, jSONObject});
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            UnifyLog.e("UltronWeex2TradeHybridManagerModule.onStage", "stage or sceneName is empty");
        } else {
            JSONObject jSONObject2 = new JSONObject();
            if (!(getInstance() == null || getInstance().getUIContext() == null)) {
                jSONObject2.put("context", (Object) getInstance().getUIContext());
            }
            if (jSONObject != null) {
                jSONObject2.putAll(jSONObject);
            }
            hav.g(MODULE_NAME, "onStage:", "call success");
            qbv.j().a(str, str2, jSONObject2);
        }
    }
}
