package com.taobao.taolive.sdk.model.message;

import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ExplainBehaviorReportMessage {
    public String explainType;
    public List<Segment> segmentList;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class Segment {
        public String explainEndTime;
        public long explainItemId;
        public String explainStartTime;
        public String explainTopicId;
        public long liveId;

        static {
            t2o.a(806356318);
        }
    }

    static {
        t2o.a(806356317);
    }
}
