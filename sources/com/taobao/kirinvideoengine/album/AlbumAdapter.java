package com.taobao.kirinvideoengine.album;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.core.OrderConfigs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import tb.a07;
import tb.ay1;
import tb.azf;
import tb.b3m;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\n\u000b\fB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/taobao/kirinvideoengine/album/AlbumAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/taobao/kirinvideoengine/album/AlbumContainer;", "albumContainer", "Landroidx/recyclerview/widget/RecyclerView;", OrderConfigs.RECYCLERVIEW, "<init>", "(Lcom/taobao/kirinvideoengine/album/AlbumContainer;Landroid/support/v7/widget/RecyclerView;)V", "Companion", "a", TplMsg.VALUE_T_NATIVE_RETURN, "c", "kirinvideoengine_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class AlbumAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String TAG = "AlbumAdapter";
    public static final int VIEW_TYPE_IMAGE = 1;
    public static final int VIEW_TYPE_LIVE_PHOTO = 2;

    /* renamed from: a  reason: collision with root package name */
    public List<? extends ay1> f10875a;
    public boolean b = true;
    public final ArrayList<b> c = new ArrayList<>();
    public final ArrayList<c> d = new ArrayList<>();
    public final AlbumContainer e;
    public final RecyclerView f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        static {
            t2o.a(500170755);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface b {
        void a(int i, boolean z);

        void onAppear(int i);

        void onDisappear(int i);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface c {
        void a(int i);

        void b(int i);

        void c(int i, Object obj, int i2, int i3);
    }

    static {
        t2o.a(500170754);
    }

    public AlbumAdapter(AlbumContainer albumContainer, RecyclerView recyclerView) {
        ckf.g(albumContainer, "albumContainer");
        ckf.g(recyclerView, OrderConfigs.RECYCLERVIEW);
        this.e = albumContainer;
        this.f = recyclerView;
    }

    public static /* synthetic */ Object ipc$super(AlbumAdapter albumAdapter, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 430758011) {
            super.onViewDetachedFromWindow((RecyclerView.ViewHolder) objArr[0]);
            return null;
        } else if (hashCode == 1995301502) {
            super.onViewAttachedToWindow((RecyclerView.ViewHolder) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/kirinvideoengine/album/AlbumAdapter");
        }
    }

    public final void M(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c486789", new Object[]{this, bVar});
            return;
        }
        ckf.g(bVar, "itemStateListener");
        this.c.add(bVar);
    }

    public final void N(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fab2661", new Object[]{this, cVar});
            return;
        }
        ckf.g(cVar, "livePhotoStateListener");
        this.d.add(cVar);
    }

    public final int O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f49bd365", new Object[]{this})).intValue();
        }
        List<? extends ay1> list = this.f10875a;
        if (list == null) {
            return 0;
        }
        ckf.d(list);
        return list.size();
    }

    public final ay1 P(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ay1) ipChange.ipc$dispatch("ab4eeafa", new Object[]{this, new Integer(i)});
        }
        List<? extends ay1> list = this.f10875a;
        if (list == null || i < 0) {
            return null;
        }
        ckf.d(list);
        if (i >= list.size()) {
            return null;
        }
        List<? extends ay1> list2 = this.f10875a;
        ckf.d(list2);
        return (ay1) list2.get(i);
    }

    public final int Q(int i) {
        int i2 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eedb3d1b", new Object[]{this, new Integer(i)})).intValue();
        }
        List<? extends ay1> list = this.f10875a;
        if (list != null) {
            i2 = list.size();
        }
        return i % i2;
    }

    public final void S(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("724055d2", new Object[]{this, new Boolean(z)});
        } else if (this.b != z) {
            this.b = z;
            notifyDataSetChanged();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        List<? extends ay1> list = this.f10875a;
        if (list == null) {
            return 0;
        }
        if (this.b) {
            return Integer.MAX_VALUE;
        }
        ckf.d(list);
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        int Q = Q(i);
        List<? extends ay1> list = this.f10875a;
        if (list == null) {
            return 1;
        }
        ckf.d(list);
        if (Q >= list.size()) {
            return 1;
        }
        List<? extends ay1> list2 = this.f10875a;
        ckf.d(list2);
        String a2 = ((ay1) list2.get(Q)).a();
        if (a2.hashCode() == -1296207738 && a2.equals(b3m.LIVEPHOTO)) {
            return 2;
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
        ckf.g(viewHolder, "holder");
        int Q = Q(i);
        List<? extends ay1> list = this.f10875a;
        if (list != null && Q < list.size()) {
            List<? extends ay1> list2 = this.f10875a;
            ckf.d(list2);
            ay1 ay1Var = (ay1) list2.get(Q);
            if (!(ay1Var instanceof b3m)) {
                return;
            }
            if (viewHolder instanceof ImageViewHolder) {
                ((ImageViewHolder) viewHolder).c0(Q, ((b3m) ay1Var).e());
            } else if (viewHolder instanceof LivePhotoViewHolder) {
                ((LivePhotoViewHolder) viewHolder).d0(Q, (b3m) ay1Var);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("9e3c0169", new Object[]{this, viewGroup, new Integer(i)});
        }
        ckf.g(viewGroup, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        if (i != 2) {
            return new ImageViewHolder(this, viewGroup, this.c);
        }
        return new LivePhotoViewHolder(this, viewGroup, this.c, this.d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76ede27e", new Object[]{this, viewHolder});
            return;
        }
        ckf.g(viewHolder, "holder");
        super.onViewAttachedToWindow(viewHolder);
        azf.d(TAG, "onViewAttachedToWindow adapterPosition=" + viewHolder.getAdapterPosition(), new Object[0]);
        Iterator<b> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().onAppear(Q(viewHolder.getAdapterPosition()));
        }
        if (viewHolder instanceof LivePhotoViewHolder) {
            LivePhotoViewHolder livePhotoViewHolder = (LivePhotoViewHolder) viewHolder;
            livePhotoViewHolder.h0();
            if (this.f.getScrollState() == 0 && Q(livePhotoViewHolder.getAdapterPosition()) == this.e.j()) {
                livePhotoViewHolder.g0();
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19acd87b", new Object[]{this, viewHolder});
            return;
        }
        ckf.g(viewHolder, "holder");
        super.onViewDetachedFromWindow(viewHolder);
        azf.d(TAG, "onViewDetachedFromWindow.... adapterPosition=" + viewHolder.getAdapterPosition(), new Object[0]);
        Iterator<b> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().onDisappear(Q(viewHolder.getAdapterPosition()));
        }
        if (viewHolder instanceof LivePhotoViewHolder) {
            ((LivePhotoViewHolder) viewHolder).f0();
        }
    }

    public final void T(List<? extends ay1> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e5d4fa3", new Object[]{this, list});
            return;
        }
        azf.d(TAG, "setPics pics=" + list, new Object[0]);
        this.f10875a = list;
        this.b = true;
    }
}
