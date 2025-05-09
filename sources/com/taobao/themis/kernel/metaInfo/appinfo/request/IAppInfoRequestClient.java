package com.taobao.themis.kernel.metaInfo.appinfo.request;

import com.alibaba.ariver.resource.api.models.AppInfoRequestModel;
import com.alibaba.fastjson.JSONObject;
import com.taobao.themis.kernel.basic.DefaultAdapterImpl;
import com.taobao.themis.kernel.metaInfo.appinfo.core.requestConfig.AbsAppInfoRequestConfig;
import java.util.List;
import tb.n8s;
import tb.r64;

/* compiled from: Taobao */
@DefaultAdapterImpl("com.taobao.themis.kernel.metaInfo.appinfo.request.AppInfoDefaultRequestClient")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface IAppInfoRequestClient extends n8s {
    r64<List<AppInfoRequestModel>, JSONObject> requestAppInfo(AbsAppInfoRequestConfig absAppInfoRequestConfig);
}
