package com.taobao.android.detail.ttdetail.widget;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ezo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class HorizontalScrollView extends android.widget.HorizontalScrollView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private a onScrollChangedListener;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface a {
    }

    static {
        t2o.a(912262899);
    }

    public HorizontalScrollView(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(HorizontalScrollView horizontalScrollView, String str, Object... objArr) {
        if (str.hashCode() == 1004220751) {
            super.onScrollChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/widget/HorizontalScrollView");
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bdb314f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onScrollChanged(i, i2, i3, i4);
        a aVar = this.onScrollChangedListener;
        if (aVar != null) {
            ((ezo.a) aVar).a(this, i, i2, i3, i4);
        }
    }

    public void setOnScrollListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90952052", new Object[]{this, aVar});
        } else {
            this.onScrollChangedListener = aVar;
        }
    }
}
