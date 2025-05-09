package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class vw7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(478151188);
    }

    public static u0c a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u0c) ipChange.ipc$dispatch("7ad0d909", new Object[0]);
        }
        return new iw7();
    }

    public static u0c b(IDMComponent iDMComponent, IDMComponent iDMComponent2, IDMComponent iDMComponent3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u0c) ipChange.ipc$dispatch("c8977e0b", new Object[]{iDMComponent, iDMComponent2, iDMComponent3});
        }
        if (kw7.x(iDMComponent3) && kw7.A(iDMComponent3) && !kw7.z(iDMComponent, iDMComponent3)) {
            return new hw7();
        }
        if (!kw7.t(iDMComponent2) && !kw7.A(iDMComponent2)) {
            return null;
        }
        if (kw7.v(iDMComponent2, iDMComponent)) {
            return new rw7();
        }
        if (kw7.y(iDMComponent2)) {
            return new gw7();
        }
        return null;
    }
}
