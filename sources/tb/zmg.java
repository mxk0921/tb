package tb;

import com.alibaba.ut.abtest.bucketing.expression.ExpressionException;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.math.BigDecimal;
import java.math.BigInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class zmg extends own {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(961544285);
    }

    public static /* synthetic */ Object ipc$super(zmg zmgVar, String str, Object... objArr) {
        if (str.hashCode() == -1862718671) {
            return new Boolean(super.a(objArr[0], objArr[1]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ut/abtest/bucketing/expression/LessThanOperator");
    }

    @Override // tb.own, tb.ra2
    public boolean a(Object obj, Object obj2) throws ExpressionException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90f92b31", new Object[]{this, obj, obj2})).booleanValue();
        }
        if (obj == obj2 || obj == null || obj2 == null) {
            return false;
        }
        return super.a(obj, obj2);
    }

    @Override // tb.ra2
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("970829e7", new Object[]{this});
        }
        return "$lt";
    }

    @Override // tb.own
    public boolean c(double d, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d5d3f79", new Object[]{this, new Double(d), new Double(d2)})).booleanValue();
        }
        if (d < d2) {
            return true;
        }
        return false;
    }

    @Override // tb.own
    public boolean d(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d601039", new Object[]{this, new Long(j), new Long(j2)})).booleanValue();
        }
        if (j < j2) {
            return true;
        }
        return false;
    }

    @Override // tb.own
    public boolean e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("51e63f8d", new Object[]{this, str, str2})).booleanValue();
        }
        if (str.compareTo(str2) < 0) {
            return true;
        }
        return false;
    }

    @Override // tb.own
    public boolean f(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1b6c601", new Object[]{this, bigDecimal, bigDecimal2})).booleanValue();
        }
        return j(bigDecimal.compareTo(bigDecimal2));
    }

    @Override // tb.own
    public boolean g(BigInteger bigInteger, BigInteger bigInteger2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ccb51ba7", new Object[]{this, bigInteger, bigInteger2})).booleanValue();
        }
        return j(bigInteger.compareTo(bigInteger2));
    }
}
