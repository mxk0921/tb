package com.taobao.themis.pub_kit.config;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.network.RequestParams;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import tb.a07;
import tb.ckf;
import tb.jpu;
import tb.t2o;
import tb.uj3;
import tb.xhv;
import tb.z54;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class PubRecommendClient extends com.taobao.themis.kernel.network.a<PubRecommendRequestParam, JSONObject, JSONObject> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\u0016\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/taobao/themis/pub_kit/config/PubRecommendClient$PubRecommendRequestParam;", "Lcom/taobao/themis/kernel/network/RequestParams;", "appId", "", "delta", "Lcom/alibaba/fastjson/JSONObject;", "strongGuideAlgorithmUserStayTime", "", "strongGuideAlgorithmUserClickTime", "strongGuideUserStayTime", "strongInterveneUserStayTime", "(Ljava/lang/String;Lcom/alibaba/fastjson/JSONObject;IIII)V", "toMap", "", "", "themis_pub_kit_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class PubRecommendRequestParam extends RequestParams {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final JSONObject delta;
        private final int strongGuideAlgorithmUserClickTime;
        private final int strongGuideAlgorithmUserStayTime;
        private final int strongGuideUserStayTime;
        private final int strongInterveneUserStayTime;

        static {
            t2o.a(845152263);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PubRecommendRequestParam(String str, JSONObject jSONObject, int i, int i2, int i3, int i4) {
            super(str);
            ckf.g(str, "appId");
            ckf.g(jSONObject, "delta");
            this.delta = jSONObject;
            this.strongGuideAlgorithmUserStayTime = i;
            this.strongGuideAlgorithmUserClickTime = i2;
            this.strongGuideUserStayTime = i3;
            this.strongInterveneUserStayTime = i4;
            this.version = "1.0";
            this.api = "mtop.relationrecommend.WirelessRecommend.recommend";
            this.needLogin = true;
            this.headers = kotlin.collections.a.k(jpu.a("content-type", HeaderConstant.HEADER_VALUE_OLD_TYPE));
            this.method = "POST";
        }

        public static /* synthetic */ Object ipc$super(PubRecommendRequestParam pubRecommendRequestParam, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/pub_kit/config/PubRecommendClient$PubRecommendRequestParam");
        }

        @Override // com.taobao.themis.kernel.network.RequestParams
        public Map<String, Object> toMap() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("2dd9d11d", new Object[]{this});
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("appId", 39379L);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "miniAppId", getAppId());
            jSONObject.put((JSONObject) "strongGuideAlgorithmUserStayTime", (String) Integer.valueOf(this.strongGuideAlgorithmUserStayTime));
            jSONObject.put((JSONObject) "strongGuideAlgorithmUserClickTime", (String) Integer.valueOf(this.strongGuideAlgorithmUserClickTime));
            jSONObject.put((JSONObject) "strongGuideUserStayTime", (String) Integer.valueOf(this.strongGuideUserStayTime));
            jSONObject.put((JSONObject) "strongInterveneUserStayTime", (String) Integer.valueOf(this.strongInterveneUserStayTime));
            jSONObject.put((JSONObject) "delta", this.delta.toJSONString());
            xhv xhvVar = xhv.INSTANCE;
            linkedHashMap.put("params", jSONObject.toJSONString());
            return linkedHashMap;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(845152262);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(845152261);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PubRecommendClient(PubRecommendRequestParam pubRecommendRequestParam, z54<JSONObject, JSONObject> z54Var) {
        super(pubRecommendRequestParam, z54Var);
        ckf.g(pubRecommendRequestParam, "params");
        ckf.g(z54Var, "requestListener");
    }

    public static /* synthetic */ Object ipc$super(PubRecommendClient pubRecommendClient, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/pub_kit/config/PubRecommendClient");
    }

    @Override // com.taobao.themis.kernel.network.b
    public JSONObject configFailureResponse(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f162f037", new Object[]{this, bArr});
        }
        if (bArr == null) {
            return null;
        }
        return JSON.parseObject(new String(bArr, uj3.UTF_8));
    }

    /* renamed from: d */
    public JSONObject configSuccessResponse(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("4bef92f0", new Object[]{this, bArr});
        }
        if (bArr == null) {
            return null;
        }
        try {
            Object obj = JSON.parseObject(new String(bArr, uj3.UTF_8)).getJSONObject("data").getJSONArray("result").get(0);
            if (obj instanceof JSONObject) {
                return (JSONObject) obj;
            }
            return null;
        } catch (Throwable th) {
            TMSLogger.c("PubRecommendClient", ckf.p("PubRecommendClient.configSuccessResponse: ", th.getMessage()), th);
            return null;
        }
    }
}
