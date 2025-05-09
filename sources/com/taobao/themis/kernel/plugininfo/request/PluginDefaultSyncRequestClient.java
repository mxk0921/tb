package com.taobao.themis.kernel.plugininfo.request;

import com.alibaba.ariver.resource.api.models.PluginModel;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.network.RequestParams;
import com.taobao.themis.kernel.network.b;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.pl4;
import tb.r64;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class PluginDefaultSyncRequestClient extends b<PluginRequestParam, List<PluginModel>, JSONObject> implements IPluginInfoRequestClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class DataDO implements Serializable {
        public ResultDO data;

        static {
            t2o.a(839909903);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class PluginRequestParam extends RequestParams {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String loadType;
        private String params;
        private String scene;
        private Map<String, String> templateParam;

        static {
            t2o.a(839909904);
        }

        public PluginRequestParam(String str, String str2, Map<String, String> map, JSONObject jSONObject) {
            super(str);
            String str3 = "default";
            this.scene = str3;
            this.loadType = str3;
            this.params = str2;
            this.api = "mtop.taobao.miniapp.dynamic.plugin.get";
            this.needLogin = false;
            this.version = "1.0";
            this.templateParam = map;
            this.scene = jSONObject != null ? jSONObject.getString("scene") : str3;
            this.loadType = jSONObject != null ? jSONObject.getString(pl4.KEY_LOAD_TYPE) : str3;
        }

        public static /* synthetic */ Object ipc$super(PluginRequestParam pluginRequestParam, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/kernel/plugininfo/request/PluginDefaultSyncRequestClient$PluginRequestParam");
        }

        @Override // com.taobao.themis.kernel.network.RequestParams
        public Map<String, Object> toMap() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("2dd9d11d", new Object[]{this});
            }
            HashMap hashMap = new HashMap();
            hashMap.put("params", this.params);
            hashMap.putAll(this.templateParam);
            hashMap.put("scene", this.scene);
            hashMap.put(pl4.KEY_LOAD_TYPE, this.loadType);
            return hashMap;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class ResultDO implements Serializable {
        public List<PluginModel> result;

        static {
            t2o.a(839909905);
        }
    }

    static {
        t2o.a(839909902);
        t2o.a(839909901);
    }

    public static /* synthetic */ Object ipc$super(PluginDefaultSyncRequestClient pluginDefaultSyncRequestClient, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/kernel/plugininfo/request/PluginDefaultSyncRequestClient");
    }

    @Override // com.taobao.themis.kernel.plugininfo.request.IPluginInfoRequestClient
    public r64<List<PluginModel>, JSONObject> requestPluginInfo(String str, String str2, Map<String, String> map, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r64) ipChange.ipc$dispatch("e8a337be", new Object[]{this, str, str2, map, jSONObject});
        }
        return execute(new PluginRequestParam(str, str2, map, jSONObject));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.taobao.themis.kernel.network.b
    public JSONObject configFailureResponse(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f162f037", new Object[]{this, bArr});
        }
        JSONObject parseObject = JSON.parseObject(new String(bArr));
        if (parseObject != null) {
            return parseObject.getJSONObject("data");
        }
        return null;
    }

    @Override // com.taobao.themis.kernel.network.b
    public List<PluginModel> configSuccessResponse(byte[] bArr) {
        ResultDO resultDO;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("98931077", new Object[]{this, bArr});
        }
        DataDO dataDO = (DataDO) JSON.parseObject(bArr, DataDO.class, new Feature[0]);
        if (dataDO == null || (resultDO = dataDO.data) == null) {
            return null;
        }
        return resultDO.result;
    }
}
