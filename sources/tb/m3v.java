package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class m3v implements c5e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f23758a;
    public final String b;
    public Map<String, String> c;

    static {
        t2o.a(511705528);
        t2o.a(511705526);
    }

    public m3v(String str, String str2) {
        this(str, str2, null);
    }

    @Override // tb.c5e
    public void a(String str, Map<String, String> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58b90422", new Object[]{this, str, map, new Boolean(z)});
            return;
        }
        String str2 = this.f23758a;
        if (!z) {
            map = f4v.a(k(map), false);
        }
        f4v.c(str2, str, map);
    }

    @Override // tb.c5e
    public void b(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55714cf2", new Object[]{this, str, map});
        } else {
            a(str, map, false);
        }
    }

    @Override // tb.c5e
    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9144a04a", new Object[]{this, str});
        } else {
            f(str, null);
        }
    }

    @Override // tb.c5e
    public void d(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9a60f04", new Object[]{this, context, map});
        } else {
            m(context, map, false);
        }
    }

    @Override // tb.c5e
    public void e(String str, Map<String, String> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55554e04", new Object[]{this, str, map, new Boolean(z)});
            return;
        }
        String str2 = this.f23758a;
        if (!z) {
            map = f4v.a(k(map), true);
        }
        f4v.d(str2, str, map);
    }

    @Override // tb.c5e
    public void f(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5635dfb", new Object[]{this, str, map});
        } else {
            g(str, map, false);
        }
    }

    @Override // tb.c5e
    public void g(String str, Map<String, String> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7091439", new Object[]{this, str, map, new Boolean(z)});
            return;
        }
        String str2 = this.f23758a;
        if (!z) {
            map = f4v.a(k(map), true);
        }
        f4v.b(str2, str, map);
    }

    @Override // tb.c5e
    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83b8233", new Object[]{this, str});
        } else {
            b(str, null);
        }
    }

    @Override // tb.c5e
    public void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("771bd015", new Object[]{this, str});
        } else {
            j(str, null);
        }
    }

    @Override // tb.c5e
    public void j(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d133ed0", new Object[]{this, str, map});
        } else {
            e(str, map, false);
        }
    }

    public final Map<String, String> k(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("27ad55f1", new Object[]{this, map});
        }
        Map<String, String> map2 = this.c;
        if (map2 != null && map2.size() > 0) {
            if (map == null) {
                map = new HashMap<>();
            }
            map.putAll(this.c);
        }
        return map;
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b110817", new Object[]{this});
            return;
        }
        Map<String, String> map = this.c;
        if (map == null) {
            map = new HashMap<>();
        }
        this.c = map;
        map.putAll(f4v.e());
        this.c.put("spm-cnt", this.b);
    }

    public void m(Context context, Map<String, String> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b1c8450", new Object[]{this, context, map, new Boolean(z)});
            return;
        }
        String str = this.f23758a;
        String str2 = this.b;
        if (!z) {
            map = f4v.a(k(map), false);
        }
        f4v.g(context, str, str2, map);
    }

    public m3v(String str, String str2, Map<String, String> map) {
        this.f23758a = str;
        this.b = str2;
        this.c = map;
        l();
    }
}
