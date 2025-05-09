package com.taobao.themis.kernel.metaInfo.manifest;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class ResourcePrefetch implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private JSONObject headers;
    private String mimeType;
    private String pageId;
    private List<String> queryParams;
    private String src;

    static {
        t2o.a(839909824);
    }

    public final JSONObject getHeaders() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1ff596f7", new Object[]{this});
        }
        return this.headers;
    }

    public final String getMimeType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6adace75", new Object[]{this});
        }
        return this.mimeType;
    }

    public final String getPageId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("551c67f9", new Object[]{this});
        }
        return this.pageId;
    }

    public final List<String> getQueryParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2e28c4a8", new Object[]{this});
        }
        return this.queryParams;
    }

    public final String getSrc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2bd8590b", new Object[]{this});
        }
        return this.src;
    }

    public final void setHeaders(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf8e9505", new Object[]{this, jSONObject});
        } else {
            this.headers = jSONObject;
        }
    }

    public final void setMimeType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b5c5aa1", new Object[]{this, str});
        } else {
            this.mimeType = str;
        }
    }

    public final void setPageId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee1a849d", new Object[]{this, str});
        } else {
            this.pageId = str;
        }
    }

    public final void setQueryParams(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f271824", new Object[]{this, list});
        } else {
            this.queryParams = list;
        }
    }

    public final void setSrc(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dbfab33", new Object[]{this, str});
        } else {
            this.src = str;
        }
    }
}
