package com.taobao.cus.config.model;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class CusModel implements Serializable {
    @JSONField(name = "content")
    public List<CusContentModel> content;
    @JSONField(name = "success")
    public boolean success;

    static {
        t2o.a(790626324);
    }
}
