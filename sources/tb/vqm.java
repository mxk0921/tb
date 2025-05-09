package tb;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.engine.CartVEngine;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class vqm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final vc3 f30182a;
    public c c;
    public boolean d;
    public int e;
    public boolean b = false;
    public boolean f = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a extends ux {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ux f30183a;

        public a(ux uxVar) {
            this.f30183a = uxVar;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/data/PrefetchNextPageManager$1");
        }

        @Override // tb.ojd
        public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ddd7a0a5", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
                return;
            }
            vqm.a(vqm.this, false);
            ux uxVar = this.f30183a;
            if (uxVar != null) {
                uxVar.a(i, mtopResponse, obj, z, map);
            }
        }

        @Override // tb.ojd
        public void b(int i, MtopResponse mtopResponse, Object obj, fsb fsbVar, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e4ca5d12", new Object[]{this, new Integer(i), mtopResponse, obj, fsbVar, map});
                return;
            }
            vqm.a(vqm.this, true);
            ux uxVar = this.f30183a;
            if (uxVar != null) {
                uxVar.b(i, mtopResponse, obj, fsbVar, map);
            }
        }

        @Override // tb.ux
        public void h(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8700e9de", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            vqm.a(vqm.this, false);
            ux uxVar = this.f30183a;
            if (uxVar != null) {
                uxVar.h(i, mtopResponse, obj);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b extends ux {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -636794163) {
                super.k((fsb) objArr[0]);
                return null;
            } else if (hashCode == 1660067414) {
                super.m(((Number) objArr[0]).intValue(), (MtopResponse) objArr[1], objArr[2], (fsb) objArr[3], (Map) objArr[4]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/android/icart/core/data/PrefetchNextPageManager$2");
            }
        }

        @Override // tb.ojd
        public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ddd7a0a5", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
                return;
            }
            vqm.a(vqm.this, false);
            vqm.c(vqm.this);
        }

        @Override // tb.ojd
        public void b(int i, MtopResponse mtopResponse, Object obj, fsb fsbVar, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e4ca5d12", new Object[]{this, new Integer(i), mtopResponse, obj, fsbVar, map});
            } else {
                vqm.a(vqm.this, true);
            }
        }

        @Override // tb.ux
        public void h(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8700e9de", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            vqm.a(vqm.this, false);
            vqm.c(vqm.this);
        }

        @Override // tb.ux
        public void k(fsb fsbVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("da0b4acd", new Object[]{this, fsbVar});
                return;
            }
            super.k(fsbVar);
            vqm.b(vqm.this);
        }

        @Override // tb.ux
        public void m(int i, MtopResponse mtopResponse, Object obj, fsb fsbVar, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("62f29e56", new Object[]{this, new Integer(i), mtopResponse, obj, fsbVar, map});
                return;
            }
            super.m(i, mtopResponse, obj, fsbVar, map);
            vqm.d(vqm.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface c {
    }

    static {
        t2o.a(479199277);
    }

    public vqm(vc3 vc3Var) {
        this.f30182a = vc3Var;
    }

    public static /* synthetic */ void a(vqm vqmVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e70e2a2", new Object[]{vqmVar, new Boolean(z)});
        } else {
            vqmVar.j(z);
        }
    }

    public static /* synthetic */ void b(vqm vqmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e719ad1", new Object[]{vqmVar});
        } else {
            vqmVar.m();
        }
    }

    public static /* synthetic */ void c(vqm vqmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2adf9730", new Object[]{vqmVar});
        } else {
            vqmVar.k();
        }
    }

    public static /* synthetic */ void d(vqm vqmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c74d938f", new Object[]{vqmVar});
        } else {
            vqmVar.l();
        }
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b423a920", new Object[]{this})).booleanValue();
        }
        return this.f;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab58770c", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public void h(RecyclerView recyclerView, int i, int i2, boolean z) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("286e5fbe", new Object[]{this, recyclerView, new Integer(i), new Integer(i2), new Boolean(z)});
        } else if (!this.d && !z) {
            this.b = false;
        } else if (!this.b && i2 > 0 && this.f30182a.d().G()) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            if (linearLayoutManager.getChildCount() + linearLayoutManager.findFirstVisibleItemPosition() < linearLayoutManager.getItemCount() - this.e) {
                z2 = false;
            }
            if (!this.b && z2) {
                i(null);
            }
        }
    }

    public final void j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90c94d44", new Object[]{this, new Boolean(z)});
            return;
        }
        this.b = false;
        c cVar = this.c;
        if (cVar != null) {
            ((CartVEngine.t) cVar).a(z);
        }
    }

    public void n(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f3eef3a", new Object[]{this, new Boolean(z)});
            return;
        }
        this.f = z;
        hav.d(c9x.CART_BIZ_NAME, "hasDoFirstPageRequest=" + z);
    }

    public void o(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fa127ec", new Object[]{this, cVar});
        } else {
            this.c = cVar;
        }
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76a013fb", new Object[]{this});
        } else {
            ub3.m("AutoNextPage", "总耗时", false, 1.0f, null);
        }
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8be86176", new Object[]{this});
        } else {
            ub3.m("AutoNextPage", "总耗时", true, 0.5f, null);
        }
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeecad0f", new Object[]{this});
        } else {
            ub3.m("AutoNextPage", "网络请求前", true, 0.5f, null);
        }
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8db37777", new Object[]{this});
            return;
        }
        this.e = vav.e(c9x.CART_BIZ_NAME, na3.sPageScrollBottomLeftCountToPrefetch, 10);
        this.d = true;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c4fa623", new Object[]{this});
        } else if (this.b) {
            hav.d(c9x.CART_BIZ_NAME, "已经发起了滚动预请求，不再重复发起自动预请求");
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put(pl4.KEY_LOAD_TYPE, "首次自动");
            ub3.n("AutoNextPage", "总耗时", hashMap);
            ub3.n("AutoNextPage", "网络请求前", hashMap);
            hav.d(c9x.CART_BIZ_NAME, "自动预加载下一页");
            this.b = true;
            HashMap hashMap2 = new HashMap();
            hashMap2.put(RequestConfig.FIRST_PAGE_PRELOAD, "true");
            this.f30182a.f0(false, hashMap2, new b());
        }
    }

    public void i(ux uxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a68b55", new Object[]{this, uxVar});
        } else if (this.b) {
            hav.d(c9x.CART_BIZ_NAME, "正在预请求，不要重复做滚动预请求下一页");
        } else if (!this.f) {
            ub3.g("prefetchNextPageError", "首页请求还没有成功返回");
        } else {
            hav.d(c9x.CART_BIZ_NAME, "触发滚动预加载下一页");
            HashMap hashMap = new HashMap();
            hashMap.put(pl4.KEY_LOAD_TYPE, "滚动预加载");
            ub3.n("AutoNextPage", "总耗时", hashMap);
            ub3.n("AutoNextPage", "网络请求前", hashMap);
            this.b = true;
            this.f30182a.f0(false, null, new a(uxVar));
        }
    }
}
