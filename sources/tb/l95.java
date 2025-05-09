package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class l95 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(452985193);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d7732e7f", new Object[]{str});
        }
        StringBuilder sb = new StringBuilder(20);
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            sb.append("_");
        }
        sb.append(System.currentTimeMillis());
        return sb.toString();
    }

    public static String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b50fd31f", new Object[]{str, str2});
        }
        StringBuilder sb = new StringBuilder("android");
        if (!TextUtils.isEmpty(str2)) {
            sb.append("_");
            sb.append(str2);
        }
        sb.append("_");
        sb.append(System.currentTimeMillis());
        return sb.toString();
    }

    public static float c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1646a52a", new Object[]{str})).floatValue();
        }
        if (str == null) {
            return 0.0f;
        }
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            return 0.0f;
        }
    }
}
