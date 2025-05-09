package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.scancode.v2.result.MaResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class wxh extends byh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(760217783);
    }

    public static /* synthetic */ Object ipc$super(wxh wxhVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taobao/scancode/v2/parser/MaBarParSer");
    }

    @Override // tb.byh
    public MaResult a(eyh eyhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MaResult) ipChange.ipc$dispatch("cb2f3b98", new Object[]{this, eyhVar});
        }
        if (!vxh.c(eyhVar.f18888a, eyhVar.b)) {
            return null;
        }
        return new MaResult(vxh.a(eyhVar), eyhVar.c, eyhVar.k, eyhVar.l, eyhVar.g, eyhVar.h, eyhVar.i, eyhVar.j);
    }
}
