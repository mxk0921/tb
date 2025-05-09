package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.BundleInfoManager;
import com.taobao.appbundle.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class w49 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(676331694);
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c8e4047", new Object[]{str, str2});
        }
        if (BundleInfoManager.instance().getDynamicFeatureInfo(str) == null) {
            Log.e("FeatureUpdateUtils", str + " is not dynamicFeature");
            return "";
        } else if (c(str2, str)) {
            return r48.h().f(str, str2);
        } else {
            return BundleInfoManager.instance().getDynamicFeatureInfo(str).version;
        }
    }

    public static String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("751b8808", new Object[]{str, str2});
        }
        try {
            if (mcq.a().a().contains(str2)) {
                return ((cad) bcq.a()).i().i(str2).d();
            }
            a.C0529a aVar = a.Companion;
            if (aVar.a().f().containsKey(str2)) {
                return aVar.a().f().get(str2);
            }
            return str;
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    public static boolean c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a49d0bce", new Object[]{str, str2})).booleanValue();
        }
        try {
            if (mcq.a().a().contains(str2)) {
                return !((cad) bcq.a()).i().i(str2).d().equals(str);
            }
            return a.Companion.a().f().containsKey(str2);
        } catch (Exception e) {
            Log.e("FeatureUpdateUtils", "isFeatureUpdated error:" + e.getMessage());
            return false;
        }
    }
}
