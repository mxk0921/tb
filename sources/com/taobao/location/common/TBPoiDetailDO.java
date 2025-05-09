package com.taobao.location.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class TBPoiDetailDO implements Parcelable {
    public static final Parcelable.Creator<TBPoiDetailDO> CREATOR = new a();
    public String address;
    public String direction;
    public float distance;
    public String latitude;
    public String longitude;
    public String name;
    public String tel;
    public String type;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements Parcelable.Creator<TBPoiDetailDO> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public TBPoiDetailDO createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TBPoiDetailDO) ipChange.ipc$dispatch("fa1d0c33", new Object[]{this, parcel});
            }
            return new TBPoiDetailDO(parcel, null);
        }

        /* renamed from: b */
        public TBPoiDetailDO[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TBPoiDetailDO[]) ipChange.ipc$dispatch("141c43dc", new Object[]{this, new Integer(i)});
            }
            return new TBPoiDetailDO[i];
        }
    }

    static {
        t2o.a(756023330);
    }

    public /* synthetic */ TBPoiDetailDO(Parcel parcel, a aVar) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void readFromParcel(Parcel parcel) {
        this.name = parcel.readString();
        this.type = parcel.readString();
        this.tel = parcel.readString();
        this.distance = parcel.readFloat();
        this.direction = parcel.readString();
        this.address = parcel.readString();
        this.longitude = parcel.readString();
        this.latitude = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.type);
        parcel.writeString(this.tel);
        parcel.writeFloat(this.distance);
        parcel.writeString(this.direction);
        parcel.writeString(this.address);
        parcel.writeString(this.longitude);
        parcel.writeString(this.latitude);
    }

    public TBPoiDetailDO() {
    }

    private TBPoiDetailDO(Parcel parcel) {
        readFromParcel(parcel);
    }
}
