package tb;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_framework.a;
import java.lang.reflect.Type;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class jxh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(982516257);
    }

    public static MUSValue a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSValue) ipChange.ipc$dispatch("19f50760", new Object[]{obj});
        }
        if (obj instanceof MUSValue) {
            return (MUSValue) obj;
        }
        Class<?> cls = obj.getClass();
        if (String.class.isAssignableFrom(cls)) {
            return MUSValue.ofString((String) obj);
        }
        if (Integer.class == cls || Integer.TYPE == cls) {
            return MUSValue.ofInt(((Integer) obj).intValue());
        }
        if (Long.class == cls || Long.TYPE == cls) {
            return MUSValue.ofInt(((Long) obj).longValue());
        }
        if (Float.class == cls || Float.TYPE == cls) {
            return MUSValue.ofFloat(((Float) obj).floatValue());
        }
        if (Double.class == cls || Double.TYPE == cls) {
            return MUSValue.ofFloat(((Double) obj).doubleValue());
        }
        if (Boolean.class == cls || Boolean.TYPE == cls) {
            return MUSValue.ofBool(((Boolean) obj).booleanValue());
        }
        if (JSON.class.isAssignableFrom(cls)) {
            return MUSValue.ofJSON(obj);
        }
        if (byte[].class == cls) {
            return MUSValue.ofArrayBuffer((byte[]) obj);
        }
        return null;
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e55a8c7", new Object[0]);
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) f5x.a().getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected() && activeNetworkInfo.isAvailable()) {
                int type = activeNetworkInfo.getType();
                if (!ConnectivityManager.isNetworkTypeValid(type)) {
                    return "other";
                }
                if (type == 1) {
                    return "wifi";
                }
                switch (activeNetworkInfo.getSubtype()) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                        return "2g";
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                        return "3g";
                    case 13:
                        return "4g";
                    default:
                        return "other";
                }
            }
            return "other";
        } catch (Throwable unused) {
            return "other";
        }
    }

    public static boolean c(Type type) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db329c84", new Object[]{type})).booleanValue();
        }
        if (!(type instanceof Class)) {
            return false;
        }
        if (type == MUSValue.class || type == Integer.TYPE || type == Float.TYPE || type == Boolean.TYPE || type == Long.TYPE || type == String.class || type == JSONObject.class || type == JSONArray.class || type == pvh.class || type == Object.class || type == Integer.class || type == Float.class || type == Boolean.class || type == Long.class || type == byte[].class) {
            return true;
        }
        return false;
    }

    public static Object e(a aVar, Object obj, Type type, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("60d19394", new Object[]{aVar, obj, type, mUSValue});
        }
        if (mUSValue == null) {
            return null;
        }
        if (!mUSValue.isFunction()) {
            return f(type, mUSValue);
        }
        if (type == pvh.class || type == Object.class) {
            return new sd0((tvh) aVar, mUSValue.getFunctionId(), obj);
        }
        return null;
    }

    public static Object f(Type type, MUSValue mUSValue) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("729c055f", new Object[]{type, mUSValue});
        }
        if (type == MUSValue.class) {
            return mUSValue;
        }
        if (mUSValue == null) {
            obj = null;
        } else {
            obj = mUSValue.getValue();
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
                    if (!(type == Float.TYPE || type == Float.class)) {
                        if (type == Boolean.TYPE) {
                            if (!(mUSValue == null || mUSValue.getType() == 0)) {
                                if (mUSValue.getType() == 5) {
                                    return Boolean.TRUE;
                                }
                                if (mUSValue.getType() == 6) {
                                    return Boolean.FALSE;
                                }
                                if (mUSValue.getType() == 4) {
                                    return Boolean.valueOf(Boolean.parseBoolean(mUSValue.getStringValue()));
                                }
                                throw new IllegalArgumentException("Can't convert " + mUSValue + " to " + type);
                            }
                            return Boolean.FALSE;
                        } else if (type == Boolean.class) {
                            if (!(mUSValue == null || mUSValue.getType() == 0)) {
                                if (mUSValue.getType() == 5) {
                                    return Boolean.TRUE;
                                }
                                if (mUSValue.getType() == 6) {
                                    return Boolean.FALSE;
                                }
                                if (mUSValue.getType() == 4) {
                                    return Boolean.valueOf(Boolean.parseBoolean(mUSValue.getStringValue()));
                                }
                                throw new IllegalArgumentException("Can't convert " + mUSValue + " to " + type);
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
                            throw new IllegalArgumentException("Can't convert " + mUSValue + " to " + type);
                        } else if (type != JSONObject.class) {
                            throw new IllegalArgumentException("Can't convert " + mUSValue + " to " + type);
                        } else if (obj == null) {
                            return null;
                        } else {
                            if (obj instanceof JSONObject) {
                                return obj;
                            }
                            if (obj instanceof String) {
                                return JSON.parseObject((String) obj);
                            }
                            throw new IllegalArgumentException("Can't convert " + mUSValue + " to " + type);
                        }
                    }
                    return Float.valueOf(g(obj));
                }
                return Integer.valueOf((int) g(obj));
            } else if (obj instanceof String) {
                return obj;
            } else {
                return JSON.toJSONString(obj);
            }
        } catch (Exception e) {
            throw new IllegalArgumentException("Can't convert " + mUSValue + " to " + type, e);
        }
    }

    public static float g(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1ce0f081", new Object[]{obj})).floatValue();
        }
        if (obj == null) {
            throw new IllegalArgumentException("float param can't be null");
        } else if (obj instanceof Long) {
            return (float) ((Long) obj).longValue();
        } else {
            if (obj instanceof Double) {
                return (float) ((Double) obj).doubleValue();
            }
            return fxh.g(obj.toString().trim());
        }
    }

    public static int h(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("168436d3", new Object[]{new Float(f)})).intValue();
        }
        if (f <= 0.0f || f >= 1.0f) {
            return (int) f;
        }
        return Math.round(f);
    }

    public static boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e7ef95", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        if (!parse.isHierarchical()) {
            return false;
        }
        String queryParameter = parse.getQueryParameter(h8x.KEY_WEEX_MODE);
        if ("dom".equals(queryParameter) || h8x.KEY_MUS.equals(queryParameter) || "xr".equals(queryParameter)) {
            return "true".equals(parse.getQueryParameter("wh_weex")) || !TextUtils.isEmpty(parse.getQueryParameter(uyv.WX_TPL)) || !TextUtils.isEmpty(parse.getQueryParameter("_mus_tpl"));
        }
        return false;
    }
}
