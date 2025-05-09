package tb;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import java.util.LinkedHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class tza {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static JSONObject f29042a;

    static {
        t2o.a(456130682);
    }

    public static String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c866592", new Object[]{context});
        }
        return context.getPackageName() + "_preferences";
    }

    public static SharedPreferences b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("75ba1678", new Object[0]);
        }
        return Globals.getApplication().getSharedPreferences(a(Globals.getApplication()), 0);
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a86ca6f2", new Object[]{str});
        }
        return b().getString(str, "");
    }

    public static String d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("90a5d9e8", new Object[]{str, str2});
        }
        return b().getString(str, str2);
    }

    public static boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("467292ba", new Object[]{str})).booleanValue();
        }
        if (f29042a == null) {
            String string = Globals.getApplication().getSharedPreferences("homepage_location_sp", 0).getString("editionTipsIsShown", "");
            if (!TextUtils.isEmpty(string)) {
                f29042a = JSON.parseObject(string);
            }
        }
        JSONObject jSONObject = f29042a;
        if (jSONObject == null || jSONObject.get(str) == null || !Boolean.valueOf(f29042a.get(str).toString()).booleanValue()) {
            return false;
        }
        return true;
    }

    public static void f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b67b41f", new Object[]{str, str2});
        } else {
            b().edit().putString(str, str2).apply();
        }
    }

    public static void g(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef498a6", new Object[]{str, new Boolean(z)});
            return;
        }
        if (f29042a == null) {
            f29042a = new JSONObject();
        }
        f29042a.put(str, (Object) Boolean.valueOf(z));
        Globals.getApplication().getSharedPreferences("homepage_location_sp", 0).edit().putString("editionTipsIsShown", f29042a.toJSONString()).apply();
    }

    public static void h(Activity activity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e73be7c5", new Object[]{activity, new Integer(i)});
        } else {
            new v78(activity, i, null).show();
        }
    }

    public static int[] i(String[] strArr, String str, String str2) {
        int i = 2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("59da9cd", new Object[]{strArr, str, str2});
        }
        int[] iArr = new int[strArr.length];
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < strArr.length; i4++) {
            String str3 = strArr[i4];
            if (str3.equals(str)) {
                if (str3.equals(str2)) {
                    i2 = i4;
                    i3 = i2;
                } else {
                    i2 = i4;
                }
            } else if (str3.equals(str2)) {
                i3 = i4;
            } else if (str3.equals("GLOBAL")) {
                iArr[strArr.length - 1] = i4;
            } else {
                linkedHashMap.put(str3, Integer.valueOf(i4));
            }
        }
        iArr[0] = i2;
        if (i2 != i3) {
            iArr[1] = i3;
        } else {
            i = 1;
        }
        for (Integer num : linkedHashMap.values()) {
            iArr[i] = num.intValue();
            i++;
        }
        return iArr;
    }
}
