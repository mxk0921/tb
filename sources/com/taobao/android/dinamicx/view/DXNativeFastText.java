package com.taobao.android.dinamicx.view;

import android.content.Context;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DXNativeFastText extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public StaticLayout staticLayout;
    private float translateX;
    private float translateY;

    static {
        t2o.a(444597171);
    }

    public DXNativeFastText(Context context) {
        this(context, null);
    }

    public static /* synthetic */ Object ipc$super(DXNativeFastText dXNativeFastText, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        } else if (hashCode == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/dinamicx/view/DXNativeFastText");
        }
    }

    public StaticLayout getStaticLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StaticLayout) ipChange.ipc$dispatch("5b0b5d8c", new Object[]{this});
        }
        return this.staticLayout;
    }

    public float getTranslateY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b1db2cb8", new Object[]{this})).floatValue();
        }
        return this.translateY;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(this.translateX, this.translateY);
        StaticLayout staticLayout = this.staticLayout;
        if (staticLayout != null) {
            staticLayout.draw(canvas);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            super.onMeasure(i, i2);
        }
    }

    public void setStaticLayout(StaticLayout staticLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3e0e606", new Object[]{this, staticLayout});
        } else {
            this.staticLayout = staticLayout;
        }
    }

    public void setTranslateX(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("beac94cd", new Object[]{this, new Float(f)});
        } else {
            this.translateX = f;
        }
    }

    public void setTranslateY(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0616d6c", new Object[]{this, new Float(f)});
        } else {
            this.translateY = f;
        }
    }

    public DXNativeFastText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DXNativeFastText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
