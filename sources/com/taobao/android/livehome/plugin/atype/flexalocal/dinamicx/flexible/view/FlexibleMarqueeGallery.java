package com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Outline;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.TextView;
import androidx.core.widget.ScrollerCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.AbsFlexibleMarqueeGallery;
import com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.FlexibleContainerView;
import java.util.HashSet;
import java.util.Set;
import tb.bg6;
import tb.c4a;
import tb.p92;
import tb.r0h;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class FlexibleMarqueeGallery extends AbsFlexibleMarqueeGallery {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final float FLOAT_PRECISION_FIX_FACTOR = 10000.0f;
    private static final float SCALE_ANIM_axis = 0.8f;
    private static final String TAG = FlexibleMarqueeGallery.class.getSimpleName();
    public float[] bezierFactors;
    private boolean hasRegisterReceiver;
    public int lastScrollStopX;
    public Rect[] mCardRectArray;
    private c4a mGallery2Runner;
    public int mIdleStateScrollOffset;
    private final BroadcastReceiver mReceiver;
    public ValueAnimator magnatePositionAnimator;
    public TimeInterpolator moveAnimatorInterpolator;
    public int moveAnimeDelayDistance;
    public float moveAnimeDelayDistanceRate;
    private boolean muteOnScrollChanged;
    public OverScroller myScroller;
    public boolean notifyOnSwitch;
    public boolean returnScroll;
    public float scaleFactorA;
    public float scaleFactorK;
    public Runnable setVisibleIndexTask;
    public Set<Integer> tempResetItems;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (FlexibleMarqueeGallery.this.myScroller.isFinished() || !FlexibleMarqueeGallery.this.myScroller.computeScrollOffset()) {
                int round = Math.round((FlexibleMarqueeGallery.this.getScrollLimit() * 1.0f) / 3.0f);
                int scrollX = FlexibleMarqueeGallery.this.getScrollX() - FlexibleMarqueeGallery.this.mIdleStateScrollOffset;
                if (Math.abs(scrollX) <= round) {
                    FlexibleMarqueeGallery flexibleMarqueeGallery = FlexibleMarqueeGallery.this;
                    flexibleMarqueeGallery.smoothScrollToRect(flexibleMarqueeGallery.mIdleStateScrollOffset);
                } else if (scrollX > 0) {
                    FlexibleMarqueeGallery flexibleMarqueeGallery2 = FlexibleMarqueeGallery.this;
                    flexibleMarqueeGallery2.smoothScrollToRect(flexibleMarqueeGallery2.mIdleStateScrollOffset + flexibleMarqueeGallery2.getScrollLimit());
                } else if (scrollX < 0) {
                    FlexibleMarqueeGallery flexibleMarqueeGallery3 = FlexibleMarqueeGallery.this;
                    flexibleMarqueeGallery3.smoothScrollToRect(flexibleMarqueeGallery3.mIdleStateScrollOffset - flexibleMarqueeGallery3.getScrollLimit());
                }
            } else {
                int currX = FlexibleMarqueeGallery.this.myScroller.getCurrX();
                FlexibleMarqueeGallery flexibleMarqueeGallery4 = FlexibleMarqueeGallery.this;
                flexibleMarqueeGallery4.scrollTo(currX, flexibleMarqueeGallery4.myScroller.getCurrY());
                FlexibleMarqueeGallery.this.removeCallbacks(this);
                FlexibleMarqueeGallery.this.postDelayed(this, 16L);
                FlexibleMarqueeGallery.this.getScrollX();
                int i = FlexibleMarqueeGallery.this.mIdleStateScrollOffset;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements TimeInterpolator {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(FlexibleMarqueeGallery flexibleMarqueeGallery) {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("22c782db", new Object[]{this, new Float(f)})).floatValue();
            }
            return f;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f8796a;

        public c(boolean z) {
            this.f8796a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            FlexibleMarqueeGallery flexibleMarqueeGallery = FlexibleMarqueeGallery.this;
            AbsFlexibleMarqueeGallery.f fVar = flexibleMarqueeGallery.mOnGalleryScrollListener;
            if (fVar != null) {
                ((bg6.a) fVar).a(flexibleMarqueeGallery.mCurrentItem, flexibleMarqueeGallery.lastSelectedItem, this.f8796a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
            } else if (!FlexibleMarqueeGallery.access$000(FlexibleMarqueeGallery.this)) {
                int intValue = FlexibleMarqueeGallery.this.mAutoScrollAnimationOnStart + ((Integer) valueAnimator.getAnimatedValue()).intValue();
                FlexibleMarqueeGallery flexibleMarqueeGallery = FlexibleMarqueeGallery.this;
                flexibleMarqueeGallery.scrollTo(intValue, flexibleMarqueeGallery.getScrollY());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/livehome/plugin/atype/flexalocal/dinamicx/flexible/view/FlexibleMarqueeGallery$5");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
            } else {
                FlexibleMarqueeGallery.this.magnatePositionAnimator = null;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            } else {
                FlexibleMarqueeGallery.this.magnatePositionAnimator = null;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class f extends ViewOutlineProvider {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/livehome/plugin/atype/flexalocal/dinamicx/flexible/view/FlexibleMarqueeGallery$6");
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
            } else {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), FlexibleMarqueeGallery.this.mCardCornerRadius);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            FlexibleMarqueeGallery flexibleMarqueeGallery = FlexibleMarqueeGallery.this;
            flexibleMarqueeGallery.scrollTo(flexibleMarqueeGallery.mIdleStateScrollOffset, flexibleMarqueeGallery.getScrollY());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class h {

        /* renamed from: a  reason: collision with root package name */
        public float f8801a;
        public boolean b;
        public int c;
        public int d;

        static {
            t2o.a(310378604);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class i extends AbsFlexibleMarqueeGallery.d {
        public final TypeEvaluator<Rect> c = new j(new Rect());
        public ValueAnimator d;
        public h e;

        static {
            t2o.a(310378605);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class j implements TypeEvaluator<Rect> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Rect f8802a;

        static {
            t2o.a(310378606);
        }

        public j(Rect rect) {
            this.f8802a = rect;
        }

        /* renamed from: a */
        public Rect evaluate(float f, Rect rect, Rect rect2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Rect) ipChange.ipc$dispatch("5aa8fc49", new Object[]{this, new Float(f), rect, rect2});
            }
            int i = rect.left;
            int i2 = i + ((int) ((rect2.left - i) * f));
            int i3 = rect.top;
            int i4 = i3 + ((int) ((rect2.top - i3) * f));
            int i5 = rect.right;
            int i6 = i5 + ((int) ((rect2.right - i5) * f));
            int i7 = rect.bottom;
            int i8 = i7 + ((int) ((rect2.bottom - i7) * f));
            Rect rect3 = this.f8802a;
            if (rect3 == null) {
                return new Rect(i2, i4, i6, i8);
            }
            rect3.set(i2, i4, i6, i8);
            return this.f8802a;
        }
    }

    static {
        t2o.a(310378595);
    }

    public FlexibleMarqueeGallery(Context context) {
        this(context, null);
    }

    public static /* synthetic */ boolean access$000(FlexibleMarqueeGallery flexibleMarqueeGallery) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aabbd34", new Object[]{flexibleMarqueeGallery})).booleanValue();
        }
        return flexibleMarqueeGallery.muteOnScrollChanged;
    }

    public static /* synthetic */ c4a access$100(FlexibleMarqueeGallery flexibleMarqueeGallery) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c4a) ipChange.ipc$dispatch("afea8973", new Object[]{flexibleMarqueeGallery});
        }
        return flexibleMarqueeGallery.mGallery2Runner;
    }

    public static float floatPrecisionFix(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b1ff08b6", new Object[]{new Float(f2)})).floatValue();
        }
        return Math.round(f2 * 10000.0f) / 10000.0f;
    }

    private int getFlingThreshold() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc66555f", new Object[]{this})).intValue();
        }
        return this.mGalleryDisplayWidth / 2;
    }

    private int getMinimumFlingVelocityLimit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ad922254", new Object[]{this})).intValue();
        }
        return this.mGalleryDisplayWidth * 4;
    }

    private int getScrollRange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("512138b4", new Object[]{this})).intValue();
        }
        if (getChildCount() > 0) {
            return Math.max(0, this.mScrollContent.getWidth() - this.mGalleryDisplayWidth);
        }
        return 0;
    }

    public static /* synthetic */ Object ipc$super(FlexibleMarqueeGallery flexibleMarqueeGallery, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1577577649:
                super.scrollTo(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case -461309207:
                super.onWindowVisibilityChanged(((Number) objArr[0]).intValue());
                return null;
            case 711821702:
                super.onOverScrolled(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Boolean) objArr[2]).booleanValue(), ((Boolean) objArr[3]).booleanValue());
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            case 1937889544:
                super.setGalleryDisplayWidth(((Number) objArr[0]).intValue());
                return null;
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/livehome/plugin/atype/flexalocal/dinamicx/flexible/view/FlexibleMarqueeGallery");
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.AbsFlexibleMarqueeGallery
    public void autoScrollToNext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a8c7011", new Object[]{this});
        } else if (!this.mIsTouching && this.myScroller.isFinished()) {
            ValueAnimator valueAnimator = this.magnatePositionAnimator;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                AbsFlexibleMarqueeGallery.f fVar = this.mOnGalleryScrollListener;
                if (fVar != null) {
                    this.mIsRunnerScrollStarted = true;
                    ((bg6.a) fVar).e(getScrollX(), false);
                }
                smoothScrollToRectWithAnim(this.mIdleStateScrollOffset + getScrollLimit(), true);
            }
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.AbsFlexibleMarqueeGallery
    public void autoScrollToPrevious() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55f81a95", new Object[]{this});
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.AbsFlexibleMarqueeGallery
    public boolean checkViewHasInVisibleRect(View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("36f3d3eb", new Object[]{this, view})).booleanValue() : checkViewHasInVisibleRect(view, true);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void computeScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab3086b", new Object[]{this});
        } else if (this.myScroller.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.myScroller.getCurrX();
            int currY = this.myScroller.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                int scrollRange = getScrollRange();
                getOverScrollMode();
                overScrollBy(currX - scrollX, currY - scrollY, scrollX, scrollY, scrollRange, 0, 0, 0, false);
                onScrollChanged(currX, currY, scrollX, scrollY);
            }
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.AbsFlexibleMarqueeGallery
    public ScrollerCompat createScroller(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScrollerCompat) ipChange.ipc$dispatch("5b7807bf", new Object[]{this, context});
        }
        return ScrollerCompat.create(context);
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.AbsFlexibleMarqueeGallery
    public Runnable createScrollerTask() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("287f9752", new Object[]{this});
        }
        return new a();
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.AbsFlexibleMarqueeGallery, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            c4a c4aVar = this.mGallery2Runner;
            if (c4aVar != null) {
                c4aVar.m();
            }
            ValueAnimator valueAnimator = this.magnatePositionAnimator;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.magnatePositionAnimator.cancel();
            }
        }
        if (actionMasked == 3 || actionMasked == 1) {
            this.mIsTouching = false;
            c4a c4aVar2 = this.mGallery2Runner;
            if (c4aVar2 != null) {
                c4aVar2.n(false);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.HorizontalScrollView
    public void fling(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eac96b80", new Object[]{this, new Integer(i2)});
            return;
        }
        int i3 = this.mGalleryDisplayWidth;
        int width = this.mScrollContent.getWidth();
        getScrollX();
        float f2 = i2;
        if (Math.abs((int) (this.mFlingFactor * f2)) >= getFlingThreshold()) {
            this.myScroller.fling(getScrollX(), getScrollY(), Math.max(getMinimumFlingVelocityLimit(), (int) (this.mFlingFactor * f2)) * ((int) Math.signum(f2)), 0, 0, width - i3, 0, 0, 0, 0);
            removeCallbacks(this.mScrollerTask);
            postDelayed(this.mScrollerTask, 16L);
            this.mIsFling = true;
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.AbsFlexibleMarqueeGallery
    public c4a getAutoRunner() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c4a) ipChange.ipc$dispatch("b82faca6", new Object[]{this});
        }
        return this.mGallery2Runner;
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.AbsFlexibleMarqueeGallery
    public int getGalleryDisplayWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a3375fda", new Object[]{this})).intValue();
        }
        int i2 = this.mGalleryDisplayWidth;
        if (i2 != 0) {
            return i2;
        }
        if (getWidth() != 0) {
            return getWidth();
        }
        return getLayoutParams().width;
    }

    public TimeInterpolator getMoveAnimatorInterpolator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TimeInterpolator) ipChange.ipc$dispatch("5821d98a", new Object[]{this});
        }
        if (this.moveAnimatorInterpolator == null) {
            if (this.bezierFactors != null) {
                float[] fArr = this.bezierFactors;
                this.moveAnimatorInterpolator = new p92(fArr[0], fArr[1], fArr[2], fArr[3]);
            } else {
                this.moveAnimatorInterpolator = new b(this);
            }
        }
        return this.moveAnimatorInterpolator;
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.AbsFlexibleMarqueeGallery
    public int getScrollLimit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e5e6dc32", new Object[]{this})).intValue();
        }
        return Math.round(this.mGalleryDisplayWidth - 100);
    }

    public int getScrollLimitWithDelay(int i2) {
        float f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f308eaea", new Object[]{this, new Integer(i2)})).intValue();
        }
        int i3 = this.moveAnimeDelayDistance;
        if (i3 > 0) {
            f2 = i3 * i2;
        } else if (this.moveAnimeDelayDistanceRate > 0.0f) {
            f2 = i2 * getScrollLimit() * this.moveAnimeDelayDistanceRate;
        } else {
            f2 = 0.0f;
        }
        return Math.round(getScrollLimit() - f2);
    }

    public Rect[] initCardRectArray(int i2, int i3, int i4, int i5, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect[]) ipChange.ipc$dispatch("7d051c53", new Object[]{this, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
        }
        int i7 = i6 + 2;
        Rect[] rectArr = new Rect[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            if (i8 == 0) {
                rectArr[i8] = new Rect((-i3) - i5, 0, -i5, i2);
            } else if (i8 - 1 == 0) {
                rectArr[i8] = new Rect(0, 0, i3, i2);
            } else {
                int i9 = ((i5 + i4) * (i8 - 2)) + i3 + i5;
                rectArr[i8] = new Rect(i9, 0, i9 + i4, i2);
            }
        }
        return rectArr;
    }

    public int moveDelayFunction(int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("95a015e4", new Object[]{this, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)})).intValue();
        }
        int i8 = this.mActualVisibleCardCount;
        if (i2 > 0) {
            int max = Math.max(i4, Math.min(i8, i3 - 2));
            int i9 = this.moveAnimeDelayDistance;
            if (i9 > 0) {
                i7 = i9 * max;
            } else {
                float f2 = this.moveAnimeDelayDistanceRate;
                if (f2 > 0.0f) {
                    i7 = Math.round(i5 * f2 * max);
                } else {
                    i7 = 0;
                }
            }
            return Math.max(0, Math.abs(i2) - i7);
        } else if (i2 >= 0) {
            return 0;
        } else {
            int max2 = Math.max(i4, Math.min(i8 - 1, i8 - i3));
            int i10 = this.moveAnimeDelayDistance;
            if (i10 > 0) {
                i6 = i10 * max2;
            } else {
                float f3 = this.moveAnimeDelayDistanceRate;
                if (f3 > 0.0f) {
                    i6 = Math.round(i5 * f3 * max2);
                } else {
                    i6 = 0;
                }
            }
            return Math.max(0, Math.abs(i2) - i6);
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.AbsFlexibleMarqueeGallery, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        c4a c4aVar = this.mGallery2Runner;
        if (c4aVar != null) {
            c4aVar.n(false);
        }
        if (!this.hasRegisterReceiver) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            getContext().registerReceiver(this.mReceiver, intentFilter);
            this.hasRegisterReceiver = true;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        c4a c4aVar = this.mGallery2Runner;
        if (c4aVar != null) {
            c4aVar.m();
        }
        try {
            getContext().unregisterReceiver(this.mReceiver);
            this.hasRegisterReceiver = false;
        } catch (Exception unused) {
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void onOverScrolled(int i2, int i3, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a6d8986", new Object[]{this, new Integer(i2), new Integer(i3), new Boolean(z), new Boolean(z2)});
        } else if (Math.abs(i2 - getScrollX()) < getScrollLimit()) {
            onOverScrolledMod(i2, i3, z, z2);
        }
    }

    public void onOverScrolledMod(int i2, int i3, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("674ae2ca", new Object[]{this, new Integer(i2), new Integer(i3), new Boolean(z), new Boolean(z2)});
        } else if (Math.abs(i2 - getScrollX()) < this.mGalleryDisplayWidth) {
            super.onOverScrolled(i2, i3, z, z2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0276  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onScrollChanged(int r31, int r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 1282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.FlexibleMarqueeGallery.onScrollChanged(int, int, int, int):void");
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e480fae9", new Object[]{this, new Integer(i2)});
            return;
        }
        super.onWindowVisibilityChanged(i2);
        c4a c4aVar = this.mGallery2Runner;
        if (c4aVar == null) {
            return;
        }
        if (i2 == 0) {
            c4aVar.n(false);
        } else {
            c4aVar.m();
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.AbsFlexibleMarqueeGallery
    public Rect rectForIndex(int i2, int i3, boolean z, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("c5a782c2", new Object[]{this, new Integer(i2), new Integer(i3), new Boolean(z), rect});
        }
        if (rect == null) {
            rect = new Rect();
        }
        rect.set(this.mCardRectArray[i2]);
        return rect;
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.AbsFlexibleMarqueeGallery
    public void reloadViews(int i2, ViewGroup viewGroup) {
        boolean z;
        int i3;
        int i4;
        int i5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaa71366", new Object[]{this, new Integer(i2), viewGroup});
            return;
        }
        this.mLastContentOffset = 0;
        this.mCurrentItem = 0;
        this.mSetVisibleIndexedHandler.removeCallbacksAndMessages(null);
        this.init = false;
        this.childrenCount = i2;
        if (viewGroup != null) {
            this.mScrollContent = viewGroup;
            viewGroup.removeAllViews();
            z = true;
        } else {
            this.mScrollContent = new FlexibleContainerView(getContext());
            z = false;
        }
        int i6 = this.mExpectedAdapterCount;
        if (i6 > 2) {
            i3 = this.mFoldedCardVisibleCount + 1;
        } else {
            i3 = 1;
        }
        this.mActualVisibleCardCount = i3;
        this.mExpandedCardWidth = this.mGalleryDisplayWidth - ((this.mFoldedCardWidth + this.mCardSpacing) * Math.min(Math.max(0, i6 - 1), this.mFoldedCardVisibleCount));
        scrollToAndMuteOnScrollChanged(this.mIdleStateScrollOffset, 0);
        if (getChildCount() <= 0 || this.mScrollContent.getParent() != this) {
            if (getChildCount() > 0) {
                removeAllViews();
            }
            if (this.mScrollContent.getParent() != null) {
                ((ViewGroup) this.mScrollContent.getParent()).removeView(this.mScrollContent);
            }
        } else {
            this.init = z;
        }
        int i7 = this.mCardHeight;
        if (i7 <= 0) {
            i7 = getLayoutParams().height;
        }
        int i8 = (this.mIdleStateScrollOffset * 2) + this.mGalleryDisplayWidth;
        this.mainContentWidth = i8;
        this.mScrollContent.setMinimumWidth(i8);
        addView(this.mScrollContent, new FlexibleContainerView.LayoutParams(this.mainContentWidth, i7));
        this.mCardRectArray = initCardRectArray(this.mCardHeight, this.mExpandedCardWidth, this.mFoldedCardWidth, this.mCardSpacing, this.mActualVisibleCardCount);
        Rect rect = new Rect();
        int i9 = this.mActualVisibleCardCount;
        if (i9 > 1) {
            i4 = this.mGalleryDisplayWidth + this.mFoldedCardWidth + (this.mCardSpacing * 2);
        } else {
            i4 = this.mExpandedCardWidth;
        }
        this.backwardsLoopSpacing = i4;
        if (i9 > 1) {
            i5 = (this.mFoldedCardWidth + this.mCardSpacing) * (i9 + 1);
        } else {
            i5 = this.mExpandedCardWidth;
        }
        this.forwardsLoopSpacing = i5;
        String str = TAG;
        r0h.b(str, "MarqueeGallery >> screen=" + this.mGalleryDisplayWidth + " expandedCard.w=" + this.mExpandedCardWidth + " foldedCard.w=" + this.mFoldedCardWidth + " cardSpacing=" + this.mCardSpacing + " total=" + this.mExpectedAdapterCount + " visible=" + this.mActualVisibleCardCount);
        StringBuilder sb = new StringBuilder("MarqueeGallery >> backwardsSpacing=");
        sb.append(this.backwardsLoopSpacing);
        sb.append(" forwardsLoopSpacing=");
        sb.append(this.forwardsLoopSpacing);
        r0h.b(str, sb.toString());
        for (int i10 = 0; i10 < this.mExpectedAdapterCount; i10++) {
            i iVar = new i();
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setFocusable(true);
            frameLayout.setFocusableInTouchMode(true);
            frameLayout.setImportantForAccessibility(1);
            frameLayout.setTag("item_" + i10);
            if (this.mCardCornerRadius > 0.0f) {
                frameLayout.setOutlineProvider(new f());
                frameLayout.setClipToOutline(true);
            }
            iVar.f8793a = frameLayout;
            frameLayout.setBackgroundColor(-1);
            Object instantiateItem = this.mAdapter.instantiateItem((ViewGroup) frameLayout, i10);
            iVar.b = instantiateItem;
            if (instantiateItem instanceof View) {
                View view = (View) instantiateItem;
                if (view.getParent() == null) {
                    frameLayout.addView(view, new FrameLayout.LayoutParams(this.mExpandedCardWidth, this.mCardHeight));
                } else if (view.getParent() != frameLayout) {
                    ((ViewGroup) view.getParent()).removeView(view);
                    frameLayout.addView(view, new FrameLayout.LayoutParams(this.mExpandedCardWidth, this.mCardHeight));
                }
            } else {
                TextView textView = new TextView(getContext());
                textView.setText("item-" + i10);
                textView.setTextSize(1, 16.0f);
                frameLayout.addView(textView, new FrameLayout.LayoutParams(this.mExpandedCardWidth, this.mCardHeight));
            }
            this.mItems.add(iVar);
            if (this.mOnCardAnimatePerformListener != null) {
                if (i10 == this.mCurrentItem) {
                    triggerOnCardAnimatePerform(frameLayout, i10, 1.0f, true, this.mExpandedCardWidth, this.mCardHeight);
                } else {
                    triggerOnCardAnimatePerform(frameLayout, i10, 0.0f, true, this.mFoldedCardWidth, this.mCardHeight);
                }
            }
            if (i10 <= this.mActualVisibleCardCount) {
                rectForIndex(virtualIndexForViewIndex(i10), virtualIndexForViewIndex(this.mCurrentItem), true, rect);
                rect.offset(this.mIdleStateScrollOffset, 0);
                FlexibleContainerView.LayoutParams layoutParams = new FlexibleContainerView.LayoutParams(rect.width(), rect.height());
                layoutParams.fillLayoutResult(rect);
                this.mScrollContent.addView(iVar.f8793a, layoutParams);
            }
        }
        this.mCurrentVisibleVirtualIndexes.clear();
        this.mCurrentVisibleViewIndexes.clear();
        int virtualIndexForViewIndex = virtualIndexForViewIndex(this.mCurrentItem);
        this.lastVirtualStart = virtualIndexForViewIndex;
        this.lastVirtualEnd = (this.mActualVisibleCardCount + virtualIndexForViewIndex) - 1;
        if (this.mOnGalleryScrollListener != null) {
            while (virtualIndexForViewIndex <= this.lastVirtualEnd) {
                int viewIndexForVirtualIndex = viewIndexForVirtualIndex(virtualIndexForViewIndex);
                this.mCurrentVisibleVirtualIndexes.add(Integer.valueOf(virtualIndexForViewIndex));
                this.mCurrentVisibleViewIndexes.add(Integer.valueOf(viewIndexForVirtualIndex));
                ((bg6.a) this.mOnGalleryScrollListener).b(((i) getItemInfo(viewIndexForVirtualIndex, i.class)).f8793a, viewIndexForVirtualIndex, false);
                virtualIndexForViewIndex++;
            }
        }
    }

    public void scrollToAndMuteOnScrollChanged(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e545c847", new Object[]{this, new Integer(i2), new Integer(i3)});
            return;
        }
        this.muteOnScrollChanged = true;
        super.scrollTo(i2, i3);
        this.muteOnScrollChanged = false;
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.AbsFlexibleMarqueeGallery
    public void setAutoRunner(c4a c4aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("498ffe54", new Object[]{this, c4aVar});
        } else {
            this.mGallery2Runner = c4aVar;
        }
    }

    public void setBezierFactors(float f2, float f3, float f4, float f5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36d449ea", new Object[]{this, new Float(f2), new Float(f3), new Float(f4), new Float(f5)});
            return;
        }
        this.bezierFactors = new float[]{f2, f3, f4, f5};
        if (this.moveAnimatorInterpolator != null) {
            this.moveAnimatorInterpolator = null;
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.AbsFlexibleMarqueeGallery
    public void setCurrentSelected(int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d9af7ea", new Object[]{this, new Integer(i2), new Boolean(z)});
            return;
        }
        this.notifyOnSwitch = z;
        this.mCurrentItem = i2;
        if (getWidth() == 0) {
            post(new g());
        } else {
            scrollTo(this.mIdleStateScrollOffset, getScrollY());
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.AbsFlexibleMarqueeGallery
    public void setGalleryDisplayWidth(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7381d908", new Object[]{this, new Integer(i2)});
            return;
        }
        super.setGalleryDisplayWidth(i2);
        int i3 = this.mIdleStateScrollOffset;
        int i4 = this.mGalleryDisplayWidth;
        if (i3 < i4) {
            this.mIdleStateScrollOffset = ((int) Math.ceil(i4 / 1000.0f)) * 1000;
        }
    }

    public void setMoveAnimeDelayDistance(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdd84e85", new Object[]{this, new Integer(i2)});
        } else {
            this.moveAnimeDelayDistance = i2;
        }
    }

    public void setMoveAnimeDelayDistanceRate(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a60465c2", new Object[]{this, new Float(f2)});
        } else {
            this.moveAnimeDelayDistanceRate = f2;
        }
    }

    public void setScaleAnimeMinValue(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25bd854e", new Object[]{this, new Float(f2)});
            return;
        }
        this.scaleFactorK = f2;
        this.scaleFactorA = (1.0f - f2) / 0.25f;
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.AbsFlexibleMarqueeGallery
    public void setVisibleIndexes(Set<Integer> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10c08c28", new Object[]{this, set});
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.AbsFlexibleMarqueeGallery
    public void smoothScrollToRect(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3efe6aa2", new Object[]{this, new Integer(i2)});
        } else {
            smoothScrollToRectWithAnim(i2, true);
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.AbsFlexibleMarqueeGallery
    public void smoothScrollToRectWithAnim(int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86944d49", new Object[]{this, new Integer(i2), new Boolean(z)});
        } else if (z) {
            ValueAnimator valueAnimator = this.magnatePositionAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.myScroller.abortAnimation();
            int scrollX = getScrollX();
            this.mAutoScrollAnimationOnStart = scrollX;
            int i3 = i2 - scrollX;
            if (i3 != 0) {
                ValueAnimator ofInt = ValueAnimator.ofInt(0, i3);
                ofInt.setDuration(Math.max(400, Math.round(((float) this.animationDuration) * ((Math.abs(i3) * 1.0f) / getScrollLimit()))));
                ofInt.addUpdateListener(new d());
                ofInt.addListener(new e());
                this.magnatePositionAnimator = ofInt;
                ofInt.start();
            }
        } else {
            smoothScrollTo(i2, getScrollY());
        }
    }

    public void triggerOnCardAnimatePerform(View view, int i2, float f2, boolean z, int i3, int i4) {
        i iVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0b257f3", new Object[]{this, view, new Integer(i2), new Float(f2), new Boolean(z), new Integer(i3), new Integer(i4)});
            return;
        }
        float max = Math.max(0.0f, Math.min(1.0f, f2));
        if (this.mOnCardAnimatePerformListener != null && (iVar = (i) getItemInfo(i2, i.class)) != null) {
            h hVar = iVar.e;
            if (hVar == null) {
                this.mOnCardAnimatePerformListener.onAnimatePerform(view, i2, max, z, i3, i4);
                h hVar2 = new h();
                hVar2.f8801a = max;
                hVar2.b = z;
                hVar2.c = i3;
                hVar2.d = i4;
                iVar.e = hVar2;
            } else if (Float.compare(hVar.f8801a, max) != 0 || Float.compare(hVar.c, i3) != 0 || Float.compare(hVar.d, i4) != 0 || hVar.b != z) {
                this.mOnCardAnimatePerformListener.onAnimatePerform(view, i2, max, z, i3, i4);
                hVar.f8801a = max;
                hVar.b = z;
                hVar.c = i3;
                hVar.d = i4;
            }
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.AbsFlexibleMarqueeGallery
    public void updateCurrentSelected(int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("809011e3", new Object[]{this, new Integer(i2), new Boolean(z)});
        } else if (this.mScrollContent.getWidth() > 0) {
            int viewIndexForVirtualIndex = viewIndexForVirtualIndex(i2);
            int i3 = this.mCurrentItem;
            if (i3 != viewIndexForVirtualIndex) {
                this.lastSelectedItem = i3;
                this.mCurrentItem = viewIndexForVirtualIndex;
                if (getAutoRunner() != null) {
                    getAutoRunner().k(this.mCurrentItem);
                }
                if (this.notifyOnSwitch) {
                    post(new c(z));
                }
            }
            this.notifyOnSwitch = true;
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.AbsFlexibleMarqueeGallery
    public int viewIndexForVirtualIndex(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9d3a6a2c", new Object[]{this, new Integer(i2)})).intValue();
        }
        if (!this.loopScrollEnable) {
            return i2;
        }
        int i3 = this.mExpectedAdapterCount;
        return (((this.mCurrentItem + i2) - 1) + i3) % i3;
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.AbsFlexibleMarqueeGallery
    public int virtualIndexForViewIndex(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5ef851a4", new Object[]{this, new Integer(i2)})).intValue();
        }
        if (this.loopScrollEnable) {
            if (!this.init) {
                return i2 + 1;
            }
            if (i2 == this.mCurrentItem) {
                return 1;
            }
            int scrollX = getScrollX();
            int i3 = this.mCurrentItem;
            int i4 = i2 - i3;
            if (i4 != -1) {
                int i5 = this.mExpectedAdapterCount;
                if (i4 != i5 - 1) {
                    int i6 = (i2 - i3) + 1;
                    if (i6 < 0) {
                        return i6 + i5;
                    }
                    return i6;
                }
            }
            int i7 = this.mIdleStateScrollOffset;
            if (scrollX > i7) {
                int i8 = this.mActualVisibleCardCount + i3;
                int i9 = this.mExpectedAdapterCount;
                if (i8 >= i9) {
                    return ((i2 + i9) - i3) + 1;
                }
                return (i2 - i3) + 1;
            } else if (scrollX < i7) {
                return 0;
            }
        }
        return i2;
    }

    public FlexibleMarqueeGallery(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mGallery2Runner = null;
        this.mIdleStateScrollOffset = 1000;
        this.bezierFactors = null;
        this.scaleFactorA = 0.8f;
        this.scaleFactorK = 0.0f;
        this.moveAnimeDelayDistance = 0;
        this.moveAnimeDelayDistanceRate = 0.0f;
        this.magnatePositionAnimator = null;
        this.returnScroll = false;
        this.lastScrollStopX = 1000;
        this.tempResetItems = new HashSet();
        this.setVisibleIndexTask = null;
        this.muteOnScrollChanged = false;
        this.notifyOnSwitch = false;
        this.mReceiver = new BroadcastReceiver() { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.FlexibleMarqueeGallery.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass8 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/livehome/plugin/atype/flexalocal/dinamicx/flexible/view/FlexibleMarqueeGallery$8");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                } else if (FlexibleMarqueeGallery.access$100(FlexibleMarqueeGallery.this) != null) {
                    String action = intent.getAction();
                    if ("android.intent.action.SCREEN_OFF".equals(action)) {
                        FlexibleMarqueeGallery.access$100(FlexibleMarqueeGallery.this).m();
                    } else if (!"android.intent.action.USER_PRESENT".equals(action)) {
                    } else {
                        if (FlexibleMarqueeGallery.this.isShown()) {
                            FlexibleMarqueeGallery.access$100(FlexibleMarqueeGallery.this).n(false);
                        } else {
                            FlexibleMarqueeGallery.access$100(FlexibleMarqueeGallery.this).m();
                        }
                    }
                }
            }
        };
        this.mFlingFactor = 0.3f;
        this.myScroller = new OverScroller(context);
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.AbsFlexibleMarqueeGallery
    public boolean checkViewHasInVisibleRect(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a7875bd1", new Object[]{this, view, new Boolean(z)})).booleanValue();
        }
        if (view == null || view.getLayoutParams() == null || view.getParent() == null) {
            return false;
        }
        int i2 = z ? this.mCardSpacing : 0;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        if (!(layoutParams instanceof FlexibleContainerView.LayoutParams)) {
            return (layoutParams.leftMargin + layoutParams.width) + i2 > getScrollX() && (getScrollX() + getWidth()) + i2 > layoutParams.leftMargin;
        }
        FlexibleContainerView.LayoutParams layoutParams2 = (FlexibleContainerView.LayoutParams) layoutParams;
        return layoutParams2.right + i2 > getScrollX() && (getScrollX() + getWidth()) + i2 > layoutParams2.left;
    }
}
