package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class n27 implements xnc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(519045169);
        t2o.a(519045170);
    }

    @Override // tb.xnc
    public void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb83980", new Object[]{this, str, str2});
        } else {
            oph.a(str, str2);
        }
    }

    @Override // tb.xnc
    public void w(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefb3f92", new Object[]{this, str, str2});
        } else {
            oph.c(str, str2);
        }
    }
}
