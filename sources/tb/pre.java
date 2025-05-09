package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class pre extends mv1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public String f26252a = "";
    public String b;
    public String c;
    public int d;
    public String e;
    public String f;
    public String g;
    public String h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(815793072);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }

        @JvmStatic
        public final pre a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (pre) ipChange.ipc$dispatch("8d78fafb", new Object[]{this, jSONObject});
            }
            if (jSONObject == null || jSONObject.isEmpty()) {
                return null;
            }
            pre preVar = new pre();
            preVar.o(h19.i(jSONObject, "tagText", ""));
            if (TextUtils.isEmpty(preVar.f())) {
                return null;
            }
            preVar.p(h19.i(jSONObject, "tagTextColor", ""));
            preVar.l(h19.i(jSONObject, "darkTagTextColor", ""));
            preVar.h(h19.e(jSONObject, "isBold", false));
            preVar.q(h19.g(jSONObject, "tagTextSize", 15));
            preVar.m(h19.i(jSONObject, "tagBackgroundColor", ""));
            preVar.j(h19.i(jSONObject, "tagDarkBackgroundColor", ""));
            preVar.n(h19.i(jSONObject, "tagIconUrl", ""));
            preVar.k(h19.i(jSONObject, "darkTagIconUrl", ""));
            return preVar;
        }
    }

    static {
        t2o.a(815793071);
    }

    public pre() {
        super(mv1.TYPE_IMAGE_TEXT);
    }

    public static /* synthetic */ Object ipc$super(pre preVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/searchbar/data/ImgTextHintBean");
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("983820f5", new Object[]{this});
        }
        return this.f;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("afa7a718", new Object[]{this});
        }
        return this.h;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f55d5d8f", new Object[]{this});
        }
        return this.c;
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("85087c4b", new Object[]{this});
        }
        return this.e;
    }

    public final String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("90671d6e", new Object[]{this});
        }
        return this.g;
    }

    public final String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("97297536", new Object[]{this});
        }
        return this.f26252a;
    }

    public final String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1e093f79", new Object[]{this});
        }
        return this.b;
    }

    public final void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26f78186", new Object[]{this, new Boolean(z)});
        }
    }

    public final void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f981f21", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public final void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc36c35e", new Object[]{this, str});
        } else {
            this.h = str;
        }
    }

    public final void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaee362f", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public final void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92f0948b", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public final void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c267dc8", new Object[]{this, str});
        } else {
            this.g = str;
        }
    }

    public final void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2847200", new Object[]{this, str});
            return;
        }
        ckf.g(str, "<set-?>");
        this.f26252a = str;
    }

    public final void p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("255c6b85", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public final void q(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b5ef80c", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }

    public final int h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("835f3abe", new Object[]{this})).intValue() : this.d;
    }
}
