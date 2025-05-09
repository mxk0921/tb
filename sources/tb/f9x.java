package tb;

import android.os.AsyncTask;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexErrorType;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_framework.module.MUSModule;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class f9x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IllegalStateException f19134a;

        public a(IllegalStateException illegalStateException) {
            this.f19134a = illegalStateException;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            throw this.f19134a;
        }
    }

    static {
        t2o.a(982515968);
    }

    public static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9773f3a7", new Object[]{new Boolean(z)});
        } else {
            b(z, "");
        }
    }

    public static void b(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("286821b1", new Object[]{new Boolean(z), str});
        } else if (!z) {
            try {
                throw new IllegalStateException();
            } catch (IllegalStateException e) {
                dwh.g("Assert", "Fatal Assert hit in java, msg: " + str, e);
                AsyncTask.THREAD_POOL_EXECUTOR.execute(new a(e));
                throw new IllegalStateException();
            }
        }
    }

    public static HashMap<String, String> c(WeexValue weexValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("efa8fab0", new Object[]{weexValue});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        JSONObject object = weexValue.getObject();
        for (String str : object.keySet()) {
            hashMap.put(str, object.getString(str));
        }
        return hashMap;
    }

    public static boolean d(Type type) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db329c84", new Object[]{type})).booleanValue();
        }
        if (!(type instanceof Class)) {
            return false;
        }
        if (type == WeexValue.class || type == Integer.TYPE || type == Float.TYPE || type == Boolean.TYPE || type == Long.TYPE || type == String.class || type == JSONObject.class || type == JSONArray.class || type == f4x.class || type == Object.class || type == Integer.class || type == Float.class || type == Boolean.class || type == Long.class || type == byte[].class || type == MUSValue.class) {
            return true;
        }
        Class cls = (Class) type;
        if (!Map.class.isAssignableFrom(cls) && !List.class.isAssignableFrom(cls)) {
            return false;
        }
        return true;
    }

    public static boolean e(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fee1b854", new Object[]{obj})).booleanValue();
        }
        Map.class.isAssignableFrom(obj.getClass());
        return d(obj.getClass());
    }

    public static Object f(Type type, WeexValue weexValue) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6cf957ac", new Object[]{type, weexValue});
        }
        if (type == WeexValue.class) {
            return weexValue;
        }
        if (weexValue == null) {
            obj = null;
        } else {
            obj = weexValue.getValue();
        }
        if (obj != null) {
            if (obj.getClass() == type) {
                return obj;
            }
            if ((type instanceof Class) && ((Class) type).isAssignableFrom(obj.getClass())) {
                return obj;
            }
        } else if (type instanceof Class) {
            if (!((Class) type).isPrimitive()) {
                return null;
            }
            if (type == Boolean.TYPE) {
                return Boolean.FALSE;
            }
            throw new IllegalArgumentException("Can't assign null to " + type);
        }
        try {
            if (type != String.class) {
                if (!(type == Integer.TYPE || type == Integer.class)) {
                    if (!(type == Long.TYPE || type == Long.class)) {
                        if (!(type == Double.TYPE || type == Double.class)) {
                            if (!(type == Float.TYPE || type == Float.class)) {
                                if (type == Boolean.TYPE) {
                                    if (!(weexValue == null || weexValue.getType() == WeexValue.Type.NULL)) {
                                        if (weexValue.getType() == WeexValue.Type.BOOL) {
                                            return Boolean.valueOf(weexValue.getBool());
                                        }
                                        if (weexValue.getType() == WeexValue.Type.STRING) {
                                            return Boolean.valueOf(Boolean.parseBoolean(weexValue.getString()));
                                        }
                                        throw new IllegalArgumentException("Can't convert " + weexValue + " to " + type);
                                    }
                                    return Boolean.FALSE;
                                } else if (type == Boolean.class) {
                                    if (!(weexValue == null || weexValue.getType() == WeexValue.Type.NULL)) {
                                        if (weexValue.getType() == WeexValue.Type.BOOL) {
                                            return Boolean.valueOf(weexValue.getBool());
                                        }
                                        if (weexValue.getType() == WeexValue.Type.STRING) {
                                            return Boolean.valueOf(Boolean.parseBoolean(weexValue.getString()));
                                        }
                                        throw new IllegalArgumentException("Can't convert " + weexValue + " to " + type);
                                    }
                                    return null;
                                } else if (type == JSONArray.class) {
                                    if (obj == null) {
                                        return null;
                                    }
                                    if (obj instanceof JSONArray) {
                                        return obj;
                                    }
                                    if (obj instanceof String) {
                                        return JSON.parseArray((String) obj);
                                    }
                                    throw new IllegalArgumentException("Can't convert " + weexValue + " to " + type);
                                } else if (type == JSONObject.class) {
                                    if (obj == null) {
                                        return null;
                                    }
                                    if (obj instanceof JSONObject) {
                                        return obj;
                                    }
                                    if (obj instanceof String) {
                                        return JSON.parseObject((String) obj);
                                    }
                                    throw new IllegalArgumentException("Can't convert " + weexValue + " to " + type);
                                } else if (type == org.json.JSONArray.class) {
                                    if (obj == null) {
                                        return null;
                                    }
                                    if (obj instanceof org.json.JSONArray) {
                                        return obj;
                                    }
                                    if (obj instanceof String) {
                                        return new org.json.JSONArray((String) obj);
                                    }
                                    if (obj instanceof JSONArray) {
                                        return new org.json.JSONArray(obj.toString());
                                    }
                                    throw new IllegalArgumentException("Can't convert " + weexValue + " to " + type);
                                } else if (type != org.json.JSONObject.class) {
                                    throw new IllegalArgumentException("Can't convert " + weexValue + " to " + type);
                                } else if (obj == null) {
                                    return null;
                                } else {
                                    if (obj instanceof org.json.JSONObject) {
                                        return obj;
                                    }
                                    if (obj instanceof String) {
                                        return new org.json.JSONObject((String) obj);
                                    }
                                    if (obj instanceof JSONObject) {
                                        return new org.json.JSONObject(obj.toString());
                                    }
                                    throw new IllegalArgumentException("Can't convert " + weexValue + " to " + type);
                                }
                            }
                            return Float.valueOf((float) g(weexValue));
                        }
                        return Double.valueOf(g(weexValue));
                    }
                    return Long.valueOf(h(weexValue));
                }
                return Integer.valueOf((int) h(weexValue));
            } else if (obj instanceof String) {
                return obj;
            } else {
                return JSON.toJSONString(obj);
            }
        } catch (Exception e) {
            throw new IllegalArgumentException("Can't convert " + weexValue + " to " + type, e);
        }
    }

    public static double g(WeexValue weexValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6aa8c1b4", new Object[]{weexValue})).doubleValue();
        }
        if (weexValue.isDouble()) {
            return weexValue.getDouble();
        }
        if (weexValue.isLong()) {
            return weexValue.getLong();
        }
        if (weexValue.isString()) {
            return Double.parseDouble(weexValue.getString().trim());
        }
        throw new IllegalArgumentException("Can't convert " + weexValue + " to double");
    }

    public static long h(WeexValue weexValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("edc9792f", new Object[]{weexValue})).longValue();
        }
        if (weexValue.isLong()) {
            return weexValue.getLong();
        }
        if (weexValue.isDouble()) {
            return (long) weexValue.getDouble();
        }
        if (weexValue.isString()) {
            return (long) Double.parseDouble(weexValue.getString().trim());
        }
        throw new IllegalArgumentException("Can't convert " + weexValue + " to long");
    }

    public static void i(long j, Object obj, Object obj2, WeexInstance weexInstance) {
        int q;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e326f09e", new Object[]{new Long(j), obj, obj2, weexInstance});
        } else if (System.currentTimeMillis() - j >= 1000 && (q = w4x.q()) > 0 && new Random(System.currentTimeMillis()).nextInt(q) == 0) {
            try {
                String str = "";
                if (!(obj instanceof cwh) && !(obj2 instanceof MUSModule)) {
                    if ((obj instanceof String) && (obj2 instanceof String)) {
                        str = "long_call_module_task:" + obj + "_" + obj2;
                    }
                    weexInstance.reportException(WeexErrorType.WEEX_FRAMEWORK, "LONG_CALL_MODULE_TASK", str);
                }
                str = "long_call_module_task:" + ((MUSModule) obj).getModuleName() + "_" + ((cwh) obj2).toString();
                weexInstance.reportException(WeexErrorType.WEEX_FRAMEWORK, "LONG_CALL_MODULE_TASK", str);
            } catch (Throwable th) {
                dwh.i(th);
            }
        }
    }
}
