package tb;

import android.app.Activity;
import android.view.ViewGroup;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.a;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class p5n {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final p5n INSTANCE = new p5n();

    static {
        t2o.a(815793588);
    }

    @JvmStatic
    public static final q5n a(o5n o5nVar, Activity activity, ude udeVar, b64 b64Var, ViewGroup viewGroup, vfw vfwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q5n) ipChange.ipc$dispatch("d0897a62", new Object[]{o5nVar, activity, udeVar, b64Var, viewGroup, vfwVar});
        }
        ckf.g(activity, "activity");
        ckf.g(udeVar, a.MSG_SOURCE_PARENT);
        ckf.g(b64Var, "model");
        ckf.g(viewGroup, "container");
        if (ckf.b(o5nVar != null ? o5nVar.q : null, "feedbackAI")) {
            return null;
        }
        return new q5n(activity, udeVar, b64Var, viewGroup, vfwVar);
    }
}
