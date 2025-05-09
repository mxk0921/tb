package com.taobao.monitor.common;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class BundleMap implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Map<String, Object> data;

    public BundleMap(Map<String, Object> map) {
        this.data = map;
    }

    public Map<String, Object> getData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("516a2e9c", new Object[]{this});
        }
        return this.data;
    }
}
