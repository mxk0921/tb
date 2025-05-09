package tb;

import androidx.fragment.app.Fragment;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class mpl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f24211a;
    public final Fragment b;
    public final String c;
    public final JSONObject d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Fragment f24212a;
        public String b;
        public JSONObject c;
        public final String d;

        static {
            t2o.a(786432037);
        }

        public a(String str) {
            ckf.g(str, "title");
            this.d = str;
        }

        public final mpl a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (mpl) ipChange.ipc$dispatch("e04efd12", new Object[]{this});
            }
            return new mpl(this.d, this.f24212a, this.b, this.c, null);
        }

        public final a b(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("38c64f00", new Object[]{this, jSONObject});
            }
            ckf.g(jSONObject, "content");
            this.c = jSONObject;
            return this;
        }

        public final a c(Fragment fragment) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("da031981", new Object[]{this, fragment});
            }
            ckf.g(fragment, "fragment");
            this.f24212a = fragment;
            return this;
        }

        public final a d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f64a9cb0", new Object[]{this, str});
            }
            ckf.g(str, "url");
            this.b = str;
            return this;
        }
    }

    static {
        t2o.a(786432036);
    }

    public mpl(String str, Fragment fragment, String str2, JSONObject jSONObject) {
        this.f24211a = str;
        this.b = fragment;
        this.c = str2;
        this.d = jSONObject;
    }

    public final JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("14011e6a", new Object[]{this});
        }
        return this.d;
    }

    public final Fragment b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("34dee721", new Object[]{this});
        }
        return this.b;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5267f97", new Object[]{this});
        }
        return this.f24211a;
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        return this.c;
    }

    public /* synthetic */ mpl(String str, Fragment fragment, String str2, JSONObject jSONObject, a07 a07Var) {
        this(str, fragment, str2, jSONObject);
    }
}
