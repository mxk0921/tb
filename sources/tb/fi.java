package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import tb.b25;
import tb.cyl;
import tb.fi8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class fi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final dcu f19304a = dcu.a();
    public static final Map<ci, Long> b = new ConcurrentHashMap();
    public static final OrangeConfig c = OrangeConfig.getInstance();

    static {
        t2o.a(79691878);
    }

    public static float a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("68809b54", new Object[0])).floatValue();
        }
        try {
            return Float.valueOf(c.getConfig("aura_framework", "dynamic_feature_js_tracker_sampling", "0.5")).floatValue();
        } catch (Exception unused) {
            return 0.5f;
        }
    }

    public static boolean b(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f092bfc3", new Object[]{new Float(f)})).booleanValue();
        }
        if (f > new Random().nextFloat()) {
            return true;
        }
        return false;
    }

    public static void c(ci ciVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bd117bf", new Object[]{ciVar});
        } else if (!ci.b(ciVar)) {
            ck.g().e("AURADynamicFeatureJsTrackerUtils.markDynamicFeatureBundleEndInstall:bundleInfo is invalid");
        } else {
            for (Map.Entry entry : ((ConcurrentHashMap) b).entrySet()) {
                if (entry != null && ci.a(ciVar, (ci) entry.getKey())) {
                    Long l = (Long) entry.getValue();
                    if (l == null || l.longValue() <= 0) {
                        ck.g().e("AURADynamicFeatureJsTrackerUtils.markDynamicFeatureBundleEndInstall:invalid timestamp");
                        return;
                    }
                    cyl.b d = new cyl.b().b(ciVar.d).d(String.valueOf(System.currentTimeMillis() - l.longValue()));
                    f19304a.d(d.c(h1p.HTTP_PREFIX + ciVar.f17067a).a());
                    return;
                }
            }
        }
    }

    public static void d(ci ciVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8e91ad8", new Object[]{ciVar});
        } else if (!ci.b(ciVar)) {
            ck.g().e("AURADynamicFeatureJsTrackerUtils.markDynamicFeatureBundleStartInstall:bundleInfo is invalid");
        } else {
            for (Map.Entry entry : ((ConcurrentHashMap) b).entrySet()) {
                if (entry != null && ci.a(ciVar, (ci) entry.getKey())) {
                    entry.setValue(Long.valueOf(System.currentTimeMillis()));
                    return;
                }
            }
            ((ConcurrentHashMap) b).put(ciVar, Long.valueOf(System.currentTimeMillis()));
        }
    }

    public static void e(ci ciVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9bf930e", new Object[]{ciVar});
            return;
        }
        float a2 = a();
        if (b(a2)) {
            if (!ci.b(ciVar)) {
                ck.g().e("AURADynamicFeatureJsTrackerUtils.monitorDynamicFeatureBundleAlreadyInstalled:bundleInfo invalid");
                return;
            }
            b25.b h = new b25.b().b(ciVar.d).g("26684-tracker").d("install_status").f("already_installed").i(Boolean.TRUE).c(gi.d().f(ciVar)).h(a2);
            f19304a.b(h.e(h1p.HTTP_PREFIX + ciVar.f17067a).a());
        }
    }

    public static void f(ci ciVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67c24a52", new Object[]{ciVar, str, str2});
            return;
        }
        float a2 = a();
        if (b(a2)) {
            if (!ci.b(ciVar)) {
                ck.g().e("AURADynamicFeatureJsTrackerUtils.monitorDynamicFeatureBundleInstallFailed:bundleInfo invalid");
                return;
            }
            StringBuilder sb = new StringBuilder();
            if (str == null) {
                str = "";
            }
            sb.append(str);
            sb.append("_");
            if (str2 == null) {
                str2 = "";
            }
            sb.append(str2);
            String sb2 = sb.toString();
            b25.b h = new b25.b().b(ciVar.d).g("26684-tracker").d("install_success_status").f(sb2).i(Boolean.FALSE).c(gi.d().f(ciVar)).h(a2);
            b25 a3 = h.e(h1p.HTTP_PREFIX + ciVar.f17067a).a();
            dcu dcuVar = f19304a;
            dcuVar.b(a3);
            dcuVar.c(new fi8.b().b(ciVar.d).d("26684-tracker").c(sb2).e(a2).a());
        }
    }

    public static void g(ci ciVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ac25bb4", new Object[]{ciVar});
            return;
        }
        float a2 = a();
        if (b(a2)) {
            if (!ci.b(ciVar)) {
                ck.g().e("AURADynamicFeatureJsTrackerUtils.monitorDynamicFeatureBundleInstallSuccess:bundleInfo invalid");
                return;
            }
            b25.b h = new b25.b().b(ciVar.d).g("26684-tracker").d("install_success_status").f("success").i(Boolean.TRUE).c(gi.d().f(ciVar)).h(a2);
            f19304a.b(h.e(h1p.HTTP_PREFIX + ciVar.f17067a).a());
        }
    }

    public static void h(ci ciVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1cef273", new Object[]{ciVar});
            return;
        }
        float a2 = a();
        if (b(a2)) {
            if (!ci.b(ciVar)) {
                ck.g().e("AURADynamicFeatureJsTrackerUtils.monitorDynamicFeatureBundleNotInstalled:bundleInfo invalid");
                return;
            }
            b25.b h = new b25.b().b(ciVar.d).g("26684-tracker").d("install_status").f("not_install").i(Boolean.FALSE).c(gi.d().f(ciVar)).h(a2);
            f19304a.b(h.e(h1p.HTTP_PREFIX + ciVar.f17067a).a());
        }
    }
}
