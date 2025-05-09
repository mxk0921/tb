package tb;

import android.app.Activity;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class trs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f28913a;

    static {
        boolean z;
        t2o.a(729809531);
        if (b9b.e() || b9b.h()) {
            z = true;
        } else {
            z = false;
        }
        f28913a = z;
    }

    public static int a(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e5beac9d", new Object[]{context, new Float(f)})).intValue();
        }
        if (!f28913a) {
            return pb6.c(context, f);
        }
        if (context instanceof Activity) {
            return pb6.b((Activity) context, f);
        }
        return pb6.c(context, f);
    }

    public static int b(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3356150e", new Object[]{context, new Integer(i)})).intValue();
        }
        if (!f28913a) {
            return pb6.z(context, i);
        }
        if (context instanceof Activity) {
            return pb6.y((Activity) context, i);
        }
        return pb6.z(context, i);
    }
}
