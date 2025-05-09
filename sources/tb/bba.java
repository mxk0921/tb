package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.themis.kernel.adapter.IABTestAdapter;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class bba {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile Boolean f16295a = null;

    static {
        t2o.a(839909953);
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b652a82", new Object[]{context})).booleanValue();
        }
        if (f16295a != null) {
            return f16295a.booleanValue();
        }
        synchronized (bba.class) {
            if (f16295a != null) {
                return f16295a.booleanValue();
            }
            if (context == null) {
                f16295a = Boolean.FALSE;
            } else {
                IABTestAdapter iABTestAdapter = (IABTestAdapter) p8s.b(IABTestAdapter.class);
                if (iABTestAdapter == null) {
                    lcn.f(RVLLevel.Error, "WindVane/Launch", "IABTestAdapter is null");
                    f16295a = Boolean.FALSE;
                } else {
                    f16295a = Boolean.valueOf(!iABTestAdapter.isFeatureOpened(context, "TMS_globalContainerOptimization"));
                }
            }
            return f16295a.booleanValue();
        }
    }
}
