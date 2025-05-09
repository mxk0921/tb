package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class szy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(352321989);
    }

    public static xpz a(aqz aqzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xpz) ipChange.ipc$dispatch("2cc80c5a", new Object[]{aqzVar});
        }
        return rzy.a(aqzVar);
    }

    public static xpz b(aqz aqzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xpz) ipChange.ipc$dispatch("d52e0026", new Object[]{aqzVar});
        }
        return rzy.b(aqzVar);
    }
}
