package com.taobao.search.jarvis;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import com.taobao.android.xsearchplugin.muise.SFMuiseSDK;
import tb.cnx;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class MUSJarvisKitModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815792276);
    }

    public MUSJarvisKitModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    public static /* synthetic */ Object ipc$super(MUSJarvisKitModule mUSJarvisKitModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/jarvis/MUSJarvisKitModule");
    }

    @MUSMethod
    public final void recordItemClick(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2f854e5", new Object[]{this, jSONObject});
        } else if (!getInstance().isDestroyed()) {
            Object tag = getInstance().getTag(SFMuiseSDK.MUISE_EVENT_LISTENER);
            cnx cnxVar = tag instanceof cnx ? (cnx) tag : null;
            if (cnxVar != null) {
                cnxVar.m2("recordItemClick", jSONObject, null, null);
            }
        }
    }
}
