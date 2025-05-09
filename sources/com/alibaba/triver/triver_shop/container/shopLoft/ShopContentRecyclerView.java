package com.alibaba.triver.triver_shop.container.shopLoft;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.core.OrderConfigs;
import tb.ckf;
import tb.r54;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopContentRecyclerView extends RecyclerView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private a swipeToBottomCallback;
    private b swipeToItemCallback;
    private final PagerSnapHelper pagerSnapHelper = new PagerSnapHelper();
    private final ScrollListener onScrollListener = new ScrollListener(this);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class ScrollListener extends RecyclerView.OnScrollListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f2986a;
        public final /* synthetic */ ShopContentRecyclerView b;

        static {
            t2o.a(766509142);
        }

        public ScrollListener(ShopContentRecyclerView shopContentRecyclerView) {
            ckf.g(shopContentRecyclerView, "this$0");
            this.b = shopContentRecyclerView;
        }

        public static /* synthetic */ Object ipc$super(ScrollListener scrollListener, String str, Object... objArr) {
            if (str.hashCode() == 1361287682) {
                super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/container/shopLoft/ShopContentRecyclerView$ScrollListener");
        }

        public final int b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("948cc9bd", new Object[]{this})).intValue();
            }
            return this.f2986a;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            a swipeToBottomCallback;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
                return;
            }
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                this.b.notifyPositionChanged();
                if (this.b.isSlideToBottom() && (swipeToBottomCallback = this.b.getSwipeToBottomCallback()) != null) {
                    swipeToBottomCallback.a();
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                return;
            }
            ckf.g(recyclerView, OrderConfigs.RECYCLERVIEW);
            int i3 = this.f2986a + i2;
            this.f2986a = i3;
            if (i3 == 0) {
                this.b.stopScroll();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface a {
        void a();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface b {
        void a(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2);

        void b();
    }

    static {
        t2o.a(766509139);
    }

    public ShopContentRecyclerView(Context context) {
        super(context);
        init();
    }

    public static final /* synthetic */ b access$getSwipeToItemCallback$p(ShopContentRecyclerView shopContentRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("bb6d1334", new Object[]{shopContentRecyclerView});
        }
        return shopContentRecyclerView.swipeToItemCallback;
    }

    private final LinearLayoutManager getLinearLayoutManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayoutManager) ipChange.ipc$dispatch("f52cd39e", new Object[]{this});
        }
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return (LinearLayoutManager) layoutManager;
        }
        return null;
    }

    private final void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        addOnScrollListener(this.onScrollListener);
        this.pagerSnapHelper.attachToRecyclerView(this);
    }

    public static /* synthetic */ Object ipc$super(ShopContentRecyclerView shopContentRecyclerView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/container/shopLoft/ShopContentRecyclerView");
    }

    public final ScrollListener getOnScrollListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScrollListener) ipChange.ipc$dispatch("5349e6f8", new Object[]{this});
        }
        return this.onScrollListener;
    }

    public final PagerSnapHelper getPagerSnapHelper() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PagerSnapHelper) ipChange.ipc$dispatch("fdaeefe4", new Object[]{this});
        }
        return this.pagerSnapHelper;
    }

    public final a getSwipeToBottomCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("42b4f7d0", new Object[]{this});
        }
        return this.swipeToBottomCallback;
    }

    public final boolean isSlideToBottom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5043da58", new Object[]{this})).booleanValue();
        }
        if (computeVerticalScrollExtent() + computeVerticalScrollOffset() >= computeVerticalScrollRange()) {
            return true;
        }
        return false;
    }

    public final boolean isSlideToTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3f0c2d7e", new Object[]{this})).booleanValue();
        }
        if (this.onScrollListener.b() == 0) {
            return true;
        }
        return false;
    }

    public final void notifyPositionChanged() {
        View findSnapView;
        int position;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b44e4a49", new Object[]{this});
            return;
        }
        LinearLayoutManager linearLayoutManager = getLinearLayoutManager();
        if (linearLayoutManager != null && (findSnapView = this.pagerSnapHelper.findSnapView(linearLayoutManager)) != null && (position = linearLayoutManager.getPosition(findSnapView)) >= 0) {
            RecyclerView.ViewHolder findViewHolderForLayoutPosition = findViewHolderForLayoutPosition(position);
            b bVar = this.swipeToItemCallback;
            if (bVar != null) {
                bVar.a(null, findViewHolderForLayoutPosition);
            }
            r54.F(new ShopContentRecyclerView$notifyPositionChanged$1(this));
        }
    }

    public final void setSwipeToBottomCallback(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b2e3a00", new Object[]{this, aVar});
        } else {
            this.swipeToBottomCallback = aVar;
        }
    }

    public final void setSwipeToItemCallback(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da2fb970", new Object[]{this, bVar});
        } else {
            this.swipeToItemCallback = bVar;
        }
    }

    public ShopContentRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public ShopContentRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
