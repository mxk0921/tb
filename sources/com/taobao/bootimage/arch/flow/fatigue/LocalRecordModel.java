package com.taobao.bootimage.arch.flow.fatigue;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class LocalRecordModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String localLastShowDay;
    public int localLastShowDayCount = 0;
    public String localLastShowTime;

    static {
        t2o.a(736100397);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "LocalRecordModel{localLastShowDay='" + this.localLastShowDay + "', localLastShowDayCount=" + this.localLastShowDayCount + ", localLastShowTime='" + this.localLastShowTime + "'}";
    }
}
