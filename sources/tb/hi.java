package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class hi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<ci, Long> f20651a = new ConcurrentHashMap();

    static {
        t2o.a(79691879);
    }

    public static void a(ci ciVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f540101", new Object[]{ciVar});
        } else if (!ci.b(ciVar)) {
            ck.g().e("AURADynamicFeatureUTUtils.markDynamicFeatureBundleAlreadyInstalled:bundleInfo is invalid");
        } else {
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("aura_dynamic_feature", 19997, "already_installed", ciVar.d, "", null).build());
        }
    }

    public static void b(ci ciVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bd117bf", new Object[]{ciVar});
        } else if (!ci.b(ciVar)) {
            ck.g().e("AURADynamicFeatureUTUtils.markDynamicFeatureBundleEndInstall:bundleInfo is invalid");
        } else {
            for (Map.Entry entry : ((ConcurrentHashMap) f20651a).entrySet()) {
                if (entry != null && ci.a(ciVar, (ci) entry.getKey())) {
                    Long l = (Long) entry.getValue();
                    if (l == null || l.longValue() <= 0) {
                        ck.g().e("AURADynamicFeatureUTUtils.markDynamicFeatureBundleEndInstall:invalid timestamp");
                        return;
                    } else {
                        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("aura_dynamic_feature", 19997, "install_time_cost", ciVar.d, String.valueOf(System.currentTimeMillis() - l.longValue()), null).build());
                        return;
                    }
                }
            }
        }
    }

    public static void c(ci ciVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1056a6bf", new Object[]{ciVar, str, str2});
        } else if (!ci.b(ciVar)) {
            ck.g().e("AURADynamicFeatureUTUtils.markDynamicFeatureBundleInstallFailed:bundleInfo is invalid");
        } else {
            String str3 = ciVar.d;
            StringBuilder sb = new StringBuilder("errorCode:");
            if (str == null) {
                str = "";
            }
            sb.append(str);
            sb.append(" errorMsg:");
            if (str2 == null) {
                str2 = "";
            }
            sb.append(str2);
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("aura_dynamic_feature", 19997, "install_failed", str3, sb.toString(), null).build());
        }
    }

    public static void d(ci ciVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("466faa67", new Object[]{ciVar});
        } else if (!ci.b(ciVar)) {
            ck.g().e("AURADynamicFeatureUTUtils.markDynamicFeatureBundleInstallSuccess:bundleInfo is invalid");
        } else {
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("aura_dynamic_feature", 19997, "install_success", ciVar.d, "", null).build());
        }
    }

    public static void e(ci ciVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1d651e6", new Object[]{ciVar});
        } else if (!ci.b(ciVar)) {
            ck.g().e("AURADynamicFeatureUTUtils.markDynamicFeatureBundleNotInstalled:bundleInfo is invalid");
        } else {
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("aura_dynamic_feature", 19997, "not_installed", ciVar.d, "", null).build());
        }
    }

    public static void f(ci ciVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8e91ad8", new Object[]{ciVar});
        } else if (!ci.b(ciVar)) {
            ck.g().e("AURADynamicFeatureUTUtils.markDynamicFeatureBundleStartInstall:bundleInfo is invalid");
        } else {
            for (Map.Entry entry : ((ConcurrentHashMap) f20651a).entrySet()) {
                if (entry != null && ci.a(ciVar, (ci) entry.getKey())) {
                    entry.setValue(Long.valueOf(System.currentTimeMillis()));
                    return;
                }
            }
            ((ConcurrentHashMap) f20651a).put(ciVar, Long.valueOf(System.currentTimeMillis()));
        }
    }
}
