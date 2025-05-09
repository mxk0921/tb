package com.alibaba.ariver.kernel.common.utils;

import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.deserializer.ParseProcess;
import com.android.alibaba.ip.runtime.IpChange;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class JSONUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean contains(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f56bbfd8", new Object[]{jSONObject, str})).booleanValue();
        }
        if (jSONObject == null || jSONObject.isEmpty() || !jSONObject.containsKey(str)) {
            return false;
        }
        return true;
    }

    public static JSONObject deepCopy(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ea311088", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        for (String str : jSONObject.keySet()) {
            Object obj = jSONObject.get(str);
            if (obj instanceof JSONArray) {
                jSONObject2.put(str, (Object) deepCopy((JSONArray) obj));
            } else if (obj instanceof JSONObject) {
                jSONObject2.put(str, (Object) deepCopy((JSONObject) obj));
            } else {
                jSONObject2.put(str, obj);
            }
        }
        return jSONObject2;
    }

    public static boolean getBoolean(JSONObject jSONObject, String str, boolean z) {
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

    public static Integer getColorInt(JSONObject jSONObject, String str) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("14732078", new Object[]{jSONObject, str});
        }
        if (jSONObject == null || (obj = jSONObject.get(str)) == null) {
            return null;
        }
        return TypeUtils.parseColorInt(obj);
    }

    public static Long getColorLong(JSONObject jSONObject, String str) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("18e3daeb", new Object[]{jSONObject, str});
        }
        if (jSONObject == null || (obj = jSONObject.get(str)) == null) {
            return null;
        }
        return TypeUtils.parseColorLong(obj);
    }

    public static float getFloat(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("615ce15d", new Object[]{jSONObject, str})).floatValue() : getFloat(jSONObject, str, 0.0f);
    }

    public static int getInt(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ab7a87ed", new Object[]{jSONObject, str})).intValue() : getInt(jSONObject, str, 0);
    }

    public static JSONArray getJSONArray(JSONObject jSONObject, String str, JSONArray jSONArray) {
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

    public static JSONObject getJSONObject(JSONObject jSONObject, String str, JSONObject jSONObject2) {
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

    public static long getLong(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("74ee5595", new Object[]{jSONObject, str})).longValue() : getLong(jSONObject, str, 0L);
    }

    public static String getString(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b40fbc34", new Object[]{jSONObject, str}) : getString(jSONObject, str, "");
    }

    public static <T> T getValue(JSONObject jSONObject, String str, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("984cc11e", new Object[]{jSONObject, str, t});
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            return t;
        }
        if (!jSONObject.containsKey(str)) {
            return t;
        }
        return (T) jSONObject.get(str);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Map<java.lang.String, T>] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.HashMap] */
    public static <T> Map<String, T> jsonToMap(JSONObject jSONObject, Map<String, T> map) {
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
                    RVLogger.e(RVConstants.TAG, th);
                }
            }
        }
        return (Map<String, T>) map;
    }

    /* JADX WARN: Finally extract failed */
    public static byte[] marshallJSONArray(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("ae38216b", new Object[]{jSONArray});
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeSerializable(jSONArray);
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            return marshall;
        } catch (Throwable th) {
            try {
                RVLogger.e("AriverKernel", "marshallJSONArray", th);
                obtain.recycle();
                return null;
            } catch (Throwable th2) {
                obtain.recycle();
                throw th2;
            }
        }
    }

    public static byte[] marshallJSONObject(JSONObject jSONObject) {
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

    public static JSONObject mergeJsonWhitoutRecursive(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("531d0787", new Object[]{jSONObject, jSONObject2});
        }
        if (jSONObject2 != null && !jSONObject2.isEmpty()) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        }
        return jSONObject;
    }

    public static JSONArray parseArray(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("1c9581e7", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return JSON.parseArray(str);
        } catch (Exception e) {
            RVLogger.e("parseArray error!", e);
            return null;
        }
    }

    public static JSONObject parseObject(String str) {
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
            RVLogger.e("parseObject error!", e);
            return null;
        }
    }

    public static Bundle toBundle(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bundle) ipChange.ipc$dispatch("b6364850", new Object[]{jSONObject}) : toBundle(null, jSONObject);
    }

    public static String toString(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("494cf5e3", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return "";
        }
        try {
            return jSONObject.toString();
        } catch (Exception e) {
            RVLogger.e("AriverKernel", "JSONObject to String error!", e);
            return "";
        }
    }

    public static float getFloat(JSONObject jSONObject, String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ca3fb3e3", new Object[]{jSONObject, str, new Float(f)})).floatValue();
        }
        if (jSONObject == null || jSONObject.isEmpty() || !jSONObject.containsKey(str)) {
            return f;
        }
        try {
            return jSONObject.getFloatValue(str);
        } catch (Throwable unused) {
            return f;
        }
    }

    public static int getInt(JSONObject jSONObject, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c3d6ea3c", new Object[]{jSONObject, str, new Integer(i)})).intValue();
        }
        if (jSONObject == null || jSONObject.isEmpty() || !jSONObject.containsKey(str)) {
            return i;
        }
        try {
            return jSONObject.getIntValue(str);
        } catch (Throwable unused) {
            return i;
        }
    }

    public static long getLong(JSONObject jSONObject, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("28dcd537", new Object[]{jSONObject, str, new Long(j)})).longValue();
        }
        if (jSONObject == null || jSONObject.isEmpty() || !jSONObject.containsKey(str)) {
            return j;
        }
        try {
            return jSONObject.getLongValue(str);
        } catch (Throwable unused) {
            return j;
        }
    }

    public static String getString(JSONObject jSONObject, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("197ae2aa", new Object[]{jSONObject, str, str2});
        }
        if (jSONObject == null || jSONObject.isEmpty() || !jSONObject.containsKey(str)) {
            return str2;
        }
        try {
            String string = jSONObject.getString(str);
            return string != null ? string : str2;
        } catch (Throwable th) {
            RVLogger.e(RVConstants.TAG, "getString exception!", th);
            return str2;
        }
    }

    public static Bundle toBundle(Bundle bundle, JSONObject jSONObject) {
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
                    RVLogger.e("toBundle exception", e);
                }
            }
        }
        return bundle;
    }

    /* JADX WARN: Finally extract failed */
    public static JSONArray unmarshallJSONArray(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("a3e72326", new Object[]{bArr});
        }
        if (bArr == null || bArr.length == 0) {
            return new JSONArray();
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            JSONArray jSONArray = (JSONArray) obtain.readSerializable();
            obtain.recycle();
            return jSONArray;
        } catch (Throwable th) {
            try {
                RVLogger.e("AriverKernel", "unmarshallJSONObject error!", th);
                obtain.recycle();
                return null;
            } catch (Throwable th2) {
                obtain.recycle();
                throw th2;
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    public static JSONObject unmarshallJSONObject(byte[] bArr) {
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
                RVLogger.e("AriverKernel", "unmarshallJSONObject error!", th);
                obtain.recycle();
                return null;
            } catch (Throwable th2) {
                obtain.recycle();
                throw th2;
            }
        }
    }

    public static List<String> toStringArray(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("90c4984b", new Object[]{jSONArray});
        }
        if (jSONArray == null) {
            return null;
        }
        try {
            int size = jSONArray.size();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < size; i++) {
                arrayList.add(jSONArray.getString(i));
            }
            return arrayList;
        } catch (Throwable th) {
            RVLogger.e("toStringArray error!", th);
            return null;
        }
    }

    public static JSONObject parseObject(byte[] bArr) {
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
            RVLogger.e("parseObject error!", e);
            return null;
        }
    }

    public static <T> T parseObject(byte[] bArr, Class<T> cls) {
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
            RVLogger.e("parseObject error!", e);
            return null;
        }
    }

    public static <T> T parseObject(byte[] bArr, Class<T> cls, ParseProcess parseProcess) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("cfdd2140", new Object[]{bArr, cls, parseProcess});
        }
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        try {
            return (T) JSON.parseObject(new String(bArr, "UTF-8"), (Class<Object>) cls, parseProcess, new Feature[0]);
        } catch (Exception e) {
            RVLogger.e("parseObject error!", e);
            return null;
        }
    }

    public static JSONArray deepCopy(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("3624448e", new Object[]{jSONArray});
        }
        if (jSONArray == null) {
            return null;
        }
        JSONArray jSONArray2 = new JSONArray();
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof JSONArray) {
                jSONArray2.add(deepCopy((JSONArray) next));
            } else if (next instanceof JSONObject) {
                jSONArray2.add(deepCopy((JSONObject) next));
            } else {
                jSONArray2.add(next);
            }
        }
        return jSONArray2;
    }
}
