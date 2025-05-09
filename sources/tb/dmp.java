package tb;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.share.business.ShareConstants;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class dmp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(664797284);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c47532fc", new Object[]{str, str2});
        } else if (str != null) {
            SharedPreferences.Editor edit = b().edit();
            if (str2 == null) {
                edit.remove(str);
            } else {
                edit.putString(str, str2);
            }
            edit.apply();
        }
    }

    public static SharedPreferences b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("a1eaf87f", new Object[0]);
        }
        return hjp.a().getSharedPreferences(ShareConstants.SP_SHARE, 0);
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5b6d009a", new Object[]{str});
        }
        return b().getString(str, null);
    }

    public static String d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b7721990", new Object[]{str, str2});
        }
        String c = c(str);
        if (TextUtils.isEmpty(c)) {
            return str2;
        }
        return c;
    }
}
