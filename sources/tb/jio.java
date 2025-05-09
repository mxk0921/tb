package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.shop.rule.data.TBBundleUrlRuleInfo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class jio {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(668991588);
    }

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2f06af18", new Object[]{str, str2})).booleanValue();
        }
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            String[] split = str2.trim().split("\\.");
            TBBundleUrlRuleInfo a2 = o7r.a(str);
            if (a2 == null) {
                return false;
            }
            try {
                int parseInt = Integer.parseInt(split[0]);
                int parseInt2 = Integer.parseInt(split[1]);
                if (a2.mFirstBitVersion != parseInt) {
                    return false;
                }
                if (a2.mSecBitVersion > parseInt2) {
                    return false;
                }
                return true;
            } catch (NumberFormatException unused) {
            }
        }
        return false;
    }

    public static boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9bbef52", new Object[]{str, str2})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String[] split = str.trim().split("\\.");
            String[] split2 = str2.trim().split("\\.");
            if (split.length != 2 && split2.length != 2) {
                return false;
            }
            try {
                int parseInt = Integer.parseInt(split[0]);
                int parseInt2 = Integer.parseInt(split[1]);
                int parseInt3 = Integer.parseInt(split2[0]);
                int parseInt4 = Integer.parseInt(split2[1]);
                if (parseInt == parseInt3 && parseInt2 < parseInt4) {
                    return true;
                }
                return false;
            } catch (NumberFormatException unused) {
            }
        }
        return false;
    }
}
