package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class tow implements egb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(980418607);
        t2o.a(982516195);
    }

    @Override // tb.egb
    public tae generateApmInstance(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tae) ipChange.ipc$dispatch("43902e67", new Object[]{this, str});
        }
        return new j3x();
    }
}
