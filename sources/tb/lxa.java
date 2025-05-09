package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class lxa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092719);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c3610c6", new Object[]{str});
        } else if (v2s.o().A() != null) {
            v2s.o().A().c("HighlightBundle", str);
        }
    }
}
