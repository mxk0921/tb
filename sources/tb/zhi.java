package tb;

import android.app.Activity;
import android.content.Context;
import com.alibaba.ability.hub.AbilityHubAdapter;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class zhi {
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(144703497);
        }

        public a() {
        }

        public final xq a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (xq) ipChange.ipc$dispatch("2def42b5", new Object[]{this});
            }
            return b(null);
        }

        public final xq b(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (xq) ipChange.ipc$dispatch("7b762f63", new Object[]{this, activity});
            }
            if (!(activity instanceof Context)) {
                activity = null;
            }
            return c(activity);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final xq c(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (xq) ipChange.ipc$dispatch("10251a53", new Object[]{this, context});
            }
            zq zqVar = new zq("mega_native", null, 2, null);
            zqVar.c(new AbilityHubAdapter(zqVar));
            zqVar.a(context);
            xhv xhvVar = xhv.INSTANCE;
            return new xq(zqVar);
        }
    }

    static {
        t2o.a(144703496);
    }
}
