package com.taobao.android.fluid.common.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.videocollection.ICollectionService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.datamodel.RectData;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.ahw;
import tb.d69;
import tb.ir9;
import tb.ngf;
import tb.s6o;
import tb.sz3;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DWPenetrateFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DEFAULT_PENETRATE_ALPHA = 200;
    private static final String TAG = DWPenetrateFrameLayout.class.getSimpleName();
    private boolean mBitmapCacheUpdated;
    private boolean mNeedInterceptTouch;
    private BigDecimal mScreenHeight;
    private BigDecimal mScreenWidth;
    private int mPenetrateAlpha = 200;
    private List<RectData> mChildTrusteeshipTouchRects = new ArrayList();
    private boolean mNeedChildInterceptTouch = false;
    private boolean disableScrollHorizontallyForCollectionPopup = false;

    static {
        t2o.a(468713769);
    }

    public DWPenetrateFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initialize(context);
    }

    private void disAllowIntercept() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("606ad8ae", new Object[]{this});
        } else if (ngf.b()) {
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
        this.mScreenWidth = BigDecimal.valueOf(s6o.v(context));
        this.mScreenHeight = BigDecimal.valueOf(s6o.t(context) - s6o.z(context));
    }

    public static /* synthetic */ Object ipc$super(DWPenetrateFrameLayout dWPenetrateFrameLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -614473710) {
            return new Boolean(super.canScrollHorizontally(((Number) objArr[0]).intValue()));
        }
        if (hashCode == 623593120) {
            super.dispatchDraw((Canvas) objArr[0]);
            return null;
        } else if (hashCode == 2075560917) {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/fluid/common/view/DWPenetrateFrameLayout");
        }
    }

    private void updateBitmapCacheIfNeed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e406904", new Object[]{this});
            return;
        }
        destroyDrawingCache();
        buildDrawingCache();
        this.mBitmapCacheUpdated = false;
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

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            removeAllViews();
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
            this.mBitmapCacheUpdated = true;
        } catch (Throwable th) {
            ir9.b(TAG, th.getMessage());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (ngf.b() && !dispatchTouchEvent) {
            requestDisallowInterceptTouchEvent(false);
        }
        return dispatchTouchEvent;
    }

    public boolean isTouchOnValidArea(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a16cd35", new Object[]{this, motionEvent})).booleanValue();
        }
        return !onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        try {
            int i = this.mPenetrateAlpha;
            if (255 == i) {
                return false;
            }
            if (i == 0) {
                return true;
            }
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x >= 0 && y >= 0) {
                return onInterceptTouch(motionEvent, x, y);
            }
            return true;
        } catch (Throwable th) {
            ir9.b(TAG, th.getMessage());
            return true;
        }
    }

    public void setChildTrusteeshipTouchRect(FluidContext fluidContext, List<RectData> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0dd1613", new Object[]{this, fluidContext, list});
            return;
        }
        this.mChildTrusteeshipTouchRects = list;
        if (((ICollectionService) fluidContext.getService(ICollectionService.class)).isCollectionScene()) {
            for (RectData rectData : this.mChildTrusteeshipTouchRects) {
                float parseFloat = Float.parseFloat(rectData.width);
                float parseFloat2 = Float.parseFloat(rectData.height);
                if (parseFloat == 1.0f && parseFloat2 >= 0.6d) {
                    this.disableScrollHorizontallyForCollectionPopup = true;
                    return;
                }
            }
        }
        this.disableScrollHorizontallyForCollectionPopup = false;
    }

    private boolean onInterceptTouch(MotionEvent motionEvent, int i, int i2) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1905dc9c", new Object[]{this, motionEvent, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (sz3.d(this.mChildTrusteeshipTouchRects) && d69.e()) {
            if (motionEvent.getAction() == 0) {
                this.mNeedChildInterceptTouch = false;
                this.mNeedInterceptTouch = false;
                Iterator<RectData> it = this.mChildTrusteeshipTouchRects.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    RectData next = it.next();
                    BigDecimal bigDecimal = new BigDecimal(getWidth());
                    BigDecimal bigDecimal2 = new BigDecimal(getHeight());
                    String str = TAG;
                    ir9.a(str, "mChildTrusteeshipTouchRects" + next.toString() + ",width:" + bigDecimal + ",height:" + bigDecimal2);
                    BigDecimal multiply = new BigDecimal(next.x).multiply(bigDecimal);
                    BigDecimal multiply2 = new BigDecimal(next.y).multiply(bigDecimal2);
                    BigDecimal multiply3 = new BigDecimal(next.width).multiply(bigDecimal);
                    BigDecimal multiply4 = new BigDecimal(next.height).multiply(bigDecimal2);
                    ir9.a(str, "mChildTrusteeshipTouchRects,converX:" + multiply + ",converY:" + multiply2 + ",converWidth:" + multiply3 + ",converHeight:" + multiply4);
                    float f = (float) i;
                    if (f >= multiply.floatValue() && f < multiply.floatValue() + multiply3.floatValue()) {
                        float f2 = i2;
                        if (f2 >= multiply2.floatValue() && f2 < multiply2.floatValue() + multiply4.floatValue()) {
                            ir9.a(str, "xy在托管区域内");
                            this.mNeedChildInterceptTouch = true;
                            disAllowIntercept();
                            break;
                        }
                    }
                }
            }
            this.mNeedInterceptTouch = !this.mNeedChildInterceptTouch;
            ir9.a(TAG, "mChildTrusteeshipTouchRects,needInterceptTouch：" + this.mNeedInterceptTouch + ",x:" + i + ",y:" + i2);
            return this.mNeedInterceptTouch;
        } else if (d69.e()) {
            if (motionEvent.getAction() == 0) {
                this.mNeedInterceptTouch = false;
                if (255 - ahw.a(this, i, i2) <= this.mPenetrateAlpha) {
                    z = false;
                }
                this.mNeedInterceptTouch = z;
                if (!z) {
                    disAllowIntercept();
                }
            }
            ir9.a(TAG, "onInterceptTouchEvent 优化点击截图方法,event：" + motionEvent.getAction() + ",onIntercept:" + this.mNeedInterceptTouch);
            return this.mNeedInterceptTouch;
        } else {
            if (motionEvent.getAction() == 0) {
                updateBitmapCacheIfNeed();
            }
            Bitmap drawingCache = getDrawingCache();
            if (i <= drawingCache.getWidth() && i2 <= drawingCache.getHeight()) {
                if (255 - Color.alpha(drawingCache.getPixel(i, i2)) <= this.mPenetrateAlpha) {
                    z = false;
                }
                ir9.a(TAG, "onInterceptTouchEvent old,event：" + motionEvent.getAction() + ",onIntercept:" + z);
                if (!z) {
                    disAllowIntercept();
                }
            }
            return z;
        }
    }

    public DWPenetrateFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initialize(context);
    }

    public DWPenetrateFrameLayout(Context context) {
        super(context);
        initialize(context);
    }
}
