package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.customview.widget.ViewDragHelper;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;
    public static final int SWIPE_DIRECTION_ANY = 2;
    public static final int SWIPE_DIRECTION_END_TO_START = 1;
    public static final int SWIPE_DIRECTION_START_TO_END = 0;

    /* renamed from: a  reason: collision with root package name */
    public ViewDragHelper f5024a;
    public c b;
    public boolean c;
    public int d = 2;
    public final float e = 0.5f;
    public float f = 0.0f;
    public float g = 0.5f;
    public final ViewDragHelper.Callback h = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a extends ViewDragHelper.Callback {

        /* renamed from: a  reason: collision with root package name */
        public int f5025a;
        public int b = -1;

        public a() {
        }

        public final boolean a(View view, float f) {
            boolean z;
            SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
            int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            if (i != 0) {
                if (ViewCompat.getLayoutDirection(view) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                int i2 = swipeDismissBehavior.d;
                if (i2 == 2) {
                    return true;
                }
                if (i2 == 0) {
                    if (z) {
                        if (f >= 0.0f) {
                            return false;
                        }
                    } else if (i <= 0) {
                        return false;
                    }
                    return true;
                } else if (i2 != 1) {
                    return false;
                } else {
                    if (z) {
                        if (i <= 0) {
                            return false;
                        }
                    } else if (f >= 0.0f) {
                        return false;
                    }
                    return true;
                }
            } else {
                if (Math.abs(view.getLeft() - this.f5025a) >= Math.round(view.getWidth() * swipeDismissBehavior.e)) {
                    return true;
                }
                return false;
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionHorizontal(View view, int i, int i2) {
            boolean z;
            int i3;
            int i4;
            int width;
            if (ViewCompat.getLayoutDirection(view) == 1) {
                z = true;
            } else {
                z = false;
            }
            int i5 = SwipeDismissBehavior.this.d;
            if (i5 == 0) {
                if (z) {
                    i3 = this.f5025a - view.getWidth();
                    i4 = this.f5025a;
                } else {
                    i3 = this.f5025a;
                    width = view.getWidth();
                    i4 = width + i3;
                }
            } else if (i5 != 1) {
                i3 = this.f5025a - view.getWidth();
                i4 = view.getWidth() + this.f5025a;
            } else if (z) {
                i3 = this.f5025a;
                width = view.getWidth();
                i4 = width + i3;
            } else {
                i3 = this.f5025a - view.getWidth();
                i4 = this.f5025a;
            }
            return SwipeDismissBehavior.c(i3, i, i4);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionVertical(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int getViewHorizontalDragRange(View view) {
            return view.getWidth();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewCaptured(View view, int i) {
            this.b = i;
            this.f5025a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewDragStateChanged(int i) {
            c cVar = SwipeDismissBehavior.this.b;
            if (cVar != null) {
                ((BaseTransientBottomBar.p) cVar).b(i);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
            float width = this.f5025a + (view.getWidth() * swipeDismissBehavior.f);
            float width2 = this.f5025a + (view.getWidth() * swipeDismissBehavior.g);
            float f = i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.b(0.0f, 1.0f - SwipeDismissBehavior.e(width, width2, f), 1.0f));
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewReleased(View view, float f, float f2) {
            boolean z;
            int i;
            c cVar;
            this.b = -1;
            int width = view.getWidth();
            if (a(view, f)) {
                int left = view.getLeft();
                int i2 = this.f5025a;
                if (left < i2) {
                    i = i2 - width;
                } else {
                    i = i2 + width;
                }
                z = true;
            } else {
                i = this.f5025a;
                z = false;
            }
            SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
            if (swipeDismissBehavior.f5024a.settleCapturedViewAt(i, view.getTop())) {
                ViewCompat.postOnAnimation(view, new d(view, z));
            } else if (z && (cVar = swipeDismissBehavior.b) != null) {
                ((BaseTransientBottomBar.p) cVar).a(view);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public boolean tryCaptureView(View view, int i) {
            int i2 = this.b;
            if ((i2 == -1 || i2 == i) && SwipeDismissBehavior.this.a(view)) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b implements AccessibilityViewCommand {
        public b() {
        }

        @Override // androidx.core.view.accessibility.AccessibilityViewCommand
        public boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
            int i;
            SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
            boolean z = false;
            if (!swipeDismissBehavior.a(view)) {
                return false;
            }
            if (ViewCompat.getLayoutDirection(view) == 1) {
                z = true;
            }
            int i2 = swipeDismissBehavior.d;
            if ((i2 != 0 || !z) && (i2 != 1 || z)) {
                i = view.getWidth();
            } else {
                i = -view.getWidth();
            }
            ViewCompat.offsetLeftAndRight(view, i);
            view.setAlpha(0.0f);
            c cVar = swipeDismissBehavior.b;
            if (cVar != null) {
                ((BaseTransientBottomBar.p) cVar).a(view);
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface c {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final View f5027a;
        private final boolean b;

        public d(View view, boolean z) {
            this.f5027a = view;
            this.b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            c cVar;
            ViewDragHelper viewDragHelper = SwipeDismissBehavior.this.f5024a;
            if (viewDragHelper != null && viewDragHelper.continueSettling(true)) {
                ViewCompat.postOnAnimation(this.f5027a, this);
            } else if (this.b && (cVar = SwipeDismissBehavior.this.b) != null) {
                ((BaseTransientBottomBar.p) cVar).a(this.f5027a);
            }
        }
    }

    public static float b(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    public static int c(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    public static float e(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    public boolean a(View view) {
        return true;
    }

    public final void d(ViewGroup viewGroup) {
        if (this.f5024a == null) {
            this.f5024a = ViewDragHelper.create(viewGroup, this.h);
        }
    }

    public void f(float f) {
        this.g = b(0.0f, f, 1.0f);
    }

    public void g(c cVar) {
        this.b = cVar;
    }

    public void h(float f) {
        this.f = b(0.0f, f, 1.0f);
    }

    public void i(int i) {
        this.d = i;
    }

    public final void j(View view) {
        ViewCompat.removeAccessibilityAction(view, 1048576);
        if (a(view)) {
            ViewCompat.replaceAccessibilityAction(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DISMISS, null, new b());
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.isPointInChildBounds(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.c = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.c = false;
        }
        if (!z) {
            return false;
        }
        d(coordinatorLayout);
        return this.f5024a.shouldInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        boolean onLayoutChild = super.onLayoutChild(coordinatorLayout, v, i);
        if (ViewCompat.getImportantForAccessibility(v) == 0) {
            ViewCompat.setImportantForAccessibility(v, 1);
            j(v);
        }
        return onLayoutChild;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        ViewDragHelper viewDragHelper = this.f5024a;
        if (viewDragHelper == null) {
            return false;
        }
        viewDragHelper.processTouchEvent(motionEvent);
        return true;
    }
}
