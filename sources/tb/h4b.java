package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class h4b extends nv1 implements nxd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(491782823);
        t2o.a(488636433);
    }

    public h4b(lza lzaVar) {
        super(lzaVar);
    }

    public static /* synthetic */ Object ipc$super(h4b h4bVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/framework/hostservice/callbcak/impl/HomeTabCallback");
    }

    @Override // tb.nxd
    public String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("22cee907", new Object[]{this});
        }
        return w().h();
    }

    @Override // tb.nxd
    public String q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4ced540f", new Object[]{this});
        }
        return w().m();
    }
}
