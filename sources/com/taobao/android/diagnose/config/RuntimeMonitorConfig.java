package com.taobao.android.diagnose.config;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Random;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class RuntimeMonitorConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int memCheckSample = 0;
    public int memExhaustLevel = 95;
    public int checkInterval = 200;
    @JSONField(deserialize = false, serialize = false)
    private final int memCheckRandomSample = new Random().nextInt(10000);
    public int exhaustCount = 4;

    static {
        t2o.a(615514159);
    }

    public boolean isCheckExhaustEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f039efa", new Object[]{this})).booleanValue();
        }
        if (this.memCheckSample >= this.memCheckRandomSample) {
            return true;
        }
        return false;
    }
}
