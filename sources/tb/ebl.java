package tb;

import android.app.Application;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.dojo.ability.log.ModuleName;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ebl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(447741989);
    }

    public static int a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dd78aaca", new Object[]{str, new Integer(i)})).intValue();
        }
        Application application = Globals.getApplication();
        if (application == null) {
            sdh.b(ModuleName.CLIENT_TO_SERVICE_MONITOR, "OrangeUtilcontext == null");
            return i;
        }
        SharedPreferences sharedPreferences = application.getSharedPreferences("homepage_switch", 0);
        if (sharedPreferences == null) {
            sdh.b(ModuleName.CLIENT_TO_SERVICE_MONITOR, "OrangeUtilsp == null");
            return i;
        }
        String string = sharedPreferences.getString(str, String.valueOf(i));
        if (TextUtils.isEmpty(string) || TextUtils.equals(string, "__NULL__")) {
            sdh.b(ModuleName.CLIENT_TO_SERVICE_MONITOR, "OrangeUtilvalue == null");
            return i;
        }
        try {
            return Integer.parseInt(string);
        } catch (Exception e) {
            sdh.b(ModuleName.CLIENT_TO_SERVICE_MONITOR, "Exception: " + e);
            return i;
        }
    }

    public static String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31d4edc", new Object[]{str, str2});
        }
        Application application = Globals.getApplication();
        if (application == null) {
            sdh.b(ModuleName.CLIENT_TO_SERVICE_MONITOR, "OrangeUtilcontext == null");
            return str2;
        }
        SharedPreferences sharedPreferences = application.getSharedPreferences("homepage_switch", 0);
        if (sharedPreferences == null) {
            sdh.b(ModuleName.CLIENT_TO_SERVICE_MONITOR, "OrangeUtilsp == null");
            return str2;
        }
        String string = sharedPreferences.getString(str, str2);
        if (TextUtils.equals(string, "__NULL__")) {
            return str2;
        }
        return string;
    }
}
