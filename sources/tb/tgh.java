package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliLogInterface;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class tgh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912262810);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99ada172", new Object[]{str});
        } else {
            b(ins.TAG, str);
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a88c12bc", new Object[]{str, str2});
            return;
        }
        if (str == null) {
            str = "NULL";
        }
        if (str2 == null) {
            str2 = "null";
        }
        String concat = "TTDetail_".concat(str);
        Log.e(concat, str2);
        AliLogInterface c = jq0.c();
        if (c != null) {
            c.loge(concat, str2);
        }
    }

    public static void c(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc02eb9", new Object[]{str, str2, th});
            return;
        }
        if (str == null) {
            str = "NULL";
        }
        if (str2 == null) {
            str2 = "null";
        }
        String concat = "TTDetail_".concat(str);
        Log.e(concat, str2, th);
        AliLogInterface c = jq0.c();
        if (c != null) {
            c.loge(concat, str2, th);
        }
    }
}
