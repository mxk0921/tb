package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.api.ConnectionResult;
import com.taobao.alimama.services.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ztv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1019215911);
    }

    public static String a(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("783bc88f", new Object[]{strArr});
        }
        if (strArr == null || strArr.length <= 0) {
            return "";
        }
        return TextUtils.join(",", strArr);
    }

    public static void b(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f813a18", new Object[]{str, strArr});
        } else {
            c(ConnectionResult.SERVICE_UPDATING, str, "", "", a(strArr));
        }
    }

    public static void c(int i, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf46462b", new Object[]{new Integer(i), str, str2, str3, str4});
        } else {
            a.e().d().b("O2OAdSDK", i, str, str2, str3, "sdkversion=5.15.27", str4);
        }
    }
}
