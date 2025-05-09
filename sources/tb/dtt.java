package tb;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class dtt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Interpolator f18062a;
    public View b;
    public final int d;
    public long e;
    public float f;
    public final c i;
    public final c j;
    public int k;
    public int l;
    public boolean c = true;
    public final Handler m = new a(Looper.getMainLooper());
    public final c g = new c();
    public final c h = new c();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/modules/edit/image/thumbnaillist/ThumbnailStretchAnimationHelper$1");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            if (message.what == 1) {
                if (!dtt.a(dtt.this)) {
                    dtt.b(dtt.this).sendEmptyMessageDelayed(1, 20L);
                } else if (dtt.c(dtt.this) != null) {
                    dtt.c(dtt.this).a(dtt.d(dtt.this));
                }
            }
            super.handleMessage(message);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface b {
        void a(View view);
    }

    static {
        t2o.a(511705265);
    }

    public dtt(int i, int i2, int i3, int i4, int i5) {
        this.d = i5;
        this.i = new c(i, i3);
        this.j = new c(i2, i4);
    }

    public static /* synthetic */ boolean a(dtt dttVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("449c0b07", new Object[]{dttVar})).booleanValue();
        }
        return dttVar.h();
    }

    public static /* synthetic */ Handler b(dtt dttVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("a7828ba4", new Object[]{dttVar});
        }
        return dttVar.m;
    }

    public static /* synthetic */ b c(dtt dttVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("30d91cf7", new Object[]{dttVar});
        }
        dttVar.getClass();
        return null;
    }

    public static /* synthetic */ View d(dtt dttVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1fae5e2", new Object[]{dttVar});
        }
        return dttVar.b;
    }

    public final int e(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7c01e62b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        if (i > i3) {
            return i3 - i;
        }
        if (i == i3) {
            return 0;
        }
        return i2 - i3;
    }

    public final int f(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("14e6d4ed", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        if (i < i2) {
            return i2 - i;
        }
        if (i == i2) {
            return 0;
        }
        return i3 - i2;
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26f059d", new Object[]{this});
            return;
        }
        View view = this.b;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
            c cVar = this.h;
            layoutParams.height = cVar.f18064a;
            layoutParams.width = cVar.b;
            this.b.setLayoutParams(layoutParams);
        }
    }

    public final boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a49e7a8", new Object[]{this})).booleanValue();
        }
        if (this.c) {
            return true;
        }
        int elapsedRealtime = (int) (SystemClock.elapsedRealtime() - this.e);
        if (elapsedRealtime <= this.d) {
            float f = elapsedRealtime * this.f;
            Interpolator interpolator = this.f18062a;
            if (interpolator != null) {
                f = interpolator.getInterpolation(f);
            }
            this.h.b = this.g.b + Math.round(this.l * f);
            this.h.f18064a = this.g.f18064a + Math.round(f * this.k);
        } else {
            this.c = true;
            c cVar = this.h;
            c cVar2 = this.g;
            cVar.b = cVar2.b + this.l;
            cVar.f18064a = cVar2.f18064a + this.k;
        }
        g();
        return this.c;
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9673ae47", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            this.m.removeCallbacksAndMessages(null);
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76b89f37", new Object[]{this});
            return;
        }
        this.c = true;
        this.m.removeCallbacksAndMessages(null);
    }

    public void l(Interpolator interpolator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("594234d5", new Object[]{this, interpolator});
        } else {
            this.f18062a = interpolator;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public int f18064a;
        public int b;

        static {
            t2o.a(511705268);
        }

        public c(int i, int i2) {
            this.f18064a = i;
            this.b = i2;
        }

        public c() {
        }
    }

    public void m(View view, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57af2e8b", new Object[]{this, view, new Boolean(z)});
        } else if (view != null) {
            this.b = view;
            if (this.c) {
                this.f = 1.0f / this.d;
                c cVar = this.g;
                c cVar2 = this.h;
                int height = view.getHeight();
                cVar2.f18064a = height;
                cVar.f18064a = height;
                c cVar3 = this.g;
                c cVar4 = this.h;
                int width = this.b.getWidth();
                cVar4.b = width;
                cVar3.b = width;
                if (z) {
                    c cVar5 = this.h;
                    int i5 = cVar5.b;
                    c cVar6 = this.i;
                    if (i5 >= cVar6.b || (i3 = cVar5.f18064a) >= (i4 = cVar6.f18064a)) {
                        odg.b("ThumbnailStretchAnimationHelper", "startAnimation fail when stretch out");
                        return;
                    } else {
                        this.k = f(i3, i4, this.j.f18064a);
                        this.l = f(this.h.b, this.i.b, this.j.b);
                    }
                } else {
                    c cVar7 = this.h;
                    int i6 = cVar7.b;
                    c cVar8 = this.j;
                    if (i6 <= cVar8.b || (i = cVar7.f18064a) <= (i2 = cVar8.f18064a)) {
                        odg.b("ThumbnailStretchAnimationHelper", "startAnimation fail when draw back");
                        return;
                    } else {
                        this.k = e(i, this.i.f18064a, i2);
                        this.l = e(this.h.b, this.i.b, this.j.b);
                    }
                }
                if (this.k != 0 && this.l != 0) {
                    this.c = false;
                    this.e = SystemClock.elapsedRealtime();
                    this.m.sendEmptyMessage(1);
                }
            }
        }
    }
}
