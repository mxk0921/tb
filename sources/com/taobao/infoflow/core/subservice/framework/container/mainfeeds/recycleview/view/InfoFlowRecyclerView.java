package com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.taobao.subservice.biz.padandfolddeviceservice.FoldDeviceAndPadServiceImpl;
import com.taobao.uikit.feature.view.TRecyclerView;
import tb.a9c;
import tb.fve;
import tb.h6c;
import tb.mve;
import tb.sdb;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class InfoFlowRecyclerView extends TRecyclerView implements sdb, ViewTreeObserver.OnGlobalLayoutListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "InfoFlowRecyclerView";
    private int childAttachCount = 1;
    private boolean isDataSetChange = false;
    private boolean isInterceptTouch;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.AdapterDataObserver mAdapterDataObserver;
    private h6c.d mFirstScreenDiffRefreshListener;
    private a9c mGestureDetectorCallback;
    private h6c.b mOnFeedsLayoutListener;
    private h6c.e mWindowVisibilityChangedListener;

    static {
        t2o.a(486539704);
        t2o.a(488636656);
    }

    public InfoFlowRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public static /* synthetic */ boolean access$002(InfoFlowRecyclerView infoFlowRecyclerView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("76eef067", new Object[]{infoFlowRecyclerView, new Boolean(z)})).booleanValue();
        }
        infoFlowRecyclerView.isDataSetChange = z;
        return z;
    }

    public static /* synthetic */ void access$100(InfoFlowRecyclerView infoFlowRecyclerView, int i, InfoFlowRecyclerView infoFlowRecyclerView2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56a32ff9", new Object[]{infoFlowRecyclerView, new Integer(i), infoFlowRecyclerView2});
        } else {
            infoFlowRecyclerView.registerDiffFirstScreenRefreshListener(i, infoFlowRecyclerView2);
        }
    }

    private void checkCallbackOnLayoutStart() {
        h6c.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44af7213", new Object[]{this});
        } else if (this.isDataSetChange) {
            if (this.childAttachCount == 1 && (bVar = this.mOnFeedsLayoutListener) != null) {
                bVar.d();
            }
            this.childAttachCount++;
        }
    }

    private RecyclerView.AdapterDataObserver createAdapterDataObserver(final InfoFlowRecyclerView infoFlowRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.AdapterDataObserver) ipChange.ipc$dispatch("e15578ec", new Object[]{this, infoFlowRecyclerView});
        }
        return new RecyclerView.AdapterDataObserver() { // from class: com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.view.InfoFlowRecyclerView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                if (str.hashCode() == 1882209744) {
                    super.onItemRangeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                    return null;
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/framework/container/mainfeeds/recycleview/view/InfoFlowRecyclerView$1");
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeChanged(int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("70303dd0", new Object[]{this, new Integer(i), new Integer(i2)});
                    return;
                }
                super.onItemRangeChanged(i, i2);
                InfoFlowRecyclerView.access$100(InfoFlowRecyclerView.this, i, infoFlowRecyclerView);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onChanged() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ba16f5dc", new Object[]{this});
                    return;
                }
                InfoFlowRecyclerView.access$002(InfoFlowRecyclerView.this, true);
                fve.e(InfoFlowRecyclerView.TAG, "onChanged");
            }
        };
    }

    public static /* synthetic */ Object ipc$super(InfoFlowRecyclerView infoFlowRecyclerView, String str, Object... objArr) {
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
            case 1978689528:
                super.setAdapter((RecyclerView.Adapter) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/framework/container/mainfeeds/recycleview/view/InfoFlowRecyclerView");
        }
    }

    private void registerAdapterDataObserver(RecyclerView.Adapter adapter) {
        RecyclerView.AdapterDataObserver adapterDataObserver;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b22107b9", new Object[]{this, adapter});
        } else if (adapter != null) {
            try {
                RecyclerView.Adapter adapter2 = this.mAdapter;
                if (!(adapter2 == null || (adapterDataObserver = this.mAdapterDataObserver) == null)) {
                    adapter2.unregisterAdapterDataObserver(adapterDataObserver);
                }
            } catch (IllegalStateException e) {
                fve.c(TAG, "unregisterAdapterDataObserver ", e);
            }
            if (this.mAdapterDataObserver == null) {
                this.mAdapterDataObserver = createAdapterDataObserver(this);
            }
            try {
                adapter.registerAdapterDataObserver(this.mAdapterDataObserver);
            } catch (IllegalStateException e2) {
                fve.c(TAG, "registerAdapterDataObserver ", e2);
            }
            this.mAdapter = adapter;
        }
    }

    private void registerDiffFirstScreenRefreshListener(int i, InfoFlowRecyclerView infoFlowRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80c07d09", new Object[]{this, new Integer(i), infoFlowRecyclerView});
        } else if (i == 0) {
            infoFlowRecyclerView.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }
    }

    @Override // tb.sdb
    public boolean isInterceptTouch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("214f872", new Object[]{this})).booleanValue();
        }
        return this.isInterceptTouch;
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

    @Override // com.taobao.uikit.feature.view.TRecyclerView, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        this.isInterceptTouch = onInterceptTouchEvent;
        return onInterceptTouchEvent;
    }

    @Override // com.taobao.uikit.feature.view.TRecyclerView, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        checkCallbackOnLayoutFinish();
    }

    @Override // com.taobao.uikit.feature.view.TRecyclerView, androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        a9c a9cVar = this.mGestureDetectorCallback;
        if (a9cVar != null) {
            ((FoldDeviceAndPadServiceImpl.f) a9cVar).a(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.taobao.uikit.feature.view.TRecyclerView, androidx.recyclerview.widget.RecyclerView
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
        } else {
            this.mGestureDetectorCallback = a9cVar;
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

    private void checkCallbackOnLayoutFinish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f669aab0", new Object[]{this});
        } else if (this.childAttachCount >= getChildCount()) {
            h6c.b bVar = this.mOnFeedsLayoutListener;
            if (bVar != null) {
                bVar.c();
            }
            this.isDataSetChange = false;
            this.childAttachCount = 0;
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
            return;
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        fve.e(TAG, "onGlobalLayout");
        if (!mve.a("disableNotifyDiffRefresh", false) && this.mFirstScreenDiffRefreshListener != null) {
            fve.e(TAG, "差量刷新完成通知");
            this.mFirstScreenDiffRefreshListener.a();
        }
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

    public InfoFlowRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public InfoFlowRecyclerView(Context context) {
        super(context);
    }
}
