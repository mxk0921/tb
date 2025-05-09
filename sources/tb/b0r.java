package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class b0r {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FALSE = "false";
    public static final String TRUE = "true";

    public static boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b8ce5654", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        return TextUtils.isEmpty(str) ? z : "true".equalsIgnoreCase(str);
    }
}
