package com.taobao.android.layoutmanager.container.containerlifecycle;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.SeekBar;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import com.taobao.tao.flexbox.layoutmanager.core.q;
import java.util.ArrayList;
import java.util.List;
import tb.akt;
import tb.anl;
import tb.hpj;
import tb.ied;
import tb.jl4;
import tb.mw7;
import tb.pn1;
import tb.s6o;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DragLayout extends FrameLayout implements jl4, mw7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean disableScroll;
    private f dragCloseHelper;
    private pn1 mBackInterceptListener;
    private hpj.b mNavigationBarColorChangeListener;
    private anl pageInterface;
    private View shadowView;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends ViewOutlineProvider {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f8187a;

        public a(int i) {
            this.f8187a = i;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/layoutmanager/container/containerlifecycle/DragLayout$1");
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
            } else {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), s6o.c(DragLayout.this.getContext(), this.f8187a));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b extends f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(View view) {
            super(view);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/layoutmanager/container/containerlifecycle/DragLayout$2");
        }

        @Override // com.taobao.android.layoutmanager.container.containerlifecycle.DragLayout.f
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2372e0ed", new Object[]{this});
                return;
            }
            DragLayout.access$000(DragLayout.this);
            DragLayout.access$100(DragLayout.this).onWindowFocusChanged(true);
            if (DragLayout.access$200(DragLayout.this) != null) {
                DragLayout.access$200(DragLayout.this).onBack(hpj.f20803a);
            }
        }

        @Override // com.taobao.android.layoutmanager.container.containerlifecycle.DragLayout.f
        public void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("badeed9", new Object[]{this});
            } else if (DragLayout.access$300(DragLayout.this)) {
                DragLayout.access$400(DragLayout.this).b();
            } else if (!DragLayout.access$100(DragLayout.this).isFullPage()) {
                if (!akt.L2(DragLayout.access$100(DragLayout.this))) {
                    ((ViewGroup) DragLayout.this.getParent()).removeView(DragLayout.access$500(DragLayout.this));
                }
                DragLayout.access$100(DragLayout.this).finish(true);
            } else if (!DragLayout.this.performCloseAnimation()) {
                DragLayout.access$100(DragLayout.this).finish(false);
            }
        }

        @Override // com.taobao.android.layoutmanager.container.containerlifecycle.DragLayout.f
        public void h(float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("25823117", new Object[]{this, new Float(f), new Float(f2)});
            } else if (!DragLayout.access$300(DragLayout.this)) {
                float abs = 1.0f - ((Math.abs(f) / DragLayout.this.getWidth()) * 0.75f);
                float f3 = 1.0f - abs;
                float width = f3 * f3 * DragLayout.this.getWidth() * 0.5f;
                if (f >= 0.0f) {
                    DragLayout.this.setTranslationX(f);
                    DragLayout.this.setTranslationY(f2 - width);
                    DragLayout.this.setScaleX(abs);
                    DragLayout.this.setScaleY(abs);
                } else {
                    DragLayout.this.setTranslationX(f);
                    DragLayout.this.setTranslationY(f2);
                }
                DragLayout.access$100(DragLayout.this).onWindowFocusChanged(false);
                if (DragLayout.access$200(DragLayout.this) != null) {
                    DragLayout.access$200(DragLayout.this).onMove(hpj.f20803a);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f8188a;
        public final /* synthetic */ float b;
        public final /* synthetic */ float c;
        public final /* synthetic */ float d;
        public final /* synthetic */ float e;
        public final /* synthetic */ float f;
        public final /* synthetic */ float g;
        public final /* synthetic */ float h;
        public final /* synthetic */ float i;
        public final /* synthetic */ float j;
        public final /* synthetic */ View k;
        public final /* synthetic */ float l;
        public final /* synthetic */ float m;
        public final /* synthetic */ float n;
        public final /* synthetic */ float o;
        public final /* synthetic */ float p;
        public final /* synthetic */ float q;
        public final /* synthetic */ float r;
        public final /* synthetic */ float s;

        public c(View view, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, View view2, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
            this.f8188a = view;
            this.b = f;
            this.c = f2;
            this.d = f3;
            this.e = f4;
            this.f = f5;
            this.g = f6;
            this.h = f7;
            this.i = f8;
            this.j = f9;
            this.k = view2;
            this.l = f10;
            this.m = f11;
            this.n = f12;
            this.o = f13;
            this.p = f14;
            this.q = f15;
            this.r = f16;
            this.s = f17;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            View view = this.f8188a;
            float f = this.b;
            view.setTranslationX(f + ((this.c - f) * floatValue));
            View view2 = this.f8188a;
            float f2 = this.d;
            view2.setTranslationY(f2 + ((this.e - f2) * floatValue));
            View view3 = this.f8188a;
            float f3 = this.f;
            view3.setScaleX(f3 + ((this.g - f3) * floatValue));
            View view4 = this.f8188a;
            float f4 = this.h;
            view4.setScaleY(f4 + ((this.i - f4) * floatValue));
            float f5 = 1.0f - floatValue;
            this.f8188a.setAlpha(this.j * f5);
            View view5 = this.k;
            float f6 = this.l;
            view5.setTranslationX(f6 + ((this.m - f6) * floatValue));
            View view6 = this.k;
            float f7 = this.n;
            view6.setTranslationY(f7 + ((this.o - f7) * floatValue));
            View view7 = this.k;
            float f8 = this.p;
            view7.setScaleX(f8 + ((this.q - f8) * floatValue));
            View view8 = this.k;
            float f9 = this.r;
            view8.setScaleY(f9 + ((this.s - f9) * floatValue));
            this.k.setAlpha(floatValue);
            DragLayout.access$500(DragLayout.this).setAlpha(this.j * f5);
            if (DragLayout.access$200(DragLayout.this) != null) {
                DragLayout.access$200(DragLayout.this).onFinish(hpj.f20803a, f5);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f8189a;
        public final /* synthetic */ View b;
        public final /* synthetic */ ViewGroup c;
        public final /* synthetic */ View d;
        public final /* synthetic */ ViewGroup.LayoutParams e;

        public d(ViewGroup viewGroup, View view, ViewGroup viewGroup2, View view2, ViewGroup.LayoutParams layoutParams) {
            this.f8189a = viewGroup;
            this.b = view;
            this.c = viewGroup2;
            this.d = view2;
            this.e = layoutParams;
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/layoutmanager/container/containerlifecycle/DragLayout$4");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            this.f8189a.getOverlay().remove(this.b);
            this.c.removeView(this.d);
            if (this.b.getParent() != null) {
                ((ViewGroup) this.b.getParent()).removeView(this.b);
            }
            this.c.addView(this.b, this.e);
            if (DragLayout.access$100(DragLayout.this) != null) {
                DragLayout.access$100(DragLayout.this).finish(false);
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
    public class e extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            if (str.hashCode() == -2145066406) {
                super.onAnimationEnd((Animator) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/layoutmanager/container/containerlifecycle/DragLayout$5");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            super.onAnimationEnd(animator);
            DragLayout.access$600(DragLayout.this, 0);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public float f8191a;
        public float b;
        public float c;
        public float d;
        public boolean e;
        public boolean f;
        public final int h;
        public final float i;
        public final View k;
        public int g = -1;
        public final int j = 4;
        public VelocityTracker l = VelocityTracker.obtain();

        static {
            t2o.a(502268033);
        }

        public f(View view) {
            this.k = view;
            this.h = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.i = s6o.B(view.getContext()) * 0.2f;
        }

        public final boolean a(View view, boolean z, int i, int i2, int i3) {
            int i4;
            int i5;
            int i6;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4259e1", new Object[]{this, view, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3)})).booleanValue();
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int scrollX = view.getScrollX();
                int scrollY = view.getScrollY();
                int childCount = viewGroup.getChildCount() - 1;
                while (childCount >= 0) {
                    View childAt = viewGroup.getChildAt(childCount);
                    if (childAt != null && (i5 = i2 + scrollX) >= childAt.getLeft() && i5 < childAt.getRight() * childAt.getScaleX() && (i6 = i3 + scrollY) >= childAt.getTop() && i6 < childAt.getBottom()) {
                        i4 = childCount;
                        if (a(childAt, true, i, (int) ((i5 - childAt.getLeft()) / childAt.getScaleX()), i6 - childAt.getTop())) {
                            return true;
                        }
                    } else {
                        i4 = childCount;
                    }
                    childCount = i4 - 1;
                }
            } else if (view instanceof SeekBar) {
                return true;
            }
            if (!z || !view.canScrollHorizontally(-i)) {
                return false;
            }
            return true;
        }

        public final boolean b(float f, float f2) {
            n d0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e5ec7d4a", new Object[]{this, new Float(f), new Float(f2)})).booleanValue();
            }
            o tNodeEngine = DragLayout.access$100(DragLayout.this).getTNodeEngine();
            if (tNodeEngine == null || (d0 = tNodeEngine.d0()) == null || q.e(d0, (int) f, (int) f2, true) == null) {
                return true;
            }
            return false;
        }

        public final void c(float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2b5c5c4d", new Object[]{this, new Float(f), new Float(f2)});
            } else if (f > this.i) {
                f();
            } else if (f2 > this.j) {
                f();
            } else {
                e();
            }
        }

        public final void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bd6d5772", new Object[]{this});
                return;
            }
            VelocityTracker velocityTracker = this.l;
            if (velocityTracker == null) {
                this.l = VelocityTracker.obtain();
            } else {
                velocityTracker.clear();
            }
        }

        public void e() {
            throw null;
        }

        public void f() {
            throw null;
        }

        public boolean g(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            if (actionMasked == 6) {
                                i(motionEvent);
                            }
                        }
                    } else if (k(this.k) || this.f) {
                        return false;
                    } else {
                        if (this.e) {
                            return true;
                        }
                        int i = this.g;
                        if (i == -1) {
                            Log.e("DragCloseHelper", "Got ACTION_MOVE event but don't have an active pointer id.");
                            return false;
                        }
                        int findPointerIndex = motionEvent.findPointerIndex(i);
                        if (findPointerIndex < 0) {
                            return false;
                        }
                        float rawX = motionEvent.getRawX();
                        float rawY = motionEvent.getRawY();
                        float x = motionEvent.getX(findPointerIndex);
                        float y = motionEvent.getY(findPointerIndex);
                        float f = x - this.f8191a;
                        if (f == 0.0f || !a(this.k, false, (int) f, (int) x, (int) y)) {
                            m(rawX, rawY);
                        } else {
                            this.f8191a = x;
                            this.f = true;
                            return false;
                        }
                    }
                }
                this.e = false;
                this.f = false;
                this.g = -1;
            } else if (k(this.k)) {
                return false;
            } else {
                View view = this.k;
                if (view instanceof ViewGroup) {
                    ((ViewGroup) view).requestDisallowInterceptTouchEvent(false);
                }
                int pointerId = motionEvent.getPointerId(0);
                this.g = pointerId;
                this.e = false;
                this.f = false;
                if (motionEvent.findPointerIndex(pointerId) < 0) {
                    return false;
                }
                this.c = motionEvent.getRawX();
                this.d = motionEvent.getRawY();
                this.f8191a = motionEvent.getX();
                this.b = motionEvent.getY();
            }
            return this.e;
        }

        public void h(float f, float f2) {
            throw null;
        }

        public final void i(MotionEvent motionEvent) {
            int i = 1;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f24b537f", new Object[]{this, motionEvent});
                return;
            }
            int actionIndex = motionEvent.getActionIndex();
            if (motionEvent.getPointerId(actionIndex) == this.g) {
                if (actionIndex != 0) {
                    i = 0;
                }
                this.g = motionEvent.getPointerId(i);
            }
        }

        public boolean j(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            if (actionMasked == 5) {
                                int actionIndex = motionEvent.getActionIndex();
                                if (actionIndex < 0) {
                                    Log.e("DragCloseHelper", "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                                    return false;
                                }
                                this.g = motionEvent.getPointerId(actionIndex);
                            } else if (actionMasked == 6) {
                                i(motionEvent);
                            }
                        }
                    } else if (motionEvent.findPointerIndex(this.g) < 0) {
                        Log.e("DragCloseHelper", "Got ACTION_MOVE event but have an invalid active pointer id.");
                        return false;
                    } else {
                        float rawX = motionEvent.getRawX();
                        float rawY = motionEvent.getRawY();
                        m(rawX, rawY);
                        if (this.e) {
                            h(rawX - this.f8191a, rawY - this.b);
                        }
                    }
                }
                if (motionEvent.findPointerIndex(this.g) < 0) {
                    Log.e("DragCloseHelper", "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.e) {
                    float rawX2 = motionEvent.getRawX() - this.f8191a;
                    this.e = false;
                    this.l.computeCurrentVelocity(1);
                    c(rawX2, this.l.getXVelocity());
                }
                this.g = -1;
                return false;
            }
            this.f8191a = motionEvent.getRawX();
            this.b = motionEvent.getRawY();
            this.g = motionEvent.getPointerId(0);
            this.e = false;
            d();
            VelocityTracker velocityTracker = this.l;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return true;
        }

        public final boolean k(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6a1b4452", new Object[]{this, view})).booleanValue();
            }
            if ((view instanceof ied) && ((ied) view).canPullIntercept(ied.PULL_HORIZONTAL_DRAG)) {
                return true;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt != null) {
                        if (k(childAt)) {
                            return true;
                        }
                        if (childAt instanceof ied) {
                            break;
                        }
                    }
                }
            }
            return false;
        }

        public void l() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9a86dd0f", new Object[]{this});
                return;
            }
            VelocityTracker velocityTracker = this.l;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.l = null;
            }
        }

        public final void m(float f, float f2) {
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dcd19d8", new Object[]{this, new Float(f), new Float(f2)});
            } else if (!this.e) {
                float f3 = f - this.c;
                if (Math.abs(f3) * 0.5f > Math.abs(f2 - this.d)) {
                    z = true;
                }
                if (f3 > this.h && z && b(f, f2)) {
                    this.e = true;
                }
                if (this.e) {
                    DragLayout.access$600(DragLayout.this, 20);
                }
            }
        }
    }

    static {
        t2o.a(502268027);
        t2o.a(503316674);
        t2o.a(503316943);
    }

    public DragLayout(Context context) {
        this(context, null);
    }

    public static /* synthetic */ void access$000(DragLayout dragLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75496caf", new Object[]{dragLayout});
        } else {
            dragLayout.performRollToNormalAnimation();
        }
    }

    public static /* synthetic */ anl access$100(DragLayout dragLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (anl) ipChange.ipc$dispatch("8bed4ae2", new Object[]{dragLayout});
        }
        return dragLayout.pageInterface;
    }

    public static /* synthetic */ hpj.b access$200(DragLayout dragLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hpj.b) ipChange.ipc$dispatch("44e0e951", new Object[]{dragLayout});
        }
        return dragLayout.mNavigationBarColorChangeListener;
    }

    public static /* synthetic */ boolean access$300(DragLayout dragLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16b56eb6", new Object[]{dragLayout})).booleanValue();
        }
        return dragLayout.shouldInterceptBack();
    }

    public static /* synthetic */ pn1 access$400(DragLayout dragLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pn1) ipChange.ipc$dispatch("72188f70", new Object[]{dragLayout});
        }
        return dragLayout.mBackInterceptListener;
    }

    public static /* synthetic */ View access$500(DragLayout dragLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("cfe0edf6", new Object[]{dragLayout});
        }
        return dragLayout.shadowView;
    }

    public static /* synthetic */ void access$600(DragLayout dragLayout, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c0d18ee", new Object[]{dragLayout, new Integer(i)});
        } else {
            dragLayout.setRadius(i);
        }
    }

    private void getBoundsOnScreen(View view, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5efed4c4", new Object[]{this, view, rect});
            return;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        rect.set(i, iArr[1], view.getWidth() + i, iArr[1] + view.getHeight());
    }

    private ViewGroup getSceneRoot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("e1a44dd6", new Object[]{this});
        }
        anl anlVar = this.pageInterface;
        if (anlVar == null) {
            return null;
        }
        return (ViewGroup) anlVar.getPageContainer().getContainerView().getParent();
    }

    private void initView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f359fd6c", new Object[]{this, context});
        } else {
            this.dragCloseHelper = new b(this);
        }
    }

    public static /* synthetic */ Object ipc$super(DragLayout dragLayout, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/layoutmanager/container/containerlifecycle/DragLayout");
        }
    }

    private void setRadius(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c80fd848", new Object[]{this, new Integer(i)});
        } else if (Build.VERSION.SDK_INT >= 23) {
            setClipToOutline(true);
            setOutlineProvider(new a(i));
        }
    }

    private boolean shouldInterceptBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b6a4761", new Object[]{this})).booleanValue();
        }
        pn1 pn1Var = this.mBackInterceptListener;
        if (pn1Var == null || !pn1Var.a()) {
            return false;
        }
        return true;
    }

    public void bindNavigationBarColorChangeListener(hpj.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10923f58", new Object[]{this, bVar});
        } else {
            this.mNavigationBarColorChangeListener = bVar;
        }
    }

    public void bindPage(anl anlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e91bc46f", new Object[]{this, anlVar});
        } else {
            this.pageInterface = anlVar;
        }
    }

    public void disableScroll(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a473478", new Object[]{this, new Boolean(z)});
        } else {
            this.disableScroll = z;
        }
    }

    @Override // tb.mw7
    public View findShadowView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c33ded07", new Object[]{this});
        }
        return this.shadowView;
    }

    @Override // tb.jl4
    public RectF getContainerBounds() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("7bac14a0", new Object[]{this});
        }
        RectF rectF = new RectF();
        rectF.left = getLeft() + getTranslationX() + (getWidth() * (1.0f - getScaleX()) * 0.5f);
        rectF.top = getTop() + getTranslationY() + (getHeight() * (1.0f - getScaleY()) * 0.5f);
        rectF.right = rectF.left + (getWidth() * getScaleX());
        rectF.bottom = rectF.top + (getHeight() * getScaleY());
        if (!akt.L2(this.pageInterface)) {
            setTranslationX((-getWidth()) * (1.0f - getScaleX()) * 0.5f);
            setTranslationY((-getHeight()) * (1.0f - getScaleY()) * 0.5f);
        }
        return rectF;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        this.shadowView = new View(getContext());
        this.shadowView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        if (!this.pageInterface.isFullPage()) {
            setShadowViewBackgroundColor(Color.parseColor("#52000000"));
        }
        ((ViewGroup) getParent()).addView(this.shadowView, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        this.dragCloseHelper.l();
        ((ViewGroup) getParent()).removeView(this.shadowView);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.disableScroll) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return this.dragCloseHelper.g(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.disableScroll) {
            super.onTouchEvent(motionEvent);
        }
        return this.dragCloseHelper.j(motionEvent);
    }

    public boolean performCloseAnimation() {
        List<View> list;
        View view;
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7dd3f038", new Object[]{this})).booleanValue();
        }
        if (this.pageInterface.getPageTransition() != null) {
            list = this.pageInterface.getPageTransition().b();
        } else {
            list = null;
        }
        if (list == null || list.size() == 0 || (view = list.get(0)) == null || (viewGroup = (ViewGroup) view.getParent()) == null || "OverlayViewGroup".equals(viewGroup.getClass().getSimpleName()) || (viewGroup instanceof ScrollView)) {
            return false;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = view.getWidth();
        layoutParams.height = view.getHeight();
        View view2 = new View(o.J());
        viewGroup.addView(view2, layoutParams);
        Rect rect = new Rect();
        getBoundsOnScreen(view, rect);
        int i = rect.left;
        int i2 = rect.top;
        int width = rect.width();
        int height = rect.height();
        view.setVisibility(0);
        ViewGroup sceneRoot = getSceneRoot();
        if (sceneRoot == null) {
            return false;
        }
        sceneRoot.getOverlay().add(view);
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float scaleX2 = getScaleX();
        float scaleY2 = getScaleY();
        float translationX2 = getTranslationX();
        float translationY2 = getTranslationY();
        float f2 = width;
        float width2 = f2 / getWidth();
        float f3 = height;
        float height2 = f3 / getHeight();
        float width3 = getWidth() * (1.0f - width2) * 0.5f;
        float height3 = getHeight() * (1.0f - height2) * 0.5f;
        float f4 = i;
        float f5 = i2;
        float alpha = this.shadowView.getAlpha();
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        duration.addUpdateListener(new c(this, translationX2, f4 - width3, translationY2, f5 - height3, scaleX2, width2, scaleY2, height2, alpha, view, (translationX2 + width3) - f4, translationX, (translationY2 + height3) - f5, translationY, (getWidth() * scaleX2) / f2, scaleX, (getHeight() * scaleY2) / f3, scaleY));
        duration.addListener(new d(sceneRoot, view, viewGroup, view2, layoutParams));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(duration);
        animatorSet.start();
        return true;
    }

    public void setBackInterceptListener(pn1 pn1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f1b8b61", new Object[]{this, pn1Var});
        } else {
            this.mBackInterceptListener = pn1Var;
        }
    }

    public void setShadowViewBackgroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3d05e2e", new Object[]{this, new Integer(i)});
            return;
        }
        View view = this.shadowView;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    public DragLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DragLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initView(context);
    }

    private void performRollToNormalAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6707e10b", new Object[]{this});
            return;
        }
        ArrayList arrayList = new ArrayList();
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, "scaleX", getScaleX(), 1.0f).setDuration(200L);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this, "scaleY", getScaleX(), 1.0f).setDuration(200L);
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(this, "translationX", getTranslationX(), 0.0f).setDuration(200L);
        ObjectAnimator duration4 = ObjectAnimator.ofFloat(this, "translationY", getTranslationY(), 0.0f).setDuration(200L);
        arrayList.add(duration);
        arrayList.add(duration2);
        arrayList.add(duration3);
        arrayList.add(duration4);
        duration3.addListener(new e());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.start();
    }
}
