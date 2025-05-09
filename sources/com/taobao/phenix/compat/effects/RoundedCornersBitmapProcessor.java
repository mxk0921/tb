package com.taobao.phenix.compat.effects;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pexode.PexodeOptions;
import tb.ad2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class RoundedCornersBitmapProcessor implements ad2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f11467a;
    public final int b;
    public final int c;
    public final int d;
    public final CornerType e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum CornerType {
        ALL,
        TOP,
        BOTTOM,
        LEFT,
        RIGHT
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$phenix$compat$effects$RoundedCornersBitmapProcessor$CornerType;

        static {
            int[] iArr = new int[CornerType.values().length];
            $SwitchMap$com$taobao$phenix$compat$effects$RoundedCornersBitmapProcessor$CornerType = iArr;
            try {
                iArr[CornerType.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$phenix$compat$effects$RoundedCornersBitmapProcessor$CornerType[CornerType.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$phenix$compat$effects$RoundedCornersBitmapProcessor$CornerType[CornerType.BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$phenix$compat$effects$RoundedCornersBitmapProcessor$CornerType[CornerType.LEFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$taobao$phenix$compat$effects$RoundedCornersBitmapProcessor$CornerType[CornerType.RIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public RoundedCornersBitmapProcessor(int i, int i2) {
        this(0, 0, i, i2, CornerType.ALL);
    }

    public final void a(Canvas canvas, Paint paint, float f, float f2) {
        RectF rectF;
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f16d14a5", new Object[]{this, canvas, paint, new Float(f), new Float(f2)});
            return;
        }
        int i3 = this.d;
        float f3 = f - i3;
        float f4 = f2 - i3;
        int i4 = a.$SwitchMap$com$taobao$phenix$compat$effects$RoundedCornersBitmapProcessor$CornerType[this.e.ordinal()];
        RectF rectF2 = null;
        if (i4 == 1) {
            int i5 = this.d;
            rectF2 = new RectF(i5, i5, f3, f4);
            rectF = null;
        } else if (i4 == 2) {
            int i6 = this.d;
            rectF2 = new RectF(i6, i6, f3, i6 + (this.c * 2));
            rectF = new RectF(this.d, i + this.c, f3, f4);
        } else if (i4 == 3) {
            rectF2 = new RectF(this.d, f4 - (this.c * 2), f3, f4);
            int i7 = this.d;
            rectF = new RectF(i7, i7, f3, f4 - this.c);
        } else if (i4 == 4) {
            int i8 = this.d;
            rectF2 = new RectF(i8, i8, i8 + (this.c * 2), f4);
            rectF = new RectF(this.c + i2, this.d, f3, f4);
        } else if (i4 != 5) {
            rectF = null;
        } else {
            rectF2 = new RectF(f3 - (this.c * 2), this.d, f3, f4);
            int i9 = this.d;
            rectF = new RectF(i9, i9, f3 - this.c, f4);
        }
        int i10 = this.c;
        canvas.drawRoundRect(rectF2, i10, i10, paint);
        if (rectF != null) {
            canvas.drawRect(rectF, paint);
        }
    }

    @Override // tb.ad2
    public String getId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81e05888", new Object[]{this});
        }
        return "W" + this.f11467a + "$H" + this.b + "$R" + this.c + "$M" + this.d + "$P" + this.e.ordinal();
    }

    @Override // tb.ad2
    public Bitmap process(String str, ad2.a aVar, Bitmap bitmap) {
        float f;
        Bitmap.Config config;
        int i;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("59b6dc7b", new Object[]{this, str, aVar, bitmap});
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i2 = this.f11467a;
        if (i2 > 0 && (i = this.b) > 0 && !(i2 == width && i == height)) {
            z = true;
        }
        if (z) {
            int i3 = this.b;
            if (width * i3 > height * i2) {
                f = i3 / height;
                width = (int) ((width * f) + 0.5d);
                height = i3;
            } else {
                float f2 = i2 / width;
                height = (int) ((height * f2) + 0.5d);
                f = f2;
                width = i2;
            }
        } else {
            f = 1.0f;
        }
        if (bitmap.getConfig() != null) {
            config = bitmap.getConfig();
        } else {
            config = PexodeOptions.CONFIG;
        }
        Bitmap a2 = aVar.a(width, height, config);
        Canvas canvas = new Canvas(a2);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        if (z) {
            Matrix matrix = new Matrix();
            matrix.setScale(f, f);
            bitmapShader.setLocalMatrix(matrix);
        }
        paint.setShader(bitmapShader);
        a(canvas, paint, width, height);
        return a2;
    }

    public RoundedCornersBitmapProcessor(int i, int i2, CornerType cornerType) {
        this(0, 0, i, i2, cornerType);
    }

    public RoundedCornersBitmapProcessor(int i, int i2, int i3, int i4) {
        this(i, i2, i3, i4, CornerType.ALL);
    }

    public RoundedCornersBitmapProcessor(int i, int i2, int i3, int i4, CornerType cornerType) {
        this.f11467a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = cornerType;
    }
}
