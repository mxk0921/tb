package com.taobao.android.fluid.framework.card.cards.web;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.data.datamodel.RectData;
import java.math.BigDecimal;
import tb.ir9;
import tb.ngf;
import tb.t2o;
import tb.yyw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class WebPenetrateFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DOUBLE_TAP_TIMEOUT = ViewConfiguration.getDoubleTapTimeout();
    private static final String TAG = "[webcomponent_layout]";
    private RectData mChildTrusteeshipTouchRects;
    private boolean mDisableTouch;
    private boolean mNeedInterceptTouch;
    private yyw mWebCardClickListener;
    private final b mOnClickRunnable = new b();
    private boolean mNeedChildInterceptTouch = false;
    private boolean disableScrollHorizontallyForCollectionPopup = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private float f7796a;
        private float b;

        static {
            t2o.a(468714119);
        }

        private b() {
        }

        public static /* synthetic */ float a(b bVar, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5048f7d0", new Object[]{bVar, new Float(f)})).floatValue();
            }
            bVar.f7796a = f;
            return f;
        }

        public static /* synthetic */ float b(b bVar, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("80002bd1", new Object[]{bVar, new Float(f)})).floatValue();
            }
            bVar.b = f;
            return f;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (WebPenetrateFrameLayout.access$300(WebPenetrateFrameLayout.this) != null) {
                ir9.a(WebPenetrateFrameLayout.TAG, "video card WebCard.ClickRunnable ");
                WebPenetrateFrameLayout.access$300(WebPenetrateFrameLayout.this).a(this.f7796a, this.b);
            }
        }
    }

    static {
        t2o.a(468714117);
    }

    public WebPenetrateFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initialize(context);
    }

    public static /* synthetic */ yyw access$300(WebPenetrateFrameLayout webPenetrateFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yyw) ipChange.ipc$dispatch("6f2df4cf", new Object[]{webPenetrateFrameLayout});
        }
        return webPenetrateFrameLayout.mWebCardClickListener;
    }

    private void disAllowIntercept() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("606ad8ae", new Object[]{this});
        } else {
            requestDisallowInterceptTouchEvent(true);
        }
    }

    private void initialize(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dcfb91", new Object[]{this, context});
            return;
        }
        setLayoutTransition(null);
        ir9.a(TAG, "initialize,清空mChildTrusteeshipTouchRects");
        this.mChildTrusteeshipTouchRects = null;
    }

    public static /* synthetic */ Object ipc$super(WebPenetrateFrameLayout webPenetrateFrameLayout, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -614473710:
                return new Boolean(super.canScrollHorizontally(((Number) objArr[0]).intValue()));
            case 623593120:
                super.dispatchDraw((Canvas) objArr[0]);
                return null;
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/card/cards/web/WebPenetrateFrameLayout");
        }
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db5fe012", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (!this.disableScrollHorizontallyForCollectionPopup || ngf.b()) {
            return super.canScrollHorizontally(i);
        }
        return true;
    }

    public void clearChildTouchRect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d177a23b", new Object[]{this});
            return;
        }
        ir9.b(TAG, "清空clearChildTouchRect");
        this.mChildTrusteeshipTouchRects = null;
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            removeAllViews();
        }
    }

    public void disableTouch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59e90c56", new Object[]{this, new Boolean(z)});
        } else {
            this.mDisableTouch = z;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        try {
            super.dispatchDraw(canvas);
        } catch (Throwable th) {
            ir9.b(TAG, th.getMessage());
        }
    }

    public boolean isTouchOnValidArea(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a16cd35", new Object[]{this, motionEvent})).booleanValue();
        }
        return !onInterceptTouchEvent(motionEvent);
    }

    public void setChildTrusteeshipTouchRect(RectData rectData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22802b85", new Object[]{this, rectData});
            return;
        }
        if (rectData == null) {
            rectData = new RectData();
            rectData.x = String.valueOf(0);
            rectData.y = String.valueOf(0);
            rectData.width = String.valueOf(getWidth());
            rectData.height = String.valueOf(getHeight());
        }
        this.mChildTrusteeshipTouchRects = rectData;
        this.disableScrollHorizontallyForCollectionPopup = true;
    }

    public void setWebCardClickListener(yyw yywVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3ece5b", new Object[]{this, yywVar});
        } else {
            this.mWebCardClickListener = yywVar;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        ir9.a(TAG, "分发触摸事件，action: " + motionEvent.getAction() + "，x: " + motionEvent.getX() + "，y: " + motionEvent.getY());
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (!dispatchTouchEvent) {
            requestDisallowInterceptTouchEvent(false);
        }
        return dispatchTouchEvent;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        ir9.a(TAG, "判断是否拦截触摸事件，action: " + motionEvent.getAction() + "，x: " + motionEvent.getX() + "，y: " + motionEvent.getY());
        try {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (x >= 0.0f && y >= 0.0f) {
                return onInterceptTouch(motionEvent, x, y);
            }
            return true;
        } catch (Throwable th) {
            ir9.b(TAG, th.getMessage());
            return true;
        }
    }

    private boolean isInRects(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("324c4b2b", new Object[]{this, new Float(f), new Float(f2)})).booleanValue();
        }
        RectData rectData = this.mChildTrusteeshipTouchRects;
        ir9.a(TAG, "mChildTrusteeshipTouchRects" + rectData.toString());
        BigDecimal bigDecimal = new BigDecimal(rectData.x);
        BigDecimal bigDecimal2 = new BigDecimal(rectData.y);
        BigDecimal bigDecimal3 = new BigDecimal(rectData.width);
        BigDecimal bigDecimal4 = new BigDecimal(rectData.height);
        ir9.a(TAG, "mChildTrusteeshipTouchRects,converX:" + bigDecimal + ",converY:" + bigDecimal2 + ",converWidth:" + bigDecimal3 + ",converHeight:" + bigDecimal4);
        if (f < bigDecimal.floatValue() || f >= bigDecimal.floatValue() + bigDecimal3.floatValue() || f2 < bigDecimal2.floatValue() || f2 >= bigDecimal2.floatValue() + bigDecimal4.floatValue()) {
            return false;
        }
        ir9.a(TAG, "xy在区域内");
        return true;
    }

    private boolean onInterceptTouch(MotionEvent motionEvent, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1904743c", new Object[]{this, motionEvent, new Float(f), new Float(f2)})).booleanValue();
        }
        if (this.mChildTrusteeshipTouchRects == null) {
            return true;
        }
        if (motionEvent.getAction() == 0) {
            this.mNeedChildInterceptTouch = false;
            this.mNeedInterceptTouch = false;
            if (isInRects(f, f2)) {
                ir9.a(TAG, "xy在web托管区域内");
                this.mNeedChildInterceptTouch = true;
                disAllowIntercept();
            }
        }
        this.mNeedInterceptTouch = !this.mNeedChildInterceptTouch;
        ir9.a(TAG, "mChildTrusteeshipTouchRects,needInterceptTouch：" + this.mNeedInterceptTouch + ",x:" + f + ",y:" + f2);
        return this.mNeedInterceptTouch;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.mDisableTouch) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 1) {
            if (!isTouchOnValidArea(motionEvent)) {
                b.a(this.mOnClickRunnable, motionEvent.getX());
                b.b(this.mOnClickRunnable, motionEvent.getY());
                ir9.a(TAG, "video card WebCard.MotionEvent.ACTION_UP ");
                if (this.mWebCardClickListener != null) {
                    ir9.a(TAG, "video card WebCard.Click回调 ");
                    this.mWebCardClickListener.a(motionEvent.getX(), motionEvent.getY());
                }
            }
            requestDisallowInterceptTouchEvent(false);
        } else if (action == 3) {
            requestDisallowInterceptTouchEvent(false);
        }
        return true;
    }

    public WebPenetrateFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initialize(context);
    }

    public WebPenetrateFrameLayout(Context context) {
        super(context);
        initialize(context);
    }
}
