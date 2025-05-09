package com.taobao.alimama;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.ability.base.annotation.APIMethod;
import com.taobao.themis.kernel.ability.base.annotation.AutoCallback;
import com.taobao.themis.kernel.ability.base.annotation.BindingParam;
import com.taobao.themis.kernel.ability.base.annotation.ThreadType;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.utils.Global;
import java.util.HashMap;
import java.util.Map;
import tb.j8s;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class AlimamaMiniGameBridgeExtension implements j8s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1021313036);
        t2o.a(839909427);
    }

    public final Map<String, String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6d9263e9", new Object[]{this, str});
        }
        JSONObject parseObject = JSON.parseObject(str);
        if (parseObject == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str2 : parseObject.keySet()) {
            hashMap.put(str2, parseObject.getString(str2));
        }
        return hashMap;
    }

    @ThreadType(ExecutorType.SYNC)
    @APIMethod("commitIfsEvent")
    public void commitIfsEvent(@BindingParam(name = {"ifs"}) String str, @BindingParam(name = {"nameSpace"}) String str2, @BindingParam(name = {"pid"}) String str3, @BindingParam(name = {"extMap"}) String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ebf18ca", new Object[]{this, str, str2, str3, str4});
        } else {
            AlimamaAdvertising.instance().buildIfsExposure(Global.getApplication(), str).withArgPid(str3).withArgs(a(str4)).withArgNamespace(str2).commit();
        }
    }

    @ThreadType(ExecutorType.SYNC)
    @APIMethod("commitTaokeInfo")
    public void commitTaokeInfo(@BindingParam(name = {"url"}) String str, @BindingParam(name = {"sellerId"}) String str2, @BindingParam(name = {"itemId"}) String str3, @BindingParam(name = {"isTmall"}) boolean z, @BindingParam(name = {"extMap"}) String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19b94b66", new Object[]{this, str, str2, str3, new Boolean(z), str4});
        } else {
            AlimamaAdvertising.instance().commitTaokeInfo(str, str2, str3, z, a(str4));
        }
    }

    @ThreadType(ExecutorType.SYNC)
    @AutoCallback
    @APIMethod("genClickIdBy")
    public JSONObject genClickIdBy(@BindingParam(name = {"clickUrl"}) String str, @BindingParam(name = {"isOpenPage"}) boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bd5acb39", new Object[]{this, str, new Boolean(z)});
        }
        String handleAdUrlForClickid = AlimamaAdvertising.instance().handleAdUrlForClickid(str, z);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("clickid", (Object) handleAdUrlForClickid);
        return jSONObject;
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
}
