package com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view.rolling;

import android.content.Context;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class DXMeasuredRollingTextView extends TextView {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(486539427);
    }

    public DXMeasuredRollingTextView(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(DXMeasuredRollingTextView dXMeasuredRollingTextView, String str, Object... objArr) {
        if (str.hashCode() == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/base/item/dxservice/impl/dinamic3/view/rolling/DXMeasuredRollingTextView");
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
}
