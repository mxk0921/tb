package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class yqq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806355860);
    }

    public static String b(Uri uri) {
        JSONObject d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("49ed013b", new Object[]{uri});
        }
        if (uri == null || (d = fkx.d(uri.getQueryParameter(yj4.PARAM_UT_PARAMS))) == null) {
            return null;
        }
        return d.getString("x_object_type");
    }

    public static String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cf3c12ca", new Object[]{str});
        }
        if (TextUtils.isEmpty(str) || str.length() <= 1) {
            return str;
        }
        if (str.length() == 2) {
            return str.charAt(0) + "*";
        }
        return str.charAt(0) + "***" + str.charAt(str.length() - 1);
    }

    public static boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a300898", new Object[]{str})).booleanValue();
        }
        if (str == null || str.isEmpty()) {
            return true;
        }
        return false;
    }

    public static boolean f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4fbdda4c", new Object[]{str, str2})).booleanValue();
        }
        ArrayList arrayList = null;
        try {
            JSONArray parseArray = JSON.parseArray(str2);
            if (parseArray.size() > 0) {
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < parseArray.size(); i++) {
                    try {
                        if (!TextUtils.isEmpty(parseArray.getString(i))) {
                            arrayList2.add(parseArray.getString(i));
                        }
                    } catch (Throwable unused) {
                    }
                }
                arrayList = arrayList2;
            }
        } catch (Throwable unused2) {
        }
        if (!TextUtils.isEmpty(str) && arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str3 = (String) it.next();
                if (!TextUtils.isEmpty(str3) && str3.equalsIgnoreCase(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String g(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("60ef7ad1", new Object[]{obj});
        }
        if (obj == null) {
            return "";
        }
        return obj.toString();
    }

    public static boolean h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9b32eca", new Object[]{str})).booleanValue();
        }
        return i(str, false);
    }

    public static boolean i(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6cb35cd2", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        if (str == null) {
            return z;
        }
        try {
            return Boolean.parseBoolean(str);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return z;
        }
    }

    public static float j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1646a52a", new Object[]{str})).floatValue();
        }
        return k(str, 0.0f);
    }

    public static float k(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b28e69b6", new Object[]{str, new Float(f)})).floatValue();
        }
        if (str == null) {
            return f;
        }
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return f;
        }
    }

    public static int l(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("20b562c9", new Object[]{str, new Integer(i)})).intValue();
        }
        if (str == null) {
            return i;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return i;
        }
    }

    public static long m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6eaba914", new Object[]{str})).longValue();
        }
        return n(str, 0L);
    }

    public static long n(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("66c9f198", new Object[]{str, new Long(j)})).longValue();
        }
        if (str == null) {
            return j;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return j;
        }
    }

    public static int o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8b55a73a", new Object[]{str})).intValue();
        }
        return l(str, 0);
    }

    public static boolean p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be0a201c", new Object[]{str})).booleanValue();
        }
        return "true".equals(str.toLowerCase()) || "1".equals(str);
    }
}
