package com.taobao.android.detail.ttdetail.widget.recycler;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class TTRecyclerView extends RecyclerView {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912263087);
    }

    public TTRecyclerView(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(TTRecyclerView tTRecyclerView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 905566204) {
            super.forceLayout();
            return null;
        } else if (hashCode == 1604649632) {
            super.requestLayout();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/detail/ttdetail/widget/recycler/TTRecyclerView");
        }
    }

    @Override // android.view.View
    public void forceLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35f9d7fc", new Object[]{this});
        } else {
            super.forceLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public void requestLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fa502a0", new Object[]{this});
        } else {
            super.requestLayout();
        }
    }

    public TTRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TTRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
