package tb;

import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class w0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, Boolean> f30379a = new ConcurrentHashMap();

    static {
        t2o.a(468713842);
    }

    public static boolean a(String str, String str2, String str3, boolean z) {
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("981602b6", new Object[]{str, str2, str3, new Boolean(z)})).booleanValue();
        }
        try {
            String str4 = str + ":" + str2 + ":" + str3;
            Map<String, Boolean> map = f30379a;
            Boolean bool = (Boolean) ((ConcurrentHashMap) map).get(str4);
            if (bool != null) {
                return bool.booleanValue();
            }
            VariationSet activate = UTABTest.activate(str, str2);
            if (activate != null) {
                Variation variation = activate.getVariation(str3);
                z2 = variation != null ? Boolean.parseBoolean(variation.getValueAsString(String.valueOf(z))) : z;
                qau.v("tab2", activate.getExperimentId(), activate.getExperimentReleaseId(), activate.getExperimentBucketId());
            } else {
                z2 = z;
            }
            ir9.b(t0.TAG, "fetchABConfig " + str + ":" + str2 + " ; " + z2);
            ((ConcurrentHashMap) map).put(str4, Boolean.valueOf(z2));
            return z2;
        } catch (Exception e) {
            ir9.c(t0.TAG, "", e);
            return z;
        }
    }
}
