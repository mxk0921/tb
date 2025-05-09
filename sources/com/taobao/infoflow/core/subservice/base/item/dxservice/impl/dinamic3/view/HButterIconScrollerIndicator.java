package com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class HButterIconScrollerIndicator extends HIconScrollerIndicator {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean flag = false;

    static {
        t2o.a(486539399);
    }

    public HButterIconScrollerIndicator(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(HButterIconScrollerIndicator hButterIconScrollerIndicator, String str, Object... objArr) {
        if (str.hashCode() == -244855388) {
            super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/base/item/dxservice/impl/dinamic3/view/HButterIconScrollerIndicator");
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        if (!this.flag) {
            setRadius((float) (getMeasuredHeight() * 0.5d));
            initIndicatorView(getMeasuredWidth(), getMeasuredHeight());
            this.flag = true;
        }
    }
}
