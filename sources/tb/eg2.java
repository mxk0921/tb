package tb;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.utils.WXLogUtils;
import java.lang.reflect.Array;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class eg2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final ExecutorService f18548a = Executors.newCachedThreadPool(new a());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            return new Thread(runnable, "wx_blur_thread");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f18549a;
        public final /* synthetic */ Bitmap b;
        public final /* synthetic */ int c;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Bitmap f18550a;

            public a(Bitmap bitmap) {
                this.f18550a = bitmap;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    b.this.f18549a.a(this.f18550a);
                }
            }
        }

        /* compiled from: Taobao */
        /* renamed from: tb.eg2$b$b  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class RunnableC0915b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0915b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                b bVar = b.this;
                bVar.f18549a.a(bVar.b);
            }
        }

        public b(c cVar, Bitmap bitmap, int i) {
            this.f18549a = cVar;
            this.b = bitmap;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.f18549a != null) {
                try {
                    eg2.a(new a(eg2.c(this.b, this.c)));
                } catch (Exception unused) {
                    eg2.a(new RunnableC0915b());
                    WXLogUtils.e("blur failed,return original image.");
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface c {
        void a(Bitmap bitmap);
    }

    static {
        t2o.a(85983293);
    }

    public static /* synthetic */ void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46159075", new Object[]{runnable});
        } else {
            e(runnable);
        }
    }

    public static void b(Bitmap bitmap, int i, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9cd5cf9", new Object[]{bitmap, new Integer(i), cVar});
        } else {
            f18548a.execute(new b(cVar, bitmap, i));
        }
    }

    public static double d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5130e9fd", new Object[]{new Integer(i)})).doubleValue();
        }
        if (i <= 3) {
            return 0.5d;
        }
        if (i <= 8) {
            return 0.25d;
        }
        return 0.125d;
    }

    public static void e(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd609e25", new Object[]{runnable});
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    public static Bitmap f(Bitmap bitmap, int i, boolean z) {
        int[] iArr;
        Bitmap bitmap2 = bitmap;
        int i2 = i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("ff2344e7", new Object[]{bitmap2, new Integer(i2), new Boolean(z)});
        }
        if (!z) {
            bitmap2 = bitmap2.copy(bitmap.getConfig(), true);
        }
        if (i2 < 1) {
            return null;
        }
        int width = bitmap2.getWidth();
        int height = bitmap2.getHeight();
        int i3 = width * height;
        int[] iArr2 = new int[i3];
        bitmap2.getPixels(iArr2, 0, width, 0, 0, width, height);
        int i4 = width - 1;
        int i5 = height - 1;
        int i6 = i2 + i2;
        int i7 = i6 + 1;
        int[] iArr3 = new int[i3];
        int[] iArr4 = new int[i3];
        int[] iArr5 = new int[i3];
        int[] iArr6 = new int[Math.max(width, height)];
        int i8 = (i6 + 2) >> 1;
        int i9 = i8 * i8;
        int i10 = i9 * 256;
        int[] iArr7 = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr7[i11] = i11 / i9;
        }
        int[][] iArr8 = (int[][]) Array.newInstance(Integer.TYPE, i7, 3);
        int i12 = i2 + 1;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < height) {
            int i16 = -i2;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            int i25 = 0;
            while (i16 <= i2) {
                int i26 = iArr2[i14 + Math.min(i4, Math.max(i16, 0))];
                int[] iArr9 = iArr8[i16 + i2];
                iArr9[0] = (i26 & ItemTouchHelper.ACTION_MODE_DRAG_MASK) >> 16;
                iArr9[1] = (i26 & 65280) >> 8;
                iArr9[2] = i26 & 255;
                int abs = i12 - Math.abs(i16);
                int i27 = iArr9[0];
                i17 += i27 * abs;
                int i28 = iArr9[1];
                i18 += i28 * abs;
                int i29 = iArr9[2];
                i19 += abs * i29;
                if (i16 > 0) {
                    i23 += i27;
                    i24 += i28;
                    i25 += i29;
                } else {
                    i20 += i27;
                    i21 += i28;
                    i22 += i29;
                }
                i16++;
                bitmap2 = bitmap2;
                height = height;
            }
            int i30 = i2;
            int i31 = 0;
            while (i31 < width) {
                iArr3[i14] = iArr7[i17];
                iArr4[i14] = iArr7[i18];
                iArr5[i14] = iArr7[i19];
                int i32 = i17 - i20;
                int i33 = i18 - i21;
                int i34 = i19 - i22;
                int[] iArr10 = iArr8[((i30 - i2) + i7) % i7];
                int i35 = i20 - iArr10[0];
                int i36 = i21 - iArr10[1];
                int i37 = i22 - iArr10[2];
                if (i13 == 0) {
                    iArr = iArr7;
                    iArr6[i31] = Math.min(i31 + i2 + 1, i4);
                } else {
                    iArr = iArr7;
                }
                int i38 = iArr2[i15 + iArr6[i31]];
                int i39 = (i38 & ItemTouchHelper.ACTION_MODE_DRAG_MASK) >> 16;
                iArr10[0] = i39;
                int i40 = (i38 & 65280) >> 8;
                iArr10[1] = i40;
                int i41 = i38 & 255;
                iArr10[2] = i41;
                int i42 = i23 + i39;
                int i43 = i24 + i40;
                int i44 = i25 + i41;
                i17 = i32 + i42;
                i18 = i33 + i43;
                i19 = i34 + i44;
                i30 = (i30 + 1) % i7;
                int[] iArr11 = iArr8[i30 % i7];
                int i45 = iArr11[0];
                i20 = i35 + i45;
                int i46 = iArr11[1];
                i21 = i36 + i46;
                int i47 = iArr11[2];
                i22 = i37 + i47;
                i23 = i42 - i45;
                i24 = i43 - i46;
                i25 = i44 - i47;
                i14++;
                i31++;
                iArr7 = iArr;
            }
            i15 += width;
            i13++;
            bitmap2 = bitmap2;
            height = height;
        }
        int i48 = height;
        int i49 = 0;
        while (i49 < width) {
            int i50 = -i2;
            int i51 = i50 * width;
            int i52 = 0;
            int i53 = 0;
            int i54 = 0;
            int i55 = 0;
            int i56 = 0;
            int i57 = 0;
            int i58 = 0;
            int i59 = 0;
            int i60 = 0;
            while (i50 <= i2) {
                int max = Math.max(0, i51) + i49;
                int[] iArr12 = iArr8[i50 + i2];
                iArr12[0] = iArr3[max];
                iArr12[1] = iArr4[max];
                iArr12[2] = iArr5[max];
                int abs2 = i12 - Math.abs(i50);
                i52 += iArr3[max] * abs2;
                i53 += iArr4[max] * abs2;
                i54 += iArr5[max] * abs2;
                if (i50 > 0) {
                    i58 += iArr12[0];
                    i59 += iArr12[1];
                    i60 += iArr12[2];
                } else {
                    i55 += iArr12[0];
                    i56 += iArr12[1];
                    i57 += iArr12[2];
                }
                if (i50 < i5) {
                    i51 += width;
                }
                i50++;
                iArr6 = iArr6;
            }
            int i61 = i49;
            int i62 = i2;
            int i63 = 0;
            while (i63 < i48) {
                iArr2[i61] = (iArr2[i61] & (-16777216)) | (iArr7[i52] << 16) | (iArr7[i53] << 8) | iArr7[i54];
                int i64 = i52 - i55;
                int i65 = i53 - i56;
                int i66 = i54 - i57;
                int[] iArr13 = iArr8[((i62 - i2) + i7) % i7];
                int i67 = i55 - iArr13[0];
                int i68 = i56 - iArr13[1];
                int i69 = i57 - iArr13[2];
                if (i49 == 0) {
                    iArr6[i63] = Math.min(i63 + i12, i5) * width;
                }
                int i70 = iArr6[i63] + i49;
                int i71 = iArr3[i70];
                iArr13[0] = i71;
                int i72 = iArr4[i70];
                iArr13[1] = i72;
                int i73 = iArr5[i70];
                iArr13[2] = i73;
                int i74 = i58 + i71;
                int i75 = i59 + i72;
                int i76 = i60 + i73;
                i52 = i64 + i74;
                i53 = i65 + i75;
                i54 = i66 + i76;
                i62 = (i62 + 1) % i7;
                int[] iArr14 = iArr8[i62];
                int i77 = iArr14[0];
                i55 = i67 + i77;
                int i78 = iArr14[1];
                i56 = i68 + i78;
                int i79 = iArr14[2];
                i57 = i69 + i79;
                i58 = i74 - i77;
                i59 = i75 - i78;
                i60 = i76 - i79;
                i61 += width;
                i63++;
                i2 = i;
            }
            i49++;
            i2 = i;
            i48 = i48;
            iArr6 = iArr6;
        }
        bitmap2.setPixels(iArr2, 0, width, 0, 0, width, i48);
        return bitmap2;
    }

    public static Bitmap c(Bitmap bitmap, int i) {
        String str;
        Exception e;
        Bitmap f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("89a27061", new Object[]{bitmap, new Integer(i)});
        }
        long currentTimeMillis = System.currentTimeMillis();
        int min = Math.min(10, Math.max(0, i));
        if (min == 0) {
            return bitmap;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width > 0 && height > 0) {
            double d = d(min);
            double d2 = width;
            double d3 = height;
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (d * d2), (int) (d * d3), true);
            int i2 = min;
            for (int i3 = 0; i3 < 3; i3++) {
                if (i2 == 0) {
                    return bitmap;
                }
                try {
                    double d4 = d(i2);
                    if (d4 != d) {
                        try {
                            createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (d4 * d2), (int) (d4 * d3), true);
                            d = d4;
                        } catch (Exception e2) {
                            e = e2;
                            createScaledBitmap = createScaledBitmap;
                            d = d4;
                            d2 = d2;
                            str = "BlurTool";
                            WXLogUtils.e(str, "thrown exception when blurred image(times = " + i3 + ")," + e.getMessage());
                            i2 = Math.max(0, i2 + (-1));
                        }
                    } else {
                        createScaledBitmap = createScaledBitmap;
                    }
                    d2 = d2;
                } catch (Exception e3) {
                    e = e3;
                    d2 = d2;
                    str = "BlurTool";
                    createScaledBitmap = createScaledBitmap;
                }
                try {
                    f = f(createScaledBitmap, i2, false);
                    str = "BlurTool";
                } catch (Exception e4) {
                    e = e4;
                    str = "BlurTool";
                    WXLogUtils.e(str, "thrown exception when blurred image(times = " + i3 + ")," + e.getMessage());
                    i2 = Math.max(0, i2 + (-1));
                }
                try {
                    WXLogUtils.d(str, "elapsed time on blurring image(radius:" + i2 + ",sampling: " + d + "): " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
                    return f;
                } catch (Exception e5) {
                    e = e5;
                    WXLogUtils.e(str, "thrown exception when blurred image(times = " + i3 + ")," + e.getMessage());
                    i2 = Math.max(0, i2 + (-1));
                }
            }
            WXLogUtils.d("BlurTool", "elapsed time on blurring image(radius:" + i2 + ",sampling: " + d + "): " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
        }
        return bitmap;
    }
}
