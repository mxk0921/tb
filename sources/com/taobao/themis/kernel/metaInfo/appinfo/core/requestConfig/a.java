package com.taobao.themis.kernel.metaInfo.appinfo.core.requestConfig;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.metaInfo.appinfo.core.requestConfig.AbsAppInfoRequestConfig;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class a extends AbsAppInfoRequestConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final List<AbsAppInfoRequestConfig.BasicRequestParam> d;

    static {
        t2o.a(839909789);
    }

    public a(List<AbsAppInfoRequestConfig.BasicRequestParam> list) {
        this.d = list;
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/kernel/metaInfo/appinfo/core/requestConfig/AppInfoMultiRequestConfig");
    }

    @Override // com.taobao.themis.kernel.metaInfo.appinfo.core.requestConfig.AbsAppInfoRequestConfig
    public JSONArray a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("e1aa6fde", new Object[]{this});
        }
        List<AbsAppInfoRequestConfig.BasicRequestParam> list = this.d;
        if (list == null || list.isEmpty()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (AbsAppInfoRequestConfig.BasicRequestParam basicRequestParam : this.d) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("appId", (Object) basicRequestParam.appId);
            if (!"*".equals(basicRequestParam.version)) {
                jSONObject.put("version", (Object) basicRequestParam.version);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put("params", (Object) jSONObject2);
            AbsAppInfoRequestConfig.AppInfoRequestScene appInfoRequestScene = this.c;
            if (appInfoRequestScene != null) {
                jSONObject2.put("request_scene", (Object) appInfoRequestScene.getName());
            }
            if (!TextUtils.isEmpty(basicRequestParam.url)) {
                jSONObject2.put("url", (Object) basicRequestParam.url);
            }
            jSONArray.add(jSONObject);
        }
        return jSONArray;
    }
}
