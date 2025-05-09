package tb;

import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ptq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(479199592);
    }

    public static HashMap<String, Object> a(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("605fff66", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (ntq.i().j() != null) {
            str2 = ntq.i().j().get(str);
        } else {
            str2 = "";
        }
        if (!TextUtils.isEmpty(str2)) {
            str = str2;
        }
        HashMap<String, HashMap<String, Object>> f = ntq.i().f("ali_cart");
        if (f != null) {
            return f.get(str);
        }
        return null;
    }

    public static String b(String str, String str2) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("23238abf", new Object[]{str, str2});
        }
        HashMap<String, Object> a2 = a(str);
        if (a2 == null || (obj = a2.get(str2)) == null) {
            return null;
        }
        return String.valueOf(obj);
    }

    public static void c(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d384412", new Object[]{view, str});
        } else {
            i0o.e().k(view, str, "ali_cart", "m_taobao_cart");
        }
    }
}
