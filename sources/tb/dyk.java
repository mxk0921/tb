package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class dyk {
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1004535823);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final <DT extends kzk> e2g<DT> a(DT dt2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e2g) ipChange.ipc$dispatch("bc7c6db6", new Object[]{this, dt2});
            }
            return e2g.Companion.b(dt2);
        }

        public a() {
        }
    }

    static {
        t2o.a(1004535822);
    }
}
