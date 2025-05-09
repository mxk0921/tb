package com.taobao.live.home.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class DWPenetrateFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean mBitmapCacheUpdated;
    private boolean mForceBitmapCacheUpdated;
    private int mPenetrateAlpha = DEFAULT_PENETRATE_ALPHA;
    private static final String TAG = DWPenetrateFrameLayout.class.getSimpleName();
    private static int DEFAULT_PENETRATE_ALPHA = 200;

    static {
        t2o.a(806355508);
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
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/live/home/view/DWPenetrateFrameLayout");
    }

    private void updateBitmapCacheIfNeed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e406904", new Object[]{this});
        } else if (this.mBitmapCacheUpdated || this.mForceBitmapCacheUpdated) {
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
        } catch (Throwable unused) {
        }
    }

    public final int getPenetrateAlpha() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ec322946", new Object[]{this})).intValue();
        }
        return this.mPenetrateAlpha;
    }

    public Bitmap getViewBitmap(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("f535cd5f", new Object[]{this, view});
        }
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Bitmap bitmap;
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
                if (drawingCache == null) {
                    drawingCache = getViewBitmap(this);
                    bitmap = drawingCache;
                } else {
                    bitmap = null;
                }
                if (drawingCache != null && x <= drawingCache.getWidth() && y <= drawingCache.getHeight()) {
                    int pixel = drawingCache.getPixel(x, y);
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                    if (255 - Color.alpha(pixel) > this.mPenetrateAlpha) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return true;
        } catch (Throwable unused) {
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
    }

    public void updateDrawingCache(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c2005e0", new Object[]{this, new Boolean(z)});
        } else {
            this.mForceBitmapCacheUpdated = z;
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
