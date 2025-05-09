package com.alibaba.android.ultron.engine.model;

import com.alibaba.fastjson.JSONObject;
import java.io.Serializable;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class Template implements Serializable {
    public List<Block> blocks;
    public JSONObject globalStyle;
    public TemplateHierarchy hierarchy;
    public String name;
    public Long templateId;
    public Integer version;

    static {
        t2o.a(157286446);
    }
}
