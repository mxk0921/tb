package com.taobao.android.diagnose.config;

import java.util.HashMap;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AbnormalConfig {
    public boolean abnormalEnable = false;
    public boolean monitorMtopError = false;
    public boolean monitorMtopTime = false;
    public boolean monitorLag = false;
    public boolean monitorH5White = false;
    public boolean monitorNativeWhite = false;
    public boolean monitorBizError = false;
    public Map<String, Long> mtopFilterMap = new HashMap();
    public long mtopTimeout = 3000;
    public boolean monitorWeexWhite = false;

    static {
        t2o.a(615514154);
    }
}
