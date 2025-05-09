package tb;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class krq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final SimpleDateFormat f22870a = new SimpleDateFormat("mm:ss");

    public static String a(String... strArr) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("963f5dc5", new Object[]{strArr});
        }
        if (strArr == null || strArr.length <= 0) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str)) {
                if (str.contains(",")) {
                    for (String str2 : str.split(",")) {
                        if (!TextUtils.isEmpty(str2) && !arrayList.contains(str2)) {
                            arrayList.add(str2);
                        }
                    }
                } else if (!arrayList.contains(str)) {
                    arrayList.add(str);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append((String) arrayList.get(i));
        }
        return sb.toString();
    }

    public static boolean b(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3915235", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return z;
            }
            return Boolean.parseBoolean(str);
        } catch (Exception unused) {
            return z;
        }
    }

    public static int d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6826e071", new Object[]{str})).intValue();
        }
        return e(str, 0);
    }

    public static int e(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9cb5a238", new Object[]{str, new Integer(i)})).intValue();
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return i;
            }
            return Color.parseColor(str);
        } catch (Throwable unused) {
            return i;
        }
    }

    public static float f(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19eb28b9", new Object[]{obj})).floatValue();
        }
        if (obj instanceof Float) {
            return ((Float) obj).floatValue();
        }
        if (obj instanceof BigDecimal) {
            return ((BigDecimal) obj).floatValue();
        }
        return 0.0f;
    }

    public static float g(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("86205bd9", new Object[]{str, new Float(f)})).floatValue();
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return f;
            }
            return Float.parseFloat(str);
        } catch (Exception unused) {
            return f;
        }
    }

    public static String h(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d327d2b", new Object[]{new Long(j)});
        }
        long j2 = ((int) j) % 1000;
        if (j2 > 0) {
            j = (j + 1000) - j2;
        }
        return f22870a.format(Long.valueOf(j));
    }

    public static int i(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("235381ac", new Object[]{str, new Integer(i)})).intValue();
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return i;
            }
            return Integer.parseInt(str);
        } catch (Throwable unused) {
            return i;
        }
    }

    public static JSONObject j(JSONObject jSONObject, int i, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c21d0188", new Object[]{jSONObject, new Integer(i), strArr});
        }
        if (strArr == null || i == 0) {
            return jSONObject;
        }
        if (jSONObject == null || strArr.length == 0 || strArr.length < i) {
            return null;
        }
        for (int i2 = 0; i2 < i; i2++) {
            try {
                jSONObject = jSONObject.getJSONObject(strArr[i2]);
                if (jSONObject == null) {
                    return null;
                }
            } catch (Exception unused) {
                return null;
            }
        }
        return jSONObject;
    }

    public static long k(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b7efaf15", new Object[]{str, new Long(j)})).longValue();
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return j;
            }
            return Long.parseLong(str);
        } catch (Throwable unused) {
            return j;
        }
    }

    public static String l(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6a218007", new Object[]{new Long(j)});
        }
        if (Float.compare(Math.round((((float) (j / 1000)) * 1.0f) / ((float) 1000)), 1.0f) >= 0) {
            j += 1000;
        }
        SimpleDateFormat simpleDateFormat = f22870a;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+00:00"));
        return simpleDateFormat.format(Long.valueOf(j));
    }

    public static String m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3869b6e7", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                String hexString = Integer.toHexString(b & 255);
                while (hexString.length() < 2) {
                    hexString = "0" + hexString;
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String n(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1fd30c36", new Object[]{new Long(j)});
        }
        if ((j / 1000) % 60 > 10) {
            return String.format("%.1f", Float.valueOf(((float) j) / 60000.0f));
        }
        return String.format("%d", Long.valueOf(j / 60000));
    }

    public static String o(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("edac13be", new Object[]{new Long(j)});
        }
        return f22870a.format(new Date(j));
    }

    public static String p(JSONObject jSONObject, String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8686794d", new Object[]{jSONObject, str, strArr});
        }
        if (strArr == null || strArr.length == 0) {
            return str;
        }
        JSONObject j = j(jSONObject, strArr.length - 1, strArr);
        if (j == null) {
            return str;
        }
        String string = j.getString(strArr[strArr.length - 1]);
        if (string == null) {
            return str;
        }
        return string;
    }

    public static String q(long j, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72f7148e", new Object[]{new Long(j), new Boolean(z)});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Math.round(((float) j) / 1000.0f));
        if (z) {
            str = "s";
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    public static String s(Map<String, String> map, String str, String str2) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc3de480", new Object[]{map, str, str2});
        }
        if (map == null || map.isEmpty()) {
            return "";
        }
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            str2 = "";
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (!z) {
                sb.append(str2);
            }
            sb.append(entry.getKey());
            sb.append(str);
            sb.append(entry.getValue());
            z = false;
        }
        return sb.toString();
    }

    public static String t(List<String> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a99be66", new Object[]{list, str});
        }
        if (list == null || list.isEmpty()) {
            return "";
        }
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append(list.get(i));
            if (i < size - 1) {
                sb.append(str);
            }
        }
        return sb.toString();
    }

    public static String u(Context context, String str) {
        Throwable th;
        IOException e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f1eebc5", new Object[]{context, str});
        }
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(AssetsDelegate.proxy_open(context.getAssets(), str)));
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine == null) {
                            break;
                        }
                        sb.append(readLine);
                    } catch (IOException e2) {
                        e = e2;
                        bufferedReader = bufferedReader2;
                        e.printStackTrace();
                        cg9.u(bufferedReader);
                        return sb.toString();
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader = bufferedReader2;
                        cg9.u(bufferedReader);
                        throw th;
                    }
                }
                cg9.u(bufferedReader2);
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e3) {
            e = e3;
        }
        return sb.toString();
    }

    public static List<String> v(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("481c556d", new Object[]{str, str2});
        }
        if (TextUtils.isEmpty(str)) {
            return new ArrayList();
        }
        return Arrays.asList(str.split(str2));
    }

    public static boolean c(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("95165c99", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return z;
            }
            if (!str.equalsIgnoreCase("true")) {
                if (!str.equalsIgnoreCase("1")) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return z;
        }
    }

    public static String r(long j, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7ea5c4a9", new Object[]{new Long(j), new Boolean(z)});
        }
        String format = String.format(Locale.ENGLISH, "%.1f", Float.valueOf(((float) j) / 1000.0f));
        if (z) {
            str = "s";
        } else {
            str = "";
        }
        return format.concat(str);
    }

    static {
        t2o.a(511705655);
    }
}
