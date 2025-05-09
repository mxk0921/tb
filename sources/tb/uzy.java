package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class uzy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(352321991);
    }

    public static xpz a(aqz aqzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xpz) ipChange.ipc$dispatch("d52e0026", new Object[]{aqzVar});
        }
        return rzy.b(aqzVar);
    }
}
