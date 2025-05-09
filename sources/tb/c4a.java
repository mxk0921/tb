package tb;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.AbsFlexibleMarqueeGallery;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class c4a implements View.OnAttachStateChangeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public AbsFlexibleMarqueeGallery f16847a;
    public final boolean g;
    public final Handler b = new Handler(Looper.getMainLooper());
    public long c = 3000;
    public boolean d = false;
    public boolean e = false;
    public int f = 0;
    public final Map<String, Integer> h = new HashMap();
    public final Runnable i = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if ((c4a.a(c4a.this) > 0 && c4a.a(c4a.this) <= c4a.b(c4a.this)) || !c4a.c(c4a.this)) {
                AbsFlexibleMarqueeGallery d = c4a.d(c4a.this);
                c4a.this.j();
                if (d != null) {
                    d.setAutoRunner(null);
                }
            } else if (!c4a.c(c4a.this) || !c4a.e(c4a.this)) {
                c4a.g(c4a.this).removeCallbacks(c4a.f(c4a.this), this);
            } else {
                c4a.d(c4a.this).autoScrollToNext();
                c4a.g(c4a.this).removeCallbacks(this);
                if ((c4a.a(c4a.this) > 0 && c4a.a(c4a.this) <= c4a.b(c4a.this)) || !c4a.c(c4a.this)) {
                    AbsFlexibleMarqueeGallery d2 = c4a.d(c4a.this);
                    c4a.this.j();
                    if (d2 != null) {
                        d2.setAutoRunner(null);
                    }
                } else if (c4a.c(c4a.this) && c4a.e(c4a.this)) {
                    c4a.g(c4a.this).postAtTime(this, SystemClock.uptimeMillis() + c4a.h(c4a.this));
                }
            }
        }
    }

    static {
        t2o.a(310378607);
    }

    public c4a(AbsFlexibleMarqueeGallery absFlexibleMarqueeGallery) {
        boolean z = false;
        this.g = false;
        this.f16847a = absFlexibleMarqueeGallery;
        if (absFlexibleMarqueeGallery != null) {
            if (absFlexibleMarqueeGallery.getAutoRunner() != null) {
                this.f16847a.getAutoRunner().j();
            }
            this.f16847a.setAutoRunner(this);
            this.f16847a.addOnAttachStateChangeListener(this);
            AccessibilityManager accessibilityManager = (AccessibilityManager) absFlexibleMarqueeGallery.getContext().getSystemService("accessibility");
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                z = true;
            }
            this.g = z;
        }
    }

    public static /* synthetic */ int a(c4a c4aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e5a29536", new Object[]{c4aVar})).intValue();
        }
        return c4aVar.f;
    }

    public static /* synthetic */ int b(c4a c4aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1559c937", new Object[]{c4aVar})).intValue();
        }
        return c4aVar.i();
    }

    public static /* synthetic */ boolean c(c4a c4aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4510fd49", new Object[]{c4aVar})).booleanValue();
        }
        return c4aVar.d;
    }

    public static /* synthetic */ AbsFlexibleMarqueeGallery d(c4a c4aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbsFlexibleMarqueeGallery) ipChange.ipc$dispatch("bebf1bd1", new Object[]{c4aVar});
        }
        return c4aVar.f16847a;
    }

    public static /* synthetic */ boolean e(c4a c4aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a47f654b", new Object[]{c4aVar})).booleanValue();
        }
        return c4aVar.e;
    }

    public static /* synthetic */ Runnable f(c4a c4aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("ad0fb74c", new Object[]{c4aVar});
        }
        return c4aVar.i;
    }

    public static /* synthetic */ Handler g(c4a c4aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("3d96e2dd", new Object[]{c4aVar});
        }
        return c4aVar.b;
    }

    public static /* synthetic */ long h(c4a c4aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("33a5013e", new Object[]{c4aVar})).longValue();
        }
        return c4aVar.c;
    }

    public final int i() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3f980eb0", new Object[]{this})).intValue();
        }
        AbsFlexibleMarqueeGallery absFlexibleMarqueeGallery = this.f16847a;
        if (absFlexibleMarqueeGallery != null) {
            i = absFlexibleMarqueeGallery.mExpectedAdapterCount;
        } else {
            i = 0;
        }
        if (absFlexibleMarqueeGallery == null || ((HashMap) this.h).size() < i) {
            return 0;
        }
        return ((Integer) Collections.min(((HashMap) this.h).values())).intValue();
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        AbsFlexibleMarqueeGallery absFlexibleMarqueeGallery = this.f16847a;
        if (absFlexibleMarqueeGallery != null) {
            absFlexibleMarqueeGallery.removeOnAttachStateChangeListener(this);
        }
        r();
        AbsFlexibleMarqueeGallery absFlexibleMarqueeGallery2 = this.f16847a;
        if (absFlexibleMarqueeGallery2 != null) {
            absFlexibleMarqueeGallery2.setAutoRunner(null);
            this.f16847a = null;
        }
    }

    public void k(int i) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f4b0642", new Object[]{this, new Integer(i)});
            return;
        }
        AbsFlexibleMarqueeGallery absFlexibleMarqueeGallery = this.f16847a;
        if (absFlexibleMarqueeGallery != null) {
            i2 = absFlexibleMarqueeGallery.mExpectedAdapterCount;
        }
        String valueOf = String.valueOf(i % i2);
        Integer num = (Integer) ((HashMap) this.h).get(valueOf);
        if (num != null) {
            ((HashMap) this.h).put(valueOf, Integer.valueOf(num.intValue() + 1));
        } else {
            ((HashMap) this.h).put(valueOf, 1);
        }
        int i3 = i();
        int i4 = this.f;
        if (i4 > 0 && i3 >= i4) {
            j();
        }
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b6a3f40", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        this.e = false;
        this.b.removeCallbacks(this.i, this);
    }

    public void n(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8750b20", new Object[]{this, new Boolean(z)});
        } else if (!this.g && this.d) {
            this.e = true;
            this.b.removeCallbacks(this.i, this);
            if (z) {
                this.b.postAtTime(this.i, this, SystemClock.uptimeMillis());
            } else {
                this.b.postAtTime(this.i, this, SystemClock.uptimeMillis() + this.c);
            }
        }
    }

    public c4a o(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c4a) ipChange.ipc$dispatch("6cdfe96c", new Object[]{this, new Long(j)});
        }
        this.c = j;
        return this;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d337638", new Object[]{this, view});
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f64d55b", new Object[]{this, view});
        }
    }

    public void p(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9f34f6e", new Object[]{this, new Integer(i)});
        } else {
            this.f = i;
        }
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else if (!this.g) {
            this.d = true;
            this.e = true;
            this.b.removeCallbacks(this.i, this);
            this.b.postAtTime(this.i, this, SystemClock.uptimeMillis() + this.c);
        }
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        this.d = false;
        this.e = false;
        this.b.removeCallbacks(this.i, this);
    }
}
