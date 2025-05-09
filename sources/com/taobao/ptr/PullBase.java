package com.taobao.ptr;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import androidx.core.view.MotionEventCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import tb.t2o;
import tb.tdw;
import tb.v4n;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class PullBase extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int INVALID_POINTER_ID = -1;
    private static final float MAX_PULL_SCROLL_FRICTION = 1.0f;
    private static final int SMOOTH_SCROLL_DURATION_MS = 350;
    private static final String STATE_SUPER = "pull_super";
    private int mActivePointerIndex;
    private v4n mContentView;
    private h mCurrentSmoothScrollRunnable;
    private PullLayout mEndLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private boolean mIsBeingDragged;
    private float mLastMotionX;
    private float mLastMotionY;
    private List<f> mOnPullListeners;
    private Interpolator mPullInterpolator;
    private Interpolator mReleaseInterpolator;
    private List<e> mScrollListeners;
    private PullLayout mStartLayout;
    private int mTouchSlop;
    private Mode mMode = Mode.getDefault();
    private Mode mCurrentMode = Mode.getDefault();
    private int mActivePointerId = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public enum Mode {
        DISABLED(0),
        PULL_FROM_START(1),
        PULL_FROM_END(2),
        BOTH(3);
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int mIntValue;

        Mode(int i) {
            this.mIntValue = i;
        }

        public static Mode getDefault() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Mode) ipChange.ipc$dispatch("74277036", new Object[0]);
            }
            return DISABLED;
        }

        public static /* synthetic */ Object ipc$super(Mode mode, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/ptr/PullBase$Mode");
        }

        public static Mode mapIntToValue(int i) {
            Mode[] values;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Mode) ipChange.ipc$dispatch("fc0740af", new Object[]{new Integer(i)});
            }
            for (Mode mode : values()) {
                if (i == mode.getIntValue()) {
                    return mode;
                }
            }
            return getDefault();
        }

        public static Mode valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Mode) ipChange.ipc$dispatch("34f6ceef", new Object[]{str});
            }
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public int getIntValue() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("7e178cb2", new Object[]{this})).intValue();
            }
            return this.mIntValue;
        }

        public boolean isUnderPermit(Mode mode) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ef88b946", new Object[]{this, mode})).booleanValue();
            }
            if (mode != null) {
                int i = d.$SwitchMap$com$taobao$ptr$PullBase$Mode[ordinal()];
                if (i == 1 || i == 2) {
                    if (this == mode || mode == DISABLED) {
                        return true;
                    }
                } else if (i == 3 || i == 4) {
                    return true;
                }
            }
            return false;
        }

        public boolean permitsPullEnd() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("449c8f09", new Object[]{this})).booleanValue();
            }
            if (this == PULL_FROM_END || this == BOTH) {
                return true;
            }
            return false;
        }

        public boolean permitsPullStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f4417250", new Object[]{this})).booleanValue();
            }
            if (this == PULL_FROM_START || this == BOTH) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.ptr.PullBase.g
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3f03d2b3", new Object[]{this});
            } else {
                PullBase.access$100(PullBase.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.ptr.PullBase.g
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3f03d2b3", new Object[]{this});
            } else {
                PullBase.access$200(PullBase.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                PullBase.this.requestLayout();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static /* synthetic */ class d {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$ptr$PullBase$Mode;

        static {
            int[] iArr = new int[Mode.values().length];
            $SwitchMap$com$taobao$ptr$PullBase$Mode = iArr;
            try {
                iArr[Mode.PULL_FROM_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$ptr$PullBase$Mode[Mode.PULL_FROM_END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$ptr$PullBase$Mode[Mode.BOTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$ptr$PullBase$Mode[Mode.DISABLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface e {
        void a(PullBase pullBase, int i);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface f {
        void a(PullBase pullBase, Mode mode, float f, int i);

        void b(PullBase pullBase, Mode mode, float f, int i);

        void c(PullBase pullBase, Mode mode, float f, int i);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface g {
        void a();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private List<g> f11486a = new ArrayList();
        private g b;
        private Interpolator c;
        private PullBase d;
        private Lock e;
        private boolean f;
        private int g;
        private int h;
        private int i;
        private long j;
        private long k;
        private boolean l;

        static {
            t2o.a(632291357);
        }

        public h(PullBase pullBase, Interpolator interpolator, int i, int i2, long j, boolean z, g gVar) {
            if (pullBase == null || interpolator == null) {
                throw new IllegalArgumentException("view and interpolator param can not be null");
            }
            this.d = pullBase;
            this.c = interpolator;
            this.g = i;
            this.h = i2;
            this.k = j;
            this.f = z;
            this.b = gVar;
            this.l = true;
            this.e = new ReentrantLock();
            this.i = -1;
        }

        public static /* synthetic */ boolean a(h hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("43f34c18", new Object[]{hVar})).booleanValue();
            }
            return hVar.l;
        }

        public void b(g gVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("64bb5a57", new Object[]{this, gVar});
            } else if (gVar != null) {
                this.f11486a.add(gVar);
            }
        }

        public int c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("38e7a8a4", new Object[]{this})).intValue();
            }
            return this.h;
        }

        public boolean d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d2d2044e", new Object[]{this})).booleanValue();
            }
            return true ^ this.l;
        }

        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            } else if (this.l) {
                this.l = false;
                g gVar = this.b;
                if (gVar != null) {
                    gVar.a();
                }
                for (g gVar2 : this.f11486a) {
                    gVar2.a();
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.l) {
                if (this.j == 0) {
                    this.j = System.currentTimeMillis();
                } else {
                    int round = this.g - Math.round((this.g - this.h) * this.c.getInterpolation(((float) Math.max(Math.min(((System.currentTimeMillis() - this.j) * 1000) / this.k, 1000L), 0L)) / 1000.0f));
                    this.i = round;
                    PullBase.access$300(this.d, round, this.f);
                }
                if (this.h != this.i) {
                    tdw.a(this.d, this);
                } else {
                    e();
                }
            }
        }
    }

    static {
        t2o.a(632291348);
    }

    public PullBase(Context context) {
        super(context);
        init(context, null);
    }

    public static /* synthetic */ void access$100(PullBase pullBase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8a25e3f", new Object[]{pullBase});
        } else {
            pullBase.callOnReset();
        }
    }

    public static /* synthetic */ void access$200(PullBase pullBase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30d29e1e", new Object[]{pullBase});
        } else {
            pullBase.releaseEvent();
        }
    }

    public static /* synthetic */ void access$300(PullBase pullBase, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83d1f2ee", new Object[]{pullBase, new Integer(i), new Boolean(z)});
        } else {
            pullBase.scrollPullLayoutTo(i, z);
        }
    }

    private void adjustNewPointer(MotionEvent motionEvent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca0527bb", new Object[]{this, motionEvent, new Integer(i)});
            return;
        }
        int pointerId = motionEvent.getPointerId(i);
        this.mActivePointerId = pointerId;
        this.mActivePointerIndex = motionEvent.findPointerIndex(pointerId);
        this.mInitialMotionX += motionEvent.getX(i) - this.mLastMotionX;
        this.mInitialMotionY += motionEvent.getY(i) - this.mLastMotionY;
        this.mLastMotionX = motionEvent.getX(i);
        this.mLastMotionY = motionEvent.getY(i);
    }

    private void callOnPull(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f891d7da", new Object[]{this, new Integer(i)});
            return;
        }
        float maximumPullScroll = (i * 1.0f) / getMaximumPullScroll();
        onPull(this.mCurrentMode, maximumPullScroll, i);
        for (f fVar : this.mOnPullListeners) {
            fVar.a(this, this.mCurrentMode, maximumPullScroll, i);
        }
    }

    private int callOnRelease() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("34ead7e4", new Object[]{this})).intValue();
        }
        int scrollValue = getScrollValue();
        float maximumPullScroll = (scrollValue * 1.0f) / getMaximumPullScroll();
        int onRelease = onRelease(this.mCurrentMode, maximumPullScroll, scrollValue);
        for (f fVar : this.mOnPullListeners) {
            fVar.c(this, this.mCurrentMode, maximumPullScroll, scrollValue);
        }
        return onRelease;
    }

    private void callOnReset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e45f9", new Object[]{this});
            return;
        }
        int scrollValue = getScrollValue();
        float maximumPullScroll = (scrollValue * 1.0f) / getMaximumPullScroll();
        for (f fVar : this.mOnPullListeners) {
            fVar.b(this, this.mCurrentMode, maximumPullScroll, scrollValue);
        }
        onReset(this.mCurrentMode, maximumPullScroll, scrollValue);
    }

    private void callOnScroll(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a08c5792", new Object[]{this, new Integer(i)});
            return;
        }
        for (e eVar : this.mScrollListeners) {
            eVar.a(this, i);
        }
    }

    private void checkChild(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24376977", new Object[]{this, view});
        } else if (view != this.mStartLayout && view != this.mEndLayout) {
            if (getChildCount() > 0 || !(view instanceof v4n)) {
                throw new IllegalStateException("PullBase can host only one direct and PullAdapter child");
            }
        }
    }

    private Interpolator checkReleaseInterpolator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Interpolator) ipChange.ipc$dispatch("244d9b62", new Object[]{this});
        }
        if (this.mReleaseInterpolator == null) {
            this.mReleaseInterpolator = new DecelerateInterpolator();
        }
        return this.mReleaseInterpolator;
    }

    private int checkScrollValue(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b775ac53", new Object[]{this, new Integer(i)})).intValue();
        }
        int maximumPullScroll = getMaximumPullScroll();
        return Math.min(maximumPullScroll, Math.max(-maximumPullScroll, i));
    }

    private void clipPaddingForEditMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d7e035c", new Object[]{this});
        } else {
            setPadding(0, 0, 0, 0);
        }
    }

    private void contentViewAdded(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a78869c9", new Object[]{this, view});
            return;
        }
        v4n v4nVar = (v4n) view;
        this.mContentView = v4nVar;
        onContentViewAdded(this, view);
        if (view instanceof v4n) {
            v4nVar.onPullAdapterAdded(this);
        }
        updateDirection();
    }

    private void contentViewRemoved(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8fee6e9", new Object[]{this, view});
            return;
        }
        this.mContentView = null;
        removeAllPullLayout();
        onContentViewRemoved(this, view);
        if (view instanceof v4n) {
            ((v4n) view).onPullAdapterRemoved(this);
        }
    }

    private float defaultInterpolation(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c07c0506", new Object[]{this, new Float(f2)})).floatValue();
        }
        if (f2 < 0.0f) {
            return -((float) Math.pow(-f2, 0.9090909090909091d));
        }
        return (float) Math.pow(f2, 0.9090909090909091d);
    }

    private void forceStopCurrentSmoothScrollTask() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2adc9013", new Object[]{this});
            return;
        }
        h hVar = this.mCurrentSmoothScrollRunnable;
        if (hVar != null) {
            hVar.e();
            scrollPullLayoutTo(0, false);
        }
    }

    private int generateDragValue() {
        float f2;
        float f3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5ed8e322", new Object[]{this})).intValue();
        }
        if (getPullDirectionInternal() != 1) {
            f3 = this.mInitialMotionY;
            f2 = this.mLastMotionY;
        } else {
            f3 = this.mInitialMotionX;
            f2 = this.mLastMotionX;
        }
        return Math.round(getInterpolation(f3 - f2));
    }

    private float getActiveX(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("71acc8a8", new Object[]{this, motionEvent})).floatValue();
        }
        try {
            return motionEvent.getX(this.mActivePointerIndex);
        } catch (Exception unused) {
            return motionEvent.getX();
        }
    }

    private float getActiveY(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("869590e9", new Object[]{this, motionEvent})).floatValue();
        }
        try {
            return motionEvent.getY(this.mActivePointerIndex);
        } catch (Exception unused) {
            return motionEvent.getY();
        }
    }

    private float getInterpolation(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("22c782db", new Object[]{this, new Float(f2)})).floatValue();
        }
        Interpolator interpolator = this.mPullInterpolator;
        if (interpolator != null) {
            return interpolator.getInterpolation(f2);
        }
        return defaultInterpolation(f2);
    }

    private int getMaximumPullScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("88d9176", new Object[]{this})).intValue();
        }
        if (getPullDirectionInternal() != 1) {
            return Math.round(getHeight() * 1.0f);
        }
        return Math.round(getWidth() * 1.0f);
    }

    private LinearLayout.LayoutParams getPullLayoutParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout.LayoutParams) ipChange.ipc$dispatch("4c0e0d19", new Object[]{this});
        }
        if (getPullDirectionInternal() != 1) {
            return new LinearLayout.LayoutParams(-1, -2);
        }
        return new LinearLayout.LayoutParams(-2, -1);
    }

    private int getPullScrollDuration() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a91196", new Object[]{this})).intValue();
        }
        return SMOOTH_SCROLL_DURATION_MS;
    }

    private void init(Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16013b5d", new Object[]{this, context, attributeSet});
            return;
        }
        this.mOnPullListeners = new ArrayList();
        this.mScrollListeners = new ArrayList();
        setGravity(17);
        this.mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Pull);
        int i = R.styleable.Pull_pullMode;
        if (obtainStyledAttributes.hasValue(i)) {
            this.mMode = Mode.mapIntToValue(obtainStyledAttributes.getInteger(i, Mode.getDefault().getIntValue()));
        }
        this.mStartLayout = createStartPullLayout(context, Mode.PULL_FROM_START, attributeSet);
        this.mEndLayout = createEndPullLayout(context, Mode.PULL_FROM_END, attributeSet);
        obtainStyledAttributes.recycle();
    }

    public static /* synthetic */ Object ipc$super(PullBase pullBase, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1557272881:
                super.onViewRemoved((View) objArr[0]);
                return null;
            case -1556944264:
                super.addView((View) objArr[0], (ViewGroup.LayoutParams) objArr[1]);
                return null;
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -579605410:
                super.addView((View) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case -572887227:
                super.addView((View) objArr[0]);
                return null;
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case 27005610:
                return super.onSaveInstanceState();
            case 80153535:
                super.onRestoreInstanceState((Parcelable) objArr[0]);
                return null;
            case 1361193775:
                super.onViewAdded((View) objArr[0]);
                return null;
            case 1389530587:
                super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            case 1992612095:
                super.addView((View) objArr[0], ((Number) objArr[1]).intValue(), (ViewGroup.LayoutParams) objArr[2]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/ptr/PullBase");
        }
    }

    private boolean isReadyForPull() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe61d7e0", new Object[]{this})).booleanValue();
        }
        if (isReadyForPullEndInternal() || isReadyForPullStartInternal()) {
            return true;
        }
        return false;
    }

    private boolean isReadyForPullEndInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6617eae", new Object[]{this})).booleanValue();
        }
        v4n v4nVar = this.mContentView;
        if (v4nVar != null) {
            return v4nVar.isReadyForPullEnd();
        }
        return false;
    }

    private boolean isReadyForPullStartInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a9cf8f5", new Object[]{this})).booleanValue();
        }
        v4n v4nVar = this.mContentView;
        if (v4nVar != null) {
            return v4nVar.isReadyForPullStart();
        }
        return false;
    }

    private void pullEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3639c95c", new Object[]{this});
            return;
        }
        int generateDragValue = generateDragValue();
        int i = d.$SwitchMap$com$taobao$ptr$PullBase$Mode[this.mCurrentMode.ordinal()];
        if (i == 1) {
            generateDragValue = Math.min(0, generateDragValue);
        } else if (i == 2) {
            generateDragValue = Math.max(0, generateDragValue);
        }
        scrollPullLayoutTo(generateDragValue, true);
    }

    private void refreshContentViewSize(int i, int i2) {
        ViewGroup.LayoutParams layoutParams;
        boolean z = true;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2785a3ab", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        v4n v4nVar = this.mContentView;
        if (v4nVar != null && (layoutParams = ((View) v4nVar).getLayoutParams()) != null && (layoutParams instanceof LinearLayout.LayoutParams)) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            if (i > 0 && layoutParams2.width != i) {
                layoutParams2.width = (i - layoutParams2.leftMargin) - layoutParams2.rightMargin;
                z2 = true;
            }
            if (i2 <= 0 || layoutParams2.height == i2) {
                z = z2;
            } else {
                layoutParams2.height = (i2 - layoutParams2.topMargin) - layoutParams2.bottomMargin;
            }
            if (z) {
                ((View) this.mContentView).setLayoutParams(layoutParams2);
            }
        }
    }

    private void refreshPullViewsSize() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3972a4b6", new Object[]{this});
            return;
        }
        int maximumPullScroll = getMaximumPullScroll();
        int pullDirectionInternal = getPullDirectionInternal();
        if (pullDirectionInternal != 0) {
            if (pullDirectionInternal == 1) {
                if (this.mMode.permitsPullStart()) {
                    this.mStartLayout.setWidth(maximumPullScroll);
                    i4 = -maximumPullScroll;
                } else {
                    i4 = 0;
                }
                if (this.mMode.permitsPullEnd()) {
                    this.mEndLayout.setWidth(maximumPullScroll);
                    i2 = -maximumPullScroll;
                    i5 = i4;
                    i3 = 0;
                    i = 0;
                    setPadding(i5, i3, i2, i);
                }
                i5 = i4;
            }
            i3 = 0;
        } else {
            if (this.mMode.permitsPullStart()) {
                this.mStartLayout.setHeight(maximumPullScroll);
                i3 = -maximumPullScroll;
            } else {
                i3 = 0;
            }
            if (this.mMode.permitsPullEnd()) {
                this.mEndLayout.setHeight(maximumPullScroll);
                i = -maximumPullScroll;
                i2 = 0;
                setPadding(i5, i3, i2, i);
            }
        }
        i2 = 0;
        i = 0;
        setPadding(i5, i3, i2, i);
    }

    private void releaseEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f10d29da", new Object[]{this});
        } else {
            smoothScrollTo(callOnRelease(), allowCheckPullWhenRollBack(), new a());
        }
    }

    private void removeAllPullLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2334ab3", new Object[]{this});
            return;
        }
        if (this == this.mStartLayout.getParent()) {
            removeView(this.mStartLayout);
        }
        if (this == this.mEndLayout.getParent()) {
            removeView(this.mEndLayout);
        }
    }

    private void resetMotionData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e319036", new Object[]{this});
            return;
        }
        this.mActivePointerId = -1;
        this.mActivePointerIndex = 0;
        this.mInitialMotionY = 0.0f;
        this.mLastMotionY = 0.0f;
        this.mInitialMotionX = 0.0f;
        this.mLastMotionX = 0.0f;
    }

    private void resetPullLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47700605", new Object[]{this});
            return;
        }
        removeAllPullLayout();
        LinearLayout.LayoutParams pullLayoutParams = getPullLayoutParams();
        if (this.mMode.permitsPullStart()) {
            super.addView(this.mStartLayout, 0, pullLayoutParams);
        }
        if (this.mMode.permitsPullEnd()) {
            super.addView(this.mEndLayout, pullLayoutParams);
        }
        refreshPullViewsSize();
    }

    private void scrollPullLayoutTo(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7f8c1cf", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        int checkScrollValue = checkScrollValue(i);
        if (z) {
            callOnPull(checkScrollValue);
        }
        callOnScroll(checkScrollValue);
        int pullDirectionInternal = getPullDirectionInternal();
        if (pullDirectionInternal == 0) {
            scrollTo(0, checkScrollValue);
        } else if (pullDirectionInternal == 1) {
            scrollTo(checkScrollValue, 0);
        }
    }

    private void updateMode(Mode mode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("376dee6f", new Object[]{this, mode, new Boolean(z)});
        } else if ((this.mMode != mode || z) && mode != null) {
            this.mMode = mode;
            updateCurrentMode(mode);
            if (!isContentInvalid()) {
                if (isInEditMode()) {
                    clipPaddingForEditMode();
                } else {
                    resetPullLayout();
                }
                onModeUpdated(mode);
            }
        }
    }

    public final void addOnPullListener(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("891f8bfd", new Object[]{this, fVar});
        } else {
            this.mOnPullListeners.add(fVar);
        }
    }

    public void addOnScrollListener(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("320e77ac", new Object[]{this, eVar});
        } else {
            this.mScrollListeners.add(eVar);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddda6f45", new Object[]{this, view});
            return;
        }
        checkChild(view);
        super.addView(view);
    }

    public boolean allowCatchPullEndTouch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a1eda6", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public boolean allowCatchPullStartTouch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69c983f", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public boolean allowCheckPullWhenRollBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c341ac2d", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public PullLayout createEndPullLayout(Context context, Mode mode, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PullLayout) ipChange.ipc$dispatch("aca86d37", new Object[]{this, context, mode, attributeSet});
        }
        return new PullLayout(context, mode, getPullDirectionInternal(), attributeSet);
    }

    public PullLayout createStartPullLayout(Context context, Mode mode, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PullLayout) ipChange.ipc$dispatch("f7b4a0fe", new Object[]{this, context, mode, attributeSet});
        }
        return new PullLayout(context, mode, getPullDirectionInternal(), attributeSet);
    }

    public final Mode getCurrentMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Mode) ipChange.ipc$dispatch("59d5d01b", new Object[]{this});
        }
        return this.mCurrentMode;
    }

    public PullLayout getEndLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PullLayout) ipChange.ipc$dispatch("5855d724", new Object[]{this});
        }
        return this.mEndLayout;
    }

    public final Mode getMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Mode) ipChange.ipc$dispatch("c0b499e8", new Object[]{this});
        }
        return this.mMode;
    }

    public final v4n getPullAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v4n) ipChange.ipc$dispatch("483f3cd4", new Object[]{this});
        }
        return this.mContentView;
    }

    public final int getPullDirectionInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("115905db", new Object[]{this})).intValue();
        }
        v4n v4nVar = this.mContentView;
        if (v4nVar != null) {
            return v4nVar.getPullDirection();
        }
        return 0;
    }

    public final int getPullSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9d4f0bd6", new Object[]{this})).intValue();
        }
        return getMaximumPullScroll();
    }

    public final int getScrollValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("504a56e8", new Object[]{this})).intValue();
        }
        if (getPullDirectionInternal() != 1) {
            return getScrollY();
        }
        return getScrollX();
    }

    public PullLayout getStartLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PullLayout) ipChange.ipc$dispatch("710850ab", new Object[]{this});
        }
        return this.mStartLayout;
    }

    public final boolean isContentInvalid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b4ad5393", new Object[]{this})).booleanValue();
        }
        v4n v4nVar = this.mContentView;
        if (v4nVar == null || !(v4nVar instanceof v4n)) {
            return true;
        }
        return false;
    }

    public final boolean isRunnableScrolling() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e32ab8d9", new Object[]{this})).booleanValue();
        }
        h hVar = this.mCurrentSmoothScrollRunnable;
        if (hVar != null) {
            return h.a(hVar);
        }
        return false;
    }

    public void onContentViewAdded(ViewGroup viewGroup, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c22744b", new Object[]{this, viewGroup, view});
        }
    }

    public void onContentViewRemoved(ViewGroup viewGroup, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6d98d2b", new Object[]{this, viewGroup, view});
        }
    }

    public void onDirectionUpdated(Mode mode, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f21a0f", new Object[]{this, mode, new Integer(i)});
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004e, code lost:
        if (r3 != 3) goto L_0x00eb;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.ptr.PullBase.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public void onModeUpdated(Mode mode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ff9f2", new Object[]{this, mode});
        }
    }

    public void onPull(Mode mode, float f2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("665d0dc0", new Object[]{this, mode, new Float(f2), new Integer(i)});
        }
    }

    public void onPullRestoreInstanceState(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aadf80bb", new Object[]{this, bundle});
        }
    }

    public void onPullSaveInstanceState(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd473072", new Object[]{this, bundle});
        }
    }

    public int onRelease(Mode mode, float f2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d074ac17", new Object[]{this, mode, new Float(f2), new Integer(i)})).intValue();
        }
        return 0;
    }

    public void onReset(Mode mode, float f2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec4151ac", new Object[]{this, mode, new Float(f2), new Integer(i)});
        } else {
            updateCurrentMode(Mode.DISABLED);
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c70bbf", new Object[]{this, parcelable});
        } else if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            super.onRestoreInstanceState(bundle.getParcelable(STATE_SUPER));
            onPullRestoreInstanceState(bundle);
        } else {
            super.onRestoreInstanceState(parcelable);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Parcelable) ipChange.ipc$dispatch("19c12aa", new Object[]{this});
        }
        Bundle bundle = new Bundle();
        onPullSaveInstanceState(bundle);
        bundle.putParcelable(STATE_SUPER, super.onSaveInstanceState());
        return bundle;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (!isContentInvalid()) {
            if (isInEditMode()) {
                clipPaddingForEditMode();
            } else {
                refreshPullViewsSize();
            }
            refreshContentViewSize(i, i2);
            post(new c());
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (isContentInvalid()) {
            return super.onTouchEvent(motionEvent);
        }
        if (isRunnableScrolling()) {
            return false;
        }
        super.onTouchEvent(motionEvent);
        if (motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) {
            return false;
        }
        if (this.mIsBeingDragged) {
            requestDisallowInterceptTouchEvent(true);
        }
        int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 5) {
                            adjustNewPointer(motionEvent, MotionEventCompat.getActionIndex(motionEvent));
                            return true;
                        } else if (actionMasked == 6) {
                            int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
                            if (motionEvent.getPointerId(actionIndex) != this.mActivePointerId) {
                                return true;
                            }
                            if (actionIndex == 0) {
                                i = 1;
                            }
                            adjustNewPointer(motionEvent, i);
                            return true;
                        }
                    }
                } else if (this.mIsBeingDragged) {
                    this.mLastMotionY = getActiveY(motionEvent);
                    this.mLastMotionX = getActiveX(motionEvent);
                    pullEvent();
                    return true;
                }
            }
            this.mIsBeingDragged = false;
            resetMotionData();
            releaseEvent();
        } else if (isReadyForPull()) {
            int pointerId = motionEvent.getPointerId(0);
            this.mActivePointerId = pointerId;
            this.mActivePointerIndex = motionEvent.findPointerIndex(pointerId);
            float y = motionEvent.getY(0);
            this.mInitialMotionY = y;
            this.mLastMotionY = y;
            float x = motionEvent.getX(0);
            this.mInitialMotionX = x;
            this.mLastMotionX = x;
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51222b2f", new Object[]{this, view});
            return;
        }
        super.onViewAdded(view);
        if (view instanceof v4n) {
            contentViewAdded(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a32de6cf", new Object[]{this, view});
            return;
        }
        super.onViewRemoved(view);
        if (view instanceof v4n) {
            contentViewRemoved(view);
        }
    }

    public final void removeOnPullListener(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5f0da20", new Object[]{this, fVar});
        } else {
            this.mOnPullListeners.remove(fVar);
        }
    }

    public void removeOnScrollListener(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d0cf2cf", new Object[]{this, eVar});
        } else {
            this.mScrollListeners.remove(eVar);
        }
    }

    public void setMode(Mode mode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21da6dde", new Object[]{this, mode});
        } else {
            updateMode(mode, false);
        }
    }

    public void setPullInterpolator(Interpolator interpolator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9140a890", new Object[]{this, interpolator});
        } else {
            this.mPullInterpolator = interpolator;
        }
    }

    public void setReleaseInterpolator(Interpolator interpolator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e3607d2", new Object[]{this, interpolator});
        } else {
            this.mReleaseInterpolator = interpolator;
        }
    }

    public final void simulateDrag(int i) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22bb8e4", new Object[]{this, new Integer(i)});
        } else if (!isContentInvalid()) {
            if (i < 0) {
                z = updateCurrentMode(Mode.PULL_FROM_START);
            } else if (i > 0) {
                z = updateCurrentMode(Mode.PULL_FROM_END);
            }
            if (z) {
                smoothScrollTo(i, true, (g) new b());
            }
        }
    }

    public final void smoothScrollTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a600b26", new Object[]{this, new Integer(i)});
        } else {
            smoothScrollTo(i, checkReleaseInterpolator(), getPullScrollDuration(), 0L, false, null);
        }
    }

    public final boolean updateCurrentMode(Mode mode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("29528f70", new Object[]{this, mode})).booleanValue();
        }
        boolean isUnderPermit = this.mMode.isUnderPermit(mode);
        if (isUnderPermit) {
            if (mode == Mode.BOTH) {
                mode = Mode.PULL_FROM_START;
            }
            this.mCurrentMode = mode;
        }
        return isUnderPermit;
    }

    public final void updateDirection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd34fa3d", new Object[]{this});
        } else if (!isContentInvalid()) {
            forceStopCurrentSmoothScrollTask();
            if (getPullDirectionInternal() != 1) {
                setOrientation(1);
            } else {
                setOrientation(0);
            }
            if (isInEditMode()) {
                clipPaddingForEditMode();
            } else {
                resetPullLayout();
            }
            if (this.mMode.permitsPullStart()) {
                this.mStartLayout.updateScrollDirection(this.mMode, getPullDirectionInternal());
            }
            if (this.mMode.permitsPullEnd()) {
                this.mEndLayout.updateScrollDirection(this.mMode, getPullDirectionInternal());
            }
            onDirectionUpdated(this.mMode, getPullDirectionInternal());
        }
    }

    public final void smoothScrollTo(int i, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0ef521b", new Object[]{this, new Integer(i), gVar});
        } else {
            smoothScrollTo(i, checkReleaseInterpolator(), getPullScrollDuration(), 0L, false, gVar);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd73ec5e", new Object[]{this, view, new Integer(i)});
            return;
        }
        checkChild(view);
        super.addView(view, i);
    }

    public final void smoothScrollTo(int i, long j, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4800f53", new Object[]{this, new Integer(i), new Long(j), gVar});
        } else {
            smoothScrollTo(i, checkReleaseInterpolator(), getPullScrollDuration(), j, false, gVar);
        }
    }

    public final void smoothScrollTo(int i, boolean z, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfdcdb63", new Object[]{this, new Integer(i), new Boolean(z), gVar});
        } else {
            smoothScrollTo(i, checkReleaseInterpolator(), getPullScrollDuration(), 0L, z, gVar);
        }
    }

    private void smoothScrollTo(int i, Interpolator interpolator, long j, long j2, boolean z, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d00ac62a", new Object[]{this, new Integer(i), interpolator, new Long(j), new Long(j2), new Boolean(z), gVar});
        } else if (!isContentInvalid()) {
            h hVar = this.mCurrentSmoothScrollRunnable;
            if (hVar != null) {
                if (hVar.d() || this.mCurrentSmoothScrollRunnable.c() != i) {
                    this.mCurrentSmoothScrollRunnable.e();
                } else {
                    this.mCurrentSmoothScrollRunnable.b(gVar);
                    return;
                }
            }
            int scrollValue = getScrollValue();
            if (scrollValue != i) {
                h hVar2 = new h(this, interpolator, scrollValue, i, j, z, gVar);
                this.mCurrentSmoothScrollRunnable = hVar2;
                if (j2 > 0) {
                    postDelayed(hVar2, j2);
                } else {
                    post(hVar2);
                }
            } else if (gVar != null) {
                gVar.a();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a332ea78", new Object[]{this, view, layoutParams});
            return;
        }
        checkChild(view);
        super.addView(view, layoutParams);
    }

    public PullBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76c4d8ff", new Object[]{this, view, new Integer(i), layoutParams});
            return;
        }
        checkChild(view);
        super.addView(view, i, layoutParams);
    }

    public PullBase(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet);
    }
}
