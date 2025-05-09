package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class xj7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static dgl f31421a;

    static {
        t2o.a(806355851);
    }

    public static int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3cec5212", new Object[0])).intValue();
        }
        if (f31421a == null && v2s.o().h() != null) {
            f31421a = v2s.o().h().a();
        }
        dgl dglVar = f31421a;
        if (dglVar != null) {
            return dglVar.f17798a;
        }
        return -1;
    }
}
