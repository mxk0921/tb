package tb;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pexode.animate.AnimatedDrawableFrameInfo;
import com.taobao.phenix.animate.AnimatedFrameCompositor;
import com.tencent.mm.opensdk.constants.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ay0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f16067a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public boolean g;
    public final huo h;
    public final SparseArray<a> i;
    public final List<Bitmap> j;
    public final AnimatedFrameCompositor k;
    public final String l;
    public final SparseArray<Runnable> m;
    public final buo n = new b(this);
    public final Handler f = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Bitmap f16068a;
        public int b = 0;

        static {
            t2o.a(Build.LAUNCH_MINIPROGRAM_SUPPORTED_SDK_INT);
        }

        public a(Bitmap bitmap) {
            this.f16068a = bitmap;
        }

        public static /* synthetic */ int a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("fb5db8f7", new Object[]{aVar})).intValue();
            }
            return aVar.b;
        }

        public static /* synthetic */ int b(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4cd9f9ef", new Object[]{aVar})).intValue();
            }
            int i = aVar.b;
            aVar.b = 1 + i;
            return i;
        }

        public static /* synthetic */ int c(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d71f34b8", new Object[]{aVar})).intValue();
            }
            int i = aVar.b;
            aVar.b = i - 1;
            return i;
        }

        public static /* synthetic */ Bitmap d(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bitmap) ipChange.ipc$dispatch("12d6cb41", new Object[]{aVar});
            }
            return aVar.f16068a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b extends buo {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private WeakReference<ay0> r;

        static {
            t2o.a(620757001);
        }

        public b(ay0 ay0Var) {
            super(1, null, null, false);
            this.r = new WeakReference<>(ay0Var);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/phenix/animate/AnimatedFramesBuffer$WeakDecodeAction");
        }

        @Override // tb.buo
        public void t(kk4 kk4Var, yto ytoVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c143d0b4", new Object[]{this, kk4Var, ytoVar});
                return;
            }
            ay0 ay0Var = this.r.get();
            if (ay0Var != null) {
                ay0.a(ay0Var);
            }
        }
    }

    static {
        t2o.a(620756999);
    }

    public ay0(by0 by0Var, huo huoVar, String str, boolean z) {
        this.l = str;
        int width = by0Var.getWidth();
        this.f16067a = width;
        int height = by0Var.getHeight();
        this.b = height;
        int frameCount = by0Var.getFrameCount();
        this.c = frameCount;
        int i = width * height;
        int i2 = 4;
        int i3 = i * 4;
        int max = Math.max(1, 5242880 / i3);
        int max2 = Math.max(1, 2097152 / i3);
        int min = Math.min(Math.max(1, frameCount), max);
        if (!z || s0m.B().X()) {
            this.d = min;
        } else {
            if (frameCount != 0 && max / frameCount >= 0.4d) {
                i2 = frameCount;
            } else if (max <= 4) {
                if (max < 2) {
                    i2 = 2;
                } else {
                    i2 = min;
                }
            }
            this.d = i2 > frameCount ? frameCount : i2;
        }
        int min2 = Math.min(Math.max(1, frameCount / 2), max2);
        this.e = min2;
        this.h = huoVar;
        this.i = new SparseArray<>(this.d);
        this.j = new ArrayList(min2);
        this.m = new SparseArray<>(this.d);
        this.k = new AnimatedFrameCompositor(by0Var, this, str);
    }

    public static /* synthetic */ void a(ay0 ay0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15e63865", new Object[]{ay0Var});
        } else {
            ay0Var.g();
        }
    }

    public synchronized void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64973187", new Object[]{this});
            return;
        }
        this.k.b();
        this.m.clear();
        this.i.clear();
        ((ArrayList) this.j).clear();
        fiv.a("AnimatedImage", "%s dropped frame caches", this.l);
    }

    public synchronized void c(Bitmap bitmap) {
        int i = 0;
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("469c16ac", new Object[]{this, bitmap});
                return;
            }
            int size = this.i.size();
            while (true) {
                if (i < size) {
                    a valueAt = this.i.valueAt(i);
                    if (valueAt != null && a.d(valueAt) == bitmap) {
                        a.c(valueAt);
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
            if (i == size) {
                h(bitmap);
            }
        }
    }

    public synchronized Bitmap d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("5a1a1a80", new Object[]{this, new Integer(i)});
        }
        a aVar = this.i.get(i);
        if (aVar == null) {
            return null;
        }
        a.b(aVar);
        return a.d(aVar);
    }

    public final boolean e(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d342a72", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)})).booleanValue();
        }
        if (i2 > i && i3 >= i && i3 < i2) {
            return true;
        }
        if (i2 > i || (i3 < i && i3 >= i2)) {
            return false;
        }
        return true;
    }

    public final a f(int i) {
        Bitmap bitmap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("db00aa6f", new Object[]{this, new Integer(i)});
        }
        synchronized (this) {
            try {
                if (((ArrayList) this.j).size() > 0) {
                    bitmap = (Bitmap) ((ArrayList) this.j).remove(0);
                } else {
                    bitmap = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bitmap == null && p0m.m()) {
            bitmap = qc1.a().c(this.f16067a, this.b, Bitmap.Config.ARGB_8888);
        }
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(this.f16067a, this.b, Bitmap.Config.ARGB_8888);
        }
        this.k.i(i, bitmap);
        return new a(bitmap);
    }

    public final void g() {
        int keyAt;
        Runnable valueAt;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4181dacf", new Object[]{this});
            return;
        }
        while (true) {
            synchronized (this) {
                try {
                    if (this.m.size() <= 0) {
                        this.g = false;
                        return;
                    }
                    keyAt = this.m.keyAt(0);
                    valueAt = this.m.valueAt(0);
                    this.m.removeAt(0);
                } catch (Throwable th) {
                    throw th;
                }
            }
            synchronized (this) {
                if (this.i.get(keyAt) == null) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                a f = f(keyAt);
                synchronized (this) {
                    this.i.put(keyAt, f);
                }
            }
            if (valueAt != null) {
                this.f.post(valueAt);
            }
        }
    }

    public final void h(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6359cc7", new Object[]{this, bitmap});
        } else if (((ArrayList) this.j).size() < this.e && bitmap != null && bitmap.isMutable() && bitmap.getWidth() == this.f16067a && bitmap.getHeight() == this.b && !((ArrayList) this.j).contains(bitmap)) {
            ((ArrayList) this.j).add(bitmap);
        }
    }

    public synchronized void i(int i, int i2, Runnable runnable) {
        boolean z;
        boolean z2;
        int i3;
        int i4 = -1;
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b912baf", new Object[]{this, new Integer(i), new Integer(i2), runnable});
                return;
            }
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            fpm.a(z);
            if (i2 > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            fpm.a(z2);
            int i5 = this.d;
            if (i2 > i5) {
                i2 = i5;
            }
            if (this.k.e(i).e == AnimatedDrawableFrameInfo.DisposalMode.DISPOSE_TO_PREVIOUS) {
                i3 = Math.max(0, i - 1);
            } else {
                i3 = i;
            }
            int i6 = i3;
            while (true) {
                if (i6 < 0) {
                    break;
                } else if (this.i.get(i6) != null) {
                    i4 = i6;
                    break;
                } else {
                    i6--;
                }
            }
            int i7 = (i3 + i2) % this.c;
            int i8 = 0;
            while (i8 < this.i.size()) {
                int keyAt = this.i.keyAt(i8);
                if (keyAt != i4 && !e(i3, i7, keyAt)) {
                    a valueAt = this.i.valueAt(i8);
                    this.i.removeAt(i8);
                    if (valueAt != null && a.a(valueAt) <= 0) {
                        h(a.d(valueAt));
                    }
                }
                i8++;
            }
            int i9 = 0;
            while (i9 < this.m.size()) {
                if (e(i3, i2, this.m.keyAt(i9))) {
                    i9++;
                } else {
                    this.m.removeAt(i9);
                }
            }
            for (int i10 = 0; i10 < i2; i10++) {
                int i11 = (i3 + i10) % this.c;
                if (this.i.get(i11) != null) {
                    if (i == i11) {
                        this.f.post(runnable);
                    }
                } else if (i == i11) {
                    this.m.put(i11, runnable);
                } else {
                    this.m.put(i11, null);
                }
            }
            if (!this.g) {
                this.g = true;
                this.h.a(this.n);
            }
        }
    }

    public void j(int i, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4250f10", new Object[]{this, new Integer(i), runnable});
        } else {
            i(i, this.d, runnable);
        }
    }
}
