package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ydq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SPM_MAP_KEY = "spm";

    static {
        t2o.a(455082038);
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("53d07eaa", new Object[]{str, str2});
        }
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        return str + str2;
    }

    public static String b(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3200a52f", new Object[]{str, str2, str3, str4});
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return null;
        }
        if (TextUtils.isEmpty(str4)) {
            str4 = "";
        }
        return str + "." + str2 + "." + str3 + "." + str4;
    }

    public static String c(acu acuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("93722d25", new Object[]{acuVar});
        }
        if (acuVar == null) {
            return null;
        }
        return b(acuVar.f15667a, acuVar.b, acuVar.c, acuVar.d);
    }
}
