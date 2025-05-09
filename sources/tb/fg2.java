package tb;

import android.graphics.Bitmap;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.alibaba.security.realidentity.f2;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;
import kotlin.Metadata;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class fg2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final fg2 INSTANCE = new fg2();

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f19266a;
        public final /* synthetic */ Bitmap b;
        public final /* synthetic */ int c;

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        /* renamed from: tb.fg2$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static final class RunnableC0927a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ b f19267a;
            public final /* synthetic */ Bitmap b;

            public RunnableC0927a(b bVar, Bitmap bitmap) {
                this.f19267a = bVar;
                this.b = bitmap;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    this.f19267a.a(this.b);
                }
            }
        }

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static final class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ b f19268a;
            public final /* synthetic */ Bitmap b;

            public b(b bVar, Bitmap bitmap) {
                this.f19268a = bVar;
                this.b = bitmap;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    this.f19268a.a(this.b);
                }
            }
        }

        public a(b bVar, Bitmap bitmap, int i) {
            this.f19266a = bVar;
            this.b = bitmap;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.f19266a != null) {
                try {
                    fg2 fg2Var = fg2.INSTANCE;
                    fg2.a(fg2Var, new RunnableC0927a(this.f19266a, fg2Var.c(this.b, this.c)));
                } catch (Exception e) {
                    fg2.a(fg2.INSTANCE, new b(this.f19266a, this.b));
                    TMSLogger.c("blur failed,return original image.", "", e);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface b {
        void a(Bitmap bitmap);
    }

    static {
        t2o.a(837812320);
    }

    public static final /* synthetic */ void a(fg2 fg2Var, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83b1dafe", new Object[]{fg2Var, runnable});
        } else {
            fg2Var.e(runnable);
        }
    }

    public final void b(Bitmap bitmap, int i, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82a9bb11", new Object[]{this, bitmap, new Integer(i), bVar});
            return;
        }
        ckf.g(bitmap, f2.i);
        ((IExecutorService) p8s.g(IExecutorService.class)).getExecutor(ExecutorType.URGENT).execute(new a(bVar, bitmap, i));
    }

    public final double d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5130e9fd", new Object[]{this, new Integer(i)})).doubleValue();
        }
        if (i <= 3) {
            return 0.5d;
        }
        if (i <= 8) {
            return 0.25d;
        }
        return 0.125d;
    }

    public final void e(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd609e25", new Object[]{this, runnable});
        } else {
            ((IExecutorService) p8s.g(IExecutorService.class)).getExecutor(ExecutorType.UI).execute(runnable);
        }
    }

    public final Bitmap c(Bitmap bitmap, int i) {
        int i2;
        Exception e;
        Bitmap bitmap2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("89a27061", new Object[]{this, bitmap, new Integer(i)});
        }
        ckf.g(bitmap, f2.i);
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
            int i3 = 0;
            int i4 = min;
            while (i3 < 3) {
                i3++;
                if (i4 == 0) {
                    return bitmap;
                }
                try {
                    double d4 = d(i4);
                    if (d4 == d) {
                        i2 = i3;
                        bitmap2 = createScaledBitmap;
                    } else {
                        i2 = i3;
                        try {
                            bitmap2 = Bitmap.createScaledBitmap(bitmap, (int) (d4 * d2), (int) (d4 * d3), true);
                            d = d4;
                        } catch (Exception e2) {
                            e = e2;
                            createScaledBitmap = createScaledBitmap;
                            d = d4;
                            TMSLogger.c("BlurTool", "thrown exception when blurred image(times = " + i2 + "),", e);
                            i4 = Math.max(0, i4 + (-1));
                            currentTimeMillis = currentTimeMillis;
                        }
                    }
                    try {
                        ckf.f(bitmap2, "sampledImage");
                        Bitmap f = f(bitmap2, i4, false);
                        ckf.d(f);
                        TMSLogger.a("BlurTool", "elapsed time on blurring image(radius:" + i4 + ",sampling: " + d + "): " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
                        return f;
                    } catch (Exception e3) {
                        e = e3;
                        createScaledBitmap = bitmap2;
                        TMSLogger.c("BlurTool", "thrown exception when blurred image(times = " + i2 + "),", e);
                        i4 = Math.max(0, i4 + (-1));
                        currentTimeMillis = currentTimeMillis;
                    }
                } catch (Exception e4) {
                    e = e4;
                    i2 = i3;
                    createScaledBitmap = createScaledBitmap;
                }
            }
            TMSLogger.a("BlurTool", "elapsed time on blurring image(radius:" + i4 + ",sampling: " + d + "): " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
        }
        return bitmap;
    }

    public final Bitmap f(Bitmap bitmap, int i, boolean z) {
        Bitmap bitmap2 = bitmap;
        int i2 = i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("ff2344e7", new Object[]{this, bitmap2, new Integer(i2), new Boolean(z)});
        }
        ckf.g(bitmap2, "sentBitmap");
        if (!z) {
            bitmap2 = bitmap2.copy(bitmap.getConfig(), true);
            ckf.f(bitmap2, "{\n            sentBitmap…p.config, true)\n        }");
        }
        if (i2 < 1) {
            return null;
        }
        int width = bitmap2.getWidth();
        int height = bitmap2.getHeight();
        int i3 = width * height;
        int[] iArr = new int[i3];
        bitmap2.getPixels(iArr, 0, width, 0, 0, width, height);
        int i4 = width - 1;
        int i5 = height - 1;
        int i6 = i2 + i2;
        int i7 = i6 + 1;
        int[] iArr2 = new int[i3];
        int[] iArr3 = new int[i3];
        int[] iArr4 = new int[i3];
        int[] iArr5 = new int[Math.max(width, height)];
        int i8 = (i6 + 2) >> 1;
        int i9 = i8 * i8;
        int i10 = i9 * 256;
        int[] iArr6 = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr6[i11] = i11 / i9;
        }
        int[][] iArr7 = new int[i7];
        int i12 = 0;
        while (i12 < i7) {
            iArr7[i12] = new int[3];
            i12++;
            bitmap2 = bitmap2;
        }
        int i13 = i2 + 1;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i14 < height) {
            int i17 = -i2;
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            int i25 = 0;
            int i26 = 0;
            while (i17 <= i2) {
                int i27 = iArr[Math.min(i4, Math.max(i17, 0)) + i15];
                int[] iArr8 = iArr7[i17 + i2];
                iArr8[0] = (i27 & ItemTouchHelper.ACTION_MODE_DRAG_MASK) >> 16;
                iArr8[1] = (i27 & 65280) >> 8;
                iArr8[2] = i27 & 255;
                int abs = i13 - Math.abs(i17);
                int i28 = iArr8[0];
                i18 += i28 * abs;
                int i29 = iArr8[1];
                i19 += i29 * abs;
                int i30 = iArr8[2];
                i20 += abs * i30;
                if (i17 > 0) {
                    i24 += i28;
                    i25 += i29;
                    i26 += i30;
                } else {
                    i21 += i28;
                    i22 += i29;
                    i23 += i30;
                }
                i17++;
                height = height;
                i5 = i5;
            }
            int i31 = i2;
            for (int i32 = 0; i32 < width; i32++) {
                iArr2[i15] = iArr6[i18];
                iArr3[i15] = iArr6[i19];
                iArr4[i15] = iArr6[i20];
                int i33 = i18 - i21;
                int i34 = i19 - i22;
                int i35 = i20 - i23;
                int[] iArr9 = iArr7[((i31 - i2) + i7) % i7];
                int i36 = i21 - iArr9[0];
                int i37 = i22 - iArr9[1];
                int i38 = i23 - iArr9[2];
                if (i14 == 0) {
                    iArr6 = iArr6;
                    iArr5[i32] = Math.min(i32 + i2 + 1, i4);
                } else {
                    iArr6 = iArr6;
                }
                int i39 = iArr[i16 + iArr5[i32]];
                int i40 = (i39 & ItemTouchHelper.ACTION_MODE_DRAG_MASK) >> 16;
                iArr9[0] = i40;
                int i41 = (i39 & 65280) >> 8;
                iArr9[1] = i41;
                int i42 = i39 & 255;
                iArr9[2] = i42;
                int i43 = i24 + i40;
                int i44 = i25 + i41;
                int i45 = i26 + i42;
                i18 = i33 + i43;
                i19 = i34 + i44;
                i20 = i35 + i45;
                i31 = (i31 + 1) % i7;
                int[] iArr10 = iArr7[i31 % i7];
                int i46 = iArr10[0];
                i21 = i36 + i46;
                int i47 = iArr10[1];
                i22 = i37 + i47;
                int i48 = iArr10[2];
                i23 = i38 + i48;
                i24 = i43 - i46;
                i25 = i44 - i47;
                i26 = i45 - i48;
                i15++;
            }
            i16 += width;
            i14++;
            height = height;
            i5 = i5;
        }
        int i49 = i5;
        int i50 = height;
        int i51 = 0;
        while (i51 < width) {
            int i52 = -i2;
            int i53 = i52 * width;
            int i54 = 0;
            int i55 = 0;
            int i56 = 0;
            int i57 = 0;
            int i58 = 0;
            int i59 = 0;
            int i60 = 0;
            int i61 = 0;
            int i62 = 0;
            while (i52 <= i2) {
                int max = Math.max(0, i53) + i51;
                int[] iArr11 = iArr7[i52 + i2];
                iArr11[0] = iArr2[max];
                iArr11[1] = iArr3[max];
                iArr11[2] = iArr4[max];
                int abs2 = i13 - Math.abs(i52);
                i54 += iArr2[max] * abs2;
                i55 += iArr3[max] * abs2;
                i56 += iArr4[max] * abs2;
                if (i52 > 0) {
                    i60 += iArr11[0];
                    i61 += iArr11[1];
                    i62 += iArr11[2];
                } else {
                    i57 += iArr11[0];
                    i58 += iArr11[1];
                    i59 += iArr11[2];
                }
                if (i52 < i49) {
                    i53 += width;
                }
                i52++;
                i49 = i49;
                iArr5 = iArr5;
            }
            int i63 = i2;
            int i64 = i51;
            int i65 = 0;
            while (i65 < i50) {
                iArr[i64] = (iArr[i64] & (-16777216)) | (iArr6[i54] << 16) | (iArr6[i55] << 8) | iArr6[i56];
                int i66 = i54 - i57;
                int i67 = i55 - i58;
                int i68 = i56 - i59;
                int[] iArr12 = iArr7[((i63 - i2) + i7) % i7];
                int i69 = i57 - iArr12[0];
                int i70 = i58 - iArr12[1];
                int i71 = i59 - iArr12[2];
                if (i51 == 0) {
                    iArr5[i65] = Math.min(i65 + i13, i49) * width;
                }
                int i72 = iArr5[i65] + i51;
                int i73 = iArr2[i72];
                iArr12[0] = i73;
                int i74 = iArr3[i72];
                iArr12[1] = i74;
                int i75 = iArr4[i72];
                iArr12[2] = i75;
                int i76 = i60 + i73;
                int i77 = i61 + i74;
                int i78 = i62 + i75;
                i54 = i66 + i76;
                i55 = i67 + i77;
                i56 = i68 + i78;
                i63 = (i63 + 1) % i7;
                int[] iArr13 = iArr7[i63];
                int i79 = iArr13[0];
                i57 = i69 + i79;
                int i80 = iArr13[1];
                i58 = i70 + i80;
                int i81 = iArr13[2];
                i59 = i71 + i81;
                i60 = i76 - i79;
                i61 = i77 - i80;
                i62 = i78 - i81;
                i64 += width;
                i65++;
                i2 = i;
            }
            i51++;
            i2 = i;
            i50 = i50;
            i49 = i49;
            iArr5 = iArr5;
        }
        bitmap2.setPixels(iArr, 0, width, 0, 0, width, i50);
        return bitmap2;
    }
}
