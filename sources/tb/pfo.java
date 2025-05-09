package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class pfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(343933256);
    }

    public static pfo b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pfo) ipChange.ipc$dispatch("6aec3d58", new Object[0]);
        }
        return new o8b();
    }

    public abstract String a();
}
