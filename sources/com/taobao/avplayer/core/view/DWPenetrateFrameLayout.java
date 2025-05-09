package com.taobao.avplayer.core.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobaoavsdk.AVSDKLog;
import tb.t2o;
import tb.tfb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class DWPenetrateFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static int DEFAULT_PENETRATE_ALPHA = 0;
    private boolean mBitmapCacheUpdated;
    private int mPenetrateAlpha = DEFAULT_PENETRATE_ALPHA;

    static {
        t2o.a(452985074);
    }

    public DWPenetrateFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initialize(context);
    }

    private void initialize(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dcfb91", new Object[]{this, context});
        } else {
            setLayoutTransition(null);
        }
    }

    public static /* synthetic */ Object ipc$super(DWPenetrateFrameLayout dWPenetrateFrameLayout, String str, Object... objArr) {
        if (str.hashCode() == 623593120) {
            super.dispatchDraw((Canvas) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/core/view/DWPenetrateFrameLayout");
    }

    private void updateBitmapCacheIfNeed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e406904", new Object[]{this});
        } else if (this.mBitmapCacheUpdated) {
            destroyDrawingCache();
            buildDrawingCache();
            this.mBitmapCacheUpdated = false;
        }
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
            AVSDKLog.e(tfb.MODULE_SDK_PAGE, th.getLocalizedMessage());
        }
    }

    public final int getPenetrateAlpha() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ec322946", new Object[]{this})).intValue();
        }
        return this.mPenetrateAlpha;
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
                if (motionEvent.getAction() == 0) {
                    updateBitmapCacheIfNeed();
                }
                Bitmap drawingCache = getDrawingCache();
                if (x <= drawingCache.getWidth() && y <= drawingCache.getHeight()) {
                    if (255 - Color.alpha(drawingCache.getPixel(x, y)) > this.mPenetrateAlpha) {
                        return true;
                    }
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            AVSDKLog.e(tfb.MODULE_SDK_PAGE, th.getLocalizedMessage());
            return true;
        }
    }

    public final void setPenetrateAlpha(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8583384", new Object[]{this, new Integer(i)});
            return;
        }
        if (i > 255) {
            i = 255;
        } else if (i < 0) {
            i = 0;
        }
        this.mPenetrateAlpha = i;
        AVSDKLog.d(tfb.MODULE_SDK_PAGE, "PenetrateFrame.setPenetrateAlpha.penetrateAlpha=" + this.mPenetrateAlpha);
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
