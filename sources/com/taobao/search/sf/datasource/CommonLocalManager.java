package com.taobao.search.sf.datasource;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.LocalDataManager;
import com.taobao.search.sf.widgets.preposefilter.PreposeFilterBean;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import tb.t2o;
import tb.z2u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class CommonLocalManager implements LocalDataManager {
    public static final Parcelable.Creator<CommonLocalManager> CREATOR = new a();
    public boolean isFilterBtnSelected;
    public Serializable lastClickedTag;
    public z2u mCurrentTopBarBean;
    public boolean mDisableStyleChange;
    public String mKeyword;
    private Map<String, PreposeFilterBean> preposeFilterCache = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Parcelable.Creator<CommonLocalManager> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public CommonLocalManager createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CommonLocalManager) ipChange.ipc$dispatch("2da6279f", new Object[]{this, parcel});
            }
            return new CommonLocalManager(parcel);
        }

        /* renamed from: b */
        public CommonLocalManager[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CommonLocalManager[]) ipChange.ipc$dispatch("8246a008", new Object[]{this, new Integer(i)});
            }
            return new CommonLocalManager[i];
        }
    }

    static {
        t2o.a(815793393);
        t2o.a(993001763);
    }

    public CommonLocalManager() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public PreposeFilterBean getCurrentPreposeFilterBean(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "all";
        }
        return this.preposeFilterCache.get(str);
    }

    public z2u getCurrentTopBarBean() {
        return this.mCurrentTopBarBean;
    }

    public boolean isDisableStyleChange() {
        return this.mDisableStyleChange;
    }

    public void setCurrentPreposeFilterBean(String str, PreposeFilterBean preposeFilterBean) {
        if (TextUtils.isEmpty(str)) {
            str = "all";
        }
        this.preposeFilterCache.put(str, preposeFilterBean);
    }

    public void setCurrentTopBarBean(z2u z2uVar) {
        this.mCurrentTopBarBean = z2uVar;
    }

    public void setDisableStyleChange(boolean z) {
        this.mDisableStyleChange = z;
    }

    public CommonLocalManager(Parcel parcel) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }
}
