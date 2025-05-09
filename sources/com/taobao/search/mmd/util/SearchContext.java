package com.taobao.search.mmd.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import tb.bql;
import tb.h1p;
import tb.k1p;
import tb.mh1;
import tb.r4p;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class SearchContext implements Parcelable {
    public static final Parcelable.Creator<SearchContext> CREATOR = new a();
    private static final String KEY_BIZARGS = "bizargs";
    private static final String KEY_FOOTPRINT_ABTEST = "footprintAbtest";
    public static String compassTitleForUT;
    private String inShopCompassDisplayQuery;
    public String lastCompassTitle;
    private final HashMap<String, String> mLocalParams;
    private final HashSet<String> mParamBlackList;
    private final HashMap<String, String> mWsearchParams;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Parcelable.Creator<SearchContext> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public SearchContext createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SearchContext) ipChange.ipc$dispatch("9cc839b5", new Object[]{this, parcel});
            }
            return new SearchContext(parcel, null);
        }

        /* renamed from: b */
        public SearchContext[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SearchContext[]) ipChange.ipc$dispatch("b6c7715e", new Object[]{this, new Integer(i)});
            }
            return new SearchContext[0];
        }
    }

    static {
        t2o.a(815792585);
    }

    public /* synthetic */ SearchContext(Parcel parcel, a aVar) {
        this(parcel);
    }

    public static SearchContext fromMap(Map<String, String> map) {
        if (map == null) {
            return new SearchContext();
        }
        return new SearchContext(map);
    }

    private void handleParams(Map<String, String> map) {
        Iterator<String> it = this.mParamBlackList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            String remove = map.remove(next);
            if (!TextUtils.isEmpty(remove)) {
                this.mLocalParams.put(next, remove);
            }
        }
        this.mWsearchParams.putAll(map);
        rewriteKeywordValue();
        String wsearchParam = getWsearchParam("catId");
        if (!TextUtils.isEmpty(wsearchParam)) {
            this.mWsearchParams.put(r4p.KEY_CATMAP, wsearchParam);
        }
        this.mLocalParams.putAll(bql.f(this.mLocalParams.get(KEY_BIZARGS)));
    }

    private void initBlackList() {
        this.mParamBlackList.add("referrer");
        this.mParamBlackList.add("price");
        this.mParamBlackList.add("tagInfo");
        this.mParamBlackList.add(mh1.PRD_PICURL);
        this.mParamBlackList.add("compassQuery");
        this.mParamBlackList.add(KEY_BIZARGS);
        this.mParamBlackList.add("searchTips");
        this.mParamBlackList.add("searchWord");
        this.mParamBlackList.add(h1p.KEY_DATASOURCE_TOKEN);
        this.mParamBlackList.add(h1p.KEY_SRP_CUSTOM_TITLE);
        this.mParamBlackList.add(h1p.FROM_SEARCH_TUNNEL);
        this.mParamBlackList.add(h1p.DEFAULT_ONESEARCH_URL);
    }

    private void rewriteKeywordValue() {
        String wsearchParam = getWsearchParam("q");
        String remove = this.mWsearchParams.remove("query");
        if (!TextUtils.isEmpty(remove)) {
            wsearchParam = remove;
        }
        String remove2 = this.mWsearchParams.remove("search");
        if (!TextUtils.isEmpty(remove2)) {
            wsearchParam = remove2;
        }
        HashMap<String, String> hashMap = this.mWsearchParams;
        if (wsearchParam == null || "null".equals(wsearchParam)) {
            wsearchParam = "";
        }
        hashMap.put("q", wsearchParam);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getKeyword() {
        return getWsearchParam("q");
    }

    public String getWsearchParam(String str) {
        return getWsearchParam(str, "");
    }

    public HashMap<String, String> getmWsearchParams() {
        return this.mWsearchParams;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.mParamBlackList);
        parcel.writeMap(this.mLocalParams);
        parcel.writeMap(this.mWsearchParams);
        parcel.writeString(this.inShopCompassDisplayQuery);
        parcel.writeString(this.lastCompassTitle);
    }

    private SearchContext(Map<String, String> map) {
        this.mParamBlackList = new HashSet<>();
        this.mLocalParams = new HashMap<>();
        this.mWsearchParams = new HashMap<>();
        String str = "";
        this.inShopCompassDisplayQuery = str;
        this.lastCompassTitle = str;
        String c = k1p.c();
        if (!TextUtils.isEmpty(c)) {
            map.put(r4p.KEY_EDITION_CODE, c);
        }
        initBlackList();
        handleParams(map);
        String str2 = map.get("q");
        this.inShopCompassDisplayQuery = !TextUtils.isEmpty(str2) ? str2 : str;
    }

    public String getWsearchParam(String str, String str2) {
        String str3 = this.mWsearchParams.get(str);
        return str3 == null ? str2 : str3;
    }

    private SearchContext() {
        this.mParamBlackList = new HashSet<>();
        this.mLocalParams = new HashMap<>();
        this.mWsearchParams = new HashMap<>();
        this.inShopCompassDisplayQuery = "";
        this.lastCompassTitle = "";
    }

    private SearchContext(Parcel parcel) {
        HashSet<String> hashSet = new HashSet<>();
        this.mParamBlackList = hashSet;
        HashMap<String, String> hashMap = new HashMap<>();
        this.mLocalParams = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        this.mWsearchParams = hashMap2;
        this.inShopCompassDisplayQuery = "";
        this.lastCompassTitle = "";
        HashSet hashSet2 = (HashSet) parcel.readSerializable();
        HashMap readHashMap = parcel.readHashMap(null);
        HashMap readHashMap2 = parcel.readHashMap(null);
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        if (hashSet2 != null) {
            hashSet.addAll(hashSet2);
        }
        if (readHashMap != null) {
            hashMap.putAll(readHashMap);
        }
        if (readHashMap2 != null) {
            hashMap2.putAll(readHashMap2);
        }
        if (readString != null) {
            this.inShopCompassDisplayQuery = readString;
        }
        if (readString2 != null) {
            this.lastCompassTitle = readString2;
        }
    }
}
