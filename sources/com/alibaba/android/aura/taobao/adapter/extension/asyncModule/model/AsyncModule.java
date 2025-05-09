package com.alibaba.android.aura.taobao.adapter.extension.asyncModule.model;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AsyncModule implements Serializable {
    @JSONField(name = "v-if")
    public String condition;
    @JSONField(name = "dependencyRequest")
    public DependencyRequest dependencyRequest;
    @JSONField(name = "kvmap")
    public List<KVMapping> kvMappings;
    @JSONField(name = "mtopConfig")
    public MTopConfigModel mtopConfigModel;
    @JSONField(name = "R")
    public RModel r;
    @JSONField(name = "relateComponents")
    public List<RelateComponent> relateComponents;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class DependencyRequest implements Serializable {
        @JSONField(name = "mtopConfig")
        public MTopConfigModel mtopConfigModel;

        static {
            t2o.a(81788977);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class KVMapping implements Serializable {
        @JSONField(name = "source")
        public String source;
        @JSONField(name = "target")
        public String target;

        static {
            t2o.a(81788978);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class MTopConfigModel implements Serializable {
        @JSONField(name = "apiMethod")
        public String apiMethod;
        @JSONField(name = "apiVersion")
        public String apiVersion;
        @JSONField(name = "data")
        public JSONObject requestData;

        static {
            t2o.a(81788979);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class RModel implements Serializable {
        @JSONField(name = "onFailed")
        public ResponseCallbackModel failedCallback;
        @JSONField(name = "onSuccess")
        public ResponseCallbackModel successCallback;

        static {
            t2o.a(81788980);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class RelateComponent implements Serializable {
        @JSONField(name = "v-if")
        public String condition;
        @JSONField(name = "kvmap")
        public List<KVMapping> kvMappings;
        @JSONField(name = "R")
        public RModel r;
        @JSONField(name = "target")
        public String target;

        static {
            t2o.a(81788981);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class ResponseCallbackModel implements Serializable {
        @JSONField(name = "events")
        public List<JSONObject> events;
        @JSONField(name = "payload")
        public JSONObject payload;

        static {
            t2o.a(81788982);
        }
    }

    static {
        t2o.a(81788976);
    }
}
