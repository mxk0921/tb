package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class da8 extends qa2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(962593238);
    }

    public static /* synthetic */ Object ipc$super(da8 da8Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ut/mini/behavior/expression/EkOperator");
    }

    @Override // tb.qa2
    public boolean apply(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90f92b31", new Object[]{this, obj, obj2})).booleanValue();
        }
        if (obj != null) {
            return true;
        }
        return false;
    }

    @Override // tb.qa2
    public String getOperatorSymbol() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("970829e7", new Object[]{this});
        }
        return "ek";
    }
}
