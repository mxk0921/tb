package com.taobao.location.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class TBLocationDTO implements Parcelable {
    public static final Parcelable.Creator<TBLocationDTO> CREATOR = new a();
    private static final String LOG = "TBLocationDTO";
    public Integer accuracy;
    public String address;
    public Double altitude;
    public String areaCode;
    public String areaName;
    public String cityCode;
    public String cityName;
    public String countryCode;
    public String countryName;
    public Integer errorCode;
    public boolean isNavSuccess;
    public String latitude;
    public Integer locationType;
    public String longitude;
    public List<TBPoiDetailDO> pois;
    public String provinceCode;
    public String provinceName;
    public Integer regionType;
    public Long timeStamp;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements Parcelable.Creator<TBLocationDTO> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public TBLocationDTO createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TBLocationDTO) ipChange.ipc$dispatch("d5c3d3cf", new Object[]{this, parcel});
            }
            return new TBLocationDTO(parcel, null);
        }

        /* renamed from: b */
        public TBLocationDTO[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TBLocationDTO[]) ipChange.ipc$dispatch("efc30b78", new Object[]{this, new Integer(i)});
            }
            return new TBLocationDTO[i];
        }
    }

    static {
        t2o.a(756023321);
    }

    public /* synthetic */ TBLocationDTO(Parcel parcel, a aVar) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Integer getAccuracy() {
        return this.accuracy;
    }

    public String getAddress() {
        return this.address;
    }

    public Double getAltitude() {
        return this.altitude;
    }

    public String getAreaCode() {
        return this.areaCode;
    }

    public String getAreaName() {
        return this.areaName;
    }

    public String getCityCode() {
        return this.cityCode;
    }

    public String getCityName() {
        return this.cityName;
    }

    public Integer getErrorCode() {
        return this.errorCode;
    }

    public String getLatitude() {
        return this.latitude;
    }

    public Integer getLocationType() {
        return this.locationType;
    }

    public String getLongitude() {
        return this.longitude;
    }

    public String getProvinceCode() {
        return this.provinceCode;
    }

    public String getProvinceName() {
        return this.provinceName;
    }

    public Integer getRegionType() {
        return this.regionType;
    }

    public Long getTimeStamp() {
        return this.timeStamp;
    }

    public boolean isNavSuccess() {
        return this.isNavSuccess;
    }

    public void readFromParcel(Parcel parcel) {
        boolean z;
        this.provinceCode = parcel.readString();
        this.provinceName = parcel.readString();
        this.cityCode = parcel.readString();
        this.cityName = parcel.readString();
        this.areaCode = parcel.readString();
        this.areaName = parcel.readString();
        this.longitude = parcel.readString();
        this.latitude = parcel.readString();
        this.address = parcel.readString();
        this.timeStamp = Long.valueOf(parcel.readLong());
        this.accuracy = Integer.valueOf(parcel.readInt());
        parcel.readTypedList(this.pois, TBPoiDetailDO.CREATOR);
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isNavSuccess = z;
        this.errorCode = Integer.valueOf(parcel.readInt());
        this.locationType = Integer.valueOf(parcel.readInt());
        this.countryCode = parcel.readString();
        this.countryName = parcel.readString();
        this.regionType = Integer.valueOf(parcel.readInt());
    }

    public void setErrorCode(Integer num) {
        this.errorCode = num;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.provinceCode);
        parcel.writeString(this.provinceName);
        parcel.writeString(this.cityCode);
        parcel.writeString(this.cityName);
        parcel.writeString(this.areaCode);
        parcel.writeString(this.areaName);
        parcel.writeString(this.longitude);
        parcel.writeString(this.latitude);
        parcel.writeString(this.address);
        parcel.writeLong(this.timeStamp.longValue());
        parcel.writeInt(this.accuracy.intValue());
        parcel.writeTypedList(this.pois);
        parcel.writeByte(this.isNavSuccess ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.errorCode.intValue());
        parcel.writeInt(this.locationType.intValue());
        parcel.writeString(this.countryCode);
        parcel.writeString(this.countryName);
        parcel.writeInt(this.regionType.intValue());
    }

    public TBLocationDTO() {
        this.isNavSuccess = false;
        this.pois = new ArrayList();
    }

    private TBLocationDTO(Parcel parcel) {
        this.isNavSuccess = false;
        this.pois = new ArrayList();
        readFromParcel(parcel);
    }
}
