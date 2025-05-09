package com.taobao.android.dinamicx.view;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.widget.DXSliderLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import tb.ic5;
import tb.ji6;
import tb.kl6;
import tb.la6;
import tb.t2o;
import tb.zg5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DXNativeAutoLoopRecyclerView extends DXNativeRecyclerView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_NESTED_HORIZONTAL = 1;
    public static final int TYPE_NESTED_NONE = 0;
    public static final int TYPE_NESTED_VERTICAL = 2;
    private boolean autoPlay;
    private int currentIndex;
    private DinamicXEngine dinamicXEngine;
    private int interval;
    private boolean isCanParentTouchWhenEdge_Android;
    private boolean isEnableDetachedStopTimer;
    private DXNativeProgressIndicator mIndicator;
    private int mNestedDirection;
    private b mOnAutoLoopTimerListener;
    private c onPageChangeListener;
    private a runnable;
    private final int MIN_SCROLL_INSTANCE = 10;
    private boolean manualSwitchEnabled = true;
    private boolean needProcessViewLifeCycle = true;
    private boolean enableInfinityEdgeCheck = false;
    private float mCurrentX = 0.0f;
    private float mCurrentY = 0.0f;
    private boolean draged = false;
    private Boolean mIsHorizontalScroll = null;
    private boolean avoidIncessantScroll = false;
    private boolean avoidFirstIncessantScroll = false;
    private boolean needManualStop = false;
    private boolean isTouched = false;
    private int actualCount = 0;
    private boolean isInterceptMultipointTouch = true;
    private boolean isInterceptMultipointLock = false;
    private boolean scrollAble = true;
    private boolean needManualStopLoopOnMove = false;
    private boolean overrideCanScrollHorizontal = false;
    private boolean isEnableHorizontalEdgeCheck = false;
    private boolean isAnimationPlay = false;
    private boolean allowChildSizeLessThanParent = false;
    private int x = 0;
    private boolean stopDispatchUp = false;
    private final BroadcastReceiver mReceiver = new BroadcastReceiver() { // from class: com.taobao.android.dinamicx.view.DXNativeAutoLoopRecyclerView.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/view/DXNativeAutoLoopRecyclerView$1");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            String action = intent.getAction();
            if ("android.intent.action.SCREEN_OFF".equals(action)) {
                DXNativeAutoLoopRecyclerView.this.stopTimer();
            } else if (!"android.intent.action.USER_PRESENT".equals(action)) {
            } else {
                if (DXNativeAutoLoopRecyclerView.this.isShown()) {
                    DXNativeAutoLoopRecyclerView.this.startTimer();
                } else {
                    DXNativeAutoLoopRecyclerView.this.stopTimer();
                }
            }
        }
    };
    public AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements ji6 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<DXNativeAutoLoopRecyclerView> f7350a;
        public final long b = System.currentTimeMillis();
        public String c = "";

        static {
            t2o.a(444597159);
            t2o.a(444597056);
        }

        public a(DXNativeAutoLoopRecyclerView dXNativeAutoLoopRecyclerView) {
            this.f7350a = new WeakReference<>(dXNativeAutoLoopRecyclerView);
        }

        public final int a(RecyclerView recyclerView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("808c5c76", new Object[]{this, recyclerView})).intValue();
            }
            return ((LinearLayoutManager) recyclerView.getLayoutManager()).findFirstVisibleItemPosition();
        }

        public void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("842c4f8c", new Object[]{this, str});
            } else {
                this.c = str;
            }
        }

        @Override // tb.ji6
        public void h() {
            View view;
            View view2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bdbf6212", new Object[]{this});
                return;
            }
            long currentTimeMillis = System.currentTimeMillis() - this.b;
            if (currentTimeMillis <= 10800000 || !zg5.s3()) {
                DXNativeAutoLoopRecyclerView dXNativeAutoLoopRecyclerView = this.f7350a.get();
                if (dXNativeAutoLoopRecyclerView != null) {
                    if (dXNativeAutoLoopRecyclerView.getAvoidIncessantScroll()) {
                        try {
                            int increaseCurrentIndex = dXNativeAutoLoopRecyclerView.increaseCurrentIndex();
                            int a2 = a(dXNativeAutoLoopRecyclerView);
                            int i = increaseCurrentIndex - a2;
                            if (Math.abs(i) > 10) {
                                if (a2 != 0 || DXNativeAutoLoopRecyclerView.access$000(dXNativeAutoLoopRecyclerView) <= 0 || !dXNativeAutoLoopRecyclerView.getAvoidFirstIncessantScroll()) {
                                    dXNativeAutoLoopRecyclerView.scrollToPosition(increaseCurrentIndex);
                                } else {
                                    dXNativeAutoLoopRecyclerView.smoothScrollToPosition(increaseCurrentIndex % DXNativeAutoLoopRecyclerView.access$000(dXNativeAutoLoopRecyclerView));
                                }
                                f fVar = new f("dinamicx");
                                f.a aVar = new f.a("Render", "RENDER_ERROR", 200002);
                                aVar.e = "nextPosition = " + increaseCurrentIndex + ";nowPosition = " + a2 + ";Math.abs(nextPosition - nowPosition) > ： " + i + ";interval = " + DXNativeAutoLoopRecyclerView.access$100(dXNativeAutoLoopRecyclerView) + ";needProcessViewLifeCycle = " + DXNativeAutoLoopRecyclerView.access$200(dXNativeAutoLoopRecyclerView);
                                ((ArrayList) fVar.c).add(aVar);
                            } else if (DXNativeAutoLoopRecyclerView.access$300(dXNativeAutoLoopRecyclerView)) {
                                if (dXNativeAutoLoopRecyclerView.getLayoutManager().findViewByPosition(dXNativeAutoLoopRecyclerView.getCurrentIndex()) != null) {
                                    view = dXNativeAutoLoopRecyclerView.getLayoutManager().findViewByPosition(dXNativeAutoLoopRecyclerView.getCurrentIndex());
                                } else {
                                    view = dXNativeAutoLoopRecyclerView.getLayoutManager().findViewByPosition(dXNativeAutoLoopRecyclerView.getCurrentIndex() % DXNativeAutoLoopRecyclerView.access$000(dXNativeAutoLoopRecyclerView));
                                }
                                dXNativeAutoLoopRecyclerView.smoothScrollBy(view.getWidth(), 0, dXNativeAutoLoopRecyclerView.accelerateDecelerateInterpolator);
                            } else {
                                dXNativeAutoLoopRecyclerView.smoothScrollToPosition(increaseCurrentIndex);
                            }
                        } catch (Throwable th) {
                            la6.d("DXNativeAutoLoopRecyclerView", "DXNativeAutoLoopRecyclerView", "unexpected exception." + th.getMessage());
                        }
                    } else if (DXNativeAutoLoopRecyclerView.access$300(dXNativeAutoLoopRecyclerView)) {
                        if (dXNativeAutoLoopRecyclerView.getLayoutManager().findViewByPosition(dXNativeAutoLoopRecyclerView.getCurrentIndex()) != null) {
                            view2 = dXNativeAutoLoopRecyclerView.getLayoutManager().findViewByPosition(dXNativeAutoLoopRecyclerView.getCurrentIndex());
                        } else {
                            view2 = dXNativeAutoLoopRecyclerView.getLayoutManager().findViewByPosition(dXNativeAutoLoopRecyclerView.getCurrentIndex() % DXNativeAutoLoopRecyclerView.access$000(dXNativeAutoLoopRecyclerView));
                        }
                        dXNativeAutoLoopRecyclerView.smoothScrollBy(view2.getWidth(), 0, dXNativeAutoLoopRecyclerView.accelerateDecelerateInterpolator);
                    } else {
                        dXNativeAutoLoopRecyclerView.smoothScrollToPosition(dXNativeAutoLoopRecyclerView.increaseCurrentIndex());
                    }
                    c onPageChangeListener = dXNativeAutoLoopRecyclerView.getOnPageChangeListener();
                    if (onPageChangeListener != null && !DXNativeAutoLoopRecyclerView.access$300(dXNativeAutoLoopRecyclerView)) {
                        onPageChangeListener.onPageSelected(dXNativeAutoLoopRecyclerView.getCurrentIndex());
                        return;
                    }
                    return;
                }
                return;
            }
            f fVar2 = new f("dinamicx");
            f.a aVar2 = new f.a("Render", "RENDER_WRANING", 200006);
            aVar2.e = "duration " + currentTimeMillis + " tpl " + this.c;
            ((ArrayList) fVar2.c).add(aVar2);
            ic5.p(fVar2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface b {
        void a(int i, DXNativeProgressIndicator dXNativeProgressIndicator);

        void b(int i, DXNativeProgressIndicator dXNativeProgressIndicator);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface c {
        void a(int i);

        void onPageSelected(int i);
    }

    static {
        t2o.a(444597157);
    }

    public DXNativeAutoLoopRecyclerView(Context context) {
        super(context);
        this.mNestedDirection = 0;
        new PagerSnapHelper().attachToRecyclerView(this);
        this.mNestedDirection = 1;
    }

    public static /* synthetic */ int access$000(DXNativeAutoLoopRecyclerView dXNativeAutoLoopRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("29c1ccc4", new Object[]{dXNativeAutoLoopRecyclerView})).intValue();
        }
        return dXNativeAutoLoopRecyclerView.actualCount;
    }

    public static /* synthetic */ int access$100(DXNativeAutoLoopRecyclerView dXNativeAutoLoopRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("62a22d63", new Object[]{dXNativeAutoLoopRecyclerView})).intValue();
        }
        return dXNativeAutoLoopRecyclerView.interval;
    }

    public static /* synthetic */ boolean access$200(DXNativeAutoLoopRecyclerView dXNativeAutoLoopRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b828e13", new Object[]{dXNativeAutoLoopRecyclerView})).booleanValue();
        }
        return dXNativeAutoLoopRecyclerView.needProcessViewLifeCycle;
    }

    public static /* synthetic */ boolean access$300(DXNativeAutoLoopRecyclerView dXNativeAutoLoopRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d462eeb2", new Object[]{dXNativeAutoLoopRecyclerView})).booleanValue();
        }
        return dXNativeAutoLoopRecyclerView.allowChildSizeLessThanParent;
    }

    private DinamicXEngine getDinamicXEngine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicXEngine) ipChange.ipc$dispatch("350fca7f", new Object[]{this});
        }
        return this.dinamicXEngine;
    }

    public static /* synthetic */ Object ipc$super(DXNativeAutoLoopRecyclerView dXNativeAutoLoopRecyclerView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -1339922701:
                super.callParentDisallowInterceptTouchEvent(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).floatValue(), ((Number) objArr[2]).floatValue());
                return null;
            case -614473710:
                return new Boolean(super.canScrollHorizontally(((Number) objArr[0]).intValue()));
            case -461309207:
                super.onWindowVisibilityChanged(((Number) objArr[0]).intValue());
                return null;
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/view/DXNativeAutoLoopRecyclerView");
        }
    }

    private boolean isInfiniteSlider() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab10f4ea", new Object[]{this})).booleanValue();
        }
        return getAdapter() instanceof DXSliderLayout.AutoLoopScrollerAdapter;
    }

    private void refreshCurrentIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60112fdb", new Object[]{this});
        } else if (getLayoutManager() instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) getLayoutManager();
            int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            if (findLastVisibleItemPosition - findFirstVisibleItemPosition <= 1) {
                setCurrentIndex(findFirstVisibleItemPosition);
            } else {
                setCurrentIndex((findFirstVisibleItemPosition + findLastVisibleItemPosition) / 2);
            }
        }
    }

    @Override // com.taobao.android.dinamicx.view.DXNativeRecyclerView
    public void callParentDisallowInterceptTouchEvent(boolean z, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b02266f3", new Object[]{this, new Boolean(z), new Float(f), new Float(f2)});
            return;
        }
        if (z && this.isEnableHorizontalEdgeCheck && f > 0.0f) {
            if (!isInfiniteSlider()) {
                z &= canScrollHorizontally((int) (-f));
            } else if (this.isEnableHorizontalEdgeCheck && this.stopDispatchUp) {
                z = false;
            }
        }
        super.callParentDisallowInterceptTouchEvent(z, f, f2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x00c5, code lost:
        if (r4 != 3) goto L_0x012f;
     */
    @Override // com.taobao.android.dinamicx.view.DXNativeRecyclerView, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r9) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.view.DXNativeAutoLoopRecyclerView.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean getAvoidFirstIncessantScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3a91ea7", new Object[]{this})).booleanValue();
        }
        return this.avoidFirstIncessantScroll;
    }

    public boolean getAvoidIncessantScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a740a59", new Object[]{this})).booleanValue();
        }
        return this.avoidIncessantScroll;
    }

    public int getCurrentIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb85d649", new Object[]{this})).intValue();
        }
        return this.currentIndex;
    }

    public int getInterval() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("34e1135", new Object[]{this})).intValue();
        }
        return this.interval;
    }

    public b getOnAutoLoopTimerListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("de77f08d", new Object[]{this});
        }
        return this.mOnAutoLoopTimerListener;
    }

    public c getOnPageChangeListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("11fd00b9", new Object[]{this});
        }
        return this.onPageChangeListener;
    }

    public int increaseCurrentIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("322f6d35", new Object[]{this})).intValue();
        }
        int i = this.currentIndex + 1;
        this.currentIndex = i;
        return i;
    }

    public boolean isAutoPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("382b6ad8", new Object[]{this})).booleanValue();
        }
        return this.autoPlay;
    }

    public boolean isInterceptMultipointTouch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fc8db03b", new Object[]{this})).booleanValue();
        }
        return this.isInterceptMultipointTouch;
    }

    @Override // com.taobao.android.dinamicx.view.DXNativeRecyclerView
    public boolean isSlider() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c347a1b6", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public boolean isTouched() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e40fa1f", new Object[]{this})).booleanValue();
        }
        return this.isTouched;
    }

    @Override // com.taobao.android.dinamicx.view.DXNativeRecyclerView, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        try {
            super.onAttachedToWindow();
            la6.b("DXNativeAutoLoopRecyclerView onAttachedToWindow" + getCurrentIndex());
            if ((this.needProcessViewLifeCycle || this.isEnableDetachedStopTimer) && this.autoPlay) {
                if (canStartPlay()) {
                    startTimer();
                }
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                intentFilter.addAction("android.intent.action.USER_PRESENT");
                getContext().registerReceiver(this.mReceiver, intentFilter);
                la6.b("DXNativeAutoLoopRecyclerView registerReceiver mReceiver" + this.mReceiver);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.taobao.android.dinamicx.view.DXNativeRecyclerView, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        try {
            super.onDetachedFromWindow();
            la6.b("DXNativeAutoLoopRecyclerView onDetachedFromWindow" + getCurrentIndex());
            if ((this.needProcessViewLifeCycle || this.isEnableDetachedStopTimer) && this.autoPlay) {
                stopTimer();
                getContext().unregisterReceiver(this.mReceiver);
                la6.b("DXNativeAutoLoopRecyclerView unregisterReceiver mReceiver" + this.mReceiver);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.taobao.android.dinamicx.view.DXNativeRecyclerView, androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!this.scrollAble || !this.manualSwitchEnabled) {
            return true;
        }
        if (this.needManualStopLoopOnMove && motionEvent.getAction() != 0) {
            this.isTouched = true;
            stopTimer();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e480fae9", new Object[]{this, new Integer(i)});
            return;
        }
        super.onWindowVisibilityChanged(i);
        la6.b("DXNativeAutoLoopRecyclerView onWindowVisibilityChanged visibility" + i);
        if ((!this.needProcessViewLifeCycle && !this.isEnableDetachedStopTimer) || !this.autoPlay) {
            return;
        }
        if (i == 0) {
            b bVar = this.mOnAutoLoopTimerListener;
            if (bVar != null) {
                bVar.a(this.currentIndex, this.mIndicator);
            }
            startTimer();
            return;
        }
        b bVar2 = this.mOnAutoLoopTimerListener;
        if (bVar2 != null) {
            bVar2.b(this.currentIndex, this.mIndicator);
        }
        stopTimer();
    }

    public void setActualCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf69e85d", new Object[]{this, new Integer(i)});
        } else {
            this.actualCount = i;
        }
    }

    public void setAllowChildSizeLessThanParent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d339b6b3", new Object[]{this, new Boolean(z)});
        } else {
            this.allowChildSizeLessThanParent = z;
        }
    }

    public void setAutoPlay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c396e48", new Object[]{this, new Boolean(z)});
        } else {
            this.autoPlay = z;
        }
    }

    public void setAvoidFirstIncessantScroll(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a798389d", new Object[]{this, new Boolean(z)});
        } else {
            this.avoidFirstIncessantScroll = z;
        }
    }

    public void setAvoidIncessantScroll(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdda4b93", new Object[]{this, new Boolean(z)});
        } else {
            this.avoidIncessantScroll = z;
        }
    }

    public void setCurrentIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90cb73e1", new Object[]{this, new Integer(i)});
        } else {
            this.currentIndex = i;
        }
    }

    public void setDinamicXEngine(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee8ed1c5", new Object[]{this, dinamicXEngine});
        } else {
            this.dinamicXEngine = dinamicXEngine;
        }
    }

    public void setEnableDetachedStopTimer(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5f2f3a1", new Object[]{this, new Boolean(z)});
        } else {
            this.isEnableDetachedStopTimer = z;
        }
    }

    public void setEnableHorizontalEdgeCheck(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c0abab", new Object[]{this, new Boolean(z)});
        } else {
            this.isEnableHorizontalEdgeCheck = z;
        }
    }

    public void setEnableInfinityEdgeCheck(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac44d7ef", new Object[]{this, new Boolean(z)});
        } else {
            this.enableInfinityEdgeCheck = z;
        }
    }

    public void setIndicator(DXNativeProgressIndicator dXNativeProgressIndicator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("454a7883", new Object[]{this, dXNativeProgressIndicator});
        } else {
            this.mIndicator = dXNativeProgressIndicator;
        }
    }

    public void setInterceptMultipointTouch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fdf4545", new Object[]{this, new Boolean(z)});
        } else {
            this.isInterceptMultipointTouch = z;
        }
    }

    public void setInterval(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f94af075", new Object[]{this, new Integer(i)});
        } else {
            this.interval = i;
        }
    }

    public void setIsCanParentTouchWhenEdge_Android(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e45adad5", new Object[]{this, new Boolean(z)});
        } else {
            this.isCanParentTouchWhenEdge_Android = z;
        }
    }

    public void setManualSwitchEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3a3cac8", new Object[]{this, new Boolean(z)});
        } else {
            this.manualSwitchEnabled = z;
        }
    }

    public void setNeedManualStop(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f27cc0d", new Object[]{this, new Boolean(z)});
        } else {
            this.needManualStop = z;
        }
    }

    public void setNeedManualStopLoopOnMove(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("314dba59", new Object[]{this, new Boolean(z)});
        } else {
            this.needManualStopLoopOnMove = z;
        }
    }

    public void setNeedProcessViewLifeCycle(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f95f7bf", new Object[]{this, new Boolean(z)});
        } else {
            this.needProcessViewLifeCycle = z;
        }
    }

    public void setNestedType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33d7b469", new Object[]{this, new Integer(i)});
        } else {
            this.mNestedDirection = i;
        }
    }

    public void setOnAutoLoopTimerListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c1a2fb9", new Object[]{this, bVar});
        } else {
            this.mOnAutoLoopTimerListener = bVar;
        }
    }

    public void setOnPageChangeListener(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b6696ed", new Object[]{this, cVar});
        } else {
            this.onPageChangeListener = cVar;
        }
    }

    public void setOverrideCanScrollHorizontal(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d57d0d7a", new Object[]{this, new Boolean(z)});
        } else {
            this.overrideCanScrollHorizontal = z;
        }
    }

    public void setScrollAble(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a70e6d04", new Object[]{this, new Boolean(z)});
        } else {
            this.scrollAble = z;
        }
    }

    public void setTouched(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e7b9751", new Object[]{this, new Boolean(z)});
        } else {
            this.isTouched = z;
        }
    }

    public void stopTimer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b325b6a", new Object[]{this});
        } else if (this.autoPlay) {
            if (this.dinamicXEngine != null) {
                la6.b("DXNativeAutoLoopRecyclerView stopTimer" + getCurrentIndex());
                this.dinamicXEngine.p1(this.runnable);
                this.runnable = null;
            }
            try {
                la6.b("DXNativeAutoLoopRecyclerView stopTimer   scrollToPosition(getCurrentIndex())" + getCurrentIndex());
                if (this.isAnimationPlay && !this.allowChildSizeLessThanParent) {
                    scrollToPosition(getCurrentIndex());
                }
                b bVar = this.mOnAutoLoopTimerListener;
                if (bVar != null) {
                    bVar.b(getCurrentIndex(), this.mIndicator);
                }
                this.isAnimationPlay = false;
            } catch (Throwable unused) {
                la6.b("DXNativeAutoLoopRecyclerView exception method=stopTimer,action=scrollToPosition,position=" + getCurrentIndex());
            }
        }
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db5fe012", new Object[]{this, new Integer(i)})).booleanValue();
        }
        boolean canScrollHorizontally = super.canScrollHorizontally(i);
        if (!this.overrideCanScrollHorizontal) {
            return canScrollHorizontally;
        }
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (!isInfiniteSlider() || layoutManager == null) {
            z = canScrollHorizontally;
        } else if (!this.enableInfinityEdgeCheck || !this.stopDispatchUp) {
            z = layoutManager.canScrollHorizontally();
        }
        return this.manualSwitchEnabled & z;
    }

    public void startTimer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edfb8b0a", new Object[]{this});
        } else if (this.autoPlay) {
            if (this.runnable == null) {
                this.runnable = new a(this);
                DXWidgetNode b2 = kl6.b(this);
                if ((b2 instanceof DXWidgetNode) && b2.getDXRuntimeContext() != null) {
                    this.runnable.b(b2.getDXRuntimeContext().R());
                }
            }
            if (this.dinamicXEngine != null) {
                la6.b("DXNativeAutoLoopRecyclerView startTimer");
                this.dinamicXEngine.b1(this.runnable, this.interval);
                b bVar = this.mOnAutoLoopTimerListener;
                if (bVar != null) {
                    bVar.a(getCurrentIndex(), this.mIndicator);
                }
                this.isAnimationPlay = true;
            }
        }
    }

    public boolean canStartPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fbf4de51", new Object[]{this})).booleanValue();
        }
        return !this.needManualStop || !this.isTouched;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!this.scrollAble) {
            return false;
        }
        if (this.isInterceptMultipointTouch) {
            return this.manualSwitchEnabled && super.onInterceptTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            this.isInterceptMultipointLock = false;
        } else if (actionMasked == 5) {
            this.isInterceptMultipointLock = true;
        }
        if (this.isInterceptMultipointLock) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
