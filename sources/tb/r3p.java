package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class r3p {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final String f27088a;
    public final String b;
    public final int c;
    public final int d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(815793004);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final r3p a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (r3p) ipChange.ipc$dispatch("195fdf16", new Object[]{this, jSONObject});
            }
            ckf.g(jSONObject, "item");
            JSONObject jSONObject2 = jSONObject.getJSONObject("searchIcon");
            if (jSONObject2 != null && !TextUtils.isEmpty(jSONObject2.getString("url"))) {
                return new r3p(jSONObject2.getString("name"), jSONObject2.getString("url"), jSONObject2.getIntValue("width"), jSONObject2.getIntValue("height"));
            }
            return null;
        }

        public a() {
        }
    }

    static {
        t2o.a(815793003);
    }

    public r3p(String str, String str2, int i, int i2) {
        this.f27088a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    public final int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        return this.b;
    }

    public final int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r3p)) {
            return false;
        }
        r3p r3pVar = (r3p) obj;
        if (ckf.b(this.f27088a, r3pVar.f27088a) && ckf.b(this.b, r3pVar.b) && this.c == r3pVar.c && this.d == r3pVar.d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        String str = this.f27088a;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i3 = i * 31;
        String str2 = this.b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((((i3 + i2) * 31) + this.c) * 31) + this.d;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "SearchIcon(name=" + this.f27088a + ", url=" + this.b + ", width=" + this.c + ", height=" + this.d + ')';
    }
}
