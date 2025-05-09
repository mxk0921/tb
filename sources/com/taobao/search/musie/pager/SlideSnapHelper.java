package com.taobao.search.musie.pager;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.core.OrderConfigs;
import tb.ckf;
import tb.f8v;
import tb.t2o;
import tb.xqd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class SlideSnapHelper extends PagerSnapHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final xqd f11591a;
    public OrientationHelper b;
    public RecyclerView c;
    public int d;

    static {
        t2o.a(815792758);
    }

    public SlideSnapHelper(xqd xqdVar) {
        this.f11591a = xqdVar;
    }

    public static /* synthetic */ Object ipc$super(SlideSnapHelper slideSnapHelper, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -259228053) {
            return super.findSnapView((RecyclerView.LayoutManager) objArr[0]);
        }
        if (hashCode == 405322188) {
            super.attachToRecyclerView((RecyclerView) objArr[0]);
            return null;
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/musie/pager/SlideSnapHelper");
    }

    public final int a(View view, OrientationHelper orientationHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c766243", new Object[]{this, view, orientationHelper})).intValue();
        }
        return (orientationHelper.getDecoratedStart(view) - orientationHelper.getStartAfterPadding()) - this.d;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public void attachToRecyclerView(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1828b9cc", new Object[]{this, recyclerView});
            return;
        }
        super.attachToRecyclerView(recyclerView);
        if (recyclerView != null) {
            this.c = recyclerView;
        }
    }

    public final View b(RecyclerView.LayoutManager layoutManager, OrientationHelper orientationHelper) {
        xqd xqdVar;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("d66d967c", new Object[]{this, layoutManager, orientationHelper});
        }
        if (!(layoutManager instanceof LinearLayoutManager)) {
            return super.findSnapView(layoutManager);
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        if (linearLayoutManager.findLastCompletelyVisibleItemPosition() == layoutManager.getItemCount() - 1) {
            z = true;
        }
        if (z && (xqdVar = this.f11591a) != null) {
            xqdVar.onItemSelected(linearLayoutManager.findFirstCompletelyVisibleItemPosition());
        }
        if (findFirstVisibleItemPosition == -1 || z) {
            return null;
        }
        View findViewByPosition = linearLayoutManager.findViewByPosition(findFirstVisibleItemPosition);
        if (orientationHelper.getDecoratedEnd(findViewByPosition) >= orientationHelper.getDecoratedMeasurement(findViewByPosition) / 2 && orientationHelper.getDecoratedEnd(findViewByPosition) > 0) {
            return findViewByPosition;
        }
        if (linearLayoutManager.findLastCompletelyVisibleItemPosition() == layoutManager.getItemCount() - 1) {
            return null;
        }
        return linearLayoutManager.findViewByPosition(findFirstVisibleItemPosition + 1);
    }

    public final OrientationHelper c(RecyclerView.LayoutManager layoutManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OrientationHelper) ipChange.ipc$dispatch("31183020", new Object[]{this, layoutManager});
        }
        if (this.b == null) {
            this.b = OrientationHelper.createHorizontalHelper(layoutManager);
        }
        OrientationHelper orientationHelper = this.b;
        ckf.d(orientationHelper);
        return orientationHelper;
    }

    public final void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f23bf184", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }

    @Override // androidx.recyclerview.widget.PagerSnapHelper, androidx.recyclerview.widget.SnapHelper
    public View findSnapView(RecyclerView.LayoutManager layoutManager) {
        View b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f08c7e6b", new Object[]{this, layoutManager});
        }
        Integer num = null;
        if (!(layoutManager instanceof LinearLayoutManager) || (b = b(layoutManager, c(layoutManager))) == null) {
            return null;
        }
        RecyclerView recyclerView = this.c;
        if (recyclerView != null) {
            RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(b);
            if (childViewHolder != null) {
                num = Integer.valueOf(childViewHolder.getAdapterPosition());
            }
            xqd xqdVar = this.f11591a;
            if (xqdVar != null) {
                xqdVar.onItemSelected(num != null ? num.intValue() : -1);
            }
            return b;
        }
        ckf.y(OrderConfigs.RECYCLERVIEW);
        throw null;
    }

    @Override // androidx.recyclerview.widget.PagerSnapHelper, androidx.recyclerview.widget.SnapHelper
    public int[] calculateDistanceToFinalSnap(RecyclerView.LayoutManager layoutManager, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("970be339", new Object[]{this, layoutManager, view});
        }
        ckf.g(layoutManager, "layoutManager");
        ckf.g(view, f8v.KEY_TARGET_VIEW);
        int[] iArr = new int[2];
        if (layoutManager.canScrollHorizontally()) {
            iArr[0] = a(view, c(layoutManager));
        }
        return iArr;
    }
}
