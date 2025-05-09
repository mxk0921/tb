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
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class h2m implements View.OnTouchListener, View.OnLayoutChangeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final float F = 3.0f;
    public static final float G = 1.75f;
    public static final float H = 1.0f;
    public static final int I = 200;
    public static final int J = 1;
    public final drk E;
    public final ImageView i;
    public final GestureDetector j;
    public final r05 k;
    public atk q;
    public ssk r;
    public iwk s;
    public View.OnClickListener t;
    public View.OnLongClickListener u;
    public cuk v;
    public vuk w;
    public dwk x;
    public euk y;
    public f z;

    /* renamed from: a  reason: collision with root package name */
    public final Interpolator f20371a = new AccelerateDecelerateInterpolator();
    public int b = I;
    public float c = H;
    public float d = G;
    public float e = F;
    public boolean f = true;
    public boolean g = false;
    public boolean h = false;
    public final Matrix l = new Matrix();
    public final Matrix m = new Matrix();
    public final Matrix n = new Matrix();
    public final RectF o = new RectF();
    public final float[] p = new float[9];
    public int A = 2;
    public int B = 2;
    public boolean C = true;
    public ImageView.ScaleType D = ImageView.ScaleType.FIT_CENTER;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements drk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.drk
        public void a(float f, float f2, float f3, float f4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("65b91dba", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4)});
            } else if (!h2m.a(h2m.this).f()) {
                if (h2m.b(h2m.this) != null) {
                    h2m.b(h2m.this).a(f, f2);
                }
                h2m.n(h2m.this).postTranslate(f, f2);
                h2m.v(h2m.this);
                ViewParent parent = h2m.w(h2m.this).getParent();
                if (!h2m.x(h2m.this) || h2m.a(h2m.this).f() || h2m.y(h2m.this) || h2m.z(h2m.this)) {
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                } else if ((h2m.A(h2m.this) == 2 || ((h2m.A(h2m.this) == 0 && f >= 1.0f) || ((h2m.A(h2m.this) == 1 && f <= -1.0f) || ((h2m.B(h2m.this) == 0 && f2 >= 1.0f) || (h2m.B(h2m.this) == 1 && f2 <= -1.0f))))) && parent != null) {
                    parent.requestDisallowInterceptTouchEvent(false);
                }
            }
        }

        @Override // tb.drk
        public void b(float f, float f2, float f3, float f4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("94f7aec4", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4)});
                return;
            }
            h2m h2mVar = h2m.this;
            h2m h2mVar2 = h2m.this;
            h2m.d(h2mVar, new f(tq4.d(h2m.w(h2mVar2))));
            f c = h2m.c(h2m.this);
            h2m h2mVar3 = h2m.this;
            int e = h2m.e(h2mVar3, h2m.w(h2mVar3));
            h2m h2mVar4 = h2m.this;
            c.b(e, h2m.f(h2mVar4, h2m.w(h2mVar4)), (int) f3, (int) f4);
            h2m.w(h2m.this).post(h2m.c(h2m.this));
        }

        @Override // tb.drk
        public void c(float f, float f2, float f3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("60a624ce", new Object[]{this, new Float(f), new Float(f2), new Float(f3)});
            } else if (h2m.this.P() < h2m.g(h2m.this) || f < 1.0f) {
                if (h2m.h(h2m.this) != null) {
                    h2m.h(h2m.this).onScaleChange(f, f2, f3);
                }
                h2m.n(h2m.this).postScale(f, f, f2, f3);
                h2m.v(h2m.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b extends GestureDetector.SimpleOnGestureListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/widget/photoview/PhotoViewAttacher$2");
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f2b37f32", new Object[]{this, motionEvent, motionEvent2, new Float(f), new Float(f2)})).booleanValue();
            }
            if (h2m.j(h2m.this) == null || h2m.this.P() > h2m.k() || motionEvent.getPointerCount() > h2m.l() || motionEvent2.getPointerCount() > h2m.l()) {
                return false;
            }
            return h2m.j(h2m.this).onFling(motionEvent, motionEvent2, f, f2);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8638ede4", new Object[]{this, motionEvent});
            } else if (h2m.i(h2m.this) != null) {
                h2m.i(h2m.this).onLongClick(h2m.w(h2m.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements GestureDetector.OnDoubleTapListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7a319393", new Object[]{this, motionEvent})).booleanValue();
            }
            try {
                float P = h2m.this.P();
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (P < h2m.this.N()) {
                    h2m h2mVar = h2m.this;
                    h2mVar.p0(h2mVar.N(), x, y, true);
                } else if (P < h2m.this.N() || P >= h2m.this.M()) {
                    h2m h2mVar2 = h2m.this;
                    h2mVar2.p0(h2mVar2.O(), x, y, true);
                } else {
                    h2m h2mVar3 = h2m.this;
                    h2mVar3.p0(h2mVar3.M(), x, y, true);
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
            if (h2m.m(h2m.this) != null) {
                h2m.m(h2m.this).onClick(h2m.w(h2m.this));
            }
            RectF G = h2m.this.G();
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (h2m.o(h2m.this) != null) {
                h2m.o(h2m.this).a(h2m.w(h2m.this), x, y);
            }
            if (G != null) {
                if (G.contains(x, y)) {
                    float width = (x - G.left) / G.width();
                    float height = (y - G.top) / G.height();
                    if (h2m.p(h2m.this) != null) {
                        h2m.p(h2m.this).a(h2m.w(h2m.this), width, height);
                    }
                    return true;
                } else if (h2m.q(h2m.this) != null) {
                    h2m.q(h2m.this).a(h2m.w(h2m.this));
                }
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
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
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final float f20375a;
        private final float b;
        private final long c = System.currentTimeMillis();
        private final float d;
        private final float e;

        static {
            t2o.a(912263060);
        }

        public e(float f, float f2, float f3, float f4) {
            this.f20375a = f3;
            this.b = f4;
            this.d = f;
            this.e = f2;
        }

        private float a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2637f4f8", new Object[]{this})).floatValue();
            }
            return h2m.u(h2m.this).getInterpolation(Math.min(1.0f, (((float) (System.currentTimeMillis() - this.c)) * 1.0f) / h2m.t(h2m.this)));
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
            h2m.r(h2m.this).c((f + ((this.e - f) * a2)) / h2m.this.P(), this.f20375a, this.b);
            if (a2 < 1.0f) {
                b94.a(h2m.w(h2m.this), this);
            } else if (h2m.s(h2m.this) != null) {
                h2m.s(h2m.this).a(this.d, this.e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final OverScroller f20376a;
        private int b;
        private int c;

        static {
            t2o.a(912263061);
        }

        public f(Context context) {
            this.f20376a = new OverScroller(context);
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("69b31e89", new Object[]{this});
            } else {
                this.f20376a.forceFinished(true);
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
            RectF G = h2m.this.G();
            if (G != null) {
                int round = Math.round(-G.left);
                float f = i;
                if (f < G.width()) {
                    i5 = Math.round(G.width() - f);
                    i6 = 0;
                } else {
                    i6 = round;
                    i5 = i6;
                }
                int round2 = Math.round(-G.top);
                float f2 = i2;
                if (f2 < G.height()) {
                    i7 = Math.round(G.height() - f2);
                    i8 = 0;
                } else {
                    i8 = round2;
                    i7 = i8;
                }
                this.b = round;
                this.c = round2;
                if (round != i5 || round2 != i7) {
                    this.f20376a.fling(round, round2, i3, i4, i6, i5, i8, i7, 0, 0);
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!this.f20376a.isFinished() && this.f20376a.computeScrollOffset()) {
                int currX = this.f20376a.getCurrX();
                int currY = this.f20376a.getCurrY();
                h2m.n(h2m.this).postTranslate(this.b - currX, this.c - currY);
                h2m.v(h2m.this);
                this.b = currX;
                this.c = currY;
                b94.a(h2m.w(h2m.this), this);
            }
        }
    }

    static {
        t2o.a(912263055);
    }

    public h2m(ImageView imageView) {
        a aVar = new a();
        this.E = aVar;
        this.i = imageView;
        imageView.setOnTouchListener(this);
        imageView.addOnLayoutChangeListener(this);
        if (!imageView.isInEditMode()) {
            this.k = new r05(tq4.d(imageView), aVar);
            GestureDetector gestureDetector = new GestureDetector(tq4.d(imageView), new b());
            this.j = gestureDetector;
            gestureDetector.setOnDoubleTapListener(new c());
        }
    }

    public static /* synthetic */ int A(h2m h2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bafa237c", new Object[]{h2mVar})).intValue();
        }
        return h2mVar.A;
    }

    public static /* synthetic */ int B(h2m h2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d3fb751b", new Object[]{h2mVar})).intValue();
        }
        return h2mVar.B;
    }

    public static /* synthetic */ r05 a(h2m h2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r05) ipChange.ipc$dispatch("482cb594", new Object[]{h2mVar});
        }
        return h2mVar.k;
    }

    public static /* synthetic */ dwk b(h2m h2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dwk) ipChange.ipc$dispatch("4adfe739", new Object[]{h2mVar});
        }
        return h2mVar.x;
    }

    public static /* synthetic */ f c(h2m h2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("91eccce5", new Object[]{h2mVar});
        }
        return h2mVar.z;
    }

    public static /* synthetic */ f d(h2m h2mVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("82550596", new Object[]{h2mVar, fVar});
        }
        h2mVar.z = fVar;
        return fVar;
    }

    public static /* synthetic */ int e(h2m h2mVar, ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4c71448e", new Object[]{h2mVar, imageView})).intValue();
        }
        return h2mVar.L(imageView);
    }

    public static /* synthetic */ int f(h2m h2mVar, ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("75d8bd6d", new Object[]{h2mVar, imageView})).intValue();
        }
        return h2mVar.K(imageView);
    }

    public static /* synthetic */ float g(h2m h2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cb89334f", new Object[]{h2mVar})).floatValue();
        }
        return h2mVar.e;
    }

    public static /* synthetic */ cuk h(h2m h2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cuk) ipChange.ipc$dispatch("988c4aba", new Object[]{h2mVar});
        }
        return h2mVar.v;
    }

    public static /* synthetic */ View.OnLongClickListener i(h2m h2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View.OnLongClickListener) ipChange.ipc$dispatch("3ba20e2", new Object[]{h2mVar});
        }
        return h2mVar.u;
    }

    public static /* synthetic */ vuk j(h2m h2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vuk) ipChange.ipc$dispatch("63343cf4", new Object[]{h2mVar});
        }
        return h2mVar.w;
    }

    public static /* synthetic */ float k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b836935d", new Object[0])).floatValue();
        }
        return H;
    }

    public static /* synthetic */ int l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed1ccea1", new Object[0])).intValue();
        }
        return J;
    }

    public static /* synthetic */ View.OnClickListener m(h2m h2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View.OnClickListener) ipChange.ipc$dispatch("a5774a42", new Object[]{h2mVar});
        }
        return h2mVar.t;
    }

    public static /* synthetic */ Matrix n(h2m h2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Matrix) ipChange.ipc$dispatch("f251f75b", new Object[]{h2mVar});
        }
        return h2mVar.n;
    }

    public static /* synthetic */ iwk o(h2m h2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iwk) ipChange.ipc$dispatch("a8d99f31", new Object[]{h2mVar});
        }
        return h2mVar.s;
    }

    public static /* synthetic */ atk p(h2m h2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (atk) ipChange.ipc$dispatch("3aad92f", new Object[]{h2mVar});
        }
        return h2mVar.q;
    }

    public static /* synthetic */ ssk q(h2m h2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ssk) ipChange.ipc$dispatch("62b586d7", new Object[]{h2mVar});
        }
        return h2mVar.r;
    }

    public static /* synthetic */ drk r(h2m h2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (drk) ipChange.ipc$dispatch("e2bcf023", new Object[]{h2mVar});
        }
        return h2mVar.E;
    }

    public static /* synthetic */ euk s(h2m h2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (euk) ipChange.ipc$dispatch("e6302e89", new Object[]{h2mVar});
        }
        return h2mVar.y;
    }

    public static /* synthetic */ int t(h2m h2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4b4b8d1", new Object[]{h2mVar})).intValue();
        }
        return h2mVar.b;
    }

    public static /* synthetic */ Interpolator u(h2m h2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Interpolator) ipChange.ipc$dispatch("eff6b412", new Object[]{h2mVar});
        }
        return h2mVar.f20371a;
    }

    public static /* synthetic */ void v(h2m h2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3df38b6e", new Object[]{h2mVar});
        } else {
            h2mVar.D();
        }
    }

    public static /* synthetic */ ImageView w(h2m h2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("77017b23", new Object[]{h2mVar});
        }
        return h2mVar.i;
    }

    public static /* synthetic */ boolean x(h2m h2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ff62eb0", new Object[]{h2mVar})).booleanValue();
        }
        return h2mVar.f;
    }

    public static /* synthetic */ boolean y(h2m h2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88f7804f", new Object[]{h2mVar})).booleanValue();
        }
        return h2mVar.g;
    }

    public static /* synthetic */ boolean z(h2m h2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a1f8d1ee", new Object[]{h2mVar})).booleanValue();
        }
        return h2mVar.h;
    }

    public final void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69b31e89", new Object[]{this});
            return;
        }
        f fVar = this.z;
        if (fVar != null) {
            fVar.a();
            this.z = null;
        }
    }

    public final void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("137cd23b", new Object[]{this});
        } else if (E()) {
            X(I());
        }
    }

    public final boolean E() {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69f5a889", new Object[]{this})).booleanValue();
        }
        RectF H2 = H(I());
        if (H2 == null) {
            return false;
        }
        float height = H2.height();
        float width = H2.width();
        float K = K(this.i);
        float f7 = 0.0f;
        if (height <= K) {
            int i = d.$SwitchMap$android$widget$ImageView$ScaleType[this.D.ordinal()];
            if (i != 2) {
                if (i != 3) {
                    f5 = (K - height) / 2.0f;
                    f6 = H2.top;
                } else {
                    f5 = K - height;
                    f6 = H2.top;
                }
                f2 = f5 - f6;
            } else {
                f2 = -H2.top;
            }
            this.B = 2;
        } else {
            float f8 = H2.top;
            if (f8 > 0.0f) {
                this.B = 0;
                f2 = -f8;
            } else {
                float f9 = H2.bottom;
                if (f9 < K) {
                    this.B = 1;
                    f2 = K - f9;
                } else {
                    this.B = -1;
                    f2 = 0.0f;
                }
            }
        }
        float L = L(this.i);
        if (width <= L) {
            int i2 = d.$SwitchMap$android$widget$ImageView$ScaleType[this.D.ordinal()];
            if (i2 != 2) {
                if (i2 != 3) {
                    f3 = (L - width) / 2.0f;
                    f4 = H2.left;
                } else {
                    f3 = L - width;
                    f4 = H2.left;
                }
                f7 = f3 - f4;
            } else {
                f7 = -H2.left;
            }
            this.A = 2;
        } else {
            float f10 = H2.left;
            if (f10 > 0.0f) {
                this.A = 0;
                f7 = -f10;
            } else {
                float f11 = H2.right;
                if (f11 < L) {
                    f7 = L - f11;
                    this.A = 1;
                } else {
                    this.A = -1;
                }
            }
        }
        this.n.postTranslate(f7, f2);
        return true;
    }

    public void F(Matrix matrix) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("667b1768", new Object[]{this, matrix});
        } else {
            matrix.set(I());
        }
    }

    public RectF G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("c7965670", new Object[]{this});
        }
        E();
        return H(I());
    }

    public final RectF H(Matrix matrix) {
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

    public final Matrix I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Matrix) ipChange.ipc$dispatch("859b19ae", new Object[]{this});
        }
        this.m.set(this.l);
        this.m.postConcat(this.n);
        return this.m;
    }

    public Matrix J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Matrix) ipChange.ipc$dispatch("83fe98d9", new Object[]{this});
        }
        return this.m;
    }

    public final int K(ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a920a365", new Object[]{this, imageView})).intValue();
        }
        return (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
    }

    public final int L(ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aa004070", new Object[]{this, imageView})).intValue();
        }
        return (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
    }

    public float M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d0aa8df7", new Object[]{this})).floatValue();
        }
        return this.e;
    }

    public float N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ad95ce96", new Object[]{this})).floatValue();
        }
        return this.d;
    }

    public float O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ccdbffc9", new Object[]{this})).floatValue();
        }
        return this.c;
    }

    public float P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8f6c4a0b", new Object[]{this})).floatValue();
        }
        return (float) Math.sqrt(((float) Math.pow(S(this.n, 0), 2.0d)) + ((float) Math.pow(S(this.n, 3), 2.0d)));
    }

    public ImageView.ScaleType Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView.ScaleType) ipChange.ipc$dispatch("16d492db", new Object[]{this});
        }
        return this.D;
    }

    public void R(Matrix matrix) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45bc841c", new Object[]{this, matrix});
        } else {
            matrix.set(this.n);
        }
    }

    public final float S(Matrix matrix, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d39f4459", new Object[]{this, matrix, new Integer(i)})).floatValue();
        }
        matrix.getValues(this.p);
        return this.p[i];
    }

    public boolean T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("73d17002", new Object[]{this})).booleanValue();
        }
        return this.C;
    }

    public final void U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c83a3677", new Object[]{this});
            return;
        }
        this.n.reset();
        m0(0.0f);
        X(I());
        E();
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
        } else if (this.i.getDrawable() == null) {
            return false;
        } else {
            this.n.set(matrix);
            D();
            return true;
        }
    }

    public final void X(Matrix matrix) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dace656", new Object[]{this, matrix});
        } else {
            this.i.setImageMatrix(matrix);
        }
    }

    public void Y(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("203da70d", new Object[]{this, new Float(f2)});
            return;
        }
        iwv.a(this.c, this.d, f2);
        this.e = f2;
    }

    public void Z(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a92102e6", new Object[]{this, new Float(f2)});
            return;
        }
        iwv.a(this.c, f2, this.e);
        this.d = f2;
    }

    public void a0(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa3a6f7b", new Object[]{this, new Float(f2)});
            return;
        }
        iwv.a(f2, this.d, this.e);
        this.c = f2;
    }

    public void b0(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8408cbf7", new Object[]{this, onClickListener});
        } else {
            this.t = onClickListener;
        }
    }

    public void c0(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9ba033", new Object[]{this, onDoubleTapListener});
        } else {
            this.j.setOnDoubleTapListener(onDoubleTapListener);
        }
    }

    public void d0(View.OnLongClickListener onLongClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11f73f2f", new Object[]{this, onLongClickListener});
        } else {
            this.u = onLongClickListener;
        }
    }

    public void e0(gsk gskVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6d0721c", new Object[]{this, gskVar});
        }
    }

    public void f0(ssk sskVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18e58316", new Object[]{this, sskVar});
        } else {
            this.r = sskVar;
        }
    }

    public void g0(atk atkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("793f368", new Object[]{this, atkVar});
        } else {
            this.q = atkVar;
        }
    }

    public void h0(cuk cukVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3df5b836", new Object[]{this, cukVar});
        } else {
            this.v = cukVar;
        }
    }

    public void i0(euk eukVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("122ad508", new Object[]{this, eukVar});
            return;
        }
        this.y = eukVar;
        this.k.i(eukVar);
    }

    public void j0(vuk vukVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc82bcda", new Object[]{this, vukVar});
        } else {
            this.w = vukVar;
        }
    }

    public void k0(dwk dwkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b12fe68", new Object[]{this, dwkVar});
        } else {
            this.x = dwkVar;
        }
    }

    public void l0(iwk iwkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1546646", new Object[]{this, iwkVar});
        } else {
            this.s = iwkVar;
        }
    }

    public void m0(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1665b002", new Object[]{this, new Float(f2)});
            return;
        }
        this.n.postRotate(f2 % 360.0f);
        D();
    }

    public void n0(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd85645e", new Object[]{this, new Float(f2)});
            return;
        }
        this.n.setRotate(f2 % 360.0f);
        D();
    }

    public void o0(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c41af11", new Object[]{this, new Float(f2)});
        } else {
            q0(f2, false);
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
        } else if (i != i5 || i2 != i6 || i3 != i7 || i4 != i8) {
            w0(this.i.getDrawable());
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
        throw new UnsupportedOperationException("Method not decompiled: tb.h2m.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public void p0(float f2, float f3, float f4, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1466623", new Object[]{this, new Float(f2), new Float(f3), new Float(f4), new Boolean(z)});
        } else if (f2 < this.c || f2 > this.e) {
            throw new IllegalArgumentException("Scale must be within the range of minScale and maxScale");
        } else if (z) {
            this.i.post(new e(P(), f2, f3, f4));
        } else {
            this.n.setScale(f2, f2, f3, f4);
            D();
        }
    }

    public void q0(float f2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbf4e5e3", new Object[]{this, new Float(f2), new Boolean(z)});
        } else {
            p0(f2, this.i.getRight() / 2, this.i.getBottom() / 2, z);
        }
    }

    public void r0(float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8219bc62", new Object[]{this, new Float(f2), new Float(f3), new Float(f4)});
            return;
        }
        iwv.a(f2, f3, f4);
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }

    public void s0(ImageView.ScaleType scaleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("732a5c3", new Object[]{this, scaleType});
        } else if (iwv.d(scaleType) && scaleType != this.D) {
            this.D = scaleType;
            v0();
        }
    }

    public void t0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("253df7de", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }

    public void u0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5540e5e", new Object[]{this, new Boolean(z)});
            return;
        }
        this.C = z;
        v0();
    }

    public void v0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee4a30d0", new Object[]{this});
        } else if (this.C) {
            w0(this.i.getDrawable());
        } else {
            U();
        }
    }

    public final void w0(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86e110c6", new Object[]{this, drawable});
        } else if (drawable != null) {
            float L = L(this.i);
            float K = K(this.i);
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            this.l.reset();
            float f2 = intrinsicWidth;
            float f3 = L / f2;
            float f4 = intrinsicHeight;
            float f5 = K / f4;
            ImageView.ScaleType scaleType = this.D;
            if (scaleType == ImageView.ScaleType.CENTER) {
                this.l.postTranslate((L - f2) / 2.0f, (K - f4) / 2.0f);
            } else if (scaleType == ImageView.ScaleType.CENTER_CROP) {
                float max = Math.max(f3, f5);
                this.l.postScale(max, max);
                this.l.postTranslate((L - (f2 * max)) / 2.0f, (K - (f4 * max)) / 2.0f);
            } else if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
                float min = Math.min(1.0f, Math.min(f3, f5));
                this.l.postScale(min, min);
                this.l.postTranslate((L - (f2 * min)) / 2.0f, (K - (f4 * min)) / 2.0f);
            } else {
                RectF rectF = new RectF(0.0f, 0.0f, f2, f4);
                RectF rectF2 = new RectF(0.0f, 0.0f, L, K);
                if (((int) 0.0f) % 180 != 0) {
                    rectF = new RectF(0.0f, 0.0f, f4, f2);
                }
                int i = d.$SwitchMap$android$widget$ImageView$ScaleType[this.D.ordinal()];
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
            U();
        }
    }
}
