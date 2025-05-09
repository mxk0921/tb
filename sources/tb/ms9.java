package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ms9 extends g10 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(491782772);
    }

    public static /* synthetic */ Object ipc$super(ms9 ms9Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/biz/videoplaycontrollerservice/impl/strategy/focusarea/FocusAreaBottomSequencerStrategy");
    }

    @Override // tb.g10
    public int c(a69 a69Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5632af47", new Object[]{this, a69Var})).intValue();
        }
        return a69Var.a().bottom;
    }
}
