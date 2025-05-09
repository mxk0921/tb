package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.behavior.expression.ExpressionException;
import java.math.BigDecimal;
import java.math.BigInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class as8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Number f15973a = new Integer(0);

    static {
        t2o.a(962593244);
    }

    public static boolean a(Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1356a95", new Object[]{cls})).booleanValue();
        }
        if (cls == Byte.class || cls == Byte.TYPE || cls == Short.class || cls == Short.TYPE || cls == Integer.class || cls == Integer.TYPE || cls == Long.class || cls == Long.TYPE || cls == Float.class || cls == Float.TYPE || cls == Double.class || cls == Double.TYPE || cls == BigInteger.class || cls == BigDecimal.class) {
            return true;
        }
        return false;
    }

    public static boolean applyNumberRelationalOperator(Object obj, Object obj2, pak pakVar) throws ExpressionException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c47f71f0", new Object[]{obj, obj2, pakVar})).booleanValue();
        }
        if (isBigDecimal(obj2)) {
            return pakVar.apply((BigDecimal) coerceToPrimitiveNumber(obj, BigDecimal.class), (BigDecimal) coerceToPrimitiveNumber(obj2, BigDecimal.class));
        }
        if (isFloatingPointType(obj2)) {
            return pakVar.apply(coerceToPrimitiveNumber(obj, Double.class).doubleValue(), coerceToPrimitiveNumber(obj2, Double.class).doubleValue());
        }
        if (isBigInteger(obj2)) {
            return pakVar.apply((BigInteger) coerceToPrimitiveNumber(obj, BigInteger.class), (BigInteger) coerceToPrimitiveNumber(obj2, BigInteger.class));
        }
        if (isIntegerType(obj2)) {
            return pakVar.apply(coerceToPrimitiveNumber(obj, Double.class).doubleValue(), coerceToPrimitiveNumber(obj2, Double.class).doubleValue());
        }
        return false;
    }

    public static Object coerce(Object obj, Class cls) throws ExpressionException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a80344b3", new Object[]{obj, cls});
        }
        if (cls == String.class) {
            return coerceToString(obj);
        }
        if (a(cls)) {
            return coerceToPrimitiveNumber(obj, cls);
        }
        if (cls == Character.class || cls == Character.TYPE) {
            return coerceToCharacter(obj);
        }
        if (cls == Boolean.class || cls == Boolean.TYPE) {
            return coerceToBoolean(obj);
        }
        throw new ExpressionException(osx.b);
    }

    public static Boolean coerceToBoolean(Object obj) throws ExpressionException {
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
        } catch (Exception unused) {
            return Boolean.FALSE;
        }
    }

    public static Character coerceToCharacter(Object obj) throws ExpressionException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Character) ipChange.ipc$dispatch("99f44532", new Object[]{obj});
        }
        if (obj == null || "".equals(obj)) {
            return new Character((char) 0);
        }
        if (obj instanceof Character) {
            return (Character) obj;
        }
        if (obj instanceof Boolean) {
            return new Character((char) 0);
        }
        if (obj instanceof Number) {
            return new Character((char) ((Number) obj).shortValue());
        }
        if (obj instanceof String) {
            return new Character(((String) obj).charAt(0));
        }
        return new Character((char) 0);
    }

    public static Number coerceToPrimitiveNumber(Object obj, Class cls) throws ExpressionException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Number) ipChange.ipc$dispatch("e879e0c8", new Object[]{obj, cls});
        }
        if (obj == null || "".equals(obj)) {
            return coerceToPrimitiveNumber(f15973a, cls);
        }
        if (obj instanceof Character) {
            return coerceToPrimitiveNumber((Number) new Short((short) ((Character) obj).charValue()), cls);
        }
        if (obj instanceof Boolean) {
            return coerceToPrimitiveNumber(f15973a, cls);
        }
        if (obj.getClass() == cls) {
            return (Number) obj;
        }
        if (obj instanceof Number) {
            return coerceToPrimitiveNumber((Number) obj, cls);
        }
        if (obj instanceof String) {
            try {
                return coerceToPrimitiveNumber((String) obj, cls);
            } catch (Exception e) {
                nhh.u("ExpressionUtils", e, new Object[0]);
                return coerceToPrimitiveNumber(f15973a, cls);
            }
        } else {
            nhh.v("ExpressionUtils", "不支持的类型，valueClass", obj.getClass().getName());
            return coerceToPrimitiveNumber((Number) 0, cls);
        }
    }

    public static String coerceToString(Object obj) throws ExpressionException {
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
            nhh.u("ExpressionUtils", e, new Object[0]);
            return "";
        }
    }

    public static boolean isBigDecimal(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12f04d62", new Object[]{obj})).booleanValue();
        }
        return obj instanceof BigDecimal;
    }

    public static boolean isBigInteger(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3e3db8f", new Object[]{obj})).booleanValue();
        }
        return obj instanceof BigInteger;
    }

    public static boolean isFloatingPointType(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4f0284a1", new Object[]{obj})).booleanValue() : obj != null && isFloatingPointType((Class) obj.getClass());
    }

    public static boolean isIntegerType(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("167a3435", new Object[]{obj})).booleanValue() : obj != null && isIntegerType((Class) obj.getClass());
    }

    public static boolean isFloatingPointType(Class cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("15e8a660", new Object[]{cls})).booleanValue() : cls == Float.class || cls == Float.TYPE || cls == Double.class || cls == Double.TYPE;
    }

    public static boolean isIntegerType(Class cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("87b2b44c", new Object[]{cls})).booleanValue() : cls == Byte.class || cls == Byte.TYPE || cls == Short.class || cls == Short.TYPE || cls == Character.class || cls == Character.TYPE || cls == Integer.class || cls == Integer.TYPE || cls == Long.class || cls == Long.TYPE;
    }

    public static boolean applyRelationalOperator(Object obj, Object obj2, pak pakVar) throws ExpressionException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c64af87", new Object[]{obj, obj2, pakVar})).booleanValue();
        }
        if (isBigDecimal(obj)) {
            return pakVar.apply((BigDecimal) coerceToPrimitiveNumber(obj, BigDecimal.class), (BigDecimal) coerceToPrimitiveNumber(obj2, BigDecimal.class));
        }
        if (isFloatingPointType(obj)) {
            return pakVar.apply(coerceToPrimitiveNumber(obj, Double.class).doubleValue(), coerceToPrimitiveNumber(obj2, Double.class).doubleValue());
        }
        if (isBigInteger(obj)) {
            return pakVar.apply((BigInteger) coerceToPrimitiveNumber(obj, BigInteger.class), (BigInteger) coerceToPrimitiveNumber(obj2, BigInteger.class));
        }
        if (isIntegerType(obj)) {
            return pakVar.apply(coerceToPrimitiveNumber(obj, Long.class).longValue(), coerceToPrimitiveNumber(obj2, Long.class).longValue());
        }
        if (obj instanceof String) {
            return pakVar.apply(coerceToString(obj), coerceToString(obj2));
        }
        if (obj instanceof Comparable) {
            try {
                int compareTo = ((Comparable) obj).compareTo(obj2);
                return pakVar.apply(compareTo, -compareTo);
            } catch (Exception e) {
                nhh.u("ExpressionUtils", e, new Object[0]);
                return false;
            }
        } else if (obj2 instanceof Comparable) {
            try {
                int compareTo2 = ((Comparable) obj2).compareTo(obj);
                return pakVar.apply(-compareTo2, compareTo2);
            } catch (Exception e2) {
                nhh.u("ExpressionUtils", e2, new Object[0]);
                return false;
            }
        } else {
            nhh.v("ExpressionUtils", "不支持的类型 OperatorSymbol", pakVar.getOperatorSymbol(), "leftClass", obj.getClass().getName(), "rightClass", obj2.getClass().getName());
            return false;
        }
    }

    public static Number coerceToPrimitiveNumber(Number number, Class cls) throws ExpressionException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Number) ipChange.ipc$dispatch("ff9ec6fe", new Object[]{number, cls});
        }
        if (cls == Byte.class || cls == Byte.TYPE) {
            return Byte.valueOf(number.byteValue());
        }
        if (cls == Short.class || cls == Short.TYPE) {
            return Short.valueOf(number.shortValue());
        }
        if (cls == Integer.class || cls == Integer.TYPE) {
            return Integer.valueOf(number.intValue());
        }
        if (cls == Long.class || cls == Long.TYPE) {
            return Long.valueOf(number.longValue());
        }
        if (cls == Float.class || cls == Float.TYPE) {
            return Float.valueOf(number.floatValue());
        }
        if (cls == Double.class || cls == Double.TYPE) {
            return Double.valueOf(number.doubleValue());
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

    public static Number coerceToPrimitiveNumber(String str, Class cls) throws ExpressionException {
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
}
