package com.ali.user.mobile.login.model;

import java.io.Serializable;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class NeedLoginLimitStrategies implements Serializable {
    public List<String> actionPoints;
    public long endTime;
    public int limitLoginCapacity;
    public int limitLoginTimeWindow;
    public long startTime;
    public String strategyId;

    static {
        t2o.a(69206131);
    }
}
