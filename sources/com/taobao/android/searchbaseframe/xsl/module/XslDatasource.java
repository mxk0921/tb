package com.taobao.android.searchbaseframe.xsl.module;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.business.weex.multiplelist.XslMUSComponent;
import com.taobao.android.searchbaseframe.datasource.LocalDataManager;
import com.taobao.android.searchbaseframe.datasource.param.SearchParamImpl;
import java.util.HashMap;
import java.util.Map;
import tb.c4p;
import tb.gy;
import tb.pox;
import tb.psi;
import tb.t2o;
import tb.y5p;
import tb.y64;
import tb.yko;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class XslDatasource extends com.taobao.android.meta.data.a<y64, XslSearchResult> implements LocalDataManager {
    public static final Parcelable.Creator<XslDatasource> CREATOR = new a();
    protected boolean mIsFlatParams;
    private int mTabIndex;
    private boolean mJsParamReady = false;
    private boolean mJsRequestEventFired = false;
    protected final Map<String, String> mTppParams = new HashMap();
    private String mTrackingName = XslMUSComponent.COMPONENT_NAME;
    protected boolean mMetaMode = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Parcelable.Creator<XslDatasource> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public XslDatasource createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (XslDatasource) ipChange.ipc$dispatch("598b8669", new Object[]{this, parcel});
            }
            return null;
        }

        /* renamed from: b */
        public XslDatasource[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (XslDatasource[]) ipChange.ipc$dispatch("d8117420", new Object[]{this, new Integer(i)});
            }
            return new XslDatasource[i];
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b extends gy.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int l = -1;
        public int m = 0;
        public boolean n = false;
        public boolean o = false;

        static {
            t2o.a(993002046);
        }

        public b(gy.c.a aVar) {
            super(aVar);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/xsl/module/XslDatasource$XslSearchConfig");
        }

        public int m() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("232a6f03", new Object[]{this})).intValue();
            }
            return this.m;
        }

        public int n() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d8334803", new Object[]{this})).intValue();
            }
            return this.l;
        }

        public void o(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5996e7f2", new Object[]{this, new Integer(i)});
            }
        }

        public void p(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d94f67ff", new Object[]{this, new Integer(i)});
            } else {
                this.m = i;
            }
        }

        public void q(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("650cc667", new Object[]{this, new Integer(i)});
            } else {
                this.l = i;
            }
        }
    }

    static {
        t2o.a(993002044);
        t2o.a(993001763);
    }

    public void addBizParam(Map<String, String> map) {
        this.mTppParams.putAll(map);
    }

    public void addFixParams(Map<String, String> map) {
        map.put("ttid", c().g().getTtid());
        map.put("utd_id", c().g().getUtdid());
    }

    public void addTppPageParam(Map<String, String> map) {
        map.put("page", String.valueOf(getNextPage()));
        map.put("sversion", c().g().a());
        map.put("ttid", c().g().getTtid());
        map.put("utd_id", c().g().getUtdid());
        Map<String, String> map2 = this.mTppParams;
        if (map2 != null) {
            map.putAll(map2);
        }
    }

    public void addTppParam(String str, String str2) {
        this.mTppParams.put(str, str2);
    }

    @Override // com.taobao.android.meta.data.a
    public psi<y64, XslSearchResult> createRequestAdapter() {
        return new pox(c());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void doUpdateSearch(JSONObject jSONObject, int i, int i2, boolean z, boolean z2) {
        b bVar = new b(gy.c.a().k(false).n(jSONObject));
        bVar.q(i);
        bVar.p(i2);
        bVar.o = z2;
        bVar.n = z;
        searchInternal(bVar);
    }

    @Override // tb.o02, tb.gy
    public StringBuilder dumpDebugInfo() {
        return super.dumpDebugInfo();
    }

    @Override // tb.gy
    public JSONObject dumpDebugParamsInfo() {
        JSONObject dumpDebugParamsInfo = super.dumpDebugParamsInfo();
        String string = dumpDebugParamsInfo.getString("params");
        if (!TextUtils.isEmpty(string)) {
            try {
                dumpDebugParamsInfo.put("params", (Object) JSON.parseObject(string));
            } catch (Exception e) {
                c().l().e("dumpDebugParamsInfo", "tpp params err", e);
            }
        }
        return dumpDebugParamsInfo;
    }

    public int getCurrentTabIndex() {
        return this.mTabIndex;
    }

    @Override // tb.gy, tb.m1p
    public String getTrackingName() {
        return this.mTrackingName;
    }

    public boolean isJsParamReady() {
        return this.mJsParamReady;
    }

    public boolean isJsRequestEventFired() {
        return this.mJsRequestEventFired;
    }

    @Override // com.taobao.android.meta.data.a
    public boolean isMetaMode() {
        return this.mMetaMode;
    }

    @Override // com.taobao.android.meta.data.a, tb.gy
    public void onPreSearchOfParams(gy.c cVar, Map<String, String> map) {
        super.onPreSearchOfParams(cVar, map);
        if (!cVar.b() && cVar.i == null) {
            if (isFirstSearchDone()) {
                c4p.D("[XS.xsl]", "Next page request for tab: %d, page: %d, params: %s", Integer.valueOf(getCurrentTabIndex()), Integer.valueOf(getNextPage()), map);
            } else {
                c4p.D("[XS.xsl]", "First request for tab %d, params: %s", Integer.valueOf(getCurrentTabIndex()), map);
            }
        }
    }

    public void setApi(String str, String str2) {
        ((pox) this.mAdapter).I(str, str2);
        if (!TextUtils.isEmpty(str)) {
            this.mJsParamReady = true;
        }
    }

    @Override // tb.o02
    public void setBizParam(String str, String str2) {
        this.mTppParams.put(str, str2);
    }

    public void setCurrentTabIndex(int i) {
        this.mTabIndex = i;
    }

    public void setFlatParams(boolean z) {
        this.mIsFlatParams = z;
    }

    public void setJsRequestEventFired(boolean z) {
        this.mJsRequestEventFired = z;
    }

    public void setMetaMode() {
        this.mMetaMode = true;
        Object obj = this.mAdapter;
        if (obj instanceof pox) {
            ((pox) obj).K();
        }
    }

    public void setTrackingName(String str) {
        this.mTrackingName = str;
    }

    public XslDatasource(yko ykoVar) {
        super(ykoVar, null);
    }

    @Override // com.taobao.android.meta.data.a
    public Map<String, String> buildSearchParams(SearchParamImpl searchParamImpl, gy.c cVar) {
        Map<String, String> createUrlParams = searchParamImpl.createUrlParams();
        HashMap hashMap = new HashMap();
        addTppPageParam(hashMap);
        HashMap hashMap2 = new HashMap(createUrlParams);
        addFixParams(hashMap2);
        if (this.mIsFlatParams) {
            hashMap2.putAll(hashMap);
        } else {
            hashMap2.put("params", JSON.toJSONString(hashMap));
        }
        return hashMap2;
    }

    @Override // tb.gy
    public XslSearchResult createResult(boolean z) {
        XslSearchResult xslSearchResult = new XslSearchResult(c(), z);
        xslSearchResult.setMetaMode(this.mMetaMode);
        return xslSearchResult;
    }

    public boolean onPostRequest(XslSearchResult xslSearchResult, gy.c cVar, long j, y5p y5pVar) {
        if (xslSearchResult.isFailed()) {
            c4p.C("[XS.xsl]", "Request Return for tab %d, page %d, error: %s", Integer.valueOf(getCurrentTabIndex()), Integer.valueOf(getNextPage()), xslSearchResult.getError());
        } else {
            c4p.D("[XS.xsl]", "Request Return for tab %d, page %d", Integer.valueOf(getCurrentTabIndex()), Integer.valueOf(getNextPage()));
        }
        if ((cVar instanceof b) && getPager() != null) {
            getPager().decreasePage();
        }
        return super.onPostRequest((XslDatasource) xslSearchResult, cVar, j, y5pVar);
    }

    public void setApi(String str, String str2, String str3) {
        if (str3 == null) {
            setApi(str, str2);
            return;
        }
        ((pox) this.mAdapter).J(str, str2, str3);
        if (!TextUtils.isEmpty(str)) {
            this.mJsParamReady = true;
        }
    }

    @Override // com.taobao.android.meta.data.a, tb.gy
    public LocalDataManager onCreateLocalDataManager() {
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }
}
