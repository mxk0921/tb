package com.taobao.themis.kernel.metaInfo.appinfo.core.requestConfig;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.entity.InstanceStartParams;
import com.taobao.themis.kernel.metaInfo.appinfo.core.requestConfig.AbsAppInfoRequestConfig;
import java.util.Arrays;
import java.util.List;
import tb.es6;
import tb.ies;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class b extends AbsAppInfoRequestConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final List<String> f = Arrays.asList("nbsn", "nbsource", "nbsv", "query");
    public final AbsAppInfoRequestConfig.BasicRequestParam d;
    public InstanceStartParams e;

    public b(AbsAppInfoRequestConfig.BasicRequestParam basicRequestParam) {
        this.d = basicRequestParam;
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/kernel/metaInfo/appinfo/core/requestConfig/AppInfoRequestConfig");
    }

    @Override // com.taobao.themis.kernel.metaInfo.appinfo.core.requestConfig.AbsAppInfoRequestConfig
    public JSONArray a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("e1aa6fde", new Object[]{this});
        }
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("appId", (Object) this.d.appId);
        if (!"*".equals(this.d.version)) {
            jSONObject.put("version", (Object) this.d.version);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject.put("params", (Object) jSONObject2);
        jSONObject2.put("url", (Object) this.d.url);
        if (!TextUtils.isEmpty(this.d.url)) {
            Uri g = ies.g(this.d.url);
            for (String str : f) {
                if (!TextUtils.isEmpty(g.getQueryParameter(str))) {
                    jSONObject2.put(str, (Object) g.getQueryParameter(str));
                }
            }
        }
        AbsAppInfoRequestConfig.AppInfoRequestScene appInfoRequestScene = this.c;
        if (appInfoRequestScene != null) {
            jSONObject2.put("request_scene", (Object) appInfoRequestScene.getName());
        }
        InstanceStartParams instanceStartParams = this.e;
        if (instanceStartParams != null) {
            String string = instanceStartParams.getExtraData().getString("sellerId");
            String string2 = this.e.getExtraData().getString("sceneId");
            JSONObject jSONObject3 = new JSONObject();
            if (!TextUtils.isEmpty(string)) {
                jSONObject3.put("sellerId", (Object) string);
            }
            if (!TextUtils.isEmpty(string2)) {
                jSONObject3.put("sceneId", (Object) string2);
            }
            jSONObject.put(es6.DP_BIZ_CONTEXT, (Object) jSONObject3);
        }
        jSONArray.add(jSONObject);
        return jSONArray;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("94038553", new Object[]{this});
        }
        return this.d.appId;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a67390ae", new Object[]{this});
        }
        return this.d.templateId;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this});
        }
        return this.d.version;
    }

    static {
        t2o.a(839909790);
    }
}
