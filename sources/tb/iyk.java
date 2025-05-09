package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class iyk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1004535852);
        t2o.a(1002438711);
    }

    public final int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a190b081", new Object[]{this})).intValue();
        }
        return 0;
    }
}
