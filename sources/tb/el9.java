package tb;

import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.BundleInfoManager;
import com.huawei.hms.android.SystemUtils;
import com.taobao.appbundle.a;
import com.taobao.metrickit.context.MetricContext;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class el9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f18658a;

    public static void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af4dccb0", new Object[]{application});
        } else if (c() && !f18658a) {
            ucq h = a.Companion.a().h();
            xcq n = xcq.c().k(v8f.h(application, "com.taobao.metrickit.honor.FlexaLauncher").a()).n();
            if (h != null) {
                h.c(n);
            }
        }
    }

    public static void b(Application application, MetricContext metricContext, long j, int i) {
        if (c()) {
            try {
                String queryFeatureFromInitalClass = BundleInfoManager.instance().queryFeatureFromInitalClass("com.taobao.metrickit.honor.FlexaLauncher");
                bcq.a().g(application, false, queryFeatureFromInitalClass);
                boolean contains = vcq.a(application).f().contains(queryFeatureFromInitalClass);
                f18658a = contains;
                if (contains) {
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("context", metricContext);
                    bundle.putLong("lastLaunchSession", j);
                    bundle.putInt("lastPid", i);
                    ((p5c) Class.forName("com.taobao.metrickit.honor.FlexaLauncher").newInstance()).init(application, bundle);
                }
            } catch (Throwable th) {
                TLog.loge("MetricKit.FlexaMetricLauncher", Log.getStackTraceString(th));
            }
        }
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb7b247c", new Object[0])).booleanValue();
        }
        return SystemUtils.PRODUCT_HONOR.equalsIgnoreCase(Build.BRAND) && l1r.h(l1r.SWITCH_HONOR_PLUGIN);
    }
}
