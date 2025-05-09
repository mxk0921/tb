package tb;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class e4r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static PackageInfo f18276a;
    public static volatile boolean b = false;

    static {
        t2o.a(989856398);
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3fb03292", new Object[0]);
        }
        PackageInfo packageInfo = f18276a;
        if (packageInfo != null) {
            return packageInfo.versionName;
        }
        return null;
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("864013ff", new Object[]{context});
        } else if (!b) {
            b = true;
            PackageInfo b2 = b(context);
            if (b2 != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("package", b2.packageName);
                    jSONObject.put("version", b2.versionName);
                    jSONObject.put("os", Build.VERSION.RELEASE);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                y71.commitSuccess(y71.MONITOR_POINT_SYS_WEBVIEW, jSONObject.toString());
            }
        }
    }

    public static PackageInfo b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PackageInfo) ipChange.ipc$dispatch("4067056e", new Object[]{context});
        }
        PackageInfo packageInfo = f18276a;
        if (packageInfo != null) {
            return packageInfo;
        }
        try {
            PackageInfo a2 = g4r.a(context);
            if (a2 == null) {
                return null;
            }
            f18276a = a2;
            return a2;
        } catch (Throwable th) {
            v7t.e("SystemWebViewChecker", "getSystemWebViewInfo fail", th, new Object[0]);
            return null;
        }
    }
}
