package com.taobao.android.searchbaseframe.xsl.module;

import com.alibaba.fastjson.JSONObject;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.bean.ResultLayoutInfoBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.datasource.result.SearchResult;
import com.taobao.android.searchbaseframe.xsl.module.XslDatasource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import tb.c4p;
import tb.gox;
import tb.isi;
import tb.t2o;
import tb.y64;
import tb.yko;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class XslSearchResult extends MetaResult<y64> {
    private boolean mAtmosphereAnim;
    private String mAtmosphereListBgColor;
    private String mAtmosphereType;
    private String mAtmosphereUrl;
    private JSONObject mCurrentData;
    private final gox mLayoutInfo = new gox();
    private int mDefaultTabIndex = 0;
    public ArrayList<isi> topHeaders = new ArrayList<>();
    public ArrayList<isi> tabHeaders = new ArrayList<>();
    private boolean isMetaMode = false;

    static {
        t2o.a(993002060);
    }

    public XslSearchResult(yko ykoVar, boolean z) {
        super(ykoVar, z);
    }

    private void addNewCells(BaseSearchResult baseSearchResult, Map<Long, BaseCellBean> map, int i, boolean z) {
        if (map != null && !map.isEmpty()) {
            int size = baseSearchResult.getCells().size();
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < size; i2++) {
                BaseCellBean baseCellBean = baseSearchResult.getCells().get(i2);
                BaseCellBean baseCellBean2 = map.get(Long.valueOf(baseCellBean.id));
                if (baseCellBean2 != null) {
                    baseCellBean2.copyCellData(baseCellBean);
                }
                if (!z) {
                    this.mCells.add(baseCellBean);
                } else {
                    arrayList.add(baseCellBean);
                }
            }
            if (z) {
                this.mCells.addAll(i, arrayList);
            }
        } else if (i > this.mCells.size()) {
            this.mCells.addAll(baseSearchResult.getCells());
        } else {
            try {
                this.mCells.addAll(i, baseSearchResult.getCells());
            } catch (IndexOutOfBoundsException e) {
                c4p.o("XslSearchResult.addNewCells", "from " + i + " size " + this.mCells.size(), e);
            }
        }
    }

    private void mergeSection(SearchResult searchResult) {
        boolean z;
        boolean z2;
        if (searchResult instanceof XslSearchResult) {
            XslSearchResult xslSearchResult = (XslSearchResult) searchResult;
            boolean z3 = true;
            if (xslSearchResult.hasBarrier() || hasBarrier()) {
                z = true;
            } else {
                z = false;
            }
            setHasBarrier(z);
            if (xslSearchResult.hasSectionClip() || hasSectionClip()) {
                z2 = true;
            } else {
                z2 = false;
            }
            setHasSectionClip(z2);
            if (!xslSearchResult.hasSections() && !hasSections()) {
                z3 = false;
            }
            setHasSections(z3);
        }
    }

    private Map<Long, BaseCellBean> retrieveOldCells(boolean z, int i, int i2) {
        HashMap hashMap;
        if (z) {
            hashMap = new HashMap(Math.max((i - i2) + 1, 1));
        } else {
            hashMap = null;
        }
        while (i >= i2) {
            if (i >= 0 && i < this.mCells.size()) {
                BaseCellBean remove = this.mCells.remove(i);
                if (hashMap != null) {
                    long j = remove.id;
                    if (j > 0) {
                        hashMap.put(Long.valueOf(j), remove);
                    }
                }
            }
            i--;
        }
        return hashMap;
    }

    public String getAtmosphereListBgColor() {
        return this.mAtmosphereListBgColor;
    }

    public String getAtmosphereType() {
        return this.mAtmosphereType;
    }

    public String getAtmosphereUrl() {
        return this.mAtmosphereUrl;
    }

    public JSONObject getCurrentData() {
        return this.mCurrentData;
    }

    public int getDefaultTabIndex() {
        return this.mDefaultTabIndex;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult
    public ResultLayoutInfoBean getThemeBean() {
        throw new IllegalStateException("You should not use themeBean");
    }

    @Override // com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult, com.taobao.android.searchbaseframe.datasource.result.SearchResult
    public boolean hasListResult() {
        if (this.mCells.size() <= 0 && ((ArrayList) this.mLayoutInfo.c).isEmpty() && ((ArrayList) this.mLayoutInfo.b).isEmpty() && ((ArrayList) this.mLayoutInfo.f20137a).isEmpty()) {
            return false;
        }
        return true;
    }

    public boolean isAtmosphereAnim() {
        return this.mAtmosphereAnim;
    }

    @Override // com.taobao.android.meta.data.MetaResult
    public boolean isMetaMode() {
        return this.isMetaMode;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult, com.taobao.android.searchbaseframe.datasource.result.SearchResult
    public void merge(SearchResult searchResult) {
        super.merge(searchResult);
        mergeSection(searchResult);
    }

    public void setAtmosphereAnim(boolean z) {
        this.mAtmosphereAnim = z;
    }

    public void setAtmosphereListBgColor(String str) {
        this.mAtmosphereListBgColor = str;
    }

    public void setAtmosphereType(String str) {
        this.mAtmosphereType = str;
    }

    public void setAtmosphereUrl(String str) {
        this.mAtmosphereUrl = str;
    }

    public void setCurrentData(JSONObject jSONObject) {
        this.mCurrentData = jSONObject;
    }

    public void setDefaultTabIndex(int i) {
        this.mDefaultTabIndex = i;
    }

    public void setMetaMode(boolean z) {
        this.isMetaMode = z;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult
    public void onCellMerge(BaseSearchResult baseSearchResult) {
        if (!(baseSearchResult.getSearchConfig() instanceof XslDatasource.b) || ((XslDatasource.b) baseSearchResult.getSearchConfig()).n() < 0) {
            super.onCellMerge(baseSearchResult);
            return;
        }
        int n = ((XslDatasource.b) baseSearchResult.getSearchConfig()).n();
        boolean z = ((XslDatasource.b) baseSearchResult.getSearchConfig()).o;
        int m = ((XslDatasource.b) baseSearchResult.getSearchConfig()).m();
        ((XslDatasource.b) baseSearchResult.getSearchConfig()).o(this.mCells.size());
        if (n < 0) {
            n = 0;
        }
        boolean z2 = ((XslDatasource.b) baseSearchResult.getSearchConfig()).n;
        if (m > 0) {
            int i = (n + m) - 1;
            if (i >= this.mCells.size()) {
                i = this.mCells.size() - 1;
                c().l().d("XslSearchResult", String.format(Locale.getDefault(), "updateListItems length过长，请修正,当前列表长度为%d,from=%d,length=%d", Integer.valueOf(this.mCells.size()), Integer.valueOf(n), Integer.valueOf(m)));
            }
            addNewCells(baseSearchResult, retrieveOldCells(z2, i, n), n, z);
            return;
        }
        addNewCells(baseSearchResult, retrieveOldCells(z2, this.mCells.size() - 1, n), n, z);
    }

    @Override // com.taobao.android.searchbaseframe.datasource.result.AbsSearchResult, com.taobao.android.searchbaseframe.datasource.result.SearchResult
    public void partialMerge(Set<String> set, SearchResult searchResult) {
    }
}
