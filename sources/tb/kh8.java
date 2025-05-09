package tb;

import com.alibaba.evo.EVOExperimentCondition;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.math.BigDecimal;
import java.math.BigInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class kh8 extends ra2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(961544275);
    }

    public static /* synthetic */ Object ipc$super(kh8 kh8Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ut/abtest/bucketing/expression/EqualsOperator");
    }

    @Override // tb.ra2
    public boolean a(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90f92b31", new Object[]{this, obj, obj2})).booleanValue();
        }
        if (obj == obj2) {
            return true;
        }
        if (!(obj == null || obj2 == null)) {
            if (xr8.g(obj)) {
                return ((BigDecimal) xr8.d(obj, BigDecimal.class)).equals((BigDecimal) xr8.d(obj2, BigDecimal.class));
            }
            if (xr8.j(obj)) {
                if (xr8.d(obj, Double.class).doubleValue() == xr8.d(obj2, Double.class).doubleValue()) {
                    return true;
                }
                return false;
            } else if (xr8.h(obj)) {
                return ((BigInteger) xr8.d(obj, BigInteger.class)).equals((BigInteger) xr8.d(obj2, BigInteger.class));
            } else {
                if (xr8.l(obj)) {
                    if (xr8.d(obj, Long.class).longValue() == xr8.d(obj2, Long.class).longValue()) {
                        return true;
                    }
                    return false;
                } else if (obj instanceof Boolean) {
                    if (xr8.b(obj).booleanValue() == xr8.b(obj2).booleanValue()) {
                        return true;
                    }
                    return false;
                } else if (obj instanceof String) {
                    return xr8.f(obj).equals(xr8.f(obj2));
                } else {
                    try {
                        return obj.equals(obj2);
                    } catch (Exception e) {
                        ku0.j("EqualsOperator.apply", e);
                    }
                }
            }
        }
        return false;
    }

    @Override // tb.ra2
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("970829e7", new Object[]{this});
        }
        return EVOExperimentCondition.OPERATOR_EQUALS;
    }
}
