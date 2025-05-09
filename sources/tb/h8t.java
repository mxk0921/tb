package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class h8t implements ahs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(664797203);
        t2o.a(665845925);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("696095d3", new Object[]{this});
        }
        return tn1.l();
    }
}
