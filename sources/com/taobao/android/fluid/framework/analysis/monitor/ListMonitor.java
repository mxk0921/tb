package com.taobao.android.fluid.framework.analysis.monitor;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.usertrack.ITrackService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.MediaMixContentDetail;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.fluid.framework.list.IFeedsListService;
import com.taobao.android.fluid.framework.list.render.MultiRecyclerViewAdapter;
import com.taobao.android.fluid.framework.list.view.LockableRecycerView;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import mtopsdk.mtop.domain.MtopResponse;
import tb.a6o;
import tb.akt;
import tb.bpk;
import tb.ir9;
import tb.jk;
import tb.o6d;
import tb.pep;
import tb.rg7;
import tb.sz3;
import tb.t2o;
import tb.uq9;
import tb.vn8;
import tb.yao;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ListMonitor extends RecyclerView.OnScrollListener implements LockableRecycerView.c, bpk, o6d, rg7.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final long g = akt.z2("list_monitor_drag_timeout", 3000);
    public static final int h = akt.w2("list_monitor_no_data_check_timeout", 15000);
    public final FluidContext b;
    public final IFeedsListService c;

    /* renamed from: a  reason: collision with root package name */
    public final b<Long> f7767a = new b<>(this, akt.w2("list_monitor_queue_size", 3));
    public final Set<String> d = new HashSet();
    public final Handler e = new Handler(Looper.getMainLooper());
    public final c f = new c();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b<E> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final LinkedList<E> f7768a = new LinkedList<>();
        public final int b;

        static {
            t2o.a(468713869);
        }

        public b(ListMonitor listMonitor, int i) {
            this.b = i;
        }

        public void a(E e) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ba2da84", new Object[]{this, e});
                return;
            }
            if (this.f7768a.size() >= this.b) {
                this.f7768a.removeFirst();
            }
            this.f7768a.addLast(e);
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            } else {
                this.f7768a.clear();
            }
        }

        public E c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (E) ipChange.ipc$dispatch("99af18d1", new Object[]{this});
            }
            return this.f7768a.getFirst();
        }

        public E d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (E) ipChange.ipc$dispatch("1fe5f5ff", new Object[]{this});
            }
            return this.f7768a.getLast();
        }

        public boolean e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("1ffb6ee4", new Object[]{this})).booleanValue();
            }
            if (this.f7768a.size() == this.b) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public yao f7769a;

        static {
            t2o.a(468713870);
        }

        private c() {
            this.f7769a = null;
        }

        @Override // java.lang.Runnable
        public void run() {
            MtopResponse f;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            MultiRecyclerViewAdapter mediaCardListAdapter = ListMonitor.b(ListMonitor.this).getMediaCardListAdapter();
            if (mediaCardListAdapter == null || mediaCardListAdapter.getDataList() == null || mediaCardListAdapter.getDataList().isEmpty()) {
                HashMap hashMap = new HashMap();
                IDataService iDataService = (IDataService) ListMonitor.o(ListMonitor.this).getService(IDataService.class);
                hashMap.put("clientRetCode", iDataService.getDetailRequestRetCode());
                hashMap.put("reason", Integer.valueOf(iDataService.getDetailRequestStatus()));
                yao yaoVar = this.f7769a;
                if (!(yaoVar == null || (f = yaoVar.f()) == null || f.getMtopStat() == null)) {
                    hashMap.put("traceId", f.getMtopStat().eagleEyeTraceId);
                    hashMap.put("statusCode", Integer.valueOf(f.getMtopStat().statusCode));
                    hashMap.put(jk.KEY_RET_CODE, f.getMtopStat().retCode);
                }
                this.f7769a = null;
                ListMonitor.p(ListMonitor.this, "noData", hashMap);
            }
        }
    }

    static {
        t2o.a(468713867);
        t2o.a(468714499);
        t2o.a(468714454);
        t2o.a(468714445);
        t2o.a(468714256);
    }

    public ListMonitor(FluidContext fluidContext) {
        boolean p2 = akt.p2("ShortVideo.enableListMonitor", true);
        this.b = fluidContext;
        IFeedsListService iFeedsListService = (IFeedsListService) fluidContext.getService(IFeedsListService.class);
        this.c = iFeedsListService;
        if (p2) {
            iFeedsListService.addDragListener(this);
            iFeedsListService.addScrollListener(this);
            iFeedsListService.addCardChangeListener(this);
            ((ILifecycleService) fluidContext.getService(ILifecycleService.class)).addPageLifecycleListener(this);
        }
    }

    public static /* synthetic */ IFeedsListService b(ListMonitor listMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IFeedsListService) ipChange.ipc$dispatch("fb76015b", new Object[]{listMonitor});
        }
        return listMonitor.c;
    }

    public static /* synthetic */ Object ipc$super(ListMonitor listMonitor, String str, Object... objArr) {
        if (str.hashCode() == 1361287682) {
            super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/analysis/monitor/ListMonitor");
    }

    public static /* synthetic */ FluidContext o(ListMonitor listMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FluidContext) ipChange.ipc$dispatch("cfd2b65c", new Object[]{listMonitor});
        }
        return listMonitor.b;
    }

    public static /* synthetic */ void p(ListMonitor listMonitor, String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e5d090", new Object[]{listMonitor, str, map});
        } else {
            listMonitor.u(str, map);
        }
    }

    @Override // com.taobao.android.fluid.framework.list.view.LockableRecycerView.a
    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54b330fc", new Object[]{this});
        }
    }

    @Override // tb.bpk
    public void k(uq9 uq9Var, uq9 uq9Var2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d85cf3e9", new Object[]{this, uq9Var, uq9Var2});
        }
    }

    @Override // com.taobao.android.fluid.framework.list.view.LockableRecycerView.c
    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bd4d54c", new Object[]{this});
        }
    }

    @Override // tb.bpk
    public void m(uq9 uq9Var, uq9 uq9Var2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3112268", new Object[]{this, uq9Var, uq9Var2});
        } else {
            this.f7767a.b();
        }
    }

    @Override // com.taobao.android.fluid.framework.list.view.LockableRecycerView.c
    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e46ce4c5", new Object[]{this});
        } else {
            s();
        }
    }

    @Override // tb.o6d
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        }
    }

    @Override // tb.o6d
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            this.e.removeCallbacks(this.f);
        }
    }

    @Override // com.taobao.android.fluid.framework.list.view.LockableRecycerView.a
    public void onDragUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76868f35", new Object[]{this});
        } else {
            s();
        }
    }

    @Override // tb.o6d
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else {
            this.e.removeCallbacks(this.f);
        }
    }

    @Override // tb.o6d
    public void onRealStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e496e44c", new Object[]{this});
        }
    }

    @Override // tb.o6d
    public void onRealStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("274986c6", new Object[]{this});
        }
    }

    @Override // tb.rg7.c
    public void onResult(yao<Pair<com.taobao.android.fluid.framework.data.datamodel.a, MediaMixContentDetail>> yaoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fcf9b57", new Object[]{this, yaoVar});
        } else if (yaoVar != null && !a6o.b(yaoVar.b())) {
            if (yaoVar.c() == null || yaoVar.c().second == null || (sz3.a(((MediaMixContentDetail) yaoVar.c().second).list) && sz3.a(((MediaMixContentDetail) yaoVar.c().second).pitList))) {
                c cVar = this.f;
                cVar.f7769a = yaoVar;
                this.e.post(cVar);
            }
        }
    }

    @Override // tb.o6d
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else {
            this.e.postDelayed(this.f, h);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
            return;
        }
        super.onScrollStateChanged(recyclerView, i);
        if (!t()) {
            this.f7767a.b();
        }
    }

    @Override // tb.o6d
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        }
    }

    @Override // tb.rg7.c
    public void onStartRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adbafdd3", new Object[]{this});
        }
    }

    @Override // tb.o6d
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        }
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4579acf", new Object[]{this});
        } else if (this.c.getRecyclerView().isLocked()) {
            u("listLocked", null);
        } else if (t()) {
            HashMap hashMap = new HashMap();
            IDataService iDataService = (IDataService) this.b.getService(IDataService.class);
            hashMap.put("noMoreData", Boolean.valueOf(iDataService.isNoMoreData()));
            hashMap.put("reason", Integer.valueOf(vn8.b(iDataService.isLoadingMore(), iDataService.isNoMoreData(), iDataService.getNoRecReason())));
            hashMap.put(jk.KEY_RET_CODE, iDataService.getRequestRetCode());
            u("noMoreData", hashMap);
        }
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b47e83e", new Object[]{this});
            return;
        }
        this.f7767a.a(Long.valueOf(System.currentTimeMillis()));
        if (this.f7767a.e() && this.f7767a.d().longValue() - this.f7767a.c().longValue() <= g) {
            r();
        }
    }

    public final boolean t() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b4b410f9", new Object[]{this})).booleanValue();
        }
        List<com.taobao.android.fluid.framework.data.datamodel.a> dataList = this.c.getMediaCardListAdapter().getDataList();
        if (dataList != null) {
            i = dataList.size();
        } else {
            i = 0;
        }
        if (this.c.getActivePosition() == i - 1) {
            return true;
        }
        return false;
    }

    public final void u(String str, Map map) {
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbeffce0", new Object[]{this, str, map});
            return;
        }
        uq9 activeCard = this.c.getActiveCard();
        if (activeCard != null) {
            str2 = activeCard.P();
        } else {
            str2 = "";
        }
        if (!TextUtils.equals(str, "noData")) {
            str3 = str + "_" + str2;
        } else {
            str3 = str;
        }
        if (!((HashSet) this.d).contains(str3)) {
            ((HashSet) this.d).add(str3);
            if (map == null) {
                map = new HashMap();
            }
            if (activeCard != null) {
                map.put("type", Integer.valueOf(activeCard.J()));
                map.put("contentId", activeCard.Y().f());
                map.put("position", Integer.valueOf(activeCard.M()));
            }
            map.put("bizType", this.b.getInstanceConfig().getBizType());
            pep sessionParams = ((ISceneConfigService) this.b.getService(ISceneConfigService.class)).getSessionParams();
            if (sessionParams != null) {
                Map<String, String> a2 = sessionParams.a();
                if (a2 != null) {
                    map.put("sceneSource", a2.get("sceneSource"));
                }
                map.put("source", sessionParams.c);
                map.put("sessionType", sessionParams.b);
            }
            ((ITrackService) this.b.getService(ITrackService.class)).commitTintFail("unscrollable", str, map, null);
            ir9.b("ListMonitor", "reportUnScrollable:" + str + " args:" + map);
        }
    }
}
