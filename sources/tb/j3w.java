package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class j3w {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(961544290);
    }

    public static boolean a(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7b37c282", new Object[]{obj, obj2})).booleanValue();
        }
        if (!(obj instanceof String) || !(obj2 instanceof String)) {
            return false;
        }
        String trim = ((String) obj).trim();
        String trim2 = ((String) obj2).trim();
        ogh.e("VersionUtils", "version equal compare: " + trim + "  " + trim2);
        return TextUtils.equals(trim, trim2);
    }

    public static boolean b(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e69e377e", new Object[]{obj, obj2})).booleanValue();
        }
        try {
            if ((obj instanceof String) && (obj2 instanceof String)) {
                String trim = ((String) obj).trim();
                String trim2 = ((String) obj2).trim();
                ogh.e("VersionUtils", "version value greaterThan compare: " + trim + "  " + trim2);
                String[] split = trim.split("\\.");
                String[] split2 = trim2.split("\\.");
                for (int i = 0; i < split.length; i++) {
                    if (i >= split2.length) {
                        return true;
                    }
                    if (!split[i].equals(split2[i])) {
                        return wyv.n(split[i], 0) > wyv.n(split2[i], 0);
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            ku0.j("VersionUtils.greaterThan", th);
            return false;
        }
    }
}
