package com.taobao.themis.kernel.metaInfo.appinfo.request;

import com.alibaba.ariver.resource.api.models.AppInfoRequestModel;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.metaInfo.appinfo.core.requestConfig.AbsAppInfoRequestConfig;
import com.taobao.themis.kernel.network.RequestParams;
import com.taobao.themis.kernel.network.b;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.r64;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class AppInfoDefaultRequestClient extends b<AppInfoRequestParams, List<AppInfoRequestModel>, JSONObject> implements IAppInfoRequestClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class AppInfoRequestParams extends RequestParams {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public AbsAppInfoRequestConfig mParams;

        static {
            t2o.a(839909796);
        }

        public static /* synthetic */ Object ipc$super(AppInfoRequestParams appInfoRequestParams, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/kernel/metaInfo/appinfo/request/AppInfoDefaultRequestClient$AppInfoRequestParams");
        }

        @Override // com.taobao.themis.kernel.network.RequestParams
        public Map<String, Object> toMap() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("2dd9d11d", new Object[]{this});
            }
            HashMap hashMap = new HashMap();
            hashMap.put("apps", JSON.toJSONString(this.mParams.a()));
            hashMap.put("sdk_version", "1.2.0");
            return hashMap;
        }

        public AppInfoRequestParams(AbsAppInfoRequestConfig absAppInfoRequestConfig) {
            super(null);
            this.mParams = absAppInfoRequestConfig;
            if (absAppInfoRequestConfig == null || absAppInfoRequestConfig.c != AbsAppInfoRequestConfig.AppInfoRequestScene.PRELOAD) {
                this.api = "mtop.taobao.miniapp.fusion.appinfo.get";
            } else {
                this.api = "mtop.taobao.miniapp.fusion.appinfo.preload.get";
            }
            this.version = "1.0";
            TMSLogger.b("AppInfoDefaultRequestClient", "AppInfoRequestParams mtop api: " + this.api);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class DataDO implements Serializable {
        public ResultDO data;

        static {
            t2o.a(839909797);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class ResultDO implements Serializable {
        public List<AppInfoRequestModel> result;

        static {
            t2o.a(839909798);
        }
    }

    static {
        t2o.a(839909795);
        t2o.a(839909799);
    }

    public static /* synthetic */ Object ipc$super(AppInfoDefaultRequestClient appInfoDefaultRequestClient, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/kernel/metaInfo/appinfo/request/AppInfoDefaultRequestClient");
    }

    @Override // com.taobao.themis.kernel.metaInfo.appinfo.request.IAppInfoRequestClient
    public r64<List<AppInfoRequestModel>, JSONObject> requestAppInfo(AbsAppInfoRequestConfig absAppInfoRequestConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r64) ipChange.ipc$dispatch("db556318", new Object[]{this, absAppInfoRequestConfig});
        }
        return execute(new AppInfoRequestParams(absAppInfoRequestConfig));
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
    public List<AppInfoRequestModel> configSuccessResponse(byte[] bArr) {
        ResultDO resultDO;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("98931077", new Object[]{this, bArr});
        }
        TMSLogger.a("AppInfoDefaultRequestClient", new String(bArr));
        DataDO dataDO = (DataDO) JSON.parseObject(bArr, DataDO.class, new Feature[0]);
        if (dataDO == null || (resultDO = dataDO.data) == null) {
            return null;
        }
        return resultDO.result;
    }
}
