package tb;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.webkit.WebView;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.InvocationTargetException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class g4r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(989856399);
    }

    public static PackageInfo a(Context context) {
        PackageInfo currentWebViewPackage;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PackageInfo) ipChange.ipc$dispatch("d8d9707c", new Object[]{context});
        }
        if (Build.VERSION.SDK_INT >= 26) {
            currentWebViewPackage = WebView.getCurrentWebViewPackage();
            return currentWebViewPackage;
        }
        try {
            PackageInfo b = b();
            return b != null ? b : c(context);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    public static PackageInfo b() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", new Class[0]).invoke(null, new Object[0]);
    }

    public static PackageInfo c(Context context) {
        String str;
        try {
            if (Build.VERSION.SDK_INT <= 23) {
                str = (String) Class.forName("android.webkit.WebViewFactory").getMethod("getWebViewPackageName", new Class[0]).invoke(null, new Object[0]);
            } else {
                str = (String) Class.forName("android.webkit.WebViewUpdateService").getMethod("getCurrentWebViewPackageName", new Class[0]).invoke(null, new Object[0]);
            }
            if (str == null) {
                return null;
            }
            return context.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }
}
