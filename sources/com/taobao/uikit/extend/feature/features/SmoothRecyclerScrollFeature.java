package com.taobao.uikit.extend.feature.features;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.feature.callback.RecyclerAdapterCallback;
import com.taobao.uikit.feature.features.AbsFeature;
import com.taobao.uikit.feature.view.TImageView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class SmoothRecyclerScrollFeature extends AbsFeature<RecyclerView> implements RecyclerAdapterCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class InnerScrollListener extends RecyclerView.OnScrollListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int mLastScrollState = 0;

        public InnerScrollListener() {
        }

        public static /* synthetic */ Object ipc$super(InnerScrollListener innerScrollListener, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/extend/feature/features/SmoothRecyclerScrollFeature$InnerScrollListener");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
                return;
            }
            if (i == 0 || (1 == i && 2 == this.mLastScrollState)) {
                SmoothRecyclerScrollFeature.access$000(SmoothRecyclerScrollFeature.this, recyclerView);
            }
            this.mLastScrollState = i;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class SmoothAdapter extends RecyclerView.Adapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private RecyclerView.Adapter mDelegateAdapter;

        public SmoothAdapter(RecyclerView.Adapter adapter) {
            this.mDelegateAdapter = adapter;
            super.setHasStableIds(adapter.hasStableIds());
        }

        public static /* synthetic */ Object ipc$super(SmoothAdapter smoothAdapter, String str, Object... objArr) {
            if (str.hashCode() == -1614840632) {
                super.setHasStableIds(((Boolean) objArr[0]).booleanValue());
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/extend/feature/features/SmoothRecyclerScrollFeature$SmoothAdapter");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
            }
            return this.mDelegateAdapter.getItemCount();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue();
            }
            return this.mDelegateAdapter.getItemId(i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
            }
            return this.mDelegateAdapter.getItemViewType(i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aa17accb", new Object[]{this, viewHolder, new Integer(i)});
                return;
            }
            if (2 != SmoothRecyclerScrollFeature.this.getHost().getScrollState()) {
                SmoothRecyclerScrollFeature.access$000(SmoothRecyclerScrollFeature.this, viewHolder.itemView);
            } else {
                SmoothRecyclerScrollFeature.access$100(SmoothRecyclerScrollFeature.this, viewHolder.itemView);
            }
            this.mDelegateAdapter.onBindViewHolder(viewHolder, i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("9e3c0169", new Object[]{this, viewGroup, new Integer(i)});
            }
            return this.mDelegateAdapter.onCreateViewHolder(viewGroup, i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("76ede27e", new Object[]{this, viewHolder});
            } else {
                this.mDelegateAdapter.onViewAttachedToWindow(viewHolder);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("19acd87b", new Object[]{this, viewHolder});
            } else {
                this.mDelegateAdapter.onViewDetachedFromWindow(viewHolder);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("891ac20", new Object[]{this, viewHolder});
            } else {
                this.mDelegateAdapter.onViewRecycled(viewHolder);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void registerAdapterDataObserver(RecyclerView.AdapterDataObserver adapterDataObserver) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("544ebd79", new Object[]{this, adapterDataObserver});
            } else {
                this.mDelegateAdapter.registerAdapterDataObserver(adapterDataObserver);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void unregisterAdapterDataObserver(RecyclerView.AdapterDataObserver adapterDataObserver) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3dceb252", new Object[]{this, adapterDataObserver});
            } else {
                this.mDelegateAdapter.unregisterAdapterDataObserver(adapterDataObserver);
            }
        }
    }

    public static /* synthetic */ void access$000(SmoothRecyclerScrollFeature smoothRecyclerScrollFeature, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9afe7e84", new Object[]{smoothRecyclerScrollFeature, view});
        } else {
            smoothRecyclerScrollFeature.resume(view);
        }
    }

    public static /* synthetic */ void access$100(SmoothRecyclerScrollFeature smoothRecyclerScrollFeature, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b804663", new Object[]{smoothRecyclerScrollFeature, view});
        } else {
            smoothRecyclerScrollFeature.pause(view);
        }
    }

    private ImageLoadFeature getImageLoadFeature(TImageView tImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageLoadFeature) ipChange.ipc$dispatch("8ede7a3c", new Object[]{this, tImageView});
        }
        return (ImageLoadFeature) tImageView.findFeature(ImageLoadFeature.class);
    }

    public static /* synthetic */ Object ipc$super(SmoothRecyclerScrollFeature smoothRecyclerScrollFeature, String str, Object... objArr) {
        if (str.hashCode() == 1336372353) {
            super.setHost((SmoothRecyclerScrollFeature) ((View) objArr[0]));
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/extend/feature/features/SmoothRecyclerScrollFeature");
    }

    private void pause(View view) {
        ImageLoadFeature imageLoadFeature;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2384635", new Object[]{this, view});
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                pause(viewGroup.getChildAt(i));
            }
        } else if ((view instanceof TImageView) && (imageLoadFeature = getImageLoadFeature((TImageView) view)) != null) {
            imageLoadFeature.pause();
        }
    }

    private void resume(View view) {
        ImageLoadFeature imageLoadFeature;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd62161e", new Object[]{this, view});
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                resume(viewGroup.getChildAt(i));
            }
        } else if ((view instanceof TImageView) && (imageLoadFeature = getImageLoadFeature((TImageView) view)) != null) {
            imageLoadFeature.resume();
        }
    }

    @Override // com.taobao.uikit.feature.features.AbsFeature
    public void constructor(Context context, AttributeSet attributeSet, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8928939c", new Object[]{this, context, attributeSet, new Integer(i)});
        }
    }

    @Override // com.taobao.uikit.feature.callback.RecyclerAdapterCallback
    public RecyclerView.Adapter wrapAdapter(RecyclerView.Adapter adapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.Adapter) ipChange.ipc$dispatch("723dadc", new Object[]{this, adapter});
        }
        if (adapter == null || (adapter instanceof SmoothAdapter)) {
            return adapter;
        }
        return new SmoothAdapter(adapter);
    }

    public void setHost(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1561b26", new Object[]{this, recyclerView});
            return;
        }
        super.setHost((SmoothRecyclerScrollFeature) recyclerView);
        recyclerView.setOnScrollListener(new InnerScrollListener());
    }
}
