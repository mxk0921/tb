package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.math.BigDecimal;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class rak {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596336);
    }

    public static boolean a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e15dbb70", new Object[]{obj})).booleanValue();
        }
        if ((obj instanceof Float) || (obj instanceof Double)) {
            return true;
        }
        if (!(obj instanceof String)) {
            return false;
        }
        String str = (String) obj;
        if (str.indexOf(46) == -1 && str.indexOf(101) == -1 && str.indexOf(69) == -1) {
            return false;
        }
        return true;
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9b32eca", new Object[]{str})).booleanValue();
        }
        if (str == null || str.equals("false") || str.equalsIgnoreCase("0") || str.isEmpty()) {
            return false;
        }
        return true;
    }

    public static BigDecimal c(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BigDecimal) ipChange.ipc$dispatch("11b0164b", new Object[]{obj});
        }
        if (obj instanceof BigDecimal) {
            return (BigDecimal) obj;
        }
        if (obj == null) {
            throw new IllegalArgumentException("BigDecimal coercion exception. arg is null");
        } else if (obj instanceof String) {
            String str = (String) obj;
            if ("".equals(str.trim())) {
                return BigDecimal.valueOf(0L);
            }
            return new BigDecimal(str);
        } else if (obj instanceof Number) {
            return new BigDecimal(obj.toString());
        } else {
            if (obj instanceof Character) {
                return new BigDecimal((int) ((Character) obj).charValue());
            }
            return null;
        }
    }

    public static double d(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9bf245bd", new Object[]{obj})).doubleValue();
        }
        if (obj != null) {
            if (obj instanceof String) {
                String str = (String) obj;
                if ("".equals(str.trim())) {
                    return vu3.b.GEO_NOT_SUPPORT;
                }
                return Double.parseDouble(str);
            } else if (obj instanceof Character) {
                return ((Character) obj).charValue();
            } else {
                if (obj instanceof Number) {
                    return d(obj);
                }
                if (obj instanceof Boolean) {
                    throw new IllegalArgumentException("Boolean->Double coercion exception");
                }
            }
        }
        return vu3.b.GEO_NOT_SUPPORT;
    }

    public static int e(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e8e87699", new Object[]{obj})).intValue();
        }
        if (obj != null) {
            if (obj instanceof String) {
                if ("".equals(obj)) {
                    return 0;
                }
                return Integer.parseInt((String) obj);
            } else if (obj instanceof Character) {
                return ((Character) obj).charValue();
            } else {
                if (obj instanceof Boolean) {
                    throw new IllegalArgumentException("Boolean->Integer coercion exception");
                } else if (obj instanceof Number) {
                    return ((Number) obj).intValue();
                }
            }
        }
        return 0;
    }

    public static long f(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("824db8ee", new Object[]{obj})).longValue();
        }
        if (obj == null) {
            return 0L;
        }
        if (obj instanceof String) {
            if ("".equals(obj)) {
                return 0L;
            }
            return Long.parseLong((String) obj);
        } else if (obj instanceof Character) {
            return ((Character) obj).charValue();
        } else {
            if (!(obj instanceof Boolean) && (obj instanceof Number)) {
                return ((Number) obj).longValue();
            }
            return 0L;
        }
    }
}
