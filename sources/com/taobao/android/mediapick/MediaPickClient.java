package com.taobao.android.mediapick;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.mediapick.IMediaPickClient;
import com.taobao.android.mediapick.media.Media;
import com.taobao.android.mediapick.widget.MRecyclerView;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.a9d;
import tb.e5w;
import tb.g1e;
import tb.h87;
import tb.n27;
import tb.sjc;
import tb.t2o;
import tb.wie;
import tb.xnc;
import tb.ys9;
import tb.zkp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class MediaPickClient implements IMediaPickClient {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "MediaPickClient";

    /* renamed from: a  reason: collision with root package name */
    public final Activity f8892a;
    public RecyclerView b;
    public MediaListAdapter c;
    public MRecyclerView.MGridLayoutManager d;
    public MRecyclerView.MLinearLayoutManager e;
    public IMediaPickClient.PickMode f;
    public int h;
    public zkp j;
    public IMediaPickClient.a k;
    public RecyclerView.ItemDecoration q;
    public static final g1e sDefaultToast = new h87();
    public static final xnc sDefaultLogger = new n27();
    public IMediaPickClient.b g = IMediaPickClient.b.g;
    public List<Media> i = new ArrayList();
    public g1e l = sDefaultToast;
    public xnc m = sDefaultLogger;
    public a9d n = null;
    public final Handler o = new Handler(Looper.getMainLooper());
    public final IMediaPickClient.a p = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements IMediaPickClient.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.android.mediapick.IMediaPickClient.a
        public void a(Media media, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15d93e87", new Object[]{this, media, new Integer(i)});
            } else if (MediaPickClient.r(MediaPickClient.this) != null) {
                MediaPickClient.r(MediaPickClient.this).a(media, i);
            }
        }

        @Override // com.taobao.android.mediapick.IMediaPickClient.a
        public void b(Media media, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3b062d24", new Object[]{this, media, new Integer(i)});
            } else if (MediaPickClient.r(MediaPickClient.this) != null) {
                MediaPickClient.r(MediaPickClient.this).b(media, i);
            }
        }

        @Override // com.taobao.android.mediapick.IMediaPickClient.a
        public void c(Media media, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9287594b", new Object[]{this, media, new Integer(i)});
            } else if (MediaPickClient.r(MediaPickClient.this) != null) {
                MediaPickClient.r(MediaPickClient.this).c(media, i);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.taobao.android.mediapick.b f8895a;

        public b(com.taobao.android.mediapick.b bVar) {
            this.f8895a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            MediaPickClient.s(MediaPickClient.this).W(this.f8895a);
            this.f8895a.b();
        }
    }

    static {
        t2o.a(519045138);
        t2o.a(519045130);
    }

    public MediaPickClient(Activity activity) {
        this.f8892a = activity;
        A();
    }

    public static /* synthetic */ IMediaPickClient.a r(MediaPickClient mediaPickClient) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMediaPickClient.a) ipChange.ipc$dispatch("2f7fa136", new Object[]{mediaPickClient});
        }
        return mediaPickClient.k;
    }

    public static /* synthetic */ MediaListAdapter s(MediaPickClient mediaPickClient) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaListAdapter) ipChange.ipc$dispatch("85c7853b", new Object[]{mediaPickClient});
        }
        return mediaPickClient.c;
    }

    public static IMediaPickClient t(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMediaPickClient) ipChange.ipc$dispatch("41396162", new Object[]{activity});
        }
        return new MediaPickClient(activity);
    }

    public static IMediaPickClient u(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMediaPickClient) ipChange.ipc$dispatch("de95ca47", new Object[]{recyclerView});
        }
        return new MediaPickClient(recyclerView);
    }

    public final void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        if (this.b == null) {
            MRecyclerView mRecyclerView = new MRecyclerView(this.f8892a, this);
            this.b = mRecyclerView;
            mRecyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        }
        this.d = new MRecyclerView.MGridLayoutManager(this.f8892a, 4, this);
        this.e = new MRecyclerView.MLinearLayoutManager(this.f8892a, 0, false, this);
        ((DefaultItemAnimator) this.b.getItemAnimator()).setSupportsChangeAnimations(false);
        MediaListAdapter mediaListAdapter = new MediaListAdapter(this);
        this.c = mediaListAdapter;
        mediaListAdapter.U(wie.class);
        this.c.U(e5w.class);
        this.c.U(ys9.class);
        this.b.setAdapter(this.c);
        f(IMediaPickClient.b.g);
        h(9);
        j(IMediaPickClient.PickMode.MULTIP);
    }

    public final void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8e0e324", new Object[]{this});
            return;
        }
        zkp zkpVar = this.j;
        if (zkpVar == null) {
            c();
            return;
        }
        Iterator it = ((ArrayList) zkpVar.b).iterator();
        while (it.hasNext()) {
            ((IMediaPickClient) it.next()).c();
        }
    }

    @Override // com.taobao.android.mediapick.IMediaPickClient
    public <T extends Media> boolean a(T t, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b076b4a", new Object[]{this, t, new Integer(i)})).booleanValue();
        }
        return B(t, i);
    }

    @Override // com.taobao.android.mediapick.IMediaPickClient
    public List<Media> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("cf494794", new Object[]{this});
        }
        return this.i;
    }

    @Override // com.taobao.android.mediapick.IMediaPickClient
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72676f2a", new Object[]{this});
            return;
        }
        MediaListAdapter mediaListAdapter = this.c;
        if (mediaListAdapter != null && mediaListAdapter.P() != null && this.c.P().d() != null) {
            MediaListAdapter mediaListAdapter2 = this.c;
            mediaListAdapter2.notifyItemRangeChanged(0, mediaListAdapter2.P().d().size());
        }
    }

    @Override // com.taobao.android.mediapick.IMediaPickClient
    public boolean d(zkp zkpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0978a5a", new Object[]{this, zkpVar})).booleanValue();
        }
        if (zkpVar == null || this.i.size() > 0) {
            return false;
        }
        this.j = zkpVar;
        this.i = zkpVar.f32840a;
        return true;
    }

    @Override // com.taobao.android.mediapick.IMediaPickClient
    public void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1ec5210", new Object[]{this, new Integer(i)});
            return;
        }
        MediaListAdapter mediaListAdapter = this.c;
        if (mediaListAdapter != null) {
            mediaListAdapter.notifyItemChanged(i);
        }
    }

    @Override // com.taobao.android.mediapick.IMediaPickClient
    @Deprecated
    public void f(IMediaPickClient.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb1b3a96", new Object[]{this, bVar});
        } else {
            l(bVar);
        }
    }

    @Override // com.taobao.android.mediapick.IMediaPickClient
    public void g(IMediaPickClient.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29cf7a96", new Object[]{this, aVar});
        } else {
            this.k = aVar;
        }
    }

    @Override // com.taobao.android.mediapick.IMediaPickClient
    public com.taobao.android.mediapick.b getDataSource() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.mediapick.b) ipChange.ipc$dispatch("3c1e48a0", new Object[]{this});
        }
        return this.c.P();
    }

    @Override // com.taobao.android.mediapick.IMediaPickClient
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.b;
    }

    @Override // com.taobao.android.mediapick.IMediaPickClient
    public void h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2dcacf0", new Object[]{this, new Integer(i)});
        } else {
            this.h = i;
        }
    }

    @Override // com.taobao.android.mediapick.IMediaPickClient
    public void i(com.taobao.android.mediapick.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc3ed360", new Object[]{this, bVar});
            return;
        }
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.stopScroll();
        }
        this.o.post(new b(bVar));
    }

    @Override // com.taobao.android.mediapick.IMediaPickClient
    public void j(IMediaPickClient.PickMode pickMode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb2d2618", new Object[]{this, pickMode});
        } else {
            this.f = pickMode;
        }
    }

    @Override // com.taobao.android.mediapick.IMediaPickClient
    public void k(xnc xncVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab78241e", new Object[]{this, xncVar});
        } else if (xncVar != null) {
            this.m = xncVar;
        }
    }

    @Override // com.taobao.android.mediapick.IMediaPickClient
    public void l(final IMediaPickClient.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee85d36c", new Object[]{this, bVar});
            return;
        }
        if (bVar.e) {
            this.b.setLayoutManager(this.e);
            this.e.setReverseLayout(false);
            this.e.y(bVar.d);
        } else {
            this.b.setLayoutManager(this.d);
            this.d.setSpanCount(bVar.f8888a);
            this.d.setReverseLayout(false);
            this.d.y(bVar.d);
        }
        this.b.setBackgroundColor(bVar.b);
        RecyclerView.ItemDecoration itemDecoration = this.q;
        if (itemDecoration != null) {
            this.b.removeItemDecoration(itemDecoration);
        }
        RecyclerView.ItemDecoration itemDecoration2 = new RecyclerView.ItemDecoration(this) { // from class: com.taobao.android.mediapick.MediaPickClient.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/mediapick/MediaPickClient$2");
            }

            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("84db4eca", new Object[]{this, rect, view, recyclerView, state});
                    return;
                }
                int i = bVar.c;
                rect.set(i, i, i, i);
            }
        };
        this.q = itemDecoration2;
        this.b.addItemDecoration(itemDecoration2);
        this.g = bVar;
    }

    @Override // com.taobao.android.mediapick.IMediaPickClient
    public void m(a9d a9dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ac7fc40", new Object[]{this, a9dVar});
        } else {
            this.n = a9dVar;
        }
    }

    @Override // com.taobao.android.mediapick.IMediaPickClient
    public void n(Class<? extends com.taobao.android.mediapick.a> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cddaf811", new Object[]{this, cls});
        } else {
            this.c.U(cls);
        }
    }

    @Override // com.taobao.android.mediapick.IMediaPickClient
    public <T extends Media> boolean o(T t, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2347f03", new Object[]{this, t, new Integer(i)})).booleanValue();
        }
        return C(t, i);
    }

    @Override // com.taobao.android.mediapick.IMediaPickClient
    public void p(sjc sjcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97d0f5ec", new Object[]{this, sjcVar});
        } else {
            this.c.X(sjcVar);
        }
    }

    @Override // com.taobao.android.mediapick.IMediaPickClient
    public void q(g1e g1eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f80a92", new Object[]{this, g1eVar});
        } else if (g1eVar != null) {
            this.l = g1eVar;
        }
    }

    public Activity v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("616f3928", new Object[]{this});
        }
        return this.f8892a;
    }

    public IMediaPickClient.a w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMediaPickClient.a) ipChange.ipc$dispatch("b507dfd4", new Object[]{this});
        }
        return this.p;
    }

    public xnc x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xnc) ipChange.ipc$dispatch("8bcbab6e", new Object[]{this});
        }
        return this.m;
    }

    public int y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c6f1bf5a", new Object[]{this})).intValue();
        }
        return this.h;
    }

    public IMediaPickClient.PickMode z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMediaPickClient.PickMode) ipChange.ipc$dispatch("4a79500", new Object[]{this});
        }
        return this.f;
    }

    public <T extends Media> boolean B(T t, int i) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("73619bde", new Object[]{this, t, new Integer(i)})).booleanValue();
        }
        a9d a9dVar = this.n;
        if (a9dVar != null && a9dVar.i(t)) {
            xnc xncVar = this.m;
            xncVar.w(TAG, "media:" + t + " pick event intercepted.");
            return false;
        } else if (IMediaPickClient.PickMode.MULTIP_REPEAT == z() || !b().contains(t)) {
            if (IMediaPickClient.PickMode.SINGLE == z()) {
                if (b().size() > 0) {
                    Media media = b().get(0);
                    b().remove(media);
                    w().c(media, i);
                }
                b().clear();
            } else if (b().size() >= y()) {
                g1e g1eVar = this.l;
                Activity v = v();
                if (TextUtils.isEmpty(this.g.f)) {
                    str = Localization.q(R.string.gg_pub_max_selection_limit);
                } else {
                    str = this.g.f;
                }
                g1eVar.a(v, String.format(str, Integer.valueOf(y())));
                return false;
            }
            b().add(t);
            w().b(t, i);
            D();
            return true;
        } else {
            xnc xncVar2 = this.m;
            xncVar2.w(TAG, "media:" + t + " has already picked.");
            return false;
        }
    }

    public <T extends Media> boolean C(T t, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f722cd7", new Object[]{this, t, new Integer(i)})).booleanValue();
        }
        if (!b().contains(t)) {
            xnc xncVar = this.m;
            xncVar.w(TAG, "media:" + t + " not in picked list, unpick failed!");
            return false;
        }
        b().remove(t);
        w().c(t, i);
        D();
        return true;
    }

    public MediaPickClient(RecyclerView recyclerView) {
        this.b = recyclerView;
        this.f8892a = (Activity) recyclerView.getContext();
        A();
    }
}
