package com.taobao.search.common.uikit;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ad2;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class RoundedCornersBitmapProcessor implements ad2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f11530a;
    public final int b;
    public final int c;
    public final CornerType d;
    public final ImageView.ScaleType e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public enum CornerType {
        ALL,
        TOP,
        BOTTOM,
        LEFT,
        RIGHT;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(CornerType cornerType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/common/uikit/RoundedCornersBitmapProcessor$CornerType");
        }

        public static CornerType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CornerType) ipChange.ipc$dispatch("b3c8690c", new Object[]{str});
            }
            return (CornerType) Enum.valueOf(CornerType.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$android$widget$ImageView$ScaleType;
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$search$common$uikit$RoundedCornersBitmapProcessor$CornerType;

        static {
            int[] iArr = new int[CornerType.values().length];
            $SwitchMap$com$taobao$search$common$uikit$RoundedCornersBitmapProcessor$CornerType = iArr;
            try {
                iArr[CornerType.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$search$common$uikit$RoundedCornersBitmapProcessor$CornerType[CornerType.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$search$common$uikit$RoundedCornersBitmapProcessor$CornerType[CornerType.BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$search$common$uikit$RoundedCornersBitmapProcessor$CornerType[CornerType.LEFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$taobao$search$common$uikit$RoundedCornersBitmapProcessor$CornerType[CornerType.RIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            $SwitchMap$android$widget$ImageView$ScaleType = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    static {
        t2o.a(815792198);
        t2o.a(620757008);
    }

    public RoundedCornersBitmapProcessor(int i, int i2, int i3, int i4, CornerType cornerType, ImageView.ScaleType scaleType) {
        this.f11530a = i;
        this.b = i2;
        this.c = i3;
        this.d = cornerType;
        this.e = scaleType == null ? ImageView.ScaleType.CENTER_CROP : scaleType;
    }

    public final void a(Canvas canvas, Paint paint, float f, float f2) {
        RectF rectF;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f16d14a5", new Object[]{this, canvas, paint, new Float(f), new Float(f2)});
            return;
        }
        float f3 = 0;
        float f4 = f - f3;
        float f5 = f2 - f3;
        int i = a.$SwitchMap$com$taobao$search$common$uikit$RoundedCornersBitmapProcessor$CornerType[this.d.ordinal()];
        RectF rectF2 = null;
        if (i == 1) {
            rectF2 = new RectF(f3, f3, f4, f5);
            rectF = null;
        } else if (i == 2) {
            rectF2 = new RectF(f3, f3, f4, (this.c * 2) + f3);
            rectF = new RectF(f3, this.c + f3, f4, f5);
        } else if (i == 3) {
            rectF2 = new RectF(f3, f5 - (this.c * 2), f4, f5);
            rectF = new RectF(f3, f3, f4, f5 - this.c);
        } else if (i == 4) {
            rectF2 = new RectF(f3, f3, (this.c * 2) + f3, f5);
            rectF = new RectF(this.c + f3, f3, f4, f5);
        } else if (i != 5) {
            rectF = null;
        } else {
            rectF2 = new RectF(f4 - (this.c * 2), f3, f4, f5);
            rectF = new RectF(f3, f3, f4 - this.c, f5);
        }
        float f6 = this.c;
        canvas.drawRoundRect(rectF2, f6, f6, paint);
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
        return "W" + this.f11530a + "$H" + this.b + "$R" + this.c + "$M0$P" + this.d.ordinal() + "$T" + this.e.ordinal();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d1  */
    @Override // tb.ad2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.graphics.Bitmap process(java.lang.String r13, tb.ad2.a r14, android.graphics.Bitmap r15) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.search.common.uikit.RoundedCornersBitmapProcessor.process(java.lang.String, tb.ad2$a, android.graphics.Bitmap):android.graphics.Bitmap");
    }
}
