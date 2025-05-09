package tb;

import android.text.TextUtils;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex_framework.MUSDKInstance;
import io.unicorn.plugin.platform.PlatformViewsController;
import java.lang.ref.WeakReference;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class ysi {

    /* renamed from: a  reason: collision with root package name */
    public t5m f32318a;
    public final PlatformViewsController b;
    public WeakReference<WeexInstance> c;

    static {
        t2o.a(945815803);
    }

    public ysi(PlatformViewsController platformViewsController) {
        this.b = platformViewsController;
    }

    public static Boolean a(Object obj) {
        boolean z;
        if (obj == null) {
            return Boolean.FALSE;
        }
        String trim = obj.toString().trim();
        try {
            if (TextUtils.isEmpty(trim) || !"true".equals(trim)) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        } catch (NumberFormatException e) {
            dwh.g("MethodInvokeExecutor", "The parameter format is not supported", e);
            return Boolean.FALSE;
        } catch (Exception e2) {
            dwh.g("MethodInvokeExecutor", "Argument error! value is " + obj, e2);
            return Boolean.FALSE;
        }
    }

    public static double b(Object obj) {
        if (obj == null) {
            return vu3.b.GEO_NOT_SUPPORT;
        }
        String trim = obj.toString().trim();
        if (trim.endsWith("px")) {
            try {
                return Double.parseDouble(trim.substring(0, trim.indexOf("px")));
            } catch (NumberFormatException e) {
                dwh.g("MethodInvokeExecutor", "Argument format error! value is " + obj, e);
            } catch (Exception e2) {
                dwh.g("MethodInvokeExecutor", "Argument error! value is " + obj, e2);
            }
        } else {
            try {
                return Double.parseDouble(trim);
            } catch (NumberFormatException e3) {
                dwh.g("MethodInvokeExecutor", "Argument format error! value is " + obj, e3);
            } catch (Exception e4) {
                dwh.g("MethodInvokeExecutor", "Argument error! value is " + obj, e4);
            }
        }
        return vu3.b.GEO_NOT_SUPPORT;
    }

    public static Float c(Object obj) {
        Float valueOf = Float.valueOf(Float.NaN);
        if (obj == null) {
            return valueOf;
        }
        String trim = obj.toString().trim();
        if (trim.endsWith("px")) {
            try {
                return Float.valueOf(Float.parseFloat(trim.substring(0, trim.indexOf("px"))));
            } catch (NumberFormatException e) {
                dwh.g("MethodInvokeExecutor", "Argument format error! value is " + obj, e);
            } catch (Exception e2) {
                dwh.g("MethodInvokeExecutor", "Argument error! value is " + obj, e2);
            }
        } else {
            try {
                return Float.valueOf(Float.parseFloat(trim));
            } catch (NumberFormatException e3) {
                dwh.g("MethodInvokeExecutor", "Argument format error! value is " + obj, e3);
            } catch (Exception e4) {
                dwh.g("MethodInvokeExecutor", "Argument error! value is " + obj, e4);
            }
        }
        return valueOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int d(Object obj) {
        String str;
        int parseInt;
        int i = 0;
        if (obj == null) {
            return 0;
        }
        String trim = obj.toString().trim();
        if (trim.length() >= 2) {
            str = trim.substring(trim.length() - 2, trim.length());
        } else {
            str = "";
        }
        if (TextUtils.equals("px", str)) {
            try {
                String substring = trim.substring(0, trim.length() - 2);
                if (TextUtils.isEmpty(substring) || !substring.contains(".")) {
                    parseInt = Integer.parseInt(substring);
                } else {
                    parseInt = (int) k(substring);
                }
                return parseInt;
            } catch (NumberFormatException e) {
                dwh.g("MethodInvokeExecutor", "Argument format error! value is " + obj, e);
                return 0;
            } catch (Exception e2) {
                dwh.g("MethodInvokeExecutor", "Argument error! value is " + obj, e2);
                return 0;
            }
        } else {
            try {
                obj = obj;
                if (!TextUtils.isEmpty(trim)) {
                    if (trim.contains(".")) {
                        float k = k(trim);
                        i = (int) k;
                        obj = k;
                    } else {
                        i = Integer.parseInt(trim);
                        obj = obj;
                    }
                }
                return i;
            } catch (NumberFormatException e3) {
                dwh.g("MethodInvokeExecutor", "The parameter format is not supported", e3);
                return i;
            } catch (Exception e4) {
                dwh.g("MethodInvokeExecutor", "Argument error! value is " + obj, e4);
                return i;
            }
        }
    }

    public static long e(Object obj) {
        if (obj == null) {
            return 0L;
        }
        String trim = obj.toString().trim();
        if (trim.endsWith("px")) {
            try {
                return Long.parseLong(trim.substring(0, trim.indexOf("px")));
            } catch (NumberFormatException e) {
                dwh.g("MethodInvokeExecutor", "Argument format error! value is " + obj, e);
            } catch (Exception e2) {
                dwh.g("MethodInvokeExecutor", "Argument error! value is " + obj, e2);
            }
        } else {
            try {
                return Long.parseLong(trim);
            } catch (NumberFormatException e3) {
                dwh.g("MethodInvokeExecutor", "Argument format error! value is " + obj, e3);
            } catch (Exception e4) {
                dwh.g("MethodInvokeExecutor", "Argument error! value is " + obj, e4);
            }
        }
        return 0L;
    }

    public static Object j(Type type, Object obj) {
        if (obj != null) {
            if (obj.getClass() == type) {
                return obj;
            }
            if ((type instanceof Class) && ((Class) type).isAssignableFrom(obj.getClass())) {
                return obj;
            }
        }
        if (type != String.class) {
            Class<?> cls = Integer.TYPE;
            if (type != cls) {
                Class<?> cls2 = Long.TYPE;
                if (type != cls2) {
                    Class<?> cls3 = Double.TYPE;
                    if (type != cls3) {
                        Class<?> cls4 = Float.TYPE;
                        if (type != cls4) {
                            Class<?> cls5 = Boolean.TYPE;
                            if (type == cls5) {
                                if (obj.getClass().isAssignableFrom(cls5) || (obj instanceof Boolean)) {
                                    return obj;
                                }
                                return a(obj);
                            } else if (type == JSONArray.class && obj != null && obj.getClass() == JSONArray.class) {
                                return obj;
                            } else {
                                if (type == JSONObject.class && obj != null && obj.getClass() == JSONObject.class) {
                                    return obj;
                                }
                                if ((type instanceof ParameterizedType) && (obj instanceof String)) {
                                    Type rawType = ((ParameterizedType) type).getRawType();
                                    try {
                                        if (!(rawType == HashMap.class || rawType == Map.class)) {
                                            if (rawType != List.class) {
                                                if (rawType == ArrayList.class) {
                                                }
                                            }
                                            return prf.a(new JSONArray((String) obj));
                                        }
                                        return prf.a(new JSONObject((String) obj));
                                    } catch (Exception e) {
                                        dwh.i(e);
                                    }
                                }
                                return null;
                            }
                        } else if (obj.getClass().isAssignableFrom(cls4) || (obj instanceof Float)) {
                            return obj;
                        } else {
                            if (obj instanceof Double) {
                                return Float.valueOf((float) ((Double) obj).doubleValue());
                            }
                            return c(obj);
                        }
                    } else if (obj.getClass().isAssignableFrom(cls3) || (obj instanceof Double)) {
                        return obj;
                    } else {
                        return Double.valueOf(b(obj));
                    }
                } else if (obj.getClass().isAssignableFrom(cls2) || (obj instanceof Long)) {
                    return obj;
                } else {
                    if (obj instanceof Integer) {
                        return Long.valueOf(((Integer) obj).intValue());
                    }
                    return Long.valueOf(e(obj));
                }
            } else if (obj.getClass().isAssignableFrom(cls) || (obj instanceof Integer)) {
                return obj;
            } else {
                return Integer.valueOf(d(obj));
            }
        } else if (obj instanceof String) {
            return obj;
        } else {
            return prf.b(obj).toString();
        }
    }

    public static float k(String str) {
        try {
            if (TextUtils.isEmpty(str) || TextUtils.equals(str, "null")) {
                return 0.0f;
            }
            return Float.parseFloat(str);
        } catch (NumberFormatException e) {
            dwh.i(e);
            return 0.0f;
        }
    }

    public MUSDKInstance f() {
        WeexInstance weexInstance;
        WeakReference<WeexInstance> weakReference = this.c;
        if (weakReference == null) {
            weexInstance = null;
        } else {
            weexInstance = weakReference.get();
        }
        return ((WeexInstanceImpl) weexInstance).getAdapterMUSInstance();
    }

    public WeexInstance g() {
        return this.c.get();
    }

    public void h(int i, String str, Object obj) {
        t5m t5mVar = this.f32318a;
        if (t5mVar != null) {
            t5mVar.a(i, str, obj);
            PlatformViewsController platformViewsController = this.b;
            if (platformViewsController != null && str.equals("scrollable.scroll")) {
                platformViewsController.g0(i);
            }
        }
    }

    public Object i(Object obj, ati atiVar, WeexValue[] weexValueArr) {
        try {
            try {
                return atiVar.b(obj, m(atiVar.a(), weexValueArr));
            } catch (Exception e) {
                dwh.g("MethodInvokeExecutor", obj + " Invoker " + atiVar.toString(), e);
                return null;
            }
        } catch (Exception e2) {
            dwh.i(e2);
            return null;
        }
    }

    public final Object[] m(Type[] typeArr, WeexValue[] weexValueArr) throws Exception {
        int i;
        if (weexValueArr == null) {
            i = 0;
        } else {
            i = weexValueArr.length;
        }
        Object[] objArr = new Object[typeArr.length];
        for (int i2 = 0; i2 < typeArr.length; i2++) {
            Type type = typeArr[i2];
            if (i2 < i) {
                WeexValue weexValue = weexValueArr[i2];
                if (weexValue == null || weexValue.getType() != WeexValue.Type.FUNCTION) {
                    objArr[i2] = f9x.f(type, weexValue);
                } else if (type == f4x.class || type == Object.class) {
                    objArr[i2] = new g4x(this.c.get(), ((Long) weexValue.getValue()).longValue());
                } else if (type == pvh.class) {
                    objArr[i2] = new sd0(((WeexInstanceImpl) this.c.get()).getAdapterMUSInstance(), ((Long) weexValue.getValue()).intValue(), null);
                } else if (type == WeexValue.class) {
                    objArr[i2] = weexValue;
                } else {
                    throw new IllegalArgumentException("[prepareArguments] WeexCallback can't assign to " + type);
                }
            } else if (!type.getClass().isPrimitive()) {
                objArr[i2] = null;
            } else {
                throw new Exception("[prepareArguments] method argument list not match.");
            }
        }
        return objArr;
    }

    public void n(t5m t5mVar) {
        this.f32318a = t5mVar;
    }

    public void o(WeexInstance weexInstance) {
        this.c = new WeakReference<>(weexInstance);
    }

    public static void l() {
    }
}
