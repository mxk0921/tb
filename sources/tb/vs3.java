package tb;

import android.content.Context;
import android.os.Build;
import android.os.StatFs;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.monitor.config.RuleConfig;
import com.taobao.tao.log.TLog;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class vs3 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CACHE_DIR_NAME = "cache";
    public static final long DAY_IN_MILLS = 86400000;
    public static final String EXTERNAL_CACHE_DIR;
    public static final String EXTERNAL_CACHE_NAME = "ExternalCache";
    public static final String EXTERNAL_CACHE_ROOT_DIR;
    public static final String EXTERNAL_FILES_DIR;
    public static final String EXTERNAL_FILES_NAME = "ExternalFiles";
    public static final String EXTERNAL_FILES_ROOT_DIR;
    public static final String FILES_DIR_NAME = "files";
    public static final int GB_IN_BYTES = 1073741824;
    public static final String INNER_ROOT_DIR;
    public static final String INNER_ROOT_NAME = "InnerStorage";
    public static final int MB_IN_BYTES = 1048576;

    /* renamed from: a  reason: collision with root package name */
    public static int f30217a = -1;
    public static String b;
    public static String c;
    public static String d;

    static {
        t2o.a(737149071);
        StringBuilder sb = new StringBuilder();
        String str = File.separator;
        sb.append(str);
        sb.append(INNER_ROOT_NAME);
        INNER_ROOT_DIR = sb.toString();
        EXTERNAL_CACHE_ROOT_DIR = str + EXTERNAL_CACHE_NAME;
        EXTERNAL_FILES_ROOT_DIR = str + EXTERNAL_FILES_NAME;
        EXTERNAL_CACHE_DIR = str + EXTERNAL_CACHE_NAME + str + "cache";
        EXTERNAL_FILES_DIR = str + EXTERNAL_FILES_NAME + str + FILES_DIR_NAME;
    }

    public static String a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3e135f1d", new Object[]{new Long(j)});
        }
        if (j >= 1073741824) {
            StringBuilder sb = new StringBuilder();
            sb.append(d(j + "", "1073741824", 2));
            sb.append(" GB");
            return sb.toString();
        } else if (j >= 1048576) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(d(j + "", "1048576", 2));
            sb2.append(" MB");
            return sb2.toString();
        } else if (j > 1024) {
            return d(j + "", "1024", 2) + " KB";
        } else {
            return d(j + "", "1", 2) + " B";
        }
    }

    public static boolean b(File file, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("615a8ea7", new Object[]{file, list})).booleanValue();
        }
        File parentFile = file.getParentFile();
        if (parentFile == null || TextUtils.isEmpty(parentFile.getName()) || list == null) {
            return false;
        }
        return list.contains(parentFile.getName());
    }

    public static boolean c(Context context) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("38badec2", new Object[]{context})).booleanValue();
        }
        for (String str : context.getCacheDir().getAbsolutePath().split("/")) {
            if (!TextUtils.isEmpty(str)) {
                if (Pattern.matches("(([a-zA-Z0-9]{1,})\\.)+[a-zA-Z0-9]+", str) && !str.contains(context.getPackageName())) {
                    return false;
                }
                if (str.contains(context.getPackageName())) {
                    return true;
                }
            }
        }
        return true;
    }

    public static String d(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dbc416a9", new Object[]{str, str2, new Integer(i)});
        }
        if (i >= 0) {
            return new BigDecimal(str).divide(new BigDecimal(str2), i, RoundingMode.HALF_DOWN).toString();
        }
        throw new IllegalArgumentException("scale need > 0");
    }

    public static long e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("39c6f2ac", new Object[]{context})).longValue();
        }
        StatFs statFs = new StatFs(context.getCacheDir().getParentFile().getAbsolutePath());
        return (statFs.getAvailableBlocks() / 1024) * statFs.getBlockSize();
    }

    public static long f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("67dacae5", new Object[]{context})).longValue();
        }
        StatFs statFs = new StatFs(context.getCacheDir().getParentFile().getAbsolutePath());
        return (statFs.getBlockCount() / 1024) * statFs.getBlockSize();
    }

    public static String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("104f216e", new Object[0]);
        }
        if (c == null) {
            c = h() + File.separator + "cache";
        }
        return c;
    }

    public static String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d1c72d4c", new Object[0]);
        }
        if (b == null) {
            b = INNER_ROOT_DIR + File.separator + hg4.j().l();
        }
        return b;
    }

    public static String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4bb8dd63", new Object[0]);
        }
        if (d == null) {
            d = h() + File.separator + FILES_DIR_NAME;
        }
        return d;
    }

    public static boolean j(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("58d15d52", new Object[]{file})).booleanValue();
        }
        RuleConfig i = hg4.j().i();
        if (f30217a == -1) {
            List<String> softLinkExcludeBrand = i.getSoftLinkExcludeBrand();
            if (softLinkExcludeBrand != null && c(hg4.j().h())) {
                String str = Build.BRAND;
                if (TextUtils.isEmpty(str) || !softLinkExcludeBrand.contains(str.toUpperCase())) {
                    f30217a = 0;
                }
            }
            f30217a = 1;
        }
        if (f30217a != 0) {
            return b(file, i.getSoftLinkDir());
        }
        if (b(file, i.getSoftLinkDir()) || k(file)) {
            return true;
        }
        return false;
    }

    public static boolean k(File file) {
        boolean z;
        Path path;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e06b84e8", new Object[]{file})).booleanValue();
        }
        try {
            if (Build.VERSION.SDK_INT < 26 || !hg4.j().i().getEnableSoftLinkApi()) {
                z = !file.getAbsolutePath().equals(file.getCanonicalPath());
            } else {
                path = file.toPath();
                z = Files.isSymbolicLink(path);
            }
            return z;
        } catch (IOException unused) {
            TLog.loge(yr2.MODULE, "CleanerFile", "isSymbolicLinkSafely: with IOException, file path " + file.getAbsolutePath());
            return false;
        } catch (Throwable th) {
            s71.i("isSymbolicLinkSafely_" + th, "");
            return false;
        }
    }

    public static File l(Context context, String str) {
        File file;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("349348c3", new Object[]{context, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("/", 4);
        if (split.length < 4) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        String str2 = File.separator;
        sb.append(str2);
        sb.append(split[1]);
        sb.append(str2);
        sb.append(split[2]);
        String sb2 = sb.toString();
        if (TextUtils.equals(sb2, h())) {
            file = context.getCacheDir().getParentFile();
        } else if (TextUtils.equals(sb2, EXTERNAL_CACHE_DIR)) {
            file = context.getExternalCacheDir();
        } else if (!TextUtils.equals(sb2, EXTERNAL_FILES_DIR)) {
            return null;
        } else {
            file = context.getExternalFilesDir(null);
        }
        return new File(file, str.replace(sb2, ""));
    }
}
