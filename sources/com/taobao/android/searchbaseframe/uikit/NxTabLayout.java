package com.taobao.android.searchbaseframe.uikit;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.android.material.tabs.TabLayout;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class NxTabLayout extends TabLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String LOG_TAG = "SearchTabLayout";
    private int topRadius = 0;
    private final Path path = new Path();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a {
        static {
            t2o.a(993001958);
        }
    }

    static {
        t2o.a(993001957);
    }

    public NxTabLayout(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(NxTabLayout nxTabLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1665133574) {
            super.draw((Canvas) objArr[0]);
            return null;
        } else if (hashCode == 1004220751) {
            super.onScrollChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
            return null;
        } else if (hashCode == 1389530587) {
            super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/searchbaseframe/uikit/NxTabLayout");
        }
    }

    private void updatePath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d5f1215", new Object[]{this});
        } else if (getMeasuredWidth() != 0 && getMeasuredHeight() != 0 && this.topRadius != 0) {
            this.path.reset();
            Path path = this.path;
            RectF rectF = new RectF(getScrollX(), 0.0f, getScrollX() + getMeasuredWidth(), getMeasuredHeight());
            int i = this.topRadius;
            path.addRoundRect(rectF, new float[]{i, i, i, i, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CW);
            invalidate();
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
        } else if (this.topRadius == 0) {
            super.draw(canvas);
        } else {
            canvas.save();
            canvas.clipPath(this.path);
            super.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bdb314f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onScrollChanged(i, i2, i3, i4);
        updatePath();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        updatePath();
    }

    public void setTopRadius(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92d38277", new Object[]{this, new Integer(i)});
            return;
        }
        this.topRadius = i;
        updatePath();
    }

    public NxTabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NxTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
