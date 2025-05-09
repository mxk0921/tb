package com.taobao.update.dialog;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class CustomView extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ANDROIDXML = "http://schemas.android.com/apk/res/android";
    public static final String MATERIALDESIGNXML = "http://schemas.android.com/apk/res-auto";
    public int beforeBackground;
    public final int disabledBackgroundColor = Color.parseColor("#E2E2E2");
    public boolean isLastTouch = false;
    public boolean animation = false;

    static {
        t2o.a(947912738);
    }

    public CustomView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static /* synthetic */ Object ipc$super(CustomView customView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1117127205:
                super.onDraw((Canvas) objArr[0]);
                return null;
            case 1269932558:
                super.setEnabled(((Boolean) objArr[0]).booleanValue());
                return null;
            case 1998369028:
                super.onAnimationStart();
                return null;
            case 2083003325:
                super.onAnimationEnd();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/update/dialog/CustomView");
        }
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c281bbd", new Object[]{this});
            return;
        }
        super.onAnimationEnd();
        this.animation = false;
    }

    @Override // android.view.View
    public void onAnimationStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("771cb104", new Object[]{this});
            return;
        }
        super.onAnimationStart();
        this.animation = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        if (this.animation) {
            invalidate();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bb1a20e", new Object[]{this, new Boolean(z)});
            return;
        }
        super.setEnabled(z);
        if (z) {
            setBackgroundColor(this.beforeBackground);
        } else {
            setBackgroundColor(this.disabledBackgroundColor);
        }
        invalidate();
    }
}
