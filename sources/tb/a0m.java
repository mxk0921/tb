package tb;

import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.share.ShareEnv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class a0m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface a {
        boolean a(String str);
    }

    static {
        t2o.a(665845949);
    }

    public static String[] a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("37607bb6", new Object[0]);
        }
        if (ShareEnv.getApplication().getApplicationInfo().targetSdkVersion < 33 || Build.VERSION.SDK_INT < 33) {
            return new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};
        }
        return new String[]{xyl.READ_MEDIA_IMAGES, xyl.READ_MEDIA_VIDEO, "android.permission.READ_MEDIA_AUDIO"};
    }

    public static boolean b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("34698f61", new Object[]{aVar})).booleanValue();
        }
        try {
            if (ShareEnv.getApplication().getApplicationInfo().targetSdkVersion < 33 || Build.VERSION.SDK_INT < 33) {
                boolean a2 = aVar.a("android.permission.READ_EXTERNAL_STORAGE");
                boolean a3 = aVar.a("android.permission.WRITE_EXTERNAL_STORAGE");
                if (!a2 || !a3) {
                    return false;
                }
                return true;
            }
            boolean a4 = aVar.a(xyl.READ_MEDIA_IMAGES);
            boolean a5 = aVar.a(xyl.READ_MEDIA_VIDEO);
            boolean a6 = aVar.a("android.permission.READ_MEDIA_AUDIO");
            if (!a4 || !a5 || !a6) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b7cd6f8", new Object[0])).booleanValue();
        }
        if (ShareEnv.getApplication().getApplicationInfo().targetSdkVersion < 33 || Build.VERSION.SDK_INT < 33) {
            return false;
        }
        return true;
    }
}
