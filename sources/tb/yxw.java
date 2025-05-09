package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class yxw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(793772110);
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8da68839", new Object[]{str})).booleanValue();
        }
        if (!new File(str).exists()) {
            return new File(str).mkdirs();
        }
        return false;
    }

    public static String b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5a4da31c", new Object[]{context, str});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(context.getExternalCacheDir().getAbsolutePath());
        String str2 = File.separator;
        sb.append(str2);
        sb.append("ShareOutput");
        sb.append(str2);
        sb.append(vbm.TYPE_IMAGE);
        sb.append(str2);
        String sb2 = sb.toString();
        a(sb2);
        return sb2 + str + "_mask_bottom.png";
    }

    public static String c(Context context, String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1747746b", new Object[]{context, str, new Integer(i), new Integer(i2)});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(context.getExternalCacheDir().getAbsolutePath());
        String str2 = File.separator;
        sb.append(str2);
        sb.append("ShareOutput");
        sb.append(str2);
        sb.append(vbm.TYPE_IMAGE);
        sb.append(str2);
        String sb2 = sb.toString();
        a(sb2);
        return sb2 + str + "_" + i + "_" + i2 + "_mask_bg.png";
    }

    public static String d(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8e380217", new Object[]{context, str});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(context.getExternalCacheDir().getAbsolutePath());
        String str2 = File.separator;
        sb.append(str2);
        sb.append("ShareOutput");
        sb.append(str2);
        sb.append(vbm.TYPE_IMAGE);
        sb.append(str2);
        String sb2 = sb.toString();
        a(sb2);
        return sb2 + str + "_mask_profile.png";
    }

    public static String e(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("61b8e369", new Object[]{context, str});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(context.getExternalCacheDir().getAbsolutePath());
        String str2 = File.separator;
        sb.append(str2);
        sb.append("ShareOutput");
        sb.append(str2);
        sb.append(vbm.TYPE_IMAGE);
        sb.append(str2);
        String sb2 = sb.toString();
        a(sb2);
        return sb2 + str + "_mask_search.png";
    }

    public static String f(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7238458d", new Object[]{context, str});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(context.getExternalCacheDir().getAbsolutePath());
        String str2 = File.separator;
        sb.append(str2);
        sb.append("ShareOutput");
        sb.append(str2);
        sb.append("ShareVideo");
        sb.append(str2);
        String sb2 = sb.toString();
        a(sb2);
        return sb2 + str + "_" + System.currentTimeMillis() + gov.SUFFIX_MP4;
    }

    public static boolean g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("45fe62d7", new Object[]{str})).booleanValue();
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                if (new File(str).exists()) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
