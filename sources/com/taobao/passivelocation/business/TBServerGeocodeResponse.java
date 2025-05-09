package com.taobao.passivelocation.business;

import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class TBServerGeocodeResponse extends BaseOutDo {
    private TBServerGeocodeResponseData data;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class TBServerGeocodeResponseData implements IMTOPDataObject {
        private String citycode;
        private String city = null;
        private String cityAbbName = null;
        private String province = null;
        private String country = null;
        private String description = null;
        private String district = null;
        private String districtAbbName = null;
        private String districtcode = null;

        static {
            t2o.a(789577829);
            t2o.a(589299906);
        }

        public String getCity() {
            return this.city;
        }

        public String getCityAbbName() {
            return this.cityAbbName;
        }

        public String getCitycode() {
            return this.citycode;
        }

        public String getCountry() {
            return this.country;
        }

        public String getDescription() {
            return this.description;
        }

        public String getDistrict() {
            return this.district;
        }

        public String getDistrictAbbName() {
            return this.districtAbbName;
        }

        public String getDistrictcode() {
            return this.districtcode;
        }

        public String getProvince() {
            return this.province;
        }

        public void setCity(String str) {
            this.city = str;
        }

        public void setCityAbbName(String str) {
            this.cityAbbName = str;
        }

        public void setCitycode(String str) {
            this.citycode = str;
        }

        public void setCountry(String str) {
            this.country = str;
        }

        public void setDescription(String str) {
            this.description = str;
        }

        public void setDistrict(String str) {
            this.district = str;
        }

        public void setDistrictAbbName(String str) {
            this.districtAbbName = str;
        }

        public void setDistrictcode(String str) {
            this.districtcode = str;
        }

        public void setProvince(String str) {
            this.province = str;
        }
    }

    static {
        t2o.a(789577828);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public Object getData() {
        return this.data;
    }

    public void setData(TBServerGeocodeResponseData tBServerGeocodeResponseData) {
        this.data = tBServerGeocodeResponseData;
    }
}
