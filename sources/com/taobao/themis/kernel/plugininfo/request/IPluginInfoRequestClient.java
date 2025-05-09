package com.taobao.themis.kernel.plugininfo.request;

import com.alibaba.ariver.resource.api.models.PluginModel;
import com.alibaba.fastjson.JSONObject;
import com.taobao.themis.kernel.basic.DefaultAdapterImpl;
import java.util.List;
import java.util.Map;
import tb.n8s;
import tb.r64;

/* compiled from: Taobao */
@DefaultAdapterImpl("com.taobao.themis.plugininfo.request.PluginDefaultSyncRequestClient")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface IPluginInfoRequestClient extends n8s {
    r64<List<PluginModel>, JSONObject> requestPluginInfo(String str, String str2, Map<String, String> map, JSONObject jSONObject);
}
