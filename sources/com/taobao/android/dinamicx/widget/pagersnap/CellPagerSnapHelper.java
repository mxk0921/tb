package com.taobao.android.dinamicx.widget.pagersnap;

import android.view.View;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;
import tb.ug3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class CellPagerSnapHelper extends PagerSnapHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ug3 f7456a;
    public ug3 b;

    static {
        t2o.a(444597508);
    }

    public static /* synthetic */ Object ipc$super(CellPagerSnapHelper cellPagerSnapHelper, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/pagersnap/CellPagerSnapHelper");
    }

    public int a(RecyclerView.LayoutManager layoutManager, View view, OrientationHelper orientationHelper) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4b4ae1b0", new Object[]{this, layoutManager, view, orientationHelper})).intValue();
        }
        int decoratedStart = orientationHelper.getDecoratedStart(view) + (orientationHelper.getDecoratedMeasurement(view) / 2);
        if (layoutManager.getClipToPadding()) {
            i = orientationHelper.getStartAfterPadding() + (orientationHelper.getTotalSpace() / 2);
        } else {
            i = (orientationHelper.getEnd() / 2) - ((orientationHelper.getEnd() - orientationHelper.getDecoratedMeasurement(view)) / 2);
        }
        int i2 = decoratedStart - i;
        if (Math.abs(i2) > 1) {
            return i2;
        }
        return 0;
    }

    public OrientationHelper b(RecyclerView.LayoutManager layoutManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OrientationHelper) ipChange.ipc$dispatch("8cf14f43", new Object[]{this, layoutManager});
        }
        ug3 ug3Var = this.b;
        if (ug3Var == null || ug3Var.c() != layoutManager) {
            this.b = ug3.a(layoutManager);
        }
        return this.b.d();
    }

    public OrientationHelper c(RecyclerView.LayoutManager layoutManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OrientationHelper) ipChange.ipc$dispatch("7133d355", new Object[]{this, layoutManager});
        }
        ug3 ug3Var = this.f7456a;
        if (ug3Var == null || ug3Var.c() != layoutManager) {
            this.f7456a = ug3.b(layoutManager);
        }
        return this.f7456a.d();
    }

    @Override // androidx.recyclerview.widget.PagerSnapHelper, androidx.recyclerview.widget.SnapHelper
    public int[] calculateDistanceToFinalSnap(RecyclerView.LayoutManager layoutManager, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("970be339", new Object[]{this, layoutManager, view});
        }
        int[] iArr = new int[2];
        if (layoutManager.canScrollHorizontally()) {
            iArr[0] = a(layoutManager, view, b(layoutManager));
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.canScrollVertically()) {
            iArr[1] = a(layoutManager, view, c(layoutManager));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }
}
