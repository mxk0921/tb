package tb;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class cy0 extends dtl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static ouo G;
    public final ay0 A;
    public int[] C;
    public final int h;
    public final int i;
    public int j;
    public Bitmap k;
    public final int[] l;
    public fy0 m;
    public final int r;
    public boolean t;
    public long v;
    public int x;
    public int y;
    public int z;
    public final Runnable n = new a(this, 0);
    public final Runnable o = new a(this, 1);
    public final Runnable p = new a(this, 2);
    public final Runnable q = new a(this, 3);
    public final Handler F = new Handler(Looper.getMainLooper());
    public int D = 0;
    public int E = 0;
    public long w = -1;
    public boolean B = true;
    public boolean u = true;
    public final int s = m();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int INVALIDATE_TYPE = 2;
        public static final int NEXT_TYPE = 1;
        public static final int START_TYPE = 0;
        public static final int TIMEOUT_FOR_DRAW_TYPE = 3;

        /* renamed from: a  reason: collision with root package name */
        private int f17428a;
        private WeakReference<cy0> b;

        static {
            t2o.a(620757003);
        }

        public a(cy0 cy0Var, int i) {
            this.b = new WeakReference<>(cy0Var);
            this.f17428a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            cy0 cy0Var = this.b.get();
            if (cy0Var != null) {
                int i = this.f17428a;
                if (i == 0) {
                    cy0Var.w();
                } else if (i == 1) {
                    cy0Var.v();
                } else if (i == 2) {
                    cy0.l(cy0Var);
                } else if (i == 3) {
                    cy0Var.x();
                }
            }
        }
    }

    static {
        t2o.a(620757002);
    }

    public cy0(String str, String str2, int i, int i2, by0 by0Var) {
        super(str, str2, i, i2);
        this.h = by0Var.getWidth();
        this.i = by0Var.getHeight();
        this.l = by0Var.getFrameDurations();
        this.j = by0Var.getLoopCount();
        this.r = by0Var.getFrameCount();
        boolean H = s0m.B().H();
        ouo y = s0m.B().y();
        if (y == null) {
            synchronized (cy0.class) {
                try {
                    if (G == null) {
                        G = new f57(null, 0, 3, 8, 5, 1500, 3, 0, 0);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            y = G;
        }
        this.A = new ay0(by0Var, y.e(), toString(), H);
    }

    public static /* synthetic */ Object ipc$super(cy0 cy0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/phenix/animate/AnimatedImageDrawable");
    }

    public static /* synthetic */ void l(cy0 cy0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab5357ce", new Object[]{cy0Var});
        } else {
            cy0Var.p();
        }
    }

    public void A(fy0 fy0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84ef367e", new Object[]{this, fy0Var});
        } else {
            this.m = fy0Var;
        }
    }

    public void B(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4742ebb3", new Object[]{this, new Integer(i)});
        } else {
            this.j = i;
        }
    }

    public void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else if (this.s != 0 && this.r >= 1) {
            this.u = true;
            scheduleSelf(this.n, SystemClock.uptimeMillis());
        }
    }

    public void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        this.t = false;
        this.u = false;
        o();
    }

    public final boolean E(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3cbe587d", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        Bitmap d = this.A.d(i);
        if (d == null) {
            return false;
        }
        Bitmap bitmap = this.k;
        if (bitmap != null) {
            this.A.c(bitmap);
        }
        this.k = d;
        int i3 = this.z;
        if (i2 - i3 > 1) {
            fiv.k("AnimatedImage", "%s dropped %d frames", this, Integer.valueOf((i2 - i3) - 1));
        }
        this.z = i2;
        return true;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i;
        Runnable runnable;
        boolean z;
        boolean z2;
        int i2;
        fy0 fy0Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        fiv.a("AnimatedImage", "%s start to draw, waiting=%b, playing=%b", this, Boolean.valueOf(this.B), Boolean.valueOf(this.u));
        this.F.removeCallbacks(this.q);
        if (this.B && (this.u || this.k == null)) {
            this.B = false;
            try {
                if (this.D >= 0) {
                    this.v = SystemClock.uptimeMillis() - this.C[this.D];
                }
                n(false, true);
                int i3 = this.x;
                int i4 = this.y;
                int i5 = this.z;
                boolean E = E(i3, i4);
                fiv.a("AnimatedImage", "%s drew frame=%d|%d, success=%B", this, Integer.valueOf(i3), Integer.valueOf(i4), Boolean.valueOf(E));
                if (E) {
                    if (this.D == i3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        this.D = -1;
                    }
                    int i6 = this.E;
                    int i7 = this.r;
                    int i8 = ((i4 + 1) / i7) + i6;
                    if (i8 != ((i5 + 1) / i7) + i6) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (((!(z && i6 == 0 && i4 == 0) && !z2) || (fy0Var = this.m) == null || fy0Var.onLoopCompleted(i8, this.j)) && (!z2 || (i2 = this.j) == 0 || i8 < i2)) {
                        n(true, true);
                    } else {
                        this.u = false;
                    }
                    if (!this.u) {
                        o();
                    }
                }
                boolean z3 = this.u;
                if (z3 || this.k == null) {
                    if (E) {
                        runnable = null;
                        i = 1;
                    } else {
                        runnable = this.p;
                        i = 0;
                    }
                    if (z3) {
                        this.A.j((i3 + i) % this.r, runnable);
                    } else {
                        this.A.i((i3 + i) % this.r, 1, runnable);
                    }
                }
            } catch (Throwable th) {
                fiv.c("AnimatedImage", "%s frame render error=%s", this, th);
            }
        }
        Bitmap bitmap = this.k;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, (Rect) null, getBounds(), (Paint) null);
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c2b8a1d0", new Object[]{this})).intValue();
        }
        return this.i;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2990b5b1", new Object[]{this})).intValue();
        }
        return this.h;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public int getOpacity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2242c5cf", new Object[]{this})).intValue();
        }
        return -3;
    }

    public final int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1b835c1a", new Object[]{this})).intValue();
        }
        this.C = new int[this.r];
        int i = 0;
        for (int i2 = 0; i2 < this.r; i2++) {
            int[] iArr = this.l;
            if (iArr[i2] < 11) {
                iArr[i2] = 100;
            }
            this.C[i2] = i;
            i += iArr[i2];
        }
        return i;
    }

    public final void n(boolean z, boolean z2) {
        int i;
        boolean z3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ff922a", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else if (this.s != 0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            long j = uptimeMillis - this.v;
            long j2 = this.s;
            int i2 = (int) (j / j2);
            int s = s((int) (j % j2));
            if (this.x != s) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.x = s;
            int i3 = this.r;
            this.y = (i2 * i3) + s;
            if (z) {
                if (z3) {
                    fiv.a("AnimatedImage", "%s schedule next frame changed to %d, drawing=%b, now=%d", this, Integer.valueOf(s), Boolean.valueOf(z2), Long.valueOf(uptimeMillis));
                    p();
                    return;
                }
                int i4 = (s + 1) % i3;
                long j3 = ((this.C[s] + this.l[s]) - i) + uptimeMillis + 10;
                long j4 = this.w;
                if (j4 == -1 || j4 > j3) {
                    fiv.a("AnimatedImage", "%s schedule next frame=%d at %d[last:%d], drawing=%b, now=%d", this, Integer.valueOf(i4), Long.valueOf(j3), Long.valueOf(this.w), Boolean.valueOf(z2), Long.valueOf(uptimeMillis));
                    unscheduleSelf(this.o);
                    scheduleSelf(this.o, j3);
                    this.w = j3;
                }
            }
        }
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8b790d7", new Object[]{this});
            return;
        }
        this.E = 0;
        this.A.b();
    }

    public final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6885d419", new Object[]{this});
            return;
        }
        this.B = true;
        this.F.removeCallbacks(this.q);
        this.F.postDelayed(this.q, 1000L);
        invalidateSelf();
    }

    public int q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d397d6ca", new Object[]{this})).intValue();
        }
        return this.s;
    }

    public int r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9bea4412", new Object[]{this})).intValue();
        }
        return this.r;
    }

    public final int s(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("84cdd90e", new Object[]{this, new Integer(i)})).intValue();
        }
        int binarySearch = Arrays.binarySearch(this.C, i);
        if (binarySearch < 0) {
            return (-binarySearch) - 2;
        }
        return binarySearch;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d144fec0", new Object[]{this, new Integer(i)});
        } else {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65fee558", new Object[]{this, colorFilter});
        } else {
            invalidateSelf();
        }
    }

    public Bitmap t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("30a5318a", new Object[]{this});
        }
        return this.k;
    }

    @Override // tb.dtl
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "AnimatedImageDrawable(" + Integer.toHexString(hashCode()) + ", key@" + e() + f7l.BRACKET_END_STR;
    }

    public boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a3f2a2f", new Object[]{this})).booleanValue();
        }
        return this.u;
    }

    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cccaca22", new Object[]{this});
            return;
        }
        this.w = -1L;
        if (this.u && this.s != 0 && this.r > 1) {
            n(true, false);
        }
    }

    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        } else if (this.u) {
            if (this.t) {
                this.D = this.x;
            } else {
                this.x = 0;
                this.y = 0;
                this.D = 0;
            }
            p();
        }
    }

    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7343dd", new Object[]{this});
            return;
        }
        unscheduleSelf(this.o);
        this.w = -1L;
        this.D = 0;
        this.z = 0;
        this.k = null;
        o();
        fiv.a("AnimatedImage", "%s timeout for draw, maybe terminate", this);
    }

    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
        } else {
            z(true);
        }
    }

    public void z(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa5ae2f7", new Object[]{this, new Boolean(z)});
            return;
        }
        this.t = true;
        this.u = false;
        if (z) {
            this.A.b();
        }
        this.E += (this.y + 1) / this.r;
    }
}
