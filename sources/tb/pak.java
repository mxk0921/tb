package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.behavior.expression.ExpressionException;
import java.math.BigDecimal;
import java.math.BigInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class pak extends qa2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(962593254);
    }

    public static /* synthetic */ Object ipc$super(pak pakVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ut/mini/behavior/expression/NumberRelationalOperator");
    }

    public abstract boolean apply(double d, double d2);

    public abstract boolean apply(long j, long j2);

    @Override // tb.qa2
    public boolean apply(Object obj, Object obj2) throws ExpressionException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("90f92b31", new Object[]{this, obj, obj2})).booleanValue() : as8.applyNumberRelationalOperator(obj, obj2, this);
    }

    public abstract boolean apply(String str, String str2);

    public abstract boolean apply(BigDecimal bigDecimal, BigDecimal bigDecimal2);

    public abstract boolean apply(BigInteger bigInteger, BigInteger bigInteger2);

    public boolean isEqual(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("94a67576", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i == 0) {
            return true;
        }
        return false;
    }

    public boolean isGreater(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7dd971f0", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i > 0) {
            return true;
        }
        return false;
    }

    public boolean isLess(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5938375d", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i < 0) {
            return true;
        }
        return false;
    }
}
