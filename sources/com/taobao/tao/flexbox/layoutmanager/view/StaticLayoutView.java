package com.taobao.tao.flexbox.layoutmanager.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Picture;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.Layout;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.component.RichTextContainerComponent;
import tb.akt;
import tb.db8;
import tb.ey8;
import tb.i5c;
import tb.iu3;
import tb.s6o;
import tb.slt;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class StaticLayoutView extends View implements i5c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final boolean fixTextDraw = akt.s0();
    private ey8 fadingEdge;
    private slt helper;
    private int mTextAlignment;
    private Layout textLayout;
    private boolean drawed = false;
    private c marquee = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a extends LinearInterpolator {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final float f12383a;

        static {
            t2o.a(503317486);
        }

        public a(long j, int i) {
            this.f12383a = (((float) (j - i)) * 1.0f) / ((float) j);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 583500507) {
                return new Float(super.getInterpolation(((Number) objArr[0]).floatValue()));
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/view/StaticLayoutView$DelayLinearInterpolator");
        }

        @Override // android.view.animation.LinearInterpolator, android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("22c782db", new Object[]{this, new Float(f)})).floatValue();
            }
            float f2 = this.f12383a;
            if (f2 == 1.0f) {
                return super.getInterpolation(f);
            }
            if (f >= f2) {
                return 1.0f;
            }
            return f / f2;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b extends c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements ValueAnimator.AnimatorUpdateListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    return;
                }
                b.this.f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ViewCompat.postInvalidateOnAnimation(StaticLayoutView.this);
            }
        }

        static {
            t2o.a(503317487);
        }

        public b(d dVar) {
            super(dVar);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == 413504417) {
                super.c((Layout) objArr[0]);
                return null;
            } else if (hashCode == 2116940252) {
                return new Boolean(super.d((Canvas) objArr[0], (Layout) objArr[1], ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue()));
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/flexbox/layoutmanager/view/StaticLayoutView$LegacyMarquee");
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView.c
        public void c(Layout layout) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("18a593a1", new Object[]{this, layout});
            } else if (this.c > 0 || this.e > 0) {
                super.c(layout);
            } else {
                i(layout);
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView.c
        public boolean d(Canvas canvas, Layout layout, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7e2df1dc", new Object[]{this, canvas, layout, new Integer(i), new Integer(i2)})).booleanValue();
            }
            if (this.c > 0 || this.e > 0) {
                return super.d(canvas, layout, i, i2);
            }
            return false;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView.c
        public boolean g() {
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c873deb", new Object[]{this})).booleanValue();
            }
            h();
            Layout textLayout = StaticLayoutView.this.getTextLayout();
            if (textLayout != null && StaticLayoutView.access$200(StaticLayoutView.this) != null && StaticLayoutView.access$200(StaticLayoutView.this).D() == TextUtils.TruncateAt.MARQUEE && StaticLayoutView.access$000(StaticLayoutView.this) < textLayout.getWidth()) {
                this.j.sendEmptyMessageDelayed(0, 1000L);
                z = true;
            }
            if (StaticLayoutView.access$400(StaticLayoutView.this) != null) {
                StaticLayoutView.access$400(StaticLayoutView.this).a(z);
            }
            return z;
        }

        public final void i(Layout layout) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("da440d98", new Object[]{this, layout});
                return;
            }
            int width = layout.getWidth();
            int access$000 = StaticLayoutView.access$000(StaticLayoutView.this);
            int i = width + access$000;
            int c = (i / s6o.c(StaticLayoutView.this.getContext(), 1)) * 20;
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator == null) {
                ValueAnimator ofInt = ValueAnimator.ofInt(access$000, -width);
                this.h = ofInt;
                ofInt.setInterpolator(new LinearInterpolator());
                this.h.setDuration(c);
                this.h.setRepeatCount(-1);
                this.h.addUpdateListener(new a());
            } else {
                valueAnimator.cancel();
            }
            this.h.start();
            this.h.setCurrentPlayTime((access$000 * c) / i);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface d {
        void onStateChange(String str);
    }

    static {
        t2o.a(503317485);
        t2o.a(503316910);
    }

    public StaticLayoutView(Context context) {
        super(context);
    }

    public static /* synthetic */ int access$000(StaticLayoutView staticLayoutView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e40425bb", new Object[]{staticLayoutView})).intValue();
        }
        return staticLayoutView.getDisplayWidth();
    }

    public static /* synthetic */ int access$100(StaticLayoutView staticLayoutView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bfc5a17c", new Object[]{staticLayoutView})).intValue();
        }
        return staticLayoutView.getDisplayHeight();
    }

    public static /* synthetic */ slt access$200(StaticLayoutView staticLayoutView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (slt) ipChange.ipc$dispatch("2ba9ab0e", new Object[]{staticLayoutView});
        }
        return staticLayoutView.helper;
    }

    public static /* synthetic */ ey8 access$400(StaticLayoutView staticLayoutView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ey8) ipChange.ipc$dispatch("3bd98160", new Object[]{staticLayoutView});
        }
        return staticLayoutView.fadingEdge;
    }

    private int getDisplayHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("42401bcd", new Object[]{this})).intValue();
        }
        if (fixTextDraw) {
            return getHeight();
        }
        return getMeasuredHeight();
    }

    private int getDisplayWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4638814", new Object[]{this})).intValue();
        }
        if (fixTextDraw) {
            return getWidth();
        }
        return getMeasuredWidth();
    }

    private boolean handleCompositeSpanClick(RichTextContainerComponent.g gVar, Layout layout, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b290868", new Object[]{this, gVar, layout, motionEvent})).booleanValue();
        }
        if (gVar == null) {
            return false;
        }
        RichTextContainerComponent.e a2 = gVar.a();
        if (!(a2 instanceof iu3.a) || !iu3.c(this, layout, a2.u(), RichTextContainerComponent.e.class, motionEvent, true)) {
            return false;
        }
        return true;
    }

    private boolean handleEllipsizeSpanClick(db8 db8Var, Layout layout, MotionEvent motionEvent) {
        ReplacementSpan replacementSpan;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("19fdf5ad", new Object[]{this, db8Var, layout, motionEvent})).booleanValue();
        }
        slt sltVar = this.helper;
        if (sltVar != null) {
            replacementSpan = sltVar.o();
        } else {
            replacementSpan = null;
        }
        if ((!(replacementSpan instanceof RichTextContainerComponent.f) || ((RichTextContainerComponent.f) replacementSpan).r()) && (replacementSpan instanceof iu3.a) && db8Var != null && iu3.c(this, layout, db8Var, ((iu3.a) replacementSpan).getClass(), motionEvent, false)) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ Object ipc$super(StaticLayoutView staticLayoutView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1665133574:
                super.draw((Canvas) objArr[0]);
                return null;
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -1117127205:
                super.onDraw((Canvas) objArr[0]);
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1389530587:
                super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/view/StaticLayoutView");
        }
    }

    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        this.helper = null;
        this.textLayout = null;
        this.mTextAlignment = 0;
        this.marquee = null;
        this.drawed = false;
        ey8 ey8Var = this.fadingEdge;
        if (ey8Var != null) {
            ey8Var.g(null);
            this.fadingEdge = null;
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        ey8 ey8Var = this.fadingEdge;
        if (ey8Var == null || !ey8Var.c()) {
            super.draw(canvas);
            return;
        }
        int e2 = this.fadingEdge.e(canvas);
        super.draw(canvas);
        this.fadingEdge.f(canvas);
        this.fadingEdge.d(canvas, e2);
    }

    public void enableNewMarquee(boolean z, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36d5e0d3", new Object[]{this, new Boolean(z), dVar});
        } else if (z) {
            this.marquee = new e(dVar);
        } else {
            this.marquee = new b(dVar);
        }
    }

    public slt getLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (slt) ipChange.ipc$dispatch("3428fe11", new Object[]{this});
        }
        return this.helper;
    }

    public int getMarqueeState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3a213dff", new Object[]{this})).intValue();
        }
        c cVar = this.marquee;
        if (cVar != null) {
            return cVar.g;
        }
        return 0;
    }

    public String getText() {
        CharSequence text;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("97297536", new Object[]{this});
        }
        Layout textLayout = getTextLayout();
        if (textLayout == null || (text = textLayout.getText()) == null) {
            return null;
        }
        return text.toString();
    }

    @Override // android.view.View
    public int getTextAlignment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("10ed7ffa", new Object[]{this})).intValue();
        }
        return this.mTextAlignment;
    }

    public Layout getTextLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Layout) ipChange.ipc$dispatch("b8322a99", new Object[]{this});
        }
        slt sltVar = this.helper;
        if (sltVar != null) {
            return sltVar.B();
        }
        return null;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        c cVar = this.marquee;
        if (cVar instanceof e) {
            if (((e) cVar).g == 1) {
                cVar.g();
            }
        } else if (cVar instanceof b) {
            cVar.g();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        c cVar = this.marquee;
        if (cVar != null) {
            cVar.h();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        if (this.helper != null) {
            if (this.marquee == null) {
                this.marquee = new b(null);
            }
            boolean G = this.helper.G();
            Picture u = this.helper.u();
            if (!G || u != null || this.drawed) {
                this.drawed = true;
                Layout textLayout = getTextLayout();
                if (textLayout != null) {
                    canvas.save();
                    int width = textLayout.getWidth();
                    int height = textLayout.getHeight();
                    int displayWidth = (getDisplayWidth() - getPaddingLeft()) - getPaddingRight();
                    int displayHeight = (getDisplayHeight() - getPaddingTop()) - getPaddingBottom();
                    boolean z = this.marquee instanceof b;
                    if ((this.mTextAlignment & 7) != 1 || needRunMarquee(z)) {
                        i = 0;
                    } else {
                        i = (displayWidth - width) / 2;
                    }
                    if ((this.mTextAlignment & 112) != 16 || needRunMarquee(z)) {
                        i2 = 0;
                    } else {
                        i2 = (displayHeight - height) / 2;
                    }
                    if ((this.mTextAlignment & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK) == 8388613 && !needRunMarquee(z)) {
                        i = displayWidth - width;
                    }
                    this.marquee.e(canvas, i, i2);
                    slt sltVar = this.helper;
                    if (sltVar != null && sltVar.D() == null && akt.t0()) {
                        height = Math.min(height, getDisplayHeight());
                    }
                    slt sltVar2 = this.helper;
                    if (sltVar2 != null) {
                        i4 = (int) Math.min(0.0f, sltVar2.v() - this.helper.x());
                        i3 = (int) Math.min(0.0f, this.helper.w() - this.helper.x());
                        width += (int) Math.max(0.0f, this.helper.v() + this.helper.x());
                        height += (int) Math.max(0.0f, this.helper.w() + this.helper.x());
                    } else {
                        i3 = 0;
                    }
                    canvas.clipRect(i4, i3, width, height);
                    this.helper.m(canvas);
                    if (!this.marquee.d(canvas, textLayout, i, i2)) {
                        canvas.restore();
                    }
                }
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
        if (this.marquee instanceof b) {
            startMarquee();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
        if (tb.iu3.c(r8, r2, r3, tb.iu3.a.class, r9, false) == false) goto L_0x0083;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            r0 = 1
            com.android.alibaba.ip.runtime.IpChange r1 = com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x001c
            java.lang.String r2 = "a9b14c3a"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r8
            r3[r0] = r9
            java.lang.Object r9 = r1.ipc$dispatch(r2, r3)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            return r9
        L_0x001c:
            android.text.Layout r2 = r8.getTextLayout()
            if (r2 == 0) goto L_0x0083
            java.lang.CharSequence r1 = r2.getText()
            boolean r3 = tb.ijg.a(r1)
            r4 = 0
            if (r3 == 0) goto L_0x005c
            tb.slt r3 = r8.helper
            java.lang.CharSequence r3 = r3.y()
            boolean r3 = r3 instanceof tb.db8
            if (r3 == 0) goto L_0x0048
            tb.slt r1 = r8.helper
            java.lang.CharSequence r1 = r1.y()
            tb.db8 r1 = (tb.db8) r1
            android.text.Spanned r3 = r1.c()
            r7 = r4
            r4 = r1
            r1 = r3
            r3 = r7
            goto L_0x005d
        L_0x0048:
            tb.slt r3 = r8.helper
            java.lang.CharSequence r3 = r3.y()
            boolean r3 = r3 instanceof com.taobao.tao.flexbox.layoutmanager.component.RichTextContainerComponent.g
            if (r3 == 0) goto L_0x005c
            tb.slt r1 = r8.helper
            java.lang.CharSequence r1 = r1.y()
            r3 = r1
            com.taobao.tao.flexbox.layoutmanager.component.RichTextContainerComponent$g r3 = (com.taobao.tao.flexbox.layoutmanager.component.RichTextContainerComponent.g) r3
            goto L_0x005d
        L_0x005c:
            r3 = r4
        L_0x005d:
            boolean r4 = r8.handleEllipsizeSpanClick(r4, r2, r9)
            if (r4 != 0) goto L_0x0082
            boolean r3 = r8.handleCompositeSpanClick(r3, r2, r9)
            if (r3 == 0) goto L_0x006a
            goto L_0x0082
        L_0x006a:
            boolean r3 = r1 instanceof android.text.Spanned
            if (r3 == 0) goto L_0x0083
            r3 = r1
            android.text.Spanned r3 = (android.text.Spanned) r3
            boolean r1 = tb.iu3.b(r8, r2, r3, r9)
            if (r1 != 0) goto L_0x0082
            java.lang.Class<tb.iu3$a> r4 = tb.iu3.a.class
            r6 = 0
            r1 = r8
            r5 = r9
            boolean r1 = tb.iu3.c(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L_0x0083
        L_0x0082:
            return r0
        L_0x0083:
            boolean r9 = super.onTouchEvent(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void pauseMarquee() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cf6d7d3", new Object[]{this});
            return;
        }
        c cVar = this.marquee;
        if (cVar != null) {
            cVar.f();
        }
    }

    public void setBoxShadow(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7782c950", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        slt sltVar = this.helper;
        if (sltVar != null) {
            sltVar.P(i, i2, i3, i4);
            invalidate();
        }
    }

    public void setDirection(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("436d380e", new Object[]{this, str});
            return;
        }
        c cVar = this.marquee;
        if (cVar != null) {
            cVar.f12385a = str;
        }
    }

    @Override // tb.i5c
    public void setFading(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bad10d0", new Object[]{this, iArr});
            return;
        }
        if (this.fadingEdge == null) {
            this.fadingEdge = new ey8(this);
        }
        this.fadingEdge.g(iArr);
    }

    public void setLayout(slt sltVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f102aeb5", new Object[]{this, sltVar});
            return;
        }
        Layout layout = this.textLayout;
        this.helper = sltVar;
        if (sltVar != null) {
            this.textLayout = sltVar.B();
        }
        c cVar = this.marquee;
        if ((cVar instanceof b) && layout != this.textLayout) {
            cVar.g();
        }
        requestLayout();
        invalidate();
    }

    public void setLoopCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b4d5a73", new Object[]{this, new Integer(i)});
            return;
        }
        c cVar = this.marquee;
        if (cVar != null) {
            cVar.b = i;
        }
    }

    public void setLoopDelay(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6d71a7f", new Object[]{this, new Integer(i)});
            return;
        }
        if (i < 0) {
            i = 0;
        }
        c cVar = this.marquee;
        if (cVar != null) {
            cVar.d = i;
        }
    }

    public void setMarqueeScrollGap(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("535349b3", new Object[]{this, new Integer(i)});
            return;
        }
        c cVar = this.marquee;
        if (cVar != null) {
            cVar.e = i;
        }
    }

    public void setMarqueeState(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e59d02eb", new Object[]{this, new Integer(i)});
            return;
        }
        c cVar = this.marquee;
        if (cVar instanceof e) {
            ((e) cVar).g = i;
        }
    }

    public void setScrollAmount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9001a8b5", new Object[]{this, new Integer(i)});
            return;
        }
        c cVar = this.marquee;
        if (cVar != null) {
            cVar.c = i;
        }
    }

    public void setText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2847200", new Object[]{this, str});
            return;
        }
        slt sltVar = this.helper;
        if (sltVar != null) {
            sltVar.Q(str);
            c cVar = this.marquee;
            if (cVar instanceof b) {
                cVar.g();
            }
            requestLayout();
            invalidate();
        }
    }

    public void setTextAlign(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71780586", new Object[]{this, new Integer(i)});
        } else if (this.mTextAlignment != i) {
            this.mTextAlignment = i;
        }
    }

    public void setTextColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc80f7e8", new Object[]{this, new Integer(i)});
            return;
        }
        slt sltVar = this.helper;
        if (sltVar != null) {
            sltVar.S(i);
            invalidate();
        }
    }

    public void startMarquee() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c873de7", new Object[]{this});
            return;
        }
        c cVar = this.marquee;
        if (cVar != null) {
            cVar.g();
        }
    }

    public void stopMarquee() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("974b7647", new Object[]{this});
            return;
        }
        c cVar = this.marquee;
        if (cVar != null) {
            cVar.h();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e extends c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(503317495);
        }

        public e(d dVar) {
            super(dVar);
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/view/StaticLayoutView$NewMarquee");
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
        @Override // com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean g() {
            /*
                r5 = this;
                r0 = 0
                r1 = 1
                com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView.e.$ipChange
                boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r3 == 0) goto L_0x0019
                java.lang.String r3 = "6c873deb"
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r1[r0] = r5
                java.lang.Object r0 = r2.ipc$dispatch(r3, r1)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                return r0
            L_0x0019:
                android.animation.ValueAnimator r2 = r5.h
                if (r2 == 0) goto L_0x0022
                boolean r2 = r2.isPaused()
                goto L_0x0023
            L_0x0022:
                r2 = 0
            L_0x0023:
                if (r2 == 0) goto L_0x002c
                android.animation.ValueAnimator r0 = r5.h
                r0.resume()
            L_0x002a:
                r0 = 1
                goto L_0x0072
            L_0x002c:
                r5.h()
                com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView r2 = com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView.this
                android.text.Layout r2 = r2.getTextLayout()
                if (r2 == 0) goto L_0x0072
                java.lang.String r3 = r5.f12385a
                java.lang.String r4 = "right"
                boolean r3 = android.text.TextUtils.equals(r3, r4)
                if (r3 != 0) goto L_0x0060
                java.lang.String r3 = r5.f12385a
                java.lang.String r4 = "left"
                boolean r3 = android.text.TextUtils.equals(r3, r4)
                if (r3 == 0) goto L_0x004e
                goto L_0x0060
            L_0x004e:
                com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView r3 = com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView.this
                int r3 = com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView.access$100(r3)
                int r2 = r2.getHeight()
                if (r3 >= r2) goto L_0x0072
                android.os.Handler r2 = r5.j
                r2.sendEmptyMessage(r0)
                goto L_0x002a
            L_0x0060:
                com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView r3 = com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView.this
                int r3 = com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView.access$000(r3)
                int r2 = r2.getWidth()
                if (r3 >= r2) goto L_0x0072
                android.os.Handler r2 = r5.j
                r2.sendEmptyMessage(r0)
                goto L_0x002a
            L_0x0072:
                com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView r1 = com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView.this
                tb.ey8 r1 = com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView.access$400(r1)
                if (r1 == 0) goto L_0x0083
                com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView r1 = com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView.this
                tb.ey8 r1 = com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView.access$400(r1)
                r1.a(r0)
            L_0x0083:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView.e.g():boolean");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public abstract class c {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int STATE_INIT = 0;
        public static final int STATE_PAUSE = 2;
        public static final int STATE_START = 1;
        public static final int STATE_STOP = 3;
        public int c;
        public int e;
        public ValueAnimator h;
        public final d i;

        /* renamed from: a  reason: collision with root package name */
        public String f12385a = "left";
        public int b = -1;
        public int d = 0;
        public int f = 0;
        public int g = 0;
        public final Handler j = new a(Looper.getMainLooper());

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a extends Handler {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a(Looper looper) {
                super(looper);
            }

            public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/view/StaticLayoutView$Marquee$1");
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                    return;
                }
                Layout textLayout = StaticLayoutView.this.getTextLayout();
                if (textLayout != null) {
                    c.this.c(textLayout);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class b implements ValueAnimator.AnimatorUpdateListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public b() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    return;
                }
                c.this.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ViewCompat.postInvalidateOnAnimation(StaticLayoutView.this);
            }
        }

        /* compiled from: Taobao */
        /* renamed from: com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView$c$c  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class C0705c implements Animator.AnimatorListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public C0705c() {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
                } else if (c.a(c.this) != null) {
                    c.a(c.this).onStateChange("finish");
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                } else if (c.a(c.this) != null) {
                    c.a(c.this).onStateChange("finish");
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
                } else if (c.a(c.this) != null) {
                    c.a(c.this).onStateChange("loopEnd");
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
                } else if (c.a(c.this) != null) {
                    c.a(c.this).onStateChange("start");
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class d implements Animator.AnimatorPauseListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public d() {
            }

            @Override // android.animation.Animator.AnimatorPauseListener
            public void onAnimationPause(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("450268b5", new Object[]{this, animator});
                } else if (c.a(c.this) != null) {
                    c.a(c.this).onStateChange("pause");
                }
            }

            @Override // android.animation.Animator.AnimatorPauseListener
            public void onAnimationResume(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8babbd16", new Object[]{this, animator});
                } else if (c.a(c.this) != null) {
                    c.a(c.this).onStateChange("start");
                }
            }
        }

        static {
            t2o.a(503317489);
        }

        public c(d dVar) {
            this.i = dVar;
        }

        public static /* synthetic */ d a(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("c7e0f714", new Object[]{cVar});
            }
            return cVar.i;
        }

        public void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3cf6d7d3", new Object[]{this});
                return;
            }
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.pause();
            }
        }

        public abstract boolean g();

        public void h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("974b7647", new Object[]{this});
                return;
            }
            this.j.removeMessages(0);
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.h = null;
            }
            this.f = 0;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
            if (r4.equals("down") == false) goto L_0x002f;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void b(float r8) {
            /*
                r7 = this;
                r0 = 1
                r1 = 2
                r2 = 0
                com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView.c.$ipChange
                boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r4 == 0) goto L_0x001a
                java.lang.Float r4 = new java.lang.Float
                r4.<init>(r8)
                java.lang.Object[] r8 = new java.lang.Object[r1]
                r8[r2] = r7
                r8[r0] = r4
                java.lang.String r0 = "ec274ba2"
                r3.ipc$dispatch(r0, r8)
                return
            L_0x001a:
                com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView r3 = com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView.this
                android.text.Layout r3 = r3.getTextLayout()
                if (r3 == 0) goto L_0x00a2
                java.lang.String r4 = r7.f12385a
                r4.hashCode()
                r5 = -1
                int r6 = r4.hashCode()
                switch(r6) {
                    case 3739: goto L_0x0052;
                    case 3089570: goto L_0x0049;
                    case 3317767: goto L_0x003d;
                    case 108511772: goto L_0x0031;
                    default: goto L_0x002f;
                }
            L_0x002f:
                r0 = -1
                goto L_0x005d
            L_0x0031:
                java.lang.String r0 = "right"
                boolean r0 = r4.equals(r0)
                if (r0 != 0) goto L_0x003b
                goto L_0x002f
            L_0x003b:
                r0 = 3
                goto L_0x005d
            L_0x003d:
                java.lang.String r0 = "left"
                boolean r0 = r4.equals(r0)
                if (r0 != 0) goto L_0x0047
                goto L_0x002f
            L_0x0047:
                r0 = 2
                goto L_0x005d
            L_0x0049:
                java.lang.String r1 = "down"
                boolean r1 = r4.equals(r1)
                if (r1 != 0) goto L_0x005d
                goto L_0x002f
            L_0x0052:
                java.lang.String r0 = "up"
                boolean r0 = r4.equals(r0)
                if (r0 != 0) goto L_0x005c
                goto L_0x002f
            L_0x005c:
                r0 = 0
            L_0x005d:
                switch(r0) {
                    case 0: goto L_0x008c;
                    case 1: goto L_0x007e;
                    case 2: goto L_0x006f;
                    case 3: goto L_0x0061;
                    default: goto L_0x0060;
                }
            L_0x0060:
                goto L_0x009a
            L_0x0061:
                int r0 = r3.getWidth()
                int r1 = r7.e
                int r0 = r0 + r1
                float r0 = (float) r0
                float r0 = r0 * r8
                int r0 = (int) r0
                r7.f = r0
                goto L_0x009a
            L_0x006f:
                int r0 = r3.getWidth()
                int r1 = r7.e
                int r0 = r0 + r1
                float r0 = (float) r0
                float r0 = r0 * r8
                int r0 = (int) r0
                int r0 = -r0
                r7.f = r0
                goto L_0x009a
            L_0x007e:
                int r0 = r3.getHeight()
                int r1 = r7.e
                int r0 = r0 + r1
                float r0 = (float) r0
                float r0 = r0 * r8
                int r0 = (int) r0
                r7.f = r0
                goto L_0x009a
            L_0x008c:
                int r0 = r3.getHeight()
                int r1 = r7.e
                int r0 = r0 + r1
                float r0 = (float) r0
                float r0 = r0 * r8
                int r0 = (int) r0
                int r0 = -r0
                r7.f = r0
            L_0x009a:
                r0 = 1065353216(0x3f800000, float:1.0)
                int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r8 != 0) goto L_0x00a2
                r7.f = r2
            L_0x00a2:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView.c.b(float):void");
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x007c, code lost:
            if (r3.equals("down") == false) goto L_0x005c;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void c(android.text.Layout r9) {
            /*
                Method dump skipped, instructions count: 246
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView.c.c(android.text.Layout):void");
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x0045, code lost:
            if (r4.equals("right") == false) goto L_0x003c;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean d(android.graphics.Canvas r8, android.text.Layout r9, int r10, int r11) {
            /*
                Method dump skipped, instructions count: 408
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView.c.d(android.graphics.Canvas, android.text.Layout, int, int):boolean");
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
            if (r4.equals("right") == false) goto L_0x0032;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void e(android.graphics.Canvas r8, int r9, int r10) {
            /*
                r7 = this;
                r0 = 3
                r1 = 2
                r2 = 1
                r3 = 0
                com.android.alibaba.ip.runtime.IpChange r4 = com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView.c.$ipChange
                boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r5 == 0) goto L_0x0025
                java.lang.Integer r5 = new java.lang.Integer
                r5.<init>(r9)
                java.lang.Integer r9 = new java.lang.Integer
                r9.<init>(r10)
                r10 = 4
                java.lang.Object[] r10 = new java.lang.Object[r10]
                r10[r3] = r7
                r10[r2] = r8
                r10[r1] = r5
                r10[r0] = r9
                java.lang.String r8 = "4c99127e"
                r4.ipc$dispatch(r8, r10)
                return
            L_0x0025:
                java.lang.String r4 = r7.f12385a
                r4.hashCode()
                r5 = -1
                int r6 = r4.hashCode()
                switch(r6) {
                    case 3739: goto L_0x0055;
                    case 3089570: goto L_0x004a;
                    case 3317767: goto L_0x003e;
                    case 108511772: goto L_0x0034;
                    default: goto L_0x0032;
                }
            L_0x0032:
                r0 = -1
                goto L_0x0060
            L_0x0034:
                java.lang.String r1 = "right"
                boolean r1 = r4.equals(r1)
                if (r1 != 0) goto L_0x0060
                goto L_0x0032
            L_0x003e:
                java.lang.String r0 = "left"
                boolean r0 = r4.equals(r0)
                if (r0 != 0) goto L_0x0048
                goto L_0x0032
            L_0x0048:
                r0 = 2
                goto L_0x0060
            L_0x004a:
                java.lang.String r0 = "down"
                boolean r0 = r4.equals(r0)
                if (r0 != 0) goto L_0x0053
                goto L_0x0032
            L_0x0053:
                r0 = 1
                goto L_0x0060
            L_0x0055:
                java.lang.String r0 = "up"
                boolean r0 = r4.equals(r0)
                if (r0 != 0) goto L_0x005f
                goto L_0x0032
            L_0x005f:
                r0 = 0
            L_0x0060:
                switch(r0) {
                    case 0: goto L_0x007b;
                    case 1: goto L_0x007b;
                    case 2: goto L_0x0064;
                    case 3: goto L_0x0064;
                    default: goto L_0x0063;
                }
            L_0x0063:
                goto L_0x0091
            L_0x0064:
                com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView r0 = com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView.this
                int r0 = r0.getPaddingLeft()
                int r0 = r0 + r9
                int r9 = r7.f
                int r0 = r0 + r9
                float r9 = (float) r0
                com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView r0 = com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView.this
                int r0 = r0.getPaddingTop()
                int r0 = r0 + r10
                float r10 = (float) r0
                r8.translate(r9, r10)
                goto L_0x0091
            L_0x007b:
                com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView r0 = com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView.this
                int r0 = r0.getPaddingLeft()
                int r0 = r0 + r9
                float r9 = (float) r0
                com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView r0 = com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView.this
                int r0 = r0.getPaddingTop()
                int r0 = r0 + r10
                int r10 = r7.f
                int r0 = r0 + r10
                float r10 = (float) r0
                r8.translate(r9, r10)
            L_0x0091:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView.c.e(android.graphics.Canvas, int, int):void");
        }
    }

    private boolean needRunMarquee(boolean z) {
        slt sltVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59696304", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (this.textLayout == null || (z && ((sltVar = this.helper) == null || sltVar.D() != TextUtils.TruncateAt.MARQUEE))) {
            return false;
        }
        return (TextUtils.equals(this.marquee.f12385a, "right") || TextUtils.equals(this.marquee.f12385a, "left")) ? getDisplayWidth() < this.textLayout.getWidth() : getDisplayHeight() < this.textLayout.getHeight();
    }
}
