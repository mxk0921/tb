package tb;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.OverScroller;
import androidx.core.view.MotionEventCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class i2m implements View.OnTouchListener, View.OnLayoutChangeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final zqk B;
    public final ImageView h;
    public final GestureDetector i;
    public final o05 j;
    public ysk p;
    public qsk q;
    public fwk r;
    public View.OnClickListener s;
    public ewk t;
    public ztk u;
    public suk v;
    public awk w;
    public f x;

    /* renamed from: a  reason: collision with root package name */
    public final Interpolator f21052a = new AccelerateDecelerateInterpolator();
    public int b = 200;
    public float c = 1.0f;
    public float d = 1.75f;
    public float e = 2.5f;
    public boolean f = true;
    public boolean g = false;
    public final Matrix k = new Matrix();
    public final Matrix l = new Matrix();
    public final Matrix m = new Matrix();
    public final RectF n = new RectF();
    public final float[] o = new float[9];
    public int y = 2;
    public boolean z = true;
    public ImageView.ScaleType A = ImageView.ScaleType.FIT_CENTER;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends GestureDetector.SimpleOnGestureListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/interactive_common/view/photoview/PhotoViewAttacher$2");
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f2b37f32", new Object[]{this, motionEvent, motionEvent2, new Float(f), new Float(f2)})).booleanValue();
            }
            if (i2m.i(i2m.this) == null || i2m.this.O() > i2m.j() || MotionEventCompat.getPointerCount(motionEvent) > i2m.k() || MotionEventCompat.getPointerCount(motionEvent2) > i2m.k()) {
                return false;
            }
            return i2m.i(i2m.this).onFling(motionEvent, motionEvent2, f, f2);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8638ede4", new Object[]{this, motionEvent});
            } else if (i2m.h(i2m.this) != null) {
                i2m.h(i2m.this).a(i2m.u(i2m.this), motionEvent);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements GestureDetector.OnDoubleTapListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7a319393", new Object[]{this, motionEvent})).booleanValue();
            }
            try {
                float O = i2m.this.O();
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (O < i2m.this.L()) {
                    i2m i2mVar = i2m.this;
                    i2mVar.o0(i2mVar.L(), x, y, true);
                } else {
                    i2m i2mVar2 = i2m.this;
                    i2mVar2.o0(i2mVar2.N(), x, y, true);
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            return true;
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("886c5d07", new Object[]{this, motionEvent})).booleanValue();
            }
            return false;
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d156fc43", new Object[]{this, motionEvent})).booleanValue();
            }
            if (i2m.l(i2m.this) != null) {
                i2m.l(i2m.this).onClick(i2m.u(i2m.this));
            }
            RectF F = i2m.this.F();
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (i2m.n(i2m.this) != null) {
                i2m.n(i2m.this).a(i2m.u(i2m.this), x, y);
            }
            if (F != null) {
                if (F.contains(x, y)) {
                    float width = (x - F.left) / F.width();
                    float height = (y - F.top) / F.height();
                    if (i2m.o(i2m.this) != null) {
                        i2m.o(i2m.this).a(i2m.u(i2m.this), width, height);
                    }
                    return true;
                } else if (i2m.p(i2m.this) != null) {
                    i2m.p(i2m.this).a(i2m.u(i2m.this));
                }
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements zqk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.zqk
        public void a(float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("300e4c3a", new Object[]{this, new Float(f), new Float(f2)});
            } else if (!i2m.a(i2m.this).e()) {
                if (i2m.b(i2m.this) != null) {
                    i2m.b(i2m.this).a(f, f2);
                }
                i2m.m(i2m.this).postTranslate(f, f2);
                i2m.t(i2m.this);
                ViewParent parent = i2m.u(i2m.this).getParent();
                if (!i2m.v(i2m.this) || i2m.a(i2m.this).e() || i2m.w(i2m.this)) {
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                } else if ((i2m.x(i2m.this) == 2 || ((i2m.x(i2m.this) == 0 && f >= 1.0f) || (i2m.x(i2m.this) == 1 && f <= -1.0f))) && parent != null) {
                    parent.requestDisallowInterceptTouchEvent(false);
                }
            }
        }

        @Override // tb.zqk
        public void b(float f, float f2, float f3, float f4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("94f7aec4", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4)});
                return;
            }
            i2m i2mVar = i2m.this;
            i2m.z(i2mVar, new f(i2m.u(i2mVar).getContext()));
            f y = i2m.y(i2m.this);
            i2m i2mVar2 = i2m.this;
            int A = i2m.A(i2mVar2, i2m.u(i2mVar2));
            i2m i2mVar3 = i2m.this;
            y.b(A, i2m.c(i2mVar3, i2m.u(i2mVar3)), (int) f3, (int) f4);
            i2m.u(i2m.this).post(i2m.y(i2m.this));
        }

        @Override // tb.zqk
        public void c(float f, float f2, float f3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("60a624ce", new Object[]{this, new Float(f), new Float(f2), new Float(f3)});
            } else if (i2m.this.O() > i2m.d(i2m.this) + i2m.e() && f > 1.0f) {
            } else {
                if (i2m.this.O() >= i2m.f(i2m.this) - i2m.e() || f >= 1.0f) {
                    if (i2m.g(i2m.this) != null) {
                        i2m.g(i2m.this).onScaleChange(i2m.this.O(), f2, f3);
                    }
                    i2m.m(i2m.this).postScale(f, f, f2, f3);
                    i2m.t(i2m.this);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static /* synthetic */ class d {
        public static final /* synthetic */ int[] $SwitchMap$android$widget$ImageView$ScaleType;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            $SwitchMap$android$widget$ImageView$ScaleType = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.FIT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.FIT_XY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final float f21056a;
        private final float b;
        private final long c = System.currentTimeMillis();
        private final float d;
        private final float e;

        public e(float f, float f2, float f3, float f4) {
            this.f21056a = f3;
            this.b = f4;
            this.d = f;
            this.e = f2;
        }

        private float a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2637f4f8", new Object[]{this})).floatValue();
            }
            return i2m.s(i2m.this).getInterpolation(Math.min(1.0f, (((float) (System.currentTimeMillis() - this.c)) * 1.0f) / i2m.r(i2m.this)));
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            float a2 = a();
            float f = this.d;
            i2m.q(i2m.this).c((f + ((this.e - f) * a2)) / i2m.this.O(), this.f21056a, this.b);
            if (a2 < 1.0f) {
                w84.a(i2m.u(i2m.this), this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final OverScroller f21057a;
        private int b;
        private int c;

        public f(Context context) {
            this.f21057a = new OverScroller(context);
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("69b31e89", new Object[]{this});
            } else {
                this.f21057a.forceFinished(true);
            }
        }

        public void b(int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            int i7;
            int i8;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67330323", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                return;
            }
            RectF F = i2m.this.F();
            if (F != null) {
                int round = Math.round(-F.left);
                float f = i;
                if (f < F.width()) {
                    i5 = Math.round(F.width() - f);
                    i6 = 0;
                } else {
                    i6 = round;
                    i5 = i6;
                }
                int round2 = Math.round(-F.top);
                float f2 = i2;
                if (f2 < F.height()) {
                    i7 = Math.round(F.height() - f2);
                    i8 = 0;
                } else {
                    i8 = round2;
                    i7 = i8;
                }
                this.b = round;
                this.c = round2;
                if (round != i5 || round2 != i7) {
                    this.f21057a.fling(round, round2, i3, i4, i6, i5, i8, i7, 0, 0);
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!this.f21057a.isFinished() && this.f21057a.computeScrollOffset()) {
                int currX = this.f21057a.getCurrX();
                int currY = this.f21057a.getCurrY();
                i2m.m(i2m.this).postTranslate(this.b - currX, this.c - currY);
                i2m.t(i2m.this);
                this.b = currX;
                this.c = currY;
                w84.a(i2m.u(i2m.this), this);
            }
        }
    }

    public i2m(ImageView imageView) {
        c cVar = new c();
        this.B = cVar;
        this.h = imageView;
        imageView.setOnTouchListener(this);
        imageView.addOnLayoutChangeListener(this);
        if (!imageView.isInEditMode()) {
            this.j = new o05(imageView.getContext(), cVar);
            GestureDetector gestureDetector = new GestureDetector(imageView.getContext(), new a());
            this.i = gestureDetector;
            gestureDetector.setOnDoubleTapListener(new b());
        }
    }

    public static /* synthetic */ int A(i2m i2mVar, ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a28a5a1", new Object[]{i2mVar, imageView})).intValue();
        }
        return i2mVar.K(imageView);
    }

    public static /* synthetic */ o05 a(i2m i2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o05) ipChange.ipc$dispatch("e28778aa", new Object[]{i2mVar});
        }
        return i2mVar.j;
    }

    public static /* synthetic */ awk b(i2m i2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (awk) ipChange.ipc$dispatch("1bc08fa3", new Object[]{i2mVar});
        }
        return i2mVar.w;
    }

    public static /* synthetic */ int c(i2m i2mVar, ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9845d407", new Object[]{i2mVar, imageView})).intValue();
        }
        return i2mVar.J(imageView);
    }

    public static /* synthetic */ float d(i2m i2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4757e70b", new Object[]{i2mVar})).floatValue();
        }
        return i2mVar.e;
    }

    public static /* synthetic */ float e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("afb76b18", new Object[0])).floatValue();
        }
        return 0.5f;
    }

    public static /* synthetic */ float f(i2m i2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("55a9ab8d", new Object[]{i2mVar})).floatValue();
        }
        return i2mVar.c;
    }

    public static /* synthetic */ ztk g(i2m i2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ztk) ipChange.ipc$dispatch("876ed9a4", new Object[]{i2mVar});
        }
        return i2mVar.u;
    }

    public static /* synthetic */ ewk h(i2m i2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ewk) ipChange.ipc$dispatch("47ebc838", new Object[]{i2mVar});
        }
        return i2mVar.t;
    }

    public static /* synthetic */ suk i(i2m i2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (suk) ipChange.ipc$dispatch("ee56b14a", new Object[]{i2mVar});
        }
        return i2mVar.v;
    }

    public static /* synthetic */ float j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b836935d", new Object[0])).floatValue();
        }
        return 1.0f;
    }

    public static /* synthetic */ int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed1ccea1", new Object[0])).intValue();
        }
        return 1;
    }

    public static /* synthetic */ View.OnClickListener l(i2m i2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View.OnClickListener) ipChange.ipc$dispatch("a85a3cc", new Object[]{i2mVar});
        }
        return i2mVar.s;
    }

    public static /* synthetic */ Matrix m(i2m i2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Matrix) ipChange.ipc$dispatch("a4a276b9", new Object[]{i2mVar});
        }
        return i2mVar.m;
    }

    public static /* synthetic */ fwk n(i2m i2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fwk) ipChange.ipc$dispatch("643cf8c7", new Object[]{i2mVar});
        }
        return i2mVar.r;
    }

    public static /* synthetic */ ysk o(i2m i2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ysk) ipChange.ipc$dispatch("d44f5619", new Object[]{i2mVar});
        }
        return i2mVar.p;
    }

    public static /* synthetic */ qsk p(i2m i2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qsk) ipChange.ipc$dispatch("f87832ed", new Object[]{i2mVar});
        }
        return i2mVar.q;
    }

    public static /* synthetic */ zqk q(i2m i2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zqk) ipChange.ipc$dispatch("e33ff679", new Object[]{i2mVar});
        }
        return i2mVar.B;
    }

    public static /* synthetic */ int r(i2m i2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3ac5f3b0", new Object[]{i2mVar})).intValue();
        }
        return i2mVar.b;
    }

    public static /* synthetic */ Interpolator s(i2m i2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Interpolator) ipChange.ipc$dispatch("54779313", new Object[]{i2mVar});
        }
        return i2mVar.f21052a;
    }

    public static /* synthetic */ void t(i2m i2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("308a556e", new Object[]{i2mVar});
        } else {
            i2mVar.C();
        }
    }

    public static /* synthetic */ ImageView u(i2m i2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("dac2fac1", new Object[]{i2mVar});
        }
        return i2mVar.h;
    }

    public static /* synthetic */ boolean v(i2m i2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3edc19f4", new Object[]{i2mVar})).booleanValue();
        }
        return i2mVar.f;
    }

    public static /* synthetic */ boolean w(i2m i2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4604fc35", new Object[]{i2mVar})).booleanValue();
        }
        return i2mVar.g;
    }

    public static /* synthetic */ int x(i2m i2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4d2dde65", new Object[]{i2mVar})).intValue();
        }
        return i2mVar.y;
    }

    public static /* synthetic */ f y(i2m i2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("be523202", new Object[]{i2mVar});
        }
        return i2mVar.x;
    }

    public static /* synthetic */ f z(i2m i2mVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("52993b21", new Object[]{i2mVar, fVar});
        }
        i2mVar.x = fVar;
        return fVar;
    }

    public final void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69b31e89", new Object[]{this});
            return;
        }
        f fVar = this.x;
        if (fVar != null) {
            fVar.a();
            this.x = null;
        }
    }

    public final void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("137cd23b", new Object[]{this});
        } else if (D()) {
            X(H());
        }
    }

    public final boolean D() {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69f5a889", new Object[]{this})).booleanValue();
        }
        RectF G = G(H());
        if (G == null) {
            return false;
        }
        float height = G.height();
        float width = G.width();
        float J = J(this.h);
        float f7 = 0.0f;
        if (height <= J) {
            int i = d.$SwitchMap$android$widget$ImageView$ScaleType[this.A.ordinal()];
            if (i != 2) {
                if (i != 3) {
                    J = (J - height) / 2.0f;
                    f6 = G.top;
                } else {
                    J -= height;
                    f6 = G.top;
                }
                f2 = J - f6;
            } else {
                f5 = G.top;
                f2 = -f5;
            }
        } else {
            f5 = G.top;
            if (f5 <= 0.0f) {
                f6 = G.bottom;
                if (f6 >= J) {
                    f2 = 0.0f;
                }
                f2 = J - f6;
            }
            f2 = -f5;
        }
        float K = K(this.h);
        if (width <= K) {
            int i2 = d.$SwitchMap$android$widget$ImageView$ScaleType[this.A.ordinal()];
            if (i2 != 2) {
                if (i2 != 3) {
                    f3 = (K - width) / 2.0f;
                    f4 = G.left;
                } else {
                    f3 = K - width;
                    f4 = G.left;
                }
                f7 = f3 - f4;
            } else {
                f7 = -G.left;
            }
            this.y = 2;
        } else {
            float f8 = G.left;
            if (f8 > 0.0f) {
                this.y = 0;
                f7 = -f8;
            } else {
                float f9 = G.right;
                if (f9 < K) {
                    f7 = K - f9;
                    this.y = 1;
                } else {
                    this.y = -1;
                }
            }
        }
        this.m.postTranslate(f7, f2);
        return true;
    }

    public void E(Matrix matrix) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("667b1768", new Object[]{this, matrix});
        } else {
            matrix.set(H());
        }
    }

    public RectF F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("c7965670", new Object[]{this});
        }
        D();
        return G(H());
    }

    public final RectF G(Matrix matrix) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("6cfeea2", new Object[]{this, matrix});
        }
        Drawable drawable = this.h.getDrawable();
        if (drawable == null) {
            return null;
        }
        this.n.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        matrix.mapRect(this.n);
        return this.n;
    }

    public final Matrix H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Matrix) ipChange.ipc$dispatch("859b19ae", new Object[]{this});
        }
        this.l.set(this.k);
        this.l.postConcat(this.m);
        return this.l;
    }

    public Matrix I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Matrix) ipChange.ipc$dispatch("83fe98d9", new Object[]{this});
        }
        return this.l;
    }

    public final int J(ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a920a365", new Object[]{this, imageView})).intValue();
        }
        return (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
    }

    public final int K(ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aa004070", new Object[]{this, imageView})).intValue();
        }
        return (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
    }

    public float L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d0aa8df7", new Object[]{this})).floatValue();
        }
        return this.e;
    }

    public float M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ad95ce96", new Object[]{this})).floatValue();
        }
        return this.d;
    }

    public float N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ccdbffc9", new Object[]{this})).floatValue();
        }
        return this.c;
    }

    public float O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8f6c4a0b", new Object[]{this})).floatValue();
        }
        return (float) Math.sqrt(((float) Math.pow(R(this.m, 0), 2.0d)) + ((float) Math.pow(R(this.m, 3), 2.0d)));
    }

    public ImageView.ScaleType P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView.ScaleType) ipChange.ipc$dispatch("16d492db", new Object[]{this});
        }
        return this.A;
    }

    public void Q(Matrix matrix) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45bc841c", new Object[]{this, matrix});
        } else {
            matrix.set(this.m);
        }
    }

    public final float R(Matrix matrix, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d39f4459", new Object[]{this, matrix, new Integer(i)})).floatValue();
        }
        matrix.getValues(this.o);
        return this.o[i];
    }

    @Deprecated
    public boolean S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b058eaef", new Object[]{this})).booleanValue();
        }
        return this.z;
    }

    public boolean T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("73d17002", new Object[]{this})).booleanValue();
        }
        return this.z;
    }

    public final void U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c83a3677", new Object[]{this});
            return;
        }
        this.m.reset();
        l0(0.0f);
        X(H());
        D();
    }

    public void V(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74342f80", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    public boolean W(Matrix matrix) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6043578", new Object[]{this, matrix})).booleanValue();
        }
        if (matrix == null) {
            throw new IllegalArgumentException("Matrix cannot be null");
        } else if (this.h.getDrawable() == null) {
            return false;
        } else {
            this.m.set(matrix);
            C();
            return true;
        }
    }

    public final void X(Matrix matrix) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dace656", new Object[]{this, matrix});
        } else {
            this.h.setImageMatrix(matrix);
        }
    }

    public void Y(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("203da70d", new Object[]{this, new Float(f2)});
            return;
        }
        jwv.a(this.c, this.d, f2);
        this.e = f2;
    }

    public void Z(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a92102e6", new Object[]{this, new Float(f2)});
            return;
        }
        jwv.a(this.c, f2, this.e);
        this.d = f2;
    }

    public void a0(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa3a6f7b", new Object[]{this, new Float(f2)});
            return;
        }
        jwv.a(f2, this.d, this.e);
        this.c = f2;
    }

    public void b0(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8408cbf7", new Object[]{this, onClickListener});
        } else {
            this.s = onClickListener;
        }
    }

    public void c0(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9ba033", new Object[]{this, onDoubleTapListener});
        } else {
            this.i.setOnDoubleTapListener(onDoubleTapListener);
        }
    }

    public void d0(ewk ewkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ea423c7", new Object[]{this, ewkVar});
        } else {
            this.t = ewkVar;
        }
    }

    public void e0(dsk dskVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb5478e2", new Object[]{this, dskVar});
        }
    }

    public void f0(qsk qskVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d60f682", new Object[]{this, qskVar});
        } else {
            this.q = qskVar;
        }
    }

    public void g0(ysk yskVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb3f6d62", new Object[]{this, yskVar});
        } else {
            this.p = yskVar;
        }
    }

    public void h0(ztk ztkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14d3ac42", new Object[]{this, ztkVar});
        } else {
            this.u = ztkVar;
        }
    }

    public void i0(suk sukVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fee60742", new Object[]{this, sukVar});
        } else {
            this.v = sukVar;
        }
    }

    public void j0(awk awkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25cdb292", new Object[]{this, awkVar});
        } else {
            this.w = awkVar;
        }
    }

    public void k0(fwk fwkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1902482", new Object[]{this, fwkVar});
        } else {
            this.r = fwkVar;
        }
    }

    public void l0(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1665b002", new Object[]{this, new Float(f2)});
            return;
        }
        this.m.postRotate(f2 % 360.0f);
        C();
    }

    public void m0(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd85645e", new Object[]{this, new Float(f2)});
            return;
        }
        this.m.setRotate(f2 % 360.0f);
        C();
    }

    public void n0(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c41af11", new Object[]{this, new Float(f2)});
        } else {
            p0(f2, false);
        }
    }

    public void o0(float f2, float f3, float f4, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1466623", new Object[]{this, new Float(f2), new Float(f3), new Float(f4), new Boolean(z)});
        } else if (f2 < this.c || f2 > this.e) {
            throw new IllegalArgumentException("Scale must be within the range of minScale and maxScale");
        } else if (z) {
            this.h.post(new e(O(), f2, f3, f4));
        } else {
            this.m.setScale(f2, f2, f3, f4);
            C();
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
        } else if (i != i5 || i2 != i6 || i3 != i7 || i4 != i8) {
            v0(this.h.getDrawable());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009b  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
        /*
            r10 = this;
            r0 = 1
            r1 = 0
            r2 = 3
            com.android.alibaba.ip.runtime.IpChange r3 = tb.i2m.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001f
            java.lang.String r4 = "d4aa3aa4"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r10
            r2[r0] = r11
            r11 = 2
            r2[r11] = r12
            java.lang.Object r11 = r3.ipc$dispatch(r4, r2)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            return r11
        L_0x001f:
            boolean r3 = r10.z
            if (r3 == 0) goto L_0x00da
            r3 = r11
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            boolean r3 = tb.jwv.c(r3)
            if (r3 == 0) goto L_0x00da
            int r3 = r12.getAction()
            if (r3 == 0) goto L_0x008a
            if (r3 == r0) goto L_0x0037
            if (r3 == r2) goto L_0x0037
            goto L_0x0096
        L_0x0037:
            float r2 = r10.O()
            float r3 = r10.c
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x0060
            android.graphics.RectF r2 = r10.F()
            if (r2 == 0) goto L_0x0096
            tb.i2m$e r9 = new tb.i2m$e
            float r5 = r10.O()
            float r6 = r10.c
            float r7 = r2.centerX()
            float r8 = r2.centerY()
            r3 = r9
            r4 = r10
            r3.<init>(r5, r6, r7, r8)
            r11.post(r9)
            goto L_0x0088
        L_0x0060:
            float r2 = r10.O()
            float r3 = r10.e
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x0096
            android.graphics.RectF r2 = r10.F()
            if (r2 == 0) goto L_0x0096
            tb.i2m$e r9 = new tb.i2m$e
            float r5 = r10.O()
            float r6 = r10.e
            float r7 = r2.centerX()
            float r8 = r2.centerY()
            r3 = r9
            r4 = r10
            r3.<init>(r5, r6, r7, r8)
            r11.post(r9)
        L_0x0088:
            r11 = 1
            goto L_0x0097
        L_0x008a:
            android.view.ViewParent r11 = r11.getParent()
            if (r11 == 0) goto L_0x0093
            r11.requestDisallowInterceptTouchEvent(r0)
        L_0x0093:
            r10.B()
        L_0x0096:
            r11 = 0
        L_0x0097:
            tb.o05 r2 = r10.j
            if (r2 == 0) goto L_0x00cd
            boolean r11 = r2.e()
            tb.o05 r2 = r10.j
            boolean r2 = r2.d()
            tb.o05 r3 = r10.j
            boolean r3 = r3.f(r12)
            if (r11 != 0) goto L_0x00b7
            tb.o05 r11 = r10.j
            boolean r11 = r11.e()
            if (r11 != 0) goto L_0x00b7
            r11 = 1
            goto L_0x00b8
        L_0x00b7:
            r11 = 0
        L_0x00b8:
            if (r2 != 0) goto L_0x00c4
            tb.o05 r2 = r10.j
            boolean r2 = r2.d()
            if (r2 != 0) goto L_0x00c4
            r2 = 1
            goto L_0x00c5
        L_0x00c4:
            r2 = 0
        L_0x00c5:
            if (r11 == 0) goto L_0x00ca
            if (r2 == 0) goto L_0x00ca
            r1 = 1
        L_0x00ca:
            r10.g = r1
            r11 = r3
        L_0x00cd:
            android.view.GestureDetector r1 = r10.i
            if (r1 == 0) goto L_0x00d8
            boolean r12 = r1.onTouchEvent(r12)
            if (r12 == 0) goto L_0x00d8
            goto L_0x00db
        L_0x00d8:
            r0 = r11
            goto L_0x00db
        L_0x00da:
            r0 = 0
        L_0x00db:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.i2m.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public void p0(float f2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbf4e5e3", new Object[]{this, new Float(f2), new Boolean(z)});
        } else {
            o0(f2, this.h.getRight() / 2, this.h.getBottom() / 2, z);
        }
    }

    public void q0(float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8219bc62", new Object[]{this, new Float(f2), new Float(f3), new Float(f4)});
            return;
        }
        jwv.a(f2, f3, f4);
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }

    public void r0(ImageView.ScaleType scaleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("732a5c3", new Object[]{this, scaleType});
        } else if (jwv.d(scaleType) && scaleType != this.A) {
            this.A = scaleType;
            u0();
        }
    }

    public void s0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("253df7de", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }

    public void t0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5540e5e", new Object[]{this, new Boolean(z)});
            return;
        }
        this.z = z;
        u0();
    }

    public void u0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee4a30d0", new Object[]{this});
        } else if (this.z) {
            v0(this.h.getDrawable());
        } else {
            U();
        }
    }

    public final void v0(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86e110c6", new Object[]{this, drawable});
        } else if (drawable != null) {
            float K = K(this.h);
            float J = J(this.h);
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            this.k.reset();
            float f2 = intrinsicWidth;
            float f3 = K / f2;
            float f4 = intrinsicHeight;
            float f5 = J / f4;
            ImageView.ScaleType scaleType = this.A;
            if (scaleType == ImageView.ScaleType.CENTER) {
                this.k.postTranslate((K - f2) / 2.0f, (J - f4) / 2.0f);
            } else if (scaleType == ImageView.ScaleType.CENTER_CROP) {
                float max = Math.max(f3, f5);
                this.k.postScale(max, max);
                this.k.postTranslate((K - (f2 * max)) / 2.0f, (J - (f4 * max)) / 2.0f);
            } else if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
                float min = Math.min(1.0f, Math.min(f3, f5));
                this.k.postScale(min, min);
                this.k.postTranslate((K - (f2 * min)) / 2.0f, (J - (f4 * min)) / 2.0f);
            } else {
                RectF rectF = new RectF(0.0f, 0.0f, f2, f4);
                RectF rectF2 = new RectF(0.0f, 0.0f, K, J);
                if (((int) 0.0f) % 180 != 0) {
                    rectF = new RectF(0.0f, 0.0f, f4, f2);
                }
                int i = d.$SwitchMap$android$widget$ImageView$ScaleType[this.A.ordinal()];
                if (i == 1) {
                    this.k.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
                } else if (i == 2) {
                    this.k.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
                } else if (i == 3) {
                    this.k.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
                } else if (i == 4) {
                    this.k.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
                }
            }
            U();
        }
    }
}
