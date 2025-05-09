package com.ali.user.mobile.login.model;

import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class NeedLoginStrategy implements Serializable {
    public String actionPoint;
    public long endTime;
    public int judgeLoginCapacity;
    public int judgeLoginTimeWindow;
    public int limitLoginCapacity;
    public long limitLoginTimeWindow;
    public String needLoginTrackInfo;
    public long startTime;
    public String strategyId;

    static {
        t2o.a(69206132);
    }
}
