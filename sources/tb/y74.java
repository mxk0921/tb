package tb;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbuprofen.util.ReflectUtils;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Random;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class y74 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_GRAY = 2;
    public static final int TYPE_INTEGRATION = 4;
    public static final int TYPE_RELEASE = 1;
    public static final int TYPE_SELF_GRAY = 3;
    public static final int TYPE_TEST = 5;
    public static final int TYPE_UNKNOWN = 0;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f31891a = false;
    public static final Object b = new Object();
    public static final long c = System.currentTimeMillis();
    public static final long d = SystemClock.uptimeMillis();

    static {
        t2o.a(824180786);
    }

    public static String c(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a18567f7", new Object[]{context, str});
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
                if (packageInfo != null) {
                    return packageInfo.versionName;
                }
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
            }
        }
        return str;
    }

    public static boolean d(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ae07eb1", new Object[]{new Long(j)})).booleanValue();
        }
        if (j == 10000 || j > new Random().nextInt(10000)) {
            return true;
        }
        return false;
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f4d9eb0", new Object[0])).booleanValue();
        }
        if (f31891a) {
            return true;
        }
        synchronized (b) {
            if (f31891a) {
                return true;
            }
            System.loadLibrary("tbuprofen-util");
            f31891a = true;
            return true;
        }
    }

    public static Object f(Class<?> cls, String str, Object obj, Object obj2) throws IllegalAccessException, NoSuchFieldException {
        Field c2 = ReflectUtils.c(cls, str);
        if (c2 != null) {
            Object obj3 = c2.get(obj);
            c2.set(obj, obj2);
            return obj3;
        }
        throw new NoSuchFieldException();
    }

    public static String g(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("24536547", new Object[]{new Long(j)});
        }
        if (j == 0) {
            return "UNKNOWN";
        }
        return new SimpleDateFormat("HH:mm:ss.SSS").format(Long.valueOf(j));
    }

    public static String h(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("223a47e2", new Object[]{new Long(j)});
        }
        return new SimpleDateFormat("HH:mm:ss.SSS").format(Long.valueOf(c + (j - d)));
    }

    public static boolean i(File file, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a839eb5", new Object[]{file, str, new Boolean(z)})).booleanValue();
        }
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return false;
        }
        if (!parentFile.exists() && !parentFile.mkdirs()) {
            return false;
        }
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file, z));
            bufferedOutputStream.write(str.getBytes());
            bufferedOutputStream.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static String a(Context context, String str) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de2570b5", new Object[]{context, str});
        }
        if (context == null) {
            return null;
        }
        try {
            i = context.getResources().getIdentifier(str, "string", context.getPackageName());
        } catch (Exception unused) {
        }
        if (i != 0) {
            return context.getString(i);
        }
        return null;
    }

    public static int b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("189761ea", new Object[]{context})).intValue();
        }
        String a2 = a(context, "package_type");
        String a3 = a(context, "publish_type");
        if (a2 == null || a3 == null) {
            return 0;
        }
        char c2 = 65535;
        switch (a2.hashCode()) {
            case 49:
                if (a2.equals("1")) {
                    c2 = 0;
                    break;
                }
                break;
            case 50:
                if (a2.equals("2")) {
                    c2 = 1;
                    break;
                }
                break;
            case 51:
                if (a2.equals("3")) {
                    c2 = 2;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                if ("1".equals(a3)) {
                    return 1;
                }
                return "0".equals(a3) ? 2 : 4;
            case 1:
                return 4;
            case 2:
                return 5;
            default:
                return 0;
        }
    }
}
