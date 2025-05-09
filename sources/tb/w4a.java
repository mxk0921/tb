package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class w4a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(487587904);
    }

    public static String[] a(JSONObject jSONObject) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("8d9ab1d0", new Object[]{jSONObject});
        }
        if (jSONObject == null || (obj = jSONObject.get("containers")) == null || !(obj instanceof String[])) {
            return null;
        }
        String[] strArr = (String[]) obj;
        if (strArr.length == 0) {
            return null;
        }
        return strArr;
    }

    public static String b(xs6 xs6Var, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6f3a723d", new Object[]{xs6Var, strArr});
        }
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        for (String str : strArr) {
            if (c(xs6Var, str)) {
                return str;
            }
        }
        return strArr[0];
    }

    public static boolean c(xs6 xs6Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a87c75c", new Object[]{xs6Var, str})).booleanValue();
        }
        return TextUtils.equals(xs6Var.k(), str);
    }
}
