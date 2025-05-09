package com.taobao.tao.recommend4.recyclerview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.nestedscroll.recyclerview.ChildRecyclerView;
import com.taobao.tao.recommend3.container.RecyclerScrollStateChangeListener;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.bqa;
import tb.fjg;
import tb.lrj;
import tb.t2o;
import tb.wpk;
import tb.z4a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class HomeChildRecyclerView extends ChildRecyclerView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "HomeChildRecyclerView";
    private RecyclerView.Adapter<?> mAdapter;
    private RecyclerView.AdapterDataObserver mAdapterDataObserver;
    private z4a mContainerType;
    private RecommendViewExposureListener mExposureListener;
    private List<wpk> mOnChildRecyclerViewLayoutListeners;
    private RecommendStayTimeListener mStayTimeListener;
    private RecyclerScrollStateChangeListener mRecyclerScrollStateChangeListener = new RecyclerScrollStateChangeListener();
    private int childAttachCount = 0;
    private boolean isDataSetChange = false;
    private final List<a> mDispatchTouchEventListenerList = new CopyOnWriteArrayList();
    private final List<a> mTouchEventListeners = new CopyOnWriteArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface a {
        void onTouchEvent(MotionEvent motionEvent);
    }

    static {
        t2o.a(729810029);
    }

    public HomeChildRecyclerView(Context context) {
        super(context);
    }

    public static /* synthetic */ boolean access$002(HomeChildRecyclerView homeChildRecyclerView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca1483d", new Object[]{homeChildRecyclerView, new Boolean(z)})).booleanValue();
        }
        homeChildRecyclerView.isDataSetChange = z;
        return z;
    }

    private void checkCallbackOnLayoutFinish() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f669aab0", new Object[]{this});
            return;
        }
        if (this.childAttachCount == 0 && getChildCount() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.childAttachCount >= getChildCount() && !z) {
            List<wpk> list = this.mOnChildRecyclerViewLayoutListeners;
            if (list != null && list.size() > 0) {
                for (int i = 0; i < this.mOnChildRecyclerViewLayoutListeners.size(); i++) {
                    wpk wpkVar = this.mOnChildRecyclerViewLayoutListeners.get(i);
                    if (wpkVar != null) {
                        wpkVar.c();
                    }
                }
            }
            this.isDataSetChange = false;
            this.childAttachCount = 0;
        }
    }

    private void checkCallbackOnLayoutStart() {
        List<wpk> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44af7213", new Object[]{this});
        } else if (this.isDataSetChange) {
            if (this.childAttachCount == 1 && (list = this.mOnChildRecyclerViewLayoutListeners) != null && list.size() > 0) {
                for (int i = 0; i < this.mOnChildRecyclerViewLayoutListeners.size(); i++) {
                    wpk wpkVar = this.mOnChildRecyclerViewLayoutListeners.get(i);
                    if (wpkVar != null) {
                        wpkVar.d();
                    }
                }
            }
            this.childAttachCount++;
        }
    }

    private RecyclerView.AdapterDataObserver createAdapterDataObserver() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.AdapterDataObserver) ipChange.ipc$dispatch("d0438736", new Object[]{this});
        }
        return new RecyclerView.AdapterDataObserver() { // from class: com.taobao.tao.recommend4.recyclerview.HomeChildRecyclerView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/recommend4/recyclerview/HomeChildRecyclerView$1");
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onChanged() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ba16f5dc", new Object[]{this});
                } else {
                    HomeChildRecyclerView.access$002(HomeChildRecyclerView.this, true);
                }
            }
        };
    }

    public static /* synthetic */ Object ipc$super(HomeChildRecyclerView homeChildRecyclerView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
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
            case 751707494:
                super.onScrolledByNestedParent((lrj) objArr[0]);
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1626033557:
                super.onAttachedToWindow();
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/recommend4/recyclerview/HomeChildRecyclerView");
        }
    }

    private void notifyTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a0da3a0", new Object[]{this, motionEvent});
        } else if (!this.mTouchEventListeners.isEmpty()) {
            for (a aVar : this.mTouchEventListeners) {
                aVar.onTouchEvent(motionEvent);
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

    public void addDispatchTouchEventListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("863aed2b", new Object[]{this, aVar});
        } else {
            this.mDispatchTouchEventListenerList.add(aVar);
        }
    }

    public void addLayoutListener(wpk wpkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92816b2a", new Object[]{this, wpkVar});
        } else if (wpkVar != null) {
            if (this.mOnChildRecyclerViewLayoutListeners == null) {
                this.mOnChildRecyclerViewLayoutListeners = new CopyOnWriteArrayList();
            }
            this.mOnChildRecyclerViewLayoutListeners.add(wpkVar);
        }
    }

    public void addOnTouchEventListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9e714a6", new Object[]{this, aVar});
        } else {
            this.mTouchEventListeners.add(aVar);
        }
    }

    public void attachExposureListener(RecommendViewExposureListener recommendViewExposureListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f15d00e", new Object[]{this, recommendViewExposureListener});
        } else {
            this.mExposureListener = recommendViewExposureListener;
        }
    }

    public void attachStayTimeListener(RecommendStayTimeListener recommendStayTimeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a77ca53", new Object[]{this, recommendStayTimeListener});
        } else {
            this.mStayTimeListener = recommendStayTimeListener;
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
            if (fjg.a(recyclerView)) {
                recyclerView.requestDisallowInterceptTouchEvent(false);
            } else {
                recyclerView.requestDisallowInterceptTouchEvent(true);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public RecommendViewExposureListener getExposureListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecommendViewExposureListener) ipChange.ipc$dispatch("727584c5", new Object[]{this});
        }
        return this.mExposureListener;
    }

    public void notifyDispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("427cd13a", new Object[]{this, motionEvent});
            return;
        }
        List<a> list = this.mDispatchTouchEventListenerList;
        if (!(list == null || list.isEmpty())) {
            for (a aVar : this.mDispatchTouchEventListenerList) {
                aVar.onTouchEvent(motionEvent);
            }
        }
    }

    @Override // com.taobao.nestedscroll.recyclerview.AbstractRecyclerView, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        RecommendStayTimeListener recommendStayTimeListener = this.mStayTimeListener;
        if (recommendStayTimeListener != null) {
            recommendStayTimeListener.E(this);
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

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        RecommendStayTimeListener recommendStayTimeListener = this.mStayTimeListener;
        if (recommendStayTimeListener != null) {
            recommendStayTimeListener.F();
        }
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

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62ef402d", new Object[]{this, new Integer(i)});
            return;
        }
        super.onScrollStateChanged(i);
        this.mRecyclerScrollStateChangeListener.onScrollStateChanged(this, i);
    }

    @Override // com.taobao.nestedscroll.recyclerview.ChildRecyclerView, com.taobao.nestedscroll.recyclerview.AbstractRecyclerView, tb.jrj
    public void onScrolledByNestedParent(lrj lrjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cce2566", new Object[]{this, lrjVar});
            return;
        }
        super.onScrolledByNestedParent(lrjVar);
        RecommendViewExposureListener recommendViewExposureListener = this.mExposureListener;
        if (recommendViewExposureListener != null) {
            recommendViewExposureListener.onScrollStateChanged(this, 0);
        }
        onScrolledByNestedParentEach(lrjVar);
    }

    public void onScrolledByNestedParentEach(lrj lrjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17d67a07", new Object[]{this, lrjVar});
            return;
        }
        RecommendStayTimeListener recommendStayTimeListener = this.mStayTimeListener;
        if (recommendStayTimeListener != null) {
            recommendStayTimeListener.onScrollStateChanged(this, 0);
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
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e480fae9", new Object[]{this, new Integer(i)});
            return;
        }
        super.onWindowVisibilityChanged(i);
        RecommendStayTimeListener recommendStayTimeListener = this.mStayTimeListener;
        if (recommendStayTimeListener != null) {
            recommendStayTimeListener.G(this, i);
        }
    }

    public void removeDispatchTouchEventListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39f733a8", new Object[]{this, aVar});
            return;
        }
        List<a> list = this.mDispatchTouchEventListenerList;
        if (list != null && !list.isEmpty() && aVar != null) {
            this.mDispatchTouchEventListenerList.remove(aVar);
        }
    }

    public void removeLayoutListener(wpk wpkVar) {
        List<wpk> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6521708d", new Object[]{this, wpkVar});
        } else if (wpkVar != null && (list = this.mOnChildRecyclerViewLayoutListeners) != null) {
            list.remove(wpkVar);
        }
    }

    public void removeOnTouchEventListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68053ce3", new Object[]{this, aVar});
        } else {
            this.mTouchEventListeners.remove(aVar);
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

    public void updateContainerType(z4a z4aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2903cfd1", new Object[]{this, z4aVar});
            return;
        }
        this.mContainerType = z4aVar;
        RecommendStayTimeListener recommendStayTimeListener = this.mStayTimeListener;
        if (recommendStayTimeListener != null) {
            recommendStayTimeListener.L(z4aVar);
        }
    }

    public HomeChildRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HomeChildRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
