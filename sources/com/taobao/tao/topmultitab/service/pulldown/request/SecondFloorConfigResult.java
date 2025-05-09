package com.taobao.tao.topmultitab.service.pulldown.request;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.business.getconfig.RefreshConfig;
import java.io.Serializable;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class SecondFloorConfigResult implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public JSONObject ext;
    public RefreshConfig refreshConfig;
    public List<JSONObject> sections;

    static {
        t2o.a(729810292);
    }

    public JSONObject getExt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a08ab512", new Object[]{this});
        }
        return this.ext;
    }

    public RefreshConfig getRefreshConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RefreshConfig) ipChange.ipc$dispatch("47778e12", new Object[]{this});
        }
        return this.refreshConfig;
    }

    public List<JSONObject> getSections() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2802a8bc", new Object[]{this});
        }
        return this.sections;
    }
}
