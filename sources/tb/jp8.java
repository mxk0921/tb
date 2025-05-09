package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class jp8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public static final jp8 g = new jp8("", "", "", "", "", "");

    /* renamed from: a  reason: collision with root package name */
    public final String f22142a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(815792291);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final jp8 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jp8) ipChange.ipc$dispatch("83371874", new Object[]{this});
            }
            return jp8.a();
        }

        public a() {
        }
    }

    static {
        t2o.a(815792290);
    }

    public jp8(String str, String str2, String str3, String str4, String str5, String str6) {
        ckf.g(str, "exposeIds");
        ckf.g(str2, "exposeTypes");
        ckf.g(str3, "unExposeIds");
        ckf.g(str4, "unExposeTypes");
        ckf.g(str5, "lastPageExposeIds");
        ckf.g(str6, "lastPageExposeTypes");
        this.f22142a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public static final /* synthetic */ jp8 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jp8) ipChange.ipc$dispatch("183a3451", new Object[0]);
        }
        return g;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("90c5c81b", new Object[]{this});
        }
        return this.f22142a;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8708a7a", new Object[]{this});
        }
        return this.b;
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bfcda5c0", new Object[]{this});
        }
        return this.e;
    }

    public final String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("54f792df", new Object[]{this});
        }
        return this.f;
    }

    public final String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72ff2b94", new Object[]{this});
        }
        return this.c;
    }

    public final String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1def3b3", new Object[]{this});
        }
        return this.d;
    }
}
