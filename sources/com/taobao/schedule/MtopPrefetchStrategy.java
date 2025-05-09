package com.taobao.schedule;

import com.alibaba.fastjson.annotation.JSONField;
import com.taobao.message.message_open_api.ICallService;
import java.io.Serializable;
import java.util.List;
import tb.l2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MtopPrefetchStrategy implements Serializable {
    @JSONField(name = "enable")
    public boolean enable;
    @JSONField(name = "contentList")
    public List<Strategy> strategyList;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class Condition implements Serializable {
        @JSONField(name = "abKey")
        public String abKey;
        @JSONField(name = "intervalMs")
        public long interval;
        @JSONField(name = "urlFilterList")
        public List<String> urlFilterList;
        @JSONField(name = "urlMatchList")
        public List<String> urlMatchList;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class Content implements Serializable {
        @JSONField(name = "dataType")
        public String dataType;
        @JSONField(name = "expiredTime")
        public long expiredTime;
        @JSONField(name = ICallService.KEY_NEED_LOGIN)
        public boolean needLogin;
        @JSONField(name = "needSession")
        public boolean needSession;
        @JSONField(name = "needWua")
        public boolean needWua;
        @JSONField(name = "requestAddress")
        public String requestAddress;
        @JSONField(name = "requestMethod")
        public String requestMethod;
        @JSONField(name = "requestParams")
        public String requestParams;
        @JSONField(name = "requestVer")
        public String requestVer;
        @JSONField(name = "safeToken")
        public String safeToken;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class Strategy implements Serializable {
        @JSONField(name = "action")
        public String action;
        @JSONField(name = "condition")
        public Condition condition;
        @JSONField(name = "content")
        public Content content;
        @JSONField(name = l2o.COL_TASK)
        public String taskId;
    }
}
