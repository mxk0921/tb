package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class z7k extends kh8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(961544287);
    }

    public static /* synthetic */ Object ipc$super(z7k z7kVar, String str, Object... objArr) {
        if (str.hashCode() == -1862718671) {
            return new Boolean(super.a(objArr[0], objArr[1]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ut/abtest/bucketing/expression/NotEqualsOperator");
    }

    @Override // tb.kh8, tb.ra2
    public boolean a(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90f92b31", new Object[]{this, obj, obj2})).booleanValue();
        }
        return !super.a(obj, obj2);
    }

    @Override // tb.kh8, tb.ra2
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("970829e7", new Object[]{this});
        }
        return "$ne";
    }
}
