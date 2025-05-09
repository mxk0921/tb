package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class wpz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(352322028);
    }

    public static vpz a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vpz) ipChange.ipc$dispatch("3f8726e", new Object[]{str});
        }
        return new vpz(str);
    }

    public static vpz b(aqz aqzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vpz) ipChange.ipc$dispatch("9d96db33", new Object[]{aqzVar});
        }
        vpz vpzVar = aqzVar.m;
        if (vpzVar == null) {
            return a(aqzVar.b()).b();
        }
        return vpzVar;
    }
}
