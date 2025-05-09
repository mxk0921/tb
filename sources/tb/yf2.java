package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.renderscript.RSRuntimeException;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pexode.PexodeOptions;
import com.taobao.phenix.compat.effects.internal.NdkCore;
import java.lang.reflect.Array;
import tb.ad2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class yf2 implements ad2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f32037a;
    public final int b;
    public final int c;

    public yf2(Context context) {
        this(context, 25, 1);
    }

    public static Bitmap a(Bitmap bitmap, int i, boolean z) {
        int[] iArr;
        Bitmap bitmap2 = bitmap;
        int i2 = i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("d84f9e67", new Object[]{bitmap2, new Integer(i2), new Boolean(z)});
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.renderscript.BaseObj, android.renderscript.ScriptIntrinsicBlur] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap b(android.content.Context r5, android.graphics.Bitmap r6, int r7) throws android.renderscript.RSRuntimeException {
        /*
            r0 = 1
            com.android.alibaba.ip.runtime.IpChange r1 = tb.yf2.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0020
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r7)
            r7 = 3
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r3 = 0
            r7[r3] = r5
            r7[r0] = r6
            r5 = 2
            r7[r5] = r2
            java.lang.String r5 = "f116af26"
            java.lang.Object r5 = r1.ipc$dispatch(r5, r7)
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            return r5
        L_0x0020:
            r1 = 0
            android.renderscript.RenderScript r5 = android.renderscript.RenderScript.create(r5)     // Catch: all -> 0x006b
            android.renderscript.RenderScript$RSMessageHandler r2 = new android.renderscript.RenderScript$RSMessageHandler     // Catch: all -> 0x0067
            r2.<init>()     // Catch: all -> 0x0067
            r5.setMessageHandler(r2)     // Catch: all -> 0x0067
            android.renderscript.Allocation$MipmapControl r2 = android.renderscript.Allocation.MipmapControl.MIPMAP_NONE     // Catch: all -> 0x0067
            android.renderscript.Allocation r0 = android.renderscript.Allocation.createFromBitmap(r5, r6, r2, r0)     // Catch: all -> 0x0067
            android.renderscript.Type r2 = r0.getType()     // Catch: all -> 0x0062
            android.renderscript.Allocation r2 = android.renderscript.Allocation.createTyped(r5, r2)     // Catch: all -> 0x0062
            android.renderscript.Element r3 = android.renderscript.Element.U8_4(r5)     // Catch: all -> 0x005d
            android.renderscript.ScriptIntrinsicBlur r1 = android.renderscript.ScriptIntrinsicBlur.create(r5, r3)     // Catch: all -> 0x005d
            r1.setInput(r0)     // Catch: all -> 0x005d
            float r7 = (float) r7     // Catch: all -> 0x005d
            r1.setRadius(r7)     // Catch: all -> 0x005d
            r1.forEach(r2)     // Catch: all -> 0x005d
            r2.copyTo(r6)     // Catch: all -> 0x005d
            r5.destroy()
            r0.destroy()
            r2.destroy()
            r1.destroy()
            return r6
        L_0x005d:
            r6 = move-exception
            r4 = r1
            r1 = r5
            r5 = r4
            goto L_0x006f
        L_0x0062:
            r6 = move-exception
            r2 = r1
        L_0x0064:
            r1 = r5
            r5 = r2
            goto L_0x006f
        L_0x0067:
            r6 = move-exception
            r0 = r1
            r2 = r0
            goto L_0x0064
        L_0x006b:
            r6 = move-exception
            r5 = r1
            r0 = r5
            r2 = r0
        L_0x006f:
            if (r1 == 0) goto L_0x0074
            r1.destroy()
        L_0x0074:
            if (r0 == 0) goto L_0x0079
            r0.destroy()
        L_0x0079:
            if (r2 == 0) goto L_0x007e
            r2.destroy()
        L_0x007e:
            if (r5 == 0) goto L_0x0083
            r5.destroy()
        L_0x0083:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.yf2.b(android.content.Context, android.graphics.Bitmap, int):android.graphics.Bitmap");
    }

    @Override // tb.ad2
    public String getId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81e05888", new Object[]{this});
        }
        return "R" + this.b + "$S" + this.c;
    }

    public yf2(Context context, int i) {
        this(context, i, 1);
    }

    public yf2(Context context, int i, int i2) {
        boolean z = false;
        fpm.b(i > 0, "blur radius must be greater than zero");
        fpm.b(i2 > 0 ? true : z, "blur sampling must be greater than zero");
        this.f32037a = context;
        this.b = i;
        this.c = i2;
    }

    @Override // tb.ad2
    public Bitmap process(String str, ad2.a aVar, Bitmap bitmap) {
        Bitmap.Config config;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("59b6dc7b", new Object[]{this, str, aVar, bitmap});
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i2 = this.c;
        int i3 = width / i2;
        int i4 = height / i2;
        if (i3 == 0 || i4 == 0) {
            xv8.c("Effects4Phenix", "process blur width = " + i3 + ", height = " + i4, new Object[0]);
            return bitmap;
        }
        if (bitmap.getConfig() != null) {
            config = bitmap.getConfig();
        } else {
            config = PexodeOptions.CONFIG;
        }
        Bitmap a2 = aVar.a(i3, i4, config);
        Canvas canvas = new Canvas(a2);
        float f = 1.0f / this.c;
        canvas.scale(f, f);
        Paint paint = new Paint();
        paint.setFlags(2);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        Bitmap a3 = NdkCore.a(a2, this.b);
        if (a3 == null && (i = this.b) <= 25) {
            try {
                a3 = b(this.f32037a, a2, i);
            } catch (RSRuntimeException e) {
                xv8.f("Effects4Phenix", "render script blur error=%s", e);
            }
        }
        return a3 == null ? a(a2, this.b, true) : a3;
    }
}
