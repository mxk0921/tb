package tb;

import com.alibaba.ut.abtest.bucketing.expression.ExpressionException;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.math.BigDecimal;
import java.math.BigInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class own extends ra2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(961544289);
    }

    public static /* synthetic */ Object ipc$super(own ownVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ut/abtest/bucketing/expression/RelationalOperator");
    }

    @Override // tb.ra2
    public boolean a(Object obj, Object obj2) throws ExpressionException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90f92b31", new Object[]{this, obj, obj2})).booleanValue();
        }
        return xr8.a(obj, obj2, this);
    }

    public abstract boolean c(double d, double d2);

    public abstract boolean d(long j, long j2);

    public abstract boolean e(String str, String str2);

    public abstract boolean f(BigDecimal bigDecimal, BigDecimal bigDecimal2);

    public abstract boolean g(BigInteger bigInteger, BigInteger bigInteger2);

    public boolean h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("94a67576", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i == 0) {
            return true;
        }
        return false;
    }

    public boolean i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7dd971f0", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i > 0) {
            return true;
        }
        return false;
    }

    public boolean j(int i) {
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
