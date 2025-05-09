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
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class j2m implements View.OnTouchListener, View.OnLayoutChangeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final float E = 3.0f;
    public static final float F = 1.75f;
    public static final float G = 1.0f;
    public static final int H = 200;
    public static final int I = 1;
    public final ark D;
    public final ImageView i;
    public final GestureDetector j;
    public final p05 k;
    public zsk q;
    public rsk r;
    public gwk s;
    public View.OnClickListener t;
    public View.OnLongClickListener u;
    public auk v;
    public tuk w;
    public bwk x;
    public f y;

    /* renamed from: a  reason: collision with root package name */
    public final Interpolator f21720a = new AccelerateDecelerateInterpolator();
    public int b = H;
    public float c = G;
    public float d = F;
    public float e = E;
    public boolean f = true;
    public boolean g = false;
    public boolean h = false;
    public final Matrix l = new Matrix();
    public final Matrix m = new Matrix();
    public final Matrix n = new Matrix();
    public final RectF o = new RectF();
    public final float[] p = new float[9];
    public int z = 2;
    public int A = 2;
    public boolean B = true;
    public ImageView.ScaleType C = ImageView.ScaleType.FIT_CENTER;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends GestureDetector.SimpleOnGestureListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tbsku/image/PhotoViewAttacher$2");
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f2b37f32", new Object[]{this, motionEvent, motionEvent2, new Float(f), new Float(f2)})).booleanValue();
            }
            if (j2m.j(j2m.this) == null || j2m.this.O() > j2m.k() || motionEvent.getPointerCount() > j2m.l() || motionEvent2.getPointerCount() > j2m.l()) {
                return false;
            }
            return j2m.j(j2m.this).onFling(motionEvent, motionEvent2, f, f2);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8638ede4", new Object[]{this, motionEvent});
            } else if (j2m.i(j2m.this) != null) {
                j2m.i(j2m.this).onLongClick(j2m.v(j2m.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
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
                float O = j2m.this.O();
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (O < j2m.this.M()) {
                    j2m j2mVar = j2m.this;
                    j2mVar.n0(j2mVar.M(), x, y, true);
                } else if (O < j2m.this.M() || O >= j2m.this.L()) {
                    j2m j2mVar2 = j2m.this;
                    j2mVar2.n0(j2mVar2.N(), x, y, true);
                } else {
                    j2m j2mVar3 = j2m.this;
                    j2mVar3.n0(j2mVar3.L(), x, y, true);
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
            if (j2m.m(j2m.this) != null) {
                j2m.m(j2m.this).onClick(j2m.v(j2m.this));
            }
            RectF F = j2m.this.F();
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (j2m.o(j2m.this) != null) {
                j2m.o(j2m.this).a(j2m.v(j2m.this), x, y);
            }
            if (F != null) {
                if (F.contains(x, y)) {
                    float width = (x - F.left) / F.width();
                    float height = (y - F.top) / F.height();
                    if (j2m.p(j2m.this) != null) {
                        j2m.p(j2m.this).a(j2m.v(j2m.this), width, height);
                    }
                    return true;
                } else if (j2m.q(j2m.this) != null) {
                    j2m.q(j2m.this).a(j2m.v(j2m.this));
                }
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements ark {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.ark
        public void a(float f, float f2, float f3, float f4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("65b91dba", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4)});
            } else if (!j2m.a(j2m.this).e()) {
                if (j2m.b(j2m.this) != null) {
                    j2m.b(j2m.this).a(f, f2);
                }
                j2m.n(j2m.this).postTranslate(f, f2);
                j2m.u(j2m.this);
                ViewParent parent = j2m.v(j2m.this).getParent();
                if (!j2m.w(j2m.this) || j2m.a(j2m.this).e() || j2m.x(j2m.this) || j2m.y(j2m.this)) {
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                } else if ((j2m.z(j2m.this) == 2 || ((j2m.z(j2m.this) == 0 && f >= 1.0f) || ((j2m.z(j2m.this) == 1 && f <= -1.0f) || ((j2m.A(j2m.this) == 0 && f2 >= 1.0f) || (j2m.A(j2m.this) == 1 && f2 <= -1.0f))))) && parent != null) {
                    parent.requestDisallowInterceptTouchEvent(false);
                }
            }
        }

        @Override // tb.ark
        public void b(float f, float f2, float f3, float f4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("94f7aec4", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4)});
                return;
            }
            j2m j2mVar = j2m.this;
            j2m j2mVar2 = j2m.this;
            j2m.d(j2mVar, new f(j2m.v(j2mVar2).getContext()));
            f c = j2m.c(j2m.this);
            j2m j2mVar3 = j2m.this;
            int e = j2m.e(j2mVar3, j2m.v(j2mVar3));
            j2m j2mVar4 = j2m.this;
            c.b(e, j2m.f(j2mVar4, j2m.v(j2mVar4)), (int) f3, (int) f4);
            j2m.v(j2m.this).post(j2m.c(j2m.this));
        }

        @Override // tb.ark
        public void c(float f, float f2, float f3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("60a624ce", new Object[]{this, new Float(f), new Float(f2), new Float(f3)});
            } else if (j2m.this.O() < j2m.g(j2m.this) || f < 1.0f) {
                if (j2m.h(j2m.this) != null) {
                    j2m.h(j2m.this).onScaleChange(f, f2, f3);
                }
                j2m.n(j2m.this).postScale(f, f, f2, f3);
                j2m.u(j2m.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
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
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final float f21724a;
        private final float b;
        private final long c = System.currentTimeMillis();
        private final float d;
        private final float e;

        static {
            t2o.a(785383534);
        }

        public e(float f, float f2, float f3, float f4) {
            this.f21724a = f3;
            this.b = f4;
            this.d = f;
            this.e = f2;
        }

        private float a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2637f4f8", new Object[]{this})).floatValue();
            }
            return j2m.t(j2m.this).getInterpolation(Math.min(1.0f, (((float) (System.currentTimeMillis() - this.c)) * 1.0f) / j2m.s(j2m.this)));
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
            j2m.r(j2m.this).c((f + ((this.e - f) * a2)) / j2m.this.O(), this.f21724a, this.b);
            if (a2 < 1.0f) {
                x84.a(j2m.v(j2m.this), this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final OverScroller f21725a;
        private int b;
        private int c;

        static {
            t2o.a(785383535);
        }

        public f(Context context) {
            this.f21725a = new OverScroller(context);
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("69b31e89", new Object[]{this});
            } else {
                this.f21725a.forceFinished(true);
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
            RectF F = j2m.this.F();
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
                    this.f21725a.fling(round, round2, i3, i4, i6, i5, i8, i7, 0, 0);
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!this.f21725a.isFinished() && this.f21725a.computeScrollOffset()) {
                int currX = this.f21725a.getCurrX();
                int currY = this.f21725a.getCurrY();
                j2m.n(j2m.this).postTranslate(this.b - currX, this.c - currY);
                j2m.u(j2m.this);
                this.b = currX;
                this.c = currY;
                x84.a(j2m.v(j2m.this), this);
            }
        }
    }

    static {
        t2o.a(785383529);
    }

    public j2m(ImageView imageView) {
        c cVar = new c();
        this.D = cVar;
        this.i = imageView;
        imageView.setOnTouchListener(this);
        imageView.addOnLayoutChangeListener(this);
        if (!imageView.isInEditMode()) {
            this.k = new p05(imageView.getContext(), cVar);
            GestureDetector gestureDetector = new GestureDetector(imageView.getContext(), new a());
            this.j = gestureDetector;
            gestureDetector.setOnDoubleTapListener(new b());
        }
    }

    public static /* synthetic */ int A(j2m j2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("adad4180", new Object[]{j2mVar})).intValue();
        }
        return j2mVar.A;
    }

    public static /* synthetic */ p05 a(j2m j2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p05) ipChange.ipc$dispatch("36203aca", new Object[]{j2mVar});
        }
        return j2mVar.k;
    }

    public static /* synthetic */ bwk b(j2m j2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bwk) ipChange.ipc$dispatch("291a5f03", new Object[]{j2mVar});
        }
        return j2mVar.x;
    }

    public static /* synthetic */ f c(j2m j2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("4052b3db", new Object[]{j2mVar});
        }
        return j2mVar.y;
    }

    public static /* synthetic */ f d(j2m j2mVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("99bedd01", new Object[]{j2mVar, fVar});
        }
        j2mVar.y = fVar;
        return fVar;
    }

    public static /* synthetic */ int e(j2m j2mVar, ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("181b9fa1", new Object[]{j2mVar, imageView})).intValue();
        }
        return j2mVar.K(imageView);
    }

    public static /* synthetic */ int f(j2m j2mVar, ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bf977962", new Object[]{j2mVar, imageView})).intValue();
        }
        return j2mVar.J(imageView);
    }

    public static /* synthetic */ float g(j2m j2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("995f2ee6", new Object[]{j2mVar})).floatValue();
        }
        return j2mVar.e;
    }

    public static /* synthetic */ auk h(j2m j2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (auk) ipChange.ipc$dispatch("b7581c04", new Object[]{j2mVar});
        }
        return j2mVar.v;
    }

    public static /* synthetic */ View.OnLongClickListener i(j2m j2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View.OnLongClickListener) ipChange.ipc$dispatch("b02deefd", new Object[]{j2mVar});
        }
        return j2mVar.u;
    }

    public static /* synthetic */ tuk j(j2m j2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tuk) ipChange.ipc$dispatch("3a7107ea", new Object[]{j2mVar});
        }
        return j2mVar.w;
    }

    public static /* synthetic */ float k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b836935d", new Object[0])).floatValue();
        }
        return G;
    }

    public static /* synthetic */ int l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed1ccea1", new Object[0])).intValue();
        }
        return I;
    }

    public static /* synthetic */ View.OnClickListener m(j2m j2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View.OnClickListener) ipChange.ipc$dispatch("3c9dd965", new Object[]{j2mVar});
        }
        return j2mVar.t;
    }

    public static /* synthetic */ Matrix n(j2m j2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Matrix) ipChange.ipc$dispatch("4afcb12", new Object[]{j2mVar});
        }
        return j2mVar.n;
    }

    public static /* synthetic */ gwk o(j2m j2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gwk) ipChange.ipc$dispatch("9aba4de7", new Object[]{j2mVar});
        }
        return j2mVar.s;
    }

    public static /* synthetic */ zsk p(j2m j2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zsk) ipChange.ipc$dispatch("828b0279", new Object[]{j2mVar});
        }
        return j2mVar.q;
    }

    public static /* synthetic */ rsk q(j2m j2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rsk) ipChange.ipc$dispatch("9d894d0d", new Object[]{j2mVar});
        }
        return j2mVar.r;
    }

    public static /* synthetic */ ark r(j2m j2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ark) ipChange.ipc$dispatch("348d2319", new Object[]{j2mVar});
        }
        return j2mVar.D;
    }

    public static /* synthetic */ int s(j2m j2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4be04f09", new Object[]{j2mVar})).intValue();
        }
        return j2mVar.b;
    }

    public static /* synthetic */ Interpolator t(j2m j2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Interpolator) ipChange.ipc$dispatch("a47bcac", new Object[]{j2mVar});
        }
        return j2mVar.f21720a;
    }

    public static /* synthetic */ void u(j2m j2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc350b87", new Object[]{j2mVar});
        } else {
            j2mVar.C();
        }
    }

    public static /* synthetic */ ImageView v(j2m j2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("86f41408", new Object[]{j2mVar});
        }
        return j2mVar.i;
    }

    public static /* synthetic */ boolean w(j2m j2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("175d1d8d", new Object[]{j2mVar})).booleanValue();
        }
        return j2mVar.f;
    }

    public static /* synthetic */ boolean x(j2m j2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3cf1268e", new Object[]{j2mVar})).booleanValue();
        }
        return j2mVar.g;
    }

    public static /* synthetic */ boolean y(j2m j2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("62852f8f", new Object[]{j2mVar})).booleanValue();
        }
        return j2mVar.h;
    }

    public static /* synthetic */ int z(j2m j2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8819387f", new Object[]{j2mVar})).intValue();
        }
        return j2mVar.z;
    }

    public final void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69b31e89", new Object[]{this});
            return;
        }
        f fVar = this.y;
        if (fVar != null) {
            fVar.a();
            this.y = null;
        }
    }

    public final void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("137cd23b", new Object[]{this});
        } else if (D()) {
            W(H());
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
        RectF G2 = G(H());
        if (G2 == null) {
            return false;
        }
        float height = G2.height();
        float width = G2.width();
        float J = J(this.i);
        float f7 = 0.0f;
        if (height <= J) {
            int i = d.$SwitchMap$android$widget$ImageView$ScaleType[this.C.ordinal()];
            if (i != 2) {
                if (i != 3) {
                    f5 = (J - height) / 2.0f;
                    f6 = G2.top;
                } else {
                    f5 = J - height;
                    f6 = G2.top;
                }
                f2 = f5 - f6;
            } else {
                f2 = -G2.top;
            }
            this.A = 2;
        } else {
            float f8 = G2.top;
            if (f8 > 0.0f) {
                this.A = 0;
                f2 = -f8;
            } else {
                float f9 = G2.bottom;
                if (f9 < J) {
                    this.A = 1;
                    f2 = J - f9;
                } else {
                    this.A = -1;
                    f2 = 0.0f;
                }
            }
        }
        float K = K(this.i);
        if (width <= K) {
            int i2 = d.$SwitchMap$android$widget$ImageView$ScaleType[this.C.ordinal()];
            if (i2 != 2) {
                if (i2 != 3) {
                    f3 = (K - width) / 2.0f;
                    f4 = G2.left;
                } else {
                    f3 = K - width;
                    f4 = G2.left;
                }
                f7 = f3 - f4;
            } else {
                f7 = -G2.left;
            }
            this.z = 2;
        } else {
            float f10 = G2.left;
            if (f10 > 0.0f) {
                this.z = 0;
                f7 = -f10;
            } else {
                float f11 = G2.right;
                if (f11 < K) {
                    f7 = K - f11;
                    this.z = 1;
                } else {
                    this.z = -1;
                }
            }
        }
        this.n.postTranslate(f7, f2);
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
        Drawable drawable = this.i.getDrawable();
        if (drawable == null) {
            return null;
        }
        this.o.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        matrix.mapRect(this.o);
        return this.o;
    }

    public final Matrix H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Matrix) ipChange.ipc$dispatch("859b19ae", new Object[]{this});
        }
        this.m.set(this.l);
        this.m.postConcat(this.n);
        return this.m;
    }

    public Matrix I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Matrix) ipChange.ipc$dispatch("83fe98d9", new Object[]{this});
        }
        return this.m;
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
        return (float) Math.sqrt(((float) Math.pow(R(this.n, 0), 2.0d)) + ((float) Math.pow(R(this.n, 3), 2.0d)));
    }

    public ImageView.ScaleType P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView.ScaleType) ipChange.ipc$dispatch("16d492db", new Object[]{this});
        }
        return this.C;
    }

    public void Q(Matrix matrix) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45bc841c", new Object[]{this, matrix});
        } else {
            matrix.set(this.n);
        }
    }

    public final float R(Matrix matrix, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d39f4459", new Object[]{this, matrix, new Integer(i)})).floatValue();
        }
        matrix.getValues(this.p);
        return this.p[i];
    }

    public boolean S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("73d17002", new Object[]{this})).booleanValue();
        }
        return this.B;
    }

    public final void T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c83a3677", new Object[]{this});
            return;
        }
        this.n.reset();
        k0(0.0f);
        W(H());
        D();
    }

    public void U(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74342f80", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    public boolean V(Matrix matrix) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6043578", new Object[]{this, matrix})).booleanValue();
        }
        if (matrix == null) {
            throw new IllegalArgumentException("Matrix cannot be null");
        } else if (this.i.getDrawable() == null) {
            return false;
        } else {
            this.n.set(matrix);
            C();
            return true;
        }
    }

    public final void W(Matrix matrix) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dace656", new Object[]{this, matrix});
        } else {
            this.i.setImageMatrix(matrix);
        }
    }

    public void X(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("203da70d", new Object[]{this, new Float(f2)});
            return;
        }
        kwv.a(this.c, this.d, f2);
        this.e = f2;
    }

    public void Y(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a92102e6", new Object[]{this, new Float(f2)});
            return;
        }
        kwv.a(this.c, f2, this.e);
        this.d = f2;
    }

    public void Z(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa3a6f7b", new Object[]{this, new Float(f2)});
            return;
        }
        kwv.a(f2, this.d, this.e);
        this.c = f2;
    }

    public void a0(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8408cbf7", new Object[]{this, onClickListener});
        } else {
            this.t = onClickListener;
        }
    }

    public void b0(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9ba033", new Object[]{this, onDoubleTapListener});
        } else {
            this.j.setOnDoubleTapListener(onDoubleTapListener);
        }
    }

    public void c0(View.OnLongClickListener onLongClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11f73f2f", new Object[]{this, onLongClickListener});
        } else {
            this.u = onLongClickListener;
        }
    }

    public void d0(esk eskVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e1a607b", new Object[]{this, eskVar});
        }
    }

    public void e0(rsk rskVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d29a81b", new Object[]{this, rskVar});
        } else {
            this.r = rskVar;
        }
    }

    public void f0(zsk zskVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57ff9a29", new Object[]{this, zskVar});
        } else {
            this.q = zskVar;
        }
    }

    public void g0(auk aukVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8efbde49", new Object[]{this, aukVar});
        } else {
            this.v = aukVar;
        }
    }

    public void h0(tuk tukVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35a337db", new Object[]{this, tukVar});
        } else {
            this.w = tukVar;
        }
    }

    public void i0(bwk bwkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9230a159", new Object[]{this, bwkVar});
        } else {
            this.x = bwkVar;
        }
    }

    public void j0(gwk gwkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2281d1b", new Object[]{this, gwkVar});
        } else {
            this.s = gwkVar;
        }
    }

    public void k0(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1665b002", new Object[]{this, new Float(f2)});
            return;
        }
        this.n.postRotate(f2 % 360.0f);
        C();
    }

    public void l0(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd85645e", new Object[]{this, new Float(f2)});
            return;
        }
        this.n.setRotate(f2 % 360.0f);
        C();
    }

    public void m0(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c41af11", new Object[]{this, new Float(f2)});
        } else {
            o0(f2, false);
        }
    }

    public void n0(float f2, float f3, float f4, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1466623", new Object[]{this, new Float(f2), new Float(f3), new Float(f4), new Boolean(z)});
        } else if (f2 < this.c || f2 > this.e) {
            throw new IllegalArgumentException("Scale must be within the range of minScale and maxScale");
        } else if (z) {
            this.i.post(new e(O(), f2, f3, f4));
        } else {
            this.n.setScale(f2, f2, f3, f4);
            C();
        }
    }

    public void o0(float f2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbf4e5e3", new Object[]{this, new Float(f2), new Boolean(z)});
        } else {
            n0(f2, this.i.getRight() / 2, this.i.getBottom() / 2, z);
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
        } else if (i != i5 || i2 != i6 || i3 != i7 || i4 != i8) {
            u0(this.i.getDrawable());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ea  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.j2m.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public void p0(float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8219bc62", new Object[]{this, new Float(f2), new Float(f3), new Float(f4)});
            return;
        }
        kwv.a(f2, f3, f4);
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }

    public void q0(ImageView.ScaleType scaleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("732a5c3", new Object[]{this, scaleType});
        } else if (kwv.d(scaleType) && scaleType != this.C) {
            this.C = scaleType;
            t0();
        }
    }

    public void r0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("253df7de", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }

    public void s0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5540e5e", new Object[]{this, new Boolean(z)});
            return;
        }
        this.B = z;
        t0();
    }

    public void t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee4a30d0", new Object[]{this});
        } else if (this.B) {
            u0(this.i.getDrawable());
        } else {
            T();
        }
    }

    public final void u0(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86e110c6", new Object[]{this, drawable});
        } else if (drawable != null) {
            float K = K(this.i);
            float J = J(this.i);
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            this.l.reset();
            float f2 = intrinsicWidth;
            float f3 = K / f2;
            float f4 = intrinsicHeight;
            float f5 = J / f4;
            ImageView.ScaleType scaleType = this.C;
            if (scaleType == ImageView.ScaleType.CENTER) {
                this.l.postTranslate((K - f2) / 2.0f, (J - f4) / 2.0f);
            } else if (scaleType == ImageView.ScaleType.CENTER_CROP) {
                float max = Math.max(f3, f5);
                this.l.postScale(max, max);
                this.l.postTranslate((K - (f2 * max)) / 2.0f, (J - (f4 * max)) / 2.0f);
            } else if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
                float min = Math.min(1.0f, Math.min(f3, f5));
                this.l.postScale(min, min);
                this.l.postTranslate((K - (f2 * min)) / 2.0f, (J - (f4 * min)) / 2.0f);
            } else {
                RectF rectF = new RectF(0.0f, 0.0f, f2, f4);
                RectF rectF2 = new RectF(0.0f, 0.0f, K, J);
                if (((int) 0.0f) % 180 != 0) {
                    rectF = new RectF(0.0f, 0.0f, f4, f2);
                }
                int i = d.$SwitchMap$android$widget$ImageView$ScaleType[this.C.ordinal()];
                if (i == 1) {
                    this.l.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
                } else if (i == 2) {
                    this.l.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
                } else if (i == 3) {
                    this.l.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
                } else if (i == 4) {
                    this.l.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
                }
            }
            T();
        }
    }
}
