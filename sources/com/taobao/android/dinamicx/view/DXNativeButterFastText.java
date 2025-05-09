package com.taobao.android.dinamicx.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;
import tb.xd5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DXNativeButterFastText extends DXNativeFastText {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private xd5 widgetNode;

    static {
        t2o.a(444597165);
    }

    public DXNativeButterFastText(Context context) {
        this(context, null);
    }

    public static /* synthetic */ Object ipc$super(DXNativeButterFastText dXNativeButterFastText, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        } else if (hashCode == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/dinamicx/view/DXNativeButterFastText");
        }
    }

    @Override // com.taobao.android.dinamicx.view.DXNativeFastText, android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        this.staticLayout = this.widgetNode.getStaticLayout();
        setTranslateY(this.widgetNode.u());
        setTranslateX(this.widgetNode.t());
        super.onDraw(canvas);
    }

    @Override // com.taobao.android.dinamicx.view.DXNativeFastText, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        xd5 xd5Var = this.widgetNode;
        if (xd5Var == null) {
            super.onMeasure(i, i2);
            return;
        }
        xd5Var.onMeasure(i, i2);
        setMeasuredDimension(this.widgetNode.getMeasuredWidthAndState(), this.widgetNode.getMeasuredHeightAndState());
    }

    public void setWidgetNode(xd5 xd5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ed3c657", new Object[]{this, xd5Var});
        } else {
            this.widgetNode = xd5Var;
        }
    }

    public DXNativeButterFastText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DXNativeButterFastText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
