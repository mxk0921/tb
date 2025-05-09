package tb;

import android.text.TextUtils;
import androidx.collection.ArrayMap;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class b3p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f16159a;

    static {
        t2o.a(815793037);
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39ad6ceb", new Object[0]);
            return;
        }
        File d = d();
        if (!d.exists()) {
            boolean mkdir = d.mkdir();
            ArrayMap arrayMap = new ArrayMap();
            arrayMap.put("success", String.valueOf(mkdir));
            sen.f("SearchCacheCreate", arrayMap);
            b4p.g("SearchFileCacheUtil", "create search dir:" + mkdir);
        }
    }

    public static File c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("add4caea", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File d = d();
        if (!d.exists()) {
            return null;
        }
        return new File(d, str);
    }

    public static File d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("9554dcb7", new Object[0]);
        }
        return new File(Globals.getApplication().getFilesDir(), "search");
    }

    public static synchronized void e() {
        synchronized (b3p.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fede197", new Object[0]);
            } else if (!f16159a) {
                b4p.g("SearchFileCacheUtil", "init");
                b();
                f16159a = true;
                b4p.g("SearchFileCacheUtil", "init completed!");
            }
        }
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea815e00", new Object[]{str})).booleanValue();
        }
        if (o4p.h2()) {
            b4p.k("SearchFileCacheUtil", "search history is disabled");
            return false;
        }
        b4p.g("SearchFileCacheUtil", "delete file " + str);
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        e();
        if (!f16159a) {
            b4p.k("SearchFileCacheUtil", "search file cache is not inited!");
            return false;
        }
        File c = c(str);
        if (c != null) {
            return c.delete();
        }
        b4p.k("SearchFileCacheUtil", "target file is null");
        return false;
    }

    public static String f(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("447a3289", new Object[]{str});
        }
        if (o4p.h2()) {
            b4p.k("SearchFileCacheUtil", "search history is disabled");
            return "";
        }
        b4p.g("SearchFileCacheUtil", "load file " + str);
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        e();
        if (!f16159a) {
            b4p.k("SearchFileCacheUtil", "search file cache is not inited!");
            return "";
        }
        File c = c(str);
        if (c == null) {
            b4p.k("SearchFileCacheUtil", "target file is null");
            return "";
        } else if (!c.exists()) {
            b4p.g("SearchFileCacheUtil", "target file does not exists");
            return "";
        } else {
            try {
                FileInputStream fileInputStream = new FileInputStream(c);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1024);
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read <= -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                fileInputStream.close();
                str2 = new String(byteArrayOutputStream.toByteArray(), "UTF-8");
            } catch (Throwable th) {
                b4p.l("SearchFileCacheUtil", "load file error:" + str, th);
                str2 = null;
            }
            return TextUtils.isEmpty(str2) ? "" : str2;
        }
    }

    public static boolean g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e25d029c", new Object[]{str, str2})).booleanValue();
        }
        if (o4p.h2()) {
            b4p.k("SearchFileCacheUtil", "search history is disabled");
            return false;
        }
        b4p.g("SearchFileCacheUtil", "save file " + str);
        if (!TextUtils.isEmpty(str) && str2 != null) {
            e();
            if (!f16159a) {
                b4p.k("SearchFileCacheUtil", "search file cache is not inited!");
                return false;
            }
            File c = c(str);
            if (c == null) {
                b4p.k("SearchFileCacheUtil", "target file is null");
                return false;
            }
            try {
                b4p.g("SearchFileCacheUtil", "file path:" + c);
                FileOutputStream fileOutputStream = new FileOutputStream(c, false);
                fileOutputStream.write(str2.getBytes("UTF-8"));
                fileOutputStream.close();
                return true;
            } catch (Throwable th) {
                b4p.l("SearchFileCacheUtil", "save file error:" + str, th);
            }
        }
        return false;
    }
}
