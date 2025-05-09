package tb;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.jfw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class mx7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Context f24365a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a extends ColorDrawable {
        static {
            t2o.a(503317221);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b extends GradientDrawable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public float[] f24366a;
        public float b;
        public int c = 1;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public interface a {
            void onBoundChanged(b bVar);
        }

        static {
            t2o.a(503317222);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            switch (str.hashCode()) {
                case -2117630736:
                    super.setCornerRadius(((Number) objArr[0]).floatValue());
                    return null;
                case -2054040210:
                    super.onBoundsChange((Rect) objArr[0]);
                    return null;
                case -1862206224:
                    super.setCornerRadii((float[]) objArr[0]);
                    return null;
                case -1665133574:
                    super.draw((Canvas) objArr[0]);
                    return null;
                case 1718516699:
                    super.setColor(((Number) objArr[0]).intValue());
                    return null;
                default:
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/drawable/DrawableFactory$InternalGradientDrawable");
            }
        }

        public float[] a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (float[]) ipChange.ipc$dispatch("e10ee25b", new Object[]{this});
            }
            return this.f24366a;
        }

        public float b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f9580fff", new Object[]{this})).floatValue();
            }
            return this.b;
        }

        public int c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("7aeae0e8", new Object[]{this})).intValue();
            }
            return this.c;
        }

        public Path d(Path path, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Path) ipChange.ipc$dispatch("8275909b", new Object[]{this, path, new Integer(i), new Integer(i2)});
            }
            if (path != null) {
                path.reset();
            }
            float[] a2 = a();
            if (a2 != null) {
                RectF rectF = new RectF();
                rectF.set(0.0f, 0.0f, i, i2);
                if (path == null) {
                    path = new Path();
                }
                path.addRoundRect(rectF, a2, Path.Direction.CW);
            } else {
                float b = b();
                if (b > 0.0f) {
                    RectF rectF2 = new RectF();
                    rectF2.set(0.0f, 0.0f, i, i2);
                    if (path == null) {
                        path = new Path();
                    }
                    path.addRoundRect(rectF2, b, b, Path.Direction.CW);
                }
            }
            return path;
        }

        @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            } else {
                super.draw(canvas);
            }
        }

        @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
        public void onBoundsChange(Rect rect) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8591d56e", new Object[]{this, rect});
                return;
            }
            super.onBoundsChange(rect);
            if (getCallback() != null && (getCallback() instanceof a)) {
                ((a) getCallback()).onBoundChanged(this);
            }
        }

        @Override // android.graphics.drawable.GradientDrawable
        public void setColor(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("666e7bdb", new Object[]{this, new Integer(i)});
                return;
            }
            super.setColor(i);
            this.c = i;
        }

        @Override // android.graphics.drawable.GradientDrawable
        public void setCornerRadii(float[] fArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9100fcf0", new Object[]{this, fArr});
                return;
            }
            super.setCornerRadii(fArr);
            this.f24366a = fArr;
            this.b = 0.0f;
        }

        @Override // android.graphics.drawable.GradientDrawable
        public void setCornerRadius(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("81c784f0", new Object[]{this, new Float(f)});
                return;
            }
            super.setCornerRadius(f);
            if (f < 0.0f) {
                f = 0.0f;
            }
            this.b = f;
            this.f24366a = null;
        }
    }

    static {
        t2o.a(503317220);
    }

    public static boolean a(jfw jfwVar) {
        jfw.a aVar;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0180d7b", new Object[]{jfwVar})).booleanValue();
        }
        if (jfwVar == null || (jfwVar instanceof ymt) || (aVar = jfwVar.G) == null || jfwVar.E == 1 || (i = aVar.c) < 0 || (i == 0 && aVar.f21974a == 0 && aVar.b == 0)) {
            return true;
        }
        return false;
    }

    public static Drawable b(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("25bb8e4f", new Object[]{new Integer(i), new Integer(i2)});
        }
        GradientDrawable e = ut2.e();
        e.setColor(i);
        e.setCornerRadius(i2);
        return e;
    }

    public static Drawable c(jfw.b bVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("e57a9987", new Object[]{bVar, new Integer(i)});
        }
        GradientDrawable gradientDrawable = null;
        if (bVar != null) {
            int[] iArr = {bVar.b, bVar.c};
            int i2 = bVar.f21975a;
            if (i2 == 0) {
                gradientDrawable = ut2.e();
                gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
                gradientDrawable.setColors(iArr);
            } else if (i2 == 2) {
                gradientDrawable = ut2.e();
                gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
                gradientDrawable.setColors(iArr);
            }
            if (i > 0) {
                gradientDrawable.setCornerRadius(i);
            }
        }
        return gradientDrawable;
    }

    public static Drawable d(Drawable drawable, jfw jfwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("faa99932", new Object[]{drawable, jfwVar});
        }
        return e(drawable, jfwVar, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d9, code lost:
        if (r5 == false) goto L_0x00db;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0187  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.drawable.Drawable e(android.graphics.drawable.Drawable r10, tb.jfw r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.mx7.e(android.graphics.drawable.Drawable, tb.jfw, boolean):android.graphics.drawable.Drawable");
    }

    public static Drawable f(Drawable drawable, jfw jfwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("dd537e06", new Object[]{drawable, jfwVar});
        }
        return e(drawable, jfwVar, true);
    }

    public static void g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{context});
        } else {
            f24365a = context.getApplicationContext();
        }
    }
}
