package tb;

import android.os.SystemClock;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.WeexPopContainer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class muq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static long f24319a;

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a94f6649", new Object[]{str});
            return;
        }
        fve.e("SubScribeBundleLoadMonitor", "installFailed: " + str);
        g(false, "loading", 0L, -1, str);
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21d92377", new Object[0]);
        } else if (f24319a != 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - f24319a;
            fve.e("SubScribeBundleLoadMonitor", "loadingDuration : " + uptimeMillis);
            g(true, "loading", uptimeMillis, 0, "");
            f24319a = 0L;
        }
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25f781e2", new Object[0]);
            return;
        }
        fve.e("SubScribeBundleLoadMonitor", "loadingLeave");
        g(true, "loading_Leave", 0L, 0, "");
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb7030da", new Object[0]);
            return;
        }
        fve.e("SubScribeBundleLoadMonitor", "retryInstall");
        g(true, "retry_install", 0L, 0, "");
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("975ab1a2", new Object[0]);
            return;
        }
        fve.e("SubScribeBundleLoadMonitor", "selected TAB");
        g(true, mf6.TYPE_SELECTED, 0L, 0, "loading");
    }

    public static void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8f114b", new Object[0]);
            return;
        }
        fve.e("SubScribeBundleLoadMonitor", "showLoadingView");
        if (f24319a == 0) {
            f24319a = SystemClock.uptimeMillis();
        }
        g(true, WeexPopContainer.PARAMS_SHOW_LOADING, 0L, 0, "");
    }

    public static void g(boolean z, String str, long j, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84a01975", new Object[]{new Boolean(z), str, new Long(j), new Integer(i), str2});
        } else {
            AppMonitor.Stat.commit("Page_Home", "subscribe_remote_bundle", DimensionValueSet.create().setValue("stat", str).setValue("success", String.valueOf(z)).setValue("errorCode", String.valueOf(i)).setValue("errorMsg", str2), MeasureValueSet.create().setValue("cost", j));
        }
    }

    static {
        t2o.a(729810110);
        AppMonitor.register("Page_Home", "subscribe_remote_bundle", MeasureSet.create().addMeasure("cost"), DimensionSet.create().addDimension("stat").addDimension("success").addDimension("errorCode").addDimension("errorMsg"));
    }
}
