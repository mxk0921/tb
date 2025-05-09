package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class bir {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806355861);
    }

    public static void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be36ff92", new Object[]{str, obj});
        } else if (v2s.o().A() != null) {
            v2s.o().A().c(str, obj);
        }
    }
}
