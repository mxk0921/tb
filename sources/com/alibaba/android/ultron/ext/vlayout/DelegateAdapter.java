package com.alibaba.android.ultron.ext.vlayout;

import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.t2o;
import tb.x23;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class DelegateAdapter extends VirtualLayoutAdapter<RecyclerView.ViewHolder> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static abstract class Adapter<VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(156237934);
        }

        public static /* synthetic */ Object ipc$super(Adapter adapter, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/ext/vlayout/DelegateAdapter$Adapter");
        }

        public void M(VH vh, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6f8290f1", new Object[]{this, vh, new Integer(i), new Integer(i2)});
            }
        }

        public void N(VH vh, int i, int i2, List<Object> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("533b1be2", new Object[]{this, vh, new Integer(i), new Integer(i2), list});
            } else {
                M(vh, i, i2);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class SimpleViewAdapter extends Adapter<RecyclerView.ViewHolder> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(156237936);
        }

        public static /* synthetic */ Object ipc$super(SimpleViewAdapter simpleViewAdapter, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/ext/vlayout/DelegateAdapter$SimpleViewAdapter");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
            }
            return 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aa17accb", new Object[]{this, viewHolder, new Integer(i)});
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("9e3c0169", new Object[]{this, viewGroup, new Integer(i)});
            }
            return new SimpleViewHolder(null);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class SimpleViewHolder extends RecyclerView.ViewHolder {
        static {
            t2o.a(156237937);
        }

        public SimpleViewHolder(View view) {
            super(view);
        }
    }

    static {
        t2o.a(156237933);
    }

    public static /* synthetic */ Object ipc$super(DelegateAdapter delegateAdapter, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1614840632:
                super.setHasStableIds(((Boolean) objArr[0]).booleanValue());
                return null;
            case -271918469:
                return delegateAdapter.M();
            case 143764512:
                super.onViewRecycled((RecyclerView.ViewHolder) objArr[0]);
                return null;
            case 430758011:
                super.onViewDetachedFromWindow((RecyclerView.ViewHolder) objArr[0]);
                return null;
            case 1463889841:
                delegateAdapter.N((List) objArr[0]);
                return null;
            case 1995301502:
                super.onViewAttachedToWindow((RecyclerView.ViewHolder) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/ext/vlayout/DelegateAdapter");
        }
    }

    public Pair<AdapterDataObserver, Adapter> O(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("3e40cb50", new Object[]{this, new Integer(i)});
        }
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue();
        }
        Pair<AdapterDataObserver, Adapter> O = O(i);
        if (O == null) {
            return -1L;
        }
        ((AdapterDataObserver) O.first).getClass();
        long itemId = ((Adapter) O.second).getItemId(i);
        if (itemId < 0) {
            return -1L;
        }
        ((AdapterDataObserver) O.first).getClass();
        return x23.a(0, itemId);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        Pair<AdapterDataObserver, Adapter> O = O(i);
        if (O == null) {
            return -1;
        }
        ((AdapterDataObserver) O.first).getClass();
        int itemViewType = ((Adapter) O.second).getItemViewType(i);
        if (itemViewType < 0) {
            return itemViewType;
        }
        ((AdapterDataObserver) O.first).getClass();
        return (int) x23.a(itemViewType, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa17accb", new Object[]{this, viewHolder, new Integer(i)});
            return;
        }
        Pair<AdapterDataObserver, Adapter> O = O(i);
        if (O != null) {
            ((AdapterDataObserver) O.first).getClass();
            ((Adapter) O.second).onBindViewHolder(viewHolder, i);
            ((AdapterDataObserver) O.first).getClass();
            ((Adapter) O.second).M(viewHolder, i, i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("9e3c0169", new Object[]{this, viewGroup, new Integer(i)});
        }
        x23.b(i, null);
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        Pair<AdapterDataObserver, Adapter> O;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76ede27e", new Object[]{this, viewHolder});
            return;
        }
        super.onViewAttachedToWindow(viewHolder);
        int position = viewHolder.getPosition();
        if (position >= 0 && (O = O(position)) != null) {
            ((Adapter) O.second).onViewAttachedToWindow(viewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        Pair<AdapterDataObserver, Adapter> O;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19acd87b", new Object[]{this, viewHolder});
            return;
        }
        super.onViewDetachedFromWindow(viewHolder);
        int position = viewHolder.getPosition();
        if (position >= 0 && (O = O(position)) != null) {
            ((Adapter) O.second).onViewDetachedFromWindow(viewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        Pair<AdapterDataObserver, Adapter> O;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("891ac20", new Object[]{this, viewHolder});
            return;
        }
        super.onViewRecycled(viewHolder);
        int position = viewHolder.getPosition();
        if (position >= 0 && (O = O(position)) != null) {
            ((Adapter) O.second).onViewRecycled(viewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void setHasStableIds(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fbf7cc8", new Object[]{this, new Boolean(z)});
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class AdapterDataObserver extends RecyclerView.AdapterDataObserver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(156237935);
        }

        public static /* synthetic */ Object ipc$super(AdapterDataObserver adapterDataObserver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/ext/vlayout/DelegateAdapter$AdapterDataObserver");
        }

        public final boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("55ec42ec", new Object[]{this})).booleanValue();
            }
            throw null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ba16f5dc", new Object[]{this});
            } else if (a()) {
                throw null;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("70303dd0", new Object[]{this, new Integer(i), new Integer(i2)});
            } else if (a()) {
                throw null;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8e983dea", new Object[]{this, new Integer(i), new Integer(i2)});
            } else if (a()) {
                throw null;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("97535514", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            } else if (a()) {
                throw null;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f1cd027c", new Object[]{this, new Integer(i), new Integer(i2)});
            } else if (a()) {
                throw null;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad2e59ac", new Object[]{this, new Integer(i), new Integer(i2), obj});
            } else if (a()) {
                throw null;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ee143bc", new Object[]{this, viewHolder, new Integer(i), list});
            return;
        }
        Pair<AdapterDataObserver, Adapter> O = O(i);
        if (O != null) {
            ((AdapterDataObserver) O.first).getClass();
            ((Adapter) O.second).onBindViewHolder(viewHolder, i, list);
            ((AdapterDataObserver) O.first).getClass();
            ((Adapter) O.second).N(viewHolder, i, i, list);
        }
    }
}
