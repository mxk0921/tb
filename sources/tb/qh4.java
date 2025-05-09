package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliConfigInterface;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class qh4 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_CONFIG_NAME_SPACE = "newUltron_container";
    public static final String KEY_MTOP_CALLBACK_IN_WORKERTHREAD = "mtopCallbackInWorkerThread";
    public static final String KEY_NEW_FEATURE = "newFeature";
    public static final String KEY_STAGE_PERFORMANCE_CONFIG = "stagePerformanceConfig";
    public static final String KEY_TRACE_MTOP = "traceMtop";
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public static final AliConfigInterface f26750a = yo0.b();

    static {
        t2o.a(83886312);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("872fdf24", new Object[0])).booleanValue();
        }
        return v9v.i("newUltron_container", "newFeature", true);
    }

    public static float b(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("86205bd9", new Object[]{str, new Float(f)})).floatValue();
        }
        return v9v.d("newUltron_container", str, f);
    }

    public static int c(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("235381ac", new Object[]{str, new Integer(i)})).intValue();
        }
        return v9v.e("newUltron_container", str, i);
    }

    public static long d(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b7efaf15", new Object[]{str, new Long(j)})).longValue();
        }
        return v9v.f("newUltron_container", str, j);
    }

    public static String e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e264abe", new Object[]{str, str2});
        }
        return v9v.g("newUltron_container", str, str2);
    }

    public static boolean f(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1fd8cc7a", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        return v9v.i("newUltron_container", str, z);
    }
}
