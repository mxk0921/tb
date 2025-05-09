package tb;

import android.text.TextUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.AttributionReporter;
import com.taobao.weex.common.Constants;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders$UTCustomHitBuilder;
import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class u71 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(String str, String str2, String str3, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfbb34c6", new Object[]{str, str2, str3, new Integer(i)});
            return;
        }
        DimensionValueSet create = DimensionValueSet.create();
        create.setValue("BizName", str);
        create.setValue("PermissionName", str3);
        create.setValue("PermissionStatus", String.valueOf(i));
        create.setValue(jk.KEY_MAPPING_CODE, str2);
        AppMonitor.Stat.commit("RuntimePermission", "BizPermissionCheck", create, MeasureValueSet.create());
    }

    public static void b(String str, String str2, qzl qzlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b50c4980", new Object[]{str, str2, qzlVar});
        } else if (TextUtils.isEmpty(str) || qzlVar == null || qzlVar.f27021a == null || qzlVar.b == null) {
            ndh.a("AppMonitorUtil", "commitPermissionCheckResult: param is empty, exit.");
        } else {
            if (str2 == null) {
                str2 = "";
            }
            for (int i = 0; i < qzlVar.f27021a.length; i++) {
                try {
                    if (i > qzlVar.b.length) {
                        ndh.a("AppMonitorUtil", "commitPermissionCheckResult: index is out of boundary, exit.");
                    }
                    a(str, str2, qzlVar.f27021a[i], qzlVar.b[i]);
                } catch (Throwable th) {
                    ndh.a("AppMonitorUtil", "commitPermissionCheckResult: commit monitor with exception " + th);
                    return;
                }
            }
        }
    }

    public static void c(String str, String str2, String str3, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b039315c", new Object[]{str, str2, str3, new Integer(i)});
            return;
        }
        DimensionValueSet create = DimensionValueSet.create();
        create.setValue("BizName", str);
        create.setValue("PermissionName", str3);
        create.setValue("PermissionStatus", String.valueOf(i));
        create.setValue(jk.KEY_MAPPING_CODE, str2);
        AppMonitor.Stat.commit("RuntimePermission", "BizPermissionReq", create, MeasureValueSet.create());
    }

    public static void d(String str, String str2, qzl qzlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c2b1f2a", new Object[]{str, str2, qzlVar});
        } else if (TextUtils.isEmpty(str) || qzlVar == null || qzlVar.f27021a == null || qzlVar.b == null) {
            ndh.a("AppMonitorUtil", "commitPermissionCheckResult: param is empty, exit.");
        } else {
            if (str2 == null) {
                str2 = "";
            }
            for (int i = 0; i < qzlVar.f27021a.length; i++) {
                try {
                    if (i > qzlVar.b.length) {
                        ndh.a("AppMonitorUtil", "commitPermissionCheckResult: index is out of boundary, exit.");
                    }
                    c(str, str2, qzlVar.f27021a[i], qzlVar.b[i]);
                } catch (Throwable th) {
                    ndh.a("AppMonitorUtil", "commitPermissionReqResult: commit monitor with exception " + th);
                    return;
                }
            }
        }
    }

    public static void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a1dc89", new Object[]{str, str2});
            return;
        }
        DimensionValueSet create = DimensionValueSet.create();
        create.setValue("BizName", str);
        create.setValue("PermissionName", str2);
        AppMonitor.Stat.commit("RuntimePermission", "BizPermissionUniform", create, MeasureValueSet.create());
    }

    public static void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa057db1", new Object[0]);
            return;
        }
        DimensionSet create = DimensionSet.create();
        create.addDimension("BizName");
        create.addDimension("PermissionName");
        create.addDimension("PermissionStatus");
        create.addDimension(jk.KEY_MAPPING_CODE);
        AppMonitor.register("RuntimePermission", "BizPermissionReq", MeasureSet.create(), create);
        DimensionSet create2 = DimensionSet.create();
        create2.addDimension("BizName");
        create2.addDimension("PermissionName");
        create2.addDimension("PermissionStatus");
        create2.addDimension(jk.KEY_MAPPING_CODE);
        AppMonitor.register("RuntimePermission", "BizPermissionCheck", MeasureSet.create(), create2);
        DimensionSet create3 = DimensionSet.create();
        create3.addDimension("BizName");
        create3.addDimension("PermissionName");
        AppMonitor.register("RuntimePermission", "BizPermissionUniform", MeasureSet.create(), create3);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public long f29203a;
        public String b;
        public String c;

        public final void a(String str, String str2, String str3, String str4, long j, long j2, String str5) {
            String str6;
            String str7;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("390e82ea", new Object[]{this, str, str2, str3, str4, new Long(j), new Long(j2), str5});
                return;
            }
            UTHitBuilders$UTCustomHitBuilder uTHitBuilders$UTCustomHitBuilder = new UTHitBuilders$UTCustomHitBuilder("user_authorization");
            uTHitBuilders$UTCustomHitBuilder.setEventPage("privacy_compliance");
            uTHitBuilders$UTCustomHitBuilder.setProperty("action", str4);
            uTHitBuilders$UTCustomHitBuilder.setProperty("bizCode", str);
            uTHitBuilders$UTCustomHitBuilder.setProperty(jk.KEY_MAPPING_CODE, str2);
            uTHitBuilders$UTCustomHitBuilder.setProperty(AttributionReporter.SYSTEM_PERMISSION, str3);
            uTHitBuilders$UTCustomHitBuilder.setProperty(Constants.Name.INTERVAL, Long.toString(j));
            if (!TextUtils.isEmpty(this.b)) {
                str6 = this.b;
            } else {
                str6 = "";
            }
            uTHitBuilders$UTCustomHitBuilder.setProperty("pageName", str6);
            if (!TextUtils.isEmpty(this.c)) {
                str7 = this.c;
            } else {
                str7 = "";
            }
            uTHitBuilders$UTCustomHitBuilder.setProperty("pageUrl", str7);
            uTHitBuilders$UTCustomHitBuilder.setProperty("silenceTime", String.valueOf(j2));
            if (TextUtils.isEmpty(str5)) {
                str5 = "";
            }
            uTHitBuilders$UTCustomHitBuilder.setProperty("description", str5);
            UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTCustomHitBuilder.build());
        }

        public void b(String str, String str2, String[] strArr, boolean z, long j, String str3) {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("580b8f23", new Object[]{this, str, str2, strArr, new Boolean(z), new Long(j), str3});
                return;
            }
            int[] iArr = new int[strArr.length];
            if (!z) {
                i = -1;
            }
            Arrays.fill(iArr, i);
            c(str, str2, strArr, iArr, j, str3);
        }

        public void d(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3b4e7c7d", new Object[]{this, str, str2});
                return;
            }
            this.f29203a = System.currentTimeMillis();
            this.b = str;
            this.c = str2;
        }

        public void c(String str, String str2, String[] strArr, int[] iArr, long j, String str3) {
            String str4;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("19791bf7", new Object[]{this, str, str2, strArr, iArr, new Long(j), str3});
                return;
            }
            long currentTimeMillis = System.currentTimeMillis() - this.f29203a;
            String str5 = TextUtils.isEmpty(str) ? "default" : str;
            String str6 = str2 == null ? "" : str2;
            for (int i = 0; i < strArr.length; i++) {
                if (i >= iArr.length) {
                    str4 = "unknown";
                } else if (iArr[i] == 0) {
                    str4 = "agree";
                } else {
                    str4 = "reject";
                }
                a(str5, str6, strArr[i], str4, currentTimeMillis, j, str3);
            }
        }
    }
}
