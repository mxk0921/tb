package tb;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.tool.bottom.album.CaptureAlbumWidget;
import com.huawei.hms.android.SystemUtils;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import tb.z7n;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class b43 extends lz1<CaptureAlbumWidget> implements z7n.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public z7n c;
    public int f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean k;
    public final ExecutorService n;
    public final tj0 b = new tj0(new ArrayList(), new LinkedList());
    public volatile long d = -1;
    public final Handler e = new Handler(Looper.getMainLooper());
    public boolean j = true;
    public final String l = "PltMediaPermissionRequestTime";
    public final boolean m = lg4.v();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements qqt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f16170a;

        @Override // tb.qqt
        public String newThreadName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this});
            }
            StringBuilder sb = new StringBuilder("plt_album_");
            sb.append(hashCode());
            sb.append('_');
            int i = this.f16170a;
            this.f16170a = 1 + i;
            sb.append(i);
            return sb.toString();
        }
    }

    static {
        t2o.a(481296771);
        t2o.a(481296471);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b43(CaptureAlbumWidget captureAlbumWidget) {
        super(captureAlbumWidget);
        ckf.g(captureAlbumWidget, "widget");
        this.f = -2;
        ExecutorService newFixedThreadPool = VExecutors.newFixedThreadPool(2, new a());
        ckf.f(newFixedThreadPool, "newFixedThreadPool(2, ob…count++}\"\n      }\n\n    })");
        this.n = newFixedThreadPool;
        this.f = u7m.b(captureAlbumWidget.E());
    }

    public static final /* synthetic */ Handler N(b43 b43Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("587ebbab", new Object[]{b43Var});
        }
        return b43Var.e;
    }

    public static final /* synthetic */ long O(b43 b43Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("125ad1a5", new Object[]{b43Var})).longValue();
        }
        return b43Var.d;
    }

    public static final /* synthetic */ void P(b43 b43Var, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9ba783f", new Object[]{b43Var, new Long(j)});
        } else {
            b43Var.d = j;
        }
    }

    public static /* synthetic */ Object ipc$super(b43 b43Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1794064906) {
            super.K();
            return null;
        } else if (hashCode == 731174045) {
            super.J();
            return null;
        } else if (hashCode == 1083424568) {
            super.I();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/etao/feimagesearch/capture/tool/bottom/album/CaptureAlbumPresenter");
        }
    }

    @Override // tb.z7n.c
    public void A(List<pei> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6eb505dd", new Object[]{this, list});
        } else if (list != null && !list.isEmpty()) {
            this.b.e().addAll(list);
            G().W0(this.b.e());
        }
    }

    @Override // tb.z7n.c
    public void B(zs9 zs9Var) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe27ad74", new Object[]{this, zs9Var});
        } else if (zs9Var != null) {
            if (this.b.b().size() == 0) {
                CaptureAlbumWidget G = G();
                if (this.f != -1) {
                    z = false;
                }
                G.S0(zs9Var, z, this.k);
                this.k = false;
            }
            this.b.b().add(zs9Var);
        }
    }

    @Override // tb.lz1
    public void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4093bf38", new Object[]{this});
            return;
        }
        super.I();
        this.d = System.currentTimeMillis();
        bk0.b().a();
        z7n z7nVar = this.c;
        if (z7nVar != null) {
            z7nVar.q();
        }
        this.e.removeCallbacksAndMessages(null);
    }

    @Override // tb.lz1
    public void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b94d49d", new Object[]{this});
            return;
        }
        super.J();
        this.d = System.currentTimeMillis();
    }

    public final tj0 Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tj0) ipChange.ipc$dispatch("e47f4911", new Object[]{this});
        }
        return this.b;
    }

    public final void R(boolean z) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2847e9a", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            this.b.a();
            G().Y0();
        }
        G().e1(true);
        if (this.j) {
            this.j = false;
            n73.k();
        }
        if (G().Q0() || !lg4.P4()) {
            z2 = false;
        }
        z7n z7nVar = new z7n(this, z2);
        this.c = z7nVar;
        this.n.submit(z7nVar);
    }

    public final void S(pei peiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fd31d18", new Object[]{this, peiVar});
        } else {
            agh.h("CaptureAlbumPresenter", "postFirstImageItem");
        }
    }

    public final void T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8e23fb5", new Object[]{this});
        } else if (this.f == 0 && this.d > 0 && lg4.w()) {
            z7m.c(new f43(this));
        }
    }

    public final void U(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4957101d", new Object[]{this, new Boolean(z)});
            return;
        }
        this.h = true;
        u7m.j(Localization.q(R.string.tao_search_request_album_explain), z, null);
    }

    public final void V() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb9abccb", new Object[]{this});
            return;
        }
        boolean c = u7m.c(G().E());
        int b = mno.b(G().E(), this.l, 0);
        if (c) {
            String str = Build.BRAND;
            if (ckf.b(str, SystemUtils.PRODUCT_HUAWEI) || ckf.b(str, SystemUtils.PRODUCT_HONOR)) {
                i = 1;
            } else {
                i = 2;
            }
            if (b < i) {
                u7m.a(G().E(), Localization.q(R.string.tao_search_request_album_explain), null);
                mno.f(G().E(), this.l, b + 1);
                return;
            }
            nmj.d(G().E(), 1);
            return;
        }
        u7m.a(G().E(), Localization.q(R.string.tao_search_request_album_explain), null);
        mno.f(G().E(), this.l, b + 1);
    }

    public final void W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbb49c06", new Object[]{this});
            return;
        }
        this.i = true;
        nmj.d(G().E(), 1);
    }

    @Override // tb.z7n.c
    public void t(zs9 zs9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9be6700", new Object[]{this, zs9Var});
        } else if (zs9Var != null) {
            G().T0(zs9Var);
        }
    }

    @Override // tb.z7n.c
    public void z(pei peiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11010e6c", new Object[]{this, peiVar});
        } else if (this.m && peiVar != null) {
            S(peiVar);
        }
    }

    @Override // tb.lz1
    public void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9510bdf6", new Object[]{this});
            return;
        }
        super.K();
        if (!this.g) {
            this.g = true;
            int i = this.f;
            if (i == 0 || i == -1) {
                p7m.a("CaptureAlbumPresenter", ckf.p("storage permission authorized, code:", Integer.valueOf(i)));
                R(false);
                if (this.f == -1) {
                    G().Z0(true);
                    return;
                }
                return;
            }
            TLogTracker.h(pzl.MONITOR_PERMISSION_REQUEST, "album permission denied");
            G().d1(true);
            return;
        }
        int b = u7m.b(G().E());
        if (b != -2 || this.f == -2) {
            if (b == 0) {
                if (this.f != 0) {
                    this.f = 0;
                    G().Z0(false);
                    R(true);
                } else {
                    T();
                }
            }
            if (b != -1) {
                return;
            }
            if (this.f != -1) {
                this.f = -1;
                G().Z0(true);
                this.k = true;
                R(true);
                return;
            }
            if (this.h) {
                this.k = true;
                R(true);
                this.h = false;
            }
            if (this.i) {
                G().Z0(false);
                this.i = false;
                return;
            }
            return;
        }
        this.f = -2;
        G().d1(true);
        G().Z0(false);
    }
}
