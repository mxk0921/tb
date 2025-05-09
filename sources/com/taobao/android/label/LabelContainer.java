package com.taobao.android.label;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import tb.cjc;
import tb.ejc;
import tb.pfg;
import tb.pj7;
import tb.t2o;
import tb.tyb;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class LabelContainer extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int ANCHOR_HEIGHT = 16;
    private static final int LABEL_HEIGHT = 25;
    private static final String TAG = "LabelContainer";
    private boolean inDeleteState;
    private int mAnchorWidth;
    private final GestureDetector mAppGesture;
    private int mContainerHeight;
    private int mContainerWidth;
    private Rect mDeleteRegion;
    private tyb mDeleteView;
    private boolean mEnableMove;
    private boolean mEnableMoveOutSide;
    private boolean mEnableRotate;
    private Rect mExtendIndicatorClickArea;
    private List<Rect> mForbidRegions;
    private cjc mILabelEventListener;
    private boolean mInit;
    private int mLabelHeight;
    private Rect mLabelRegion;
    private pfg mLabelRotateListener;
    private List<Runnable> mPendingTasks;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements View.OnTouchListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
            }
            return LabelContainer.access$000(LabelContainer.this).onTouchEvent(motionEvent);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements ViewTreeObserver.OnPreDrawListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5acfbc33", new Object[]{this})).booleanValue();
            }
            int width = LabelContainer.this.getWidth();
            int height = LabelContainer.this.getHeight();
            if (width <= 0 || height <= 0) {
                return false;
            }
            if (LabelContainer.access$100(LabelContainer.this)) {
                return true;
            }
            LabelContainer.this.getViewTreeObserver().removeOnPreDrawListener(this);
            LabelContainer.access$200(LabelContainer.this);
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ArrayList f8129a;

        public c(ArrayList arrayList) {
            this.f8129a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            for (int i = 0; i < this.f8129a.size(); i++) {
                LabelData labelData = (LabelData) this.f8129a.get(i);
                if (labelData != null) {
                    LabelContainer.this.addLabel(labelData);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ tyb f8130a;

        public d(tyb tybVar) {
            this.f8130a = tybVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (LabelContainer.access$500(LabelContainer.this) != null && !LabelContainer.access$500(LabelContainer.this).isEmpty()) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(LabelContainer.access$500(LabelContainer.this).width(), LabelContainer.access$500(LabelContainer.this).height());
                layoutParams.topMargin = LabelContainer.access$500(LabelContainer.this).top;
                layoutParams.leftMargin = LabelContainer.access$500(LabelContainer.this).left;
                this.f8130a.getView().setLayoutParams(layoutParams);
                LabelContainer.this.addView(this.f8130a.getView());
                this.f8130a.getView().setVisibility(8);
                LabelContainer.access$802(LabelContainer.this, this.f8130a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e extends GestureDetector.SimpleOnGestureListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(926941196);
        }

        public e() {
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            if (str.hashCode() == -782828477) {
                return new Boolean(super.onSingleTapConfirmed((MotionEvent) objArr[0]));
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/label/LabelContainer$AppGesture");
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d156fc43", new Object[]{this, motionEvent})).booleanValue();
            }
            if (!LabelContainer.access$900(LabelContainer.this).contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
            int x = ((int) motionEvent.getX()) - LabelContainer.access$900(LabelContainer.this).left;
            int y = ((int) motionEvent.getY()) - LabelContainer.access$900(LabelContainer.this).top;
            if (LabelContainer.access$400(LabelContainer.this) != null) {
                LabelContainer.access$400(LabelContainer.this).h(x, y);
            }
            return super.onSingleTapConfirmed(motionEvent);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class f implements cjc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(926941197);
            t2o.a(926941188);
        }

        public f() {
        }

        @Override // tb.cjc
        public void a(LabelData labelData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56942bdd", new Object[]{this, labelData});
                return;
            }
            if (LabelContainer.access$400(LabelContainer.this) != null) {
                LabelContainer.access$400(LabelContainer.this).a(labelData);
            }
            if (LabelContainer.access$800(LabelContainer.this) != null) {
                LabelContainer.access$800(LabelContainer.this).b();
            }
        }

        @Override // tb.cjc
        public boolean b(LabelData labelData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6a2b6d5d", new Object[]{this, labelData})).booleanValue();
            }
            if (LabelContainer.access$400(LabelContainer.this) != null) {
                return LabelContainer.access$400(LabelContainer.this).b(labelData);
            }
            return false;
        }

        @Override // tb.cjc
        public void c(LabelData labelData, float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f1d7439b", new Object[]{this, labelData, new Float(f), new Float(f2)});
                return;
            }
            if (LabelContainer.access$400(LabelContainer.this) != null) {
                LabelContainer.access$400(LabelContainer.this).c(labelData, f, f2);
            }
            if (LabelContainer.access$500(LabelContainer.this) != null && !LabelContainer.access$500(LabelContainer.this).isEmpty()) {
                LabelContainer.access$700(LabelContainer.this);
            }
        }

        @Override // tb.cjc
        public void e(LabelData labelData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dbdac57e", new Object[]{this, labelData});
                return;
            }
            if (LabelContainer.access$400(LabelContainer.this) != null) {
                LabelContainer.access$400(LabelContainer.this).e(labelData);
            }
            if (LabelContainer.access$800(LabelContainer.this) != null) {
                LabelContainer.access$800(LabelContainer.this).a();
            }
        }

        @Override // tb.cjc
        public void f(LabelData labelData, float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e2c92eec", new Object[]{this, labelData, new Float(f), new Float(f2)});
            } else if (LabelContainer.access$400(LabelContainer.this) != null) {
                LabelContainer.access$400(LabelContainer.this).f(labelData, f, f2);
            }
        }

        @Override // tb.cjc
        public void g(View view, LabelData labelData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8430c693", new Object[]{this, view, labelData});
            } else if (LabelContainer.access$400(LabelContainer.this) != null) {
                LabelContainer.access$400(LabelContainer.this).g(view, labelData);
            }
        }

        @Override // tb.cjc
        public boolean h(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("266b202d", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
            }
            return false;
        }

        @Override // tb.cjc
        public void i(LabelData labelData, float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6f0597e2", new Object[]{this, labelData, new Float(f), new Float(f2)});
                return;
            }
            if (LabelContainer.access$400(LabelContainer.this) != null) {
                LabelContainer.access$400(LabelContainer.this).i(labelData, f, f2);
            }
            if (LabelContainer.access$500(LabelContainer.this) != null && !LabelContainer.access$500(LabelContainer.this).isEmpty()) {
                LabelContainer.access$600(LabelContainer.this);
            }
        }

        public /* synthetic */ f(LabelContainer labelContainer, a aVar) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class g implements pfg {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(926941198);
            t2o.a(926941202);
        }

        public g() {
        }

        @Override // tb.pfg
        public void d(LabelData labelData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df5b0040", new Object[]{this, labelData});
            } else if (LabelContainer.access$300(LabelContainer.this) != null) {
                LabelContainer.access$300(LabelContainer.this).d(labelData);
            }
        }

        public /* synthetic */ g(LabelContainer labelContainer, a aVar) {
            this();
        }
    }

    static {
        t2o.a(926941191);
        t2o.a(926941187);
    }

    public LabelContainer(Context context) {
        this(context, null);
    }

    public static /* synthetic */ GestureDetector access$000(LabelContainer labelContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GestureDetector) ipChange.ipc$dispatch("85add351", new Object[]{labelContainer});
        }
        return labelContainer.mAppGesture;
    }

    public static /* synthetic */ boolean access$100(LabelContainer labelContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd37a152", new Object[]{labelContainer})).booleanValue();
        }
        return labelContainer.mInit;
    }

    public static /* synthetic */ void access$200(LabelContainer labelContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1702432d", new Object[]{labelContainer});
        } else {
            labelContainer.initB4Draw();
        }
    }

    public static /* synthetic */ pfg access$300(LabelContainer labelContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pfg) ipChange.ipc$dispatch("1ce7104", new Object[]{labelContainer});
        }
        return labelContainer.mLabelRotateListener;
    }

    public static /* synthetic */ cjc access$400(LabelContainer labelContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cjc) ipChange.ipc$dispatch("50b181a5", new Object[]{labelContainer});
        }
        return labelContainer.mILabelEventListener;
    }

    public static /* synthetic */ Rect access$500(LabelContainer labelContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("abf5e693", new Object[]{labelContainer});
        }
        return labelContainer.mDeleteRegion;
    }

    public static /* synthetic */ void access$600(LabelContainer labelContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe2ccaa9", new Object[]{labelContainer});
        } else {
            labelContainer.showDeleteAreaView();
        }
    }

    public static /* synthetic */ void access$700(LabelContainer labelContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37f76c88", new Object[]{labelContainer});
        } else {
            labelContainer.hideDeleteAreaView();
        }
    }

    public static /* synthetic */ tyb access$800(LabelContainer labelContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tyb) ipChange.ipc$dispatch("b6001653", new Object[]{labelContainer});
        }
        return labelContainer.mDeleteView;
    }

    public static /* synthetic */ tyb access$802(LabelContainer labelContainer, tyb tybVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tyb) ipChange.ipc$dispatch("35a95991", new Object[]{labelContainer, tybVar});
        }
        labelContainer.mDeleteView = tybVar;
        return tybVar;
    }

    public static /* synthetic */ Rect access$900(LabelContainer labelContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("8f77690f", new Object[]{labelContainer});
        }
        return labelContainer.mLabelRegion;
    }

    private ejc findTargetLabel(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ejc) ipChange.ipc$dispatch("95156eae", new Object[]{this, str});
        }
        View findViewWithTag = findViewWithTag(str);
        if (findViewWithTag == null || !(findViewWithTag instanceof ejc)) {
            return null;
        }
        return (ejc) findViewWithTag;
    }

    private void hideDeleteAreaView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a57a7a86", new Object[]{this});
        } else if (this.inDeleteState) {
            onDeleteViewDismiss(this.mDeleteView);
            this.inDeleteState = false;
        }
    }

    private void initB4Draw() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab16db2d", new Object[]{this});
            return;
        }
        try {
            if (!this.mInit) {
                this.mInit = true;
                Log.e(TAG, "initB4Draw");
                this.mLabelHeight = pj7.a(getContext(), 25.0f);
                if (this.mAnchorWidth == 0) {
                    this.mAnchorWidth = pj7.a(getContext(), 16.0f);
                }
                this.mContainerWidth = getWidth();
                this.mContainerHeight = getHeight();
                if (this.mLabelRegion.width() == 0 && this.mLabelRegion.height() == 0) {
                    this.mLabelRegion.set(0, 0, this.mContainerWidth, this.mContainerHeight);
                }
                addForbidRegion(new Rect(0, -100, this.mContainerWidth, 0));
                int i = this.mContainerHeight;
                addForbidRegion(new Rect(0, i, this.mContainerWidth, i + 100));
                addForbidRegion(new Rect(-100, 0, 0, this.mContainerHeight));
                int i2 = this.mContainerWidth;
                addForbidRegion(new Rect(i2, 0, i2 + 100, this.mContainerHeight));
                List<Runnable> list = this.mPendingTasks;
                if (list != null && list.size() > 0) {
                    for (Runnable runnable : this.mPendingTasks) {
                        runnable.run();
                    }
                    this.mPendingTasks.clear();
                    Log.e(TAG, "execute pending tasks");
                }
            }
        } catch (Throwable th) {
            String stackTraceString = Log.getStackTraceString(th);
            Log.e(TAG, "LabelContainer init failed, reason = " + stackTraceString);
        }
    }

    public static /* synthetic */ Object ipc$super(LabelContainer labelContainer, String str, Object... objArr) {
        if (str.hashCode() == 949399698) {
            super.onDetachedFromWindow();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/label/LabelContainer");
    }

    private int judgeDirection(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a5bad627", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i >= this.mLabelRegion.width() / 2) {
            return 0;
        }
        return 1;
    }

    private void pendingTask(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d1b0141", new Object[]{this, runnable});
        } else if (this.mInit) {
            runnable.run();
        } else {
            this.mPendingTasks.add(runnable);
        }
    }

    private void showDeleteAreaView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca8f9f81", new Object[]{this});
        } else if (!this.inDeleteState) {
            onDeleteViewShow(this.mDeleteView);
            this.inDeleteState = true;
        }
    }

    public void addForbidRegion(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c753b5a9", new Object[]{this, rect});
        } else {
            this.mForbidRegions.add(rect);
        }
    }

    public <T extends LabelData> String addLabel(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8a2053c7", new Object[]{this, t});
        }
        if (!this.mInit) {
            Log.e(TAG, "LabelContainer not init yet, add label failed!");
        }
        String uuid = UUID.randomUUID().toString();
        int i = t.y;
        int i2 = this.mLabelHeight / 2;
        if (i < i2) {
            t.y = i2;
        }
        if (t.y > this.mLabelRegion.height() - (this.mLabelHeight / 2)) {
            t.y = this.mLabelRegion.height() - (this.mLabelHeight / 2);
        }
        int i3 = t.x;
        int i4 = this.mAnchorWidth / 2;
        if (i3 < i4) {
            t.x = i4;
        }
        if (t.x > this.mLabelRegion.width() - (this.mAnchorWidth / 2)) {
            t.x = this.mLabelRegion.width() - (this.mAnchorWidth / 2);
        }
        if (t.posX != vu3.b.GEO_NOT_SUPPORT || t.posY != vu3.b.GEO_NOT_SUPPORT) {
            if (t.posY < (this.mLabelHeight / 2) / this.mLabelRegion.height()) {
                t.posY = (this.mLabelHeight / 2) / this.mLabelRegion.height();
            }
            if (t.posY > (this.mLabelRegion.height() - (this.mLabelHeight / 2)) / this.mLabelRegion.height()) {
                t.posY = (this.mLabelRegion.height() - (this.mLabelHeight / 2)) / this.mLabelRegion.height();
            }
            if (t.posX < (this.mAnchorWidth / 2) / this.mLabelRegion.width()) {
                t.posX = (this.mAnchorWidth / 2) / this.mLabelRegion.width();
            }
            if (t.posX > (this.mLabelRegion.width() - (this.mAnchorWidth / 2)) / this.mLabelRegion.width()) {
                t.posX = (this.mLabelRegion.width() - (this.mAnchorWidth / 2)) / this.mLabelRegion.width();
            }
        } else if (t.direction == -1) {
            t.direction = judgeDirection(t.x);
        }
        t.id = uuid;
        TextLabel textLabel = new TextLabel(getContext(), this);
        textLabel.enableMove(this.mEnableMove);
        textLabel.enableMoveToOutSide(this.mEnableMoveOutSide);
        textLabel.enableRotate(this.mEnableRotate);
        textLabel.setLabelData(t);
        FrameLayout.LayoutParams generateLayoutParams = textLabel.generateLayoutParams(true);
        textLabel.setLabelEventListener(new f(this, null));
        textLabel.setLabelRotateListener(new g(this, null));
        textLabel.setTag(uuid);
        Rect rect = this.mExtendIndicatorClickArea;
        if (rect != null) {
            textLabel.setExtendIndicatorClickArea(rect);
        }
        addView(textLabel, generateLayoutParams);
        t.toString();
        return uuid;
    }

    public void deleteLabel(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("969a79da", new Object[]{this, str});
            return;
        }
        new StringBuilder("deleteLabel.labelId:").append(str);
        removeView(findViewWithTag(str));
    }

    public void enableMove(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b845bbb9", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mEnableMove = z;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (getChildAt(i) instanceof ejc) {
                ((ejc) getChildAt(i)).enableMove(z);
            }
        }
    }

    public void enableMoveToOutSide(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27a017b7", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mEnableMoveOutSide = z;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (getChildAt(i) instanceof ejc) {
                ((ejc) getChildAt(i)).enableMoveToOutSide(z);
            }
        }
    }

    public void enableRotate(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bacf052f", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mEnableRotate = z;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (getChildAt(i) instanceof ejc) {
                ((ejc) getChildAt(i)).enableRotate(z);
            }
        }
    }

    public int getAnchorWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("26d3c9d5", new Object[]{this})).intValue();
        }
        return this.mAnchorWidth;
    }

    public Rect getDeleteRegion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("f30cad45", new Object[]{this});
        }
        return this.mDeleteRegion;
    }

    public List<Rect> getForbidRegions() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("14af56ab", new Object[]{this});
        }
        return this.mForbidRegions;
    }

    public Rect getLabelRegion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("42aa75e2", new Object[]{this});
        }
        return this.mLabelRegion;
    }

    public ArrayList<LabelData> getMarkList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("480fe662", new Object[]{this});
        }
        ArrayList<LabelData> arrayList = new ArrayList<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof TextLabel) {
                arrayList.add(((TextLabel) childAt).getLabelData());
            }
        }
        new StringBuilder("getMarkList.markList:").append(arrayList.toString());
        return arrayList;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
        } else {
            super.onDetachedFromWindow();
        }
    }

    @Deprecated
    public void randomLabelInitPosition(LabelData labelData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40e7ad10", new Object[]{this, labelData});
        }
    }

    public void rotateLabel(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6edcd42a", new Object[]{this, str});
            return;
        }
        ejc findTargetLabel = findTargetLabel(str);
        if (findTargetLabel != null) {
            findTargetLabel.rotateLabel();
        }
        new StringBuilder("rotateLabel.labelId:").append(str);
    }

    public void setAnchorWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a27a6d", new Object[]{this, new Integer(i)});
            return;
        }
        new StringBuilder("setAnchorWidth.width:").append(i);
        this.mAnchorWidth = i;
    }

    public void setDeleteRegion(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7af35391", new Object[]{this, rect});
            return;
        }
        this.mDeleteRegion = rect;
        if (this.mDeleteView != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.mDeleteRegion.width(), this.mDeleteRegion.height());
            Rect rect2 = this.mDeleteRegion;
            layoutParams.topMargin = rect2.top;
            layoutParams.leftMargin = rect2.left;
            this.mDeleteView.getView().setLayoutParams(layoutParams);
        }
    }

    public void setDeleteView(tyb tybVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fca043d", new Object[]{this, tybVar});
        } else if (this.mDeleteView == null) {
            pendingTask(new d(tybVar));
        }
    }

    public void setExtendIndicatorClickArea(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("219234d0", new Object[]{this, rect});
        } else {
            this.mExtendIndicatorClickArea = rect;
        }
    }

    public void setLabelEventListener(cjc cjcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6def9e7d", new Object[]{this, cjcVar});
        } else {
            this.mILabelEventListener = cjcVar;
        }
    }

    public void setLabelRegion(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2252c", new Object[]{this, rect});
        } else {
            this.mLabelRegion = rect;
        }
    }

    public void setLabelRotateListener(pfg pfgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c6e3c2", new Object[]{this, pfgVar});
        } else {
            this.mLabelRotateListener = pfgVar;
        }
    }

    public <T extends LabelData> void updateLabel(String str, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5bd571b", new Object[]{this, str, t});
            return;
        }
        ejc findTargetLabel = findTargetLabel(str);
        if (findTargetLabel != null) {
            findTargetLabel.updateLabel(t);
            new StringBuilder("updateLabel.label:").append(t.toString());
        }
    }

    public LabelContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LabelContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mEnableMove = true;
        this.mEnableMoveOutSide = true;
        this.mEnableRotate = true;
        this.mLabelRegion = new Rect();
        this.mForbidRegions = new ArrayList();
        this.mInit = false;
        this.mPendingTasks = new ArrayList();
        this.inDeleteState = false;
        this.mAppGesture = new GestureDetector(context, new e(), new Handler());
        setOnTouchListener(new a());
        getViewTreeObserver().addOnPreDrawListener(new b());
    }

    public void setMarkList(ArrayList<LabelData> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55fe8c96", new Object[]{this, arrayList});
        } else if (arrayList != null && arrayList.size() > 0) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (childAt instanceof TextLabel) {
                    removeView(childAt);
                }
            }
            new StringBuilder("setMarkList.markList:").append(arrayList.toString());
            pendingTask(new c(arrayList));
        }
    }

    public void onDeleteViewDismiss(tyb tybVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a110566", new Object[]{this, tybVar});
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(tybVar.getView(), "translationY", 0.0f, pj7.a(getContext(), this.mDeleteRegion.height()));
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.setDuration(300L);
        ofFloat.start();
    }

    public void onDeleteViewShow(tyb tybVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("986f4c97", new Object[]{this, tybVar});
            return;
        }
        tybVar.getView().setVisibility(0);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(tybVar.getView(), "translationY", pj7.a(getContext(), this.mDeleteRegion.height()), 0.0f);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.setDuration(300L);
        ofFloat.start();
    }
}
