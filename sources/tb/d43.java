package tb;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.dynamic.bottom.album.CaptureAlbumView;
import com.huawei.hms.android.SystemUtils;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import tb.z7n;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class d43 extends mz1<CaptureAlbumView> implements z7n.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public z7n e;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean m;
    public final ExecutorService p;
    public final String c = "CaptureAlbumPresenter";
    public final tj0 d = new tj0(new ArrayList(), new LinkedList());
    public volatile long f = -1;
    public final Handler g = new Handler(Looper.getMainLooper());
    public int h = -2;
    public boolean l = true;
    public final String n = "PltMediaPermissionRequestTime";
    public final boolean o = lg4.v();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements qqt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f17564a;

        @Override // tb.qqt
        public String newThreadName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this});
            }
            StringBuilder sb = new StringBuilder("plt_album_");
            sb.append(hashCode());
            sb.append('_');
            int i = this.f17564a;
            this.f17564a = 1 + i;
            sb.append(i);
            return sb.toString();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class a<T> implements Comparator {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public static final a<T> INSTANCE = new a<>();

            /* renamed from: a */
            public final int compare(pei peiVar, pei peiVar2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("c70679ad", new Object[]{this, peiVar, peiVar2})).intValue();
                }
                return (int) (peiVar2.c() - peiVar.c());
            }
        }

        public b() {
        }

        /* compiled from: Taobao */
        /* renamed from: tb.d43$b$b  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class RunnableC0901b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ d43 f17566a;
            public final /* synthetic */ List<pei> b;

            public RunnableC0901b(d43 d43Var, List<pei> list) {
                this.f17566a = d43Var;
                this.b = list;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i = 0;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                zs9 n0 = ((CaptureAlbumView) d43.D(this.f17566a)).n0();
                zs9 d = this.f17566a.F().d();
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                for (pei peiVar : this.b) {
                    String b = rdi.INSTANCE.b(peiVar);
                    if (!TextUtils.isEmpty(b)) {
                        String str = null;
                        if (peiVar.p()) {
                            String g = peiVar.g();
                            ckf.f(g, "mediaItem.path");
                            if (!tsq.w(g, ryp.FILE_TYPE_VIDEO_MP4, false, 2, null)) {
                            }
                        }
                        if (peiVar.p()) {
                            i5++;
                        }
                        i2++;
                        if (peiVar.m()) {
                            i3++;
                            this.f17566a.F().e().addFirst(peiVar);
                        }
                        if (n0 != null) {
                            str = n0.h();
                        }
                        if (ckf.b(b, str)) {
                            i4++;
                            n0.f().addFirst(peiVar);
                            if (peiVar.p()) {
                                n0.i().addFirst(peiVar);
                            }
                        } else {
                            zs9 c = this.f17566a.F().c(b);
                            if (c == null) {
                                zs9 zs9Var = new zs9(b);
                                zs9Var.f().add(peiVar);
                                if (peiVar.p()) {
                                    zs9Var.i().add(peiVar);
                                }
                                this.f17566a.F().b().add(zs9Var);
                            } else {
                                c.b(peiVar);
                            }
                        }
                        if (d != null) {
                            d.b(peiVar);
                        }
                    }
                }
                int o0 = ((CaptureAlbumView) d43.D(this.f17566a)).o0();
                if (ckf.b(d, n0)) {
                    i = i2;
                } else if (o0 == 2) {
                    i = i3;
                } else if (o0 == 1) {
                    i = i5;
                } else if (i4 > 0) {
                    i = i4;
                }
                ((CaptureAlbumView) d43.D(this.f17566a)).q0(i);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ArrayList arrayList = new ArrayList();
            Activity I = ((CaptureAlbumView) d43.D(d43.this)).I();
            ckf.f(I, "view.activity");
            List<pei> i = rdi.i(I, true, d43.C(d43.this));
            if (!i.isEmpty()) {
                arrayList.addAll(i);
            }
            Activity I2 = ((CaptureAlbumView) d43.D(d43.this)).I();
            ckf.f(I2, "view.activity");
            List<pei> i2 = rdi.i(I2, false, d43.C(d43.this));
            if (!i2.isEmpty()) {
                arrayList.addAll(i2);
                z = true;
            }
            d43.E(d43.this, -1L);
            if (!arrayList.isEmpty()) {
                if (z) {
                    c04.u(arrayList, a.INSTANCE);
                }
                d43.y(d43.this).post(new RunnableC0901b(d43.this, arrayList));
            }
        }
    }

    static {
        t2o.a(481296551);
        t2o.a(481296471);
    }

    public d43() {
        ExecutorService newFixedThreadPool = VExecutors.newFixedThreadPool(2, new a());
        ckf.f(newFixedThreadPool, "newFixedThreadPool(2, ob…count++}\"\n      }\n\n    })");
        this.p = newFixedThreadPool;
    }

    public static final /* synthetic */ long C(d43 d43Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("25dc4b6", new Object[]{d43Var})).longValue();
        }
        return d43Var.f;
    }

    public static final /* synthetic */ d32 D(d43 d43Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d32) ipChange.ipc$dispatch("d6d36e6e", new Object[]{d43Var});
        }
        return d43Var.f24401a;
    }

    public static final /* synthetic */ void E(d43 d43Var, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adc501b6", new Object[]{d43Var, new Long(j)});
        } else {
            d43Var.f = j;
        }
    }

    public static /* synthetic */ Object ipc$super(d43 d43Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.v();
                return null;
            case -1504501726:
                super.q();
                return null;
            case 267248023:
                super.n();
                return null;
            case 797441118:
                super.s();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/bottom/album/CaptureAlbumPresenter");
        }
    }

    public static final /* synthetic */ Handler y(d43 d43Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("652a64ce", new Object[]{d43Var});
        }
        return d43Var.g;
    }

    @Override // tb.z7n.c
    public void A(List<pei> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6eb505dd", new Object[]{this, list});
        } else if (list != null && !list.isEmpty()) {
            this.d.e().addAll(list);
            ((CaptureAlbumView) this.f24401a).v0(this.d.e());
        }
    }

    @Override // tb.z7n.c
    public void B(zs9 zs9Var) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe27ad74", new Object[]{this, zs9Var});
        } else if (zs9Var != null) {
            if (this.d.b().size() == 0) {
                CaptureAlbumView captureAlbumView = (CaptureAlbumView) this.f24401a;
                if (this.h != -1) {
                    z = false;
                }
                captureAlbumView.r0(zs9Var, z, this.m);
                this.m = false;
            }
            this.d.b().add(zs9Var);
        }
    }

    public final tj0 F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tj0) ipChange.ipc$dispatch("e47f4911", new Object[]{this});
        }
        return this.d;
    }

    public final void G(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2847e9a", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            this.d.a();
            ((CaptureAlbumView) this.f24401a).y0();
        }
        ((CaptureAlbumView) this.f24401a).F0(true);
        if (this.l) {
            this.l = false;
            n73.k();
        }
        z7n z7nVar = new z7n(this, lg4.P4());
        this.e = z7nVar;
        this.p.submit(z7nVar);
    }

    public final void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8e23fb5", new Object[]{this});
        } else if (this.h == 0 && this.f > 0 && lg4.w()) {
            z7m.c(new b());
        }
    }

    public final void K(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4957101d", new Object[]{this, new Boolean(z)});
            return;
        }
        this.j = true;
        u7m.j(Localization.q(R.string.tao_search_request_album_explain), z, null);
    }

    public final void L() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb9abccb", new Object[]{this});
            return;
        }
        boolean c = u7m.c(((CaptureAlbumView) this.f24401a).I());
        int b2 = mno.b(((CaptureAlbumView) this.f24401a).I(), this.n, 0);
        if (c) {
            String str = Build.BRAND;
            if (ckf.b(str, SystemUtils.PRODUCT_HUAWEI) || ckf.b(str, SystemUtils.PRODUCT_HONOR)) {
                i = 1;
            } else {
                i = 2;
            }
            if (b2 < i) {
                u7m.a(((CaptureAlbumView) this.f24401a).I(), Localization.q(R.string.tao_search_request_album_explain), null);
                mno.f(((CaptureAlbumView) this.f24401a).I(), this.n, b2 + 1);
                return;
            }
            nmj.d(((CaptureAlbumView) this.f24401a).I(), 1);
            return;
        }
        u7m.a(((CaptureAlbumView) this.f24401a).I(), Localization.q(R.string.tao_search_request_album_explain), null);
        mno.f(((CaptureAlbumView) this.f24401a).I(), this.n, b2 + 1);
    }

    public final void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbb49c06", new Object[]{this});
            return;
        }
        this.k = true;
        nmj.d(((CaptureAlbumView) this.f24401a).I(), 1);
    }

    @Override // tb.mz1
    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        super.n();
        this.h = u7m.b(((CaptureAlbumView) this.f24401a).I());
    }

    @Override // tb.mz1
    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.q();
        this.f = System.currentTimeMillis();
        bk0.b().a();
        z7n z7nVar = this.e;
        if (z7nVar != null) {
            z7nVar.q();
        }
        this.g.removeCallbacksAndMessages(null);
    }

    @Override // tb.mz1
    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.s();
        this.f = System.currentTimeMillis();
    }

    @Override // tb.z7n.c
    public void t(zs9 zs9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9be6700", new Object[]{this, zs9Var});
        } else if (zs9Var != null) {
            ((CaptureAlbumView) this.f24401a).t0(zs9Var);
        }
    }

    @Override // tb.z7n.c
    public void z(pei peiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11010e6c", new Object[]{this, peiVar});
        } else if (this.o && peiVar != null) {
            H(peiVar);
        }
    }

    public final void H(pei peiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fd31d18", new Object[]{this, peiVar});
            return;
        }
        agh.h(this.c, "postFirstImageItem");
        if (peiVar != null) {
            try {
                if (!peiVar.p()) {
                    ((CaptureAlbumView) this.f24401a).m().m().i(((CaptureAlbumView) this.f24401a).I(), peiVar.b().toString(), peiVar.f(), ((CaptureAlbumView) this.f24401a).m(), peiVar.i(), new Rect(0, 0, caa.l(), caa.j()), true, ((CaptureAlbumView) this.f24401a).p().getPssource());
                }
            } catch (Exception e) {
                agh.r("PltCamera", this.c, agh.f("preprocessFirstImage", e));
            }
        }
    }

    @Override // tb.mz1
    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.v();
        if (!this.i) {
            this.i = true;
            int i = this.h;
            if (i == 0 || i == -1) {
                p7m.a(this.c, ckf.p("storage permission authorized, code:", Integer.valueOf(i)));
                G(false);
                if (this.h == -1) {
                    ((CaptureAlbumView) this.f24401a).A0(true);
                    return;
                }
                return;
            }
            TLogTracker.h(pzl.MONITOR_PERMISSION_REQUEST, "album permission denied");
            ((CaptureAlbumView) this.f24401a).E0(true);
            return;
        }
        int b2 = u7m.b(((CaptureAlbumView) this.f24401a).I());
        TLogTracker.f(mj4.CONTROL_ALBUM, pzl.MONITOR_PERMISSION_REQUEST, ckf.p("newPermissionState:", Integer.valueOf(b2)));
        if (b2 != -2 || this.h == -2) {
            if (b2 == 0) {
                if (this.h != 0) {
                    this.h = 0;
                    ((CaptureAlbumView) this.f24401a).A0(false);
                    G(true);
                } else {
                    I();
                }
            }
            if (b2 != -1) {
                return;
            }
            if (this.h != -1) {
                this.h = -1;
                ((CaptureAlbumView) this.f24401a).A0(true);
                this.m = true;
                G(true);
                return;
            }
            if (this.j) {
                this.m = true;
                G(true);
                this.j = false;
            }
            if (this.k) {
                ((CaptureAlbumView) this.f24401a).A0(false);
                this.k = false;
                return;
            }
            return;
        }
        this.h = -2;
        ((CaptureAlbumView) this.f24401a).E0(true);
        ((CaptureAlbumView) this.f24401a).A0(false);
    }
}
