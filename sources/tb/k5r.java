package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class k5r extends u1<lhc> implements lhc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String TBLIVE_AB_GROUP = "taolive";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        static {
            t2o.a(1002438753);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(1002438752);
        t2o.a(1002438788);
    }

    public k5r(asb asbVar) {
        super(asbVar);
    }

    public static /* synthetic */ Object ipc$super(k5r k5rVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/kernel/serviceimp/TBABTestService");
    }

    @Override // tb.zrb
    public ewe B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ewe) ipChange.ipc$dispatch("cc717fdf", new Object[]{this});
        }
        return ewe.Companion.a();
    }

    @Override // tb.lhc
    public String J(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4d85580", new Object[]{this, str, str2, str3});
        }
        ckf.g(str, "component");
        ckf.g(str2, "module");
        ckf.g(str3, "key");
        return d0.INSTANCE.a(str, str2, str3);
    }

    @Override // tb.lhc
    public e0g n(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e0g) ipChange.ipc$dispatch("7803be8", new Object[]{this, str, str2, str3});
        }
        ckf.g(str, "component");
        ckf.g(str2, "module");
        ckf.g(str3, "key");
        i0 b = d0.INSTANCE.b(str, str2, str3);
        e0g e0gVar = new e0g();
        String str4 = null;
        e0gVar.f(b != null ? b.b() : null);
        e0gVar.h(b != null ? b.d() : null);
        e0gVar.e(b != null ? b.a() : null);
        if (b != null) {
            str4 = b.c();
        }
        e0gVar.g(str4);
        return e0gVar;
    }
}
