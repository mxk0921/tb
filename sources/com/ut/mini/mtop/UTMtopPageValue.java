package com.ut.mini.mtop;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class UTMtopPageValue implements Serializable {
    @JSONField(name = "pg")
    public String page;
    @JSONField(name = "v")
    public List<String> valueList;

    static {
        t2o.a(962593333);
    }
}
