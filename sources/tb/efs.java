package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class efs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092102);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a88c12bc", new Object[]{str, str2});
        } else if (v2s.o().A() != null) {
            cwd A = v2s.o().A();
            A.c("TBMiniLive" + str, str2);
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db0cbec0", new Object[]{str, str2});
        } else if (v2s.o().A() != null) {
            cwd A = v2s.o().A();
            A.a("TBMiniLive" + str, str2);
        }
    }
}
