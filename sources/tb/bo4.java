package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class bo4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912262758);
    }

    public static boolean a(String str, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b7c8f3d", new Object[]{str, list})).booleanValue();
        }
        if (list != null && !list.isEmpty()) {
            for (String str2 : list) {
                if (TextUtils.equals(str, str2)) {
                    return true;
                }
            }
            return false;
        } else if (str == null) {
            return true;
        } else {
            return false;
        }
    }
}
