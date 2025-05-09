package com.taobao.android.order.bundle.widget.recycle;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.core.OrderConfigs;
import com.taobao.nestedscroll.recyclerview.ParentRecyclerView;
import com.taobao.ptr.views.recycler.accessories.FixedViewAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.jk9;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class OrderRecyclerView extends ParentRecyclerView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private RecyclerView.Adapter adapter;
    public OrderConfigs.BizNameType bizType;
    private View endView;
    private boolean isDisable;
    private boolean isLastMotionInWeex;
    private boolean isRecyclerViewTouchDown;
    private boolean isWeexTouchDown;
    private boolean needDispatchTouchEventToWeex;
    private RecyclerView.OnFlingListener onFlingListener;
    private View.OnTouchListener onTouchListener;
    private ColorStateList textColor;
    private View weexContainer;
    private ArrayList<jk9> startViewInfos = new ArrayList<>();
    private ArrayList<jk9> endViewInfos = new ArrayList<>();
    private boolean enableWeexNestedScroll = false;

    static {
        t2o.a(713032015);
    }

    public OrderRecyclerView(Context context) {
        super(context);
    }

    private int indexOfFixedInfos(List<jk9> list, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8c08fb73", new Object[]{this, list, view})).intValue();
        }
        if (list == null || view == null) {
            return 0;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).a() == view.hashCode()) {
                return i;
            }
        }
        return 0;
    }

    public static /* synthetic */ Object ipc$super(OrderRecyclerView orderRecyclerView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -1228744384:
                return new Boolean(super.canScrollVertically(((Number) objArr[0]).intValue()));
            case 1480138640:
                super.setLayoutManager((RecyclerView.LayoutManager) objArr[0]);
                return null;
            case 1852077959:
                return new Boolean(super.fling(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue()));
            case 1978689528:
                super.setAdapter((RecyclerView.Adapter) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/widget/recycle/OrderRecyclerView");
        }
    }

    private boolean isInWeexContainer() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b54d49dc", new Object[]{this})).booleanValue();
        }
        if (getLayoutManager() instanceof OrderLinearLayoutManager) {
            z = ((OrderLinearLayoutManager) getLayoutManager()).canScrollVertically();
        } else {
            z = true;
        }
        if (this.weexContainer == null || z) {
            return false;
        }
        return true;
    }

    private boolean removeFixedViewInfo(View view, ArrayList<jk9> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee1c5f86", new Object[]{this, view, arrayList})).booleanValue();
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            jk9 jk9Var = arrayList.get(i);
            if (jk9Var.b() == view) {
                if (view.getParent() == this) {
                    removeView(view);
                }
                if (arrayList.remove(i) == jk9Var) {
                    return true;
                }
            }
        }
        return false;
    }

    private void spanStaggeredGridStartEndViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7420474", new Object[]{this});
            return;
        }
        spanStaggeredGridViews(this.startViewInfos);
        spanStaggeredGridViews(this.endViewInfos);
    }

    private void spanStaggeredGridViews(List<jk9> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acb6fc7e", new Object[]{this, list});
            return;
        }
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (list != null && (layoutManager instanceof StaggeredGridLayoutManager)) {
            for (jk9 jk9Var : list) {
                View b = jk9Var.b();
                if (b != null) {
                    ViewGroup.LayoutParams layoutParams = b.getLayoutParams();
                    if (layoutParams == null || !(layoutParams instanceof StaggeredGridLayoutManager.LayoutParams)) {
                        StaggeredGridLayoutManager.LayoutParams layoutParams2 = new StaggeredGridLayoutManager.LayoutParams(-2, -2);
                        layoutParams2.setFullSpan(true);
                        b.setLayoutParams(layoutParams2);
                    } else {
                        ((StaggeredGridLayoutManager.LayoutParams) layoutParams).setFullSpan(true);
                    }
                }
            }
        }
    }

    public void addEndView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("749bffcc", new Object[]{this, view});
        } else if (view != null) {
            this.endViewInfos.add(new jk9(view));
            spanStaggeredGridStartEndViews();
            RecyclerView.Adapter adapter = this.adapter;
            if (adapter != null) {
                if (!(adapter instanceof FixedViewAdapter)) {
                    OrderFixedAdapter orderFixedAdapter = new OrderFixedAdapter(this.startViewInfos, this.endViewInfos, this.adapter, this.bizType);
                    this.adapter = orderFixedAdapter;
                    super.setAdapter(orderFixedAdapter);
                    return;
                }
                adapter.notifyItemInserted(adapter.getItemCount() - 1);
            }
        }
    }

    public void addWeexContainer(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7cec3ac", new Object[]{this, view});
        } else if (view != null) {
            this.weexContainer = view;
            this.enableWeexNestedScroll = true;
        }
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6c2d940", new Object[]{this, new Integer(i)})).booleanValue();
        }
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            return super.canScrollVertically(i);
        }
        if (((LinearLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition() != 0) {
            return super.canScrollVertically(i);
        }
        View findViewByPosition = layoutManager.findViewByPosition(0);
        if (findViewByPosition == null || findViewByPosition.getHeight() != 0) {
            return super.canScrollVertically(i);
        }
        return false;
    }

    @Override // com.taobao.nestedscroll.recyclerview.AbstractRecyclerView, androidx.recyclerview.widget.RecyclerView
    public boolean fling(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e647787", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        RecyclerView.OnFlingListener onFlingListener = this.onFlingListener;
        if (onFlingListener != null) {
            onFlingListener.onFling(i, i2);
        }
        return super.fling(i, i2);
    }

    public final View getEndView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("16948b73", new Object[]{this});
        }
        return this.endView;
    }

    public int getEndViewsCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a5305840", new Object[]{this})).intValue();
        }
        return this.endViewInfos.size();
    }

    public int getStartViewsCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("126b107", new Object[]{this})).intValue();
        }
        return this.startViewInfos.size();
    }

    public boolean hasEndView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("86952009", new Object[]{this, view})).booleanValue();
        }
        if (view == null) {
            return false;
        }
        Iterator<jk9> it = this.endViewInfos.iterator();
        while (it.hasNext()) {
            jk9 next = it.next();
            if (next != null && view == next.b()) {
                return true;
            }
        }
        return false;
    }

    public boolean hasStartView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("476981a2", new Object[]{this, view})).booleanValue();
        }
        if (view == null) {
            return false;
        }
        Iterator<jk9> it = this.startViewInfos.iterator();
        while (it.hasNext()) {
            jk9 next = it.next();
            if (next != null && view == next.b()) {
                return true;
            }
        }
        return false;
    }

    public boolean isDisable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fc8c8fe9", new Object[]{this})).booleanValue();
        }
        return this.isDisable;
    }

    public boolean isDisableIntrinsicPullFeature() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("155fa1b5", new Object[]{this})).booleanValue();
        }
        return isDisable();
    }

    @Override // com.taobao.nestedscroll.recyclerview.AbstractRecyclerView, androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        View.OnTouchListener onTouchListener = this.onTouchListener;
        if (onTouchListener != null) {
            onTouchListener.onTouch(this, motionEvent);
        }
        if (!this.enableWeexNestedScroll) {
            return super.onTouchEvent(motionEvent);
        }
        boolean isInWeexContainer = isInWeexContainer();
        int action = motionEvent.getAction();
        if (this.weexContainer != null && isInWeexContainer) {
            if (!this.isLastMotionInWeex) {
                this.isRecyclerViewTouchDown = false;
                this.isLastMotionInWeex = true;
            }
            if (action == 0) {
                this.isWeexTouchDown = true;
            } else if (action == 2 && !this.isWeexTouchDown) {
                this.needDispatchTouchEventToWeex = true;
                motionEvent.setAction(0);
                this.weexContainer.dispatchTouchEvent(motionEvent);
                this.isWeexTouchDown = true;
                motionEvent.setAction(2);
            } else if (action == 1 || action == 3) {
                this.isWeexTouchDown = false;
                this.needDispatchTouchEventToWeex = false;
                super.onTouchEvent(motionEvent);
                return this.weexContainer.dispatchTouchEvent(motionEvent);
            }
            if (this.needDispatchTouchEventToWeex) {
                return this.weexContainer.dispatchTouchEvent(motionEvent);
            }
        }
        if (this.isLastMotionInWeex && !isInWeexContainer) {
            this.isWeexTouchDown = false;
            if (action == 0) {
                this.isRecyclerViewTouchDown = true;
            } else if (action == 2 && !this.isRecyclerViewTouchDown) {
                this.isRecyclerViewTouchDown = true;
                motionEvent.setAction(1);
                super.onTouchEvent(motionEvent);
                motionEvent.setAction(0);
                super.onTouchEvent(motionEvent);
                motionEvent.setAction(2);
            }
        }
        if (!isInWeexContainer) {
            this.isLastMotionInWeex = false;
        }
        if (action == 1 || action == 3) {
            this.isWeexTouchDown = false;
            this.needDispatchTouchEventToWeex = false;
            this.isRecyclerViewTouchDown = false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void registerOnFlingListener(RecyclerView.OnFlingListener onFlingListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffb46575", new Object[]{this, onFlingListener});
        } else {
            this.onFlingListener = onFlingListener;
        }
    }

    public void registerOnTouchListener(View.OnTouchListener onTouchListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83ed5eca", new Object[]{this, onTouchListener});
        } else {
            this.onTouchListener = onTouchListener;
        }
    }

    public boolean removeAllEndViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("46a9a07b", new Object[]{this})).booleanValue();
        }
        int size = this.endViewInfos.size();
        if (size <= 0) {
            return false;
        }
        RecyclerView.Adapter adapter = this.adapter;
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            if (((FixedViewAdapter) this.adapter).S()) {
                this.adapter.notifyItemRangeRemoved(itemCount - size, size);
                Iterator<jk9> it = this.endViewInfos.iterator();
                while (it.hasNext()) {
                    jk9 next = it.next();
                    if (!(next == null || next.b() == null || next.b().getParent() != this)) {
                        removeView(next.b());
                    }
                }
            }
        }
        this.endViewInfos.clear();
        return true;
    }

    public boolean removeEndView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ce6d073", new Object[]{this, view})).booleanValue();
        }
        if (this.endViewInfos.size() <= 0 || view == null) {
            return false;
        }
        int size = this.endViewInfos.size();
        int indexOfFixedInfos = indexOfFixedInfos(this.endViewInfos, view);
        RecyclerView.Adapter adapter = this.adapter;
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            if (((FixedViewAdapter) this.adapter).U(view)) {
                this.adapter.notifyItemRemoved(itemCount - (size - indexOfFixedInfos));
                if (view.getParent() != this) {
                    return true;
                }
                removeView(view);
                return true;
            }
        }
        if (removeFixedViewInfo(view, this.endViewInfos)) {
            return true;
        }
        return false;
    }

    public void removeWeexContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3d4e1e3", new Object[]{this});
            return;
        }
        this.enableWeexNestedScroll = false;
        this.weexContainer = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.Adapter adapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75f067f8", new Object[]{this, adapter});
            return;
        }
        OrderFixedAdapter orderFixedAdapter = new OrderFixedAdapter(this.startViewInfos, this.endViewInfos, adapter, this.bizType);
        this.adapter = orderFixedAdapter;
        super.setAdapter(orderFixedAdapter);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setLayoutManager(RecyclerView.LayoutManager layoutManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58391f90", new Object[]{this, layoutManager});
            return;
        }
        if (layoutManager != null) {
            if (layoutManager instanceof GridLayoutManager) {
                GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
                gridLayoutManager.setSpanSizeLookup(new OrderGridSpanSizeLookup(this, gridLayoutManager, gridLayoutManager.getSpanSizeLookup()));
            } else if (layoutManager instanceof StaggeredGridLayoutManager) {
                spanStaggeredGridStartEndViews();
            }
        }
        super.setLayoutManager(layoutManager);
    }

    public void unregisterOnFlingListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44cfc4bc", new Object[]{this});
        } else {
            this.onFlingListener = null;
        }
    }

    public void unregisterOnTouchListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c313da1f", new Object[]{this});
        } else {
            this.onTouchListener = null;
        }
    }

    public OrderRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
