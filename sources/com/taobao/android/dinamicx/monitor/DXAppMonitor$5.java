package com.taobao.android.dinamicx.monitor;

import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class DXAppMonitor$5 extends HashMap<String, String> {
    public final /* synthetic */ float val$consumingTime;

    public DXAppMonitor$5(float f) {
        this.val$consumingTime = f;
        put("ConsumingTime", String.valueOf(f / 1000000.0f));
    }
}
