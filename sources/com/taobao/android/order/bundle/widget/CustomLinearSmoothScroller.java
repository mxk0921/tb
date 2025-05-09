package com.taobao.android.order.bundle.widget;

import android.content.Context;
import androidx.recyclerview.widget.LinearSmoothScroller;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class CustomLinearSmoothScroller extends LinearSmoothScroller {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(713031972);
    }

    public CustomLinearSmoothScroller(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(CustomLinearSmoothScroller customLinearSmoothScroller, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/widget/CustomLinearSmoothScroller");
    }

    @Override // androidx.recyclerview.widget.LinearSmoothScroller
    public int calculateDtToFit(int i, int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b808eb6f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)})).intValue();
        }
        return ("end".equals(null) || "right".equals(null)) ? i4 - i2 : ("start".equals(null) || "left".equals(null)) ? i3 - i : (i3 + ((i4 - i3) / 2)) - (i + ((i2 - i) / 2));
    }
}
