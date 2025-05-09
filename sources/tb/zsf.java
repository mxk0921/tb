package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class zsf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(760217726);
    }

    public static boolean a(String str) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("251a62a0", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            List<String> a2 = new bxr().a();
            if (a2 != null && !a2.isEmpty()) {
                Iterator<String> it = a2.iterator();
                z = false;
                while (it.hasNext() && !(z = b(it.next(), str))) {
                }
                agh.a("JaeUrlChecker", str + " isJaeUrl " + z);
                return z;
            }
            z = b("^http[s]?://([^/\\?#]+\\.)*(?:jae\\.(?:m|wapa|waptest)\\.taobao\\.com|jaeapp\\.com|amap\\.com|autonavi\\.com|mapabc\\.com|jaecdn\\.com)([\\?|#|/].*)?$", str);
            agh.a("JaeUrlChecker", "get rules from remote error or no rules in remote");
            agh.a("JaeUrlChecker", str + " isJaeUrl " + z);
            return z;
        } catch (Exception e) {
            agh.d("JaeUrlChecker", "isJaeUrl error", e);
            return false;
        }
    }

    public static boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d1f31da", new Object[]{str, str2})).booleanValue();
        }
        try {
            return Pattern.compile(str).matcher(str2).matches();
        } catch (Exception e) {
            agh.d("JaeUrlChecker", str + " error", e);
            return false;
        }
    }
}
