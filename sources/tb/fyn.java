package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.BundleInfoManager;
import com.taobao.appbundle.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class fyn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static ucq f19633a;

    static {
        t2o.a(354418775);
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8abcb6a9", new Object[]{str})).booleanValue();
        }
        if (BundleInfoManager.instance().getDynamicFeatureInfo(str) == null) {
            return true;
        }
        if (f19633a == null) {
            f19633a = a.Companion.a().h();
        }
        ucq ucqVar = f19633a;
        if (ucqVar != null) {
            return ucqVar.f().contains(str);
        }
        return false;
    }
}
