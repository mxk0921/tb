package com.taobao.android.tschedule.parser.expr.location;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class LocationInfo implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String accuracy;
    private String address;
    private String altitude;
    private String areaCode;
    private String areaName;
    private String cityCode;
    private String cityName;
    private String countryCode;
    private String countryName;
    private String geohash;
    private String latitude;
    private String longitude;
    private String provinceCode;
    private String provinceName;
    private String timeStamp;

    static {
        t2o.a(329252925);
    }

    public LocationInfo() {
    }

    public String getAccuracy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5211e3ea", new Object[]{this});
        }
        return this.accuracy;
    }

    public String getAddress() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6b6339fb", new Object[]{this});
        }
        return this.address;
    }

    public String getAltitude() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1dc25e1", new Object[]{this});
        }
        return this.altitude;
    }

    public String getAreaCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6efa769", new Object[]{this});
        }
        return this.areaCode;
    }

    public String getAreaName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("88ab898b", new Object[]{this});
        }
        return this.areaName;
    }

    public String getCityCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6a55f44b", new Object[]{this});
        }
        return this.cityCode;
    }

    public String getCityName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ec11d66d", new Object[]{this});
        }
        return this.cityName;
    }

    public String getCountryCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7094bfac", new Object[]{this});
        }
        return this.countryCode;
    }

    public String getCountryName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f250a1ce", new Object[]{this});
        }
        return this.countryName;
    }

    public String getGeohash() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c48c6f0", new Object[]{this});
        }
        return this.geohash;
    }

    public String getLatitude() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6f4fa657", new Object[]{this});
        }
        return this.latitude;
    }

    public String getLongitude() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16d079a0", new Object[]{this});
        }
        return this.longitude;
    }

    public String getProvinceCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58314526", new Object[]{this});
        }
        return this.provinceCode;
    }

    public String getProvinceName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d9ed2748", new Object[]{this});
        }
        return this.provinceName;
    }

    public String getTimeStamp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4b946cb9", new Object[]{this});
        }
        return this.timeStamp;
    }

    public LocationInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        this.provinceCode = str;
        this.provinceName = str2;
        this.cityCode = str3;
        this.cityName = str4;
        this.areaCode = str5;
        this.areaName = str6;
        this.longitude = str7;
        this.latitude = str8;
        this.altitude = str9;
        this.address = str10;
        this.timeStamp = str11;
        this.accuracy = str12;
        this.countryCode = str13;
        this.countryName = str14;
        this.geohash = str15;
    }
}
