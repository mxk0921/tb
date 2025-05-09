package com.taobao.linkmanager.flowout.data;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class FloutNewBrowserHostBean implements Serializable {
    @JSONField(name = "defaultStrategy")
    public Integer defaultStrategy;
    @JSONField(name = "path")
    public Map<String, Integer> pathStrategy;

    static {
        t2o.a(744489096);
    }
}
