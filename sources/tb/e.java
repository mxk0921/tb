package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.lpm_android.LpmProxy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806355613);
    }

    public final void a(String str, String str2, String str3, String str4, String str5, String str6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9ba0b35", new Object[]{this, str, str2, str3, str4, str5, str6});
            return;
        }
        try {
            qmh f = qmh.f();
            ckf.c(f, "Lpm.instance()");
            if (f.h()) {
                LpmProxy.getInstance().onActivate(str, str2, str3, str4, str5, str6);
            }
        } catch (Exception unused) {
        }
    }
}
