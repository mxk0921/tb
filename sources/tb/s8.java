package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class s8 extends n9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public oz8 h;

    static {
        t2o.a(336592927);
    }

    public static /* synthetic */ Object ipc$super(s8 s8Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilitykit/AKFullTracingRuntimeContext");
    }

    public void n(oz8 oz8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f95ba66d", new Object[]{this, oz8Var});
        } else {
            this.h = oz8Var;
        }
    }
}
