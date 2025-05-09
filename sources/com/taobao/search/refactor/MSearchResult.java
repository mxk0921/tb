package com.taobao.search.refactor;

import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.net.ResultError;
import com.taobao.search.sf.datasource.CommonSearchResult;
import java.util.Map;
import tb.ckf;
import tb.frh;
import tb.gy;
import tb.i04;
import tb.osi;
import tb.rhj;
import tb.t2o;
import tb.yko;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class MSearchResult extends CommonSearchResult {
    private boolean isRedirectMode;
    private String redirectUrl = "";
    private BaseTypedBean tabHeader;
    private boolean useNativeTopBar;

    static {
        t2o.a(815792883);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MSearchResult(yko ykoVar, boolean z) {
        super(ykoVar, z);
        ckf.g(ykoVar, "core");
    }

    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    public final BaseTypedBean getTabHeader() {
        return this.tabHeader;
    }

    public final boolean getUseNativeTopBar() {
        return this.useNativeTopBar;
    }

    @Override // com.taobao.search.sf.datasource.CommonSearchResult, com.taobao.android.meta.data.MetaResult
    public boolean isMetaMode() {
        return true;
    }

    public final boolean isRedirectMode() {
        return this.isRedirectMode;
    }

    public final void setRedirectMode(boolean z) {
        this.isRedirectMode = z;
    }

    public final void setRedirectUrl(String str) {
        this.redirectUrl = str;
    }

    @Override // com.taobao.android.meta.data.MetaResult, com.taobao.android.searchbaseframe.datasource.result.AbsSearchResult, com.taobao.android.searchbaseframe.datasource.result.SearchResult
    public void setResultError(ResultError resultError) {
        Map<String, String> n;
        ckf.g(resultError, "error");
        gy.c searchConfig = getSearchConfig();
        String str = null;
        osi osiVar = searchConfig instanceof osi ? (osi) searchConfig : null;
        if (!(osiVar == null || (n = osiVar.n()) == null)) {
            str = n.get("searchType");
        }
        if (!ckf.b(str, "preload")) {
            super.setResultError(resultError);
        }
    }

    public final void setTabHeader(BaseTypedBean baseTypedBean) {
        this.tabHeader = baseTypedBean;
    }

    public final void setUseNativeTopBar(boolean z) {
        this.useNativeTopBar = z;
    }

    public void updateBarrier(frh frhVar) {
        if (frhVar instanceof rhj) {
            if (getBarrierBean() != null) {
                BaseCellBean barrierBean = getBarrierBean();
                ckf.d(barrierBean);
                if (barrierBean.barrier) {
                    return;
                }
            }
            rhj rhjVar = (rhj) frhVar;
            if (!rhjVar.w() && !rhjVar.V0().isEmpty()) {
                setBarrierBean((BaseCellBean) i04.l0(rhjVar.V0()));
                BaseCellBean barrierBean2 = getBarrierBean();
                ckf.d(barrierBean2);
                barrierBean2.barrier = true;
                setBarrierIndex((this.mCells.size() - rhjVar.O0().size()) - 1);
            }
        }
    }
}
