package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.e5e;
import tb.i6d;
import tb.qjd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class xnn implements lhd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final inl f31486a;
    public final m4o b;
    public final b6v c;

    static {
        t2o.a(729809973);
        t2o.a(729809982);
    }

    public xnn(inl inlVar, m4o m4oVar, b6v b6vVar) {
        this.f31486a = inlVar;
        this.b = m4oVar;
        this.c = b6vVar;
    }

    @Override // tb.i6d
    public void a(i6d.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a3f4379", new Object[]{this, aVar});
        } else {
            this.f31486a.a(aVar);
        }
    }

    @Override // tb.i6d
    public void b(i6d.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee580656", new Object[]{this, aVar});
        } else {
            this.f31486a.b(aVar);
        }
    }

    @Override // tb.e5e
    public void c(e5e.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f70f359", new Object[]{this, aVar});
        } else {
            this.c.c(aVar);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.f31486a.c();
        this.c.a();
        this.b.a();
    }

    @Override // tb.i6d
    public void e(i6d.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e5f8152", new Object[]{this, cVar});
        } else {
            this.f31486a.e(cVar);
        }
    }

    @Override // tb.e5e
    public void i(e5e.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d33d7c7c", new Object[]{this, aVar});
        } else {
            this.c.i(aVar);
        }
    }

    @Override // tb.i6d
    public void k(i6d.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("838b9e2f", new Object[]{this, cVar});
        } else {
            this.f31486a.k(cVar);
        }
    }

    @Override // tb.i6d
    public void l(i6d.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac6cff97", new Object[]{this, bVar});
        } else {
            this.f31486a.l(bVar);
        }
    }

    @Override // tb.qjd
    public void m(qjd.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("166a4d3f", new Object[]{this, bVar});
        } else {
            this.b.m(bVar);
        }
    }

    @Override // tb.i6d
    public void n(i6d.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("414592fa", new Object[]{this, bVar});
        } else {
            this.f31486a.n(bVar);
        }
    }

    @Override // tb.qjd
    public void r(qjd.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d750d3c", new Object[]{this, bVar});
        } else {
            this.b.r(bVar);
        }
    }
}
