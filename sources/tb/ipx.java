package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class ipx {
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(478151043);
        }

        public a() {
        }

        public final void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c2b632fe", new Object[]{this});
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(c9x.Companion.b());
            yox.o(arrayList, c9x.CART_BIZ_NAME);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(478151042);
    }
}
