package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class c4s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806356521);
    }

    public static String a(List<String> list, char c) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("651064e5", new Object[]{list, new Character(c)});
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if (!TextUtils.isEmpty(str)) {
                if (i > 0) {
                    sb.append(c);
                }
                sb.append(str);
            }
        }
        return sb.toString();
    }
}
