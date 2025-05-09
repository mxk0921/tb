package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import com.taobao.themis.kernel.metaInfo.manifest.AppManifest;
import com.taobao.themis.kernel.page.ITMSPage;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import tb.cqc;
import tb.xgv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class pzh implements cqc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public ygv c;
    public ITMSPage d;
    public Pair<Integer, ? extends Map<String, List<String>>> i;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f26409a = new AtomicBoolean(false);
    public final xgv b = new xgv();
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final AtomicBoolean f = new AtomicBoolean(false);
    public final CopyOnWriteArrayList<cqc.c> g = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<cqc.b> h = new CopyOnWriteArrayList<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(848298032);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements xgv.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ cqc.d b;

        public b(cqc.d dVar) {
            this.b = dVar;
        }

        @Override // tb.xgv.a
        public void a(ygv ygvVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("65eed106", new Object[]{this, ygvVar});
                return;
            }
            ckf.g(ygvVar, "loadInfo");
            pzh.f(pzh.this, ygvVar);
            cqc.d dVar = this.b;
            if (dVar != null) {
                dVar.a(ygvVar);
            }
        }

        @Override // tb.xgv.a
        public void b(int i, Map<String, List<String>> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ccf1979", new Object[]{this, new Integer(i), map});
                return;
            }
            pzh.a(pzh.this, i, map);
            if (200 > i || i >= 300) {
                pzh.g(pzh.this, new ygv());
            }
            cqc.d dVar = this.b;
            if (dVar != null) {
                dVar.b(i, map);
            }
        }

        @Override // tb.xgv.a
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ba473049", new Object[]{this});
            } else {
                xgv.a.C1100a.a(this);
            }
        }

        @Override // tb.xgv.a
        public void onError(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7a671c9d", new Object[]{this, new Integer(i), str});
                return;
            }
            pzh.f(pzh.this, new ygv());
            cqc.d dVar = this.b;
            if (dVar != null) {
                dVar.onError(i, str);
            }
        }

        @Override // tb.xgv.a
        public void onResponse(int i, Map<String, List<String>> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bb214fe9", new Object[]{this, new Integer(i), map});
            } else {
                xgv.a.C1100a.b(this, i, map);
            }
        }
    }

    static {
        t2o.a(848298031);
        t2o.a(839909617);
    }

    public static final /* synthetic */ void a(pzh pzhVar, int i, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fa33c5", new Object[]{pzhVar, new Integer(i), map});
        } else {
            pzhVar.l(i, map);
        }
    }

    public static final /* synthetic */ void f(pzh pzhVar, ygv ygvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a24c98b5", new Object[]{pzhVar, ygvVar});
        } else {
            pzhVar.n(ygvVar);
        }
    }

    public static final /* synthetic */ void g(pzh pzhVar, ygv ygvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64261c7", new Object[]{pzhVar, ygvVar});
        } else {
            pzhVar.c = ygvVar;
        }
    }

    @Override // tb.cqc
    public boolean A0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c702dc7f", new Object[]{this})).booleanValue();
        }
        return this.f26409a.get();
    }

    @Override // tb.z5d
    public void G(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fea6c5d4", new Object[]{this, iTMSPage});
            return;
        }
        ckf.g(iTMSPage, "page");
        this.d = iTMSPage;
    }

    @Override // tb.cqc
    public void Q(cqc.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bac576ad", new Object[]{this, cVar});
            return;
        }
        ckf.g(cVar, DataReceiveMonitor.CB_LISTENER);
        if (this.e.get()) {
            ygv ygvVar = this.c;
            ckf.d(ygvVar);
            cVar.a(ygvVar);
            return;
        }
        this.g.add(cVar);
    }

    @Override // tb.z5d
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("896696a2", new Object[]{this});
            return;
        }
        this.b.j();
        this.g.clear();
        this.h.clear();
    }

    @Override // tb.cqc
    public void e1(String str, String str2, String str3, Boolean bool, cqc.d dVar, Boolean bool2) {
        String str4;
        String str5;
        String str6;
        boolean z;
        bbs instance;
        TMSMetaInfoWrapper U;
        AppManifest r;
        ccs pageParams;
        unl e;
        ccs pageParams2;
        unl e2;
        ccs pageParams3;
        unl e3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4827bcb", new Object[]{this, str, str2, str3, bool, dVar, bool2});
        } else if (!this.f26409a.get()) {
            Boolean bool3 = null;
            if (str == null) {
                ITMSPage iTMSPage = this.d;
                if (iTMSPage == null || (pageParams3 = iTMSPage.getPageParams()) == null || (e3 = pageParams3.e()) == null) {
                    str4 = null;
                } else {
                    str4 = e3.k();
                }
            } else {
                str4 = str;
            }
            if (str4 != null) {
                if (str2 == null) {
                    ITMSPage iTMSPage2 = this.d;
                    if (iTMSPage2 == null || (pageParams2 = iTMSPage2.getPageParams()) == null || (e2 = pageParams2.e()) == null) {
                        str5 = null;
                    } else {
                        str5 = e2.l();
                    }
                } else {
                    str5 = str2;
                }
                if (str3 == null) {
                    ITMSPage iTMSPage3 = this.d;
                    if (iTMSPage3 == null || (pageParams = iTMSPage3.getPageParams()) == null || (e = pageParams.e()) == null) {
                        str6 = null;
                    } else {
                        str6 = e.j();
                    }
                } else {
                    str6 = str3;
                }
                this.f26409a.set(true);
                xgv xgvVar = this.b;
                if (bool == null) {
                    ITMSPage iTMSPage4 = this.d;
                    if (!(iTMSPage4 == null || (instance = iTMSPage4.getInstance()) == null || (U = instance.U()) == null || (r = U.r()) == null)) {
                        bool3 = Boolean.valueOf(r.getPreset());
                    }
                } else {
                    bool3 = bool;
                }
                if (bool3 == null) {
                    z = false;
                } else {
                    z = bool3.booleanValue();
                }
                xgv.m(xgvVar, str4, str5, null, str6, false, z, bool2, new b(dVar), 20, null);
            }
        }
    }

    public void h(cqc.b bVar) {
        Pair<Integer, ? extends Map<String, List<String>>> pair;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe82ce1f", new Object[]{this, bVar});
            return;
        }
        ckf.g(bVar, DataReceiveMonitor.CB_LISTENER);
        if (!this.f.get() || (pair = this.i) == null) {
            this.h.add(bVar);
            return;
        }
        ckf.d(pair);
        int intValue = pair.getFirst().intValue();
        Pair<Integer, ? extends Map<String, List<String>>> pair2 = this.i;
        ckf.d(pair2);
        bVar.a(intValue, (Map) pair2.getSecond());
    }

    @Override // tb.cqc
    public void invalid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c71da2fe", new Object[]{this});
        } else if (A0()) {
            this.b.j();
        }
    }

    public final void l(int i, Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0a9d3df", new Object[]{this, new Integer(i), map});
            return;
        }
        this.i = new Pair<>(Integer.valueOf(i), map);
        this.f.set(true);
        for (cqc.b bVar : this.h) {
            bVar.a(i, map);
        }
        this.h.clear();
    }

    public final void n(ygv ygvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a03d1edb", new Object[]{this, ygvVar});
            return;
        }
        this.c = ygvVar;
        this.e.set(true);
        for (cqc.c cVar : this.g) {
            cVar.a(ygvVar);
        }
        this.g.clear();
    }

    public void s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38c2816", new Object[]{this, str});
            return;
        }
        ckf.g(str, "renderer");
        this.b.n(str);
    }

    @Override // tb.z5d
    public void w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fc5065a", new Object[]{this});
        } else {
            cqc.a.a(this);
        }
    }

    public void r(ygv ygvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6045d747", new Object[]{this, ygvVar});
            return;
        }
        ckf.g(ygvVar, "loadInfo");
        this.f26409a.set(true);
        n(ygvVar);
    }
}
