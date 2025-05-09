package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class i2p {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String TYPE_ACTIVATE = "activate";
    public static final String TYPE_SUGGEST = "suggest";

    /* renamed from: a  reason: collision with root package name */
    public Boolean f21060a;
    public String b;
    public String c;
    public String d;
    public String e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(815793232);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(815793231);
    }

    public i2p() {
        this(null, null, null, null, null, 31, null);
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("abc85acd", new Object[]{this});
        }
        return this.b;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43d20f9", new Object[]{this});
        }
        return this.c;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("229325c9", new Object[]{this});
        }
        return this.e;
    }

    public final Boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("e7d7fd77", new Object[]{this});
        }
        return this.f21060a;
    }

    public final String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8916abb9", new Object[]{this});
        }
        return this.d;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2p)) {
            return false;
        }
        i2p i2pVar = (i2p) obj;
        if (ckf.b(this.f21060a, i2pVar.f21060a) && ckf.b(this.b, i2pVar.b) && ckf.b(this.c, i2pVar.c) && ckf.b(this.d, i2pVar.d) && ckf.b(this.e, i2pVar.e)) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6238193d", new Object[]{this})).booleanValue();
        }
        return ckf.b(this.e, "suggest");
    }

    public final void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a1b94b1", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public final void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a6a8705", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        Boolean bool = this.f21060a;
        if (bool == null) {
            i = 0;
        } else {
            i = bool.hashCode();
        }
        int i5 = i * 31;
        String str = this.b;
        if (str == null) {
            i2 = 0;
        } else {
            i2 = str.hashCode();
        }
        int i6 = (i5 + i2) * 31;
        String str2 = this.c;
        if (str2 == null) {
            i3 = 0;
        } else {
            i3 = str2.hashCode();
        }
        int i7 = (i6 + i3) * 31;
        String str3 = this.d;
        if (str3 != null) {
            i4 = str3.hashCode();
        }
        return ((i7 + i4) * 31) + this.e.hashCode();
    }

    public final void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b20f4f35", new Object[]{this, str});
            return;
        }
        ckf.g(str, "<set-?>");
        this.e = str;
    }

    public final void j(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1d66e07", new Object[]{this, bool});
        } else {
            this.f21060a = bool;
        }
    }

    public final void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("249c25dd", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "SearchDoorReviewBean(show=" + this.f21060a + ", h5Url=" + this.b + ", iconUrl=" + this.c + ", showText=" + this.d + ", sceneType=" + this.e + ')';
    }

    public i2p(Boolean bool, String str, String str2, String str3, String str4) {
        ckf.g(str4, "sceneType");
        this.f21060a = bool;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public /* synthetic */ i2p(Boolean bool, String str, String str2, String str3, String str4, int i, a07 a07Var) {
        this((i & 1) != 0 ? Boolean.FALSE : bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) == 0 ? str3 : null, (i & 16) != 0 ? TYPE_ACTIVATE : str4);
    }
}
