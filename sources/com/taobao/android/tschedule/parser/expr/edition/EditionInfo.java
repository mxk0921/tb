package com.taobao.android.tschedule.parser.expr.edition;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.o78;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class EditionInfo implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String actualLanguageCode;
    private String area;
    private String cityId;
    private String cityName;
    private String countryCode;
    private String countryName;
    private String countryNumCode;
    private String currencyCode;
    private String editionCode;
    private String hngCookie;
    private String isVillageUser;
    private String languageCode;

    static {
        t2o.a(329252921);
    }

    public EditionInfo() {
        this.editionCode = o78.CHINA_MAINLAND;
    }

    public String getActualLanguageCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2ac87a90", new Object[]{this});
        }
        return this.actualLanguageCode;
    }

    public String getArea() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("160cc5d6", new Object[]{this});
        }
        return this.area;
    }

    public String getCityId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e15c399d", new Object[]{this});
        }
        return this.cityId;
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

    public String getCountryNumCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5513d5c6", new Object[]{this});
        }
        return this.countryNumCode;
    }

    public String getCurrencyCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("48900f65", new Object[]{this});
        }
        return this.currencyCode;
    }

    public String getEditionCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7176de84", new Object[]{this});
        }
        return this.editionCode;
    }

    public String getHngCookie() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("56bf332a", new Object[]{this});
        }
        return this.hngCookie;
    }

    public String getIsVillageUser() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6698d402", new Object[]{this});
        }
        return this.isVillageUser;
    }

    public String getLanguageCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d0fcd9fe", new Object[]{this});
        }
        return this.languageCode;
    }

    public EditionInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        this.countryCode = str2;
        this.countryName = str;
        this.countryNumCode = str3;
        this.languageCode = str4;
        this.actualLanguageCode = str5;
        this.currencyCode = str6;
        this.hngCookie = str7;
        this.cityName = str8;
        this.cityId = str9;
        this.area = str10;
        this.editionCode = str11;
        this.isVillageUser = str12;
    }
}
