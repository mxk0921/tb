package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class fr9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f19479a;
    public nzd b;
    public jzd c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final fr9 f19480a = new fr9();

        static {
            t2o.a(806355058);
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("47cfe4d4", new Object[]{this, str});
            }
            fr9.a(this.f19480a, str);
            return this;
        }

        public fr9 b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (fr9) ipChange.ipc$dispatch("bf47d9f1", new Object[]{this});
            }
            return this.f19480a;
        }

        public a c(jzd jzdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("cf9d6f68", new Object[]{this, jzdVar});
            }
            fr9.c(this.f19480a, jzdVar);
            return this;
        }

        public a d(nzd nzdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2878c04d", new Object[]{this, nzdVar});
            }
            fr9.b(this.f19480a, nzdVar);
            return this;
        }
    }

    static {
        t2o.a(806355057);
    }

    public static /* synthetic */ String a(fr9 fr9Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ee9d0983", new Object[]{fr9Var, str});
        }
        fr9Var.f19479a = str;
        return str;
    }

    public static /* synthetic */ nzd b(fr9 fr9Var, nzd nzdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nzd) ipChange.ipc$dispatch("6272fb64", new Object[]{fr9Var, nzdVar});
        }
        fr9Var.b = nzdVar;
        return nzdVar;
    }

    public static /* synthetic */ jzd c(fr9 fr9Var, jzd jzdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jzd) ipChange.ipc$dispatch("d4c5f945", new Object[]{fr9Var, jzdVar});
        }
        fr9Var.c = jzdVar;
        return jzdVar;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("42bddf1", new Object[]{this});
        }
        return this.f19479a;
    }

    public jzd e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jzd) ipChange.ipc$dispatch("8218c58d", new Object[]{this});
        }
        return this.c;
    }

    public nzd f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nzd) ipChange.ipc$dispatch("c4c56a76", new Object[]{this});
        }
        return this.b;
    }
}
