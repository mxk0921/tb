package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class qu3 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ALINN = "alinn";
    public static final String CLIENT = "client";
    public static final a Companion = new a(null);
    public static final String KEY = "cmt";
    public static final String MNN = "mnn";

    /* renamed from: a  reason: collision with root package name */
    public final String f26934a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        static {
            t2o.a(481296991);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(481296990);
    }

    public qu3() {
        this(null, 1, null);
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("63d33b5c", new Object[]{this});
        }
        return this.f26934a;
    }

    public final qu3 b(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qu3) ipChange.ipc$dispatch("cd902079", new Object[]{this, new Boolean(z), new Boolean(z2)});
        }
        String str = this.f26934a;
        if (z2) {
            str = ckf.p(str, "_silent");
        }
        if (z) {
            str = ckf.p(this.f26934a, "_scan");
        }
        return new qu3(str);
    }

    public qu3(String str) {
        ckf.g(str, KEY);
        this.f26934a = str;
    }

    public /* synthetic */ qu3(String str, int i, a07 a07Var) {
        this((i & 1) != 0 ? "unknown" : str);
    }
}
