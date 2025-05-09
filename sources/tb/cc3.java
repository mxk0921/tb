package tb;

import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.JvmStatic;
import tb.ub3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class cc3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final cc3 INSTANCE = new cc3();

    static {
        t2o.a(478150889);
    }

    @JvmStatic
    public static final boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d82cac", new Object[]{str})).booleanValue();
        }
        ckf.g(str, "codeForTracker");
        ub3.e(ub3.a.a(str).branchEntry(true).sampling(0.05f));
        if (Build.VERSION.SDK_INT >= vav.e(c9x.CART_BIZ_NAME, "minSdkVersion", 28)) {
            return true;
        }
        ub3.e(ub3.a.a(str).branch(1).tag("低版本系统").sampling(0.05f));
        return false;
    }
}
