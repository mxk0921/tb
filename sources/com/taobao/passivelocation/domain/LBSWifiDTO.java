package com.taobao.passivelocation.domain;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class LBSWifiDTO implements Comparable<LBSWifiDTO>, IMTOPDataObject {
    private Long mac;
    private Short rssi;
    private String ssid;

    static {
        t2o.a(789577844);
        t2o.a(589299906);
    }

    public Long getMac() {
        return this.mac;
    }

    public Short getRssi() {
        return this.rssi;
    }

    public String getSsid() {
        return this.ssid;
    }

    public void setMac(Long l) {
        this.mac = l;
    }

    public void setRssi(Short sh) {
        this.rssi = sh;
    }

    public void setSsid(String str) {
        this.ssid = str;
    }

    public int compareTo(LBSWifiDTO lBSWifiDTO) {
        return (lBSWifiDTO == null || this.mac == null || lBSWifiDTO.getMac() == null || lBSWifiDTO.getMac().longValue() != this.mac.longValue()) ? -1 : 0;
    }
}
