package com.taobao.android.dinamicx.widget.recycler;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ScrollStaggeredGridLayoutManager extends StaggeredGridLayoutManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final WaterfallLayout f7470a;

    static {
        t2o.a(444597529);
    }

    public ScrollStaggeredGridLayoutManager(int i, int i2, WaterfallLayout waterfallLayout) {
        super(i, i2);
        this.f7470a = waterfallLayout;
    }

    public static /* synthetic */ Object ipc$super(ScrollStaggeredGridLayoutManager scrollStaggeredGridLayoutManager, String str, Object... objArr) {
        if (str.hashCode() == 1951908722) {
            return new Integer(super.scrollVerticallyBy(((Number) objArr[0]).intValue(), (RecyclerView.Recycler) objArr[1], (RecyclerView.State) objArr[2]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/recycler/ScrollStaggeredGridLayoutManager");
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7457c372", new Object[]{this, new Integer(i), recycler, state})).intValue();
        }
        try {
            int scrollVerticallyBy = super.scrollVerticallyBy(i, recycler, state);
            WaterfallLayout waterfallLayout = this.f7470a;
            if (waterfallLayout != null) {
                if (scrollVerticallyBy == 0) {
                    if (i > 0) {
                        waterfallLayout.z(true);
                    } else if (i < 0) {
                        waterfallLayout.A(true);
                    }
                } else if (i != 0) {
                    waterfallLayout.z(false);
                    this.f7470a.A(false);
                }
            }
            return scrollVerticallyBy;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }
}
