package com.taobao.uikit.feature.features;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.feature.callback.CanvasCallback;
import com.taobao.uikit.feature.callback.TouchEventCallback;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ClickDrawableMaskFeature extends AbsFeature<ImageView> implements CanvasCallback, TouchEventCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int mClickMaskColor;
    private boolean mClickMaskEnable;
    private boolean mIsPressed;

    static {
        t2o.a(931135536);
    }

    private void invalidateHost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9b2908a", new Object[]{this});
            return;
        }
        T t = this.mHost;
        if (t != 0) {
            ((ImageView) t).invalidate();
        }
    }

    public static /* synthetic */ Object ipc$super(ClickDrawableMaskFeature clickDrawableMaskFeature, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/feature/features/ClickDrawableMaskFeature");
    }

    private void requestLayoutHost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2de93e8", new Object[]{this});
            return;
        }
        T t = this.mHost;
        if (t != 0) {
            ((ImageView) t).requestLayout();
        }
    }

    @Override // com.taobao.uikit.feature.callback.CanvasCallback
    public void afterDispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84822824", new Object[]{this, canvas});
        }
    }

    @Override // com.taobao.uikit.feature.callback.TouchEventCallback
    public void afterDispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c82badcd", new Object[]{this, motionEvent});
        }
    }

    @Override // com.taobao.uikit.feature.callback.CanvasCallback
    public void afterDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f42b97e", new Object[]{this, canvas});
        }
    }

    @Override // com.taobao.uikit.feature.callback.CanvasCallback
    public void afterOnDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99d9525f", new Object[]{this, canvas});
        }
    }

    @Override // com.taobao.uikit.feature.callback.TouchEventCallback
    public void afterOnTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35369b32", new Object[]{this, motionEvent});
        }
    }

    @Override // com.taobao.uikit.feature.callback.CanvasCallback
    public void beforeDispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8b3e1e1", new Object[]{this, canvas});
        }
    }

    @Override // com.taobao.uikit.feature.callback.TouchEventCallback
    public void beforeDispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f585f570", new Object[]{this, motionEvent});
        }
    }

    @Override // com.taobao.uikit.feature.callback.CanvasCallback
    public void beforeDraw(Canvas canvas) {
        Drawable drawable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6014803b", new Object[]{this, canvas});
        } else if (this.mClickMaskEnable && (drawable = getHost().getDrawable()) != null) {
            drawable.setCallback(null);
            if (this.mIsPressed) {
                drawable.setColorFilter(this.mClickMaskColor, PorterDuff.Mode.SRC_ATOP);
            } else {
                drawable.clearColorFilter();
            }
        }
    }

    @Override // com.taobao.uikit.feature.callback.CanvasCallback
    public void beforeOnDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd545ddc", new Object[]{this, canvas});
        }
    }

    @Override // com.taobao.uikit.feature.callback.TouchEventCallback
    public void beforeOnTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("673c1915", new Object[]{this, motionEvent});
        } else if (this.mClickMaskEnable) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.mIsPressed = true;
                requestLayoutHost();
                invalidateHost();
            } else if (action == 1 || action == 3) {
                this.mIsPressed = false;
                requestLayoutHost();
                invalidateHost();
            }
        }
    }

    @Override // com.taobao.uikit.feature.features.AbsFeature
    public void constructor(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8928939c", new Object[]{this, context, attributeSet, new Integer(i)});
            return;
        }
        this.mClickMaskEnable = true;
        this.mIsPressed = false;
        this.mClickMaskColor = 1996488704;
        if (attributeSet != null && (obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ClickDrawableMaskFeature)) != null) {
            this.mClickMaskColor = obtainStyledAttributes.getColor(R.styleable.ClickDrawableMaskFeature_uik_clickMaskColor, this.mClickMaskColor);
            this.mClickMaskEnable = obtainStyledAttributes.getBoolean(R.styleable.ClickDrawableMaskFeature_uik_clickMaskEnable, true);
            obtainStyledAttributes.recycle();
        }
    }

    public void setClickMaskColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd4881cb", new Object[]{this, new Integer(i)});
            return;
        }
        this.mClickMaskColor = i;
        invalidateHost();
    }

    public void setClickMaskEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ca305d8", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mClickMaskEnable = z;
        invalidateHost();
    }
}
