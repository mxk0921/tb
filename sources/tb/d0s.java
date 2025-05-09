package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class d0s implements xee {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(989855761);
        t2o.a(989855843);
    }

    @Override // tb.xee
    public void clearResource(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31f99ce0", new Object[]{this, str, str2, str3});
        } else {
            yox.d(str, str2, str3);
        }
    }
}
