package com.taobao.passivelocation.domain;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class LBSIBeaconDTO implements Comparable<LBSIBeaconDTO>, IMTOPDataObject {
    public Short major;
    public Short minor;
    public Integer rssi;
    public String uuid;

    static {
        t2o.a(789577843);
        t2o.a(589299906);
    }

    public Short getMajor() {
        return this.major;
    }

    public Short getMinor() {
        return this.minor;
    }

    public Integer getRssi() {
        return this.rssi;
    }

    public String getUuid() {
        return this.uuid;
    }

    public int compareTo(LBSIBeaconDTO lBSIBeaconDTO) {
        Short sh;
        return (lBSIBeaconDTO == null || (sh = this.major) == null || lBSIBeaconDTO.major == null || sh.shortValue() != lBSIBeaconDTO.major.shortValue()) ? -1 : 0;
    }
}
