package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.HashSet;
import mtopsdk.mtop.domain.MethodEnum;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class h5p {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final HashSet<String> b;

    /* renamed from: a  reason: collision with root package name */
    public final g4p f20426a;

    public h5p(String str, String str2, boolean z, boolean z2, String str3) {
        this(str, str2, z, z2, false, str3);
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2aff77d", new Object[]{this, str, str2});
        } else if (!b.contains(str)) {
            g4p g4pVar = this.f20426a;
            if (g4pVar.f == null) {
                g4pVar.f = new HashMap();
            }
            this.f20426a.f.put(str, str2);
        }
    }

    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2fddb55", new Object[]{this, str, str2});
        } else if (!b.contains(str)) {
            g4p g4pVar = this.f20426a;
            if (g4pVar.g == null) {
                g4pVar.g = new HashMap();
            }
            this.f20426a.g.put(str, str2);
        }
    }

    public g4p c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g4p) ipChange.ipc$dispatch("9f40f5", new Object[]{this});
        }
        return this.f20426a;
    }

    public void d(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1167a2", new Object[]{this, str, new Integer(i)});
            return;
        }
        g4p g4pVar = this.f20426a;
        g4pVar.j = str;
        g4pVar.k = Integer.valueOf(i);
    }

    public h5p(String str, String str2, boolean z, boolean z2, boolean z3, String str3) {
        this(str, str2, z, z2, z3, str3, null);
    }

    public h5p(String str, String str2, boolean z, boolean z2, boolean z3, String str3, MethodEnum methodEnum) {
        g4p g4pVar = new g4p();
        this.f20426a = g4pVar;
        g4pVar.f19724a = str;
        g4pVar.b = str2;
        g4pVar.c = z;
        g4pVar.d = z2;
        g4pVar.e = z3;
        g4pVar.h = str3;
        g4pVar.i = methodEnum;
    }

    static {
        t2o.a(815792922);
        HashSet<String> hashSet = new HashSet<>();
        b = hashSet;
        hashSet.add("referrer");
        hashSet.add(m7r.URL_REFERER_ORIGIN);
    }
}
