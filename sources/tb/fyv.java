package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class fyv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(664797287);
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b4fa25f", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || (!wj4.f30727a.equals(str) && !wj4.b.equals(str) && !OrangeConfig.getInstance().getConfig("android_share", "DetailPageActivitys", "").contains(str))) {
            return false;
        }
        return true;
    }
}
