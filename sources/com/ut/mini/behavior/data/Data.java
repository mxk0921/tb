package com.ut.mini.behavior.data;

import com.alibaba.fastjson.annotation.JSONField;
import com.loc.at;
import java.io.Serializable;
import java.util.List;
import tb.k68;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class Data implements Serializable {
    @JSONField(name = "d")
    public List<Data> dataList;
    @JSONField(name = at.k)
    public String key;
    @JSONField(name = k68.KEY_OP)
    public String operator;
    @JSONField(name = "v")
    public Object value;

    static {
        t2o.a(962593201);
    }
}
