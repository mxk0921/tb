package com.alibaba.triver.triver_shop.newShop.view.component.nativeview;

import android.content.Context;
import android.graphics.PointF;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class CenterLayoutManager extends LinearLayoutManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f3192a;

    static {
        t2o.a(766509943);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CenterLayoutManager(Context context) {
        super(context);
        ckf.g(context, "context");
        this.f3192a = context;
    }

    public static /* synthetic */ Object ipc$super(CenterLayoutManager centerLayoutManager, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/nativeview/CenterLayoutManager");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a873752a", new Object[]{this, recyclerView, state, new Integer(i)});
            return;
        }
        final Context context = this.f3192a;
        CenterSmoothScroller centerLayoutManager$smoothScrollToPosition$smoothScroller$1 = new CenterSmoothScroller(context) { // from class: com.alibaba.triver.triver_shop.newShop.view.component.nativeview.CenterLayoutManager$smoothScrollToPosition$smoothScroller$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(CenterLayoutManager$smoothScrollToPosition$smoothScroller$1 centerLayoutManager$smoothScrollToPosition$smoothScroller$12, String str, Object... objArr) {
                if (str.hashCode() == -741263064) {
                    return super.computeScrollVectorForPosition(((Number) objArr[0]).intValue());
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/nativeview/CenterLayoutManager$smoothScrollToPosition$smoothScroller$1");
            }

            @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
            public PointF computeScrollVectorForPosition(int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (PointF) ipChange2.ipc$dispatch("d3d13928", new Object[]{this, new Integer(i2)});
                }
                return super.computeScrollVectorForPosition(i2);
            }
        };
        centerLayoutManager$smoothScrollToPosition$smoothScroller$1.setTargetPosition(i);
        startSmoothScroll(centerLayoutManager$smoothScrollToPosition$smoothScroller$1);
    }
}
