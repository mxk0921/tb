package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class i8g {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LC_ASK_TEMP_DIR = "/LcAskTemp";
    public static final String LC_RATE_TEMP_DIR = "/LcRateTemp";
    public static final String LC_TEMP_DIR = "/LcTemp";
    public static final String LC_XGUANG = "/XGuangCreator";

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f21154a = new AtomicBoolean(false);

    static {
        t2o.a(511705606);
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83b2ce28", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || !str.contains("/LcTemp/PublishImage")) {
            return false;
        }
        return true;
    }

    public static String b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7d873811", new Object[]{context});
        }
        return k(context, false, "/LcTemp/ComprehensionImages", ".jpg");
    }

    public static String c(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("536def2d", new Object[]{context, str, str2});
        }
        return d(context, false, str, str2);
    }

    public static String d(Context context, boolean z, String str, String str2) {
        File file;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("38ff4782", new Object[]{context, new Boolean(z), str, str2});
        }
        if (z) {
            file = context.getExternalCacheDir();
        } else {
            file = context.getExternalFilesDir(null);
        }
        if (file == null || !file.exists()) {
            return null;
        }
        String str3 = file.getAbsolutePath() + str;
        File file2 = new File(str3);
        if (!file2.exists() && !file2.mkdirs()) {
            return null;
        }
        return str3 + "/" + str2;
    }

    public static String e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("567833c8", new Object[]{context});
        }
        return k(context, false, "/LcTemp/PublishImage", ".jpg");
    }

    public static String f(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd41d3e", new Object[]{context, str});
        }
        return k(context, false, "/LcTemp/PublishImage", str);
    }

    public static String g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc20d6ad", new Object[]{context});
        }
        return k(context, false, "/LcTemp/PublishImage", ".png");
    }

    public static String h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e7971db7", new Object[]{context});
        }
        return k(context, false, "/LcTemp/PublishVideoCover", ".jpg");
    }

    public static String i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f6c096e8", new Object[]{context});
        }
        return k(context, false, "/LcTemp/PublishVideo", gov.SUFFIX_MP4);
    }

    public static String j(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c335f85e", new Object[]{context, str});
        }
        return k(context, false, "/LcTemp/PublishVideo", str);
    }

    public static String k(Context context, boolean z, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ba49a0f0", new Object[]{context, new Boolean(z), str, str2});
        }
        return l(context, z, str, str2, true);
    }

    public static String l(Context context, boolean z, String str, String str2, boolean z2) {
        File file;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3228a1fc", new Object[]{context, new Boolean(z), str, str2, new Boolean(z2)});
        }
        f21154a.set(true);
        if (z2) {
            if (z) {
                file = context.getExternalCacheDir();
            } else {
                file = context.getExternalFilesDir(null);
            }
        } else if (z) {
            file = context.getCacheDir();
        } else {
            file = context.getFilesDir();
        }
        if (file == null || !file.exists()) {
            return null;
        }
        String str3 = file.getAbsolutePath() + str;
        File file2 = new File(str3);
        if (!file2.exists() && !file2.mkdirs()) {
            return null;
        }
        return str3 + "/" + i6a.b() + str2;
    }
}
