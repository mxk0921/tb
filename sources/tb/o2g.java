package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class o2g {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public static final o2g f25094a = new o2g(pg1.ATOM_EXT_Undefined);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1002438678);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final o2g a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (o2g) ipChange.ipc$dispatch("4313314a", new Object[]{this});
            }
            return o2g.a();
        }

        public a() {
        }
    }

    static {
        t2o.a(1002438677);
        t2o.a(1002438674);
        new o2g("BehaviorComponent");
        new o2g("EventComponent");
        new o2g("LogComponent");
    }

    public o2g(String str) {
        ckf.g(str, "code");
    }

    public static final /* synthetic */ o2g a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o2g) ipChange.ipc$dispatch("22129d72", new Object[0]);
        }
        return f25094a;
    }
}
