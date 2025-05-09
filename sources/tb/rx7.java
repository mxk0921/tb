package tb;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class rx7 {
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(919601416);
        }

        public a() {
        }

        public final Drawable a(int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Drawable) ipChange.ipc$dispatch("dcf1a4b3", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(i);
            if (i3 > 0) {
                gradientDrawable.setStroke(i3, i2);
            }
            gradientDrawable.setCornerRadius(i4);
            return gradientDrawable;
        }

        public final Drawable b(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Drawable) ipChange.ipc$dispatch("264fa69e", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7)});
            }
            float f = i4;
            float f2 = i5;
            float f3 = i7;
            float f4 = i6;
            float[] fArr = {f, f, f2, f2, f3, f3, f4, f4};
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(i);
            if (i3 > 0) {
                gradientDrawable.setStroke(i3, i2);
            }
            gradientDrawable.setCornerRadii(fArr);
            return gradientDrawable;
        }

        public final Drawable c(int[] iArr, boolean z, int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Drawable) ipChange.ipc$dispatch("de9793ab", new Object[]{this, iArr, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            }
            ckf.g(iArr, "colors");
            float f = i;
            float f2 = i2;
            float f3 = i4;
            float f4 = i3;
            float[] fArr = {f, f, f2, f2, f3, f3, f4, f4};
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColors(iArr);
            if (z) {
                gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
            } else {
                gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
            }
            gradientDrawable.setCornerRadii(fArr);
            return gradientDrawable;
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(919601415);
    }
}
