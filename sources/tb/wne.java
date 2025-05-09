package tb;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.Size;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class wne extends yy1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final boolean d;
    public final boolean e;
    public final RectF f;
    public volatile int g;
    public int h;
    public final Integer[] i;
    public boolean j;
    public Bitmap.CompressFormat k;

    static {
        t2o.a(481297363);
    }

    public /* synthetic */ wne(boolean z, boolean z2, RectF rectF, int i, int i2, Integer[] numArr, int i3, a07 a07Var) {
        this((i3 & 1) != 0 ? true : z, (i3 & 2) == 0 ? z2 : true, (i3 & 4) != 0 ? null : rectF, (i3 & 8) != 0 ? 70 : i, (i3 & 16) != 0 ? 0 : i2, (i3 & 32) != 0 ? null : numArr);
    }

    public static /* synthetic */ Object ipc$super(wne wneVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/pipline/node/ImageProcessNode");
    }

    @Override // tb.yy1
    public String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5b5601d", new Object[]{this});
        }
        return av6.IMAGE_PROCESS_TAG;
    }

    public final String o(w7m w7mVar, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91aeef4c", new Object[]{this, w7mVar, bitmap});
        }
        String str = "";
        if (!this.e || bitmap == null) {
            return str;
        }
        str = gd2.c(bitmap, this.k, this.g);
        if (str == null) {
            str = str;
        }
        int M2 = lg4.M2();
        if (this.j && str.length() > M2) {
            float length = M2 / str.length();
            a("triggerSecondaryResize", ckf.p("resizeScale:", Float.valueOf(length)));
            bitmap = r(bitmap, (int) (this.h * length));
            String c = gd2.c(bitmap, this.k, this.g);
            if (c != null) {
                str = c;
            }
        }
        if (bitmap != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(bitmap.getWidth());
            sb.append('_');
            sb.append(bitmap.getHeight());
            String sb2 = sb.toString();
            a("resizeImgSize", sb2);
            pmf.r0(sb2);
            w7mVar.B(new Size(bitmap.getWidth(), bitmap.getHeight()));
        }
        a("base64Size", String.valueOf(str.length()));
        return str;
    }

    public final Bitmap r(Bitmap bitmap, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("8f0b2c0d", new Object[]{this, bitmap, new Integer(i)});
        }
        if (this.j) {
            return gd2.o(bitmap, i);
        }
        return gd2.m(bitmap, i);
    }

    public wne(boolean z, boolean z2, RectF rectF, int i, int i2, Integer[] numArr) {
        this.d = z;
        this.e = z2;
        this.f = rectF;
        this.g = i;
        this.h = i2;
        this.i = numArr;
        this.k = Bitmap.CompressFormat.JPEG;
    }

    public final String p(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("75095af6", new Object[]{this, bitmap});
        }
        String x3 = lg4.x3();
        ckf.f(x3, "getScreenShotSizeConfig()");
        List z0 = wsq.z0(x3, new String[]{"_"}, false, 0, 6, null);
        int i = 70;
        int i2 = 1200;
        if (z0.size() >= 3) {
            i2 = qrl.e((String) z0.get(0), 1200);
            i = qrl.e((String) z0.get(2), 70);
        }
        String c = gd2.c(gd2.o(bitmap, i2), this.k, i);
        return c == null ? "" : c;
    }

    public final void q(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c846706c", new Object[]{this, new Boolean(z)});
            return;
        }
        int u2 = lg4.u2();
        if (z) {
            String x3 = lg4.x3();
            ckf.f(x3, "getScreenShotSizeConfig()");
            List z0 = wsq.z0(x3, new String[]{"_"}, false, 0, 6, null);
            if (z0.size() < 3) {
                this.h = 640;
                this.g = u2;
                return;
            }
            this.h = qrl.e((String) z0.get(0), 1200);
            this.g = qrl.e((String) z0.get(2), 70);
            return;
        }
        String t2 = lg4.t2();
        if (ckf.b(t2, "V2")) {
            this.k = Bitmap.CompressFormat.WEBP;
            this.g = 70;
        } else if (ckf.b(t2, "V3")) {
            this.k = Bitmap.CompressFormat.WEBP;
            this.g = 85;
        } else {
            this.k = Bitmap.CompressFormat.JPEG;
            this.g = 70;
        }
        if (this.h <= 0) {
            this.h = 640;
        }
    }

    @Override // tb.yy1
    public x7m k(w7m w7mVar) {
        Bitmap bitmap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x7m) ipChange.ipc$dispatch("826f33b6", new Object[]{this, w7mVar});
        }
        ckf.g(w7mVar, "pipLineDS");
        if (this.i != null) {
            a("pageRebuild", "true");
            n();
            return f(new lre("", this.i));
        }
        Bitmap m = w7mVar.m();
        if (m == null) {
            m(-8, "需要处理的图片资源不存在");
            if (w7mVar.v()) {
                return f(null);
            }
            return yy1.e(this, -8, "需要处理的图片资源不存在", false, 4, null);
        }
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap copy = m.copy(config, m.isMutable());
        boolean x1 = lg4.x1();
        boolean s = w7mVar.s();
        this.j = s;
        if (x1) {
            q(false);
        } else {
            q(s);
        }
        pmf.j0(this.g);
        pmf.i0(this.h);
        pmf.h0(this.k.toString());
        StringBuilder sb = new StringBuilder();
        sb.append(this.h);
        sb.append('_');
        sb.append(this.g);
        sb.append('_');
        sb.append(this.k);
        a("resizeConfig", sb.toString());
        if (this.d) {
            if (x1) {
                bitmap = gd2.m(m, this.h);
            } else {
                bitmap = r(copy, this.h);
            }
            if (bitmap != null) {
                copy = bitmap;
            }
        }
        String o = o(w7mVar, copy);
        w7mVar.J(o);
        RectF rectF = this.f;
        if (rectF != null) {
            StringBuilder sb2 = new StringBuilder();
            float f = rectF.left;
            Size f2 = w7mVar.f();
            sb2.append((int) (f * (f2 == null ? 0 : f2.getWidth())));
            sb2.append(',');
            float f3 = rectF.right;
            Size f4 = w7mVar.f();
            sb2.append((int) (f3 * (f4 == null ? 0 : f4.getWidth())));
            sb2.append(',');
            float f5 = rectF.top;
            Size f6 = w7mVar.f();
            sb2.append((int) (f5 * (f6 == null ? 0 : f6.getHeight())));
            sb2.append(',');
            float f7 = rectF.bottom;
            Size f8 = w7mVar.f();
            sb2.append((int) (f7 * (f8 == null ? 0 : f8.getHeight())));
            w7mVar.N(sb2.toString());
        }
        n();
        pmf.f0(Long.valueOf(o.length()));
        pmf.q0(Long.valueOf(SystemClock.elapsedRealtime() - h()));
        if (this.j && x1) {
            Bitmap copy2 = m.copy(config, m.isMutable());
            ckf.f(copy2, "bitmap.copy(Bitmap.Confi…B_8888, bitmap.isMutable)");
            w7mVar.K(p(copy2));
        }
        Size f9 = w7mVar.f();
        Integer valueOf = Integer.valueOf(f9 == null ? 0 : f9.getWidth());
        Size f10 = w7mVar.f();
        return f(new lre(o, new Integer[]{valueOf, Integer.valueOf(f10 == null ? 0 : f10.getHeight())}));
    }
}
