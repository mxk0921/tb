package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.behavior.expression.ExpressionException;
import java.math.BigDecimal;
import java.math.BigInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class sja extends pak {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(962593245);
    }

    public static /* synthetic */ Object ipc$super(sja sjaVar, String str, Object... objArr) {
        if (str.hashCode() == -1862718671) {
            return new Boolean(super.apply(objArr[0], objArr[1]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ut/mini/behavior/expression/GreaterThanOperator");
    }

    @Override // tb.pak
    public boolean apply(double d, double d2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4d5d3f79", new Object[]{this, new Double(d), new Double(d2)})).booleanValue() : d > d2;
    }

    @Override // tb.qa2
    public String getOperatorSymbol() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("970829e7", new Object[]{this});
        }
        return ">";
    }

    @Override // tb.pak
    public boolean apply(long j, long j2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4d601039", new Object[]{this, new Long(j), new Long(j2)})).booleanValue() : j > j2;
    }

    @Override // tb.pak, tb.qa2
    public boolean apply(Object obj, Object obj2) throws ExpressionException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90f92b31", new Object[]{this, obj, obj2})).booleanValue();
        }
        if (obj == obj2 || obj == null || obj2 == null) {
            return false;
        }
        return super.apply(obj, obj2);
    }

    @Override // tb.pak
    public boolean apply(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("51e63f8d", new Object[]{this, str, str2})).booleanValue() : str.compareTo(str2) > 0;
    }

    @Override // tb.pak
    public boolean apply(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b1b6c601", new Object[]{this, bigDecimal, bigDecimal2})).booleanValue() : isGreater(bigDecimal.compareTo(bigDecimal2));
    }

    @Override // tb.pak
    public boolean apply(BigInteger bigInteger, BigInteger bigInteger2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ccb51ba7", new Object[]{this, bigInteger, bigInteger2})).booleanValue() : isGreater(bigInteger.compareTo(bigInteger2));
    }
}
