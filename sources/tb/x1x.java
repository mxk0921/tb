package tb;

import com.alibaba.triver.triver_shop.web.ShopBaseWebView;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class x1x implements ShopBaseWebView.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final d1a<xhv> f31083a;
    public final d1a<xhv> b;
    public boolean c;
    public Runnable d;
    public long e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            x1x.b(x1x.this, null);
            x1x.a(x1x.this);
        }
    }

    static {
        t2o.a(766510106);
        t2o.a(766510483);
    }

    public x1x(int i, d1a<xhv> d1aVar, d1a<xhv> d1aVar2) {
        ckf.g(d1aVar, "onPageStartScrollUp");
        ckf.g(d1aVar2, "onPageStopScroll");
        this.f31083a = d1aVar;
        this.b = d1aVar2;
    }

    public static final /* synthetic */ void a(x1x x1xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8da98b6d", new Object[]{x1xVar});
        } else {
            x1xVar.c();
        }
    }

    public static final /* synthetic */ void b(x1x x1xVar, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("566e0c72", new Object[]{x1xVar, runnable});
        } else {
            x1xVar.d = runnable;
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e39ace19", new Object[]{this});
        } else if (System.currentTimeMillis() - this.e >= 250) {
            this.c = false;
            this.b.invoke();
        } else {
            d();
        }
    }

    @Override // com.alibaba.triver.triver_shop.web.ShopBaseWebView.b
    public void coreOverScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8929bd6", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8), new Boolean(z)});
        } else if (i2 > 0 && i4 < i6) {
            this.e = System.currentTimeMillis();
            if (!this.c) {
                this.c = true;
                this.f31083a.invoke();
                d();
                return;
            }
            d();
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9608f959", new Object[]{this});
        } else if (this.d == null) {
            a aVar = new a();
            this.d = aVar;
            r54.D(aVar, 250L);
        }
    }

    public /* synthetic */ x1x(int i, d1a d1aVar, d1a d1aVar2, int i2, a07 a07Var) {
        this((i2 & 1) != 0 ? 0 : i, d1aVar, d1aVar2);
    }
}
