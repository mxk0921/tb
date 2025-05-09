package com.taobao.tao.favorite.category;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class FavoriteCategoryData implements IMTOPDataObject, Parcelable {
    public static final Parcelable.Creator<FavoriteCategoryData> CREATOR = new a();
    public String avatarImageUrl;
    public String categoryBgImageUrl;
    public String categoryDesc;
    public String categoryId;
    public String categoryName;
    public int categoryType;
    public String categoryTypeName;
    public String coverImageUrl;
    public String donationActionUrl;
    public String donationText;
    public boolean hasMore;
    public boolean isSelected;
    public boolean isShowDonation;
    public boolean isShowTypeName;
    public boolean isSync;
    public int mode;
    public String nextPage;
    public List<FavoriteCategoryItemData> resultList;
    public String snapshotPic;
    public int source;
    public int totalCount;
    public String userId;
    public String userNick;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements Parcelable.Creator<FavoriteCategoryData> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public FavoriteCategoryData createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FavoriteCategoryData) ipChange.ipc$dispatch("421fc706", new Object[]{this, parcel});
            }
            return new FavoriteCategoryData(parcel);
        }

        /* renamed from: b */
        public FavoriteCategoryData[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FavoriteCategoryData[]) ipChange.ipc$dispatch("603c09fd", new Object[]{this, new Integer(i)});
            }
            return new FavoriteCategoryData[i];
        }
    }

    static {
        t2o.a(462422034);
        t2o.a(589299906);
    }

    public FavoriteCategoryData() {
        this.totalCount = 0;
        this.source = 2;
        this.categoryType = 1;
        this.resultList = new ArrayList();
        this.isShowTypeName = false;
        this.isSync = false;
        this.isShowDonation = false;
        this.isSelected = false;
        this.mode = 1;
    }

    public static FavoriteCategoryData clone(FavoriteCategoryData favoriteCategoryData) {
        return clone(favoriteCategoryData, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("categoryId=");
        stringBuffer.append(this.categoryId);
        stringBuffer.append(", categoryName=");
        stringBuffer.append(this.categoryName);
        stringBuffer.append(", categoryDesc=");
        stringBuffer.append(this.categoryDesc);
        stringBuffer.append(", totalCount=");
        stringBuffer.append(this.totalCount);
        stringBuffer.append(", source=");
        stringBuffer.append(this.source);
        stringBuffer.append(", categoryType=");
        stringBuffer.append(this.categoryType);
        stringBuffer.append(", nextPage=");
        stringBuffer.append(this.nextPage);
        stringBuffer.append(", categoryTypeName=");
        stringBuffer.append(this.categoryTypeName);
        stringBuffer.append(", coverImageUrl=");
        stringBuffer.append(this.coverImageUrl);
        stringBuffer.append(", categoryBgImageUrl=");
        stringBuffer.append(this.categoryBgImageUrl);
        stringBuffer.append(", snapshotPic=");
        stringBuffer.append(this.snapshotPic);
        stringBuffer.append(", userId=");
        stringBuffer.append(this.userId);
        stringBuffer.append(", userNick=");
        stringBuffer.append(this.userNick);
        stringBuffer.append(", avatarImageUrl=");
        stringBuffer.append(this.avatarImageUrl);
        stringBuffer.append(", hasMore=");
        stringBuffer.append(this.hasMore);
        stringBuffer.append(", isShowTypeName=");
        stringBuffer.append(this.isShowTypeName);
        stringBuffer.append(", isSync=");
        stringBuffer.append(this.isSync);
        stringBuffer.append(", mode=");
        stringBuffer.append(this.mode);
        stringBuffer.append(", resultList.size=");
        stringBuffer.append(this.resultList.size());
        return stringBuffer.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.categoryId);
        parcel.writeString(this.categoryName);
        parcel.writeString(this.categoryDesc);
        parcel.writeInt(this.totalCount);
        parcel.writeInt(this.source);
        parcel.writeInt(this.categoryType);
        parcel.writeInt(this.mode);
        parcel.writeString(this.nextPage);
        parcel.writeString(this.categoryTypeName);
        parcel.writeString(this.coverImageUrl);
        parcel.writeString(this.categoryBgImageUrl);
        parcel.writeString(this.snapshotPic);
        parcel.writeString(this.userId);
        parcel.writeString(this.userNick);
        parcel.writeString(this.avatarImageUrl);
        parcel.writeString(this.donationActionUrl);
        parcel.writeString(this.donationText);
        parcel.writeList(this.resultList);
        parcel.writeString(Boolean.toString(this.isShowTypeName));
        parcel.writeString(Boolean.toString(this.isSync));
        parcel.writeString(Boolean.toString(this.isShowDonation));
        parcel.writeString(Boolean.toString(this.hasMore));
        parcel.writeString(Boolean.toString(this.isSelected));
    }

    public static FavoriteCategoryData clone(FavoriteCategoryData favoriteCategoryData, FavoriteCategoryData favoriteCategoryData2) {
        if (favoriteCategoryData2 == null) {
            favoriteCategoryData2 = new FavoriteCategoryData();
        }
        if (!TextUtils.isEmpty(favoriteCategoryData.categoryId)) {
            favoriteCategoryData2.categoryId = favoriteCategoryData.categoryId;
        }
        if (!TextUtils.isEmpty(favoriteCategoryData.categoryName)) {
            favoriteCategoryData2.categoryName = favoriteCategoryData.categoryName;
        }
        int i = favoriteCategoryData.source;
        if (i > 0) {
            favoriteCategoryData2.source = i;
        }
        int i2 = favoriteCategoryData.categoryType;
        if (i2 > 0) {
            favoriteCategoryData2.categoryType = i2;
        }
        int i3 = favoriteCategoryData.mode;
        if (i3 > 0) {
            favoriteCategoryData2.mode = i3;
        }
        int i4 = favoriteCategoryData.totalCount;
        if (i4 > -1) {
            favoriteCategoryData2.totalCount = i4;
        }
        if (!TextUtils.isEmpty(favoriteCategoryData.nextPage)) {
            favoriteCategoryData2.nextPage = favoriteCategoryData.nextPage;
        }
        if (!TextUtils.isEmpty(favoriteCategoryData.userId)) {
            favoriteCategoryData2.userId = favoriteCategoryData.userId;
        }
        if (!TextUtils.isEmpty(favoriteCategoryData.userNick)) {
            favoriteCategoryData2.userNick = favoriteCategoryData.userNick;
        }
        List<FavoriteCategoryItemData> list = favoriteCategoryData.resultList;
        if (list != null && !list.isEmpty()) {
            favoriteCategoryData2.resultList = favoriteCategoryData.resultList;
        }
        favoriteCategoryData2.categoryDesc = favoriteCategoryData.categoryDesc;
        favoriteCategoryData2.categoryTypeName = favoriteCategoryData.categoryTypeName;
        favoriteCategoryData2.coverImageUrl = favoriteCategoryData.coverImageUrl;
        favoriteCategoryData2.categoryBgImageUrl = favoriteCategoryData.categoryBgImageUrl;
        favoriteCategoryData2.snapshotPic = favoriteCategoryData.snapshotPic;
        favoriteCategoryData2.avatarImageUrl = favoriteCategoryData.avatarImageUrl;
        favoriteCategoryData2.donationActionUrl = favoriteCategoryData.donationActionUrl;
        favoriteCategoryData2.donationText = favoriteCategoryData.donationText;
        favoriteCategoryData2.isShowDonation = favoriteCategoryData.isShowDonation;
        favoriteCategoryData2.isSync = favoriteCategoryData.isSync;
        favoriteCategoryData2.hasMore = favoriteCategoryData.hasMore;
        favoriteCategoryData2.isShowTypeName = favoriteCategoryData.isShowTypeName;
        return favoriteCategoryData2;
    }

    public FavoriteCategoryData(Parcel parcel) {
        this.totalCount = 0;
        this.source = 2;
        this.categoryType = 1;
        this.resultList = new ArrayList();
        this.isShowTypeName = false;
        this.isSync = false;
        this.isShowDonation = false;
        this.isSelected = false;
        this.mode = 1;
        this.categoryId = parcel.readString();
        this.categoryName = parcel.readString();
        this.categoryDesc = parcel.readString();
        this.totalCount = parcel.readInt();
        this.source = parcel.readInt();
        this.categoryType = parcel.readInt();
        this.mode = parcel.readInt();
        this.nextPage = parcel.readString();
        this.categoryTypeName = parcel.readString();
        this.coverImageUrl = parcel.readString();
        this.categoryBgImageUrl = parcel.readString();
        this.snapshotPic = parcel.readString();
        this.userId = parcel.readString();
        this.userNick = parcel.readString();
        this.avatarImageUrl = parcel.readString();
        this.donationActionUrl = parcel.readString();
        this.donationText = parcel.readString();
        this.resultList = parcel.readArrayList(FavoriteCategoryItemData.class.getClassLoader());
        this.isShowTypeName = Boolean.valueOf(parcel.readString()).booleanValue();
        this.isSync = Boolean.valueOf(parcel.readString()).booleanValue();
        this.isShowDonation = Boolean.valueOf(parcel.readString()).booleanValue();
        this.hasMore = Boolean.valueOf(parcel.readString()).booleanValue();
        this.isSelected = Boolean.valueOf(parcel.readString()).booleanValue();
    }
}
