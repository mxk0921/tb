package com.alibaba.android.umf.taobao.adapter.widget.behavior;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.ViewDragHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import tb.ai;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AURABottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int PEEK_HEIGHT_AUTO = -1;
    public static final int STATE_COLLAPSED = 4;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_EXPANDED = 3;
    public static final int STATE_HIDDEN = 5;
    public static final int STATE_SETTLING = 2;
    public float A;
    public final ViewDragHelper.Callback B;

    /* renamed from: a  reason: collision with root package name */
    public final int[] f2408a;
    public final float b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public ViewDragHelper m;
    public boolean n;
    public int o;
    public boolean p;
    public int q;
    public WeakReference<V> r;
    public WeakReference<View> s;
    public b t;
    public VelocityTracker u;
    public int v;
    public int w;
    public boolean x;
    public float y;
    public float z;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        final int state;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (SavedState) ipChange.ipc$dispatch("52c254cc", new Object[]{this, parcel});
                }
                return new SavedState(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (SavedState) ipChange.ipc$dispatch("631028e8", new Object[]{this, parcel, classLoader});
                }
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: c */
            public SavedState[] newArray(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (SavedState[]) ipChange.ipc$dispatch("ce52a843", new Object[]{this, new Integer(i)});
                }
                return new SavedState[i];
            }
        }

        static {
            t2o.a(81789279);
        }

        public SavedState(Parcel parcel) {
            this(parcel, (ClassLoader) null);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.state);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.state = parcel.readInt();
        }

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.state = i;
        }
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public @interface State {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f2410a;
        public final /* synthetic */ int b;

        public a(View view, int i) {
            this.f2410a = view;
            this.b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                AURABottomSheetBehavior.this.q(this.f2410a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static abstract class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(81789278);
        }

        public abstract int a(View view);

        public abstract boolean b(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3);

        public abstract void c(View view, float f);

        public abstract void d(View view, int i);

        public abstract boolean e(CoordinatorLayout coordinatorLayout, View view, View view2, int i);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final View f2411a;
        private final int b;

        static {
            t2o.a(81789281);
        }

        public c(View view, int i) {
            this.f2411a = view;
            this.b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (AURABottomSheetBehavior.j(AURABottomSheetBehavior.this) == null || !AURABottomSheetBehavior.j(AURABottomSheetBehavior.this).continueSettling(true)) {
                AURABottomSheetBehavior.this.setStateInternal(this.b);
            } else {
                ViewCompat.postOnAnimation(this.f2411a, this);
            }
        }
    }

    static {
        t2o.a(81789275);
    }

    public AURABottomSheetBehavior() {
        this.f2408a = new int[2];
        this.i = true;
        this.j = true;
        this.l = 4;
        this.B = new ViewDragHelper.Callback() { // from class: com.alibaba.android.umf.taobao.adapter.widget.behavior.AURABottomSheetBehavior.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/umf/taobao/adapter/widget/behavior/AURABottomSheetBehavior$2");
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionHorizontal(View view, int i, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("dcd272d1", new Object[]{this, view, new Integer(i), new Integer(i2)})).intValue();
                }
                return view.getLeft();
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionVertical(View view, int i, int i2) {
                int i3;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("53c1297f", new Object[]{this, view, new Integer(i), new Integer(i2)})).intValue();
                }
                if (!AURABottomSheetBehavior.this.l() && i2 < 0) {
                    return view.getTop();
                }
                int e = AURABottomSheetBehavior.e(AURABottomSheetBehavior.this);
                if (AURABottomSheetBehavior.g(AURABottomSheetBehavior.this)) {
                    i3 = AURABottomSheetBehavior.h(AURABottomSheetBehavior.this);
                } else {
                    i3 = AURABottomSheetBehavior.f(AURABottomSheetBehavior.this);
                }
                return MathUtils.clamp(i, e, i3);
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int getViewVerticalDragRange(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("896fc226", new Object[]{this, view})).intValue();
                }
                if (!AURABottomSheetBehavior.this.l()) {
                    return AURABottomSheetBehavior.h(AURABottomSheetBehavior.this) - AURABottomSheetBehavior.f(AURABottomSheetBehavior.this);
                }
                if (AURABottomSheetBehavior.g(AURABottomSheetBehavior.this)) {
                    return AURABottomSheetBehavior.h(AURABottomSheetBehavior.this) - AURABottomSheetBehavior.e(AURABottomSheetBehavior.this);
                }
                return AURABottomSheetBehavior.f(AURABottomSheetBehavior.this) - AURABottomSheetBehavior.e(AURABottomSheetBehavior.this);
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewDragStateChanged(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b3e50ec1", new Object[]{this, new Integer(i)});
                } else if (i == 1) {
                    AURABottomSheetBehavior.this.setStateInternal(1);
                }
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5bc6f844", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                } else {
                    AURABottomSheetBehavior.this.dispatchOnSlide(i2);
                }
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewReleased(View view, float f, float f2) {
                int i;
                int i2;
                int i3 = 3;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("32d03eca", new Object[]{this, view, new Float(f), new Float(f2)});
                    return;
                }
                if (f2 < 0.0f) {
                    if (AURABottomSheetBehavior.this.l()) {
                        i2 = AURABottomSheetBehavior.e(AURABottomSheetBehavior.this);
                        i = 3;
                    } else {
                        i2 = AURABottomSheetBehavior.f(AURABottomSheetBehavior.this);
                        i = 4;
                    }
                } else if (!AURABottomSheetBehavior.g(AURABottomSheetBehavior.this) || !AURABottomSheetBehavior.this.shouldHide(view, f2)) {
                    if (f2 == 0.0f) {
                        int top = view.getTop();
                        if (Math.abs(top - AURABottomSheetBehavior.e(AURABottomSheetBehavior.this)) < Math.abs(top - AURABottomSheetBehavior.f(AURABottomSheetBehavior.this))) {
                            i2 = AURABottomSheetBehavior.e(AURABottomSheetBehavior.this);
                            i = 3;
                        } else {
                            i2 = AURABottomSheetBehavior.f(AURABottomSheetBehavior.this);
                        }
                    } else {
                        i2 = AURABottomSheetBehavior.f(AURABottomSheetBehavior.this);
                    }
                    i = 4;
                } else {
                    i2 = AURABottomSheetBehavior.h(AURABottomSheetBehavior.this);
                    i = 5;
                }
                if (!AURABottomSheetBehavior.this.l() || !AURABottomSheetBehavior.i(AURABottomSheetBehavior.this) || 4 != i) {
                    i3 = i;
                } else {
                    i2 = AURABottomSheetBehavior.e(AURABottomSheetBehavior.this);
                }
                if (AURABottomSheetBehavior.j(AURABottomSheetBehavior.this).settleCapturedViewAt(view.getLeft(), i2)) {
                    AURABottomSheetBehavior.this.setStateInternal(2);
                    ViewCompat.postOnAnimation(view, new c(view, i3));
                    return;
                }
                AURABottomSheetBehavior.this.setStateInternal(i3);
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public boolean tryCaptureView(View view, int i) {
                View view2;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("567455cc", new Object[]{this, view, new Integer(i)})).booleanValue();
                }
                if (!AURABottomSheetBehavior.this.isDraggable()) {
                    return false;
                }
                AURABottomSheetBehavior aURABottomSheetBehavior = AURABottomSheetBehavior.this;
                if (aURABottomSheetBehavior.l == 1 || AURABottomSheetBehavior.a(aURABottomSheetBehavior)) {
                    return false;
                }
                AURABottomSheetBehavior aURABottomSheetBehavior2 = AURABottomSheetBehavior.this;
                if ((aURABottomSheetBehavior2.l != 3 || AURABottomSheetBehavior.b(aURABottomSheetBehavior2) != i || (view2 = (View) AURABottomSheetBehavior.c(AURABottomSheetBehavior.this).get()) == null || !view2.canScrollVertically(-1)) && AURABottomSheetBehavior.d(AURABottomSheetBehavior.this) != null && AURABottomSheetBehavior.d(AURABottomSheetBehavior.this).get() == view) {
                    return true;
                }
                return false;
            }
        };
    }

    public static /* synthetic */ boolean a(AURABottomSheetBehavior aURABottomSheetBehavior) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("232d4ff8", new Object[]{aURABottomSheetBehavior})).booleanValue();
        }
        return aURABottomSheetBehavior.x;
    }

    public static /* synthetic */ int b(AURABottomSheetBehavior aURABottomSheetBehavior) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("91b46128", new Object[]{aURABottomSheetBehavior})).intValue();
        }
        return aURABottomSheetBehavior.v;
    }

    public static /* synthetic */ WeakReference c(AURABottomSheetBehavior aURABottomSheetBehavior) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("78a73244", new Object[]{aURABottomSheetBehavior});
        }
        return aURABottomSheetBehavior.s;
    }

    public static /* synthetic */ WeakReference d(AURABottomSheetBehavior aURABottomSheetBehavior) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("3223c805", new Object[]{aURABottomSheetBehavior});
        }
        return aURABottomSheetBehavior.r;
    }

    public static /* synthetic */ int e(AURABottomSheetBehavior aURABottomSheetBehavior) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dd4994eb", new Object[]{aURABottomSheetBehavior})).intValue();
        }
        return aURABottomSheetBehavior.f;
    }

    public static /* synthetic */ int f(AURABottomSheetBehavior aURABottomSheetBehavior) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4bd0a62c", new Object[]{aURABottomSheetBehavior})).intValue();
        }
        return aURABottomSheetBehavior.g;
    }

    public static /* synthetic */ boolean g(AURABottomSheetBehavior aURABottomSheetBehavior) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba57b77e", new Object[]{aURABottomSheetBehavior})).booleanValue();
        }
        return aURABottomSheetBehavior.h;
    }

    public static /* synthetic */ int h(AURABottomSheetBehavior aURABottomSheetBehavior) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("28dec8ae", new Object[]{aURABottomSheetBehavior})).intValue();
        }
        return aURABottomSheetBehavior.q;
    }

    public static /* synthetic */ boolean i(AURABottomSheetBehavior aURABottomSheetBehavior) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9765da00", new Object[]{aURABottomSheetBehavior})).booleanValue();
        }
        return aURABottomSheetBehavior.k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object ipc$super(AURABottomSheetBehavior aURABottomSheetBehavior, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1102985308:
                super.onRestoreInstanceState((CoordinatorLayout) objArr[0], (View) objArr[1], (Parcelable) objArr[2]);
                return null;
            case -628397448:
                super.onStopNestedScroll((CoordinatorLayout) objArr[0], (View) objArr[1], (View) objArr[2], ((Number) objArr[3]).intValue());
                return null;
            case -363710401:
                super.onNestedPreScroll((CoordinatorLayout) objArr[0], (View) objArr[1], (View) objArr[2], ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue(), (int[]) objArr[5], ((Number) objArr[6]).intValue());
                return null;
            case -225405467:
                return new Boolean(super.onNestedPreFling((CoordinatorLayout) objArr[0], (View) objArr[1], (View) objArr[2], ((Number) objArr[3]).floatValue(), ((Number) objArr[4]).floatValue()));
            case 1919347493:
                return super.onSaveInstanceState((CoordinatorLayout) objArr[0], (View) objArr[1]);
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/umf/taobao/adapter/widget/behavior/AURABottomSheetBehavior");
        }
    }

    public static /* synthetic */ ViewDragHelper j(AURABottomSheetBehavior aURABottomSheetBehavior) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewDragHelper) ipChange.ipc$dispatch("752f880f", new Object[]{aURABottomSheetBehavior});
        }
        return aURABottomSheetBehavior.m;
    }

    public static <V extends View> AURABottomSheetBehavior<V> k(V v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURABottomSheetBehavior) ipChange.ipc$dispatch("524a6ab2", new Object[]{v});
        }
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
            if (behavior instanceof AURABottomSheetBehavior) {
                return (AURABottomSheetBehavior) behavior;
            }
            throw new IllegalArgumentException("The view is not associated with NUTFloatDraggableBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    public void dispatchOnSlide(int i) {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaa93924", new Object[]{this, new Integer(i)});
            return;
        }
        V v = this.r.get();
        if (v != null && (bVar = this.t) != null) {
            int i2 = this.g;
            if (i > i2) {
                bVar.c(v, (i2 - i) / (this.q - i2));
            } else {
                bVar.c(v, (i2 - i) / (i2 - this.f));
            }
        }
    }

    public View findScrollingChild(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6c487e2d", new Object[]{this, view});
        }
        if (ViewCompat.isNestedScrollingEnabled(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View findScrollingChild = findScrollingChild(viewGroup.getChildAt(i));
            if (findScrollingChild != null) {
                return findScrollingChild;
            }
        }
        return null;
    }

    public final int getPeekHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed938ed2", new Object[]{this})).intValue();
        }
        if (this.d) {
            return -1;
        }
        return this.c;
    }

    public final int getState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("830709d5", new Object[]{this})).intValue();
        }
        return this.l;
    }

    public final float getYVelocity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d1112e37", new Object[]{this})).floatValue();
        }
        VelocityTracker velocityTracker = this.u;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.b);
        return this.u.getYVelocity(this.v);
    }

    public boolean isDraggable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cfab4a8e", new Object[]{this})).booleanValue();
        }
        return this.j;
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("95a60949", new Object[]{this})).booleanValue();
        }
        return this.i;
    }

    public final boolean m(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e101871b", new Object[]{this, view})).booleanValue();
        }
        View findFocus = view.findFocus();
        if (findFocus instanceof EditText) {
            return n(findFocus, (int) this.y, (int) this.z);
        }
        return false;
    }

    public final boolean n(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90afb68a", new Object[]{this, view, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (view == null) {
            return false;
        }
        view.getLocationOnScreen(this.f2408a);
        int[] iArr = this.f2408a;
        int i3 = iArr[0];
        int i4 = iArr[1];
        int measuredWidth = view.getMeasuredWidth() + i3;
        int measuredHeight = view.getMeasuredHeight() + i4;
        if (i2 < i4 || i2 > measuredHeight || i < i3 || i > measuredWidth) {
            return false;
        }
        return true;
    }

    public void o(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("719966e6", new Object[]{this, bVar});
        } else {
            this.t = bVar;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        View view;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("219e1cf9", new Object[]{this, coordinatorLayout, v, motionEvent})).booleanValue();
        }
        if (!isDraggable()) {
            return false;
        }
        if (!v.isShown()) {
            this.n = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            reset();
        }
        if (this.u == null) {
            this.u = VelocityTracker.obtain();
        }
        this.u.addMovement(motionEvent);
        this.A = motionEvent.getRawY();
        if (actionMasked == 0) {
            this.y = motionEvent.getRawX();
            this.z = motionEvent.getRawY();
            int x = (int) motionEvent.getX();
            this.w = (int) motionEvent.getY();
            WeakReference<View> weakReference = this.s;
            if (weakReference != null) {
                view = weakReference.get();
            } else {
                view = null;
            }
            if (view != null && coordinatorLayout.isPointInChildBounds(view, x, this.w)) {
                this.v = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.x = true;
            }
            if (this.v != -1 || coordinatorLayout.isPointInChildBounds(v, x, this.w)) {
                z = false;
            } else {
                z = true;
            }
            this.n = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.x = false;
            this.v = -1;
            if (this.n) {
                this.n = false;
                return false;
            }
        }
        if (!this.n && this.m.shouldInterceptTouchEvent(motionEvent)) {
            return true;
        }
        View view2 = this.s.get();
        if (actionMasked != 2 || view2 == null || this.n || this.l == 1 || coordinatorLayout.isPointInChildBounds(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || Math.abs(this.w - motionEvent.getY()) <= this.m.getTouchSlop()) {
            return false;
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        int i2;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("50492632", new Object[]{this, coordinatorLayout, v, new Integer(i)})).booleanValue();
        }
        if (ViewCompat.getFitsSystemWindows(coordinatorLayout) && !ViewCompat.getFitsSystemWindows(v)) {
            ViewCompat.setFitsSystemWindows(v, true);
        }
        int top = v.getTop();
        coordinatorLayout.onLayoutChild(v, i);
        this.q = coordinatorLayout.getHeight();
        if (this.d) {
            if (this.e == 0) {
                this.e = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.aura_bottom_sheet_behavior_peek_height_min);
            }
            i2 = (int) Math.max(this.e, this.q - (coordinatorLayout.getHeight() * 0.5f));
        } else {
            i2 = this.c;
        }
        b bVar = this.t;
        if (bVar != null) {
            i3 = bVar.a(v);
        } else {
            i3 = v.getHeight();
        }
        int max = Math.max(0, this.q - i3);
        this.f = max;
        int max2 = Math.max(this.q - i2, max);
        this.g = max2;
        int i4 = this.l;
        if (i4 == 3) {
            ViewCompat.offsetTopAndBottom(v, this.f);
        } else if (this.h && i4 == 5) {
            ViewCompat.offsetTopAndBottom(v, this.q);
        } else if (i4 == 4) {
            ViewCompat.offsetTopAndBottom(v, max2);
        } else if (i4 == 1 || i4 == 2) {
            ViewCompat.offsetTopAndBottom(v, top - v.getTop());
        }
        if (this.m == null) {
            this.m = ViewDragHelper.create(coordinatorLayout, this.B);
        }
        this.r = new WeakReference<>(v);
        this.s = new WeakReference<>(findScrollingChild(v));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f29095e5", new Object[]{this, coordinatorLayout, v, view, new Float(f), new Float(f2)})).booleanValue();
        }
        if (view != this.s.get() || (this.l == 3 && !super.onNestedPreFling(coordinatorLayout, v, view, f, f2))) {
            return false;
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        View view2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea52383f", new Object[]{this, coordinatorLayout, v, view, new Integer(i), new Integer(i2), iArr, new Integer(i3)});
            return;
        }
        super.onNestedPreScroll(coordinatorLayout, v, view, i, i2, iArr, i3);
        b bVar = this.t;
        if ((bVar == null || !bVar.b(coordinatorLayout, v, view, i, i2, iArr, i3)) && Math.abs(i2) >= Math.abs(i) && view == (view2 = this.s.get())) {
            int top = v.getTop();
            int i4 = top - i2;
            if (l() || i2 <= 0 || i4 > this.g) {
                if (i2 > 0) {
                    int i5 = this.f;
                    if (i4 < i5) {
                        int i6 = top - i5;
                        iArr[1] = i6;
                        ViewCompat.offsetTopAndBottom(v, -i6);
                        setStateInternal(3);
                    } else {
                        iArr[1] = i2;
                        ViewCompat.offsetTopAndBottom(v, -i2);
                        setStateInternal(1);
                    }
                } else if (i2 < 0 && !view2.canScrollVertically(-1)) {
                    if (1 != i3) {
                        int i7 = this.g;
                        if (i4 <= i7 || this.h) {
                            iArr[1] = i2;
                            ViewCompat.offsetTopAndBottom(v, -i2);
                            setStateInternal(1);
                        } else {
                            int i8 = top - i7;
                            iArr[1] = i8;
                            ViewCompat.offsetTopAndBottom(v, -i8);
                            setStateInternal(4);
                        }
                    } else {
                        return;
                    }
                }
                dispatchOnSlide(v.getTop());
                this.o = i2;
                this.p = true;
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be41c7a4", new Object[]{this, coordinatorLayout, v, parcelable});
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, v, savedState.getSuperState());
        int i = savedState.state;
        if (i == 1 || i == 2) {
            this.l = 4;
        } else {
            this.l = i;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Parcelable) ipChange.ipc$dispatch("7266eb25", new Object[]{this, coordinatorLayout, v});
        }
        return new SavedState(super.onSaveInstanceState(coordinatorLayout, v), this.l);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b8ceceed", new Object[]{this, coordinatorLayout, v, view, view2, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (!isDraggable()) {
            return false;
        }
        this.o = 0;
        this.p = false;
        if ((i & 2) == 0 || m(view2)) {
            return false;
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
        int i2;
        int i3 = 3;
        boolean z = true;
        int i4 = 5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da8b6a78", new Object[]{this, coordinatorLayout, v, view, new Integer(i)});
            return;
        }
        super.onStopNestedScroll(coordinatorLayout, v, view, i);
        b bVar = this.t;
        if ((bVar != null && bVar.e(coordinatorLayout, v, view, i)) || m(view)) {
            return;
        }
        if (v.getTop() == this.f) {
            setStateInternal(3);
            return;
        }
        WeakReference<View> weakReference = this.s;
        if (weakReference != null && view == weakReference.get() && this.p) {
            int i5 = this.o;
            if (i5 <= 0) {
                if (i5 == 0) {
                    int top = v.getTop();
                    if (Math.abs(top - this.f) < Math.abs(top - this.g)) {
                        i2 = this.f;
                        i4 = 3;
                    } else {
                        i2 = this.g;
                    }
                } else if (!this.h || !shouldHide(v, getYVelocity())) {
                    i2 = this.g;
                } else {
                    i2 = this.q;
                }
                i4 = 4;
            } else if (l()) {
                i2 = this.f;
                i4 = 3;
            } else {
                i2 = this.g;
                i4 = 4;
            }
            if (v.getHeight() <= getPeekHeight()) {
                z = false;
            }
            if (!l() || !this.k || 4 != i4 || !z) {
                i3 = i4;
            } else {
                i2 = this.f;
            }
            if (this.m.smoothSlideViewTo(v, v.getLeft(), i2)) {
                setStateInternal(2);
                ViewCompat.postOnAnimation(v, new c(v, i3));
            } else {
                setStateInternal(i3);
            }
            this.p = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("24400535", new Object[]{this, coordinatorLayout, v, motionEvent})).booleanValue();
        }
        if (!isDraggable() || !v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.l == 1 && actionMasked == 0) {
            return true;
        }
        this.m.processTouchEvent(motionEvent);
        if (actionMasked == 0) {
            this.y = motionEvent.getRawX();
            this.z = motionEvent.getRawY();
            reset();
        }
        if (this.u == null) {
            this.u = VelocityTracker.obtain();
        }
        this.u.addMovement(motionEvent);
        if (actionMasked == 2 && !this.n && Math.abs(this.w - motionEvent.getY()) > this.m.getTouchSlop()) {
            this.m.captureChildView(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.n;
    }

    public void p(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8ecbf7", new Object[]{this, new Boolean(z)});
        } else {
            this.i = z;
        }
    }

    public void q(View view, int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c10ad252", new Object[]{this, view, new Integer(i)});
            return;
        }
        if (i == 4) {
            i2 = this.g;
        } else if (i == 3) {
            i2 = this.f;
        } else if (!this.h || i != 5) {
            throw new IllegalArgumentException("Illegal state argument: " + i);
        } else {
            i2 = this.q;
        }
        if (this.m.smoothSlideViewTo(view, view.getLeft(), i2)) {
            setStateInternal(2);
            ViewCompat.postOnAnimation(view, new c(view, i));
            return;
        }
        setStateInternal(i);
    }

    public final void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.v = -1;
        VelocityTracker velocityTracker = this.u;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.u = null;
        }
    }

    public void setDraggable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35a166c2", new Object[]{this, new Boolean(z)});
        } else {
            this.j = z;
        }
    }

    public void setHideable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9d481cf", new Object[]{this, new Boolean(z)});
        } else {
            this.h = z;
        }
    }

    public final void setPeekHeight(int i) {
        WeakReference<V> weakReference;
        V v;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbb55978", new Object[]{this, new Integer(i)});
            return;
        }
        if (i == -1) {
            if (!this.d) {
                this.d = true;
            } else {
                return;
            }
        } else if (this.d || this.c != i) {
            this.d = false;
            this.c = Math.max(0, i);
            this.g = this.q - i;
        } else {
            return;
        }
        if (this.l == 4 && (weakReference = this.r) != null && (v = weakReference.get()) != null) {
            v.requestLayout();
        }
    }

    public void setSkipCollapsed(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf2cd697", new Object[]{this, new Boolean(z)});
        } else {
            this.k = z;
        }
    }

    public final void setState(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfef36d", new Object[]{this, new Integer(i)});
        } else if (i != this.l) {
            WeakReference<V> weakReference = this.r;
            if (weakReference != null) {
                V v = weakReference.get();
                if (v != null) {
                    ViewParent parent = v.getParent();
                    if (parent == null || !parent.isLayoutRequested() || !ViewCompat.isAttachedToWindow(v)) {
                        q(v, i);
                    } else {
                        v.post(new a(v, i));
                    }
                }
            } else if (i == 4 || i == 3 || (this.h && i == 5)) {
                this.l = i;
            }
        }
    }

    public void setStateInternal(int i) {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ae569b0", new Object[]{this, new Integer(i)});
        } else if (this.l != i) {
            this.l = i;
            V v = this.r.get();
            if (v != null && (bVar = this.t) != null) {
                bVar.d(v, i);
            }
        }
    }

    public boolean shouldHide(View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae30eace", new Object[]{this, view, new Float(f)})).booleanValue();
        }
        if (f >= 6000.0f) {
            return true;
        }
        float abs = Math.abs(this.A - this.z);
        int peekHeight = getPeekHeight();
        if (view.getHeight() > peekHeight) {
            if (abs / (peekHeight + this.g) > 0.3f) {
                return true;
            }
            return false;
        } else if (abs / peekHeight > 0.3f) {
            return true;
        } else {
            return false;
        }
    }

    public AURABottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        this.f2408a = new int[2];
        this.i = true;
        this.j = true;
        this.l = 4;
        this.B = new ViewDragHelper.Callback() { // from class: com.alibaba.android.umf.taobao.adapter.widget.behavior.AURABottomSheetBehavior.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/umf/taobao/adapter/widget/behavior/AURABottomSheetBehavior$2");
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionHorizontal(View view, int i2, int i22) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("dcd272d1", new Object[]{this, view, new Integer(i2), new Integer(i22)})).intValue();
                }
                return view.getLeft();
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionVertical(View view, int i2, int i22) {
                int i3;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("53c1297f", new Object[]{this, view, new Integer(i2), new Integer(i22)})).intValue();
                }
                if (!AURABottomSheetBehavior.this.l() && i22 < 0) {
                    return view.getTop();
                }
                int e = AURABottomSheetBehavior.e(AURABottomSheetBehavior.this);
                if (AURABottomSheetBehavior.g(AURABottomSheetBehavior.this)) {
                    i3 = AURABottomSheetBehavior.h(AURABottomSheetBehavior.this);
                } else {
                    i3 = AURABottomSheetBehavior.f(AURABottomSheetBehavior.this);
                }
                return MathUtils.clamp(i2, e, i3);
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int getViewVerticalDragRange(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("896fc226", new Object[]{this, view})).intValue();
                }
                if (!AURABottomSheetBehavior.this.l()) {
                    return AURABottomSheetBehavior.h(AURABottomSheetBehavior.this) - AURABottomSheetBehavior.f(AURABottomSheetBehavior.this);
                }
                if (AURABottomSheetBehavior.g(AURABottomSheetBehavior.this)) {
                    return AURABottomSheetBehavior.h(AURABottomSheetBehavior.this) - AURABottomSheetBehavior.e(AURABottomSheetBehavior.this);
                }
                return AURABottomSheetBehavior.f(AURABottomSheetBehavior.this) - AURABottomSheetBehavior.e(AURABottomSheetBehavior.this);
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewDragStateChanged(int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b3e50ec1", new Object[]{this, new Integer(i2)});
                } else if (i2 == 1) {
                    AURABottomSheetBehavior.this.setStateInternal(1);
                }
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewPositionChanged(View view, int i2, int i22, int i3, int i4) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5bc6f844", new Object[]{this, view, new Integer(i2), new Integer(i22), new Integer(i3), new Integer(i4)});
                } else {
                    AURABottomSheetBehavior.this.dispatchOnSlide(i22);
                }
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewReleased(View view, float f, float f2) {
                int i2;
                int i22;
                int i3 = 3;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("32d03eca", new Object[]{this, view, new Float(f), new Float(f2)});
                    return;
                }
                if (f2 < 0.0f) {
                    if (AURABottomSheetBehavior.this.l()) {
                        i22 = AURABottomSheetBehavior.e(AURABottomSheetBehavior.this);
                        i2 = 3;
                    } else {
                        i22 = AURABottomSheetBehavior.f(AURABottomSheetBehavior.this);
                        i2 = 4;
                    }
                } else if (!AURABottomSheetBehavior.g(AURABottomSheetBehavior.this) || !AURABottomSheetBehavior.this.shouldHide(view, f2)) {
                    if (f2 == 0.0f) {
                        int top = view.getTop();
                        if (Math.abs(top - AURABottomSheetBehavior.e(AURABottomSheetBehavior.this)) < Math.abs(top - AURABottomSheetBehavior.f(AURABottomSheetBehavior.this))) {
                            i22 = AURABottomSheetBehavior.e(AURABottomSheetBehavior.this);
                            i2 = 3;
                        } else {
                            i22 = AURABottomSheetBehavior.f(AURABottomSheetBehavior.this);
                        }
                    } else {
                        i22 = AURABottomSheetBehavior.f(AURABottomSheetBehavior.this);
                    }
                    i2 = 4;
                } else {
                    i22 = AURABottomSheetBehavior.h(AURABottomSheetBehavior.this);
                    i2 = 5;
                }
                if (!AURABottomSheetBehavior.this.l() || !AURABottomSheetBehavior.i(AURABottomSheetBehavior.this) || 4 != i2) {
                    i3 = i2;
                } else {
                    i22 = AURABottomSheetBehavior.e(AURABottomSheetBehavior.this);
                }
                if (AURABottomSheetBehavior.j(AURABottomSheetBehavior.this).settleCapturedViewAt(view.getLeft(), i22)) {
                    AURABottomSheetBehavior.this.setStateInternal(2);
                    ViewCompat.postOnAnimation(view, new c(view, i3));
                    return;
                }
                AURABottomSheetBehavior.this.setStateInternal(i3);
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public boolean tryCaptureView(View view, int i2) {
                View view2;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("567455cc", new Object[]{this, view, new Integer(i2)})).booleanValue();
                }
                if (!AURABottomSheetBehavior.this.isDraggable()) {
                    return false;
                }
                AURABottomSheetBehavior aURABottomSheetBehavior = AURABottomSheetBehavior.this;
                if (aURABottomSheetBehavior.l == 1 || AURABottomSheetBehavior.a(aURABottomSheetBehavior)) {
                    return false;
                }
                AURABottomSheetBehavior aURABottomSheetBehavior2 = AURABottomSheetBehavior.this;
                if ((aURABottomSheetBehavior2.l != 3 || AURABottomSheetBehavior.b(aURABottomSheetBehavior2) != i2 || (view2 = (View) AURABottomSheetBehavior.c(AURABottomSheetBehavior.this).get()) == null || !view2.canScrollVertically(-1)) && AURABottomSheetBehavior.d(AURABottomSheetBehavior.this) != null && AURABottomSheetBehavior.d(AURABottomSheetBehavior.this).get() == view) {
                    return true;
                }
                return false;
            }
        };
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.AURABottomSheetBehavior_Layout);
        TypedValue peekValue = obtainStyledAttributes.peekValue(R.styleable.AURABottomSheetBehavior_Layout_aura_bottom_sheet_behavior_default_state);
        if (peekValue != null) {
            this.l = peekValue.data;
        }
        int i2 = R.styleable.AURABottomSheetBehavior_Layout_aura_bottom_sheet_behavior_peekHeightPercent;
        if (obtainStyledAttributes.peekValue(i2) == null) {
            int i3 = R.styleable.AURABottomSheetBehavior_Layout_aura_bottom_sheet_behavior_peekHeight;
            TypedValue peekValue2 = obtainStyledAttributes.peekValue(i3);
            if (peekValue2 == null || (i = peekValue2.data) != -1) {
                setPeekHeight(obtainStyledAttributes.getDimensionPixelSize(i3, -1));
            } else {
                setPeekHeight(i);
            }
        } else {
            setPeekHeight((int) (ai.d() * obtainStyledAttributes.getFloat(i2, 0.5f)));
        }
        setHideable(obtainStyledAttributes.getBoolean(R.styleable.AURABottomSheetBehavior_Layout_aura_bottom_sheet_behavior_hideable, false));
        setDraggable(obtainStyledAttributes.getBoolean(R.styleable.AURABottomSheetBehavior_Layout_aura_bottom_sheet_behavior_draggable, true));
        p(obtainStyledAttributes.getBoolean(R.styleable.AURABottomSheetBehavior_Layout_aura_bottom_sheet_behavior_expandable, true));
        setSkipCollapsed(obtainStyledAttributes.getBoolean(R.styleable.AURABottomSheetBehavior_Layout_aura_bottom_sheet_behavior_skipCollapsed, false));
        obtainStyledAttributes.recycle();
        this.b = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
