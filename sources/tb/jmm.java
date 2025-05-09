package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class jmm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912262413);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c41bff27", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int indexOf = str.indexOf(":");
        if (indexOf < 0) {
            indexOf = str.length();
        }
        return str.substring(0, indexOf);
    }
}
