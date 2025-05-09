package com.taobao.kirinvideoengine.album;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.core.OrderConfigs;
import com.taobao.kirinvideoengine.album.AlbumAdapter;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import tb.a07;
import tb.ay1;
import tb.azf;
import tb.ckf;
import tb.dk0;
import tb.t2o;
import tb.vsk;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00062\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/taobao/kirinvideoengine/album/AlbumContainer;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Companion", "a", "kirinvideoengine_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class AlbumContainer {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String TAG = "AlbumContainer";

    /* renamed from: a  reason: collision with root package name */
    public final RecyclerView f10876a;
    public final AlbumAdapter b;
    public int c;
    public int d;
    public boolean e;
    public final ArrayList<vsk> f = new ArrayList<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        static {
            t2o.a(500170761);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(500170759);
    }

    public AlbumContainer(Context context) {
        ckf.g(context, "context");
        RecyclerView recyclerView = new RecyclerView(context);
        this.f10876a = recyclerView;
        recyclerView.setId(R.id.layout_album_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemViewCacheSize(1);
        AlbumAdapter albumAdapter = new AlbumAdapter(this, recyclerView);
        this.b = albumAdapter;
        recyclerView.setAdapter(albumAdapter);
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.taobao.kirinvideoengine.album.AlbumContainer.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kirinvideoengine/album/AlbumContainer$1");
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView2, int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("51239a02", new Object[]{this, recyclerView2, new Integer(i)});
                    return;
                }
                ckf.g(recyclerView2, OrderConfigs.RECYCLERVIEW);
                azf.d(AlbumContainer.TAG, "album onScrollStateChanged newState=" + i, new Object[0]);
                if (i == 1) {
                    AlbumContainer.e(AlbumContainer.this, true);
                } else if (i == 0) {
                    RecyclerView.LayoutManager layoutManager = recyclerView2.getLayoutManager();
                    if (layoutManager != null) {
                        int findFirstVisibleItemPosition = ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
                        if (findFirstVisibleItemPosition != -1) {
                            AlbumContainer.c(AlbumContainer.this, findFirstVisibleItemPosition);
                            return;
                        }
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
                }
            }
        });
        o(0);
        new LocalPagerSnapHelper() { // from class: com.taobao.kirinvideoengine.album.AlbumContainer$pagerSnapHelper$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AlbumContainer$pagerSnapHelper$1 albumContainer$pagerSnapHelper$1, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kirinvideoengine/album/AlbumContainer$pagerSnapHelper$1");
            }

            @Override // com.taobao.kirinvideoengine.album.LocalPagerSnapHelper
            public void a(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("dcf93662", new Object[]{this, new Integer(i)});
                } else if (AlbumContainer.a(AlbumContainer.this) != i || AlbumContainer.b(AlbumContainer.this)) {
                    AlbumContainer.d(AlbumContainer.this, i);
                    AlbumContainer.e(AlbumContainer.this, false);
                }
            }
        }.attachToRecyclerView(recyclerView);
    }

    public static final /* synthetic */ int a(AlbumContainer albumContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c9b62c1d", new Object[]{albumContainer})).intValue();
        }
        return albumContainer.d;
    }

    public static final /* synthetic */ boolean b(AlbumContainer albumContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0e169b2", new Object[]{albumContainer})).booleanValue();
        }
        return albumContainer.e;
    }

    public static final /* synthetic */ void c(AlbumContainer albumContainer, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4923c9f3", new Object[]{albumContainer, new Integer(i)});
        } else {
            albumContainer.o(i);
        }
    }

    public static final /* synthetic */ void d(AlbumContainer albumContainer, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8acdba1e", new Object[]{albumContainer, new Integer(i)});
        } else {
            albumContainer.p(i);
        }
    }

    public static final /* synthetic */ void e(AlbumContainer albumContainer, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfdb52f2", new Object[]{albumContainer, new Boolean(z)});
        } else {
            albumContainer.e = z;
        }
    }

    public final void f(RecyclerView.OnScrollListener onScrollListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0c68c6b", new Object[]{this, onScrollListener});
            return;
        }
        ckf.g(onScrollListener, "scrollListener");
        this.f10876a.addOnScrollListener(onScrollListener);
    }

    public final void g(AlbumAdapter.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c486789", new Object[]{this, bVar});
            return;
        }
        ckf.g(bVar, "itemStateListener");
        this.b.M(bVar);
    }

    public final void h(AlbumAdapter.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fab2661", new Object[]{this, cVar});
            return;
        }
        ckf.g(cVar, "livePhotoStateListener");
        this.b.N(cVar);
    }

    public final void i(vsk vskVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1390e60", new Object[]{this, vskVar});
            return;
        }
        ckf.g(vskVar, "pageChangedListener");
        this.f.add(vskVar);
    }

    public final int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("559245ac", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public final ViewGroup k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("30aef49e", new Object[]{this});
        }
        return this.f10876a;
    }

    public final ay1 l(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ay1) ipChange.ipc$dispatch("ab4eeafa", new Object[]{this, new Integer(i)});
        }
        return this.b.P(i);
    }

    public final int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6ffb341b", new Object[]{this})).intValue();
        }
        return this.b.O();
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fcd8b59", new Object[]{this});
            return;
        }
        RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.f10876a.findViewHolderForAdapterPosition(this.d);
        if (findViewHolderForAdapterPosition != null && (findViewHolderForAdapterPosition instanceof LivePhotoViewHolder)) {
            ((LivePhotoViewHolder) findViewHolderForAdapterPosition).g0();
        }
    }

    public final void o(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e4e76f8", new Object[]{this, new Integer(i)});
            return;
        }
        int Q = this.b.Q(i);
        Iterator<vsk> it = this.f.iterator();
        while (it.hasNext()) {
            it.next().b(this.c, Q);
        }
        RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.f10876a.findViewHolderForAdapterPosition(i);
        if (findViewHolderForAdapterPosition instanceof LivePhotoViewHolder) {
            ((LivePhotoViewHolder) findViewHolderForAdapterPosition).g0();
        }
        this.c = Q;
        this.d = i;
    }

    public final void q(dk0 dk0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b61f40df", new Object[]{this, dk0Var});
            return;
        }
        ckf.g(dk0Var, "data");
        this.b.T(dk0Var.a());
        this.b.notifyDataSetChanged();
        this.f10876a.scrollToPosition(0);
        this.c = 0;
        this.d = 0;
    }

    public final void s(boolean z) {
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("724055d2", new Object[]{this, new Boolean(z)});
            return;
        }
        this.b.S(z);
        RecyclerView recyclerView = this.f10876a;
        if (!z) {
            i = 2;
        }
        recyclerView.setOverScrollMode(i);
    }

    public final void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("778dcd4b", new Object[]{this});
            return;
        }
        RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.f10876a.findViewHolderForAdapterPosition(this.d);
        if (findViewHolderForAdapterPosition != null && (findViewHolderForAdapterPosition instanceof LivePhotoViewHolder)) {
            ((LivePhotoViewHolder) findViewHolderForAdapterPosition).i0();
        }
    }

    public final void p(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c32ef163", new Object[]{this, new Integer(i)});
            return;
        }
        int Q = this.b.Q(i);
        if (Q >= 0) {
            azf.d(TAG, "positionChanged last=" + this.c + " , new position=" + Q, new Object[0]);
            this.b.P(Q);
            Iterator<vsk> it = this.f.iterator();
            while (it.hasNext()) {
                it.next().a(this.c, Q, this.e);
            }
        }
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1b21df1", new Object[]{this});
            return;
        }
        int max = Math.max(this.f10876a.getWidth(), 0);
        this.f10876a.smoothScrollBy(max, 0);
        azf.d(TAG, "scrollToNextPage next=" + (this.d + 1) + ", width=" + max, new Object[0]);
    }
}
