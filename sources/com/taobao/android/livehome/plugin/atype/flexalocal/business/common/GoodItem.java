package com.taobao.android.livehome.plugin.atype.flexalocal.business.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class GoodItem implements IMTOPDataObject, Parcelable {
    public static final Parcelable.Creator<GoodItem> CREATOR = new a();
    public String itemH5TaokeUrl;
    public String itemId;
    public String itemImg;
    public String itemTitle;
    public String itemUrl;
    public float price;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements Parcelable.Creator<GoodItem> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public GoodItem createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (GoodItem) ipChange.ipc$dispatch("359c54dc", new Object[]{this, parcel});
            }
            return new GoodItem(parcel);
        }

        /* renamed from: b */
        public GoodItem[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (GoodItem[]) ipChange.ipc$dispatch("8456ac05", new Object[]{this, new Integer(i)});
            }
            return new GoodItem[i];
        }
    }

    static {
        t2o.a(310378515);
        t2o.a(589299906);
    }

    public GoodItem() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.itemImg);
        parcel.writeString(this.itemTitle);
        parcel.writeFloat(this.price);
        parcel.writeString(this.itemUrl);
        parcel.writeString(this.itemH5TaokeUrl);
        parcel.writeString(this.itemId);
    }

    public GoodItem(Parcel parcel) {
        this.itemImg = parcel.readString();
        this.itemTitle = parcel.readString();
        this.price = parcel.readFloat();
        this.itemUrl = parcel.readString();
        this.itemH5TaokeUrl = parcel.readString();
        this.itemId = parcel.readString();
    }
}
