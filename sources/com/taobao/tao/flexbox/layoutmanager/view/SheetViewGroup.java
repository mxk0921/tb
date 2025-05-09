package com.taobao.tao.flexbox.layoutmanager.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import android.widget.SeekBar;
import androidx.core.view.ViewCompat;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import tb.s6o;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class SheetViewGroup extends FlatViewGroup {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int STATE_ACTIVE = 2;
    public static final int STATE_APPEAR = 1;
    public static final int STATE_DISAPPEAR = 0;
    private static final Interpolator sInterpolator = new a();
    private int activeNum;
    private int appearNum;
    private n browserNode;
    private int currentState = 0;
    private int disappearNum;
    private c mPullHelper;
    private Scroller mScroller;
    private int maxActiveNum;
    private int maxAppearNum;
    private n sideNode;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements Interpolator {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("22c782db", new Object[]{this, new Float(f)})).floatValue();
            }
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b extends c {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ n o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(SheetViewGroup sheetViewGroup, n nVar) {
            super(sheetViewGroup);
            this.o = nVar;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/view/SheetViewGroup$2");
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.view.SheetViewGroup.c
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2372e0ed", new Object[]{this});
            } else {
                SheetViewGroup.access$000(SheetViewGroup.this);
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.view.SheetViewGroup.c
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("badeed9", new Object[]{this});
            } else {
                SheetViewGroup.access$100(SheetViewGroup.this);
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.view.SheetViewGroup.c
        public void f(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3b042fc9", new Object[]{this, new Float(f)});
                return;
            }
            float f2 = -SheetViewGroup.access$200(SheetViewGroup.this);
            if (f < f2) {
                f = f2;
            }
            this.o.w0().setTranslationX(f);
            int i = (f > f2 ? 1 : (f == f2 ? 0 : -1));
            if (i == 0) {
                SheetViewGroup.access$300(SheetViewGroup.this, 2);
            } else if (f == 0.0f) {
                SheetViewGroup.access$300(SheetViewGroup.this, 0);
            } else if (i > 0 && f < 0.0f && SheetViewGroup.access$400(SheetViewGroup.this) == 0) {
                SheetViewGroup.access$300(SheetViewGroup.this, 1);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public float f12381a;
        public float b;
        public float c;
        public float d;
        public float e;
        public boolean f;
        public boolean g;
        public final int i;
        public final float j;
        public final SheetViewGroup m;
        public int h = -1;
        public final int k = -1;
        public final int l = 1;
        public final VelocityTracker n = VelocityTracker.obtain();

        static {
            t2o.a(503317480);
        }

        public c(SheetViewGroup sheetViewGroup) {
            this.m = sheetViewGroup;
            this.i = ViewConfiguration.get(sheetViewGroup.getContext()).getScaledTouchSlop();
            ViewConfiguration.get(sheetViewGroup.getContext()).getScaledMinimumFlingVelocity();
            this.j = s6o.c(sheetViewGroup.getContext(), 60);
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
            } else if (this.c == 0.0f) {
                float f3 = -f;
                float f4 = this.j;
                if (f3 > f4) {
                    int i = this.l;
                    if (f2 > i || (f3 < f4 * 2.0f && f2 > i / 2)) {
                        c();
                    } else {
                        d();
                    }
                } else if (f2 < this.k) {
                    d();
                } else {
                    c();
                }
            } else {
                float f5 = this.j;
                if (f > f5) {
                    int i2 = this.k;
                    if (f2 < i2 || (f < f5 * 2.0f && f2 < i2 / 2)) {
                        d();
                    } else {
                        c();
                    }
                } else if (f2 > this.l) {
                    c();
                } else {
                    d();
                }
            }
        }

        public void c() {
            throw null;
        }

        public void d() {
            throw null;
        }

        public boolean e(MotionEvent motionEvent) {
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
                                g(motionEvent);
                            }
                        }
                    } else if (this.g) {
                        return false;
                    } else {
                        if (this.f) {
                            return true;
                        }
                        int i = this.h;
                        if (i == -1) {
                            Log.e("PullLeftHelper", "Got ACTION_MOVE event but don't have an active pointer id.");
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
                        float f = x - this.f12381a;
                        if (SheetViewGroup.access$500(this.m) != null || f == 0.0f || !a(this.m, false, (int) f, (int) x, (int) y)) {
                            i(rawX, rawY);
                        } else {
                            this.f12381a = x;
                            this.g = true;
                            return false;
                        }
                    }
                }
                this.f = false;
                this.g = false;
                this.h = -1;
                SheetViewGroup sheetViewGroup = this.m;
                if (sheetViewGroup instanceof ViewGroup) {
                    sheetViewGroup.requestDisallowInterceptTouchEvent(false);
                }
            } else {
                int pointerId = motionEvent.getPointerId(0);
                this.h = pointerId;
                this.f = false;
                this.g = false;
                if (motionEvent.findPointerIndex(pointerId) < 0) {
                    return false;
                }
                this.d = motionEvent.getRawX();
                this.e = motionEvent.getRawY();
                this.f12381a = motionEvent.getX();
                motionEvent.getY();
            }
            return this.f;
        }

        public void f(float f) {
            throw null;
        }

        public final void g(MotionEvent motionEvent) {
            int i = 1;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f24b537f", new Object[]{this, motionEvent});
                return;
            }
            int actionIndex = motionEvent.getActionIndex();
            if (motionEvent.getPointerId(actionIndex) == this.h) {
                if (actionIndex != 0) {
                    i = 0;
                }
                this.h = motionEvent.getPointerId(i);
            }
        }

        public boolean h(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
            }
            int actionMasked = motionEvent.getActionMasked();
            this.n.addMovement(motionEvent);
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            if (actionMasked == 5) {
                                int actionIndex = motionEvent.getActionIndex();
                                if (actionIndex < 0) {
                                    Log.e("PullLeftHelper", "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                                    return false;
                                }
                                this.h = motionEvent.getPointerId(actionIndex);
                            } else if (actionMasked == 6) {
                                g(motionEvent);
                            }
                        }
                    } else if (motionEvent.findPointerIndex(this.h) < 0) {
                        Log.e("PullLeftHelper", "Got ACTION_MOVE event but have an invalid active pointer id.");
                        return false;
                    } else {
                        float rawX = motionEvent.getRawX();
                        i(rawX, motionEvent.getRawY());
                        if (this.f) {
                            f(((rawX - this.b) * 1.0f) + this.c);
                        }
                    }
                }
                if (motionEvent.findPointerIndex(this.h) < 0) {
                    Log.e("PullLeftHelper", "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.f) {
                    this.f = false;
                    this.n.computeCurrentVelocity(1);
                    b((motionEvent.getRawX() - this.b) * 1.0f, this.n.getXVelocity());
                }
                this.h = -1;
                return false;
            }
            this.h = motionEvent.getPointerId(0);
            this.f = false;
            return true;
        }

        public final void i(float f, float f2) {
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dcd19d8", new Object[]{this, new Float(f), new Float(f2)});
            } else if (!this.f) {
                float f3 = f - this.d;
                if (Math.abs(f3) * 0.5f > Math.abs(f2 - this.e)) {
                    z = true;
                }
                if (Math.abs(f3) > this.i && z && this.m.canScrollSideView((int) (-f3))) {
                    this.b = this.d + this.i;
                    this.f = true;
                    this.c = SheetViewGroup.access$600(this.m).w0().getTranslationX();
                    SheetViewGroup sheetViewGroup = this.m;
                    if (sheetViewGroup instanceof ViewGroup) {
                        sheetViewGroup.requestDisallowInterceptTouchEvent(true);
                    }
                }
            }
        }
    }

    static {
        t2o.a(503317477);
    }

    public SheetViewGroup(Context context) {
        super(context);
    }

    public static /* synthetic */ void access$000(SheetViewGroup sheetViewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfeee0a", new Object[]{sheetViewGroup});
        } else {
            sheetViewGroup.scrollBack();
        }
    }

    public static /* synthetic */ void access$100(SheetViewGroup sheetViewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9be660b", new Object[]{sheetViewGroup});
        } else {
            sheetViewGroup.scrollFinish();
        }
    }

    public static /* synthetic */ int access$200(SheetViewGroup sheetViewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("377dddff", new Object[]{sheetViewGroup})).intValue();
        }
        return sheetViewGroup.getSideMaxScrollWidth();
    }

    public static /* synthetic */ void access$300(SheetViewGroup sheetViewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226dde96", new Object[]{sheetViewGroup, new Integer(i)});
        } else {
            sheetViewGroup.notifyStateChanged(i);
        }
    }

    public static /* synthetic */ int access$400(SheetViewGroup sheetViewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d2fcce01", new Object[]{sheetViewGroup})).intValue();
        }
        return sheetViewGroup.currentState;
    }

    public static /* synthetic */ n access$500(SheetViewGroup sheetViewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("58816211", new Object[]{sheetViewGroup});
        }
        return sheetViewGroup.browserNode;
    }

    public static /* synthetic */ n access$600(SheetViewGroup sheetViewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("bfa7412", new Object[]{sheetViewGroup});
        }
        return sheetViewGroup.sideNode;
    }

    private int getSideMaxScrollWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("69b9159c", new Object[]{this})).intValue();
        }
        n nVar = this.sideNode;
        if (nVar != null) {
            return nVar.w0().getWidth();
        }
        return 0;
    }

    public static /* synthetic */ Object ipc$super(SheetViewGroup sheetViewGroup, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -894236565:
                super.computeScroll();
                return null;
            case -614473710:
                return new Boolean(super.canScrollHorizontally(((Number) objArr[0]).intValue()));
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case 623593120:
                super.dispatchDraw((Canvas) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/view/SheetViewGroup");
        }
    }

    private void scrollBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd9febdb", new Object[]{this});
            return;
        }
        int translationX = (int) this.sideNode.w0().getTranslationX();
        this.mScroller.startScroll(translationX, 0, -translationX, 0, 300);
        invalidate();
    }

    private void scrollFinish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dec3f647", new Object[]{this});
            return;
        }
        int translationX = (int) this.sideNode.w0().getTranslationX();
        this.mScroller.startScroll(translationX, 0, (-translationX) - getSideMaxScrollWidth(), 0, 250);
        ViewCompat.postInvalidateOnAnimation(this);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db5fe012", new Object[]{this, new Integer(i)})).booleanValue();
        }
        n nVar = this.browserNode;
        if (nVar != null) {
            ViewPager viewPager = (ViewPager) nVar.w0();
            if (viewPager.getCurrentItem() != viewPager.getAdapter().getCount() - 1 || this.sideNode == null || !canScrollSideView(i)) {
                return super.canScrollHorizontally(i);
            }
            return true;
        } else if (this.sideNode == null || !canScrollSideView(i)) {
            return super.canScrollHorizontally(i);
        } else {
            return true;
        }
    }

    public boolean canScrollSideView(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f660c87", new Object[]{this, new Integer(i)})).booleanValue();
        }
        float translationX = this.sideNode.w0().getTranslationX();
        if (i > 0) {
            if (translationX <= 0.0f && translationX > (-getWidth())) {
                return true;
            }
        } else if (i < 0 && translationX < 0.0f && translationX >= (-getWidth())) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void computeScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab3086b", new Object[]{this});
            return;
        }
        Scroller scroller = this.mScroller;
        if (scroller == null || this.sideNode == null) {
            super.computeScroll();
        } else if (scroller.computeScrollOffset()) {
            this.sideNode.w0().setTranslationX(this.mScroller.getCurrX());
            ViewCompat.postInvalidateOnAnimation(this);
        } else {
            float translationX = this.sideNode.w0().getTranslationX();
            int i = (translationX > (-getSideMaxScrollWidth()) ? 1 : (translationX == (-getSideMaxScrollWidth()) ? 0 : -1));
            if (i == 0) {
                notifyStateChanged(2);
            } else if (translationX == 0.0f) {
                notifyStateChanged(0);
            } else if (translationX < 0.0f && i > 0 && this.currentState == 0) {
                notifyStateChanged(1);
            }
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.view.FlatViewGroup, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
        } else {
            super.dispatchDraw(canvas);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.view.FlatViewGroup, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        n nVar = this.browserNode;
        if (nVar != null) {
            ViewPager viewPager = (ViewPager) nVar.w0();
            if (viewPager.getCurrentItem() != viewPager.getAdapter().getCount() - 1 || this.sideNode == null) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            return this.mPullHelper.e(motionEvent);
        } else if (this.sideNode != null) {
            return this.mPullHelper.e(motionEvent);
        } else {
            return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.view.FlatViewGroup, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        n nVar = this.browserNode;
        if (nVar != null) {
            ViewPager viewPager = (ViewPager) nVar.w0();
            if (viewPager.getCurrentItem() != viewPager.getAdapter().getCount() - 1 || this.sideNode == null) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            return this.mPullHelper.h(motionEvent);
        } else if (this.sideNode != null) {
            return this.mPullHelper.h(motionEvent);
        } else {
            return super.onTouchEvent(motionEvent);
        }
    }

    public void setBrowserNode(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce5a9723", new Object[]{this, nVar});
        } else {
            this.browserNode = nVar;
        }
    }

    public void setSideNode(n nVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b46abe70", new Object[]{this, nVar, new Integer(i), new Integer(i2)});
            return;
        }
        if (this.sideNode != nVar) {
            this.sideNode = nVar;
            if (nVar != null) {
                this.mPullHelper = new b(this, nVar);
                this.mScroller = new Scroller(getContext(), sInterpolator);
            }
        }
        this.maxAppearNum = i;
        this.maxActiveNum = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
        if (r3 > r12.maxAppearNum) goto L_0x0029;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
        if (r3 > r12.maxActiveNum) goto L_0x0029;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void notifyStateChanged(int r13) {
        /*
            r12 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.tao.flexbox.layoutmanager.view.SheetViewGroup.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001a
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r13)
            java.lang.Object[] r13 = new java.lang.Object[r2]
            r13[r1] = r12
            r13[r0] = r4
            java.lang.String r0 = "bfa37810"
            r3.ipc$dispatch(r0, r13)
            return
        L_0x001a:
            int r3 = r12.currentState
            if (r13 == r3) goto L_0x007f
            if (r13 != r0) goto L_0x002d
            int r3 = r12.appearNum
            int r3 = r3 + r0
            r12.appearNum = r3
            int r4 = r12.maxAppearNum
            if (r3 <= r4) goto L_0x002b
        L_0x0029:
            r4 = 0
            goto L_0x0043
        L_0x002b:
            r4 = 1
            goto L_0x0043
        L_0x002d:
            if (r13 != 0) goto L_0x0035
            int r3 = r12.disappearNum
            int r3 = r3 + r0
            r12.disappearNum = r3
            goto L_0x002b
        L_0x0035:
            if (r13 != r2) goto L_0x0041
            int r3 = r12.activeNum
            int r3 = r3 + r0
            r12.activeNum = r3
            int r4 = r12.maxActiveNum
            if (r3 <= r4) goto L_0x002b
            goto L_0x0029
        L_0x0041:
            r3 = 0
            goto L_0x002b
        L_0x0043:
            if (r4 == 0) goto L_0x007d
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
            java.lang.String r5 = "state"
            r10.put(r5, r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "num"
            r10.put(r4, r3)
            if (r13 != r2) goto L_0x0061
            goto L_0x0062
        L_0x0061:
            r0 = 0
        L_0x0062:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.String r1 = "active"
            r10.put(r1, r0)
            com.taobao.tao.flexbox.layoutmanager.core.n r0 = r12.sideNode
            com.taobao.tao.flexbox.layoutmanager.core.Component r5 = r0.K()
            com.taobao.tao.flexbox.layoutmanager.core.n r7 = r12.sideNode
            r9 = 0
            r11 = 0
            r6 = 130(0x82, float:1.82E-43)
            java.lang.String r8 = "onstatechanged"
            r5.sendMessage(r6, r7, r8, r9, r10, r11)
        L_0x007d:
            r12.currentState = r13
        L_0x007f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.view.SheetViewGroup.notifyStateChanged(int):void");
    }
}
