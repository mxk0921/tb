package com.taobao.taolive.adapterimpl.uikit.recyclerview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.feature.features.AbsFeature;
import com.taobao.uikit.feature.features.DragToRefreshFeature;
import com.taobao.uikit.feature.view.TRecyclerView;
import tb.t2o;
import tb.u2d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TBRecyclerView extends TRecyclerView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public u2d mDrag2RefreshListener;
    public DragToRefreshFeature mRefreshFeature;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements DragToRefreshFeature.OnDragToRefreshListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.uikit.feature.features.DragToRefreshFeature.OnDragToRefreshListener
        public void onDragNegative() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7fc0758f", new Object[]{this});
            } else {
                TBRecyclerView.this.getClass();
            }
        }

        @Override // com.taobao.uikit.feature.features.DragToRefreshFeature.OnDragToRefreshListener
        public void onDragPositive() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("75a78153", new Object[]{this});
            } else {
                TBRecyclerView.this.getClass();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements TRecyclerView.OnItemClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AdapterView.OnItemClickListener f12999a;

        public b(TBRecyclerView tBRecyclerView, AdapterView.OnItemClickListener onItemClickListener) {
            this.f12999a = onItemClickListener;
        }

        @Override // com.taobao.uikit.feature.view.TRecyclerView.OnItemClickListener
        public void onItemClick(TRecyclerView tRecyclerView, View view, int i, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c2137596", new Object[]{this, tRecyclerView, view, new Integer(i), new Long(j)});
                return;
            }
            AdapterView.OnItemClickListener onItemClickListener = this.f12999a;
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick(null, view, i, j);
            }
        }
    }

    static {
        t2o.a(779092383);
        t2o.a(806354988);
    }

    public TBRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public static /* synthetic */ Object ipc$super(TBRecyclerView tBRecyclerView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -171420219) {
            super.setOnItemClickListener((TRecyclerView.OnItemClickListener) objArr[0]);
            return null;
        } else if (hashCode == 715434834) {
            return new Boolean(super.addFeature((AbsFeature) objArr[0]));
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/taolive/adapterimpl/uikit/recyclerview/TBRecyclerView");
        }
    }

    public void clearDragable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84f69502", new Object[]{this});
            return;
        }
        DragToRefreshFeature dragToRefreshFeature = this.mRefreshFeature;
        if (dragToRefreshFeature != null) {
            dragToRefreshFeature.setOnDragToRefreshListener(null);
            this.mRefreshFeature = null;
        }
    }

    public void enableNegativeDrag(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4ae2281", new Object[]{this, new Boolean(z)});
            return;
        }
        DragToRefreshFeature dragToRefreshFeature = this.mRefreshFeature;
        if (dragToRefreshFeature != null) {
            dragToRefreshFeature.enableNegativeDrag(z);
        }
    }

    public void enablePositiveDrag(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aebd13d", new Object[]{this, new Boolean(z)});
            return;
        }
        DragToRefreshFeature dragToRefreshFeature = this.mRefreshFeature;
        if (dragToRefreshFeature != null) {
            dragToRefreshFeature.enablePositiveDrag(z);
        }
    }

    public void onDragRefreshComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3e38d08", new Object[]{this});
            return;
        }
        DragToRefreshFeature dragToRefreshFeature = this.mRefreshFeature;
        if (dragToRefreshFeature != null) {
            dragToRefreshFeature.onDragRefreshComplete();
        }
    }

    public void setDragToRefreshListener(u2d u2dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3372f39", new Object[]{this, u2dVar});
        }
    }

    public void setDragable(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea37e4e3", new Object[]{this, context, new Boolean(z)});
            return;
        }
        DragToRefreshFeature dragToRefreshFeature = this.mRefreshFeature;
        if (dragToRefreshFeature == null) {
            DragToRefreshFeature dragToRefreshFeature2 = new DragToRefreshFeature(context, 1);
            this.mRefreshFeature = dragToRefreshFeature2;
            dragToRefreshFeature2.enablePositiveDrag(z);
            this.mRefreshFeature.enableNegativeDrag(z);
            this.mRefreshFeature.setNegativeDragAuto(z);
            this.mRefreshFeature.setOnDragToRefreshListener(new a());
            super.addFeature(this.mRefreshFeature);
            return;
        }
        dragToRefreshFeature.enablePositiveDrag(z);
    }

    public void setNegativeRefreshFinish(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8af52bb6", new Object[]{this, new Boolean(z)});
            return;
        }
        DragToRefreshFeature dragToRefreshFeature = this.mRefreshFeature;
        if (dragToRefreshFeature != null) {
            dragToRefreshFeature.setNegativeRefreshFinish(z);
        }
    }

    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e633b8f", new Object[]{this, onItemClickListener});
        } else {
            super.setOnItemClickListener(new b(this, onItemClickListener));
        }
    }

    public TBRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TBRecyclerView(Context context) {
        this(context, null);
    }
}
