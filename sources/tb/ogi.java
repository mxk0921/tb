package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.r;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ogi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, rv4> f25376a;
    public boolean b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final ogi f25377a = new ogi();

        static {
            t2o.a(502268286);
        }

        public static /* synthetic */ ogi a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ogi) ipChange.ipc$dispatch("52059080", new Object[0]);
            }
            return f25377a;
        }
    }

    static {
        t2o.a(502268284);
    }

    public static ogi e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ogi) ipChange.ipc$dispatch("1dca16e6", new Object[0]);
        }
        return b.a();
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("364ea4b9", new Object[]{this, str})).booleanValue();
        }
        rv4 g = g(str);
        if (g != null) {
            return g.a();
        }
        return false;
    }

    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7dc9f312", new Object[]{this, str})).booleanValue();
        }
        return n(str);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21de54f1", new Object[]{this});
            return;
        }
        HashMap<String, rv4> hashMap = this.f25376a;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public rv4 d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rv4) ipChange.ipc$dispatch("49b3a8c7", new Object[]{this, str});
        }
        HashMap<String, rv4> hashMap = this.f25376a;
        if (hashMap == null || hashMap.size() <= 0) {
            return null;
        }
        return this.f25376a.get(str);
    }

    public String f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("885e382", new Object[]{this, str});
        }
        rv4 g = g(str);
        if (g == null) {
            return null;
        }
        if (!TextUtils.isEmpty(g.d())) {
            return g.d();
        }
        if (!TextUtils.isEmpty(g.j())) {
            return g.j();
        }
        return null;
    }

    public final rv4 g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rv4) ipChange.ipc$dispatch("76eada22", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return d(str);
    }

    public String h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("94b9b882", new Object[]{this, str});
        }
        rv4 g = g(str);
        if (g != null) {
            return g.k();
        }
        return null;
    }

    public r i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r) ipChange.ipc$dispatch("5044c75a", new Object[]{this, str});
        }
        rv4 g = g(str);
        if (g != null) {
            return g.h();
        }
        return null;
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3f1acd67", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public boolean k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69841cb2", new Object[]{this, str})).booleanValue();
        }
        rv4 g = g(str);
        if (g != null) {
            return g.n();
        }
        return false;
    }

    public boolean l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cab92cb8", new Object[]{this, str})).booleanValue();
        }
        rv4 g = g(str);
        if (g != null) {
            return g.i();
        }
        return true;
    }

    public boolean m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bed53f78", new Object[]{this, str})).booleanValue();
        }
        rv4 g = g(str);
        if (g != null) {
            return g.o();
        }
        return false;
    }

    public boolean n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e25f9830", new Object[]{this, str})).booleanValue();
        }
        rv4 g = g(str);
        if (g != null) {
            return g.p();
        }
        return false;
    }

    public void o(String str, rv4 rv4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1cf12c8", new Object[]{this, str, rv4Var});
            return;
        }
        HashMap<String, rv4> hashMap = this.f25376a;
        if (hashMap != null) {
            hashMap.put(str, rv4Var);
        }
    }

    public void p(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49949753", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    public ogi() {
        this.f25376a = new HashMap<>();
        this.b = false;
    }
}
