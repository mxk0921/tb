package tb;

import com.alibaba.ut.abtest.bucketing.expression.ExpressionException;
import com.android.alibaba.ip.runtime.IpChange;
import java.math.BigDecimal;
import java.math.BigInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class xr8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Number f31552a = new Integer(0);

    static {
        t2o.a(961544282);
    }

    public static Boolean b(Object obj) throws ExpressionException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("fc941492", new Object[]{obj});
        }
        if (obj == null || "".equals(obj)) {
            return Boolean.FALSE;
        }
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (!(obj instanceof String)) {
            return Boolean.TRUE;
        }
        try {
            return Boolean.valueOf((String) obj);
        } catch (Exception e) {
            ku0.j("ExpressionUtils.coerceToBoolean", e);
            return Boolean.FALSE;
        }
    }

    public static Number c(Number number, Class cls) throws ExpressionException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Number) ipChange.ipc$dispatch("ff9ec6fe", new Object[]{number, cls});
        }
        if (cls == Byte.class || cls == Byte.TYPE) {
            return new Byte(number.byteValue());
        }
        if (cls == Short.class || cls == Short.TYPE) {
            return new Short(number.shortValue());
        }
        if (cls == Integer.class || cls == Integer.TYPE) {
            return new Integer(number.intValue());
        }
        if (cls == Long.class || cls == Long.TYPE) {
            return new Long(number.longValue());
        }
        if (cls == Float.class || cls == Float.TYPE) {
            return new Float(number.floatValue());
        }
        if (cls == Double.class || cls == Double.TYPE) {
            return new Double(number.doubleValue());
        }
        if (cls == BigInteger.class) {
            if (number instanceof BigDecimal) {
                return ((BigDecimal) number).toBigInteger();
            }
            return BigInteger.valueOf(number.longValue());
        } else if (cls != BigDecimal.class) {
            return new Integer(0);
        } else {
            if (number instanceof BigInteger) {
                return new BigDecimal((BigInteger) number);
            }
            return new BigDecimal(number.doubleValue());
        }
    }

    public static Number e(String str, Class cls) throws ExpressionException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Number) ipChange.ipc$dispatch("75ef1f36", new Object[]{str, cls});
        }
        if (cls == Byte.class || cls == Byte.TYPE) {
            return Byte.valueOf(str);
        }
        if (cls == Short.class || cls == Short.TYPE) {
            return Short.valueOf(str);
        }
        if (cls == Integer.class || cls == Integer.TYPE) {
            return Integer.valueOf(str);
        }
        if (cls == Long.class || cls == Long.TYPE) {
            return Long.valueOf(str);
        }
        if (cls == Float.class || cls == Float.TYPE) {
            return Float.valueOf(str);
        }
        if (cls == Double.class || cls == Double.TYPE) {
            return Double.valueOf(str);
        }
        if (cls == BigInteger.class) {
            return new BigInteger(str);
        }
        if (cls == BigDecimal.class) {
            return new BigDecimal(str);
        }
        return new Integer(0);
    }

    public static String f(Object obj) throws ExpressionException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eee5e8b6", new Object[]{obj});
        }
        if (obj == null) {
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            ku0.j("ExpressionUtils.coerceToString", e);
            return "";
        }
    }

    public static boolean g(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12f04d62", new Object[]{obj})).booleanValue();
        }
        if (obj == null || !(obj instanceof BigDecimal)) {
            return false;
        }
        return true;
    }

    public static boolean h(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3e3db8f", new Object[]{obj})).booleanValue();
        }
        if (obj == null || !(obj instanceof BigInteger)) {
            return false;
        }
        return true;
    }

    public static boolean i(Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("15e8a660", new Object[]{cls})).booleanValue();
        }
        if (cls == Float.class || cls == Float.TYPE || cls == Double.class || cls == Double.TYPE) {
            return true;
        }
        return false;
    }

    public static boolean j(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f0284a1", new Object[]{obj})).booleanValue();
        }
        if (obj == null || !i(obj.getClass())) {
            return false;
        }
        return true;
    }

    public static boolean k(Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("87b2b44c", new Object[]{cls})).booleanValue();
        }
        if (cls == Byte.class || cls == Byte.TYPE || cls == Short.class || cls == Short.TYPE || cls == Character.class || cls == Character.TYPE || cls == Integer.class || cls == Integer.TYPE || cls == Long.class || cls == Long.TYPE) {
            return true;
        }
        return false;
    }

    public static boolean l(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("167a3435", new Object[]{obj})).booleanValue();
        }
        if (obj == null || !k(obj.getClass())) {
            return false;
        }
        return true;
    }

    public static boolean a(Object obj, Object obj2, own ownVar) throws ExpressionException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6dbc242f", new Object[]{obj, obj2, ownVar})).booleanValue();
        }
        if (g(obj)) {
            return ownVar.f((BigDecimal) d(obj, BigDecimal.class), (BigDecimal) d(obj2, BigDecimal.class));
        }
        if (j(obj)) {
            return ownVar.c(d(obj, Double.class).doubleValue(), d(obj2, Double.class).doubleValue());
        }
        if (h(obj)) {
            return ownVar.g((BigInteger) d(obj, BigInteger.class), (BigInteger) d(obj2, BigInteger.class));
        }
        if (l(obj)) {
            return ownVar.d(d(obj, Long.class).longValue(), d(obj2, Long.class).longValue());
        }
        if (obj instanceof String) {
            return ownVar.e(f(obj), f(obj2));
        }
        if (obj instanceof Comparable) {
            try {
                int compareTo = ((Comparable) obj).compareTo(obj2);
                return ownVar.d(compareTo, -compareTo);
            } catch (Exception e) {
                ku0.j("ExpressionUtils.applyRelationalOperator", e);
                return false;
            }
        } else if (obj2 instanceof Comparable) {
            try {
                int compareTo2 = ((Comparable) obj2).compareTo(obj);
                return ownVar.d(-compareTo2, compareTo2);
            } catch (Exception e2) {
                ku0.j("ExpressionUtils.applyRelationalOperator", e2);
                return false;
            }
        } else {
            ogh.l("ExpressionUtils", "不支持的类型，OperatorSymbol=" + ownVar.b() + ", leftClass=" + obj.getClass().getName() + ", rightClass=" + obj2.getClass().getName());
            return false;
        }
    }

    public static Number d(Object obj, Class cls) throws ExpressionException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Number) ipChange.ipc$dispatch("e879e0c8", new Object[]{obj, cls});
        }
        if (obj == null || "".equals(obj)) {
            return c(f31552a, cls);
        }
        if (obj instanceof Character) {
            return c(new Short((short) ((Character) obj).charValue()), cls);
        }
        if (obj instanceof Boolean) {
            return c(f31552a, cls);
        }
        if (obj.getClass() == cls) {
            return (Number) obj;
        }
        if (obj instanceof Number) {
            return c((Number) obj, cls);
        }
        if (obj instanceof String) {
            try {
                return e((String) obj, cls);
            } catch (Exception e) {
                ku0.j("ExpressionUtils.coerceToPrimitiveNumber", e);
                return c(f31552a, cls);
            }
        } else {
            ogh.l("ExpressionUtils", "不支持的类型，valueClass=".concat(obj.getClass().getName()));
            return c(0, cls);
        }
    }
}
