package tb;

import android.content.Context;
import android.content.res.Resources;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class mxv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final mxv INSTANCE = new mxv();

    public final int a(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1a48ebe0", new Object[]{this, context, new Float(f)})).intValue();
        }
        ckf.g(context, "context");
        Resources resources = context.getResources();
        ckf.f(resources, "context.resources");
        return (int) ((f * resources.getDisplayMetrics().density) + 0.5f);
    }

    public final void b(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d4a4fce", new Object[]{this, str, map});
            return;
        }
        UTOriginalCustomHitBuilder uTOriginalCustomHitBuilder = new UTOriginalCustomHitBuilder("Page_MegaDesign_", 2201, str, null, null, map);
        UTAnalytics instance = UTAnalytics.getInstance();
        ckf.f(instance, "UTAnalytics.getInstance()");
        instance.getDefaultTracker().send(uTOriginalCustomHitBuilder.build());
    }
}
