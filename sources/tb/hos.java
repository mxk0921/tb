package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.TaoPackageInfo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class hos {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64ace16d", new Object[0])).booleanValue();
        }
        return b(TaoPackageInfo.getTTIDPackage() + "@");
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af3de2f7", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.startsWith("212200@") || str.startsWith("36400112278902@")) {
            return true;
        }
        return false;
    }
}
