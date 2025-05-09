package com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.afterbuy;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.adapter.RecycleViewAdapter;
import com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.adapter.model.ErrorCardModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.taobao.subservice.biz.padandfolddeviceservice.FoldDeviceAndPadServiceImpl;
import com.taobao.nestedscroll.recyclerview.ChildRecyclerView;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.a9c;
import tb.arb;
import tb.bqa;
import tb.fjg;
import tb.fve;
import tb.h6c;
import tb.lrj;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class NestedScrollRecyclerView extends ChildRecyclerView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "NestScrollRecyclerView";
    private RecyclerView.Adapter<?> mAdapter;
    private RecyclerView.AdapterDataObserver mAdapterDataObserver;
    private arb mContainerType;
    private h6c.d mFirstScreenDiffRefreshListener;
    private h6c.b mOnFeedsLayoutListener;
    private h6c.c mOnFeedsScrollListener;
    private h6c.e mWindowVisibilityChangedListener;
    private int childAttachCount = 0;
    private boolean isDataSetChange = false;
    private final List<b> mDispatchTouchEventListenerList = new CopyOnWriteArrayList();
    private final List<b> mTouchEventListeners = new CopyOnWriteArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final a9c f10674a;

        static {
            t2o.a(486539683);
            t2o.a(486539684);
        }

        public a(NestedScrollRecyclerView nestedScrollRecyclerView, a9c a9cVar) {
            this.f10674a = a9cVar;
        }

        @Override // com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.afterbuy.NestedScrollRecyclerView.b
        public void onTouchEvent(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9b14c36", new Object[]{this, motionEvent});
            } else {
                ((FoldDeviceAndPadServiceImpl.f) this.f10674a).a(motionEvent);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface b {
        void onTouchEvent(MotionEvent motionEvent);
    }

    static {
        t2o.a(486539681);
    }

    public NestedScrollRecyclerView(Context context) {
        super(context);
    }

    public static /* synthetic */ boolean access$002(NestedScrollRecyclerView nestedScrollRecyclerView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("df0e43aa", new Object[]{nestedScrollRecyclerView, new Boolean(z)})).booleanValue();
        }
        nestedScrollRecyclerView.isDataSetChange = z;
        return z;
    }

    private void checkCallbackOnLayoutFinish() {
        List<BaseSectionModel> data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f669aab0", new Object[]{this});
            return;
        }
        RecyclerView.Adapter<?> adapter = this.mAdapter;
        if ((adapter instanceof RecycleViewAdapter) && (data = ((RecycleViewAdapter) adapter).getData()) != null && data.size() != 0) {
            if ((getChildCount() != 1 || !(data.get(0) instanceof ErrorCardModel)) && this.childAttachCount >= getChildCount()) {
                h6c.b bVar = this.mOnFeedsLayoutListener;
                if (bVar != null) {
                    bVar.c();
                }
                this.isDataSetChange = false;
                this.childAttachCount = 0;
            }
        }
    }

    private void checkCallbackOnLayoutStart() {
        List<BaseSectionModel> data;
        h6c.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44af7213", new Object[]{this});
        } else if (this.isDataSetChange) {
            RecyclerView.Adapter<?> adapter = this.mAdapter;
            if ((adapter instanceof RecycleViewAdapter) && (data = ((RecycleViewAdapter) adapter).getData()) != null && data.size() != 0) {
                if (getChildCount() != 1 || !(data.get(0) instanceof ErrorCardModel)) {
                    if (this.childAttachCount == 1 && (bVar = this.mOnFeedsLayoutListener) != null) {
                        bVar.d();
                    }
                    this.childAttachCount++;
                }
            }
        }
    }

    private RecyclerView.AdapterDataObserver createAdapterDataObserver() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.AdapterDataObserver) ipChange.ipc$dispatch("d0438736", new Object[]{this});
        }
        return new RecyclerView.AdapterDataObserver() { // from class: com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.afterbuy.NestedScrollRecyclerView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/framework/container/mainfeeds/recycleview/afterbuy/NestedScrollRecyclerView$1");
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onChanged() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ba16f5dc", new Object[]{this});
                } else {
                    NestedScrollRecyclerView.access$002(NestedScrollRecyclerView.this, true);
                }
            }
        };
    }

    public static /* synthetic */ Object ipc$super(NestedScrollRecyclerView nestedScrollRecyclerView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -930159260:
                super.onParentScrollStatusChange(((Number) objArr[0]).intValue());
                return null;
            case -814383425:
                super.onChildAttachedToWindow((View) objArr[0]);
                return null;
            case -461309207:
                super.onWindowVisibilityChanged(((Number) objArr[0]).intValue());
                return null;
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case 339378716:
                super.onParentScrolled(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 751707494:
                super.onScrolledByNestedParent((lrj) objArr[0]);
                return null;
            case 1659846701:
                super.onScrollStateChanged(((Number) objArr[0]).intValue());
                return null;
            case 1978689528:
                super.setAdapter((RecyclerView.Adapter) objArr[0]);
                return null;
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/framework/container/mainfeeds/recycleview/afterbuy/NestedScrollRecyclerView");
        }
    }

    private void notifyTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a0da3a0", new Object[]{this, motionEvent});
        } else if (!this.mTouchEventListeners.isEmpty()) {
            for (b bVar : this.mTouchEventListeners) {
                bVar.onTouchEvent(motionEvent);
            }
        }
    }

    private void registerAdapterDataObserver(RecyclerView.Adapter<?> adapter) {
        RecyclerView.AdapterDataObserver adapterDataObserver;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b22107b9", new Object[]{this, adapter});
        } else if (adapter != null) {
            try {
                RecyclerView.Adapter<?> adapter2 = this.mAdapter;
                if (!(adapter2 == null || (adapterDataObserver = this.mAdapterDataObserver) == null)) {
                    adapter2.unregisterAdapterDataObserver(adapterDataObserver);
                }
            } catch (IllegalStateException e) {
                bqa.b(TAG, "unregisterAdapterDataObserver ", e);
            }
            if (this.mAdapterDataObserver == null) {
                this.mAdapterDataObserver = createAdapterDataObserver();
            }
            try {
                adapter.registerAdapterDataObserver(this.mAdapterDataObserver);
            } catch (IllegalStateException e2) {
                bqa.b(TAG, "registerAdapterDataObserver ", e2);
            }
            this.mAdapter = adapter;
        }
    }

    public void addOnTouchEventListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c13663ed", new Object[]{this, bVar});
        } else {
            this.mTouchEventListeners.add(bVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        notifyDispatchTouchEvent(motionEvent);
        lrj nestedScrollParent = getNestedScrollParent();
        if (nestedScrollParent != null && (nestedScrollParent instanceof RecyclerView)) {
            RecyclerView recyclerView = (RecyclerView) nestedScrollParent;
            if (isChildPartlyAppearInParent(recyclerView)) {
                recyclerView.requestDisallowInterceptTouchEvent(false);
            } else {
                recyclerView.requestDisallowInterceptTouchEvent(true);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void notifyDispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("427cd13a", new Object[]{this, motionEvent});
            return;
        }
        List<b> list = this.mDispatchTouchEventListenerList;
        if (!(list == null || list.isEmpty())) {
            for (b bVar : this.mDispatchTouchEventListenerList) {
                bVar.onTouchEvent(motionEvent);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onChildAttachedToWindow(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf757ebf", new Object[]{this, view});
            return;
        }
        super.onChildAttachedToWindow(view);
        checkCallbackOnLayoutStart();
    }

    @Override // com.taobao.nestedscroll.recyclerview.AbstractRecyclerView, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (motionEvent.getActionMasked() == 0) {
            resetScroll();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        checkCallbackOnLayoutFinish();
    }

    @Override // com.taobao.nestedscroll.recyclerview.ChildRecyclerView, com.taobao.nestedscroll.recyclerview.AbstractRecyclerView, tb.jrj
    public void onParentScrollStatusChange(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c88ee564", new Object[]{this, new Integer(i)});
            return;
        }
        super.onParentScrollStatusChange(i);
        if (i == 0) {
            try {
                if (getScrollState() != 0) {
                    return;
                }
            } catch (Exception unused) {
                fve.e(TAG, "嵌套滚动事件分发异常");
                return;
            }
        }
        this.mOnFeedsScrollListener.onScrollStateChanged(this, i);
    }

    @Override // com.taobao.nestedscroll.recyclerview.ChildRecyclerView, com.taobao.nestedscroll.recyclerview.AbstractRecyclerView, tb.jrj
    public void onParentScrolled(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("143a821c", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.onParentScrolled(i, i2);
        try {
            this.mOnFeedsScrollListener.onScrolled(this, i, i2);
        } catch (Exception unused) {
            fve.e(TAG, "嵌套滚动事件分发异常");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62ef402d", new Object[]{this, new Integer(i)});
        } else {
            super.onScrollStateChanged(i);
        }
    }

    @Override // com.taobao.nestedscroll.recyclerview.ChildRecyclerView, com.taobao.nestedscroll.recyclerview.AbstractRecyclerView, tb.jrj
    public void onScrolledByNestedParent(lrj lrjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cce2566", new Object[]{this, lrjVar});
        } else {
            super.onScrolledByNestedParent(lrjVar);
        }
    }

    @Override // com.taobao.nestedscroll.recyclerview.AbstractRecyclerView, androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        notifyTouchEvent(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e480fae9", new Object[]{this, new Integer(i)});
            return;
        }
        super.onWindowVisibilityChanged(i);
        h6c.e eVar = this.mWindowVisibilityChangedListener;
        if (eVar != null) {
            if (i != 0) {
                z = false;
            }
            eVar.b(z);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.Adapter adapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75f067f8", new Object[]{this, adapter});
            return;
        }
        super.setAdapter(adapter);
        registerAdapterDataObserver(adapter);
    }

    public void setFirstScreenDiffRefreshListener(h6c.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b82a8ff1", new Object[]{this, dVar});
        } else {
            this.mFirstScreenDiffRefreshListener = dVar;
        }
    }

    public void setGestureDetectorCallback(a9c a9cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbc355c2", new Object[]{this, a9cVar});
        } else if (a9cVar != null) {
            addOnTouchEventListener(new a(this, a9cVar));
        }
    }

    public void setOnFeedsLayoutListener(h6c.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad027c20", new Object[]{this, bVar});
        } else {
            this.mOnFeedsLayoutListener = bVar;
        }
    }

    public void setOnWindowVisibilityChangedListener(h6c.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aed65a80", new Object[]{this, eVar});
        } else {
            this.mWindowVisibilityChangedListener = eVar;
        }
    }

    public void setRecyclerViewScrollListener(h6c.c<?> cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ca8d2", new Object[]{this, cVar});
        } else {
            this.mOnFeedsScrollListener = cVar;
        }
    }

    public void updateContainerType(arb arbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60cd8fbf", new Object[]{this, arbVar});
        } else {
            this.mContainerType = arbVar;
        }
    }

    private boolean isChildPartlyAppearInParent(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc7ee9de", new Object[]{this, recyclerView})).booleanValue();
        }
        arb arbVar = this.mContainerType;
        if (arbVar == null) {
            return fjg.a(recyclerView);
        }
        if (!TextUtils.equals(arbVar.getContainerId(), "recommend_my_taobao")) {
            return fjg.a(recyclerView);
        }
        return recyclerView.canScrollVertically(1);
    }

    public NestedScrollRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NestedScrollRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
