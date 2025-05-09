package com.taobao.search.common.uikit;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.HorizontalScrollView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.a07;
import tb.a2a;
import tb.ckf;
import tb.t2o;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class CustomHorizontalScrollView extends HorizontalScrollView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private a2a<? super View, ? super Integer, ? super Integer, ? super Integer, ? super Integer, xhv> onCustomScrollChangeListener;

    static {
        t2o.a(815792196);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomHorizontalScrollView(Context context) {
        this(context, null, 2, null);
        ckf.g(context, "context");
    }

    public static /* synthetic */ Object ipc$super(CustomHorizontalScrollView customHorizontalScrollView, String str, Object... objArr) {
        if (str.hashCode() == 1004220751) {
            super.onScrollChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/common/uikit/CustomHorizontalScrollView");
    }

    public final a2a<View, Integer, Integer, Integer, Integer, xhv> getOnCustomScrollChangeListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a2a) ipChange.ipc$dispatch("5c1d849a", new Object[]{this});
        }
        return this.onCustomScrollChangeListener;
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bdb314f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onScrollChanged(i, i2, i3, i4);
        a2a<? super View, ? super Integer, ? super Integer, ? super Integer, ? super Integer, xhv> a2aVar = this.onCustomScrollChangeListener;
        if (a2aVar != null) {
            a2aVar.invoke(this, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        }
    }

    public final void setOnCustomScrollChangeListener(a2a<? super View, ? super Integer, ? super Integer, ? super Integer, ? super Integer, xhv> a2aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a103ecc", new Object[]{this, a2aVar});
        } else {
            this.onCustomScrollChangeListener = a2aVar;
        }
    }

    public /* synthetic */ CustomHorizontalScrollView(Context context, AttributeSet attributeSet, int i, a07 a07Var) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomHorizontalScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ckf.g(context, "context");
    }
}
