package com.taobao.android.detail.ttdetail.inside;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class InsideLinearLayout extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "InsideLinearLayout";
    private Boolean hasInterceptMoveEvent;
    private IDetailAdapter mDetailAdapter;
    private InsideScrollListener mInsideScrollListener;
    private c mOnCloseListener;
    private int mStartTopHeight;
    private FrameLayout mTopView;
    private VelocityTracker mTracker;
    private ObjectAnimator transparentHeaderViewAnimator;
    private int mScrollDirectionMinPix = 10;
    private int mFirstY = 0;
    private int mFirstX = 0;
    private int mCurrentY = 0;
    private SimpleGestureType mGestureType = SimpleGestureType.GESTURE_UNKNOWN;
    private InsideDetailState mDetailState = InsideDetailState.HALF_SCREEN;
    private List<d> mInsideStateChangedListeners = new ArrayList();
    private final ValueAnimator.AnimatorUpdateListener transparentHeaderViewAnimatorListener = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface IDetailAdapter extends d {
        @Override // com.taobao.android.detail.ttdetail.inside.InsideLinearLayout.d
        /* synthetic */ void changeInsideDetailState(InsideDetailState insideDetailState);

        boolean isInTopState();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public enum InsideDetailState {
        INSIDE_CREATE,
        HALF_SCREEN,
        FULL_SCREEN,
        INSIDE_DESTROY;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(InsideDetailState insideDetailState, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/inside/InsideLinearLayout$InsideDetailState");
        }

        public static InsideDetailState valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InsideDetailState) ipChange.ipc$dispatch("2a474c41", new Object[]{str});
            }
            return (InsideDetailState) Enum.valueOf(InsideDetailState.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface InsideScrollListener {
        void insideViewScroll(int i);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public enum SimpleGestureType {
        GESTURE_UNKNOWN,
        GESTURE_VERTICAL,
        GESTURE_MOVE_UP,
        GESTURE_MOVE_DOWN,
        GESTURE_HORIZONTAL;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(SimpleGestureType simpleGestureType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/inside/InsideLinearLayout$SimpleGestureType");
        }

        public static SimpleGestureType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SimpleGestureType) ipChange.ipc$dispatch("dbfe2bf4", new Object[]{str});
            }
            return (SimpleGestureType) Enum.valueOf(SimpleGestureType.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class ViewWrapper {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final View rView;

        static {
            t2o.a(912262036);
        }

        public ViewWrapper(View view) {
            this.rView = view;
        }

        public int getHeight() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
            }
            return this.rView.getLayoutParams().height;
        }

        public int getWidth() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue();
            }
            return this.rView.getLayoutParams().width;
        }

        public void setHeight(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2fde48d3", new Object[]{this, new Integer(i)});
                return;
            }
            this.rView.getLayoutParams().height = i;
            this.rView.requestLayout();
        }

        public void setWidth(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("baf60358", new Object[]{this, new Integer(i)});
                return;
            }
            this.rView.getLayoutParams().width = i;
            this.rView.requestLayout();
        }
    }

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
            } else {
                InsideLinearLayout.access$000(InsideLinearLayout.this, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f6845a;

        public b(int i) {
            this.f6845a = i;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/inside/InsideLinearLayout$2");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            } else if (this.f6845a == 0) {
                InsideDetailState access$100 = InsideLinearLayout.access$100(InsideLinearLayout.this);
                InsideDetailState insideDetailState = InsideDetailState.FULL_SCREEN;
                if (access$100 != insideDetailState) {
                    InsideLinearLayout.this.notifyInsideDetailState(insideDetailState);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface c {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface d {
        void changeInsideDetailState(InsideDetailState insideDetailState);
    }

    static {
        t2o.a(912262027);
    }

    public InsideLinearLayout(Context context) {
        super(context);
        init(context);
    }

    public static /* synthetic */ void access$000(InsideLinearLayout insideLinearLayout, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69e25dc8", new Object[]{insideLinearLayout, new Integer(i)});
        } else {
            insideLinearLayout.notifyScrollListener(i);
        }
    }

    public static /* synthetic */ InsideDetailState access$100(InsideLinearLayout insideLinearLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InsideDetailState) ipChange.ipc$dispatch("27fee97e", new Object[]{insideLinearLayout});
        }
        return insideLinearLayout.mDetailState;
    }

    private void autoToEndState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("819d03a7", new Object[]{this});
            return;
        }
        int topViewHeight = getTopViewHeight();
        if (needExpandPage(topViewHeight)) {
            shrinkTopView(topViewHeight);
        } else if (needClosePage(topViewHeight)) {
            closePage();
        } else {
            resetTopView(topViewHeight);
        }
    }

    private void closePage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dc6d1ae", new Object[]{this});
            return;
        }
        c cVar = this.mOnCloseListener;
        if (cVar != null) {
            ((com.taobao.android.detail.ttdetail.inside.a) cVar).a();
        }
    }

    private int getTopViewHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c1a492a5", new Object[]{this})).intValue();
        }
        return this.mTopView.getLayoutParams().height;
    }

    private void handleDownScroll(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e73eaf65", new Object[]{this, new Integer(i)});
            return;
        }
        int i2 = this.mTopView.getLayoutParams().height + i;
        this.mTopView.getLayoutParams().height = i2;
        this.mTopView.requestLayout();
        notifyScrollListener(i2);
    }

    private void handleUpScroll(int i) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e71cdcc", new Object[]{this, new Integer(i)});
            return;
        }
        int i3 = this.mTopView.getLayoutParams().height - i;
        if (i3 >= 0) {
            i2 = i3;
        }
        this.mTopView.getLayoutParams().height = i2;
        this.mTopView.requestLayout();
        notifyScrollListener(i2);
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
        } else {
            this.mScrollDirectionMinPix = ViewConfiguration.get(context).getScaledTouchSlop();
        }
    }

    public static /* synthetic */ Object ipc$super(InsideLinearLayout insideLinearLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1447998406) {
            return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
        }
        if (hashCode == -436676516) {
            super.onFinishInflate();
            return null;
        } else if (hashCode == 2075560917) {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/detail/ttdetail/inside/InsideLinearLayout");
        }
    }

    private boolean isVerticalMove() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("956822bc", new Object[]{this})).booleanValue();
        }
        SimpleGestureType simpleGestureType = this.mGestureType;
        if (simpleGestureType == SimpleGestureType.GESTURE_VERTICAL || simpleGestureType == SimpleGestureType.GESTURE_MOVE_UP || simpleGestureType == SimpleGestureType.GESTURE_MOVE_DOWN) {
            return true;
        }
        return false;
    }

    private boolean needClosePage(int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61506d4f", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (this.mGestureType != SimpleGestureType.GESTURE_MOVE_DOWN) {
            return false;
        }
        this.mTracker.computeCurrentVelocity(1000);
        if (this.mTracker.getYVelocity() > 1000.0f) {
            return true;
        }
        int height = getHeight();
        if (this.mDetailState == InsideDetailState.HALF_SCREEN) {
            i2 = this.mStartTopHeight;
        } else {
            i2 = 0;
        }
        if (((i - i2) * 1.0f) / height > 0.05f) {
            return true;
        }
        return false;
    }

    private boolean needExpandPage(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48c09d41", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (this.mGestureType != SimpleGestureType.GESTURE_MOVE_UP || this.mDetailState != InsideDetailState.HALF_SCREEN) {
            return false;
        }
        this.mTracker.computeCurrentVelocity(1000);
        if (this.mTracker.getYVelocity() >= -1000.0f && ((this.mStartTopHeight - i) * 1.0f) / getHeight() <= 0.05f) {
            return false;
        }
        return true;
    }

    private void notifyScrollListener(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c5ffb52", new Object[]{this, new Integer(i)});
            return;
        }
        InsideScrollListener insideScrollListener = this.mInsideScrollListener;
        if (insideScrollListener != null) {
            insideScrollListener.insideViewScroll(i);
        }
    }

    private void resetTopView(int i) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("841124f1", new Object[]{this, new Integer(i)});
            return;
        }
        if (this.mDetailState != InsideDetailState.FULL_SCREEN) {
            i2 = this.mStartTopHeight;
        }
        doAnim(this.mTopView, "Height", i, i2);
    }

    private void shrinkTopView(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2afe06ab", new Object[]{this, new Integer(i)});
        } else {
            doAnim(this.mTopView, "Height", i, 0);
        }
    }

    public void addOnInsideStateChangedListener(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6837ccfc", new Object[]{this, dVar});
        } else if (!this.mInsideStateChangedListeners.contains(dVar)) {
            this.mInsideStateChangedListeners.add(dVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i;
        SimpleGestureType simpleGestureType;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        requestDisallowInterceptTouchEvent(false);
        if (motionEvent.getAction() == 0) {
            this.mFirstY = 0;
            this.mCurrentY = 0;
            this.mGestureType = SimpleGestureType.GESTURE_UNKNOWN;
            this.mFirstY = (int) motionEvent.getY();
            this.mFirstX = (int) motionEvent.getX();
        } else if (motionEvent.getAction() == 2) {
            int abs = Math.abs(((int) motionEvent.getX()) - this.mFirstX);
            int abs2 = Math.abs(((int) motionEvent.getY()) - this.mFirstY);
            if (this.mGestureType == SimpleGestureType.GESTURE_UNKNOWN && (abs > (i = this.mScrollDirectionMinPix) || abs2 > i)) {
                if (abs > abs2) {
                    simpleGestureType = SimpleGestureType.GESTURE_HORIZONTAL;
                } else {
                    simpleGestureType = SimpleGestureType.GESTURE_VERTICAL;
                }
                this.mGestureType = simpleGestureType;
            }
        }
        return dispatchTouchEvent;
    }

    public void doAnim(View view, String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bebbea59", new Object[]{this, view, str, new Integer(i), new Integer(i2)});
            return;
        }
        ViewWrapper viewWrapper = new ViewWrapper(view);
        ObjectAnimator objectAnimator = this.transparentHeaderViewAnimator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.transparentHeaderViewAnimator.removeAllUpdateListeners();
        }
        ObjectAnimator duration = ObjectAnimator.ofInt(viewWrapper, str, i, i2).setDuration(250L);
        this.transparentHeaderViewAnimator = duration;
        duration.setInterpolator(new LinearInterpolator());
        this.transparentHeaderViewAnimator.addUpdateListener(this.transparentHeaderViewAnimatorListener);
        this.transparentHeaderViewAnimator.addListener(new b(i2));
        this.transparentHeaderViewAnimator.start();
    }

    public InsideDetailState getDetailState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InsideDetailState) ipChange.ipc$dispatch("917063e9", new Object[]{this});
        }
        return this.mDetailState;
    }

    public void notifyInsideDetailState(InsideDetailState insideDetailState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbd77ee6", new Object[]{this, insideDetailState});
        } else {
            notifyInsideDetailState(insideDetailState, false);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5f8d85c", new Object[]{this});
            return;
        }
        super.onFinishInflate();
        this.mTopView = (FrameLayout) findViewById(R.id.tt_detail_inside_top_view);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IDetailAdapter iDetailAdapter;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.hasInterceptMoveEvent = null;
        } else if (action != 1) {
            if (action != 2) {
                return true;
            }
            Boolean bool = this.hasInterceptMoveEvent;
            if (bool != null) {
                return bool.booleanValue();
            }
            if ((this.mTopView.getLayoutParams().height == 0 || !isVerticalMove()) && (motionEvent.getY() - this.mFirstY <= 0.0f || (iDetailAdapter = this.mDetailAdapter) == null || !iDetailAdapter.isInTopState() || !isVerticalMove())) {
                z = false;
            }
            if (!isVerticalMove()) {
                return z;
            }
            this.hasInterceptMoveEvent = Boolean.valueOf(z);
            return z;
        }
        Boolean bool2 = this.hasInterceptMoveEvent;
        if (bool2 == null || !bool2.booleanValue()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
        if (r3 != 3) goto L_0x006f;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.android.detail.ttdetail.inside.InsideLinearLayout.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001c
            java.lang.String r4 = "a9b14c3a"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r5
            r2[r0] = r6
            java.lang.Object r6 = r3.ipc$dispatch(r4, r2)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L_0x001c:
            super.onTouchEvent(r6)
            android.view.VelocityTracker r3 = r5.mTracker
            if (r3 != 0) goto L_0x0029
            android.view.VelocityTracker r3 = android.view.VelocityTracker.obtain()
            r5.mTracker = r3
        L_0x0029:
            android.view.VelocityTracker r3 = r5.mTracker
            r3.addMovement(r6)
            int r3 = r6.getAction()
            if (r3 == r0) goto L_0x0062
            if (r3 == r2) goto L_0x003a
            r6 = 3
            if (r3 == r6) goto L_0x0062
            goto L_0x006f
        L_0x003a:
            int r2 = r5.mCurrentY
            if (r2 != 0) goto L_0x0040
            int r2 = r5.mFirstY
        L_0x0040:
            float r6 = r6.getY()
            int r6 = (int) r6
            r5.mCurrentY = r6
            int r6 = r6 - r2
            com.taobao.android.detail.ttdetail.inside.InsideLinearLayout$IDetailAdapter r2 = r5.mDetailAdapter
            if (r2 != 0) goto L_0x004d
            return r1
        L_0x004d:
            if (r6 <= 0) goto L_0x0057
            com.taobao.android.detail.ttdetail.inside.InsideLinearLayout$SimpleGestureType r1 = com.taobao.android.detail.ttdetail.inside.InsideLinearLayout.SimpleGestureType.GESTURE_MOVE_DOWN
            r5.mGestureType = r1
            r5.handleDownScroll(r6)
            goto L_0x006f
        L_0x0057:
            if (r6 >= 0) goto L_0x006f
            com.taobao.android.detail.ttdetail.inside.InsideLinearLayout$SimpleGestureType r1 = com.taobao.android.detail.ttdetail.inside.InsideLinearLayout.SimpleGestureType.GESTURE_MOVE_UP
            r5.mGestureType = r1
            int r6 = -r6
            r5.handleUpScroll(r6)
            goto L_0x006f
        L_0x0062:
            r5.autoToEndState()
            android.view.VelocityTracker r6 = r5.mTracker
            if (r6 == 0) goto L_0x006f
            r6.recycle()
            r6 = 0
            r5.mTracker = r6
        L_0x006f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.ttdetail.inside.InsideLinearLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        this.mInsideScrollListener = null;
        this.mDetailAdapter = null;
        this.mInsideStateChangedListeners.clear();
        ObjectAnimator objectAnimator = this.transparentHeaderViewAnimator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.transparentHeaderViewAnimator.removeAllUpdateListeners();
        }
    }

    public void removeOnInsideStateChangedListener(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd7fdb39", new Object[]{this, dVar});
        } else {
            this.mInsideStateChangedListeners.remove(dVar);
        }
    }

    public void setDetailAdapter(IDetailAdapter iDetailAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1be2d0d0", new Object[]{this, iDetailAdapter});
        } else {
            this.mDetailAdapter = iDetailAdapter;
        }
    }

    public void setHalfScreenTopViewHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b4f12fc", new Object[]{this, new Integer(i)});
        } else if (this.mDetailState != InsideDetailState.FULL_SCREEN) {
            ViewGroup.LayoutParams layoutParams = this.mTopView.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = i;
            this.mStartTopHeight = i;
            this.mTopView.setLayoutParams(layoutParams);
        }
    }

    public void setInsideScrollListener(InsideScrollListener insideScrollListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96395c05", new Object[]{this, insideScrollListener});
        } else {
            this.mInsideScrollListener = insideScrollListener;
        }
    }

    public void setOnCloseListener(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d88024d", new Object[]{this, cVar});
        } else {
            this.mOnCloseListener = cVar;
        }
    }

    public void notifyInsideDetailState(InsideDetailState insideDetailState, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f1910ae", new Object[]{this, insideDetailState, new Boolean(z)});
        } else if (insideDetailState != this.mDetailState || z) {
            this.mDetailState = insideDetailState;
            for (d dVar : this.mInsideStateChangedListeners) {
                dVar.changeInsideDetailState(this.mDetailState);
            }
        }
    }

    public InsideLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public InsideLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }
}
