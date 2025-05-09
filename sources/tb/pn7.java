package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class pn7 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DIMEN_SUFFIX_AP = "ap";
    public static final String DIMEN_SUFFIX_NP = "np";

    static {
        t2o.a(155189383);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7166a16c", new Object[]{str});
        }
        return (!TextUtils.isEmpty(str) && !str.contains("ap") && !str.contains("np")) ? str.concat("np") : str;
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e369bcf1", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (str.contains("ap")) {
                Float.parseFloat(str.replace("ap", ""));
            } else if (str.contains("np")) {
                Float.parseFloat(str.replace("np", ""));
            } else {
                Float.parseFloat(str);
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
