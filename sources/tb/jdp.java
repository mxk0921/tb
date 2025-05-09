package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class jdp implements asb {
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1002438702);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final jdp a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jdp) ipChange.ipc$dispatch("d522e027", new Object[]{this});
            }
            return new jdp();
        }

        public a() {
        }
    }

    static {
        t2o.a(1002438701);
        t2o.a(1002438694);
    }
}
