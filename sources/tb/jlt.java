package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class jlt extends mv1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public String f22060a = "";
    public String b;
    public String c;
    public boolean d;
    public int e;
    public String f;
    public String g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(815793079);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }

        @JvmStatic
        public final jlt a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jlt) ipChange.ipc$dispatch("c7c70173", new Object[]{this, jSONObject});
            }
            if (jSONObject == null || jSONObject.isEmpty()) {
                return null;
            }
            jlt jltVar = new jlt();
            jltVar.n(h19.i(jSONObject, "text", ""));
            if (TextUtils.isEmpty(jltVar.d())) {
                return null;
            }
            jltVar.o(h19.i(jSONObject, "textColor", ""));
            jltVar.k(h19.i(jSONObject, vaj.KEY_TAB_DARK_TEXT_COLOR, ""));
            jltVar.h(h19.e(jSONObject, "isBold", false));
            jltVar.p(h19.g(jSONObject, "textSize", 15));
            jltVar.r(h19.i(jSONObject, "strokeColor", ""));
            jltVar.q(h19.i(jSONObject, "darkStrokeColor", ""));
            jltVar.l(h19.i(jSONObject, "solidColor", ""));
            jltVar.i(h19.i(jSONObject, "darkSolidColor", ""));
            return jltVar;
        }
    }

    static {
        t2o.a(815793078);
    }

    public jlt() {
        super("text");
    }

    public static /* synthetic */ Object ipc$super(jlt jltVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/searchbar/data/TextHintBean");
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("983820f5", new Object[]{this});
        }
        return this.g;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f55d5d8f", new Object[]{this});
        }
        return this.c;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("85087c4b", new Object[]{this});
        }
        return this.f;
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("97297536", new Object[]{this});
        }
        return this.f22060a;
    }

    public final String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1e093f79", new Object[]{this});
        }
        return this.b;
    }

    public final int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("835f3abe", new Object[]{this})).intValue();
        }
        return this.e;
    }

    public final boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42a09bda", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public final void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26f78186", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    public final void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f981f21", new Object[]{this, str});
        } else {
            this.g = str;
        }
    }

    public final void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaee362f", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public final void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92f0948b", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public final void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2847200", new Object[]{this, str});
            return;
        }
        ckf.g(str, "<set-?>");
        this.f22060a = str;
    }

    public final void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("255c6b85", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public final void p(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b5ef80c", new Object[]{this, new Integer(i)});
        } else {
            this.e = i;
        }
    }

    public final void q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("423cdc44", new Object[]{this, str});
        }
    }

    public final void r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99f3141a", new Object[]{this, str});
        }
    }
}
