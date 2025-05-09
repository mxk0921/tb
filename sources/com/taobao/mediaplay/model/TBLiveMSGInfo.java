package com.taobao.mediaplay.model;

import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class TBLiveMSGInfo implements Serializable {
    public int bizCode;
    public byte[] data;
    public String from;
    public String messageId;
    public boolean needAck;
    public int priority;
    public int qosLevel;
    public boolean sendFullTags;
    public String[] tags;
    public long timestamp;
    public String to;
    public String topic;
    public int type = -1;
    public String userId;

    static {
        t2o.a(774897781);
    }
}
