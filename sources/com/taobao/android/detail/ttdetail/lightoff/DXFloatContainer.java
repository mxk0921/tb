package com.taobao.android.detail.ttdetail.lightoff;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.lightoff.LightOffLayerManger;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class DXFloatContainer extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public a mOnSizeChangeListener;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface a {
    }

    static {
        t2o.a(912262052);
    }

    public DXFloatContainer(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(DXFloatContainer dXFloatContainer, String str, Object... objArr) {
        if (str.hashCode() == 1389530587) {
            super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/lightoff/DXFloatContainer");
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        if ((i2 != i4 || i != i3) && (aVar = this.mOnSizeChangeListener) != null) {
            ((LightOffLayerManger.a) aVar).a(i, i2);
        }
    }

    public void setOnSizeChangeListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("774e9108", new Object[]{this, aVar});
        } else {
            this.mOnSizeChangeListener = aVar;
        }
    }

    public DXFloatContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DXFloatContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
