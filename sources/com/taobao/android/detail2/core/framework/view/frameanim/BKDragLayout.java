package com.taobao.android.detail2.core.framework.view.frameanim;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Outline;
import android.graphics.Rect;
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
import android.widget.Toast;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import java.util.ArrayList;
import tb.cw6;
import tb.iap;
import tb.k0z;
import tb.l0z;
import tb.m0z;
import tb.t2o;
import tb.xfb;
import tb.zpz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class BKDragLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public zpz animLogHandler;
    private Integer dragBackMaskColor;
    private f dragCloseHelper;
    private iap mAnimLayoutInterface;
    private xfb mAnimPageContainer;
    private View shadowView;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a extends ViewOutlineProvider {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f7160a;

        public a(int i) {
            this.f7160a = i;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/view/frameanim/BKDragLayout$1");
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
            } else {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), l0z.a(BKDragLayout.this.getContext(), this.f7160a));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b extends f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(View view) {
            super(view);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/view/frameanim/BKDragLayout$2");
        }

        @Override // com.taobao.android.detail2.core.framework.view.frameanim.BKDragLayout.f
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2372e0ed", new Object[]{this});
                return;
            }
            BKDragLayout.access$000(BKDragLayout.this);
            BKDragLayout.this.getAnimLogHandler().a(BKDragLayout.this.getAnimLogHandler().b(), "无极缩放跟手返回取消，回滚动画执行中。", null);
        }

        @Override // com.taobao.android.detail2.core.framework.view.frameanim.BKDragLayout.f
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("badeed9", new Object[]{this});
            } else if (BKDragLayout.this.performCloseAnimation()) {
                BKDragLayout.this.getAnimLogHandler().a(BKDragLayout.this.getAnimLogHandler().b(), "无极缩放跟手返回成功，关闭动画执行成功。", null);
            } else {
                if (BKDragLayout.access$100(BKDragLayout.this) != null) {
                    BKDragLayout.access$100(BKDragLayout.this).M2();
                }
                zpz animLogHandler = BKDragLayout.this.getAnimLogHandler();
                String b = BKDragLayout.this.getAnimLogHandler().b();
                animLogHandler.a(b, "无极缩放跟手返回失败，关闭动画执行失败。mAnimPageContainer:" + BKDragLayout.access$100(BKDragLayout.this), null);
            }
        }

        @Override // com.taobao.android.detail2.core.framework.view.frameanim.BKDragLayout.f
        public void g(float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("25823117", new Object[]{this, new Float(f), new Float(f2)});
                return;
            }
            float abs = Math.abs(f);
            float width = BKDragLayout.this.getWidth();
            float max = Math.max(0.5f, Math.min(1.0f, 1.0f - (((abs / width) * 0.75f) * (1.0f - ((float) Math.exp(abs * (-0.01f)))))));
            float pow = ((float) Math.pow(1.0f - max, 3.0d)) * width * 0.4f;
            float f3 = width * 0.5f;
            float min = Math.min(Math.max(f, -f3), f3);
            float height = BKDragLayout.this.getHeight() * 0.3f;
            float min2 = Math.min(Math.max(f2, -height), height);
            if (f >= 0.0f) {
                BKDragLayout.this.setTranslationX(min);
                BKDragLayout.this.setTranslationY(min2 - pow);
                BKDragLayout.this.setScaleX(max);
                BKDragLayout.this.setScaleY(max);
                return;
            }
            BKDragLayout.this.setTranslationX(min);
            BKDragLayout.this.setTranslationY(min2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f7161a;
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
            this.f7161a = view;
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
            View view = this.f7161a;
            float f = this.b;
            view.setTranslationX(f + ((this.c - f) * floatValue));
            View view2 = this.f7161a;
            float f2 = this.d;
            view2.setTranslationY(f2 + ((this.e - f2) * floatValue));
            View view3 = this.f7161a;
            float f3 = this.f;
            view3.setScaleX(f3 + ((this.g - f3) * floatValue));
            View view4 = this.f7161a;
            float f4 = this.h;
            view4.setScaleY(f4 + ((this.i - f4) * floatValue));
            float f5 = 1.0f - floatValue;
            this.f7161a.setAlpha(this.j * f5);
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
            BKDragLayout.access$300(BKDragLayout.this).setAlpha(this.j * f5);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f7162a;
        public final /* synthetic */ View b;

        public d(ViewGroup viewGroup, View view) {
            this.f7162a = viewGroup;
            this.b = view;
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/view/frameanim/BKDragLayout$4");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            this.f7162a.getOverlay().remove(this.b);
            if (!(BKDragLayout.access$400(BKDragLayout.this) == null || BKDragLayout.access$400(BKDragLayout.this).d() == null)) {
                BKDragLayout.access$400(BKDragLayout.this).d().setVisibility(8);
            }
            if (!(BKDragLayout.access$400(BKDragLayout.this) == null || BKDragLayout.access$400(BKDragLayout.this).c() == null)) {
                BKDragLayout.access$400(BKDragLayout.this).c().setVisibility(8);
            }
            if (BKDragLayout.access$100(BKDragLayout.this) != null) {
                BKDragLayout.access$100(BKDragLayout.this).M2();
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
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
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
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/view/frameanim/BKDragLayout$5");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            super.onAnimationEnd(animator);
            BKDragLayout.access$200(BKDragLayout.this, 0);
            m0z.a(BKDragLayout.this.getContext());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public float f7164a;
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
            t2o.a(352321984);
        }

        public f(View view) {
            this.k = view;
            this.h = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.i = l0z.c(view.getContext()) * 0.2f;
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

        public final void b(float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2b5c5c4d", new Object[]{this, new Float(f), new Float(f2)});
            } else if (f > this.i) {
                e();
            } else if (f2 > this.j) {
                e();
            } else {
                d();
            }
        }

        public final void c() {
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

        public void d() {
            throw null;
        }

        public void e() {
            throw null;
        }

        public boolean f(MotionEvent motionEvent) {
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
                                h(motionEvent);
                            }
                        }
                    } else if (j(this.k) || this.f) {
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
                        float f = x - this.f7164a;
                        if (f == 0.0f || !a(this.k, false, (int) f, (int) x, (int) y)) {
                            l(rawX, rawY);
                        } else {
                            this.f7164a = x;
                            this.f = true;
                            return false;
                        }
                    }
                }
                this.e = false;
                this.f = false;
                this.g = -1;
            } else if (j(this.k)) {
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
                this.f7164a = motionEvent.getX();
                this.b = motionEvent.getY();
            }
            return this.e;
        }

        public void g(float f, float f2) {
            throw null;
        }

        public final void h(MotionEvent motionEvent) {
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

        public boolean i(MotionEvent motionEvent) {
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
                                h(motionEvent);
                            }
                        }
                    } else if (motionEvent.findPointerIndex(this.g) < 0) {
                        Log.e("DragCloseHelper", "Got ACTION_MOVE event but have an invalid active pointer id.");
                        return false;
                    } else {
                        float rawX = motionEvent.getRawX();
                        float rawY = motionEvent.getRawY();
                        l(rawX, rawY);
                        if (this.e) {
                            g(rawX - this.f7164a, rawY - this.b);
                        }
                    }
                }
                if (motionEvent.findPointerIndex(this.g) < 0) {
                    Log.e("DragCloseHelper", "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.e) {
                    float rawX2 = motionEvent.getRawX() - this.f7164a;
                    this.e = false;
                    this.l.computeCurrentVelocity(1);
                    b(rawX2, this.l.getXVelocity());
                }
                this.g = -1;
                return false;
            }
            this.f7164a = motionEvent.getRawX();
            this.b = motionEvent.getRawY();
            this.g = motionEvent.getPointerId(0);
            this.e = false;
            c();
            VelocityTracker velocityTracker = this.l;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return true;
        }

        public final boolean j(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6a1b4452", new Object[]{this, view})).booleanValue();
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt != null && j(childAt)) {
                        return true;
                    }
                }
            }
            return false;
        }

        public void k() {
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

        public final void l(float f, float f2) {
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dcd19d8", new Object[]{this, new Float(f), new Float(f2)});
            } else if (!this.e) {
                float f3 = f - this.c;
                if (Math.abs(f3) * 0.5f > Math.abs(f2 - this.d)) {
                    z = true;
                }
                if (f3 > this.h && z) {
                    BKDragLayout.this.preparePageForPageBack();
                    this.e = true;
                }
                if (this.e) {
                    BKDragLayout.access$200(BKDragLayout.this, 20);
                }
            }
        }
    }

    static {
        t2o.a(352321978);
    }

    public BKDragLayout(Context context) {
        this(context, null);
    }

    public static /* synthetic */ void access$000(BKDragLayout bKDragLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83f35dc8", new Object[]{bKDragLayout});
        } else {
            bKDragLayout.performRollToNormalAnimation();
        }
    }

    public static /* synthetic */ xfb access$100(BKDragLayout bKDragLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xfb) ipChange.ipc$dispatch("b43d29e5", new Object[]{bKDragLayout});
        }
        return bKDragLayout.mAnimPageContainer;
    }

    public static /* synthetic */ void access$200(BKDragLayout bKDragLayout, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ca92bd", new Object[]{bKDragLayout, new Integer(i)});
        } else {
            bKDragLayout.setRadius(i);
        }
    }

    public static /* synthetic */ View access$300(BKDragLayout bKDragLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("69d66ba7", new Object[]{bKDragLayout});
        }
        return bKDragLayout.shadowView;
    }

    public static /* synthetic */ iap access$400(BKDragLayout bKDragLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iap) ipChange.ipc$dispatch("c94087c7", new Object[]{bKDragLayout});
        }
        return bKDragLayout.mAnimLayoutInterface;
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

    private void initView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f359fd6c", new Object[]{this, context});
        } else {
            this.dragCloseHelper = new b(this);
        }
    }

    public static /* synthetic */ Object ipc$super(BKDragLayout bKDragLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/detail2/core/framework/view/frameanim/BKDragLayout");
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

    public zpz getAnimLogHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zpz) ipChange.ipc$dispatch("6c41a345", new Object[]{this});
        }
        return k0z.d(this.animLogHandler);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        View view = new View(getContext());
        this.shadowView = view;
        Integer num = this.dragBackMaskColor;
        if (num != null) {
            view.setBackgroundColor(num.intValue());
        }
        this.shadowView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
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
        this.dragCloseHelper.k();
        ((ViewGroup) getParent()).removeView(this.shadowView);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        return this.dragCloseHelper.f(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        return this.dragCloseHelper.i(motionEvent);
    }

    public void preparePageForPageBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e60fdf0", new Object[]{this});
            return;
        }
        Activity realActivity = NewDetailMaskFrameLayout.getRealActivity(getContext());
        if (realActivity != null) {
            this.mAnimLayoutInterface.b();
            m0z.b(realActivity);
        }
    }

    public void setAnimLayoutInterface(iap iapVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69c755d8", new Object[]{this, iapVar});
        } else {
            this.mAnimLayoutInterface = iapVar;
        }
    }

    public void setAnimLogHandler(zpz zpzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67977d23", new Object[]{this, zpzVar});
        } else {
            this.animLogHandler = zpzVar;
        }
    }

    public void setAnimPageContainer(xfb xfbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6aaa65a8", new Object[]{this, xfbVar});
        } else {
            this.mAnimPageContainer = xfbVar;
        }
    }

    public void setShadowViewBackgroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3d05e2e", new Object[]{this, new Integer(i)});
            return;
        }
        this.dragBackMaskColor = Integer.valueOf(i);
        View view = this.shadowView;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    public BKDragLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BKDragLayout(Context context, AttributeSet attributeSet, int i) {
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

    public boolean performCloseAnimation() {
        View a2;
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7dd3f038", new Object[]{this})).booleanValue();
        }
        iap iapVar = this.mAnimLayoutInterface;
        if (iapVar == null || (a2 = iapVar.a()) == null || (viewGroup = (ViewGroup) a2.getParent()) == null || "OverlayViewGroup".equals(viewGroup.getClass().getSimpleName()) || (viewGroup instanceof ScrollView)) {
            return false;
        }
        ViewGroup.LayoutParams layoutParams = a2.getLayoutParams();
        layoutParams.width = a2.getWidth();
        layoutParams.height = a2.getHeight();
        viewGroup.addView(new View(Globals.getApplication()), layoutParams);
        Rect rect = new Rect();
        getBoundsOnScreen(a2, rect);
        int i = rect.left;
        int i2 = rect.top;
        int width = rect.width();
        int height = rect.height();
        if ((width == 0 || height == 0) && cw6.b()) {
            Toast.makeText(getContext(), "异常:无有效的共享元素，请修复。", 1).show();
            return false;
        }
        a2.setVisibility(0);
        iap iapVar2 = this.mAnimLayoutInterface;
        ViewGroup e2 = iapVar2 == null ? null : iapVar2.e();
        if (e2 == null) {
            return false;
        }
        preparePageForPageBack();
        e2.getOverlay().clear();
        e2.getOverlay().add(a2);
        float scaleX = a2.getScaleX();
        float scaleY = a2.getScaleY();
        float translationX = a2.getTranslationX();
        float translationY = a2.getTranslationY();
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
        duration.addUpdateListener(new c(this, translationX2, f4 - width3, translationY2, f5 - height3, scaleX2, width2, scaleY2, height2, alpha, a2, (translationX2 + width3) - f4, translationX, (translationY2 + height3) - f5, translationY, (getWidth() * scaleX2) / f2, scaleX, (getHeight() * scaleY2) / f3, scaleY));
        duration.addListener(new d(e2, a2));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(duration);
        animatorSet.start();
        return true;
    }
}
