package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class g3s implements vvd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806354981);
        t2o.a(806355909);
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b0d444cf", new Object[]{this})).intValue();
        }
        return 0;
    }

    public float b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4f50d174", new Object[]{this})).floatValue();
        }
        return 0.0f;
    }
}
