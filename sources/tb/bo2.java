package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class bo2 extends pz8 implements uy8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public bo2(s9u s9uVar, String str, String str2, long j, Map<String, Object> map, List<utn> list) {
        super(s9uVar, str, str2, j, map, list, "Business");
    }

    public static /* synthetic */ Object ipc$super(bo2 bo2Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/analysis/v3/BusinessSpanImpl");
    }

    @Override // tb.uy8
    public void e(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("249768ff", new Object[]{this, l});
            return;
        }
        T0(l);
        s1(p6j.MTOP_STAGE_DATAPARSE).b(l);
    }

    @Override // tb.uy8
    public void n0(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f601053c", new Object[]{this, l});
        } else {
            s1(mr.PRE_PROCESS).b(l);
        }
    }

    @Override // tb.uy8
    public void o(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2306d0a7", new Object[]{this, l});
            return;
        }
        T0(l);
        s1(fdv.F_NETWORK_REQUEST).b(l);
    }
}
