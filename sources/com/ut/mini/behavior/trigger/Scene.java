package com.ut.mini.behavior.trigger;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class Scene implements Serializable {
    @JSONField(name = "c")
    public String condition;
    @JSONField(name = "ena")
    public int enableSample;
    @JSONField(name = "e")
    public Event event;
    @JSONField(name = "n")
    public String name;

    static {
        t2o.a(962593261);
    }
}
