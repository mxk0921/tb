package tb;

import android.content.Context;
import android.os.SystemClock;
import android.system.Os;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class goq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f20135a = String.valueOf(SystemClock.uptimeMillis());
    public static volatile boolean b = true;

    public static File a(File file, File file2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("f920c63a", new Object[]{file, file2});
        }
        if (file2.isDirectory()) {
            File file3 = new File(file2, file.getName());
            if (file3.exists()) {
                RSoLog.d("SWSoLoaderCore, targetLib exists,  " + file3);
                return file3;
            }
            try {
                if (b) {
                    RSoLog.d("SWSoLoaderCore, ready ensure symlink = " + file3 + "  ->  " + file);
                    Os.symlink(file.getPath(), file3.getPath());
                    return file3;
                }
            } catch (Throwable th) {
                rbn.g("Os.symlink", th);
            }
            RSoLog.d("SWSoLoaderCore, ready to copy file = " + file3 + "  from  " + file);
            jg9.a(file, file3);
            return file3;
        }
        throw new RuntimeException("targetDir not available " + file2);
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4a2a056c", new Object[0]);
        }
        return f20135a;
    }

    public static File c(Context context, String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("98baace6", new Object[]{context, str});
        }
        File dir = context.getDir("swallows", 0);
        StringBuilder sb = new StringBuilder("runtime_dir");
        String str2 = File.separator;
        sb.append(str2);
        sb.append(b());
        sb.append(str2);
        sb.append(str);
        File file = new File(dir, sb.toString());
        if (!file.isDirectory()) {
            jg9.h(file);
            RSoLog.d("StorageUtils, ensureUniqueRuntimeDir complete, dir = " + file.getPath());
        }
        return file;
    }

    public static void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95dfb26b", new Object[]{context});
            return;
        }
        File file = new File(context.getDir("swallows", 0), "runtime_dir");
        ArrayList arrayList = new ArrayList();
        jg9.l(file, arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            File file2 = (File) it.next();
            if (file2.getPath().endsWith(b())) {
                RSoLog.d("StorageUtils, removeExpiredRuntimeDir, keep using " + file2.getPath());
            } else {
                RSoLog.d("StorageUtils, removeExpiredRuntimeDir, will delete " + file2.getPath());
                uos.e(file2);
            }
        }
    }
}
