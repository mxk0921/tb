package com.etao.feimagesearch.capture.dynamic.bottom.album;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.List;
import tb.ckf;
import tb.d22;
import tb.g1a;
import tb.nhi;
import tb.t2o;
import tb.xhv;
import tb.zs9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class CaptureAlbumFolderAdapter extends RecyclerView.Adapter<CaptureAlbumFolderViewHolder> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f4638a;
    public final boolean b;
    public final d22 c;
    public final g1a<? super zs9, xhv> d;
    public List<zs9> e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class CaptureAlbumFolderViewHolder extends RecyclerView.ViewHolder {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final TextView f4639a;
        public final TextView b;
        public final TUrlImageView c;
        public final TUrlImageView d;
        public final nhi e;

        static {
            t2o.a(481296549);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CaptureAlbumFolderViewHolder(View view, boolean z, d22 d22Var) {
            super(view);
            ckf.g(view, "itemView");
            ckf.g(d22Var, "thumbnailExecutor");
            View findViewById = view.findViewById(R.id.folder_list_name);
            ((TextView) findViewById).setTextSize(1, z ? 21.0f : 16.0f);
            ckf.f(findViewById, "itemView.findViewById<Te…lder) 21f else 16f)\n    }");
            this.f4639a = (TextView) findViewById;
            View findViewById2 = view.findViewById(R.id.folder_list_count);
            ((TextView) findViewById2).setTextSize(1, z ? 18.0f : 13.0f);
            ckf.f(findViewById2, "itemView.findViewById<Te…lder) 18f else 13f)\n    }");
            this.b = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.folder_list_thumb);
            ckf.f(findViewById3, "itemView.findViewById(R.id.folder_list_thumb)");
            this.c = (TUrlImageView) findViewById3;
            View findViewById4 = view.findViewById(R.id.tiv_select_hint);
            ((TUrlImageView) findViewById4).setImageUrl("https://gw.alicdn.com/imgextra/i1/O1CN01yoR0hB1fGtMZDjbuK_!!6000000003980-49-tps-80-75.webp");
            ckf.f(findViewById4, "itemView.findViewById<TU…9-tps-80-75.webp\"\n      }");
            this.d = (TUrlImageView) findViewById4;
            this.e = new nhi(d22Var);
        }

        public static /* synthetic */ Object ipc$super(CaptureAlbumFolderViewHolder captureAlbumFolderViewHolder, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/bottom/album/CaptureAlbumFolderAdapter$CaptureAlbumFolderViewHolder");
        }

        public final TextView b0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TextView) ipChange.ipc$dispatch("bfcdafd4", new Object[]{this});
            }
            return this.b;
        }

        public final TextView c0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TextView) ipChange.ipc$dispatch("acbb0f7c", new Object[]{this});
            }
            return this.f4639a;
        }

        public final TUrlImageView d0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TUrlImageView) ipChange.ipc$dispatch("c59f6dd", new Object[]{this});
            }
            return this.d;
        }

        public final TUrlImageView e0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TUrlImageView) ipChange.ipc$dispatch("67342bf5", new Object[]{this});
            }
            return this.c;
        }

        public final nhi f0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (nhi) ipChange.ipc$dispatch("cca1a7f4", new Object[]{this});
            }
            return this.e;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ zs9 b;

        public a(zs9 zs9Var) {
            this.b = zs9Var;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            g1a M = CaptureAlbumFolderAdapter.M(CaptureAlbumFolderAdapter.this);
            if (M != null) {
                M.invoke(this.b);
            }
        }
    }

    static {
        t2o.a(481296548);
    }

    public CaptureAlbumFolderAdapter(Context context, boolean z, d22 d22Var, g1a<? super zs9, xhv> g1aVar) {
        ckf.g(context, "ctx");
        ckf.g(d22Var, "thumbnailExecutor");
        this.f4638a = context;
        this.b = z;
        this.c = d22Var;
        this.d = g1aVar;
    }

    public static final /* synthetic */ g1a M(CaptureAlbumFolderAdapter captureAlbumFolderAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("d7decd9c", new Object[]{captureAlbumFolderAdapter});
        }
        return captureAlbumFolderAdapter.d;
    }

    public static /* synthetic */ Object ipc$super(CaptureAlbumFolderAdapter captureAlbumFolderAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/bottom/album/CaptureAlbumFolderAdapter");
    }

    public final void P(List<zs9> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1976c0b", new Object[]{this, list});
        } else if (list != null) {
            this.e = list;
            notifyDataSetChanged();
        }
    }

    public final void Q(zs9 zs9Var) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45e382ec", new Object[]{this, zs9Var});
        } else if (zs9Var != null) {
            List<zs9> list = this.e;
            if (list == null) {
                i = -1;
            } else {
                i = list.indexOf(zs9Var);
            }
            if (i >= 0) {
                notifyItemChanged(i);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        List<zs9> list = this.e;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.e = null;
        notifyDataSetChanged();
    }

    /* renamed from: N */
    public void onBindViewHolder(CaptureAlbumFolderViewHolder captureAlbumFolderViewHolder, int i) {
        int adapterPosition;
        zs9 zs9Var;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e52e35d0", new Object[]{this, captureAlbumFolderViewHolder, new Integer(i)});
            return;
        }
        ckf.g(captureAlbumFolderViewHolder, "holder");
        List<zs9> list = this.e;
        if (list != null && (zs9Var = list.get((adapterPosition = captureAlbumFolderViewHolder.getAdapterPosition()))) != null) {
            if (zs9Var.j()) {
                captureAlbumFolderViewHolder.f0().a(zs9Var.f().get(0), captureAlbumFolderViewHolder.e0());
            }
            captureAlbumFolderViewHolder.c0().setText(zs9Var.g());
            if (adapterPosition == 0) {
                captureAlbumFolderViewHolder.b0().setVisibility(8);
            } else {
                captureAlbumFolderViewHolder.b0().setVisibility(0);
                captureAlbumFolderViewHolder.b0().setText(zs9Var.d());
            }
            ViewProxy.setOnClickListener(captureAlbumFolderViewHolder.itemView, new a(zs9Var));
            TUrlImageView d0 = captureAlbumFolderViewHolder.d0();
            if (!zs9Var.k()) {
                i2 = 8;
            }
            d0.setVisibility(i2);
        }
    }

    /* renamed from: O */
    public CaptureAlbumFolderViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CaptureAlbumFolderViewHolder) ipChange.ipc$dispatch("c1706404", new Object[]{this, viewGroup, new Integer(i)});
        }
        ckf.g(viewGroup, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        View inflate = LayoutInflater.from(this.f4638a).inflate(R.layout.feis_album_folder_list_item, viewGroup, false);
        ckf.f(inflate, "rootView");
        return new CaptureAlbumFolderViewHolder(inflate, this.b, this.c);
    }
}
