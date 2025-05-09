package tb;

import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.request.ImageStatistics;
import com.taobao.phenix.request.a;
import com.taobao.tao.messagekit.base.network.AccsConnection;
import java.io.ByteArrayOutputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class zc2 extends fs1<uw6, uw6, a> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(620757007);
    }

    public zc2() {
        super(1, 2);
    }

    public static /* synthetic */ Object ipc$super(zc2 zc2Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/phenix/bitmap/BitmapProcessProducer");
    }

    public final byte[] P(a aVar, Bitmap bitmap, wd8 wd8Var) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("3f4770f6", new Object[]{this, aVar, bitmap, wd8Var});
        }
        bui g = wd8Var.g();
        if (Build.VERSION.SDK_INT != 28 || !s0m.S) {
            z = false;
        }
        if (g == null || z) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(AccsConnection.DATA_PACKAGE_MAX);
        if (z37.PNG.g(g) || z37.PNG_A.g(g)) {
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } else if (z37.JPEG.g(g)) {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } else if ((!z37.WEBP.g(g) && !z37.WEBP_A.g(g)) || !p0m.b(g)) {
            return null;
        } else {
            bitmap.compress(Bitmap.CompressFormat.WEBP, 100, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            bui buiVar = z37.WEBP_A;
            if (!buiVar.g(g) || buiVar.f(byteArray)) {
                return byteArray;
            }
            return null;
        }
    }

    /* renamed from: Q */
    public void K(kk4<uw6, a> kk4Var, boolean z, uw6 uw6Var) {
        Bitmap bitmap;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbaf58dd", new Object[]{this, kk4Var, new Boolean(z), uw6Var});
            return;
        }
        wd8 d = uw6Var.d();
        if (d == null || !uw6Var.f() || d.l != 4) {
            S(kk4Var, uw6Var, z);
            return;
        }
        a context = kk4Var.getContext();
        if (z) {
            t(kk4Var);
        }
        Bitmap b = uw6Var.b();
        if (context.Y().P) {
            bitmap = null;
        } else {
            bitmap = T(b, d);
        }
        if (bitmap != null) {
            if (bitmap != b) {
                b.recycle();
            }
            byte[] P = P(context, bitmap, d);
            if (P != null && P.length > 0) {
                d.release();
                d = d.e(new ud8(P, 0, P.length), 1, true);
            }
            uw6Var = new uw6(d, bitmap);
        }
        if (z) {
            if (bitmap == null) {
                z2 = false;
            }
            s(kk4Var, z2);
        }
        S(kk4Var, uw6Var, z);
    }

    public final void R(kk4<uw6, a> kk4Var) {
        ImageStatistics Y;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9dbf996", new Object[]{this, kk4Var});
        } else if (s0m.B().s() != null && (Y = kk4Var.getContext().Y()) != null && TextUtils.isEmpty(Y.s)) {
            Y.K = true;
            s0m.B().s().d(Y);
        }
    }

    public final Bitmap T(Bitmap bitmap, wd8 wd8Var) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("d1cb83cb", new Object[]{this, bitmap, wd8Var});
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width > height) {
            i2 = wd8Var.n;
            i = (height * i2) / width;
        } else {
            i = wd8Var.o;
            i2 = (width * i) / height;
        }
        fiv.c("Phenix", "BitmapProcessProducer outWidth " + i2 + ", outHeight " + i + ", actualW " + width + ", actualH " + height + ", path = " + wd8Var.i, new Object[0]);
        if (width <= i2 && height <= i) {
            return null;
        }
        try {
            return Bitmap.createScaledBitmap(bitmap, i2, i, true);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // tb.oh3
    public boolean c(kk4<uw6, a> kk4Var) {
        Bitmap bitmap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3214a19", new Object[]{this, kk4Var})).booleanValue();
        }
        if (s0m.B().R() || !s0m.B().g0()) {
            return false;
        }
        a context = kk4Var.getContext();
        String L = context.L();
        String str = context.Y().t;
        String N = kk4Var.getContext().N();
        if (s0m.B().h0() && "32001".equals(str)) {
            bitmap = jcu.f().e(str, L);
        } else if (s0m.B().b0()) {
            bitmap = f2b.h().g(kk4Var.getContext().W(), context.L());
            if (bitmap != null) {
                fiv.q("Phenix", "BitmapProcessProducer hit local cache from HomePageCacheManager " + context.W() + ", " + context.L(), context, true);
            }
        } else {
            bitmap = us2.e().d(N, L);
            if (bitmap != null) {
                fiv.q("Phenix", "BitmapProcessProducer hit local cache from CacheManager " + N + ", " + context.L(), context, true);
            }
        }
        if (bitmap == null) {
            return false;
        }
        if (bitmap.isRecycled()) {
            fiv.q("Phenix", "BitmapProcessProducer bitmap is recycle " + context.W() + ", " + context.L(), context, true);
            return false;
        }
        uw6 uw6Var = new uw6(null, q0m.a(bitmap).f26429a);
        context.Y().b(ImageStatistics.FromType.FROM_FAST_DISK_CACHE);
        R(kk4Var);
        kk4Var.c(uw6Var, true);
        if (!s0m.B().h0() || !TextUtils.equals("32001", context.Y().t)) {
            us2.e().j(N, context.L(), bitmap);
        } else {
            jcu.f().j(str, context.L(), bitmap);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void S(tb.kk4<tb.uw6, com.taobao.phenix.request.a> r13, tb.uw6 r14, boolean r15) {
        /*
            r12 = this;
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = tb.zc2.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0020
            java.lang.Boolean r3 = new java.lang.Boolean
            r3.<init>(r15)
            r15 = 4
            java.lang.Object[] r15 = new java.lang.Object[r15]
            r15[r0] = r12
            r15[r1] = r13
            r13 = 2
            r15[r13] = r14
            r13 = 3
            r15[r13] = r3
            java.lang.String r13 = "3e976df0"
            r2.ipc$dispatch(r13, r15)
            return
        L_0x0020:
            java.lang.Object r2 = r13.getContext()
            com.taobao.phenix.request.a r2 = (com.taobao.phenix.request.a) r2
            tb.wd8 r3 = r14.d()
            boolean r4 = r2.L0()
            r12.v(r13, r15)
            if (r15 != 0) goto L_0x0035
            if (r4 == 0) goto L_0x007e
        L_0x0035:
            boolean r4 = r14.f()
            if (r4 == 0) goto L_0x007e
            android.graphics.Bitmap r4 = r14.b()
            tb.ad2[] r5 = r2.A()
            if (r5 == 0) goto L_0x0071
            int r6 = r5.length
            if (r6 <= 0) goto L_0x0071
            int r6 = r5.length
            r8 = r4
            r7 = 0
        L_0x004b:
            if (r7 >= r6) goto L_0x0072
            r9 = r5[r7]
            if (r9 != 0) goto L_0x0052
            goto L_0x006f
        L_0x0052:
            java.lang.String r10 = r2.O()
            tb.cd2 r11 = tb.cd2.b()
            android.graphics.Bitmap r8 = r9.process(r10, r11, r8)
            if (r8 != 0) goto L_0x006f
            r14.release()
            java.lang.Throwable r14 = new java.lang.Throwable
            java.lang.String r15 = "processed result bitmap cannot be null!"
            r14.<init>(r15)
            r13.a(r14)
            return
        L_0x006f:
            int r7 = r7 + r1
            goto L_0x004b
        L_0x0071:
            r8 = r4
        L_0x0072:
            if (r4 == r8) goto L_0x007e
            tb.uw6 r4 = new tb.uw6
            tb.wd8 r5 = r14.d()
            r4.<init>(r5, r8)
            goto L_0x007f
        L_0x007e:
            r4 = r14
        L_0x007f:
            if (r4 == r14) goto L_0x0082
            r0 = 1
        L_0x0082:
            r12.u(r13, r0, r15)
            r13.c(r4, r15)
            tb.s0m r14 = tb.s0m.B()
            boolean r14 = r14.g0()
            if (r14 == 0) goto L_0x00ff
            if (r3 == 0) goto L_0x00ff
            tb.s0m r14 = tb.s0m.B()
            boolean r14 = r14.h0()
            if (r14 == 0) goto L_0x00c2
            com.taobao.phenix.request.ImageStatistics r14 = r2.Y()
            java.lang.String r14 = r14.t
            java.lang.String r15 = "32001"
            boolean r14 = android.text.TextUtils.equals(r15, r14)
            if (r14 == 0) goto L_0x00c2
            tb.jcu r13 = tb.jcu.f()
            com.taobao.phenix.request.ImageStatistics r14 = r2.Y()
            java.lang.String r14 = r14.t
            java.lang.String r15 = r2.L()
            android.graphics.Bitmap r0 = r4.b()
            r13.j(r14, r15, r0)
            goto L_0x00ff
        L_0x00c2:
            tb.s0m r14 = tb.s0m.B()
            boolean r14 = r14.b0()
            if (r14 == 0) goto L_0x00e6
            tb.f2b r14 = tb.f2b.h()
            java.lang.Object r13 = r13.getContext()
            com.taobao.phenix.request.a r13 = (com.taobao.phenix.request.a) r13
            java.lang.String r13 = r13.W()
            java.lang.String r15 = r2.L()
            android.graphics.Bitmap r0 = r4.b()
            r14.m(r13, r15, r0)
            goto L_0x00ff
        L_0x00e6:
            tb.us2 r14 = tb.us2.e()
            java.lang.Object r13 = r13.getContext()
            com.taobao.phenix.request.a r13 = (com.taobao.phenix.request.a) r13
            java.lang.String r13 = r13.N()
            java.lang.String r15 = r2.L()
            android.graphics.Bitmap r0 = r4.b()
            r14.j(r13, r15, r0)
        L_0x00ff:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.zc2.S(tb.kk4, tb.uw6, boolean):void");
    }
}
