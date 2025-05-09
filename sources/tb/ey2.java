package tb;

import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.weex.common.Constants;
import java.util.Date;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ey2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815793160);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a3a654c0", new Object[0]);
        }
        Date date = new Date();
        return date.getYear() + "." + date.getMonth() + "." + date.getDate();
    }

    public static boolean b(SharedPreferences sharedPreferences, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dbd0575a", new Object[]{sharedPreferences, str, str2})).booleanValue();
        }
        return str2.equals(sharedPreferences.getString(str + "date", ""));
    }

    public static boolean c(dy2 dy2Var) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e9ae7133", new Object[]{dy2Var})).booleanValue();
        }
        SharedPreferences b = v4p.b();
        String str = "cameraAnim_" + dy2Var.c + "_" + Login.getNick() + "_";
        String a2 = a();
        boolean b2 = b(b, str, a2);
        if (b2) {
            i = b.getInt(str + iiz.PERF_STAG_TOTAL, 0);
        } else {
            i = 0;
        }
        if (i >= dy2Var.f18146a) {
            return false;
        }
        int i2 = -1;
        if (b2) {
            i2 = b.getInt(str + Constants.Name.INTERVAL, -1);
        }
        if (i2 >= dy2Var.b - 1 || i2 < 0) {
            b.edit().putString(str + "date", a2).putInt(str + iiz.PERF_STAG_TOTAL, i + 1).putInt(str + Constants.Name.INTERVAL, 0).apply();
            return true;
        }
        b.edit().putString(str + "date", a2).putInt(str + Constants.Name.INTERVAL, i2 + 1).apply();
        return false;
    }
}
