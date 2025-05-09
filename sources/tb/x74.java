package tb;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.webkit.CookieManager;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class x74 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f31188a = "";
    public static Boolean b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final AtomicBoolean d = new AtomicBoolean(false);
        public static double e;

        /* renamed from: a  reason: collision with root package name */
        public boolean f31189a;
        public int b;
        public int c = 0;

        static {
            t2o.a(989856421);
            d();
        }

        public static /* synthetic */ String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("7022ea09", new Object[0]);
            }
            return b();
        }

        public static String b() {
            int i;
            IpChange ipChange = $ipChange;
            int i2 = 0;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("5e91c0b", new Object[0]);
            }
            a c = c();
            hzb hzbVar = (hzb) jpw.c().a(hzb.class);
            if (hzbVar != null) {
                i2 = hzbVar.getScreenWidth();
                i = hzbVar.getScreenHeight();
            } else {
                i = 0;
            }
            double d2 = c.b / e;
            return "w=" + i2 + "&h=" + i + "&ls=" + (c.f31189a ? 1 : 0) + "&sh=" + d2 + "&dpr=" + e + "&dl=" + c.c;
        }

        public static a c() {
            Resources resources;
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c0a06e84", new Object[0]);
            }
            a aVar = new a();
            Application application = yaa.n;
            if (!(application == null || (resources = application.getResources()) == null)) {
                int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                if (identifier > 0) {
                    aVar.b = resources.getDimensionPixelSize(identifier);
                }
                Configuration configuration = resources.getConfiguration();
                if (configuration != null) {
                    if (configuration.orientation == 2) {
                        z = true;
                    }
                    aVar.f31189a = z;
                }
            }
            chb g = c21.g();
            if (g != null) {
                aVar.c = g.getInt("deviceLevel", -1) + 1;
            }
            return aVar;
        }

        public static void d() {
            Application application;
            Resources resources;
            DisplayMetrics displayMetrics;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("884fc625", new Object[0]);
                return;
            }
            AtomicBoolean atomicBoolean = d;
            if (!atomicBoolean.get() && (application = yaa.n) != null && (resources = application.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null && atomicBoolean.compareAndSet(false, true)) {
                e = displayMetrics.density;
            }
        }
    }

    static {
        t2o.a(989856420);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74c5609", new Object[0]);
            return;
        }
        try {
            CookieManager.getInstance().flush();
        } catch (Throwable th) {
            v7t.d("CommonUtils", "CookieManager flush Exception:" + i(th));
        }
    }

    public static ldb b(String str, String str2, String str3, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ldb) ipChange.ipc$dispatch("e23fd3b7", new Object[]{str, str2, str3, context});
        }
        if (context instanceof MutableContextWrapper) {
            context = ((MutableContextWrapper) context).getBaseContext();
        }
        if (TextUtils.isEmpty(str3)) {
            str3 = "WindVane";
        }
        return new zq(c(str, str2), str3).a(context);
    }

    public static String c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31347b0d", new Object[]{str, str2});
        }
        if (str2 != null) {
            return str2;
        }
        String str3 = null;
        if (str != null) {
            try {
                str3 = f(str);
            } catch (Exception unused) {
            }
        }
        return !TextUtils.isEmpty(str3) ? str3 : "windvane";
    }

    public static String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5e91c0b", new Object[0]);
        }
        return a.a();
    }

    public static File e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("9b648098", new Object[]{context});
        }
        if (vpw.commonConfig.Y && Build.VERSION.SDK_INT >= 29) {
            try {
                File externalFilesDir = context.getExternalFilesDir("apk");
                if (externalFilesDir != null) {
                    if (!externalFilesDir.exists()) {
                        externalFilesDir.mkdir();
                    }
                    return externalFilesDir;
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        try {
            File externalCacheDir = context.getExternalCacheDir();
            if (externalCacheDir != null) {
                if (!externalCacheDir.exists()) {
                    externalCacheDir.mkdirs();
                }
                return externalCacheDir;
            }
        } catch (Exception unused) {
        }
        File file = new File(Environment.getExternalStorageDirectory().getPath() + ("/Android/data/" + context.getPackageName() + "/cache/"));
        try {
            if (!file.exists()) {
                file.mkdirs();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return file;
    }

    public static String f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bcc82dd1", new Object[]{str});
        }
        Uri parse = Uri.parse(str);
        String host = parse.getHost();
        String path = parse.getPath();
        if (path == null) {
            path = "";
        }
        return host + path;
    }

    public static String g(Context context, String str) {
        PackageInfo packageInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("85a7eab0", new Object[]{context, str});
        }
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null || (packageInfo = packageManager.getPackageInfo(str, 0)) == null) {
                    return "";
                }
                return packageInfo.versionName;
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
            }
        }
        return "";
    }

    public static String h(Context context) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7512d303", new Object[]{context});
        }
        try {
            str = f31188a;
        } catch (Exception e) {
            v7t.d("getProcessName error", e.toString());
        }
        if (str != null && str.length() > 0) {
            return f31188a;
        }
        if (context == null) {
            return null;
        }
        int myPid = Process.myPid();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
            if (runningAppProcessInfo.pid == myPid) {
                f31188a = runningAppProcessInfo.processName;
            }
        }
        return f31188a;
    }

    public static String i(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b084d465", new Object[]{th});
        }
        StringWriter stringWriter = new StringWriter();
        try {
            th.printStackTrace(new PrintWriter(stringWriter));
        } catch (Throwable unused) {
        }
        return stringWriter.toString();
    }

    public static boolean j(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9fbcdac", new Object[]{context, str})).booleanValue();
        }
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    if (packageManager.getPackageInfo(str, 0) != null) {
                        return true;
                    }
                    return false;
                }
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public static boolean l(Context context) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42bb9b9", new Object[]{context})).booleanValue();
        }
        if (b == null) {
            String h = h(context);
            if (context != null && TextUtils.equals(h, context.getPackageName())) {
                z = true;
            }
            b = Boolean.valueOf(z);
        }
        return b.booleanValue();
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7b369172", new Object[0])).booleanValue();
        }
        String str = Build.VERSION.CODENAME;
        if ((str.length() != 1 || str.charAt(0) < 'Q' || str.charAt(0) > 'Z') && Build.VERSION.SDK_INT != 29) {
            return false;
        }
        return true;
    }

    public static boolean k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8ab8e26", new Object[]{str})).booleanValue();
        }
        return !TextUtils.isEmpty(str) && str.toLowerCase().startsWith("image");
    }

    public static boolean m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4fc35009", new Object[]{str})).booleanValue();
        }
        if (!(str == null || -1 == str.lastIndexOf("."))) {
            String substring = str.substring(str.lastIndexOf(".") + 1, str.length());
            String[] strArr = {"png", "jpeg", ryp.FILE_TYPE_IMAGE_JPG, "webp"};
            for (int i = 0; i < 4; i++) {
                if (strArr[i].equals(substring)) {
                    return true;
                }
            }
        }
        return false;
    }
}
