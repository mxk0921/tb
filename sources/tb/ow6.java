package tb;

import android.graphics.BitmapFactory;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pexode.PexodeOptions;
import tb.p0m;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ow6 implements t97 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f25706a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public lp2 f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final ow6 f25707a = new ow6();

        static {
            t2o.a(618659845);
        }

        public static /* synthetic */ ow6 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ow6) ipChange.ipc$dispatch("dac9f0a3", new Object[0]);
            }
            return f25707a;
        }
    }

    static {
        t2o.a(618659844);
        t2o.a(618659859);
    }

    public static boolean b(PexodeOptions pexodeOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40273094", new Object[]{pexodeOptions})).booleanValue();
        }
        return pexodeOptions.cancelled;
    }

    public static ate d(PexodeOptions pexodeOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ate) ipChange.ipc$dispatch("50c74934", new Object[]{pexodeOptions});
        }
        return pexodeOptions.mIncrementalStaging;
    }

    public static int e(PexodeOptions pexodeOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("49a8f1a9", new Object[]{pexodeOptions})).intValue();
        }
        return pexodeOptions.lastSampleSize;
    }

    public static ow6 f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ow6) ipChange.ipc$dispatch("4e6b8cde", new Object[0]);
        }
        return a.a();
    }

    public static boolean l(q0m q0mVar, PexodeOptions pexodeOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56583948", new Object[]{q0mVar, pexodeOptions})).booleanValue();
        }
        if (pexodeOptions.cancelled || m(q0mVar, pexodeOptions)) {
            return true;
        }
        return false;
    }

    public static boolean m(q0m q0mVar, PexodeOptions pexodeOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("caba16ed", new Object[]{q0mVar, pexodeOptions})).booleanValue();
        }
        if (pexodeOptions.justDecodeBounds && pexodeOptions.isSizeAvailable()) {
            return true;
        }
        if (pexodeOptions.incrementalDecode && pexodeOptions.mIncrementalStaging != null) {
            return true;
        }
        if (q0mVar == null || (q0mVar.f26429a == null && q0mVar.b == null)) {
            return false;
        }
        return true;
    }

    public static void o(PexodeOptions pexodeOptions, ate ateVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a22812e", new Object[]{pexodeOptions, ateVar});
        } else {
            pexodeOptions.mIncrementalStaging = ateVar;
        }
    }

    public static void p(PexodeOptions pexodeOptions, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d801e681", new Object[]{pexodeOptions, new Integer(i)});
        } else {
            pexodeOptions.lastSampleSize = i;
        }
    }

    public static void q(PexodeOptions pexodeOptions, BitmapFactory.Options options) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("504a0609", new Object[]{pexodeOptions, options});
        } else {
            pexodeOptions.setUponSysOptions(options);
        }
    }

    public final int a(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fbe1afa6", new Object[]{this, new Integer(i), new Boolean(z)})).intValue();
        }
        return ((i << 1) + (z ? 1 : 0)) & 1023;
    }

    public final int c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2ddf9872", new Object[]{this, new Integer(i)})).intValue();
        }
        int i2 = (i - ((i >> 1) & (-613566757))) - ((i >> 2) & 1227133513);
        return ((-954437177) & (i2 + (i2 >> 3))) % 63;
    }

    public byte[] g(int i) {
        byte[] bArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("399dad30", new Object[]{this, new Integer(i)});
        }
        lp2 lp2Var = this.f;
        if (lp2Var != null) {
            bArr = lp2Var.a(i);
        } else {
            bArr = null;
        }
        if (bArr == null) {
            return new byte[i];
        }
        return bArr;
    }

    public synchronized void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("742d46c8", new Object[]{this, new Boolean(z)});
            return;
        }
        if (!this.b) {
            int a2 = a(this.d, z);
            this.d = a2;
            if (c(a2) >= 8) {
                this.b = true;
                xv8.k(p0m.TAG, "auto degrading to no ashmem, history=%d", Integer.valueOf(this.d));
                p0m.b j = p0m.j();
                if (j != null) {
                    j.f();
                }
            }
        }
    }

    public synchronized void i(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32cf3253", new Object[]{this, new Boolean(z)});
            return;
        }
        if (!this.f25706a) {
            int a2 = a(this.c, z);
            this.c = a2;
            if (c(a2) >= 8) {
                this.f25706a = true;
                xv8.k(p0m.TAG, "auto degrading to no inBitmap, history=%d", Integer.valueOf(this.c));
                p0m.b j = p0m.j();
                if (j != null) {
                    j.b();
                }
            }
        }
    }

    public synchronized void j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab1b179", new Object[]{this, new Boolean(z)});
            return;
        }
        if (!p0m.n()) {
            int a2 = a(this.e, z);
            this.e = a2;
            if (c(a2) >= 8) {
                p0m.h(true);
                p0m.b j = p0m.j();
                if (j != null) {
                    j.e();
                }
            }
        }
    }

    public void k(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4e07d32", new Object[]{this, bArr});
            return;
        }
        lp2 lp2Var = this.f;
        if (lp2Var != null) {
            lp2Var.b(bArr);
        }
    }

    public void n(lp2 lp2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("959e719b", new Object[]{this, lp2Var});
        } else {
            this.f = lp2Var;
        }
    }
}
