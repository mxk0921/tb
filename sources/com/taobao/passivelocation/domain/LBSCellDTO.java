package com.taobao.passivelocation.domain;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class LBSCellDTO implements Comparable<LBSCellDTO>, IMTOPDataObject {
    private Integer baseStationId;
    private Integer cellId;
    private Integer lac;
    private Integer networkId;
    private Short rssi;
    private Integer systemId;

    static {
        t2o.a(789577841);
        t2o.a(589299906);
    }

    public Integer getBaseStationId() {
        return this.baseStationId;
    }

    public Integer getCellId() {
        return this.cellId;
    }

    public Integer getLac() {
        return this.lac;
    }

    public Integer getNetworkId() {
        return this.networkId;
    }

    public Short getRssi() {
        return this.rssi;
    }

    public Integer getSystemId() {
        return this.systemId;
    }

    public void setBaseStationId(Integer num) {
        this.baseStationId = num;
    }

    public void setCellId(Integer num) {
        this.cellId = num;
    }

    public void setLac(Integer num) {
        this.lac = num;
    }

    public void setNetworkId(Integer num) {
        this.networkId = num;
    }

    public void setRssi(Short sh) {
        this.rssi = sh;
    }

    public void setSystemId(Integer num) {
        this.systemId = num;
    }

    public int compareTo(LBSCellDTO lBSCellDTO) {
        if (lBSCellDTO == null) {
            return -1;
        }
        if (lBSCellDTO.getCellId() != null && getCellId() != null && lBSCellDTO.getCellId().longValue() == getCellId().longValue()) {
            return 0;
        }
        if (lBSCellDTO.getBaseStationId() == null || getBaseStationId() == null || lBSCellDTO.getBaseStationId().longValue() != getBaseStationId().longValue()) {
            return (lBSCellDTO.getCellId() == null && lBSCellDTO.getBaseStationId() == null && getCellId() == null && getBaseStationId() == null) ? 0 : -1;
        }
        return 0;
    }
}
