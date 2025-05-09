package tb;

import com.alibaba.android.umbrella.link.UMLinkLogInterface;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ii {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final UMLinkLogInterface f21318a = hdv.a();

    static {
        t2o.a(79691880);
    }

    public static void a(ci ciVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67c24a52", new Object[]{ciVar, str, str2});
        } else if (!ci.b(ciVar)) {
            ck.g().e("AURADynamicFeatureUmbrellaMonitorUtils.monitorDynamicFeatureBundleInstallFailed:bundleInfo invalid");
        } else {
            String str3 = ciVar.f17067a;
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            String f = gi.d().f(ciVar);
            if (f == null) {
                f = "";
            }
            hashMap2.put("DynamicFeatureMD5", f);
            if (str == null) {
                str = "";
            }
            hashMap2.put("errorCode", str);
            if (str2 == null) {
                str2 = "";
            }
            hashMap2.put("errorMsg", str2);
            f21318a.logError("AURAMonitor", "DynamicFeature", str3, null, "InstallFailed", "InstallFailed", hashMap, cyu.b(hashMap2));
        }
    }

    public static void b(ci ciVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1cef273", new Object[]{ciVar});
        } else if (!ci.b(ciVar)) {
            ck.g().e("AURADynamicFeatureUmbrellaMonitorUtils.monitorDynamicFeatureBundleNotInstalled:bundleInfo invalid");
        } else {
            String str = ciVar.f17067a;
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            String f = gi.d().f(ciVar);
            if (f == null) {
                f = "";
            }
            hashMap2.put("DynamicFeatureMD5", f);
            UMLinkLogInterface uMLinkLogInterface = f21318a;
            uMLinkLogInterface.logError("AURAMonitor", "DynamicFeature", str, null, "NotInstalled", "NotInstalled", hashMap, cyu.b(hashMap2));
            uMLinkLogInterface.commitFailure(str, "AURAMonitor", "1.0", "AURAMonitor", "DynamicFeature", hashMap2, "NotInstalled", "NotInstalled");
        }
    }
}
