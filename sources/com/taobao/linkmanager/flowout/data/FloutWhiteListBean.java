package com.taobao.linkmanager.flowout.data;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class FloutWhiteListBean implements Serializable {
    @JSONField(name = "link")
    public String link;
    @JSONField(name = "name")
    public String name;
    @JSONField(name = "packageName")
    public String packageName;
    @JSONField(name = "schemes")
    public String[] schemes;
    @JSONField(name = "supportAfcLink")
    public boolean supportAfcLink;

    static {
        t2o.a(744489100);
    }
}
