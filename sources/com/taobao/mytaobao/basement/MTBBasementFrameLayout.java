package com.taobao.mytaobao.basement;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MTBBasementFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int mBasementHeight = 0;

    static {
        t2o.a(745537602);
    }

    public MTBBasementFrameLayout(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(MTBBasementFrameLayout mTBBasementFrameLayout, String str, Object... objArr) {
        if (str.hashCode() == 77186020) {
            super.setLayoutParams((ViewGroup.LayoutParams) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/basement/MTBBasementFrameLayout");
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("499c3e4", new Object[]{this, layoutParams});
            return;
        }
        int i = this.mBasementHeight;
        if (i != 0) {
            layoutParams.height = i;
        }
        super.setLayoutParams(layoutParams);
    }

    public void setParamsWidthAndHeight(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd36f087", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.mBasementHeight = i2;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = i;
            layoutParams.height = i2;
            setLayoutParams(layoutParams);
        }
    }

    public MTBBasementFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MTBBasementFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
