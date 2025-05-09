package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.a;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class ht4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1022362006);
    }

    public static final Boolean a(Map<?, ?> map, String str) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("bd0fc9c9", new Object[]{map, str});
        }
        ckf.g(map, "<this>");
        ckf.g(str, "key");
        Object obj = map.get(str);
        if (obj == null) {
            return null;
        }
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            return wsq.P0((String) obj);
        }
        if (obj instanceof Integer) {
            return Boolean.valueOf(!ckf.b(obj, 0));
        }
        if (!(obj instanceof Double)) {
            return null;
        }
        if (((Number) obj).doubleValue() == vu3.b.GEO_NOT_SUPPORT) {
            z = true;
        }
        return Boolean.valueOf(!z);
    }

    public static final Double b(Map<?, ?> map, String str) {
        double d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Double) ipChange.ipc$dispatch("545e069", new Object[]{map, str});
        }
        ckf.g(map, "<this>");
        ckf.g(str, "key");
        Object obj = map.get(str);
        if (obj == null) {
            return null;
        }
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Number) obj).floatValue());
        }
        if (obj instanceof Long) {
            return Double.valueOf(((Number) obj).longValue());
        }
        if (obj instanceof Integer) {
            return Double.valueOf(((Number) obj).intValue());
        }
        if (obj instanceof Short) {
            return Double.valueOf(((Number) obj).shortValue());
        }
        if (obj instanceof Byte) {
            return Double.valueOf(((Number) obj).byteValue());
        }
        if (obj instanceof String) {
            return rsq.k((String) obj);
        }
        if (obj instanceof Number) {
            return Double.valueOf(((Number) obj).doubleValue());
        }
        if (!(obj instanceof Boolean)) {
            return null;
        }
        if (((Boolean) obj).booleanValue()) {
            d = 1.0d;
        } else {
            d = vu3.b.GEO_NOT_SUPPORT;
        }
        return Double.valueOf(d);
    }

    public static final Integer c(Map<?, ?> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("52457c0c", new Object[]{map, str});
        }
        ckf.g(map, "<this>");
        ckf.g(str, "key");
        Object obj = map.get(str);
        if (obj == null) {
            return null;
        }
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof Long) {
            Number number = (Number) obj;
            long longValue = number.longValue();
            if (-2147483648L > longValue || longValue > 2147483647L) {
                return null;
            }
            return Integer.valueOf((int) number.longValue());
        } else if (obj instanceof Float) {
            Number number2 = (Number) obj;
            if (number2.floatValue() < -2.14748365E9f || number2.floatValue() > 2.14748365E9f) {
                return null;
            }
            return Integer.valueOf((int) number2.floatValue());
        } else if (obj instanceof Double) {
            Number number3 = (Number) obj;
            if (number3.doubleValue() < -2.147483648E9d || number3.doubleValue() > 2.147483647E9d) {
                return null;
            }
            return Integer.valueOf((int) number3.doubleValue());
        } else if (obj instanceof Short) {
            return Integer.valueOf(((Number) obj).shortValue());
        } else {
            if (obj instanceof Byte) {
                return Integer.valueOf(((Number) obj).byteValue());
            }
            if (obj instanceof String) {
                return f((String) obj);
            }
            if (obj instanceof Boolean) {
                return Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
            }
            return null;
        }
    }

    public static final Long d(Map<?, ?> map, String str) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("d659cb49", new Object[]{map, str});
        }
        ckf.g(map, "<this>");
        ckf.g(str, "key");
        Object obj = map.get(str);
        if (obj == null) {
            return null;
        }
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Number) obj).intValue());
        }
        if (obj instanceof Float) {
            Number number = (Number) obj;
            if (number.floatValue() < -9.223372E18f || number.floatValue() > 9.223372E18f) {
                return null;
            }
            return Long.valueOf(number.floatValue());
        } else if (obj instanceof Double) {
            Number number2 = (Number) obj;
            if (number2.doubleValue() < -9.223372036854776E18d || number2.doubleValue() > 9.223372036854776E18d) {
                return null;
            }
            return Long.valueOf((long) number2.doubleValue());
        } else if (obj instanceof Short) {
            return Long.valueOf(((Number) obj).shortValue());
        } else {
            if (obj instanceof Byte) {
                return Long.valueOf(((Number) obj).byteValue());
            }
            if (obj instanceof String) {
                return g((String) obj);
            }
            if (!(obj instanceof Boolean)) {
                return null;
            }
            if (((Boolean) obj).booleanValue()) {
                j = 1;
            } else {
                j = 0;
            }
            return Long.valueOf(j);
        }
    }

    public static final String e(Map<?, ?> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("afdc8869", new Object[]{map, str});
        }
        ckf.g(map, "<this>");
        ckf.g(str, "key");
        Object obj = map.get(str);
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    public static final Map<String, Object> h(Map<?, ?> map) {
        Pair pair;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("adccdff7", new Object[]{map});
        }
        ckf.g(map, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key instanceof String) {
                pair = jpu.a(key, value);
            } else {
                pair = null;
            }
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return a.p(arrayList);
    }

    public static final Integer f(String str) {
        Integer m;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("827b04a8", new Object[]{str});
        }
        try {
            if (tsq.H(str, "-0x", true)) {
                String substring = str.substring(3);
                ckf.f(substring, "substring(...)");
                kotlin.text.a.a(16);
                m = Integer.valueOf(-Integer.parseInt(substring, 16));
            } else if (tsq.H(str, "0x", true)) {
                String substring2 = str.substring(2);
                ckf.f(substring2, "substring(...)");
                kotlin.text.a.a(16);
                m = Integer.valueOf(Integer.parseInt(substring2, 16));
            } else if (wsq.O(str, ",", false, 2, null)) {
                m = ssq.m(tsq.E(str, ",", "", false, 4, null));
            } else {
                m = ssq.m(str);
            }
            return m;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static final Long g(String str) {
        Long o;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("7d2cade9", new Object[]{str});
        }
        try {
            if (tsq.H(str, "-0x", true)) {
                String substring = str.substring(3);
                ckf.f(substring, "substring(...)");
                kotlin.text.a.a(16);
                o = Long.valueOf(-Long.parseLong(substring, 16));
            } else if (tsq.H(str, "0x", true)) {
                String substring2 = str.substring(2);
                ckf.f(substring2, "substring(...)");
                kotlin.text.a.a(16);
                o = Long.valueOf(Long.parseLong(substring2, 16));
            } else if (wsq.O(str, ",", false, 2, null)) {
                o = ssq.o(tsq.E(str, ",", "", false, 4, null));
            } else {
                o = ssq.o(str);
            }
            return o;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
