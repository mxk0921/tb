package com.taobao.android.searchbaseframe.datasource.impl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.bean.ResultLayoutInfoBean;
import com.taobao.android.searchbaseframe.datasource.impl.bean.ResultMainInfoBean;
import com.taobao.android.searchbaseframe.datasource.impl.bean.TabBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.datasource.result.AbsSearchResult;
import com.taobao.android.searchbaseframe.datasource.result.SearchResult;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseCellBean;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kxi;
import tb.t2o;
import tb.yko;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class BaseSearchResult extends AbsSearchResult {
    public static final Parcelable.Creator<BaseSearchResult> CREATOR = new a();
    private static final String LOG_TAG = "BaseSearchResult";
    protected final List<BaseCellBean> mCells;
    private final Map<String, String> mExtMods;
    private boolean mHasBarrier;
    private boolean mHasSectionClip;
    private boolean mHasSections;
    private ResultMainInfoBean mMainInfo;
    private final Map<String, BaseTypedBean> mMods;
    private final Map<String, String> mRawMods;
    private JSONObject mRawResult;
    private List<TabBean> mTabs;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Parcelable.Creator<BaseSearchResult> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public BaseSearchResult createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BaseSearchResult) ipChange.ipc$dispatch("57ebc95f", new Object[]{this, parcel});
            }
            return new BaseSearchResult(parcel);
        }

        /* renamed from: b */
        public BaseSearchResult[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BaseSearchResult[]) ipChange.ipc$dispatch("d9201016", new Object[]{this, new Integer(i)});
            }
            return new BaseSearchResult[i];
        }
    }

    static {
        t2o.a(993001775);
    }

    public BaseSearchResult(yko ykoVar, boolean z) {
        super(ykoVar, z);
        this.mCells = new ArrayList();
        this.mMainInfo = ResultMainInfoBean.createDefault();
        this.mMods = new HashMap();
        this.mRawMods = new HashMap();
        this.mExtMods = new HashMap();
    }

    public JSONObject _getDebugRawResult() {
        return this.mRawResult;
    }

    public void _setDebugRawResult(JSONObject jSONObject) {
        this.mRawResult = jSONObject;
    }

    public void addCell(BaseCellBean baseCellBean) {
        this.mCells.add(baseCellBean);
    }

    public void addCells(List<BaseCellBean> list) {
        this.mCells.addAll(list);
    }

    public void addExtMod(String str, String str2) {
        this.mExtMods.put(str, str2);
    }

    public void addMod(String str, BaseTypedBean baseTypedBean) {
        this.mMods.put(str, baseTypedBean);
    }

    public void addRawMod(String str, String str2) {
        this.mRawMods.put(str, str2);
    }

    public StringBuilder buildSummaryInfo(StringBuilder sb) {
        int i;
        sb.append("Template Count: ");
        if (getTemplates() == null) {
            i = 0;
        } else {
            i = getTemplates().size();
        }
        sb.append(i);
        sb.append('\n');
        sb.append("Cell Count: ");
        sb.append(this.mCells.size());
        sb.append('\n');
        sb.append("Mods Count: ");
        sb.append(this.mMods.size());
        sb.append('\n');
        return sb;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.result.SearchResult
    public int calcMuiseCellCount() {
        int i = 0;
        for (BaseCellBean baseCellBean : getCells()) {
            if (baseCellBean instanceof MuiseCellBean) {
                i++;
            }
        }
        return i;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.result.AbsSearchResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final BaseCellBean getCell(int i) {
        return this.mCells.get(i);
    }

    public final List<BaseCellBean> getCells() {
        return this.mCells;
    }

    public final int getCellsCount() {
        return this.mCells.size();
    }

    public final String getExtMod(String str) {
        return this.mExtMods.get(str);
    }

    public final ResultMainInfoBean getMainInfo() {
        return this.mMainInfo;
    }

    public final BaseTypedBean getMod(String str) {
        return this.mMods.get(str);
    }

    public final Map<String, BaseTypedBean> getMods() {
        return this.mMods;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.result.SearchResult
    public final int getPageNo() {
        return this.mMainInfo.page;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.result.SearchResult
    public int getPageSize() {
        return this.mMainInfo.pageSize;
    }

    public final String getRawMod(String str) {
        return this.mRawMods.get(str);
    }

    public List<TabBean> getTabs() {
        return this.mTabs;
    }

    public ResultLayoutInfoBean getThemeBean() {
        return this.mMainInfo.layoutInfo;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.result.SearchResult
    public final int getTotalResult() {
        return this.mMainInfo.totalResult;
    }

    public boolean hasBarrier() {
        return this.mHasBarrier;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.result.SearchResult
    public boolean hasListResult() {
        if (this.mCells.size() > 0) {
            return true;
        }
        ResultLayoutInfoBean resultLayoutInfoBean = this.mMainInfo.layoutInfo;
        if (resultLayoutInfoBean == null) {
            return false;
        }
        List<String> list = resultLayoutInfoBean.listHeaders;
        if (!list.isEmpty()) {
            for (String str : list) {
                if (getMod(str) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean hasSectionClip() {
        return this.mHasSectionClip;
    }

    public boolean hasSections() {
        return this.mHasSections;
    }

    public final boolean isModDynamic(BaseTypedBean baseTypedBean) {
        if (kxi.b(baseTypedBean) || kxi.a(baseTypedBean)) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.result.SearchResult
    public boolean isPageFinished() {
        return this.mMainInfo.finish;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.result.SearchResult
    public void merge(SearchResult searchResult) {
        if (!(searchResult instanceof BaseSearchResult)) {
            c().l().d(LOG_TAG, "result is not BaseSearchResult");
            return;
        }
        BaseSearchResult baseSearchResult = (BaseSearchResult) searchResult;
        onCellMerge(baseSearchResult);
        this.mExtMods.putAll(baseSearchResult.mExtMods);
    }

    public void onCellMerge(BaseSearchResult baseSearchResult) {
        this.mCells.addAll(baseSearchResult.mCells);
    }

    public final String popExtMod(String str) {
        String str2 = this.mExtMods.get(str);
        this.mExtMods.remove(str);
        return str2;
    }

    public void setHasBarrier(boolean z) {
        this.mHasBarrier = z;
    }

    public void setHasSectionClip(boolean z) {
        this.mHasSectionClip = z;
    }

    public void setHasSections(boolean z) {
        this.mHasSections = z;
    }

    public void setMainInfo(ResultMainInfoBean resultMainInfoBean) {
        this.mMainInfo = resultMainInfoBean;
    }

    public void setTabs(List<TabBean> list) {
        this.mTabs = list;
    }

    public String toString() {
        return buildSummaryInfo(new StringBuilder()).toString();
    }

    @Override // com.taobao.android.searchbaseframe.datasource.result.AbsSearchResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeList(this.mCells);
        parcel.writeSerializable(this.mMainInfo);
        Bundle bundle = new Bundle(this.mMods.size());
        for (Map.Entry<String, BaseTypedBean> entry : this.mMods.entrySet()) {
            bundle.putSerializable(entry.getKey(), entry.getValue());
        }
        parcel.writeBundle(bundle);
        Bundle bundle2 = new Bundle(this.mRawMods.size());
        for (Map.Entry<String, String> entry2 : this.mRawMods.entrySet()) {
            bundle2.putString(entry2.getKey(), entry2.getValue());
        }
        parcel.writeBundle(bundle2);
        Bundle bundle3 = new Bundle(this.mExtMods.size());
        for (Map.Entry<String, String> entry3 : this.mExtMods.entrySet()) {
            bundle3.putString(entry3.getKey(), entry3.getValue());
        }
        parcel.writeBundle(bundle3);
    }

    public void addCell(BaseCellBean baseCellBean, int i) {
        this.mCells.add(Math.min(this.mCells.size(), Math.max(0, i)), baseCellBean);
    }

    public BaseSearchResult(Parcel parcel) {
        super(parcel);
        ArrayList arrayList = new ArrayList();
        this.mCells = arrayList;
        this.mMainInfo = ResultMainInfoBean.createDefault();
        this.mMods = new HashMap();
        this.mRawMods = new HashMap();
        this.mExtMods = new HashMap();
        parcel.readList(arrayList, getClass().getClassLoader());
        this.mMainInfo = (ResultMainInfoBean) parcel.readSerializable();
        Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
        for (String str : readBundle.keySet()) {
            this.mMods.put(str, (BaseTypedBean) readBundle.getSerializable(str));
        }
        Bundle readBundle2 = parcel.readBundle(getClass().getClassLoader());
        for (String str2 : readBundle2.keySet()) {
            this.mRawMods.put(str2, readBundle2.getString(str2));
        }
        Bundle readBundle3 = parcel.readBundle(getClass().getClassLoader());
        for (String str3 : readBundle3.keySet()) {
            this.mExtMods.put(str3, readBundle3.getString(str3));
        }
    }
}
