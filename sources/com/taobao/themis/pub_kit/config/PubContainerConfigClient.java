package com.taobao.themis.pub_kit.config;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.network.RequestParams;
import com.taobao.themis.kernel.network.a;
import java.util.HashMap;
import java.util.Map;
import tb.q9s;
import tb.t2o;
import tb.z54;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class PubContainerConfigClient extends a<PubContainerConfigRequestParam, JSONObject, JSONObject> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(845152258);
    }

    public PubContainerConfigClient(PubContainerConfigRequestParam pubContainerConfigRequestParam, z54<JSONObject, JSONObject> z54Var) {
        super(pubContainerConfigRequestParam, z54Var);
    }

    public static /* synthetic */ Object ipc$super(PubContainerConfigClient pubContainerConfigClient, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/pub_kit/config/PubContainerConfigClient");
    }

    @Override // com.taobao.themis.kernel.network.b
    public JSONObject configFailureResponse(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f162f037", new Object[]{this, bArr});
        }
        return null;
    }

    /* renamed from: d */
    public JSONObject configSuccessResponse(byte[] bArr) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("4bef92f0", new Object[]{this, bArr});
        }
        if (bArr == null || bArr.length == 0 || (jSONObject = JSON.parseObject(new String(bArr)).getJSONObject("data")) == null || jSONObject.isEmpty() || !jSONObject.containsKey("userGuideModule")) {
            return null;
        }
        return jSONObject.getJSONObject("userGuideModule");
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class PubContainerConfigRequestParam extends RequestParams {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final String API = "mtop.taobao.homepage.container.config.get";
        private static final String OLD_API = "mtop.taobao.miniapp.container.config.get";
        private JSONObject features;
        private String sourceChannel;

        static {
            t2o.a(845152259);
        }

        public PubContainerConfigRequestParam(String str, JSONObject jSONObject) {
            super(str);
            this.version = "1.0";
            this.api = getAPI();
            this.needLogin = true;
            this.features = jSONObject;
        }

        private String getAPI() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ef90fe95", new Object[]{this});
            }
            if (q9s.r1()) {
                return API;
            }
            return OLD_API;
        }

        public static /* synthetic */ Object ipc$super(PubContainerConfigRequestParam pubContainerConfigRequestParam, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/pub_kit/config/PubContainerConfigClient$PubContainerConfigRequestParam");
        }

        @Override // com.taobao.themis.kernel.network.RequestParams
        public Map<String, Object> toMap() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("2dd9d11d", new Object[]{this});
            }
            HashMap hashMap = new HashMap();
            hashMap.put("miniappId", getAppId());
            hashMap.put("pageName", "miniapp_client_container");
            JSONObject jSONObject = this.features;
            if (jSONObject != null) {
                hashMap.put("features", jSONObject.toJSONString());
            }
            String str = this.sourceChannel;
            if (str != null) {
                hashMap.put("sourceChannel", str);
            }
            return hashMap;
        }

        public PubContainerConfigRequestParam(String str) {
            super(str);
            this.version = "1.0";
            this.api = getAPI();
            this.needLogin = true;
        }

        public PubContainerConfigRequestParam(String str, String str2, JSONObject jSONObject) {
            super(str);
            this.version = "1.0";
            this.api = getAPI();
            this.needLogin = true;
            this.features = jSONObject;
            this.sourceChannel = str2;
        }
    }
}
