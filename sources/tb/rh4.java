package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliConfigInterface;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class rh4 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_CONFIG_NAME_SPACE = "newUltron_container";
    public static final String KEY_MTOP_CALLBACK_IN_WORKERTHREAD = "mtopCallbackInWorkerThread";
    public static final String KEY_NEW_FEATURE = "newFeature";
    public static final String KEY_STAGE_PERFORMANCE_CONFIG = "stagePerformanceConfig";
    public static final String KEY_TRACE_MTOP = "traceMtop";
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public static final AliConfigInterface f27379a = yo0.b();

    static {
        t2o.a(794820632);
    }

    public static float a(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("86205bd9", new Object[]{str, new Float(f)})).floatValue();
        }
        return u9v.d("newUltron_container", str, f);
    }

    public static boolean b(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1fd8cc7a", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        return u9v.f("newUltron_container", str, z);
    }
}
