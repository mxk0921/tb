package com.ali.user.open.core.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class SerializableMap implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Map<String, String> map;

    static {
        t2o.a(71303205);
    }

    public Map<String, String> getMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("da2ef722", new Object[]{this});
        }
        return this.map;
    }

    public void setMap(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95b53044", new Object[]{this, map});
        } else {
            this.map = map;
        }
    }
}
