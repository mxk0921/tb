package com.taobao.schedule;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import tb.rb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ServerResponseBean implements Serializable {
    @JSONField(name = "api")
    public String api;
    @JSONField(name = "data")
    public ServerStrategy data;
    @JSONField(name = rb.RESULT_KEY)
    public String[] ret;
    @JSONField(name = "v")
    public String v;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class AbilityContent implements Serializable {
        @JSONField(name = "abHit")
        public Map<String, Map<String, String>> abHit;
        @JSONField(name = "errorCode")
        public String errorCode;
        @JSONField(name = "errorMsg")
        public String errorMsg;
        @JSONField(name = "expiredTime")
        public long expiredTime;
        @JSONField(name = "strategies")
        public List<AbilityStrategy> strategies;
        @JSONField(name = "success")
        public boolean success;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class AbilityStrategy implements Serializable {
        @JSONField(name = "cache")
        public boolean cache;
        @JSONField(name = "ext")
        public JSONObject ext;
        @JSONField(name = "loadWhenIdle")
        public boolean loadWhenIdle;
        @JSONField(name = "templates")
        public JSONObject templates;
        @JSONField(name = "type")
        public String type;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class ServerStrategy implements Serializable {
        @JSONField(name = "abilityContent")
        public Map<String, AbilityContent> abilityContent;

        public ServerStrategy() {
        }
    }
}
