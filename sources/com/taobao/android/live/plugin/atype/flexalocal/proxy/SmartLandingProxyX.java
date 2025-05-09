package com.taobao.android.live.plugin.atype.flexalocal.proxy;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy;
import tb.t2o;
import tb.t7q;
import tb.wzc;
import tb.x5q;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class SmartLandingProxyX implements ISmartLandingProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699617);
        t2o.a(806355246);
    }

    @Override // com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy
    public ISmartLandingProxy.b createSmartLanding(Context context, String str, String str2, String str3, ISmartLandingProxy.e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ISmartLandingProxy.b) ipChange.ipc$dispatch("e51c1f5", new Object[]{this, context, str, str2, str3, eVar}) : new x5q(context, str, null, str2, str2, null, null, str3, null, eVar);
    }

    @Override // com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy
    public ISmartLandingProxy.c createSmlDataManager(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, JSONObject jSONObject, wzc wzcVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ISmartLandingProxy.c) ipChange.ipc$dispatch("2ecdae5d", new Object[]{this, context, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, jSONObject, wzcVar}) : new t7q(context, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, jSONObject, null, wzcVar);
    }

    @Override // com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy
    public ISmartLandingProxy.b createSmartLanding(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, JSONObject jSONObject, ISmartLandingProxy.e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ISmartLandingProxy.b) ipChange.ipc$dispatch("ac57d377", new Object[]{this, context, str, str2, str3, str4, str5, str6, str7, jSONObject, eVar}) : new x5q(context, str, str2, str3, str4, str5, str6, str7, jSONObject, eVar);
    }

    @Override // com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy
    public ISmartLandingProxy.b createSmartLanding(Context context, ISmartLandingProxy.c cVar, ISmartLandingProxy.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ISmartLandingProxy.b) ipChange.ipc$dispatch("2120b185", new Object[]{this, context, cVar, eVar});
        }
        if (cVar instanceof t7q) {
            return new x5q(context, (t7q) cVar, eVar);
        }
        return null;
    }
}
