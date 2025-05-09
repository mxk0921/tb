package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class cyk extends d2g<f3d, fyk> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1004535826);
    }

    public cyk(fyk fykVar) {
        super(fykVar);
    }

    public static /* synthetic */ Object ipc$super(cyk cykVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/nexus/arch/openArch/component/OpenArchBehaviorComponent");
    }

    /* renamed from: c */
    public void a(fyk fykVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2db284e", new Object[]{this, fykVar});
        }
    }
}
