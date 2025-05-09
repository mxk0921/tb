package com.ap.zoloz.hummer.common;

import com.alibaba.fastjson.annotation.JSONField;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ClientConfig {
    @JSONField(name = "clientStartIndex")
    public int clientStartIndex = 0;
    @JSONField(name = "flowId")
    public String flowId = null;
    @JSONField(name = "factorContext")
    public Map<String, Object> factorContext = new HashMap();
    @JSONField(name = "tasks")
    public ArrayList<TaskConfig> tasks = new ArrayList<>();
    @JSONField(name = "zStack")
    public ArrayList<Map<String, String>> zStack = new ArrayList<>();

    static {
        t2o.a(245366829);
    }
}
