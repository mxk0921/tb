package com.taobao.taolive.uikit.mtop;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class LiveItem implements IMTOPDataObject, Parcelable {
    public static final Parcelable.Creator<LiveItem> CREATOR = new a();
    public long itemId;
    public String itemName;
    public String itemPic;
    public float itemPrice;
    public String itemUrl;
    public String liveId;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements Parcelable.Creator<LiveItem> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public LiveItem createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LiveItem) ipChange.ipc$dispatch("83f44689", new Object[]{this, parcel});
            }
            return new LiveItem(parcel);
        }

        /* renamed from: b */
        public LiveItem[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LiveItem[]) ipChange.ipc$dispatch("947f5472", new Object[]{this, new Integer(i)});
            }
            return new LiveItem[i];
        }
    }

    static {
        t2o.a(779093630);
        t2o.a(589299906);
    }

    public LiveItem() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.itemId);
        parcel.writeString(this.itemPic);
        parcel.writeString(this.itemName);
        parcel.writeFloat(this.itemPrice);
        parcel.writeString(this.itemUrl);
        parcel.writeString(this.liveId);
    }

    public LiveItem(Parcel parcel) {
        this.itemId = parcel.readLong();
        this.itemPic = parcel.readString();
        this.itemName = parcel.readString();
        this.itemPrice = parcel.readFloat();
        this.itemUrl = parcel.readString();
        this.liveId = parcel.readString();
    }
}
