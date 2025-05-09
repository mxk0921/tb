package com.taobao.themis.kernel.preload;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.inside.adapter.TLogAdapterImpl;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.network.RequestParams;
import com.taobao.themis.kernel.network.b;
import java.util.HashMap;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class GetTopAppClient extends b<getTopAppParam, JSONArray, JSONObject> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class getTopAppParam extends RequestParams {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(839909909);
        }

        public getTopAppParam(String str) {
            super(str);
            this.api = "mtop.taobao.miniapp.top.get";
            this.version = "1.0";
        }

        public static /* synthetic */ Object ipc$super(getTopAppParam gettopappparam, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/kernel/preload/GetTopAppClient$getTopAppParam");
        }

        @Override // com.taobao.themis.kernel.network.RequestParams
        public Map<String, Object> toMap() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("2dd9d11d", new Object[]{this});
            }
            HashMap hashMap = new HashMap();
            hashMap.put("client_code", "taobao");
            return hashMap;
        }
    }

    static {
        t2o.a(839909908);
    }

    public static /* synthetic */ Object ipc$super(GetTopAppClient getTopAppClient, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/kernel/preload/GetTopAppClient");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.taobao.themis.kernel.network.b
    public JSONObject configFailureResponse(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f162f037", new Object[]{this, bArr});
        }
        return null;
    }

    /* renamed from: a */
    public JSONArray configSuccessResponse(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("c229f86e", new Object[]{this, bArr});
        }
        try {
            JSONObject jSONObject = ((JSONObject) JSON.parseObject(bArr, JSONObject.class, new Feature[0])).getJSONObject("data");
            if (jSONObject != null && !jSONObject.isEmpty()) {
                return jSONObject.getJSONArray("result");
            }
            return null;
        } catch (Exception e) {
            TMSLogger.c(TLogAdapterImpl.TLOG_MODULE, "configSuccessResponseError", e);
            return null;
        }
    }
}
