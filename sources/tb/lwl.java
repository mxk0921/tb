package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class lwl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f23614a;

    static {
        t2o.a(468714603);
    }

    public static boolean a() {
        boolean z;
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9121ff85", new Object[0])).booleanValue();
        }
        if (f23614a == null) {
            if (!akt.p2("enableFrameMetric", true) || !b()) {
                z = false;
            } else {
                z = true;
            }
            f23614a = Boolean.valueOf(z);
            if (z) {
                if (Math.random() * 100000.0d <= e()) {
                    z2 = true;
                }
                f23614a = Boolean.valueOf(z2);
            }
        }
        return f23614a.booleanValue();
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f809a66c", new Object[0])).booleanValue();
        }
        return true;
    }

    public static boolean c(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0ed9784", new Object[]{fluidContext})).booleanValue();
        }
        if (fluidContext == null || eps.a(fluidContext)) {
            return false;
        }
        return true;
    }

    public static boolean d(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("75321e12", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        return nwv.o(akt.G2(str, Boolean.toString(z)), z);
    }

    public static int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("35ef4568", new Object[0])).intValue();
        }
        int w2 = akt.w2("ShortVideoPerfConfig.frame_metric_sample", 1);
        String str = nca.h;
        if (TextUtils.isEmpty(str) || str.split("\\.").length < 4) {
            return w2;
        }
        return w2 * akt.w2("ShortVideoPerfConfig.beta_version_scale", 1000);
    }
}
