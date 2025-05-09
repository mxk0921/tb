package com.taobao.android.detail.ttdetail.widget.progress;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import tb.j1z;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class TTCircularProgressView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final float INDETERMINANT_MIN_SWEEP = 15.0f;
    private float actualProgress;
    private int animDuration;
    private int animSteps;
    private int animSwoopDuration;
    private int animSyncDuration;
    private boolean autostartAnimation;
    private RectF bounds;
    private int color;
    private float currentProgress;
    private AnimatorSet indeterminateAnimator;
    private float indeterminateRotateOffset;
    private float indeterminateSweep;
    private float initialStartAngle;
    private boolean isIndeterminate;
    private List<j1z> listeners;
    private float maxProgress;
    private Paint paint;
    private ValueAnimator progressAnimator;
    private int size = 0;
    private float startAngle;
    private ValueAnimator startAngleRotate;
    private int thickness;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
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
            TTCircularProgressView.access$002(TTCircularProgressView.this, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            TTCircularProgressView.this.invalidate();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f7015a;

        public b(float f) {
            this.f7015a = f;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/widget/progress/TTCircularProgressView$2");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            for (j1z j1zVar : TTCircularProgressView.access$100(TTCircularProgressView.this)) {
                j1zVar.c(this.f7015a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            TTCircularProgressView.access$202(TTCircularProgressView.this, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            TTCircularProgressView.this.invalidate();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            TTCircularProgressView.access$002(TTCircularProgressView.this, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            TTCircularProgressView.this.invalidate();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class e extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f7018a = false;

        public e() {
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/widget/progress/TTCircularProgressView$5");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
            } else {
                this.f7018a = true;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            } else if (!this.f7018a) {
                TTCircularProgressView.this.resetAnimation();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class f implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            TTCircularProgressView.access$302(TTCircularProgressView.this, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            TTCircularProgressView.this.invalidate();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class g implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
            } else {
                TTCircularProgressView.access$402(TTCircularProgressView.this, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class h implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f7021a;
        public final /* synthetic */ float b;

        public h(float f, float f2) {
            this.f7021a = f;
            this.b = f2;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            TTCircularProgressView.access$202(TTCircularProgressView.this, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            TTCircularProgressView tTCircularProgressView = TTCircularProgressView.this;
            TTCircularProgressView.access$302(tTCircularProgressView, (this.f7021a - TTCircularProgressView.access$200(tTCircularProgressView)) + this.b);
            TTCircularProgressView.this.invalidate();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class i implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
            } else {
                TTCircularProgressView.access$402(TTCircularProgressView.this, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        }
    }

    static {
        t2o.a(912263065);
    }

    public TTCircularProgressView(Context context) {
        super(context);
        init(null, 0);
    }

    public static /* synthetic */ float access$002(TTCircularProgressView tTCircularProgressView, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8c426443", new Object[]{tTCircularProgressView, new Float(f2)})).floatValue();
        }
        tTCircularProgressView.actualProgress = f2;
        return f2;
    }

    public static /* synthetic */ List access$100(TTCircularProgressView tTCircularProgressView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3bc78519", new Object[]{tTCircularProgressView});
        }
        return tTCircularProgressView.listeners;
    }

    public static /* synthetic */ float access$200(TTCircularProgressView tTCircularProgressView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d78ead7d", new Object[]{tTCircularProgressView})).floatValue();
        }
        return tTCircularProgressView.startAngle;
    }

    public static /* synthetic */ float access$202(TTCircularProgressView tTCircularProgressView, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("db3a17c5", new Object[]{tTCircularProgressView, new Float(f2)})).floatValue();
        }
        tTCircularProgressView.startAngle = f2;
        return f2;
    }

    public static /* synthetic */ float access$302(TTCircularProgressView tTCircularProgressView, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("82b5f186", new Object[]{tTCircularProgressView, new Float(f2)})).floatValue();
        }
        tTCircularProgressView.indeterminateSweep = f2;
        return f2;
    }

    public static /* synthetic */ float access$402(TTCircularProgressView tTCircularProgressView, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2a31cb47", new Object[]{tTCircularProgressView, new Float(f2)})).floatValue();
        }
        tTCircularProgressView.indeterminateRotateOffset = f2;
        return f2;
    }

    private AnimatorSet createIndeterminateAnimator(float f2) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AnimatorSet) ipChange.ipc$dispatch("8cd17cf4", new Object[]{this, new Float(f2)});
        }
        float f3 = (((i2 - 1) * 360.0f) / this.animSteps) + INDETERMINANT_MIN_SWEEP;
        float f4 = ((f3 - INDETERMINANT_MIN_SWEEP) * f2) - 90.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(INDETERMINANT_MIN_SWEEP, f3);
        ofFloat.setDuration((this.animDuration / this.animSteps) / 2);
        ofFloat.setInterpolator(new DecelerateInterpolator(1.0f));
        ofFloat.addUpdateListener(new f());
        int i3 = this.animSteps;
        float f5 = (0.5f + f2) * 720.0f;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat((f2 * 720.0f) / i3, f5 / i3);
        ofFloat2.setDuration((this.animDuration / this.animSteps) / 2);
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addUpdateListener(new g());
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(f4, (f4 + f3) - INDETERMINANT_MIN_SWEEP);
        ofFloat3.setDuration((this.animDuration / this.animSteps) / 2);
        ofFloat3.setInterpolator(new DecelerateInterpolator(1.0f));
        ofFloat3.addUpdateListener(new h(f3, f4));
        int i4 = this.animSteps;
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f5 / i4, ((f2 + 1.0f) * 720.0f) / i4);
        ofFloat4.setDuration((this.animDuration / this.animSteps) / 2);
        ofFloat4.setInterpolator(new LinearInterpolator());
        ofFloat4.addUpdateListener(new i());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.play(ofFloat3).with(ofFloat4).after(ofFloat2);
        return animatorSet;
    }

    private void initAttributes(AttributeSet attributeSet, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e7ea343", new Object[]{this, attributeSet, new Integer(i2)});
            return;
        }
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.TTCircularProgressView, i2, 0);
        Resources resources = getResources();
        this.currentProgress = obtainStyledAttributes.getFloat(R.styleable.TTCircularProgressView_tcpv_progress, resources.getInteger(R.integer.tcpv_default_progress));
        this.maxProgress = obtainStyledAttributes.getFloat(R.styleable.TTCircularProgressView_tcpv_maxProgress, resources.getInteger(R.integer.tcpv_default_max_progress));
        this.thickness = obtainStyledAttributes.getDimensionPixelSize(R.styleable.TTCircularProgressView_tcpv_thickness, resources.getDimensionPixelSize(R.dimen.tcpv_default_thickness));
        this.isIndeterminate = obtainStyledAttributes.getBoolean(R.styleable.TTCircularProgressView_tcpv_indeterminate, resources.getBoolean(R.bool.tcpv_default_is_indeterminate));
        this.autostartAnimation = obtainStyledAttributes.getBoolean(R.styleable.TTCircularProgressView_tcpv_animAutostart, resources.getBoolean(R.bool.tcpv_default_anim_autostart));
        float f2 = obtainStyledAttributes.getFloat(R.styleable.TTCircularProgressView_tcpv_startAngle, resources.getInteger(R.integer.tcpv_default_start_angle));
        this.initialStartAngle = f2;
        this.startAngle = f2;
        this.color = obtainStyledAttributes.getColor(R.styleable.TTCircularProgressView_tcpv_color, resources.getColor(R.color.tcpv_default_color));
        this.animDuration = obtainStyledAttributes.getInteger(R.styleable.TTCircularProgressView_tcpv_animDuration, resources.getInteger(R.integer.tcpv_default_anim_duration));
        this.animSwoopDuration = obtainStyledAttributes.getInteger(R.styleable.TTCircularProgressView_tcpv_animSwoopDuration, resources.getInteger(R.integer.tcpv_default_anim_swoop_duration));
        this.animSyncDuration = obtainStyledAttributes.getInteger(R.styleable.TTCircularProgressView_tcpv_animSyncDuration, resources.getInteger(R.integer.tcpv_default_anim_sync_duration));
        this.animSteps = obtainStyledAttributes.getInteger(R.styleable.TTCircularProgressView_tcpv_animSteps, resources.getInteger(R.integer.tcpv_default_anim_steps));
        obtainStyledAttributes.recycle();
    }

    public static /* synthetic */ Object ipc$super(TTCircularProgressView tTCircularProgressView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1705336120:
                super.setVisibility(((Number) objArr[0]).intValue());
                return null;
            case -1117127205:
                super.onDraw((Canvas) objArr[0]);
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/widget/progress/TTCircularProgressView");
        }
    }

    private void updateBounds() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("672b8665", new Object[]{this});
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        RectF rectF = this.bounds;
        int i2 = this.thickness;
        int i3 = this.size;
        rectF.set(paddingLeft + i2, paddingTop + i2, (i3 - paddingLeft) - i2, (i3 - paddingTop) - i2);
    }

    private void updatePaint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6b8d71c", new Object[]{this});
            return;
        }
        this.paint.setColor(this.color);
        this.paint.setStyle(Paint.Style.STROKE);
        this.paint.setStrokeWidth(this.thickness);
        this.paint.setStrokeCap(Paint.Cap.BUTT);
    }

    public void addListener(j1z j1zVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("772fb916", new Object[]{this, j1zVar});
        } else if (j1zVar != null) {
            this.listeners.add(j1zVar);
        }
    }

    public int getColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("756dbba7", new Object[]{this})).intValue();
        }
        return this.color;
    }

    public float getMaxProgress() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bdc13d72", new Object[]{this})).floatValue();
        }
        return this.maxProgress;
    }

    public float getProgress() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8ba5fa9a", new Object[]{this})).floatValue();
        }
        return this.currentProgress;
    }

    public int getThickness() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bff65e38", new Object[]{this})).intValue();
        }
        return this.thickness;
    }

    public void init(AttributeSet attributeSet, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6a9cdcc", new Object[]{this, attributeSet, new Integer(i2)});
            return;
        }
        this.listeners = new ArrayList();
        initAttributes(attributeSet, i2);
        this.paint = new Paint(1);
        updatePaint();
        this.bounds = new RectF();
    }

    public boolean isIndeterminate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("82f687bc", new Object[]{this})).booleanValue();
        }
        return this.isIndeterminate;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        if (this.autostartAnimation) {
            startAnimation();
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
        stopAnimation();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        if (isInEditMode()) {
            f2 = this.currentProgress;
        } else {
            f2 = this.actualProgress;
        }
        float f3 = (f2 / this.maxProgress) * 360.0f;
        if (!this.isIndeterminate) {
            canvas.drawArc(this.bounds, this.startAngle, f3, false, this.paint);
        } else {
            canvas.drawArc(this.bounds, this.startAngle + this.indeterminateRotateOffset, this.indeterminateSweep, false, this.paint);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i2), new Integer(i3)});
            return;
        }
        super.onMeasure(i2, i3);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int min = Math.min(getMeasuredWidth() - paddingLeft, getMeasuredHeight() - paddingTop);
        this.size = min;
        setMeasuredDimension(paddingLeft + min, min + paddingTop);
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
            return;
        }
        super.onSizeChanged(i2, i3, i4, i5);
        this.size = Math.min(i2, i3);
        updateBounds();
    }

    public void removeListener(j1z j1zVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8906013", new Object[]{this, j1zVar});
        } else {
            this.listeners.remove(j1zVar);
        }
    }

    public void resetAnimation() {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2530a8fc", new Object[]{this});
            return;
        }
        ValueAnimator valueAnimator = this.startAngleRotate;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.startAngleRotate.cancel();
        }
        ValueAnimator valueAnimator2 = this.progressAnimator;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            this.progressAnimator.cancel();
        }
        AnimatorSet animatorSet = this.indeterminateAnimator;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.indeterminateAnimator.cancel();
        }
        if (!this.isIndeterminate) {
            float f2 = this.initialStartAngle;
            this.startAngle = f2;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, 360.0f + f2);
            this.startAngleRotate = ofFloat;
            ofFloat.setDuration(this.animSwoopDuration);
            this.startAngleRotate.setInterpolator(new DecelerateInterpolator(2.0f));
            this.startAngleRotate.addUpdateListener(new c());
            this.startAngleRotate.start();
            this.actualProgress = 0.0f;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, this.currentProgress);
            this.progressAnimator = ofFloat2;
            ofFloat2.setDuration(this.animSyncDuration);
            this.progressAnimator.setInterpolator(new LinearInterpolator());
            this.progressAnimator.addUpdateListener(new d());
            this.progressAnimator.start();
            return;
        }
        this.indeterminateSweep = INDETERMINANT_MIN_SWEEP;
        this.indeterminateAnimator = new AnimatorSet();
        AnimatorSet animatorSet2 = null;
        while (i2 < this.animSteps) {
            AnimatorSet createIndeterminateAnimator = createIndeterminateAnimator(i2);
            AnimatorSet.Builder play = this.indeterminateAnimator.play(createIndeterminateAnimator);
            if (animatorSet2 != null) {
                play.after(animatorSet2);
            }
            i2++;
            animatorSet2 = createIndeterminateAnimator;
        }
        this.indeterminateAnimator.addListener(new e());
        this.indeterminateAnimator.start();
        for (j1z j1zVar : this.listeners) {
            j1zVar.b();
        }
    }

    public void setColor(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("666e7bdb", new Object[]{this, new Integer(i2)});
            return;
        }
        this.color = i2;
        updatePaint();
        invalidate();
    }

    public void setIndeterminate(boolean z) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3b47354", new Object[]{this, new Boolean(z)});
            return;
        }
        boolean z3 = this.isIndeterminate;
        if (z3 == z) {
            z2 = false;
        }
        this.isIndeterminate = z;
        if (z2) {
            resetAnimation();
        }
        if (z3 != z) {
            for (j1z j1zVar : this.listeners) {
                j1zVar.a(z);
            }
        }
    }

    public void setMaxProgress(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e636f8a", new Object[]{this, new Float(f2)});
            return;
        }
        this.maxProgress = f2;
        invalidate();
    }

    public void setProgress(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bf028ca", new Object[]{this, new Float(f2)});
            return;
        }
        this.currentProgress = f2;
        if (!this.isIndeterminate) {
            ValueAnimator valueAnimator = this.progressAnimator;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.progressAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.actualProgress, f2);
            this.progressAnimator = ofFloat;
            ofFloat.setDuration(this.animSyncDuration);
            this.progressAnimator.setInterpolator(new LinearInterpolator());
            this.progressAnimator.addUpdateListener(new a());
            this.progressAnimator.addListener(new b(f2));
            this.progressAnimator.start();
        }
        invalidate();
        for (j1z j1zVar : this.listeners) {
            j1zVar.onProgressUpdate(f2);
        }
    }

    public void setThickness(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cc456a", new Object[]{this, new Integer(i2)});
            return;
        }
        this.thickness = i2;
        updatePaint();
        updateBounds();
        invalidate();
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a5aa2c8", new Object[]{this, new Integer(i2)});
            return;
        }
        int visibility = getVisibility();
        super.setVisibility(i2);
        if (i2 == visibility) {
            return;
        }
        if (i2 == 0) {
            resetAnimation();
        } else if (i2 == 8 || i2 == 4) {
            stopAnimation();
        }
    }

    public void startAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("579958c9", new Object[]{this});
        } else {
            resetAnimation();
        }
    }

    public void stopAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e230f929", new Object[]{this});
            return;
        }
        ValueAnimator valueAnimator = this.startAngleRotate;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.startAngleRotate = null;
        }
        ValueAnimator valueAnimator2 = this.progressAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.progressAnimator = null;
        }
        AnimatorSet animatorSet = this.indeterminateAnimator;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.indeterminateAnimator = null;
        }
    }

    public TTCircularProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(attributeSet, 0);
    }

    public TTCircularProgressView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        init(attributeSet, i2);
    }
}
