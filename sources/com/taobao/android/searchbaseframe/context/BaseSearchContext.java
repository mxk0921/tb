package com.taobao.android.searchbaseframe.context;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.cql;
import tb.t2o;
import tb.tnd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class BaseSearchContext implements Parcelable, tnd {
    public static final Parcelable.Creator<BaseSearchContext> CREATOR = new a();
    protected final Map<String, String> mParams;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Parcelable.Creator<BaseSearchContext> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public BaseSearchContext createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BaseSearchContext) ipChange.ipc$dispatch("5aaab7c6", new Object[]{this, parcel});
            }
            return new BaseSearchContext(parcel);
        }

        /* renamed from: b */
        public BaseSearchContext[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BaseSearchContext[]) ipChange.ipc$dispatch("ace280ef", new Object[]{this, new Integer(i)});
            }
            return new BaseSearchContext[0];
        }
    }

    static {
        t2o.a(993001748);
        t2o.a(993001750);
    }

    public BaseSearchContext(Map<String, String> map) {
        this.mParams = new HashMap();
        handleParams(map);
    }

    public static BaseSearchContext fromIntent(Intent intent) {
        return fromMap(cql.b(intent));
    }

    public static BaseSearchContext fromMap(Map<String, String> map) {
        if (map == null) {
            return new BaseSearchContext();
        }
        return new BaseSearchContext(map);
    }

    public void clearParams() {
        this.mParams.clear();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // tb.tnd
    public boolean getBooleanParam(String str) {
        return "true".equals(getParam(str));
    }

    @Override // tb.tnd
    public String getParam(String str) {
        return getParam(str, "");
    }

    @Override // tb.tnd
    public Map<String, String> getParamsSnapshot() {
        return new HashMap(this.mParams);
    }

    public void handleParams(Map<String, String> map) {
        this.mParams.putAll(map);
    }

    public String removeParam(String str) {
        return this.mParams.remove(str);
    }

    @Override // tb.tnd
    public void setParam(String str, String str2) {
        this.mParams.put(str, str2);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeMap(this.mParams);
    }

    @Override // tb.tnd
    public String getParam(String str, String str2) {
        String str3 = this.mParams.get(str);
        return str3 == null ? str2 : str3;
    }

    public BaseSearchContext() {
        this.mParams = new HashMap();
    }

    public BaseSearchContext(Parcel parcel) {
        HashMap hashMap = new HashMap();
        this.mParams = hashMap;
        HashMap readHashMap = parcel.readHashMap(null);
        if (readHashMap != null) {
            hashMap.putAll(readHashMap);
        }
    }
}
