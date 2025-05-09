package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.iub;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class zc5<T> implements iub<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<dc5> f32681a;
    public T b;
    public iub.a<T> c;
    public iub.b<T> d;
    public final jub<T> e;

    static {
        t2o.a(444597741);
        t2o.a(444597742);
    }

    public zc5(jub<T> jubVar) {
        this.e = jubVar;
    }

    @Override // tb.iub
    public void a(iub.b<T> bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad3b8cb4", new Object[]{this, bVar});
        } else {
            this.d = bVar;
        }
    }

    @Override // tb.iub
    public void b(iub.a<T> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c843748e", new Object[]{this, aVar});
        } else {
            this.c = aVar;
        }
    }

    @Override // tb.iub
    public void c(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1855d2c1", new Object[]{this, t});
        } else {
            this.b = t;
        }
    }

    @Override // tb.iub
    public void d(List<dc5> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60d2cdb8", new Object[]{this, list});
        } else {
            this.f32681a = list;
        }
    }

    @Override // tb.iub
    public jub<T> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jub) ipChange.ipc$dispatch("46de87c6", new Object[]{this});
        }
        return this.e;
    }

    @Override // tb.iub
    public T f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("cdb1c6a1", new Object[]{this});
        }
        return this.b;
    }

    public List<dc5> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d2842694", new Object[]{this});
        }
        return this.f32681a;
    }
}
