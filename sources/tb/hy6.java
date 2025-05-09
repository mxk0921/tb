package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class hy6 implements xkb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(464519242);
        t2o.a(464519243);
    }

    @Override // tb.xkb
    public void onError(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffe51d4e", new Object[]{this, str, str2, str3});
        }
    }

    @Override // tb.xkb
    public void onSuccess(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37d948b5", new Object[]{this, str});
        }
    }
}
