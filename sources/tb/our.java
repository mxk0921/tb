package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class our {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(629145637);
        }

        public a() {
        }

        @JvmStatic
        public final lvd a(Context context, pur purVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (lvd) ipChange.ipc$dispatch("81b9c7dc", new Object[]{this, context, purVar});
            }
            ckf.g(context, "context");
            ckf.g(purVar, "model");
            nur nurVar = new nur(context, purVar);
            nurVar.init();
            return nurVar;
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(629145636);
    }

    @JvmStatic
    public static final lvd a(Context context, pur purVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lvd) ipChange.ipc$dispatch("81b9c7dc", new Object[]{context, purVar});
        }
        return Companion.a(context, purVar);
    }
}
