package tb;

import android.content.Context;
import android.content.res.Resources;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class ngr {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ngr INSTANCE = new ngr();

    static {
        t2o.a(804257850);
    }

    public final int a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("15d1a141", new Object[]{this, context})).intValue();
        }
        ckf.g(context, "context");
        Resources resources = context.getResources();
        ckf.f(resources, "context.resources");
        return resources.getDisplayMetrics().heightPixels;
    }

    public final int b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b6582e9a", new Object[]{this, context})).intValue();
        }
        ckf.g(context, "context");
        Resources resources = context.getResources();
        ckf.f(resources, "context.resources");
        return resources.getDisplayMetrics().widthPixels;
    }
}
