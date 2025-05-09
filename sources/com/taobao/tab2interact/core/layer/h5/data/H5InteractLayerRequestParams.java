package com.taobao.tab2interact.core.layer.h5.data;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tab2interact.core.utils.MtopUtils;
import java.util.Map;
import kotlin.collections.a;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class H5InteractLayerRequestParams extends MtopUtils.b<JSONObject> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String api = "mtop.taobao.content.detail.entity.get";
    private String version = "1.0";
    private boolean isNeedSession = true;
    private Map<String, String> headers = a.h();
    private JSONObject data = new JSONObject();

    static {
        t2o.a(689963131);
    }

    public static /* synthetic */ Object ipc$super(H5InteractLayerRequestParams h5InteractLayerRequestParams, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tab2interact/core/layer/h5/data/H5InteractLayerRequestParams");
    }

    @Override // com.taobao.tab2interact.core.utils.MtopUtils.b
    public String getApi() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("67b7a95", new Object[]{this});
        }
        return this.api;
    }

    @Override // com.taobao.tab2interact.core.utils.MtopUtils.b
    public Map<String, String> getHeaders() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("cf4415cc", new Object[]{this});
        }
        return this.headers;
    }

    @Override // com.taobao.tab2interact.core.utils.MtopUtils.b
    public String getVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this});
        }
        return this.version;
    }

    @Override // com.taobao.tab2interact.core.utils.MtopUtils.b
    public boolean isNeedSession() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64a44321", new Object[]{this})).booleanValue();
        }
        return this.isNeedSession;
    }

    @Override // com.taobao.tab2interact.core.utils.MtopUtils.b
    public void setApi(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b780bae9", new Object[]{this, str});
            return;
        }
        ckf.g(str, "<set-?>");
        this.api = str;
    }

    @Override // com.taobao.tab2interact.core.utils.MtopUtils.b
    public void setHeaders(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf00da", new Object[]{this, map});
            return;
        }
        ckf.g(map, "<set-?>");
        this.headers = map;
    }

    @Override // com.taobao.tab2interact.core.utils.MtopUtils.b
    public void setNeedSession(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1d1128f", new Object[]{this, new Boolean(z)});
        } else {
            this.isNeedSession = z;
        }
    }

    @Override // com.taobao.tab2interact.core.utils.MtopUtils.b
    public void setVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e718c27", new Object[]{this, str});
            return;
        }
        ckf.g(str, "<set-?>");
        this.version = str;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.taobao.tab2interact.core.utils.MtopUtils.b
    public JSONObject getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("b8351bc7", new Object[]{this}) : this.data;
    }

    public void setData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d09acf9d", new Object[]{this, jSONObject});
            return;
        }
        ckf.g(jSONObject, "<set-?>");
        this.data = jSONObject;
    }
}
