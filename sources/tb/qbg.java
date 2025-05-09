package tb;

import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class qbg {
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(511705619);
        }

        public a() {
        }

        public final ShapeDrawable a(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ShapeDrawable) ipChange.ipc$dispatch("64dc4982", new Object[]{this, new Integer(i), new Integer(i2)});
            }
            return b(i, i, i, i, i2);
        }

        public final ShapeDrawable b(int i, int i2, int i3, int i4, int i5) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ShapeDrawable) ipChange.ipc$dispatch("1f8cfc3f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
            }
            float f = i;
            float f2 = i2;
            float f3 = i3;
            float f4 = i4;
            RoundRectShape roundRectShape = new RoundRectShape(new float[]{f, f, f2, f2, f3, f3, f4, f4}, null, null);
            ShapeDrawable shapeDrawable = new ShapeDrawable();
            shapeDrawable.setShape(roundRectShape);
            Paint paint = shapeDrawable.getPaint();
            ckf.f(paint, "bgDrawable.paint");
            paint.setColor(i5);
            return shapeDrawable;
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(511705618);
    }
}
