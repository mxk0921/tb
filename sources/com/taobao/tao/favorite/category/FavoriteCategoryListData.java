package com.taobao.tao.favorite.category;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class FavoriteCategoryListData implements IMTOPDataObject, Parcelable {
    public static final Parcelable.Creator<FavoriteCategoryListData> CREATOR = new a();
    public boolean hasMore;
    public String nextPage;
    public List<FavoriteCategoryData> resultList;
    public String tips;
    public String tipsUrl;
    public Integer totalCount;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements Parcelable.Creator<FavoriteCategoryListData> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public FavoriteCategoryListData createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FavoriteCategoryListData) ipChange.ipc$dispatch("dc983688", new Object[]{this, parcel});
            }
            return new FavoriteCategoryListData(parcel);
        }

        /* renamed from: b */
        public FavoriteCategoryListData[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FavoriteCategoryListData[]) ipChange.ipc$dispatch("3c5c25ff", new Object[]{this, new Integer(i)});
            }
            return new FavoriteCategoryListData[i];
        }
    }

    static {
        t2o.a(462422038);
        t2o.a(589299906);
    }

    public FavoriteCategoryListData() {
        this.resultList = new ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("totalCount=");
        stringBuffer.append(this.totalCount);
        stringBuffer.append(", hasMore=");
        stringBuffer.append(this.hasMore);
        stringBuffer.append(", nextPage=");
        stringBuffer.append(this.nextPage);
        stringBuffer.append(", resultList.size=");
        stringBuffer.append(this.resultList.size());
        return stringBuffer.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.totalCount.intValue());
        parcel.writeList(this.resultList);
        parcel.writeString(Boolean.toString(this.hasMore));
        parcel.writeString(this.nextPage);
        parcel.writeString(this.tips);
        parcel.writeString(this.tipsUrl);
    }

    public FavoriteCategoryListData(Parcel parcel) {
        this.resultList = new ArrayList();
        this.totalCount = Integer.valueOf(parcel.readInt());
        this.resultList = parcel.readArrayList(FavoriteCategoryData.class.getClassLoader());
        this.hasMore = Boolean.valueOf(parcel.readString()).booleanValue();
        this.nextPage = parcel.readString();
        this.tips = parcel.readString();
        this.tipsUrl = parcel.readString();
    }
}
