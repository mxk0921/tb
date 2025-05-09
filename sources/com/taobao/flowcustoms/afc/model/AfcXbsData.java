package com.taobao.flowcustoms.afc.model;

import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class AfcXbsData implements Serializable {
    public static int STRATEGY_0 = 0;
    public static int STRATEGY_1 = 1;
    public static int STRATEGY_2 = 2;
    public static int STRATEGY_3 = 3;
    public static int STRATEGY_4 = 4;
    public String appKey;
    public String appName;
    public String backUrl;
    public long expireTime;
    public String tipsIcon;
    public int tipsStrategy = STRATEGY_4;
    public String type;

    static {
        t2o.a(467664941);
    }
}
