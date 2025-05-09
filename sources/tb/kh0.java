package tb;

import android.app.Application;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class kh0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809939);
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("331957c5", new Object[]{str, str2});
        }
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        Application application = Globals.getApplication();
        if (application == null) {
            return str2;
        }
        return application.getSharedPreferences("buy_after_sp_name", 0).getString(str, str2);
    }

    public static boolean b(String str, String str2) {
        Application application;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cf81cde6", new Object[]{str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || (application = Globals.getApplication()) == null) {
            return false;
        }
        SharedPreferences.Editor edit = application.getSharedPreferences("buy_after_sp_name", 0).edit();
        edit.putString(str, str2);
        edit.apply();
        return true;
    }
}
