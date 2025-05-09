package com.ut.mini.behavior.trigger;

import com.alibaba.fastjson.annotation.JSONField;
import com.ut.mini.behavior.data.Data;
import com.ut.mini.behavior.data.DataType;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class Event implements Serializable {
    @JSONField(name = "ds")
    public Data data;
    @JSONField(name = "t")
    public String type = DataType.Event.getValue();

    static {
        t2o.a(962593260);
    }
}
