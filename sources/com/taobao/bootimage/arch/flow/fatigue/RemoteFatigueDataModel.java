package com.taobao.bootimage.arch.flow.fatigue;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class RemoteFatigueDataModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String globalLimitInSingleDay = String.valueOf(Integer.MAX_VALUE);
    public String globalLimitSeconds = "0";

    static {
        t2o.a(736100398);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "RemoteFatigueDataModel{globalLimitInSingleDay='" + this.globalLimitInSingleDay + "', globalLimitSeconds='" + this.globalLimitSeconds + "'}";
    }
}
