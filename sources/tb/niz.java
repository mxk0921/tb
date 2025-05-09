package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class niz implements kcd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(352321814);
    }

    @Override // tb.kcd
    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("39a47d30", new Object[]{this, str});
        }
        return ynm.h(str);
    }
}
