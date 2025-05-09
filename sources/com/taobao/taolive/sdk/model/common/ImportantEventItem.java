package com.taobao.taolive.sdk.model.common;

import com.alibaba.fastjson.JSONObject;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ImportantEventItem implements INetDataObject {
    public JSONObject configInfo;
    public JSONObject dataMessage;
    public long disappearTime;
    public FatigueInfo fatigueInfo;
    public String isHighestPriority;
    public int priority;
    public String templateName;
    public String type;
    public UTParams utParams;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class FatigueInfo implements INetDataObject {
        public String fatigueKey;
        public long showNums;
        public long startTime;
        public long timeoutTime;

        static {
            t2o.a(806356222);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class UTParams implements INetDataObject {
        public String clickParams;
        public String showParams;

        static {
            t2o.a(806356223);
            t2o.a(806355930);
        }
    }

    static {
        t2o.a(806356221);
        t2o.a(806355930);
    }
}
