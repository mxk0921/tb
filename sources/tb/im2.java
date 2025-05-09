package tb;

import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class im2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(619708645);
    }

    public static boolean b(String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dfb1822a", new Object[]{str, strArr})).booleanValue();
        }
        if (!(str == null || strArr == null)) {
            for (String str2 : strArr) {
                if (!(str2 == null || str.indexOf(str2) == -1)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Deprecated
    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8579e42", new Object[]{str})).booleanValue();
        }
        Uri parse = Uri.parse(str);
        return parse != null && parse.isHierarchical() && "302".equals(parse.getQueryParameter("utpscode"));
    }
}
