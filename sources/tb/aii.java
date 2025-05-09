package tb;

import com.alibaba.ability.result.ExecuteResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class aii extends c8<ExecuteResult> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596693);
    }

    public aii(ExecuteResult executeResult) {
        super(executeResult);
    }

    public static /* synthetic */ Object ipc$super(aii aiiVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/eventchain/MegaAbilityFinishResult");
    }

    @Override // tb.c8
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2d4ed19", new Object[]{this})).booleanValue();
        }
        if (a() != null && a().getStatusCode() > 99) {
            return true;
        }
        return false;
    }
}
