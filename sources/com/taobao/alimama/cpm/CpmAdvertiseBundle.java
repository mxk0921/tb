package com.taobao.alimama.cpm;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class CpmAdvertiseBundle implements Serializable, Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "ads")
    public Map<String, CpmAdvertise> advertises;
    @JSONField(name = "cache_time_in_millis")
    public long cacheTimeInMillis;
    @JSONField(name = "time_stamp")
    public long timeStamp;
    @JSONField(name = "user_nick")
    public String userNick;

    static {
        t2o.a(1017118784);
    }

    public CpmAdvertiseBundle clone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CpmAdvertiseBundle) ipChange.ipc$dispatch("8dd1cc81", new Object[]{this});
        }
        try {
            CpmAdvertiseBundle cpmAdvertiseBundle = (CpmAdvertiseBundle) super.clone();
            cpmAdvertiseBundle.advertises = new HashMap();
            for (Map.Entry<String, CpmAdvertise> entry : this.advertises.entrySet()) {
                cpmAdvertiseBundle.advertises.put(entry.getKey(), entry.getValue().clone());
            }
            return cpmAdvertiseBundle;
        } catch (CloneNotSupportedException unused) {
            return this;
        }
    }
}
