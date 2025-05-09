package com.etao.feimagesearch.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import tb.t2o;
import tb.zb7;
import tb.zs7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class RegionDotAnimView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DOT_MAX_DISTANCE = zb7.a(80.0f);
    private static final int DOT_RADIUS = zb7.a(3.5f);
    public static final int DURATION = 400;
    private static final int MAX_START_DELAY = 100;
    private boolean animated;
    private zs7 dotLogic;
    private List<RectF> rects;
    private List<b> mDots = new LinkedList();
    private Paint paint = new Paint(1);
    private ValueAnimator animator = ValueAnimator.ofInt(0, 500);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
            } else if (!RegionDotAnimView.access$000(RegionDotAnimView.this).isEmpty()) {
                for (b bVar : RegionDotAnimView.access$000(RegionDotAnimView.this)) {
                    b.a(bVar);
                }
                RegionDotAnimView.this.invalidate();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public float f4876a;
        public float b;
        public float c;
        public float d;
        public float e;
        public float f;
        public float g;
        public float h;
        public float i;
        public final int j = new Random(System.currentTimeMillis()).nextInt(100);
        public int k;
        public long l;
        public float m;
        public float n;

        static {
            t2o.a(481297544);
        }

        public static /* synthetic */ void a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d5a59086", new Object[]{bVar});
            } else {
                bVar.f();
            }
        }

        public static /* synthetic */ void b(b bVar, Canvas canvas, Paint paint) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a95fa4f5", new Object[]{bVar, canvas, paint});
            } else {
                bVar.d(canvas, paint);
            }
        }

        public void c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c1d6eb87", new Object[]{this, new Boolean(z)});
                return;
            }
            float f = this.d;
            float f2 = this.b;
            float f3 = this.c;
            float f4 = this.f4876a;
            float f5 = (f - f2) / (f3 - f4);
            this.e = f5;
            this.f = f2 - (f5 * f4);
            float abs = Math.abs(f4 - f3) / 400.0f;
            this.g = abs;
            this.n = 0.002f;
            if (z) {
                this.g = -abs;
            }
        }

        public final void d(Canvas canvas, Paint paint) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9fa8ce0f", new Object[]{this, canvas, paint});
            } else if (e()) {
                paint.setAlpha((int) (this.m * 255.0f));
                canvas.drawCircle(this.h, this.i, RegionDotAnimView.access$300(), paint);
            }
        }

        public final boolean e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b3aa8873", new Object[]{this})).booleanValue();
            }
            if (this.k >= this.j) {
                return true;
            }
            return false;
        }

        public final void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2ab36834", new Object[]{this});
            } else if (this.l == 0) {
                this.l = System.currentTimeMillis();
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                long j = currentTimeMillis - this.l;
                this.l = currentTimeMillis;
                int i = (int) (this.k + j);
                this.k = i;
                int i2 = this.j;
                if (i >= i2) {
                    if (i > 400) {
                        this.k = 400;
                    }
                    float f = this.g;
                    int i3 = this.k;
                    float f2 = this.c + ((int) (f * (i3 - i2)));
                    this.h = f2;
                    this.i = (this.e * f2) + this.f;
                    float f3 = 1.0f - (this.n * i3);
                    this.m = f3;
                    if (f3 < 0.2f) {
                        this.m = 0.2f;
                    }
                }
            }
        }
    }

    static {
        t2o.a(481297542);
    }

    public RegionDotAnimView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public static /* synthetic */ List access$000(RegionDotAnimView regionDotAnimView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c1f6e59c", new Object[]{regionDotAnimView});
        }
        return regionDotAnimView.mDots;
    }

    public static /* synthetic */ int access$300() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b88b92d", new Object[0])).intValue();
        }
        return DOT_RADIUS;
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.dotLogic = new zs7(this, 200);
        this.paint.setColor(-1);
        this.animator.setDuration(500L);
        this.animator.addUpdateListener(new a());
        this.animator.setInterpolator(new AccelerateDecelerateInterpolator());
    }

    private void initDots(List<b> list, float f, float f2, int i, int i2, int i3) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i4;
        int i5;
        boolean z6;
        float f3;
        float f4;
        int i6;
        int i7;
        float f5;
        float f6;
        int i8;
        int i9;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb67b5f1", new Object[]{this, list, new Float(f), new Float(f2), new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        Random random = new Random(System.currentTimeMillis());
        for (int i10 = 0; i10 < i; i10++) {
            int nextInt = random.nextInt(50);
            int nextInt2 = random.nextInt(50);
            if (random.nextInt(100) % 2 == 0) {
                z = true;
            } else {
                z = false;
            }
            if (random.nextInt(100) % 2 == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (random.nextInt(100) % 2 == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z) {
                nextInt = -nextInt;
            }
            if (z2) {
                nextInt2 = -nextInt2;
            }
            float f7 = i2;
            int i11 = (int) (f + (f7 / 2.0f));
            float f8 = i3;
            int i12 = (int) ((f8 / 2.0f) + f2);
            if (nextInt < 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (nextInt2 < 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z3) {
                if (z4) {
                    f5 = f - random.nextInt(DOT_MAX_DISTANCE);
                } else {
                    f5 = f + f7 + random.nextInt(DOT_MAX_DISTANCE);
                }
                i5 = (int) f5;
                if (z5) {
                    f6 = ((i3 / 2) + f2) - random.nextInt(i9);
                } else {
                    f6 = (i3 / 2) + f2 + random.nextInt(i8);
                }
                i4 = (int) f6;
            } else {
                if (z4) {
                    f3 = ((i2 / 2) + f) - random.nextInt(i7);
                } else {
                    f3 = (i2 / 2) + f + random.nextInt(i6);
                }
                int i13 = (int) f3;
                if (z5) {
                    f4 = f2 - random.nextInt(DOT_MAX_DISTANCE);
                } else {
                    f4 = f8 + f2 + random.nextInt(DOT_MAX_DISTANCE);
                }
                i4 = (int) f4;
                i5 = i13;
            }
            b bVar = new b();
            bVar.f4876a = i11;
            bVar.b = i12;
            bVar.c = i5;
            bVar.d = i4;
            if (i5 > i11) {
                z6 = true;
            } else {
                z6 = false;
            }
            bVar.c(z6);
            list.add(bVar);
        }
    }

    public static /* synthetic */ Object ipc$super(RegionDotAnimView regionDotAnimView, String str, Object... objArr) {
        if (str.hashCode() == 1389530587) {
            super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/ui/RegionDotAnimView");
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
        } else if (!this.mDots.isEmpty()) {
            if (!this.mDots.isEmpty()) {
                for (b bVar : this.mDots) {
                    b.b(bVar, canvas, this.paint);
                }
                if (!this.animated) {
                    this.animated = true;
                    this.animator.start();
                    this.dotLogic.h();
                }
            }
            if (!this.dotLogic.f()) {
                this.dotLogic.d(canvas);
            }
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (this.rects != null) {
            this.mDots.clear();
            this.dotLogic.c();
            this.animated = true;
            this.dotLogic.g(this.rects);
            for (RectF rectF : this.rects) {
                try {
                    initDots(this.mDots, rectF.left * getWidth(), rectF.top * getHeight(), 10, (int) (getWidth() * rectF.width()), (int) (getHeight() * rectF.height()));
                } catch (Exception unused) {
                }
            }
            this.animated = false;
            this.rects = null;
            invalidate();
        }
    }

    public void setRegion(List<RectF> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da800a6e", new Object[]{this, list});
        } else {
            this.rects = list;
        }
    }

    public RegionDotAnimView(Context context) {
        super(context);
        init();
    }
}
