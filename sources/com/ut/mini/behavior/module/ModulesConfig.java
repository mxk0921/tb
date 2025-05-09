package com.ut.mini.behavior.module;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ModulesConfig implements Serializable {
    @JSONField(name = "m")
    public List<Module> moduleList;
    @JSONField(name = "t")
    public long timestamp;
    @JSONField(name = "v")
    public int version;

    static {
        t2o.a(962593256);
    }
}
