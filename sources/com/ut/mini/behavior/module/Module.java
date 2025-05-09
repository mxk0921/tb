package com.ut.mini.behavior.module;

import com.alibaba.fastjson.annotation.JSONField;
import com.ut.mini.behavior.data.Data;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class Module implements Serializable {
    @JSONField(name = "ds")
    public Data data;
    @JSONField(name = "n")
    public String name;

    static {
        t2o.a(962593255);
    }
}
