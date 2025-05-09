package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders$UTControlHitBuilder;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class s9m {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FEEDBACK_CLICK = "feedback_clck";
    public static final String FEEDBACK_DOUDI = "feedback_doudi";
    public static final String FEEDBACK_SHOW = "feedback_show";
    public static final String LPM_BIZ_CODE = "HomePage";

    static {
        t2o.a(806355501);
    }

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8626387", new Object[]{str, str2, str3});
        } else if (!TextUtils.isEmpty(str2)) {
            b(str, str2, xxv.a(str3));
        }
    }

    public static void b(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d67442e8", new Object[]{str, str2, map});
        } else if (!TextUtils.isEmpty(str2)) {
            UTHitBuilders$UTControlHitBuilder uTHitBuilders$UTControlHitBuilder = new UTHitBuilders$UTControlHitBuilder(str, "Button-" + str2);
            if (map != null && !map.isEmpty()) {
                uTHitBuilders$UTControlHitBuilder.setProperties(map);
            }
            UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTControlHitBuilder.build());
            if (e2h.l()) {
                qpv qpvVar = qmh.f().f26825a;
                qpvVar.b(LPM_BIZ_CODE, str, "Button-" + str2, map);
            }
        }
    }

    public static void c(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1271b7ef", new Object[]{str, str2, map});
        } else if (!TextUtils.isEmpty(str2)) {
            map.put("deviceLevel", "" + fkr.b());
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, 19999, str2, "", "0", map).build());
        }
    }

    public static void d(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ca85f2", new Object[]{str, str2, str3});
        } else if (!TextUtils.isEmpty(str2)) {
            e(str, str2, xxv.a(str3));
        }
    }

    public static void e(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e5e305d", new Object[]{str, str2, map});
        } else if (!TextUtils.isEmpty(str2)) {
            map.put("deviceLevel", "" + fkr.b());
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, 2201, str2, "", "0", map).build());
            if (e2h.l()) {
                qmh.f().f26825a.c(LPM_BIZ_CODE, str, str2, map);
            }
        }
    }
}
