package tb;

import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class gbs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(849346572);
    }

    public static boolean a(JSONObject jSONObject, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bd448a57", new Object[]{jSONObject, str, new Boolean(z)})).booleanValue();
        }
        if (jSONObject != null && !jSONObject.isEmpty()) {
            if (!jSONObject.containsKey(str)) {
                return z;
            }
            try {
                return jSONObject.getBooleanValue(str);
            } catch (Throwable unused) {
            }
        }
        return z;
    }

    public static JSONArray b(JSONObject jSONObject, String str, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("d3874e5e", new Object[]{jSONObject, str, jSONArray});
        }
        if (jSONObject != null && !jSONObject.isEmpty()) {
            if (!jSONObject.containsKey(str)) {
                return jSONArray;
            }
            try {
                return jSONObject.getJSONArray(str);
            } catch (Throwable unused) {
            }
        }
        return jSONArray;
    }

    public static JSONObject c(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e2cf8aba", new Object[]{jSONObject, str, jSONObject2});
        }
        if (jSONObject != null && !jSONObject.isEmpty()) {
            if (!jSONObject.containsKey(str)) {
                return jSONObject2;
            }
            try {
                return jSONObject.getJSONObject(str);
            } catch (Throwable unused) {
            }
        }
        return jSONObject2;
    }

    public static String d(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b40fbc34", new Object[]{jSONObject, str});
        }
        return e(jSONObject, str, "");
    }

    public static String e(JSONObject jSONObject, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("197ae2aa", new Object[]{jSONObject, str, str2});
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            return str2;
        }
        if (!jSONObject.containsKey(str)) {
            return str2;
        }
        try {
            String string = jSONObject.getString(str);
            if (string != null) {
                return string;
            }
            return str2;
        } catch (Throwable th) {
            Log.e("JSONUtils", "getString exception!", th);
            return str2;
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Map<java.lang.String, T>] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.HashMap] */
    public static <T> Map<String, T> f(JSONObject jSONObject, Map<String, T> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("76cd30ea", new Object[]{jSONObject, map});
        }
        if (jSONObject != null && !jSONObject.isEmpty()) {
            map = new HashMap();
            for (String str : jSONObject.keySet()) {
                try {
                    map.put(str, jSONObject.get(str));
                } catch (Throwable th) {
                    Log.e("JSONUtils", "jsonToMap error", th);
                }
            }
        }
        return (Map<String, T>) map;
    }

    public static byte[] g(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("b74bc049", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return new byte[0];
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeSerializable(jSONObject);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    public static JSONObject h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f057a803", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return JSON.parseObject(str);
        } catch (Exception e) {
            Log.e("JSONUtils", "parseObject error!", e);
            return null;
        }
    }

    public static JSONObject i(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("fcd91100", new Object[]{bArr});
        }
        if (bArr == null) {
            return null;
        }
        try {
            return JSON.parseObject(new String(bArr, "UTF-8"));
        } catch (Exception e) {
            Log.e("JSONUtils", "parseObject error!", e);
            return null;
        }
    }

    public static Bundle k(Bundle bundle, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("91724444", new Object[]{bundle, jSONObject});
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (jSONObject != null && !jSONObject.isEmpty()) {
            for (String str : jSONObject.keySet()) {
                try {
                    Object obj = jSONObject.get(str);
                    if (obj instanceof Integer) {
                        bundle.putInt(str, ((Integer) obj).intValue());
                    } else if (obj instanceof Boolean) {
                        bundle.putBoolean(str, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof String) {
                        bundle.putString(str, (String) obj);
                    } else if (obj instanceof Long) {
                        bundle.putLong(str, ((Long) obj).longValue());
                    } else if (obj instanceof Double) {
                        bundle.putDouble(str, ((Double) obj).doubleValue());
                    } else if (obj instanceof Float) {
                        bundle.putDouble(str, new BigDecimal(Float.toString(((Float) obj).floatValue())).doubleValue());
                    } else if (obj instanceof JSON) {
                        bundle.putString(str, ((JSON) obj).toJSONString());
                    } else if (obj instanceof BigDecimal) {
                        bundle.putDouble(str, ((BigDecimal) obj).doubleValue());
                    }
                } catch (Exception e) {
                    Log.e("JSONUtils", "toBundle exception", e);
                }
            }
        }
        return bundle;
    }

    public static Bundle l(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("b6364850", new Object[]{jSONObject});
        }
        return k(null, jSONObject);
    }

    public static <T> T j(byte[] bArr, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("700def75", new Object[]{bArr, cls});
        }
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        try {
            return (T) JSON.parseObject(bArr, cls, new Feature[0]);
        } catch (Exception e) {
            Log.e("JSONUtils", "parseObject error!", e);
            return null;
        }
    }

    /* JADX WARN: Finally extract failed */
    public static JSONObject m(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("92624fdc", new Object[]{bArr});
        }
        if (bArr == null || bArr.length == 0) {
            return new JSONObject();
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            JSONObject jSONObject = (JSONObject) obtain.readSerializable();
            obtain.recycle();
            return jSONObject;
        } catch (Throwable th) {
            try {
                Log.e("JSONUtils", "unmarshallJSONObject error!", th);
                obtain.recycle();
                return null;
            } catch (Throwable th2) {
                obtain.recycle();
                throw th2;
            }
        }
    }
}
