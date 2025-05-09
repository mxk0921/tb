package com.taobao.nestedscroll.recyclerview.layoutmanager;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.fjg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class InternalGridLayoutManager extends GridLayoutManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public InternalGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public static /* synthetic */ Object ipc$super(InternalGridLayoutManager internalGridLayoutManager, String str, Object... objArr) {
        if (str.hashCode() == 1951908722) {
            return new Integer(super.scrollVerticallyBy(((Number) objArr[0]).intValue(), (RecyclerView.Recycler) objArr[1], (RecyclerView.State) objArr[2]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/nestedscroll/recyclerview/layoutmanager/InternalGridLayoutManager");
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7457c372", new Object[]{this, new Integer(i), recycler, state})).intValue();
        }
        boolean a2 = fjg.a(null);
        int scrollVerticallyBy = super.scrollVerticallyBy(i, recycler, state);
        fjg.b(null, i, scrollVerticallyBy, a2);
        if (fjg.c(null, i, scrollVerticallyBy) != 0) {
            return 0;
        }
        return scrollVerticallyBy;
    }
}
