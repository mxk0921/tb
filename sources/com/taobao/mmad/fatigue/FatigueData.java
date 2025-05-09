package com.taobao.mmad.fatigue;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class FatigueData implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public long nextShowTime;
    public int times;

    static {
        t2o.a(573571136);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "FatigueData{times=" + this.times + ", nextShowTime=" + this.nextShowTime + '}';
    }
}
