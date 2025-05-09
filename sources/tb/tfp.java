package tb;

import android.app.Application;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class tfp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("efa9460c", new Object[]{str});
        }
        String userId = Login.getUserId();
        if (TextUtils.isEmpty(userId)) {
            userId = "_NotLogin";
        } else {
            str = str.concat("_");
        }
        return str.concat(userId);
    }

    public static void b(gyb gybVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fab6d45", new Object[]{gybVar, new Integer(i), str});
        } else if (gybVar != null) {
            gybVar.onFailed(i, str);
        }
    }

    public static SharedPreferences c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("31455887", new Object[0]);
        }
        Application application = Globals.getApplication();
        return application.getSharedPreferences(a(application.getPackageName()), 0);
    }

    public static boolean d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6ab9e68", new Object[]{str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        return true;
    }

    public static <T> void e(gyb gybVar, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29f1409f", new Object[]{gybVar, t});
        } else if (gybVar != null) {
            gybVar.onSuccess(t);
        }
    }
}
