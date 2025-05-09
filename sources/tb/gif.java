package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class gif implements a2e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ux9 f20021a;

    static {
        t2o.a(779092683);
        t2o.a(806356574);
    }

    public gif(ux9 ux9Var) {
        this.f20021a = ux9Var;
    }

    @Override // tb.a2e
    public void a(String str, String str2, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10db17d0", new Object[]{this, str, str2, hashMap});
        } else {
            sbu.j(this.f20021a, str2, null, hashMap);
        }
    }

    @Override // tb.a2e
    public void b(String str, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b360459a", new Object[]{this, str, hashMap});
        } else {
            sbu.k(this.f20021a, str, hashMap);
        }
    }

    @Override // tb.a2e
    public void c(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bedf2974", new Object[]{this, str, strArr});
        } else {
            sbu.g(this.f20021a, str, strArr);
        }
    }

    @Override // tb.a2e
    public void d(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c539d010", new Object[]{this, str, str2, map});
        } else {
            sbu.f(this.f20021a, str2, map);
        }
    }

    @Override // tb.a2e
    public void e(int i, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d88b303b", new Object[]{this, new Integer(i), str, map});
        } else {
            sbu.i(this.f20021a, i, str, map);
        }
    }

    @Override // tb.a2e
    public void f(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a250b2d4", new Object[]{this, ux9Var});
        } else {
            sj9.n(ux9Var);
        }
    }
}
