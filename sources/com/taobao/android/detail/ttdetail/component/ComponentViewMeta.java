package com.taobao.android.detail.ttdetail.component;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ComponentViewMeta {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAME = "name";
    public static final String TYPE = "type";
    public static final String URL = "url";
    public static final String VERSION = "version";
    private String mName;
    private String mType;
    private String mUrl;
    private String mVersion;

    static {
        t2o.a(912261372);
    }

    public ComponentViewMeta(JSONObject jSONObject) {
        this.mName = jSONObject.getString("name");
        this.mType = jSONObject.getString("type");
        this.mVersion = jSONObject.getString("version");
        this.mUrl = jSONObject.getString("url");
    }

    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.mName;
    }

    public String getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        return this.mType;
    }

    public String getUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        return this.mUrl;
    }

    public String getVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this});
        }
        return this.mVersion;
    }
}
