package tb;

import android.app.Activity;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.data.DetailDataManager;
import com.taobao.android.detail2.core.framework.view.feeds.VerticalAbsViewHolder;
import com.taobao.android.detail2.core.framework.view.manager.ListViewManager;
import java.util.List;
import tb.r19;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ocf implements ListViewManager.h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final dh7 f25298a;
    public final DetailDataManager b;
    public final List<sxj> c;
    public final cxj d;
    public long e;
    public boolean f = false;
    public boolean g = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a extends ja7 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/instancelistener/listview/InstanceListViewManagerListener$1");
        }

        @Override // tb.ja7
        public long a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("638dfb32", new Object[]{this})).longValue();
            }
            return 2L;
        }

        @Override // tb.ja7
        public String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d0a42b93", new Object[]{this});
            }
            return "InstanceList fetchRecommendListForNextPage";
        }

        @Override // tb.ja7
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9425d337", new Object[]{this});
                return;
            }
            x3w x3wVar = ocf.this.f25298a.K().get(ocf.this.f25298a.K().size() - 1);
            if (x3wVar != null) {
                o2r.a("fetchRecommendListForNextPage 1");
                ocf.this.b.t(x3wVar.h, true);
                o2r.b();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b extends r19.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ x3w b;
        public final /* synthetic */ int c;

        public b(x3w x3wVar, int i) {
            this.b = x3wVar;
            this.c = i;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/instancelistener/listview/InstanceListViewManagerListener$2");
        }

        @Override // tb.r19.e
        public int b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ac3af443", new Object[]{this})).intValue();
            }
            return this.c;
        }

        @Override // tb.r19.e
        public String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d0a42b93", new Object[]{this});
            }
            return "doUpdateFixUI";
        }

        @Override // tb.r19.e
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9425d337", new Object[]{this});
            } else if (e() >= ocf.e(ocf.this)) {
                ocf.f(ocf.this, this.b);
            }
        }
    }

    static {
        t2o.a(352321862);
        t2o.a(352322047);
    }

    public ocf(cxj cxjVar, dh7 dh7Var, DetailDataManager detailDataManager, List<sxj> list) {
        this.f25298a = dh7Var;
        this.b = detailDataManager;
        this.d = cxjVar;
        this.c = list;
    }

    public static /* synthetic */ long e(ocf ocfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e26133fb", new Object[]{ocfVar})).longValue();
        }
        return ocfVar.e;
    }

    public static /* synthetic */ void f(ocf ocfVar, x3w x3wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4ea7fa5", new Object[]{ocfVar, x3wVar});
        } else {
            ocfVar.g(x3wVar);
        }
    }

    @Override // com.taobao.android.detail2.core.framework.view.manager.ListViewManager.h
    public void a(VerticalAbsViewHolder verticalAbsViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c7e193e", new Object[]{this, verticalAbsViewHolder});
            return;
        }
        for (sxj sxjVar : this.c) {
            if (sxjVar != null) {
                sxjVar.a(verticalAbsViewHolder);
            }
        }
    }

    @Override // com.taobao.android.detail2.core.framework.view.manager.ListViewManager.h
    public void c(VerticalAbsViewHolder verticalAbsViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a0182d5", new Object[]{this, verticalAbsViewHolder});
        } else if (verticalAbsViewHolder != null && verticalAbsViewHolder.t0() != null) {
            if (verticalAbsViewHolder.t0().f31127a != 0 || !verticalAbsViewHolder.t0().z) {
                for (sxj sxjVar : this.c) {
                    if (sxjVar != null) {
                        sxjVar.c(verticalAbsViewHolder);
                    }
                }
                if (verticalAbsViewHolder.W0()) {
                    m(verticalAbsViewHolder.t0(), verticalAbsViewHolder.u0());
                }
            }
        }
    }

    @Override // com.taobao.android.detail2.core.framework.view.manager.ListViewManager.h
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("838a6daa", new Object[]{this});
            return;
        }
        x3w z = this.f25298a.z(0);
        if (!(z == null || z.z)) {
            x3w J = this.f25298a.J();
            if (J != null) {
                this.b.t(J.h, true);
            }
            for (sxj sxjVar : this.c) {
                if (sxjVar != null) {
                    sxjVar.d();
                }
            }
        }
    }

    public final void g(x3w x3wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d1741af", new Object[]{this, x3wVar});
            return;
        }
        this.f25298a.u0(x3wVar);
        l(x3wVar);
        k(x3wVar);
    }

    public final void h(x3w x3wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("781a6db5", new Object[]{this, x3wVar});
        } else {
            l(x3wVar);
        }
    }

    public final com.taobao.android.detail2.core.framework.data.global.a i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail2.core.framework.data.global.a) ipChange.ipc$dispatch("4acc6a70", new Object[]{this});
        }
        return this.d.j();
    }

    public final byj j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byj) ipChange.ipc$dispatch("75ad75a4", new Object[]{this});
        }
        return i().N();
    }

    public final void k(x3w x3wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7fa68e8", new Object[]{this, x3wVar});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("index", (Object) Integer.valueOf(x3wVar.f31127a));
        jSONObject.put("position", (Object) Integer.valueOf(this.f25298a.V(x3wVar.h)));
        jSONObject.put(VerticalAbsViewHolder.KEY_CURRENT_SHOW_INDEX, (Object) Integer.valueOf(this.f25298a.C()));
        jSONObject.putAll(x3wVar.E());
        this.f25298a.L0("pageLayerScrollRefresh", jSONObject);
    }

    public final void l(x3w x3wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f5f08b0", new Object[]{this, x3wVar});
        } else if (x3wVar != null) {
            this.d.h().updateBatteryBarDarkMode(x3wVar.S());
        }
    }

    public final void m(x3w x3wVar, int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a2bb03f", new Object[]{this, x3wVar, new Integer(i)});
        } else if (r19.B0()) {
            if (i != 0) {
                this.f = true;
                i2 = r19.j0();
            } else if (this.f) {
                i2 = r19.j0();
            } else if (r19.T0()) {
                i2 = r19.j0() / 20;
                if (!this.g) {
                    h(x3wVar);
                }
            } else if (this.g) {
                i2 = (r19.j0() * 2) + 1;
            } else {
                h(x3wVar);
                i2 = r19.j0() * 2;
            }
            this.g = true;
            b bVar = new b(x3wVar, i2);
            this.e = bVar.e();
            r19.e(bVar);
        } else {
            this.e = 2147483647L;
            g(x3wVar);
        }
    }

    @Override // com.taobao.android.detail2.core.framework.view.manager.ListViewManager.h
    public void b(VerticalAbsViewHolder verticalAbsViewHolder) {
        x3w x3wVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de29b8d4", new Object[]{this, verticalAbsViewHolder});
        } else if (verticalAbsViewHolder != null && verticalAbsViewHolder.t0() != null) {
            if (verticalAbsViewHolder.t0().f31127a != 0 || !verticalAbsViewHolder.t0().z) {
                txj.e(txj.TAG_REALTIME, "当前上屏：" + verticalAbsViewHolder.t0().h);
                int W = this.f25298a.W(verticalAbsViewHolder.t0().h, verticalAbsViewHolder.t0().f31127a);
                int size = (this.f25298a.K().size() - W) - 1;
                Activity i = this.d.i();
                txj.d(i, txj.TAG_RENDER, "onItemRender--->currentPosition: " + verticalAbsViewHolder.t0().f31127a + ", distance: " + size + ", currentId: " + verticalAbsViewHolder.t0().h);
                if (size <= i().O()) {
                    if (this.d.l() == null || !this.d.l().e() || !this.d.j().N().i()) {
                        x3w x3wVar2 = this.f25298a.K().get(this.f25298a.K().size() - 1);
                        if (x3wVar2 != null) {
                            o2r.a("fetchRecommendListForNextPage 2");
                            this.b.t(x3wVar2.h, true);
                            o2r.b();
                        }
                    } else {
                        this.d.l().b(new a());
                    }
                }
                if (i().h() && W <= j().R() && this.f25298a.K() != null && this.f25298a.K().size() > 0 && (x3wVar = this.f25298a.K().get(0)) != null) {
                    this.b.u(x3wVar.h, true, true);
                }
                for (sxj sxjVar : this.c) {
                    if (sxjVar != null) {
                        sxjVar.b(verticalAbsViewHolder);
                    }
                }
                m(verticalAbsViewHolder.t0(), verticalAbsViewHolder.u0());
            }
        }
    }
}
