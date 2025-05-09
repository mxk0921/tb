package tb;

import android.app.Application;
import android.os.Environment;
import android.text.TextUtils;
import androidx.collection.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfssdk.cache.AVFSCacheManager;
import com.taobao.tao.Globals;
import com.taobao.tao.util.Constants;
import java.io.File;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class qr2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static fdb f26890a = null;
    public static LruCache<String, Object> b = null;
    public static boolean c = false;
    public static final String d = "cache1";
    public static final String e = "persist_images";
    public static final String f = "tao_sdk";
    public static final int g = 10;

    public static synchronized void a(Application application) {
        synchronized (qr2.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3847dd28", new Object[]{application});
                return;
            }
            if (!c) {
                c = true;
                c();
            }
            np cacheForModule = AVFSCacheManager.getInstance().cacheForModule(f);
            if (cacheForModule != null) {
                cacheForModule.Z(application.getClassLoader());
            }
            new op().f25538a = 1048576L;
            if (f26890a == null && cacheForModule != null) {
                f26890a = cacheForModule.w();
            }
            if (b == null) {
                b = new LruCache<>(g);
            }
        }
    }

    public static void c() {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df5be3ed", new Object[0]);
            return;
        }
        String str3 = Constants.SAVE_FILE_ROOT_DIR;
        Application application = Globals.getApplication();
        if (application != null) {
            String packageName = application.getPackageName();
            if (!TextUtils.isEmpty(str3)) {
                str = Environment.getExternalStorageState().toString() + "/" + str3 + "/" + packageName;
                str2 = application.getExternalCacheDir() + "/" + str3 + "/" + packageName;
            } else {
                str = Environment.getExternalStorageState().toString() + "/" + packageName;
                str2 = application.getExternalCacheDir() + "/" + packageName;
            }
            b(new File(str));
            b(new File(str2));
            File filesDir = application.getFilesDir();
            String str4 = d;
            b(new File(filesDir, str4));
            b(new File(application.getFilesDir(), str4 + ".dat"));
            b(new File(application.getFilesDir(), e));
        }
    }

    public static void b(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfa94dde", new Object[]{file});
        } else if (file != null && file.exists()) {
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null && listFiles.length > 0) {
                    for (File file2 : listFiles) {
                        b(file2);
                    }
                    return;
                }
                return;
            }
            file.delete();
        }
    }

    static {
        t2o.a(775946241);
    }
}
