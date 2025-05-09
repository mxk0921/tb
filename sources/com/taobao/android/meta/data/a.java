package com.taobao.android.meta.data;

import android.util.SparseArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.meta.data.a;
import com.taobao.android.meta.logic.BaseMetaPageController;
import com.taobao.android.meta.structure.childpage.MetaChildPageWidget;
import com.taobao.android.searchbaseframe.datasource.LocalDataManager;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.datasource.param.SearchParamImpl;
import com.taobao.android.searchbaseframe.datasource.result.SearchResult;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import tb.asi;
import tb.ckf;
import tb.gy;
import tb.nsi;
import tb.o02;
import tb.osi;
import tb.psi;
import tb.t2o;
import tb.vtc;
import tb.xno;
import tb.y5p;
import tb.yko;
import tb.z4p;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class a<C extends asi, M extends MetaResult<C>> extends o02<M, LocalDataManager> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private BaseMetaPageController<a<C, MetaResult<C>>, C, MetaResult<C>> controller;
    private vtc<a<C, M>, C, M> flow;
    private boolean initDone;
    private Runnable initRunnable;
    private boolean isInitDataSource = true;
    private final SparseArray<gy<M, SearchParamImpl, LocalDataManager>.d> comboTasks = new SparseArray<>();
    private final nsi manager = new nsi();
    private int index = -1;

    static {
        t2o.a(993001486);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(yko ykoVar, xno xnoVar) {
        super(ykoVar, xnoVar);
        ckf.g(ykoVar, "core");
    }

    private final int getTaskId(gy.c cVar) {
        asi m;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5abc88b4", new Object[]{this, cVar})).intValue();
        }
        if (cVar == null || (m = ((osi) cVar).m()) == null) {
            return 0;
        }
        return m.hashCode();
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1983604863:
                super.destroy();
                return null;
            case -1636778287:
                super.onPreSearchOfParams((gy.c) objArr[0], (Map) objArr[1]);
                return null;
            case -1014456898:
                return new Boolean(super.moveCell(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue()));
            case -972614894:
                super.onNewTask((gy.d) objArr[0], (gy.c) objArr[1]);
                return null;
            case -880210355:
                super.onMergeResult((a) ((SearchResult) objArr[0]), (gy.c) objArr[1]);
                return null;
            case -670846045:
                return new Boolean(super.doPreLoadNewSearch((JSONObject) objArr[0]));
            case -168775910:
                return super.getExecutor((gy.c) objArr[0]);
            case 706485854:
                return new Boolean(super.onPostRequest((a) ((SearchResult) objArr[0]), (gy.c) objArr[1], ((Number) objArr[2]).longValue(), (y5p) objArr[3]));
            case 1083699496:
                return new Boolean(super.doNewSearch());
            case 1162854400:
                return new Boolean(super.insertCellToTotal((BaseCellBean) objArr[0], ((Number) objArr[1]).intValue()));
            case 1561329232:
                return new Boolean(super.doNewSearch((JSONObject) objArr[0]));
            case 1644444529:
                return new Boolean(super.removeCellFromTotal((BaseCellBean) objArr[0]));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/meta/data/MetaDataSource");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onPostRequest$lambda$11$lambda$10(a aVar, MetaResult metaResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aad90490", new Object[]{aVar, metaResult});
            return;
        }
        ckf.g(aVar, "this$0");
        ckf.g(metaResult, "$it");
        vtc<a<C, M>, C, M> vtcVar = aVar.flow;
        if (vtcVar != null) {
            vtcVar.l(aVar, metaResult.isSuccess());
        }
    }

    public void appendComboParams(Map<String, String> map, C c, osi<C> osiVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a1b292c", new Object[]{this, map, c, osiVar});
            return;
        }
        ckf.g(map, "map");
        if (c != null) {
            Map<String, String> createUrlParams = c.r().createUrlParams();
            ckf.f(createUrlParams, "createUrlParams(...)");
            map.putAll(createUrlParams);
            JSONObject h = c.h();
            if (h != null) {
                for (Map.Entry<String, Object> entry : h.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (value == null || (str = value.toString()) == null) {
                        str = "";
                    }
                    map.put(key, str);
                }
            }
        }
    }

    public final void cancelTask(asi asiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efc6921a", new Object[]{this, asiVar});
            return;
        }
        int taskId = getTaskId(asiVar);
        gy<M, SearchParamImpl, LocalDataManager>.d dVar = this.comboTasks.get(taskId);
        if (dVar != null) {
            dVar.cancel(false);
            this.comboTasks.remove(taskId);
        }
    }

    public final osi<C> createConfig(boolean z, C c, boolean z2, boolean z3, boolean z4, Map<String, String> map, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (osi) ipChange.ipc$dispatch("beac3f84", new Object[]{this, new Boolean(z), c, new Boolean(z2), new Boolean(z3), new Boolean(z4), map, obj}) : createConfig(z, c, z2, z3, z4, map, obj, true);
    }

    public abstract psi<C, M> createRequestAdapter();

    @Override // tb.gy
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.destroy();
        if (isMetaMode()) {
            this.manager.a();
            int size = this.comboTasks.size();
            for (int i = 0; i < size; i++) {
                this.comboTasks.valueAt(i).cancel(true);
            }
            this.comboTasks.clear();
        }
    }

    public void doLoadMore(C c, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0edf9e4", new Object[]{this, c, map});
            return;
        }
        ckf.g(c, "combo");
        vtc<a<C, M>, C, M> vtcVar = this.flow;
        if (vtcVar != null) {
            vtcVar.b(this, c, true, map);
        }
        searchInternal(createConfig(false, c, false, false, false, map, null));
    }

    public void doNewSearch(C c, boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd67bb49", new Object[]{this, c, new Boolean(z), map});
        } else {
            doNewSearch(c, z, null, map);
        }
    }

    @Override // tb.gy
    public boolean doPreLoadNewSearch(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d803b3a3", new Object[]{this, jSONObject})).booleanValue();
        }
        if (isMetaMode()) {
            return searchInternal(createConfig(true, null, true, true, true, null, jSONObject));
        }
        return super.doPreLoadNewSearch(jSONObject);
    }

    @Override // tb.gy
    public boolean enableEventBus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c633f434", new Object[]{this})).booleanValue();
        }
        return true ^ isMetaMode();
    }

    public final SparseArray<gy<M, SearchParamImpl, LocalDataManager>.d> getComboTasks() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SparseArray) ipChange.ipc$dispatch("510963fc", new Object[]{this});
        }
        return this.comboTasks;
    }

    @Override // tb.gy
    public Executor getExecutor(gy.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Executor) ipChange.ipc$dispatch("f5f0af1a", new Object[]{this, cVar});
        }
        ckf.g(cVar, "config");
        if (isMetaMode()) {
            ThreadPoolExecutor b = this.manager.b(getTaskId(cVar));
            ckf.f(b, "getOrCreate(...)");
            return b;
        }
        Executor executor = super.getExecutor(cVar);
        ckf.f(executor, "getExecutor(...)");
        return executor;
    }

    public final vtc<a<C, M>, C, M> getFlow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vtc) ipChange.ipc$dispatch("b18a9fc8", new Object[]{this});
        }
        return this.flow;
    }

    public final int getIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cf396596", new Object[]{this})).intValue();
        }
        return this.index;
    }

    public final Map<String, String> getSearchParams(C c) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e84fdb34", new Object[]{this, c});
        }
        ckf.g(c, "combo");
        Map<String, String> buildSearchParams = buildSearchParams(getCurrentParam());
        ckf.d(buildSearchParams);
        appendComboParams(buildSearchParams, c, null);
        return buildSearchParams;
    }

    @Override // tb.o02
    public boolean insertCellToTotal(BaseCellBean baseCellBean, int i) {
        MetaResult metaResult;
        asi combo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("454fc000", new Object[]{this, baseCellBean, new Integer(i)})).booleanValue();
        }
        if (!isMetaMode()) {
            return super.insertCellToTotal(baseCellBean, i);
        }
        if (baseCellBean == null || (metaResult = (MetaResult) getTotalSearchResult()) == null || metaResult.isFailed() || (combo = metaResult.getCombo(0)) == null) {
            return false;
        }
        return combo.v(baseCellBean, i);
    }

    public final boolean isInitDataSource() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d1f7ce6a", new Object[]{this})).booleanValue();
        }
        return this.isInitDataSource;
    }

    public boolean isMetaMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9589cc1d", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.gy
    public boolean isMultiTasksMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8bad986d", new Object[]{this})).booleanValue();
        }
        return isMetaMode();
    }

    @Override // tb.o02
    public boolean moveCell(int i, int i2) {
        asi combo;
        BaseCellBean i3;
        MetaChildPageWidget p;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c3889dbe", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (!isMetaMode()) {
            return super.moveCell(i, i2);
        }
        MetaResult metaResult = (MetaResult) getTotalSearchResult();
        if (metaResult == null || (combo = metaResult.getCombo(0)) == null || (i3 = combo.i(i)) == null) {
            return false;
        }
        combo.z(i3);
        combo.v(i3, i2);
        BaseMetaPageController<a<C, MetaResult<C>>, C, MetaResult<C>> baseMetaPageController = this.controller;
        if (!(baseMetaPageController == null || (p = baseMetaPageController.p(this.index)) == null)) {
            p.d3();
        }
        return true;
    }

    @Override // tb.gy
    public LocalDataManager onCreateLocalDataManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocalDataManager) ipChange.ipc$dispatch("74f5fe77", new Object[]{this});
        }
        return new DummyLocalManager();
    }

    @Override // tb.gy
    public z4p<M> onCreateRequestAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z4p) ipChange.ipc$dispatch("7178b05f", new Object[]{this});
        }
        return createRequestAdapter();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // tb.gy
    public /* bridge */ /* synthetic */ void onMergeResult(SearchResult searchResult, gy.c cVar) {
        onMergeResult((a<C, M>) ((MetaResult) searchResult), cVar);
    }

    @Override // tb.gy
    public void onNewTask(gy<M, SearchParamImpl, LocalDataManager>.d dVar, gy.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6071312", new Object[]{this, dVar, cVar});
            return;
        }
        super.onNewTask(dVar, cVar);
        if (isMetaMode()) {
            int taskId = getTaskId(cVar);
            gy<M, SearchParamImpl, LocalDataManager>.d dVar2 = this.comboTasks.get(taskId);
            if (dVar2 != null) {
                if (cVar == null || cVar.f) {
                    dVar2.cancel(false);
                }
                this.comboTasks.remove(taskId);
            }
            this.comboTasks.put(taskId, dVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // tb.gy
    public /* bridge */ /* synthetic */ boolean onPostRequest(SearchResult searchResult, gy.c cVar, long j, y5p y5pVar) {
        return onPostRequest((a<C, M>) ((MetaResult) searchResult), cVar, j, y5pVar);
    }

    @Override // tb.gy
    public void onPreSearchOfParams(gy.c cVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e70bed1", new Object[]{this, cVar, map});
            return;
        }
        super.onPreSearchOfParams(cVar, map);
        if (isMetaMode() && map != null && cVar != null) {
            osi<C> osiVar = (osi) cVar;
            appendComboParams(map, osiVar.m(), osiVar);
        }
    }

    @Override // tb.o02
    public boolean removeCellFromTotal(BaseCellBean baseCellBean) {
        asi asiVar;
        MetaChildPageWidget p;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("62043b71", new Object[]{this, baseCellBean})).booleanValue();
        }
        if (!isMetaMode()) {
            return super.removeCellFromTotal(baseCellBean);
        }
        if (baseCellBean == null || (asiVar = baseCellBean.combo) == null || !asiVar.z(baseCellBean)) {
            return false;
        }
        BaseMetaPageController<a<C, MetaResult<C>>, C, MetaResult<C>> baseMetaPageController = this.controller;
        if (!(baseMetaPageController == null || (p = baseMetaPageController.p(this.index)) == null)) {
            p.d3();
        }
        return true;
    }

    public final void resetInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5efa406", new Object[]{this});
        } else {
            this.initDone = false;
        }
    }

    public final void setController(BaseMetaPageController<a<C, MetaResult<C>>, C, MetaResult<C>> baseMetaPageController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2485f14b", new Object[]{this, baseMetaPageController});
            return;
        }
        ckf.g(baseMetaPageController, "controller");
        this.controller = baseMetaPageController;
    }

    public final void setFlow(vtc<a<C, M>, C, M> vtcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184388d6", new Object[]{this, vtcVar});
            return;
        }
        this.flow = vtcVar;
        Runnable runnable = this.initRunnable;
        if (runnable != null) {
            runnable.run();
            this.initRunnable = null;
        }
    }

    public final void setIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46180fcc", new Object[]{this, new Integer(i)});
        } else {
            this.index = i;
        }
    }

    public final void setInitDataSource(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("905386f6", new Object[]{this, new Boolean(z)});
        } else {
            this.isInitDataSource = z;
        }
    }

    public Map<String, String> buildSearchParams(SearchParamImpl searchParamImpl, gy.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1a47cd90", new Object[]{this, searchParamImpl, cVar});
        }
        ckf.g(searchParamImpl, "param");
        Map<String, String> createUrlParams = searchParamImpl.createUrlParams();
        ckf.f(createUrlParams, "createUrlParams(...)");
        return createUrlParams;
    }

    public final osi<C> createConfig(boolean z, C c, boolean z2, boolean z3, boolean z4, Map<String, String> map, Object obj, boolean z5) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (osi) ipChange.ipc$dispatch("6a2198b8", new Object[]{this, new Boolean(z), c, new Boolean(z2), new Boolean(z3), new Boolean(z4), map, obj, new Boolean(z5)}) : new osi(z, obj, z5, false).s(c).x(z2).w(z4).u(z3).t(map);
    }

    public void doNewSearch(C c, boolean z, JSONObject jSONObject, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e69c8b51", new Object[]{this, c, new Boolean(z), jSONObject, map});
            return;
        }
        if (c == null || z) {
            vtc<a<C, M>, C, M> vtcVar = this.flow;
            if (vtcVar != null) {
                vtcVar.h(this);
            }
        } else {
            vtc<a<C, M>, C, M> vtcVar2 = this.flow;
            if (vtcVar2 != null) {
                vtcVar2.b(this, c, false, map);
            }
        }
        getPager().reset();
        if (c != null) {
            c.D();
        }
        searchInternal(createConfig(c == null, c, true, false, z, map, jSONObject));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onMergeResult(M m, gy.c cVar) {
        asi m2;
        asi combo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c0d818", new Object[]{this, m, cVar});
            return;
        }
        super.onMergeResult((a<C, M>) m, cVar);
        if (isMetaMode() && m != null) {
            osi osiVar = cVar instanceof osi ? (osi) cVar : null;
            if (osiVar != null && (m2 = osiVar.m()) != null && (combo = m.getCombo(0)) != null) {
                if (osiVar.r()) {
                    vtc<a<C, M>, C, M> vtcVar = this.flow;
                    ckf.d(vtcVar);
                    vtcVar.i(this, m2, combo, osiVar);
                    return;
                }
                vtc<a<C, M>, C, M> vtcVar2 = this.flow;
                ckf.d(vtcVar2);
                vtcVar2.j(this, m2, combo, osiVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onPostRequest(final M m, gy.c cVar, long j, y5p y5pVar) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("698083a9", new Object[]{this, m, cVar, new Long(j), y5pVar})).booleanValue();
        }
        boolean onPostRequest = super.onPostRequest((a<C, M>) m, cVar, j, y5pVar);
        osi osiVar = cVar instanceof osi ? (osi) cVar : null;
        if (osiVar != null) {
            if (m != null && m.isSseFinished()) {
                z = true;
            }
            osiVar.v(z);
        }
        if (isMetaMode()) {
            if (m == null || !m.isSseMode() || m.isSseFinished()) {
                this.comboTasks.remove(getTaskId(cVar));
            }
            if (m != null) {
                ckf.e(cVar, "null cannot be cast to non-null type com.taobao.android.meta.data.MetaSearchConfig<C of com.taobao.android.meta.data.MetaDataSource.onPostRequest$lambda$11>");
                osi osiVar2 = (osi) cVar;
                if (osiVar2.o() && !this.initDone) {
                    if (m.isSuccess()) {
                        this.initDone = true;
                    }
                    vtc<a<C, M>, C, M> vtcVar = this.flow;
                    if (vtcVar != null) {
                        vtcVar.l(this, m.isSuccess());
                    } else {
                        this.initRunnable = new Runnable() { // from class: tb.jez
                            @Override // java.lang.Runnable
                            public final void run() {
                                a.onPostRequest$lambda$11$lambda$10(a.this, m);
                            }
                        };
                    }
                } else if (osiVar2.m() == null || osiVar2.q()) {
                    vtc<a<C, M>, C, M> vtcVar2 = this.flow;
                    ckf.d(vtcVar2);
                    vtcVar2.f(this, m.isSuccess());
                } else {
                    vtc<a<C, M>, C, M> vtcVar3 = this.flow;
                    ckf.d(vtcVar3);
                    vtcVar3.k(this, osiVar2.m(), !osiVar2.r(), m.isSuccess(), osiVar2);
                }
            }
        }
        return onPostRequest;
    }

    private final int getTaskId(asi asiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed4334e4", new Object[]{this, asiVar})).intValue();
        }
        if (asiVar != null) {
            return asiVar.hashCode();
        }
        return 0;
    }

    @Override // tb.gy
    public boolean doNewSearch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4097f128", new Object[]{this})).booleanValue();
        }
        if (!isMetaMode()) {
            return super.doNewSearch();
        }
        vtc<a<C, M>, C, M> vtcVar = this.flow;
        if (vtcVar != null) {
            vtcVar.h(this);
        }
        getPager().reset();
        searchInternal(createConfig(true, null, true, this.isInitDataSource, true, null, null));
        return true;
    }

    @Override // tb.gy
    public boolean doNewSearch(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5d0ffe50", new Object[]{this, jSONObject})).booleanValue();
        }
        if (!isMetaMode()) {
            return super.doNewSearch(jSONObject);
        }
        getPager().reset();
        searchInternal(createConfig(true, null, true, this.isInitDataSource, true, null, jSONObject));
        return true;
    }
}
