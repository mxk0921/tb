package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.resolver2.e;
import java.util.HashMap;
import java.util.Map;
import tb.kbn;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class zho {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final kgd f32778a;
    public final cgd b;
    public final ggd c;
    public final hgd d;
    public final egd e;
    public final by4<bu4, hln<String>> f;
    public final kbn.d g;
    public final a h;
    public final b i;
    public final c<e> j;
    public final by4<bu4, rzc> k;
    public final Map<Class<?>, by4<bu4, ?>> l = new HashMap();
    public final Map<Class<?>, Object> m = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface a {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface b {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface c<T> {
    }

    public zho(kgd kgdVar, cgd cgdVar, ggd ggdVar, hgd hgdVar, egd egdVar, by4<bu4, hln<String>> by4Var, kbn.d dVar, a aVar, b bVar, c<e> cVar, by4<bu4, rzc> by4Var2) {
        this.f32778a = kgdVar;
        this.b = cgdVar;
        this.c = ggdVar;
        this.d = hgdVar;
        this.e = egdVar;
        this.f = by4Var;
        this.g = dVar;
        this.h = aVar;
        this.i = bVar;
        this.j = cVar;
        this.k = by4Var2;
    }

    public <T> by4<bu4, T> a(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (by4) ipChange.ipc$dispatch("739733d6", new Object[]{this, cls});
        }
        return (by4) ((HashMap) this.l).get(cls);
    }

    public <T> T b(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("c609ee75", new Object[]{this, cls});
        }
        return cls.cast(((HashMap) this.m).get(cls));
    }

    public <T> void c(Class<T> cls, by4<bu4, T> by4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23d45939", new Object[]{this, cls, by4Var});
        } else {
            ((HashMap) this.l).put(cls, by4Var);
        }
    }

    public <T> void d(Class<T> cls, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56796d72", new Object[]{this, cls, t});
        } else if (cls.isInstance(t)) {
            ((HashMap) this.m).put(cls, t);
        }
    }
}
