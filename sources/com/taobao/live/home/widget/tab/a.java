package com.taobao.live.home.widget.tab;

import android.view.animation.Interpolator;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.live.home.widget.tab.XTabLayout;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final g f10980a;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.live.home.widget.tab.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class C0579a implements g.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f10981a;

        public C0579a(e eVar) {
            this.f10981a = eVar;
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bb5deb15", new Object[]{this});
            } else {
                this.f10981a.a(a.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements g.AbstractC0580a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f10982a;

        public b(c cVar) {
            this.f10982a = cVar;
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3d93a046", new Object[]{this});
            } else {
                ((d) this.f10982a).a(a.this);
            }
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c281bbd", new Object[]{this});
            } else {
                ((XTabLayout.SlidingTabStrip.b) this.f10982a).c(a.this);
            }
        }

        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("771cb104", new Object[]{this});
            } else {
                ((d) this.f10982a).b(a.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface c {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class d implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(806355525);
            t2o.a(806355524);
        }

        public void a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("78ce6126", new Object[]{this, aVar});
            }
        }

        public void b(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bb374b28", new Object[]{this, aVar});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface e {
        void a(a aVar);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface f {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static abstract class g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.live.home.widget.tab.a$g$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public interface AbstractC0580a {
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public interface b {
        }

        static {
            t2o.a(806355528);
        }

        public abstract void a();

        public abstract float b();

        public abstract int c();

        public abstract long d();

        public abstract boolean e();

        public abstract void f(int i);

        public abstract void g(float f, float f2);

        public abstract void h(int i, int i2);

        public abstract void i(Interpolator interpolator);

        public abstract void j(AbstractC0580a aVar);

        public abstract void k(b bVar);

        public abstract void l();
    }

    static {
        t2o.a(806355521);
    }

    public a(g gVar) {
        this.f10980a = gVar;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
        } else {
            this.f10980a.a();
        }
    }

    public float b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("17975332", new Object[]{this})).floatValue();
        }
        return this.f10980a.b();
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("67cdd7f5", new Object[]{this})).intValue();
        }
        return this.f10980a.c();
    }

    public long d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed837a85", new Object[]{this})).longValue();
        }
        return this.f10980a.d();
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b6a3f40", new Object[]{this})).booleanValue();
        }
        return this.f10980a.e();
    }

    public void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55c2b106", new Object[]{this, new Integer(i)});
        } else {
            this.f10980a.f(i);
        }
    }

    public void g(float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd3c92a3", new Object[]{this, new Float(f2), new Float(f3)});
        } else {
            this.f10980a.g(f2, f3);
        }
    }

    public void h(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9928396", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            this.f10980a.h(i, i2);
        }
    }

    public void i(Interpolator interpolator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("594234d5", new Object[]{this, interpolator});
        } else {
            this.f10980a.i(interpolator);
        }
    }

    public void j(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30a62e02", new Object[]{this, cVar});
        } else if (cVar != null) {
            this.f10980a.j(new b(cVar));
        } else {
            this.f10980a.j(null);
        }
    }

    public void k(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be818b62", new Object[]{this, eVar});
        } else if (eVar != null) {
            this.f10980a.k(new C0579a(eVar));
        } else {
            this.f10980a.k(null);
        }
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else {
            this.f10980a.l();
        }
    }
}
