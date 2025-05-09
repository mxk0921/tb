package com.taobao.themis.kernel.metaInfo.appinfo.storage;

import com.alibaba.ariver.resource.api.models.AppModel;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class AppInfoDao implements Serializable {
    public String appId;
    public AppModel appInfo;
    public String extra;
    public Long id;
    public long lastRequestTimeStamp;
    public long lastUsedTimeStamp;
    public String templateId;
    public String type;
    public String version;

    static {
        t2o.a(839909800);
    }
}
