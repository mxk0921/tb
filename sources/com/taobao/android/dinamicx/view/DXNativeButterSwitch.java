package com.taobao.android.dinamicx.view;

import android.content.Context;
import android.util.AttributeSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.he5;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DXNativeButterSwitch extends DXNativeSwitch {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private he5 widgetNode;

    static {
        t2o.a(444597166);
    }

    public DXNativeButterSwitch(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(DXNativeButterSwitch dXNativeButterSwitch, String str, Object... objArr) {
        if (str.hashCode() == -244855388) {
            super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/view/DXNativeButterSwitch");
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        he5 he5Var = this.widgetNode;
        if (he5Var != null && he5Var.getLayoutHeight() <= 0) {
            this.widgetNode.w(getContext(), this, getMeasuredHeight());
        }
    }

    public void setWidgetNode(he5 he5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad380c2c", new Object[]{this, he5Var});
        } else {
            this.widgetNode = he5Var;
        }
    }

    public DXNativeButterSwitch(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DXNativeButterSwitch(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
