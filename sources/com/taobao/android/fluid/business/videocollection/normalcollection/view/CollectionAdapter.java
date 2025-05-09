package com.taobao.android.fluid.business.videocollection.normalcollection.view;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.videocollection.normalcollection.NormalPopContent;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.List;
import tb.dz3;
import tb.ir9;
import tb.pr9;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class CollectionAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LOCK_URL = "https://img.alicdn.com/imgextra/i3/O1CN01Kb8pzZ1xW9Sh5et6g_!!6000000006450-2-tps-120-48.png";
    public static final String TAG = "CollectionAdapter";
    public static final String UNLOCK_URL = "https://img.alicdn.com/imgextra/i4/O1CN01NvloPz29ICn30GVIj_!!6000000008044-2-tps-120-48.png";

    /* renamed from: a  reason: collision with root package name */
    public final List<dz3> f7744a;
    public CollectionViewHolder.a b;
    public String c = "-1";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class CollectionViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int SELECTED_COLOR = 352276480;
        public static final int UNSELECTED_COLOR = -1;

        /* renamed from: a  reason: collision with root package name */
        public final TUrlImageView f7745a;
        public final TextView b;
        public final TextView c;
        public final FrameLayout d;
        public a e;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public interface a {
        }

        static {
            t2o.a(468713741);
        }

        public CollectionViewHolder(View view) {
            super(view);
            this.d = (FrameLayout) view.findViewById(R.id.collectioncell_image_layout);
            this.f7745a = (TUrlImageView) view.findViewById(R.id.collectioncell_image);
            this.b = (TextView) view.findViewById(R.id.titleTextView);
            this.c = (TextView) view.findViewById(R.id.subtitleTextView);
            ViewProxy.setOnClickListener(view, this);
        }

        public static /* synthetic */ Object ipc$super(CollectionViewHolder collectionViewHolder, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/business/videocollection/normalcollection/view/CollectionAdapter$CollectionViewHolder");
        }

        public void b0(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7304535b", new Object[]{this, aVar});
            } else {
                this.e = aVar;
            }
        }

        public void c0(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4325830", new Object[]{this, new Boolean(z)});
            } else if (z) {
                this.itemView.setBackgroundColor(SELECTED_COLOR);
            } else {
                this.itemView.setBackgroundColor(-1);
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a aVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (getAdapterPosition() >= 0 && (aVar = this.e) != null) {
                ((NormalPopContent.i) aVar).a(getAdapterPosition());
            }
        }
    }

    static {
        t2o.a(468713740);
    }

    public CollectionAdapter(List<dz3> list) {
        this.f7744a = list;
    }

    public static /* synthetic */ Object ipc$super(CollectionAdapter collectionAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/business/videocollection/normalcollection/view/CollectionAdapter");
    }

    public final void M(CollectionViewHolder collectionViewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72966e9f", new Object[]{this, collectionViewHolder, new Integer(i)});
            return;
        }
        dz3 dz3Var = this.f7744a.get(i);
        collectionViewHolder.b.setText(dz3Var.e());
        collectionViewHolder.c.setText(dz3Var.b());
        ir9.b(TAG, "onBindViewHolder: " + dz3Var);
        CollectionViewHolder.a aVar = this.b;
        if (aVar != null) {
            collectionViewHolder.b0(aVar);
        }
        View findViewWithTag = collectionViewHolder.d.findViewWithTag("customFreeImageView");
        if (findViewWithTag != null) {
            collectionViewHolder.d.removeView(findViewWithTag);
        }
        String str = dz3Var.h;
        int c = pr9.c(collectionViewHolder.d.getContext(), dz3Var.i);
        int c2 = pr9.c(collectionViewHolder.d.getContext(), dz3Var.j);
        if ((TextUtils.isEmpty(str) || c <= 0 || c2 <= 0) && !dz3Var.f()) {
            if (dz3Var.g()) {
                str = LOCK_URL;
            } else {
                str = UNLOCK_URL;
            }
            c = pr9.c(collectionViewHolder.d.getContext(), 40);
            c2 = pr9.c(collectionViewHolder.d.getContext(), 16);
        }
        if (!TextUtils.isEmpty(str)) {
            TUrlImageView tUrlImageView = new TUrlImageView(collectionViewHolder.d.getContext());
            tUrlImageView.setTag("customFreeImageView");
            tUrlImageView.setImageUrl(str);
            collectionViewHolder.d.addView(tUrlImageView, new FrameLayout.LayoutParams(c, c2));
        }
        if (dz3Var.c() != null) {
            collectionViewHolder.f7745a.setImageUrl(dz3Var.c());
        }
        collectionViewHolder.c0(N(i));
    }

    public final boolean N(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18e6d48", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (this.f7744a.get(i).d() == this.c) {
            return true;
        }
        return false;
    }

    public void O(CollectionViewHolder.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7304535b", new Object[]{this, aVar});
        } else {
            this.b = aVar;
        }
    }

    public void P(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f02c86d", new Object[]{this, new Integer(i)});
        }
    }

    public void Q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e640f5c", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        if (this.f7744a.isEmpty()) {
            return 0;
        }
        List<dz3> list = this.f7744a;
        list.get(list.size() - 1).a();
        return this.f7744a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa17accb", new Object[]{this, viewHolder, new Integer(i)});
            return;
        }
        List<dz3> list = this.f7744a;
        if (list != null && list.size() >= i && (viewHolder instanceof CollectionViewHolder)) {
            M((CollectionViewHolder) viewHolder, i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("9e3c0169", new Object[]{this, viewGroup, new Integer(i)});
        }
        return new CollectionViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fluid_sdk_collection_normal_dialog_cell, viewGroup, false));
    }
}
