package com.etao.feimagesearch.capture.dynamic.bottom.album;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import tb.a07;
import tb.agh;
import tb.ckf;
import tb.d1a;
import tb.d22;
import tb.g1a;
import tb.jzu;
import tb.n73;
import tb.pei;
import tb.q73;
import tb.t2o;
import tb.xhv;
import tb.zs9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class CaptureAlbumAdapter extends RecyclerView.Adapter<CaptureImageViewHolder> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String TAG = "AutoSize__Bottom_Album_CaptureAlbumAdapter";
    public volatile d22 b;
    public volatile int c;
    public volatile boolean d;
    public volatile g1a<? super pei, xhv> e;
    public volatile d1a<xhv> f;
    public volatile zs9 g;
    public List<? extends pei> i;
    public volatile boolean k;
    public volatile boolean l;
    public volatile Map<Integer, Integer> h = new LinkedHashMap();
    public volatile int j = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        static {
            t2o.a(481296545);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            d1a<xhv> U = CaptureAlbumAdapter.this.U();
            if (U != null) {
                U.invoke();
            }
        }
    }

    static {
        t2o.a(481296544);
    }

    public CaptureAlbumAdapter(q73 q73Var, d22 d22Var, int i, boolean z, g1a<? super pei, xhv> g1aVar, d1a<xhv> d1aVar) {
        ckf.g(d22Var, "thumbnailExecutor");
        this.b = d22Var;
        this.c = i;
        this.d = z;
        this.e = g1aVar;
        this.f = d1aVar;
    }

    public static final /* synthetic */ int M(CaptureAlbumAdapter captureAlbumAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e4992952", new Object[]{captureAlbumAdapter})).intValue();
        }
        return captureAlbumAdapter.j;
    }

    public static /* synthetic */ Object ipc$super(CaptureAlbumAdapter captureAlbumAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/bottom/album/CaptureAlbumAdapter");
    }

    public final void N(zs9 zs9Var, List<? extends pei> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("519fc57d", new Object[]{this, zs9Var, list});
        } else if (zs9Var != null && !ckf.b(this.g, zs9Var)) {
            if (list != null) {
                this.i = list;
            }
            this.g = zs9Var;
            b0();
            notifyDataSetChanged();
        }
    }

    public final boolean O(List<? extends pei> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("93807371", new Object[]{this, list})).booleanValue();
        }
        if (list == null) {
            return false;
        }
        this.i = list;
        if (this.j == 2) {
            return true;
        }
        return false;
    }

    public final int P(int i) {
        List list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b18fc0a3", new Object[]{this, new Integer(i)})).intValue();
        }
        zs9 zs9Var = this.g;
        if (zs9Var == null) {
            return 0;
        }
        if (i == 1) {
            list = zs9Var.i();
        } else if (i != 2) {
            list = zs9Var.f();
        } else {
            list = this.i;
        }
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final int Q(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7e772df5", new Object[]{this, new Integer(i)})).intValue();
        }
        zs9 zs9Var = this.g;
        if (zs9Var == null) {
            return 0;
        }
        if (i == 1) {
            LinkedList<pei> i2 = zs9Var.i();
            if (i2 == null) {
                return 0;
            }
            return i2.size();
        } else if (i != 2) {
            LinkedList<pei> f = zs9Var.f();
            if (f == null) {
                return 0;
            }
            return f.size();
        } else {
            List<? extends pei> list = this.i;
            if (list == null) {
                return 0;
            }
            return list.size();
        }
    }

    public final zs9 S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zs9) ipChange.ipc$dispatch("6198a43f", new Object[]{this});
        }
        return this.g;
    }

    public final int T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("70af2264", new Object[]{this})).intValue();
        }
        return 0;
    }

    public final d1a<xhv> U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d1a) ipChange.ipc$dispatch("33412d16", new Object[]{this});
        }
        return this.f;
    }

    public final g1a<pei, xhv> V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("3763cc18", new Object[]{this});
        }
        return this.e;
    }

    public final pei W(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pei) ipChange.ipc$dispatch("cf864bea", new Object[]{this, new Integer(i)});
        }
        zs9 zs9Var = this.g;
        if (zs9Var == null) {
            return null;
        }
        int i2 = this.j;
        if (i2 == 1) {
            return zs9Var.i().get(i);
        }
        if (i2 != 2) {
            return zs9Var.f().get(i);
        }
        List<? extends pei> list = this.i;
        if (list == null) {
            return null;
        }
        return (pei) list.get(i);
    }

    public final boolean X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e74a3a41", new Object[]{this})).booleanValue();
        }
        return this.k;
    }

    public final boolean a0(zs9 zs9Var, List<? extends pei> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e37a4c", new Object[]{this, zs9Var, list, new Boolean(z)})).booleanValue();
        }
        if (list != null) {
            this.i = list;
        }
        if (zs9Var == null) {
            return false;
        }
        if (this.g != null && !ckf.b(this.g, zs9Var)) {
            return false;
        }
        this.g = zs9Var;
        b0();
        if (z) {
            notifyDataSetChanged();
        }
        if (this.j == 2) {
            return false;
        }
        return true;
    }

    public final void b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca80b1dd", new Object[]{this});
        } else if (this.g != null) {
            this.h.put(1, Integer.valueOf(Q(1)));
            this.h.put(2, Integer.valueOf(Q(2)));
            this.h.put(0, Integer.valueOf(Q(0)));
        }
    }

    public final void c0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd4ef6c5", new Object[]{this, new Boolean(z)});
        } else {
            this.k = z;
        }
    }

    public final void d0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4ed23b6", new Object[]{this, new Integer(i)});
        } else if (this.j != i) {
            this.j = i;
            notifyDataSetChanged();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        return P(this.j) + (this.k ? 1 : 0);
    }

    public final void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.g = null;
        this.i = null;
        this.j = -1;
        ((LinkedHashMap) this.h).clear();
        notifyDataSetChanged();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ pei f4637a;
        public final /* synthetic */ int b;
        public final /* synthetic */ CaptureAlbumAdapter c;

        public c(pei peiVar, int i, CaptureAlbumAdapter captureAlbumAdapter) {
            this.f4637a = peiVar;
            this.b = i;
            this.c = captureAlbumAdapter;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            this.f4637a.q(this.b);
            g1a<pei, xhv> V = this.c.V();
            if (V != null) {
                V.invoke(this.f4637a);
            }
            if (CaptureAlbumAdapter.M(this.c) == 2) {
                jzu.e("albumshortcutpicclick", new String[0]);
            } else if (CaptureAlbumAdapter.M(this.c) == 0) {
                jzu.e("albumpicchoose", "index", String.valueOf(this.b));
            }
        }
    }

    /* renamed from: Y */
    public void onBindViewHolder(CaptureImageViewHolder captureImageViewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdb961e2", new Object[]{this, captureImageViewHolder, new Integer(i)});
            return;
        }
        ckf.g(captureImageViewHolder, "holder");
        agh.h(TAG, ckf.p("onBindViewHolder ", Integer.valueOf(i)));
        int adapterPosition = captureImageViewHolder.getAdapterPosition();
        if (!this.l) {
            this.l = true;
            n73.e();
        }
        if (this.k) {
            if (adapterPosition == 0) {
                captureImageViewHolder.b0();
                ViewProxy.setOnClickListener(captureImageViewHolder.itemView, new b());
                return;
            }
            adapterPosition--;
        }
        pei W = W(adapterPosition);
        if (W != null) {
            captureImageViewHolder.c0(W);
            ViewProxy.setOnClickListener(captureImageViewHolder.itemView, new c(W, adapterPosition, this));
        }
    }

    /* renamed from: Z */
    public CaptureImageViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CaptureImageViewHolder) ipChange.ipc$dispatch("8e797932", new Object[]{this, viewGroup, new Integer(i)});
        }
        ckf.g(viewGroup, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        agh.h(TAG, "onCreateViewHolder");
        return new CaptureImageViewHolder(viewGroup.getContext(), this.c, this.d, this.b, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.feis_capture_item_album_image, viewGroup, false));
    }
}
