package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class g3k extends mse {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(962593251);
    }

    public static /* synthetic */ Object ipc$super(g3k g3kVar, String str, Object... objArr) {
        if (str.hashCode() == -1862718671) {
            return new Boolean(super.apply(objArr[0], objArr[1]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ut/mini/behavior/expression/NinOperator");
    }

    @Override // tb.mse, tb.qa2
    public boolean apply(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90f92b31", new Object[]{this, obj, obj2})).booleanValue();
        }
        return !super.apply(obj, obj2);
    }

    @Override // tb.mse, tb.qa2
    public String getOperatorSymbol() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("970829e7", new Object[]{this});
        }
        return "!in";
    }
}
