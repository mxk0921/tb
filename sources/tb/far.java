package tb;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class far extends Drawable implements Animatable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Interpolator m = new LinearInterpolator();
    public static final Interpolator n = new DecelerateInterpolator();
    public ObjectAnimator b;
    public ObjectAnimator c;
    public boolean d;
    public final Paint e;
    public float f;
    public float g;
    public float h;
    public final float i;
    public boolean j;

    /* renamed from: a  reason: collision with root package name */
    public final RectF f19147a = new RectF();
    public final Property<far, Float> k = new b(this, Float.class, "angle");
    public final Property<far, Float> l = new c(this, Float.class, "arc");

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
            } else {
                far.a(far.this);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b extends Property<far, Float> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(far farVar, Class cls, String str) {
            super(cls, str);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/widget/TBCircularProgressDrawable$1");
        }

        /* renamed from: a */
        public Float get(far farVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Float) ipChange.ipc$dispatch("8c6c52a5", new Object[]{this, farVar});
            }
            return Float.valueOf(farVar.b());
        }

        /* renamed from: b */
        public void set(far farVar, Float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3b339c71", new Object[]{this, farVar, f});
            } else {
                farVar.d(f.floatValue());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c extends Property<far, Float> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(far farVar, Class cls, String str) {
            super(cls, str);
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/widget/TBCircularProgressDrawable$2");
        }

        /* renamed from: a */
        public Float get(far farVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Float) ipChange.ipc$dispatch("8c6c52a5", new Object[]{this, farVar});
            }
            return Float.valueOf(farVar.c());
        }

        /* renamed from: b */
        public void set(far farVar, Float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3b339c71", new Object[]{this, farVar, f});
            } else {
                farVar.e(f.floatValue());
            }
        }
    }

    static {
        t2o.a(912262925);
    }

    public far(int i, float f) {
        this.i = f;
        Paint paint = new Paint();
        this.e = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(f);
        paint.setColor(i);
        h();
    }

    public static /* synthetic */ void a(far farVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71d43976", new Object[]{farVar});
        } else {
            farVar.i();
        }
    }

    public static /* synthetic */ Object ipc$super(far farVar, String str, Object... objArr) {
        if (str.hashCode() == -2054040210) {
            super.onBoundsChange((Rect) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/widget/TBCircularProgressDrawable");
    }

    public float b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b4968fa4", new Object[]{this})).floatValue();
        }
        return this.g;
    }

    public float c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6db42a61", new Object[]{this})).floatValue();
        }
        return this.h;
    }

    public void d(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f46bb400", new Object[]{this, new Float(f)});
            return;
        }
        this.g = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        float f2 = this.g - this.f;
        float f3 = this.h;
        if (!this.d) {
            f2 += f3;
            f = (360.0f - f3) - 30.0f;
        } else {
            f = f3 + 30.0f;
        }
        canvas.drawArc(this.f19147a, f2, f, false, this.e);
    }

    public void e(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b15277b", new Object[]{this, new Float(f)});
            return;
        }
        this.h = f;
        invalidateSelf();
    }

    public void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1643f52b", new Object[]{this, new Integer(i)});
            return;
        }
        this.e.setColor(i);
        invalidateSelf();
    }

    public void g(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6acb7165", new Object[]{this, new Float(f)});
            return;
        }
        this.e.setStrokeWidth(f);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2242c5cf", new Object[]{this})).intValue();
        }
        return -2;
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54b7f253", new Object[]{this});
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, this.k, 360.0f);
        this.c = ofFloat;
        ofFloat.setInterpolator(m);
        this.c.setDuration(2000L);
        this.c.setRepeatMode(1);
        this.c.setRepeatCount(-1);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, this.l, 300.0f);
        this.b = ofFloat2;
        ofFloat2.setInterpolator(n);
        this.b.setDuration(600L);
        this.b.setRepeatMode(1);
        this.b.setRepeatCount(-1);
        this.b.addListener(new a());
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b7b9903", new Object[]{this});
            return;
        }
        boolean z = this.d;
        this.d = true ^ z;
        if (!z) {
            this.f = (this.f + 60.0f) % 360.0f;
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b6a3f40", new Object[]{this})).booleanValue();
        }
        return this.j;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8591d56e", new Object[]{this, rect});
            return;
        }
        super.onBoundsChange(rect);
        RectF rectF = this.f19147a;
        float f = this.i;
        rectF.left = rect.left + (f / 2.0f) + 0.5f;
        rectF.right = (rect.right - (f / 2.0f)) - 0.5f;
        rectF.top = rect.top + (f / 2.0f) + 0.5f;
        rectF.bottom = (rect.bottom - (f / 2.0f)) - 0.5f;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d144fec0", new Object[]{this, new Integer(i)});
        } else {
            this.e.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65fee558", new Object[]{this, colorFilter});
        } else {
            this.e.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else if (!isRunning()) {
            this.j = true;
            this.c.start();
            this.b.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
        } else if (isRunning()) {
            this.j = false;
            this.c.cancel();
            this.b.cancel();
            invalidateSelf();
        }
    }
}
