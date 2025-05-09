package com.taobao.android.dinamicx.view;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.f;
import java.util.ArrayList;
import tb.ic5;
import tb.rh5;
import tb.t2o;
import tb.xv5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DXScrollLinearLayoutManager extends DXLinearLayoutManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final float b = 160.0f;
    public float c = 1.0f;

    static {
        t2o.a(444597193);
    }

    public DXScrollLinearLayoutManager(Context context, int i, boolean z) {
        super(context, i, z);
    }

    public static /* synthetic */ Object ipc$super(DXScrollLinearLayoutManager dXScrollLinearLayoutManager, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/view/DXScrollLinearLayoutManager");
    }

    public static /* synthetic */ float z(DXScrollLinearLayoutManager dXScrollLinearLayoutManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8ebdd0b0", new Object[]{dXScrollLinearLayoutManager})).floatValue();
        }
        return dXScrollLinearLayoutManager.c;
    }

    public void A(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3d0ea92", new Object[]{this, new Integer(i)});
        } else if (i == 0) {
            this.c = 1.0f;
        } else {
            this.c = this.b / i;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, com.alibaba.android.ultron.ext.vlayout.b
    public void measureChildWithMargins(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e27560a", new Object[]{this, view, new Integer(i), new Integer(i2)});
            return;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        view.measure(RecyclerView.LayoutManager.getChildMeasureSpec(getWidth(), getWidthMode(), 0, ((ViewGroup.MarginLayoutParams) layoutParams).width, canScrollHorizontally()), RecyclerView.LayoutManager.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + i2, ((ViewGroup.MarginLayoutParams) layoutParams).height, canScrollVertically()));
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a873752a", new Object[]{this, recyclerView, state, new Integer(i)});
            return;
        }
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext()) { // from class: com.taobao.android.dinamicx.view.DXScrollLinearLayoutManager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                if (str.hashCode() == -1299653488) {
                    return new Integer(super.calculateTimeForScrolling(((Number) objArr[0]).intValue()));
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/view/DXScrollLinearLayoutManager$1");
            }

            @Override // androidx.recyclerview.widget.LinearSmoothScroller
            public int calculateDtToFit(int i2, int i3, int i4, int i5, int i6) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("b808eb6f", new Object[]{this, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)})).intValue();
                }
                if (i6 == -1) {
                    return i4 - i2;
                }
                if (i6 == 0) {
                    return i4 - i2;
                }
                if (i6 != 1) {
                    return 0;
                }
                return i5 - i3;
            }

            @Override // androidx.recyclerview.widget.LinearSmoothScroller
            public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("bbeb1cb2", new Object[]{this, displayMetrics})).floatValue();
                }
                return DXScrollLinearLayoutManager.z(DXScrollLinearLayoutManager.this);
            }

            @Override // androidx.recyclerview.widget.LinearSmoothScroller
            public int calculateTimeForScrolling(int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("b288dc90", new Object[]{this, new Integer(i2)})).intValue();
                }
                return super.calculateTimeForScrolling(i2);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
            public PointF computeScrollVectorForPosition(int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (PointF) ipChange2.ipc$dispatch("d3d13928", new Object[]{this, new Integer(i2)});
                }
                return DXScrollLinearLayoutManager.this.computeScrollVectorForPosition(i2);
            }
        };
        try {
            linearSmoothScroller.setTargetPosition(i);
            startSmoothScroll(linearSmoothScroller);
        } catch (Throwable th) {
            f fVar = new f(rh5.c);
            f.a aVar = new f.a("native", "native_crash", f.DX_NATIVE_CRASH_15);
            aVar.e = rh5.a() + "_trace: " + xv5.a(th);
            ((ArrayList) fVar.c).add(aVar);
            ic5.p(fVar);
        }
    }
}
