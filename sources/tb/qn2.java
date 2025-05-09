package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.BundleInfoManager;
import com.taobao.appbundle.a;
import com.taobao.tao.Globals;
import com.taobao.tao.TaoPackageInfo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class qn2 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FEATURE = "TB3DSpace";

    static {
        t2o.a(394264579);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9c69819", new Object[0])).booleanValue();
        }
        try {
            bcq.a().g(Globals.getApplication(), false, "TB3DSpace");
        } catch (Throwable unused) {
        }
        String str = TaoPackageInfo.sTTID;
        new StringBuilder("process: channel id ").append(str);
        if ("212200".equals(str)) {
            Log.e("BundleInstallUtil", "this is google play channel.");
            return true;
        }
        ucq h = a.Companion.a().h();
        return (h == null || BundleInfoManager.instance().getDynamicFeatureInfo("TB3DSpace") == null || !h.f().contains("TB3DSpace")) ? false : true;
    }
}
