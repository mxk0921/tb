package com.taobao.search.sf.datasource;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.search.common.dynamic.bean.SearchDomBean;
import com.taobao.search.mmd.datasource.bean.SFOnesearchBean;
import com.taobao.search.mmd.datasource.bean.SearchBarBean;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.a9u;
import tb.bn9;
import tb.frh;
import tb.hrs;
import tb.l4k;
import tb.t2o;
import tb.yko;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class CommonSearchResult extends MetaResult<frh> {
    public JSONArray carriedData;
    public Set<String> clearParams;
    public JSONObject copyPageInfo;
    public String crossShopRecPvUuid;
    public HashMap<String, SearchDomBean> domIcons;
    public boolean enableAiSrpEntrance;
    public bn9 floatBarBean;
    public boolean guideSearch;
    public boolean isAddCartSupported;
    public boolean isAllVideoAutoPlay;
    public boolean isHalfStickySearchBar;
    public boolean isJarvisDataCache;
    public boolean isNewFilter;
    public boolean isPageTurning;
    private Boolean isPreDetail;
    public boolean isPrePaging;
    public boolean isPreciseAppear;
    public boolean isPullRefreshEnabled;
    public boolean isSaveListStyle;
    public boolean isServerAutoPlay;
    public boolean isUpdateUtparam;
    public a9u itemsArrayTraceDigest;
    public Map<String, String> jarvisFeature;
    public Map<String, a9u> layoutParseTraceDigestMap;
    private SFOnesearchBean mOnesearch;
    private SearchBarBean mSearchBarInfo;
    public boolean mainSearch;
    public JSONObject negFeedbackActions;
    public boolean newSearch;
    public l4k noResultMod;
    public String nxRawIcon;
    public JSONObject originData;
    public JSONObject pageData;
    public JSONObject pageInfo;
    public BaseTypedBean pkModuleBean;
    public String poplayerUrl;
    public MuiseBean popupBean;
    public int sceneStickyHeight;
    public String sessionId;
    public HashMap<String, String> sessionParams;
    public boolean similarFold;
    public String spClientSession;
    public JSONObject switches;
    public a9u tabParseTraceDigest;
    public a9u templatesParseTraceDigest;
    public a9u topBarParseTraceDigest;
    protected final List<BaseCellBean> mReplaceCells = new ArrayList();
    protected final List<BaseCellBean> mBufferCells = new ArrayList();
    public final Map<String, String> updateParams = new HashMap();
    public hrs tabPromotionBean = null;
    public boolean hasTopHeader = false;
    public boolean hasGuideSearchTopHeader = false;

    static {
        t2o.a(815793395);
    }

    public CommonSearchResult(yko ykoVar, boolean z) {
        super(ykoVar, z);
    }

    @Override // com.taobao.android.searchbaseframe.datasource.result.AbsSearchResult, com.taobao.android.searchbaseframe.datasource.result.SearchResult
    public boolean bizRuleNoResult() {
        if (this.noResultMod != null) {
            return true;
        }
        return false;
    }

    public List<BaseCellBean> getBufferCells() {
        return this.mBufferCells;
    }

    public SFOnesearchBean getOnesearch() {
        return this.mOnesearch;
    }

    public List<BaseCellBean> getReplaceCells() {
        return this.mReplaceCells;
    }

    public SearchBarBean getSearchBarInfo() {
        return this.mSearchBarInfo;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult, com.taobao.android.searchbaseframe.datasource.result.SearchResult
    public boolean hasListResult() {
        if (this.mCells.size() > 0) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.android.meta.data.MetaResult
    public boolean isMetaMode() {
        return false;
    }

    public boolean isPreDetail() {
        Boolean bool = this.isPreDetail;
        if (bool == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public void setOnesearch(SFOnesearchBean sFOnesearchBean) {
        this.mOnesearch = sFOnesearchBean;
    }

    public void setPreDetail(Boolean bool) {
        this.isPreDetail = bool;
    }

    public void setSearchBarInfo(SearchBarBean searchBarBean) {
        this.mSearchBarInfo = searchBarBean;
    }
}
