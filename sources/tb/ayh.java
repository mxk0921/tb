package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.scancode.v2.result.MaResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ayh extends byh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(760217784);
    }

    public static /* synthetic */ Object ipc$super(ayh ayhVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taobao/scancode/v2/parser/MaGen3ParSer");
    }

    @Override // tb.byh
    public MaResult a(eyh eyhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MaResult) ipChange.ipc$dispatch("cb2f3b98", new Object[]{this, eyhVar});
        }
        if (!vxh.f(eyhVar.f18888a, eyhVar.f, eyhVar.b)) {
            return null;
        }
        return new MaResult(eyhVar);
    }
}
