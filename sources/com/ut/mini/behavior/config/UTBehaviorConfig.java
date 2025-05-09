package com.ut.mini.behavior.config;

import com.alibaba.fastjson.annotation.JSONField;
import com.ut.mini.behavior.module.ModulesConfig;
import com.ut.mini.behavior.trigger.TriggerConfig;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class UTBehaviorConfig implements Serializable {
    @JSONField(name = "module")
    public ModulesConfig modulesConfig;
    @JSONField(name = "t")
    public long timestamp;
    @JSONField(name = "trigger")
    public TriggerConfig triggerConfig;
    @JSONField(name = "v")
    public int v;

    static {
        t2o.a(962593196);
    }
}
