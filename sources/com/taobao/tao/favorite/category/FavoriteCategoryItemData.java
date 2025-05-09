package com.taobao.tao.favorite.category;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class FavoriteCategoryItemData implements IMTOPDataObject, Parcelable {
    public static final Parcelable.Creator<FavoriteCategoryItemData> CREATOR = new a();
    public long collectTime;
    public boolean isSelected;
    public String itemId;
    public String itemImageUrl;
    public String itemType;
    public int originFrom;
    public String price;
    public String promotionPrice;
    public int saleType;
    public boolean show11Price;
    public String tagPrice;
    public String title;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements Parcelable.Creator<FavoriteCategoryItemData> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public FavoriteCategoryItemData createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FavoriteCategoryItemData) ipChange.ipc$dispatch("a5eead33", new Object[]{this, parcel});
            }
            return new FavoriteCategoryItemData(parcel);
        }

        /* renamed from: b */
        public FavoriteCategoryItemData[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FavoriteCategoryItemData[]) ipChange.ipc$dispatch("5b29caa", new Object[]{this, new Integer(i)});
            }
            return new FavoriteCategoryItemData[i];
        }
    }

    static {
        t2o.a(462422036);
        t2o.a(589299906);
    }

    public FavoriteCategoryItemData() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("itemId=");
        stringBuffer.append(this.itemId);
        stringBuffer.append(", itemType=");
        stringBuffer.append(this.itemType);
        stringBuffer.append(", itemImageUrl=");
        stringBuffer.append(this.itemImageUrl);
        stringBuffer.append(", tagPrice=");
        stringBuffer.append(this.tagPrice);
        stringBuffer.append(", promotionPrice=");
        stringBuffer.append(this.promotionPrice);
        stringBuffer.append(", price=");
        stringBuffer.append(this.price);
        stringBuffer.append(", title=");
        stringBuffer.append(this.title);
        stringBuffer.append(", saleType=");
        stringBuffer.append(this.saleType);
        stringBuffer.append(", originFrom=");
        stringBuffer.append(this.originFrom);
        stringBuffer.append(", collectTime=");
        stringBuffer.append(this.collectTime);
        stringBuffer.append(", show11Price=");
        stringBuffer.append(this.show11Price);
        stringBuffer.append(", isSelected=");
        stringBuffer.append(this.isSelected);
        return stringBuffer.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.itemId);
        parcel.writeString(this.itemType);
        parcel.writeString(this.itemImageUrl);
        parcel.writeString(this.price);
        parcel.writeString(this.tagPrice);
        parcel.writeString(this.promotionPrice);
        parcel.writeString(this.title);
        parcel.writeInt(this.saleType);
        parcel.writeInt(this.originFrom);
        parcel.writeLong(this.collectTime);
        parcel.writeString(Boolean.toString(this.show11Price));
        parcel.writeString(Boolean.toString(this.isSelected));
    }

    public FavoriteCategoryItemData(Parcel parcel) {
        this.itemId = parcel.readString();
        this.itemType = parcel.readString();
        this.itemImageUrl = parcel.readString();
        this.price = parcel.readString();
        this.tagPrice = parcel.readString();
        this.promotionPrice = parcel.readString();
        this.title = parcel.readString();
        this.saleType = parcel.readInt();
        this.originFrom = parcel.readInt();
        this.collectTime = parcel.readLong();
        this.show11Price = Boolean.valueOf(parcel.readString()).booleanValue();
        this.isSelected = Boolean.valueOf(parcel.readString()).booleanValue();
    }
}
