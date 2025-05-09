package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class cts {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9e6c791", new Object[]{str});
            return;
        }
        u5r.f(str);
        erj.e(str);
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fcc1858", new Object[]{str});
            return;
        }
        u5r.i(str);
        erj.f(str);
    }
}
