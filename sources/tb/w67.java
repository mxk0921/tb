package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class w67 implements ikq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(623902744);
        t2o.a(623902750);
    }

    @Override // tb.ikq
    public void b(String str, String str2, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c63596f", new Object[]{this, str, str2, strArr});
        }
    }
}
