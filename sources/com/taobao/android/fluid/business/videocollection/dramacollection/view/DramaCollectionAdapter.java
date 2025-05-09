package com.taobao.android.fluid.business.videocollection.dramacollection.view;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.b0;
import com.taobao.android.fluid.business.videocollection.dramacollection.a;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DramaCollectionAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<a.C0415a> f7727a;
    public String b;
    public final b c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final TextView f7728a;
        public final ImageView b;
        public b c;

        static {
            t2o.a(468713713);
        }

        public ViewHolder(View view) {
            super(view);
            this.f7728a = (TextView) view.findViewById(R.id.tv_collectionIndex);
            this.b = (ImageView) view.findViewById(R.id.img_lock);
            ViewProxy.setOnClickListener(view, this);
        }

        public static /* synthetic */ Object ipc$super(ViewHolder viewHolder, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/business/videocollection/dramacollection/view/DramaCollectionAdapter$ViewHolder");
        }

        public void b0(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dfd5e1dd", new Object[]{this, bVar});
            } else {
                this.c = bVar;
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            b bVar = this.c;
            if (bVar != null) {
                bVar.a(getAdapterPosition(), null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.android.fluid.business.videocollection.dramacollection.view.DramaCollectionAdapter.b
        public void a(int i, a.C0415a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9157798d", new Object[]{this, new Integer(i), aVar});
            } else if (DramaCollectionAdapter.M(DramaCollectionAdapter.this) != null) {
                DramaCollectionAdapter.M(DramaCollectionAdapter.this).a(i, (a.C0415a) DramaCollectionAdapter.N(DramaCollectionAdapter.this).get(i));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface b {
        void a(int i, a.C0415a aVar);
    }

    static {
        t2o.a(468713710);
    }

    public DramaCollectionAdapter(List<a.C0415a> list, b bVar) {
        this.f7727a = list;
        this.c = bVar;
    }

    public static /* synthetic */ b M(DramaCollectionAdapter dramaCollectionAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("df217dfb", new Object[]{dramaCollectionAdapter});
        }
        return dramaCollectionAdapter.c;
    }

    public static /* synthetic */ List N(DramaCollectionAdapter dramaCollectionAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("556bfb7b", new Object[]{dramaCollectionAdapter});
        }
        return dramaCollectionAdapter.f7727a;
    }

    public static /* synthetic */ Object ipc$super(DramaCollectionAdapter dramaCollectionAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/business/videocollection/dramacollection/view/DramaCollectionAdapter");
    }

    /* renamed from: O */
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        int i2;
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e1a0dd8", new Object[]{this, viewHolder, new Integer(i)});
            return;
        }
        a.C0415a aVar = this.f7727a.get(i);
        viewHolder.f7728a.setText(String.valueOf(aVar.b()));
        ImageView imageView = viewHolder.b;
        if (!aVar.c()) {
            i3 = 8;
        }
        imageView.setVisibility(i3);
        boolean equals = TextUtils.equals(this.b, aVar.a());
        viewHolder.itemView.setSelected(equals);
        if (equals) {
            i2 = b0.DEFAULT_COLOR;
        } else if (aVar.c()) {
            i2 = -2146363091;
        } else {
            i2 = -15656659;
        }
        viewHolder.f7728a.setTextColor(i2);
    }

    /* renamed from: P */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewHolder) ipChange.ipc$dispatch("e621c07c", new Object[]{this, viewGroup, new Integer(i)});
        }
        ViewHolder viewHolder = new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fluid_sdk_collection_drama_dialog_cell, viewGroup, false));
        viewHolder.b0(new a());
        return viewHolder;
    }

    public void Q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46a5db27", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        return this.f7727a.size();
    }
}
