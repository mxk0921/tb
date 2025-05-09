package com.taobao.android.meta.data;

import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.meta.datasource.ComboOp;
import com.taobao.android.searchbaseframe.net.ResultError;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import tb.asi;
import tb.ckf;
import tb.gy;
import tb.i04;
import tb.isi;
import tb.osi;
import tb.t2o;
import tb.yko;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class MetaResult<C extends asi> extends BaseSearchResult {
    private BaseCellBean barrierBean;
    private int barrierIndex;
    private boolean headerPartialRefresh;
    private boolean hideFooterState;
    private final ArrayList<C> combos = new ArrayList<>(1);
    private final ArrayList<isi> headers = new ArrayList<>(1);
    private boolean headerChange = true;
    private final ArrayList<BaseTypedBean> footers = new ArrayList<>(1);
    private boolean footerChanged = true;
    private final HashSet<String> usedTemplateList = new HashSet<>();

    static {
        t2o.a(993001490);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetaResult(yko ykoVar, boolean z) {
        super(ykoVar, z);
        ckf.g(ykoVar, "core");
    }

    public void addCombo(C c) {
        ckf.g(c, "combo");
        c.I(this.combos.size());
        this.combos.add(c);
    }

    public void addFooter(BaseTypedBean baseTypedBean) {
        ckf.g(baseTypedBean, "footer");
        this.footerChanged = true;
        this.footers.add(baseTypedBean);
        addUsedTemplate(baseTypedBean.type);
    }

    public void addHeader(isi isiVar) {
        ckf.g(isiVar, "header");
        this.headerChange = true;
        this.headers.add(isiVar);
        addUsedTemplate(isiVar.a().type);
    }

    public void addHeaders(Collection<isi> collection) {
        ckf.g(collection, "headers");
        this.headerChange = true;
        this.headers.addAll(collection);
        for (isi isiVar : collection) {
            addUsedTemplate(isiVar.a().type);
        }
    }

    public final void addUsedTemplate(String str) {
        if (str != null) {
            this.usedTemplateList.add(str);
        }
    }

    public void clearCombos() {
        this.combos.clear();
    }

    public final void collectCellTemplates() {
        Iterator<C> it = this.combos.iterator();
        ckf.f(it, "iterator(...)");
        while (it.hasNext()) {
            C next = it.next();
            ckf.f(next, "next(...)");
            for (BaseCellBean baseCellBean : next.t()) {
                addUsedTemplate(baseCellBean.type);
            }
        }
    }

    public int comboSize() {
        return this.combos.size();
    }

    public final BaseCellBean getBarrierBean() {
        return this.barrierBean;
    }

    public final int getBarrierIndex() {
        return this.barrierIndex;
    }

    public C getCombo(int i) {
        if (i < 0 || i >= this.combos.size()) {
            return null;
        }
        return this.combos.get(i);
    }

    public final ArrayList<C> getCombos() {
        return this.combos;
    }

    public final boolean getFooterChanged() {
        return this.footerChanged;
    }

    public final ArrayList<BaseTypedBean> getFooters() {
        return this.footers;
    }

    public final boolean getHeaderChange() {
        return this.headerChange;
    }

    public final boolean getHeaderPartialRefresh() {
        return this.headerPartialRefresh;
    }

    public final ArrayList<isi> getHeaders() {
        return this.headers;
    }

    public List<isi> getHeadersByType(String str) {
        ckf.g(str, "type");
        ArrayList arrayList = new ArrayList(this.headers.size());
        Iterator<isi> it = this.headers.iterator();
        ckf.f(it, "iterator(...)");
        while (it.hasNext()) {
            isi next = it.next();
            ckf.f(next, "next(...)");
            isi isiVar = next;
            if (ckf.b(isiVar.b(), str)) {
                arrayList.add(isiVar);
            }
        }
        return arrayList;
    }

    public final boolean getHideFooterState() {
        return this.hideFooterState;
    }

    public C getLastCombo() {
        return (C) ((asi) i04.m0(this.combos));
    }

    public final Set<String> getUsedTemplates() {
        return this.usedTemplateList;
    }

    public List<BaseCellBean> getValidCells() {
        if (this.barrierBean == null) {
            return this.mCells;
        }
        return this.mCells.subList(0, this.barrierIndex + 1);
    }

    public void insertCombo(int i, C c) {
        ckf.g(c, "combo");
        this.combos.add(i, c);
        int comboSize = comboSize();
        for (int i2 = 0; i2 < comboSize; i2++) {
            C combo = getCombo(i2);
            if (combo != null) {
                combo.I(i2);
            }
        }
    }

    public boolean isMetaMode() {
        return true;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.result.AbsSearchResult, com.taobao.android.searchbaseframe.datasource.result.SearchResult
    public boolean isNew() {
        if (!(getSearchConfig() instanceof osi)) {
            return super.isNew();
        }
        gy.c searchConfig = getSearchConfig();
        ckf.e(searchConfig, "null cannot be cast to non-null type com.taobao.android.meta.data.MetaSearchConfig<*>");
        osi osiVar = (osi) searchConfig;
        if (osiVar.f20307a || osiVar.q() || osiVar.o() || osiVar.r()) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult, com.taobao.android.searchbaseframe.datasource.result.SearchResult
    public boolean isPageFinished() {
        if (!isMetaMode()) {
            return super.isPageFinished();
        }
        Iterator<C> it = this.combos.iterator();
        ckf.f(it, "iterator(...)");
        while (it.hasNext()) {
            C next = it.next();
            ckf.f(next, "next(...)");
            if (!next.w()) {
                return false;
            }
        }
        return true;
    }

    public void restore() {
        this.headerChange = true;
    }

    public final void setBarrierBean(BaseCellBean baseCellBean) {
        this.barrierBean = baseCellBean;
    }

    public final void setBarrierIndex(int i) {
        this.barrierIndex = i;
    }

    public final void setFooterChanged(boolean z) {
        this.footerChanged = z;
    }

    public final void setHeaderChange(boolean z) {
        this.headerChange = z;
    }

    public final void setHeaderPartialRefresh(boolean z) {
        this.headerPartialRefresh = z;
    }

    public final void setHideFooterState(boolean z) {
        this.hideFooterState = z;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.result.AbsSearchResult, com.taobao.android.searchbaseframe.datasource.result.SearchResult
    public void setResultError(ResultError resultError) {
        osi osiVar;
        asi m;
        ckf.g(resultError, "error");
        super.setResultError(resultError);
        gy.c searchConfig = getSearchConfig();
        if (searchConfig instanceof osi) {
            osiVar = (osi) searchConfig;
        } else {
            osiVar = null;
        }
        if (osiVar != null && (m = osiVar.m()) != null) {
            m.O(resultError);
        }
    }

    public void updateBarrier(C c) {
        ckf.g(c, "combo");
        BaseCellBean baseCellBean = this.barrierBean;
        if (baseCellBean != null) {
            ckf.d(baseCellBean);
            if (baseCellBean.barrier) {
                return;
            }
        }
        if (!c.w() && !c.j().isEmpty()) {
            BaseCellBean baseCellBean2 = c.j().get(c.j().size() - 1);
            this.barrierBean = baseCellBean2;
            ckf.d(baseCellBean2);
            baseCellBean2.barrier = true;
            this.barrierIndex = this.mCells.size() - 1;
        }
    }

    public List<ComboOp> updateItems() {
        getCells().clear();
        this.barrierIndex = 0;
        BaseCellBean baseCellBean = this.barrierBean;
        if (baseCellBean != null) {
            baseCellBean.barrier = false;
        }
        this.barrierBean = null;
        ArrayList arrayList = new ArrayList();
        Iterator<C> it = this.combos.iterator();
        ckf.f(it, "iterator(...)");
        while (it.hasNext()) {
            C next = it.next();
            ckf.f(next, "next(...)");
            C c = next;
            List<ComboOp> Q = c.Q();
            if (Q != null) {
                arrayList.addAll(Q);
            }
            c.M(getCells().size());
            getCells().addAll(c.j());
            updateBarrier(c);
        }
        return arrayList;
    }
}
