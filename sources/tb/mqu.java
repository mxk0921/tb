package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class mqu {
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(919601444);
        }

        public a() {
        }

        public final Map<String, String> a(Map<String, ? extends Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("4739a1e7", new Object[]{this, map});
            }
            if (map == null) {
                return null;
            }
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value != null) {
                    hashMap.put(key, value.toString());
                }
            }
            return hashMap;
        }

        public final float c(Object obj, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d175e2a2", new Object[]{this, obj, new Float(f)})).floatValue();
            }
            if (obj instanceof Number) {
                return ((Number) obj).floatValue();
            }
            if (obj instanceof String) {
                try {
                    return Float.parseFloat((String) obj);
                } catch (Exception unused) {
                }
            }
            return f;
        }

        public final int d(Object obj, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("cabe637b", new Object[]{this, obj, new Integer(i)})).intValue();
            }
            try {
                return e(obj);
            } catch (Exception unused) {
                return i;
            }
        }

        public final int e(Object obj) throws IllegalArgumentException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("974020af", new Object[]{this, obj})).intValue();
            }
            if (obj instanceof Number) {
                return ((Number) obj).intValue();
            }
            if (obj instanceof String) {
                return Integer.parseInt((String) obj);
            }
            throw new IllegalArgumentException(obj + " is invalid Integer");
        }

        public final List<?> f(Object obj, List<?> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("28dfbb9f", new Object[]{this, obj, list});
            }
            if (obj instanceof List) {
                return (List) obj;
            }
            if (obj instanceof String) {
                try {
                    return JSON.parseArray((String) obj);
                } catch (Exception unused) {
                }
            }
            return list;
        }

        public final long g(Object obj, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("cb4d2df6", new Object[]{this, obj, new Long(j)})).longValue();
            }
            if (obj instanceof Number) {
                return ((Number) obj).longValue();
            }
            if (obj instanceof String) {
                try {
                    return Long.parseLong((String) obj);
                } catch (Exception unused) {
                }
            }
            return j;
        }

        public final Map<String, Object> h(Object obj, Map<String, ? extends Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("4978fb51", new Object[]{this, obj, map});
            }
            if (obj instanceof Map) {
                return (Map) obj;
            }
            if (obj instanceof String) {
                try {
                    return JSON.parseObject((String) obj);
                } catch (Throwable unused) {
                }
            }
            return map;
        }

        public final String i(Object obj, String str) {
            String obj2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("5cf3bb6c", new Object[]{this, obj, str});
            }
            if (obj == null || (obj2 = obj.toString()) == null) {
                return str;
            }
            return obj2;
        }

        public final boolean k(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4e0e802a", new Object[]{this, obj})).booleanValue();
            }
            if (!(obj instanceof String)) {
                return false;
            }
            try {
                if (JSON.parse((String) obj) != null) {
                    return true;
                }
                return false;
            } catch (Exception unused) {
                return false;
            }
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final boolean b(Object obj, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("40eb4e63", new Object[]{this, obj, new Boolean(z)})).booleanValue();
            }
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue();
            }
            if (obj instanceof String) {
                String str = (String) obj;
                if (tsq.x(str, "true", true)) {
                    return true;
                }
                if (tsq.x(str, "false", true)) {
                    return false;
                }
                try {
                    return Float.parseFloat((String) obj) > ((float) 0);
                } catch (Exception unused) {
                }
            } else if (obj instanceof Number) {
                return ((Number) obj).floatValue() > ((float) 0);
            } else {
                if (obj instanceof List) {
                    return ((List) obj).size() > 0;
                }
                if (obj instanceof Map) {
                    return ((Map) obj).size() > 0;
                }
            }
            return z;
        }

        public final Object j(Map<String, ?> map, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("d57e6ba1", new Object[]{this, map, str});
            }
            ckf.g(str, "key");
            List z0 = wsq.z0(str, new String[]{"."}, false, 0, 6, null);
            int size = z0.size();
            for (int i = 0; i < size; i++) {
                Object obj = map != null ? map.get(z0.get(i)) : null;
                if (i == yz3.k(z0)) {
                    if (obj != null) {
                        return obj;
                    }
                    return null;
                } else if (!(obj instanceof Map)) {
                    return null;
                } else {
                    map = (Map) obj;
                }
            }
            return null;
        }
    }

    static {
        t2o.a(919601443);
    }
}
