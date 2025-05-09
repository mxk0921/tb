package com.taobao.android.searchbaseframe.datasource.result;

import android.os.Bundle;
import android.os.Parcel;
import com.taobao.android.searchbaseframe.net.ResultError;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import tb.gy;
import tb.t2o;
import tb.yko;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class AbsSearchResult implements SearchResult {
    private yko mCore;
    private boolean mIsCache;
    private boolean mIsNew;
    private boolean mIsPreLoad;
    private boolean mIsSuccess;
    private ResultError mResultError;
    private gy.c mSearchConfig;
    private boolean sseFinished;
    private boolean sseMode;
    private Map<String, TemplateBean> templates;

    static {
        t2o.a(993001795);
        t2o.a(993001796);
    }

    public AbsSearchResult(yko ykoVar, boolean z) {
        this.mIsSuccess = true;
        this.mCore = ykoVar;
        this.mIsNew = z;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.result.SearchResult
    public boolean bizRuleNoResult() {
        return false;
    }

    public final yko c() {
        return this.mCore;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.result.SearchResult
    public final yko getCore() {
        return this.mCore;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.result.SearchResult
    public final ResultError getError() {
        return this.mResultError;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.result.SearchResult
    public gy.c getSearchConfig() {
        return this.mSearchConfig;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.result.SearchResult
    public final Map<String, TemplateBean> getTemplates() {
        return this.templates;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.result.SearchResult
    public boolean isCache() {
        return this.mIsCache;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.result.SearchResult
    public final boolean isFailed() {
        return !this.mIsSuccess;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.result.SearchResult
    public boolean isNew() {
        return this.mIsNew;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.result.SearchResult
    public boolean isPreload() {
        return this.mIsPreLoad;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.result.SearchResult
    public boolean isSseFinished() {
        return this.sseFinished;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.result.SearchResult
    public boolean isSseMode() {
        return this.sseMode;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.result.SearchResult
    public boolean isSuccess() {
        return this.mIsSuccess;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.result.SearchResult
    public void partialMerge(Set<String> set, SearchResult searchResult) {
        throw new IllegalStateException("Not support partial search");
    }

    @Override // com.taobao.android.searchbaseframe.datasource.result.SearchResult
    public void setCache(boolean z) {
        this.mIsCache = z;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.result.SearchResult
    public final void setCore(yko ykoVar) {
        this.mCore = ykoVar;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.result.SearchResult
    public void setPreLoad(boolean z) {
        this.mIsPreLoad = z;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.result.SearchResult
    public void setResultError(ResultError resultError) {
        this.mIsSuccess = false;
        this.mResultError = resultError;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.result.SearchResult
    public void setSearchConfig(gy.c cVar) {
        this.mSearchConfig = cVar;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.result.SearchResult
    public void setSseFinished(boolean z) {
        this.sseFinished = z;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.result.SearchResult
    public void setSseMode(boolean z) {
        this.sseMode = z;
    }

    public void setSuccess(boolean z) {
        this.mIsSuccess = z;
    }

    public final void setTemplates(Map<String, TemplateBean> map) {
        this.templates = map;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(!this.mIsSuccess ? 1 : 0);
        parcel.writeSerializable(this.mResultError);
        if (this.templates != null) {
            Bundle bundle = new Bundle(this.templates.size());
            for (Map.Entry<String, TemplateBean> entry : this.templates.entrySet()) {
                bundle.putSerializable(entry.getKey(), entry.getValue());
            }
            parcel.writeBundle(bundle);
        } else {
            parcel.writeBundle(null);
        }
        parcel.writeInt(!this.mIsNew ? 1 : 0);
    }

    public AbsSearchResult(Parcel parcel) {
        boolean z = true;
        this.mIsSuccess = true;
        this.mIsSuccess = parcel.readInt() == 0;
        this.mResultError = (ResultError) parcel.readSerializable();
        Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
        if (readBundle != null) {
            this.templates = new HashMap(readBundle.size());
            for (String str : readBundle.keySet()) {
                this.templates.put(str, (TemplateBean) readBundle.getSerializable(str));
            }
        }
        this.mIsNew = parcel.readInt() != 0 ? false : z;
    }
}
