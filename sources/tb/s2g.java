package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class s2g {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public static final s2g b = new s2g("KernelIntentIdentifier_Undefined");

    /* renamed from: a  reason: collision with root package name */
    public final String f27756a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1002438708);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final s2g a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (s2g) ipChange.ipc$dispatch("3254ba94", new Object[]{this});
            }
            return s2g.a();
        }

        public a() {
        }
    }

    static {
        t2o.a(1002438707);
        t2o.a(1002438705);
    }

    public s2g(String str) {
        ckf.g(str, "code");
        this.f27756a = str;
    }

    public static final /* synthetic */ s2g a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s2g) ipChange.ipc$dispatch("9634ecf1", new Object[0]);
        }
        return b;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fa4e0476", new Object[]{this});
        }
        return this.f27756a;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2g)) {
            return false;
        }
        return ckf.b(b(), ((s2g) obj).b());
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return b().hashCode();
    }
}
