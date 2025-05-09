package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class lfw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(793772108);
    }

    public static float[] a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("3162085", new Object[]{str});
        }
        int lastIndexOf = str.lastIndexOf(40);
        String[] split = str.substring(lastIndexOf + 1, str.indexOf(41, lastIndexOf)).split(",");
        return new float[]{Float.parseFloat(split[0]), Float.parseFloat(split[1])};
    }

    public static float b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b4b03bb4", new Object[]{new Integer(i)})).floatValue();
        }
        if (i == 1) {
            return -0.319f;
        }
        if (i == 2) {
            return -0.3f;
        }
        if (i == 3) {
            return -0.306f;
        }
        if (i != 8) {
            return -0.24f;
        }
        return -0.301f;
    }

    public static float c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("527e9df1", new Object[]{new Integer(i)})).floatValue();
        }
        if (i == 1) {
            return 0.15f;
        }
        if (i == 3) {
            return 0.11f;
        }
        if (i != 8) {
            return 0.186f;
        }
        return 0.13f;
    }

    public static float d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9fa3c822", new Object[]{new Integer(i)})).floatValue();
        }
        if (i == 0) {
            return 0.343f;
        }
        if (i == 1) {
            return 0.332f;
        }
        if (i == 3) {
            return 0.327f;
        }
        if (i != 8) {
            return 0.323f;
        }
        return 0.336f;
    }

    public static float e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c61843", new Object[]{new Integer(i)})).floatValue();
        }
        if (i == 1) {
            return 0.275f;
        }
        if (i == 3) {
            return 0.155f;
        }
        if (i != 8) {
            return 0.342f;
        }
        return 0.207f;
    }

    public static float[] f(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("e08df5e", new Object[]{new Integer(i), str});
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            if (parseObject != null) {
                return m(parseObject).get(Integer.valueOf(i));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new float[]{0.5f, 0.5f};
    }

    public static float[] g(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("5a3e4652", new Object[]{new Integer(i), str});
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            if (parseObject != null) {
                return m(parseObject).get(Integer.valueOf(i));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return i != 1 ? i != 2 ? i != 3 ? i != 8 ? new float[]{0.473f, 0.466f} : new float[]{0.473f, 0.464f} : new float[]{0.473f, 0.462f} : new float[]{0.473f, 0.455f} : new float[]{0.473f, 0.46f};
    }

    public static float h(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2d68d13a", new Object[]{new Integer(i), str})).floatValue();
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            if (parseObject != null) {
                return n(parseObject).get(Integer.valueOf(i)).floatValue();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (i == 1) {
            return 0.257f;
        }
        if (i == 3 || i == 8) {
            return 0.193f;
        }
        return 0.321f;
    }

    public static float i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("abe5f722", new Object[]{new Integer(i)})).floatValue();
        }
        if (i == 1) {
            return 0.46f;
        }
        if (i == 2) {
            return 0.45f;
        }
        if (i == 3) {
            return 0.453f;
        }
        if (i != 8) {
            return 0.442f;
        }
        return 0.464f;
    }

    public static float j(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("314a4943", new Object[]{new Integer(i)})).floatValue();
        }
        if (i == 1) {
            return 0.096f;
        }
        if (i == 3) {
            return 0.066f;
        }
        if (i != 8) {
            return 0.12f;
        }
        return 0.085f;
    }

    public static float k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3ae44fc5", new Object[]{new Integer(i)})).floatValue();
        }
        if (i == 1) {
            return 0.105f;
        }
        if (i == 2) {
            return 0.096f;
        }
        if (i == 3) {
            return 0.116f;
        }
        if (i != 8) {
            return 0.066f;
        }
        return 0.125f;
    }

    public static float l(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("989c6b80", new Object[]{new Integer(i)})).floatValue();
        }
        if (i == 1) {
            return 0.64f;
        }
        if (i == 3) {
            return 0.36f;
        }
        if (i != 8) {
            return 0.8f;
        }
        return 0.48f;
    }

    public static Map<Integer, float[]> m(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2c745b07", new Object[]{jSONObject});
        }
        HashMap hashMap = new HashMap();
        hashMap.put(0, a(jSONObject.getString("9:16")));
        hashMap.put(2, a(jSONObject.getString(cbw.VALUE_THREE_FOUR_RATIO)));
        hashMap.put(1, a(jSONObject.getString("1:1")));
        hashMap.put(8, a(jSONObject.getString("4:3")));
        hashMap.put(3, a(jSONObject.getString(cbw.VALUE_SIXTEEN_NINE_RATIO)));
        return hashMap;
    }

    public static Map<Integer, Float> n(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bbe3ea7a", new Object[]{jSONObject});
        }
        HashMap hashMap = new HashMap();
        hashMap.put(0, Float.valueOf(Float.parseFloat(jSONObject.getString("9:16"))));
        hashMap.put(2, Float.valueOf(Float.parseFloat(jSONObject.getString(cbw.VALUE_THREE_FOUR_RATIO))));
        hashMap.put(1, Float.valueOf(Float.parseFloat(jSONObject.getString("1:1"))));
        hashMap.put(8, Float.valueOf(Float.parseFloat(jSONObject.getString("4:3"))));
        hashMap.put(3, Float.valueOf(Float.parseFloat(jSONObject.getString(cbw.VALUE_SIXTEEN_NINE_RATIO))));
        return hashMap;
    }
}
