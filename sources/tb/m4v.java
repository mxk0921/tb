package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class m4v {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(629145664);
        }

        public a() {
        }

        @JvmStatic
        public final void a(Context context, String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f9e2963a", new Object[]{this, context, str, map});
                return;
            }
            UTAnalytics instance = UTAnalytics.getInstance();
            ckf.f(instance, "UTAnalytics.getInstance()");
            instance.getDefaultTracker().pageAppear(context);
            UTAnalytics instance2 = UTAnalytics.getInstance();
            ckf.f(instance2, "UTAnalytics.getInstance()");
            instance2.getDefaultTracker().updatePageName(context, str);
            HashMap hashMap = new HashMap();
            if (map != null) {
                hashMap.putAll(map);
            }
            UTAnalytics instance3 = UTAnalytics.getInstance();
            ckf.f(instance3, "UTAnalytics.getInstance()");
            instance3.getDefaultTracker().updatePageProperties(context, hashMap);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(629145663);
    }

    @JvmStatic
    public static final void a(Context context, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9e2963a", new Object[]{context, str, map});
        } else {
            Companion.a(context, str, map);
        }
    }
}
