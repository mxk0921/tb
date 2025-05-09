package com.taobao.android.dinamicx.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;
import tb.wd5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DXNativeButterCheckBox extends AppCompatCheckBox {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private wd5 widgetNode;

    static {
        t2o.a(444597164);
    }

    public DXNativeButterCheckBox(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(DXNativeButterCheckBox dXNativeButterCheckBox, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -244855388) {
            super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
            return null;
        } else if (hashCode == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/dinamicx/view/DXNativeButterCheckBox");
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        wd5 wd5Var = this.widgetNode;
        if (wd5Var != null) {
            if (wd5Var.getLayoutWidth() <= 0 || this.widgetNode.getLayoutHeight() <= 0) {
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                if (measuredWidth <= 0 || measuredHeight <= 0) {
                    setButtonDrawable((Drawable) null);
                } else {
                    this.widgetNode.v(this, measuredWidth, measuredHeight);
                }
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            super.onMeasure(i, i2);
        }
    }

    public void setWidgetNode(wd5 wd5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28866c9d", new Object[]{this, wd5Var});
        } else {
            this.widgetNode = wd5Var;
        }
    }

    public DXNativeButterCheckBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DXNativeButterCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
