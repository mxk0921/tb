package com.taobao.passivelocation.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class LocationDTO implements Parcelable {
    public static final Parcelable.Creator<LocationDTO> CREATOR = new Parcelable.Creator<LocationDTO>() { // from class: com.taobao.passivelocation.aidl.LocationDTO.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LocationDTO createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (LocationDTO) ipChange.ipc$dispatch("4a120e97", new Object[]{this, parcel}) : new LocationDTO(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LocationDTO[] newArray(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (LocationDTO[]) ipChange.ipc$dispatch("95004a4e", new Object[]{this, new Integer(i)}) : new LocationDTO[i];
        }
    };
    public Integer accuracy;
    public String cityCode;
    public String cityName;
    public boolean isDefaultPostion;
    public boolean isLocal;
    public boolean isNavSuccess;
    public boolean isNoNetwork;
    public boolean isSwitched;
    public String latitude;
    public String longitude;
    public String msg;
    public String poi;
    public String result;

    static {
        t2o.a(756023333);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getLatitude() {
        return this.latitude;
    }

    public String getLongitude() {
        return this.longitude;
    }

    public boolean isNavSuccess() {
        return this.isNavSuccess;
    }

    public void readFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        this.result = parcel.readString();
        this.msg = parcel.readString();
        boolean z5 = false;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isNavSuccess = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.isSwitched = z2;
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.isLocal = z3;
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.isDefaultPostion = z4;
        if (parcel.readByte() != 0) {
            z5 = true;
        }
        this.isNoNetwork = z5;
        this.cityCode = parcel.readString();
        this.cityName = parcel.readString();
        this.longitude = parcel.readString();
        this.latitude = parcel.readString();
        this.accuracy = Integer.valueOf(parcel.readInt());
        this.poi = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.result);
        parcel.writeString(this.msg);
        parcel.writeByte(this.isNavSuccess ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isSwitched ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isLocal ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isDefaultPostion ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isNoNetwork ? (byte) 1 : (byte) 0);
        parcel.writeString(this.cityCode);
        parcel.writeString(this.cityName);
        parcel.writeString(this.longitude);
        parcel.writeString(this.latitude);
        parcel.writeInt(this.accuracy.intValue());
        parcel.writeString(this.poi);
    }

    public LocationDTO() {
        this.isNavSuccess = false;
        this.isSwitched = false;
        this.isLocal = false;
        this.isDefaultPostion = false;
        this.isNoNetwork = false;
        this.accuracy = 0;
    }

    private LocationDTO(Parcel parcel) {
        this.isNavSuccess = false;
        this.isSwitched = false;
        this.isLocal = false;
        this.isDefaultPostion = false;
        this.isNoNetwork = false;
        this.accuracy = 0;
        readFromParcel(parcel);
    }
}
