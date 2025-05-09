package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import com.taobao.taolive.lpm_android.LpmProxy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class ff4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806355614);
    }

    public final void a(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d329b0e", new Object[]{this, str, str2, str3, str4, str5});
            return;
        }
        ckf.h(str2, "group");
        ckf.h(str3, "key");
        ckf.h(str4, "value");
        ckf.h(str5, AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE);
        try {
            qmh f = qmh.f();
            ckf.c(f, "Lpm.instance()");
            if (f.h()) {
                LpmProxy.getInstance().onRead(str, str2, str3, str4, str5);
            }
        } catch (Exception unused) {
        }
    }
}
