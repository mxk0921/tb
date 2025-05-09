package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class l7 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final int SCENE_SEARCH_EVERYTHING = 3;
    public static final int SCENE_STRONG_PURPOSE = 2;
    public static final int SCENE_WEAK_PURPOSE = 1;
    public bab b;

    /* renamed from: a  reason: collision with root package name */
    public final lsi<Integer> f23145a = new lsi<>(2);
    public final lsi<Boolean> c = new lsi<>(Boolean.FALSE);
    public final lsi<Integer> d = new lsi<>(0);
    public final lsi<JSONObject> e = new lsi<>(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(815792150);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(815792149);
    }

    public final lsi<JSONObject> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lsi) ipChange.ipc$dispatch("e34cf30", new Object[]{this});
        }
        return this.e;
    }

    public final lsi<Integer> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lsi) ipChange.ipc$dispatch("fbbfbbae", new Object[]{this});
        }
        return this.d;
    }

    public final lsi<Integer> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lsi) ipChange.ipc$dispatch("2c6be766", new Object[]{this});
        }
        return this.f23145a;
    }

    public final bab d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bab) ipChange.ipc$dispatch("c785f330", new Object[]{this});
        }
        return this.b;
    }

    public final lsi<Boolean> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lsi) ipChange.ipc$dispatch("81b822c", new Object[]{this});
        }
        return this.c;
    }

    public final void f(bab babVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd657a", new Object[]{this, babVar});
            return;
        }
        ckf.g(babVar, "callback");
        this.b = babVar;
    }

    public final void g(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57d03316", new Object[]{this, jSONObject});
        } else {
            this.e.g(jSONObject);
        }
    }
}
