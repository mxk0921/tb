package com.alibaba.android.ultron.engine.model;

import com.alibaba.fastjson.JSONObject;
import java.io.Serializable;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class TemplateHierarchy implements Serializable {
    public Map<String, Node> nodes;
    public String root;
    public JSONObject structure;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class Node implements Serializable {
        public JSONObject data;
        public JSONObject event;
        public String position;
        public JSONObject style;
        public String tag;

        static {
            t2o.a(157286449);
        }
    }

    static {
        t2o.a(157286448);
    }
}
