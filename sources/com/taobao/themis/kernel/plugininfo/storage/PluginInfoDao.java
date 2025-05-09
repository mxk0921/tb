package com.taobao.themis.kernel.plugininfo.storage;

import com.alibaba.ariver.resource.api.models.PluginModel;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class PluginInfoDao implements Serializable {
    public String extra;
    public long id;
    public long lastRequestTimeStamp;
    public long lastUsedTimeStamp;
    public String pluginId;
    public PluginModel pluginInfo;
    public String type;
    public String version;

    static {
        t2o.a(839909906);
    }
}
