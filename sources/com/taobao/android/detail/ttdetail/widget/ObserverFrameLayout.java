package com.taobao.android.detail.ttdetail.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ObserverFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private a mOnSizeChangedListener;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface a {
        void a(int i);
    }

    static {
        t2o.a(912262905);
    }

    public ObserverFrameLayout(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(ObserverFrameLayout observerFrameLayout, String str, Object... objArr) {
        if (str.hashCode() == 1389530587) {
            super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/widget/ObserverFrameLayout");
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
        if (i != 0 && i != i3 && (aVar = this.mOnSizeChangedListener) != null) {
            aVar.a(i);
        }
    }

    public void setOnSizeChangedListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3dbd287", new Object[]{this, aVar});
            return;
        }
        int width = getWidth();
        this.mOnSizeChangedListener = aVar;
        if (aVar != null && width > 0) {
            aVar.a(width);
        }
    }

    public ObserverFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ObserverFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
