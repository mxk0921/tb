package tb;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class u3o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f29122a;
    public String b;
    public Map<String, String> h;
    public Map<String, String> i;
    public final Context k;
    public final SharedPreferences l;
    public boolean q;
    public y1e s;
    public boolean c = true;
    public boolean d = true;
    public String e = "UNIT_TRADE";
    public boolean f = true;
    public boolean g = false;
    public final String j = "order_ultron";
    public boolean m = false;
    public boolean n = false;
    public final String o = ncl.b;
    public String p = "";
    public String r = "";

    static {
        t2o.a(297795602);
    }

    public u3o(Context context) {
        this.k = context;
        if (yv6.b(context)) {
            this.l = context.getSharedPreferences(w55.NAMESPACE, 0);
        }
    }

    public u3o A(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u3o) ipChange.ipc$dispatch("ba96cc54", new Object[]{this, map});
        }
        this.h = map;
        return this;
    }

    public u3o B(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u3o) ipChange.ipc$dispatch("41e667a8", new Object[]{this, new Boolean(z)});
        }
        this.f = z;
        return this;
    }

    public u3o C(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u3o) ipChange.ipc$dispatch("d7c215c3", new Object[]{this, map});
        }
        this.i = map;
        return this;
    }

    public u3o D(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u3o) ipChange.ipc$dispatch("10e596dc", new Object[]{this, new Boolean(z)});
        }
        this.n = z;
        return this;
    }

    public void E(y1e y1eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bf15a18", new Object[]{this, y1eVar});
        } else {
            this.s = y1eVar;
        }
    }

    public u3o F(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u3o) ipChange.ipc$dispatch("a7290dcd", new Object[]{this, str});
        }
        this.p = str;
        return this;
    }

    public u3o G(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u3o) ipChange.ipc$dispatch("a9349be4", new Object[]{this, str});
        }
        this.e = str;
        return this;
    }

    public u3o H(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u3o) ipChange.ipc$dispatch("ba938c6d", new Object[]{this, new Boolean(z)});
        }
        this.g = z;
        return this;
    }

    public u3o I(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u3o) ipChange.ipc$dispatch("ce8b2765", new Object[]{this, str});
        }
        this.b = str;
        return this;
    }

    public u3o a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u3o) ipChange.ipc$dispatch("b86e2c27", new Object[]{this, str});
        }
        this.f29122a = str;
        return this;
    }

    public u3o b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u3o) ipChange.ipc$dispatch("7d06cd69", new Object[]{this, str});
        }
        this.r = str;
        return this;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("67b7a95", new Object[]{this});
        }
        if (!yv6.b(this.k)) {
            return this.f29122a;
        }
        SharedPreferences sharedPreferences = this.l;
        String str = this.f29122a;
        return sharedPreferences.getString(str, str);
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("92150ca3", new Object[]{this});
        }
        return this.o;
    }

    public int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("14dc0c52", new Object[]{this})).intValue();
        }
        return 0;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("42bddf1", new Object[]{this});
        }
        return this.j;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6ebec4e7", new Object[]{this});
        }
        return this.r;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6fba2f7f", new Object[]{this});
        }
        return null;
    }

    public Map<String, String> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("cf4415cc", new Object[]{this});
        }
        return this.i;
    }

    public Map<String, String> j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f10013f8", new Object[]{this});
        }
        return this.h;
    }

    public String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9afc202f", new Object[]{this});
        }
        return this.p;
    }

    public y1e l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y1e) ipChange.ipc$dispatch("3896b78c", new Object[]{this});
        }
        return this.s;
    }

    public String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7072a98c", new Object[]{this});
        }
        return this.e;
    }

    public String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this});
        }
        if (!yv6.b(this.k)) {
            return this.b;
        }
        SharedPreferences sharedPreferences = this.l;
        return sharedPreferences.getString(this.f29122a + ".version", this.b);
    }

    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("23572630", new Object[]{this})).booleanValue();
        }
        return this.n;
    }

    public boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a67e1b20", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d5d975a6", new Object[]{this})).booleanValue();
        }
        return this.q;
    }

    public boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f430765d", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64a44321", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a99b176", new Object[]{this})).booleanValue();
        }
        return this.f;
    }

    public boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84e1d191", new Object[]{this})).booleanValue();
        }
        return this.g;
    }

    public u3o v(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u3o) ipChange.ipc$dispatch("6fecdc78", new Object[]{this, new Boolean(z)});
        }
        this.q = z;
        return this;
    }

    public u3o w(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u3o) ipChange.ipc$dispatch("a30205cd", new Object[]{this, new Boolean(z)});
        }
        this.d = z;
        return this;
    }

    public u3o x(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u3o) ipChange.ipc$dispatch("a16f3209", new Object[]{this, new Boolean(z)});
        }
        this.c = z;
        return this;
    }

    public u3o y(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u3o) ipChange.ipc$dispatch("db10222f", new Object[]{this, new Boolean(z)});
        }
        this.m = z;
        return this;
    }

    public boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c5b83c5", new Object[]{this})).booleanValue();
        }
        return this.m;
    }
}
