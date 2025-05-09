package tb;

import android.app.Application;
import android.os.Environment;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfssdk.cache.AVFSCacheManager;
import com.taobao.tao.Globals;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class or2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static fdb f25588a = null;
    public static boolean b = false;
    public static final String c = "cache1";
    public static final String d = "persist_images";
    public static final String e = "MyTaobao";

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("182c01cf", new Object[]{str})).booleanValue();
        }
        fdb fdbVar = f25588a;
        if (fdbVar != null) {
            return fdbVar.A0(str);
        }
        return false;
    }

    public static synchronized void b(Application application) {
        synchronized (or2.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3847dd28", new Object[]{application});
                return;
            }
            if (!b) {
                b = true;
                d();
            }
            np cacheForModule = AVFSCacheManager.getInstance().cacheForModule(e);
            if (cacheForModule != null) {
                cacheForModule.Z(application.getClassLoader());
            }
            new op().f25538a = 1048576L;
            if (f25588a == null) {
                f25588a = cacheForModule.w();
            }
        }
    }

    public static void c(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfa94dde", new Object[]{file});
        } else if (file != null && file.exists()) {
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null && listFiles.length > 0) {
                    for (File file2 : listFiles) {
                        c(file2);
                    }
                    return;
                }
                return;
            }
            file.delete();
        }
    }

    public static void d() {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df5be3ed", new Object[0]);
            return;
        }
        Application application = Globals.getApplication();
        if (application != null) {
            String packageName = application.getPackageName();
            if (!TextUtils.isEmpty("taobao")) {
                str = Environment.getExternalStorageState().toString() + "/taobao/" + packageName;
                str2 = application.getExternalCacheDir() + "/taobao/" + packageName;
            } else {
                str = Environment.getExternalStorageState().toString() + "/" + packageName;
                str2 = application.getExternalCacheDir() + "/" + packageName;
            }
            c(new File(str));
            c(new File(str2));
            File filesDir = application.getFilesDir();
            String str3 = c;
            c(new File(filesDir, str3));
            c(new File(application.getFilesDir(), str3 + ".dat"));
            c(new File(application.getFilesDir(), d));
        }
    }

    static {
        t2o.a(745538188);
    }
}
