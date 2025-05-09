package com.alibaba.android.ultron.engine.model;

import com.alibaba.fastjson.JSONObject;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class TemplateComponent implements Serializable {
    public List<TemplateComponent> children;
    public JSONObject data;
    public JSONObject event;
    public String filter;
    public Map<String, String> frontComponentAddress;
    public Long frontComponentId;
    public Map<String, String> frontComponentMD5;
    public String frontComponentName;
    public String frontComponentVersion;
    public Long id;
    public String name;
    public String rule;
    public Long ruleId;
    public String style;
    public JSONObject supportEvent;
    public String tag;
    public Long templateId;
    public String type;

    static {
        t2o.a(157286447);
    }
}
