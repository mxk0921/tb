package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ze3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f32704a;
    public static Boolean b;

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65f009ac", new Object[0]);
        }
        String str = f32704a;
        if (str != null) {
            return str;
        }
        try {
            Application application = Globals.getApplication();
            if (application == null) {
                return "";
            }
            String str2 = application.getPackageManager().getPackageInfo(application.getPackageName(), 0).versionName;
            f32704a = str2;
            if (str2 == null) {
                return "";
            }
            return str2;
        } catch (Exception unused) {
            bf3.g("", "");
            return "";
        }
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a457b8b6", new Object[0])).booleanValue();
        }
        if (b == null) {
            try {
                b = Boolean.valueOf("9999".equals(a().split("\\.")[3]));
            } catch (Exception unused) {
                b = Boolean.FALSE;
            }
        }
        return b.booleanValue();
    }
}
