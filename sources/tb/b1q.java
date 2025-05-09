package tb;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class b1q {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int BUFFER_SIZE = 2048;
    public static final String SP_KEY_CACHED_SKIN_MAP = "cached_skins";
    public static final String SP_KEY_CURRENT_SKIN_CODE = "current_skin_code";
    public static final String SP_KEY_DEFAULT_CUSTOMER_AREA_SKIN = "is_default_village_skin";
    public static final String SP_KEY_IGNORE_FESTIVAL_END_TIME = "ignore_festival_end_time";
    public static final String SP_KEY_IGNORE_FESTIVAL_VESION = "ignore_festival_version";
    public static final String SP_KEY_ZIP_MAP = "downloaded_zips";

    /* renamed from: a  reason: collision with root package name */
    public static File f16130a;
    public static volatile SharedPreferences b = null;

    static {
        t2o.a(464519193);
    }

    public static boolean a(String str) {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("820413de", new Object[]{str})).booleanValue();
        }
        File file = new File(h(str));
        if (!file.exists() || (listFiles = file.listFiles()) == null || listFiles.length <= 0) {
            return false;
        }
        return true;
    }

    public static void b(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("807b73c5", new Object[]{file});
        } else if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                b(file2);
            }
            file.delete();
        } else {
            file.delete();
        }
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea11bd1c", new Object[]{str})).booleanValue();
        }
        File f = f(str);
        File file = new File(f.getAbsolutePath() + ".tmp");
        if (file.exists()) {
            file.delete();
        }
        return f.delete();
    }

    public static void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3aa6353d", new Object[]{str});
            return;
        }
        i();
        File file = new File(h(str));
        if (file.exists()) {
            b(file);
        }
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3b857af", new Object[0]);
        } else if (b == null) {
            synchronized (b1q.class) {
                try {
                    if (b == null) {
                        b = m7l.a(Globals.getApplication(), "festival_zip", 0);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static File f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("2069118b", new Object[]{str});
        }
        i();
        return new File(f16130a, str);
    }

    public static String g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d74258f7", new Object[]{str});
        }
        e();
        return b.getString(str, "");
    }

    public static String h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9b98ba77", new Object[]{str});
        }
        i();
        if (f16130a == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(f16130a);
        String str2 = File.separator;
        sb.append(str2);
        sb.append("pic_cache");
        sb.append(str2);
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b359038a", new Object[0]);
            return;
        }
        if (!dh9.a(f16130a)) {
            File b2 = dh9.b(Globals.getApplication().getApplicationContext());
            if (b2 != null) {
                f16130a = new File(b2, "festival");
            } else {
                return;
            }
        }
        if (!f16130a.exists()) {
            f16130a.mkdirs();
        }
    }

    public static byte[] j(String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("f08cf7fa", new Object[]{str});
        }
        File f = f(str);
        if (!f.exists()) {
            return null;
        }
        return i2d.a(new FileInputStream(f));
    }

    public static void k(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c11d63a", new Object[]{str, str2});
            return;
        }
        e();
        SharedPreferences.Editor edit = b.edit();
        edit.putString(str, str2);
        edit.apply();
    }

    public static void l(String str, byte[] bArr) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6e5d0f7", new Object[]{str, bArr});
            return;
        }
        i();
        if (!a(str)) {
            String h = h(str);
            ZipInputStream zipInputStream = new ZipInputStream(new ByteArrayInputStream(bArr));
            while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry != null) {
                    String name = nextEntry.getName();
                    if (!TextUtils.isEmpty(name) && !name.contains("../")) {
                        String replaceAll = (h + name).replaceAll("\\*", "/");
                        if (!replaceAll.contains("../")) {
                            File file = new File(replaceAll.substring(0, replaceAll.lastIndexOf(47)));
                            if (!file.exists()) {
                                file.mkdirs();
                            }
                            if (!new File(replaceAll).isDirectory()) {
                                FileOutputStream fileOutputStream = new FileOutputStream(replaceAll);
                                byte[] bArr2 = new byte[2048];
                                while (true) {
                                    int read = zipInputStream.read(bArr2);
                                    if (read <= 0) {
                                        break;
                                    }
                                    fileOutputStream.write(bArr2, 0, read);
                                }
                                fileOutputStream.flush();
                                fileOutputStream.getFD().sync();
                                fileOutputStream.close();
                            }
                        }
                    }
                } else {
                    zipInputStream.close();
                    return;
                }
            }
        }
    }

    public static boolean m(String str, byte[] bArr) {
        boolean z;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ee94601", new Object[]{str, bArr})).booleanValue();
        }
        File f = f(str);
        File file = new File(f.getAbsolutePath() + ".tmp");
        if (file.exists()) {
            file.delete();
        }
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        try {
            z = i2d.b(new FileOutputStream(file), bArr);
            if (z) {
                try {
                    if (f.exists()) {
                        f.delete();
                    }
                    file.renameTo(f);
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        TLog.loge("SkinCache", str + th.getMessage());
                        if (!z) {
                            file.delete();
                        }
                        return false;
                    } finally {
                        if (!z) {
                            file.delete();
                        }
                    }
                }
            }
            return z;
        } catch (Throwable th3) {
            th = th3;
            z = false;
        }
    }
}
