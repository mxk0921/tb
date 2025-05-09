package com.taobao.runtimepermission.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MongolianView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String BG_TRANSLUCENT = "#330C0B1C";
    private static final String BG_TRANSPARENT = "#00000000";
    private String mColor;

    public MongolianView(Context context) {
        this(context, null);
    }

    public static /* synthetic */ Object ipc$super(MongolianView mongolianView, String str, Object... objArr) {
        if (str.hashCode() == 623593120) {
            super.dispatchDraw((Canvas) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/runtimepermission/view/MongolianView");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        Paint paint = new Paint();
        paint.setColor(Color.parseColor(this.mColor));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        super.dispatchDraw(canvas);
    }

    public void setTranslucent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97789a9e", new Object[]{this});
        } else {
            this.mColor = BG_TRANSLUCENT;
        }
    }

    public void setTransparent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9775417", new Object[]{this});
        } else {
            this.mColor = BG_TRANSPARENT;
        }
    }

    public MongolianView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.mColor = BG_TRANSLUCENT;
    }

    public MongolianView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mColor = BG_TRANSLUCENT;
    }
}
