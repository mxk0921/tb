package tb;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.player.videodecide.VideoControllerManager;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ztl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f33007a;
    public static String b;
    public static String c;

    static {
        t2o.a(782237760);
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8da68839", new Object[]{str})).booleanValue();
        }
        if (!uf9.g(str)) {
            return new File(str).mkdirs();
        }
        return false;
    }

    public static String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("398cd24f", new Object[]{str, str2});
        }
        String i = i(str, true);
        if (i == null) {
            return null;
        }
        String str3 = i + File.separator + str2.hashCode();
        a(str3);
        return str3;
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7d7f7560", new Object[0]);
        }
        return ".tptemp";
    }

    public static String d(String str, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("af659510", new Object[]{str, new Integer(i), new Boolean(z)});
        }
        if (b == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(b);
        if (i == -1) {
            sb.append(str);
        } else {
            sb.append(str + "_" + i);
        }
        String sb2 = sb.toString();
        if (z) {
            a(sb2);
        }
        return sb2;
    }

    public static String e(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("309737ab", new Object[]{str, new Boolean(z)});
        }
        if (b == null) {
            return null;
        }
        String str2 = b + str;
        if (z) {
            a(str2);
        }
        return str2;
    }

    public static String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ac9fb430", new Object[0]);
        }
        String str = c + "material_response" + File.separator;
        a(str);
        return str;
    }

    public static String g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("38ec91b5", new Object[]{str});
        }
        if (b == null) {
            return null;
        }
        String str2 = b + "music" + File.separator + str;
        a(str2);
        return str2;
    }

    public static String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c54ce30", new Object[0]);
        }
        if (b == null) {
            return null;
        }
        return b + VideoControllerManager.ARRAY_KEY_RESOURCES;
    }

    public static String i(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ef37dcd9", new Object[]{str, new Boolean(z)});
        }
        if (b == null) {
            return null;
        }
        String str2 = h() + File.separator + str;
        if (z) {
            a(str2);
        }
        return str2;
    }

    public static String j(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("df2b7dc9", new Object[]{context});
        }
        if (TextUtils.isEmpty(f33007a)) {
            k(context);
        }
        return f33007a;
    }

    public static void k(Context context) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82fb2026", new Object[]{context});
        } else if (context != null) {
            if (c == null || f33007a == null) {
                if ("mounted".equals(Environment.getExternalStorageState()) || !Environment.isExternalStorageRemovable()) {
                    File externalCacheDir = context.getExternalCacheDir();
                    if (uf9.f(externalCacheDir)) {
                        str2 = externalCacheDir.getAbsolutePath();
                    } else {
                        str2 = context.getCacheDir().getAbsolutePath();
                    }
                    str = TextUtils.isEmpty(str2) ? context.getCacheDir().getAbsolutePath() : str2;
                } else {
                    str = context.getCacheDir().getAbsolutePath();
                }
                if (!TextUtils.isEmpty(str)) {
                    String str3 = File.separator;
                    if (!str.endsWith(str3)) {
                        str = str + str3;
                    }
                    c = str;
                    String str4 = str + "material_download" + str3;
                    b = str4;
                    a(str4);
                    String str5 = str + "taopai" + str3;
                    f33007a = str5;
                    a(str5);
                }
            }
        }
    }
}
