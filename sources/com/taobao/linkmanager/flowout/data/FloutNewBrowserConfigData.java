package com.taobao.linkmanager.flowout.data;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class FloutNewBrowserConfigData implements Serializable {
    @JSONField(name = "defaultStrategy")
    public Integer defaultStrategy;
    @JSONField(name = "hostStrategy")
    public Map<String, Integer> hostStrategy;
    @JSONField(name = "hostStrategyPlus")
    public Map<String, FloutNewBrowserHostBean> hostStrategyPlus;
    @JSONField(name = "name")
    public String name;

    static {
        t2o.a(744489095);
    }
}
