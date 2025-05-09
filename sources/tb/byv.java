package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.BundleInfoManager;
import com.taobao.appbundle.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class byv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5691f355", new Object[0])).booleanValue();
        }
        ucq h = a.Companion.a().h();
        return h == null || BundleInfoManager.instance().getDynamicFeatures().isEmpty() || (BundleInfoManager.instance().getDynamicFeatureInfo("tmgbusiness4androidremote") != null && h.f().contains("tmgbusiness4androidremote"));
    }
}
