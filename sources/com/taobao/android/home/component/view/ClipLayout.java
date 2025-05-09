package com.taobao.android.home.component.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.bqa;
import tb.owo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ClipLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean isBgClipRadius = false;
    private boolean isBannerClipRadius = false;
    private boolean isCoverImage = false;
    private int clipLeft = 24;
    private int clipRight = 24;
    private int radius = 27;

    static {
        t2o.a(473956402);
    }

    public ClipLayout(Context context) {
        super(context);
    }

    private void clipCorner(View view, Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f980e9f", new Object[]{this, view, canvas});
        } else if (canvas != null) {
            canvas.isHardwareAccelerated();
            int width = canvas.getWidth();
            int height = canvas.getHeight();
            if (width > 0 && height > 0) {
                Path path = new Path();
                RectF rectF = new RectF(this.clipLeft, 0.0f, width - this.clipRight, height);
                int i = this.radius;
                path.addRoundRect(rectF, new float[]{i, i, i, i, i, i, i, i}, Path.Direction.CW);
                canvas.clipPath(path);
                path.close();
            }
        }
    }

    public static /* synthetic */ Object ipc$super(ClipLayout clipLayout, String str, Object... objArr) {
        if (str.hashCode() == 623593120) {
            super.dispatchDraw((Canvas) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/home/component/view/ClipLayout");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        if (isClipRadius()) {
            clipCorner(this, canvas);
        }
        super.dispatchDraw(canvas);
    }

    public int dp2px(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("88b66f1e", new Object[]{this, new Float(f)})).intValue();
        }
        return (int) ((f * getContext().getResources().getDisplayMetrics().density) + 0.5f);
    }

    public boolean isClipRadius() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c8b7b57", new Object[]{this})).booleanValue();
        }
        if (this.isBannerClipRadius || this.isBgClipRadius) {
            return true;
        }
        return false;
    }

    public boolean isCoverImage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0199a39", new Object[]{this})).booleanValue();
        }
        return this.isCoverImage;
    }

    public void setBannerClipRadius(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("492f305d", new Object[]{this, new Boolean(z)});
        } else if (this.isBannerClipRadius != z) {
            this.isBannerClipRadius = z;
            refreshStatus();
        }
    }

    public void setClipRadius(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11579ba9", new Object[]{this, new Boolean(z)});
        } else if (this.isBgClipRadius != z) {
            this.isBgClipRadius = z;
            refreshStatus();
        }
    }

    public void setCoverImage(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f8d5907", new Object[]{this, new Boolean(z)});
        } else {
            this.isCoverImage = z;
        }
    }

    public void setOnlyRadius(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c23cdfc", new Object[]{this, new Integer(i)});
        } else if (this.radius != i) {
            this.isBgClipRadius = true;
            this.radius = i;
            this.clipLeft = 0;
            this.clipRight = 0;
            invalidate();
        }
    }

    private void refreshStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd50e4b4", new Object[]{this});
            return;
        }
        try {
            if (isClipRadius()) {
                int e = owo.e(getContext(), "9ap", 0);
                this.clipLeft = e;
                this.clipRight = e;
                this.radius = owo.e(getContext(), "12ap", 0);
            }
            requestLayout();
        } catch (Throwable th) {
            bqa.b("ClipLayout", "refreshStatus error", th);
        }
    }

    public ClipLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ClipLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
