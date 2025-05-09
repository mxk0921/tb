package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.math.BigDecimal;
import java.math.BigInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class mak extends qa2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(962593253);
    }

    public static /* synthetic */ Object ipc$super(mak makVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ut/mini/behavior/expression/NumberEqualsOperator");
    }

    @Override // tb.qa2
    public boolean apply(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90f92b31", new Object[]{this, obj, obj2})).booleanValue();
        }
        if (!(obj == null || obj2 == null)) {
            if (as8.isBigDecimal(obj2)) {
                return ((BigDecimal) as8.coerceToPrimitiveNumber(obj, BigDecimal.class)).equals((BigDecimal) as8.coerceToPrimitiveNumber(obj2, BigDecimal.class));
            }
            if (as8.isFloatingPointType(obj2)) {
                if (as8.coerceToPrimitiveNumber(obj, Double.class).doubleValue() == as8.coerceToPrimitiveNumber(obj2, Double.class).doubleValue()) {
                    return true;
                }
                return false;
            } else if (as8.isBigInteger(obj2)) {
                return ((BigInteger) as8.coerceToPrimitiveNumber(obj, BigInteger.class)).equals((BigInteger) as8.coerceToPrimitiveNumber(obj2, BigInteger.class));
            } else {
                if (!as8.isIntegerType(obj2) || as8.coerceToPrimitiveNumber(obj, Long.class).longValue() != as8.coerceToPrimitiveNumber(obj2, Long.class).longValue()) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    @Override // tb.qa2
    public String getOperatorSymbol() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("970829e7", new Object[]{this});
        }
        return "==";
    }
}
