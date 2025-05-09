package tb;

import android.app.Application;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class nno {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SP_FILE_HOME_DX_DATA = "home_dx_data";

    static {
        t2o.a(456130589);
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("331957c5", new Object[]{str, str2});
        }
        return b("homepage_biz_switch", str, str2);
    }

    public static String b(String str, String str2, String str3) {
        Application application;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eef51bfb", new Object[]{str, str2, str3});
        }
        if (!TextUtils.isEmpty(str2) && (application = Globals.getApplication()) != null) {
            return application.getSharedPreferences(str, 0).getString(str2, str3);
        }
        return null;
    }
}
