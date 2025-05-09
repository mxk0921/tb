package com.taobao.passivelocation.domain;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class LBSDTO implements Comparable<LBSDTO>, IMTOPDataObject {
    public Integer accuracy;
    public String address;
    public Double altitude;
    public String area;
    public String areaCode;
    public Short cellMCC;
    public Short cellMNC;
    public Short cellNum;
    public Short cellType;
    public LBSCellDTO[] cells;
    public String city;
    public String cityCode;
    public short gatherType;
    public Boolean hasLocation;
    public Short iBeaconCount;
    public LBSIBeaconDTO[] iBeacons;
    public String imei;
    public String ip;
    public boolean isTimeOnly;
    public Double latitude;
    public Double longitude;
    public Long macAddr;
    public String province;
    public String provinceCode;
    public long time;
    public String utdid;
    public int version;
    public Boolean wifiConn;
    public Short wifiNum;
    public LBSWifiDTO[] wifis;
    public static final Short CELL_TYPE_GSM = 0;
    public static final Short CELL_TYPE_CDMA = 1;

    static {
        t2o.a(789577842);
        t2o.a(589299906);
    }

    public Integer getAccuracy() {
        return this.accuracy;
    }

    public Short getCellMCC() {
        return this.cellMCC;
    }

    public Short getCellMNC() {
        return this.cellMNC;
    }

    public Short getCellNum() {
        return this.cellNum;
    }

    public Short getCellType() {
        return this.cellType;
    }

    public LBSCellDTO[] getCells() {
        return this.cells;
    }

    public Boolean getHasLocation() {
        return this.hasLocation;
    }

    public String getIp() {
        return this.ip;
    }

    public Double getLatitude() {
        return this.latitude;
    }

    public Double getLongitude() {
        return this.longitude;
    }

    public Long getMacAddr() {
        return this.macAddr;
    }

    public long getTime() {
        return this.time;
    }

    public String getUtdid() {
        return this.utdid;
    }

    public int getVersion() {
        return this.version;
    }

    public Boolean getWifiConn() {
        return this.wifiConn;
    }

    public Short getWifiNum() {
        return this.wifiNum;
    }

    public LBSWifiDTO[] getWifis() {
        return this.wifis;
    }

    public boolean isTimeOnly() {
        return this.isTimeOnly;
    }

    public void setAccuracy(Integer num) {
        this.accuracy = num;
    }

    public void setAltitude(Double d) {
        this.altitude = d;
    }

    public void setCellMCC(Short sh) {
        this.cellMCC = sh;
    }

    public void setCellMNC(Short sh) {
        this.cellMNC = sh;
    }

    public void setCellNum(Short sh) {
        this.cellNum = sh;
    }

    public void setCellType(Short sh) {
        this.cellType = sh;
    }

    public void setCells(LBSCellDTO[] lBSCellDTOArr) {
        this.cells = lBSCellDTOArr;
    }

    public void setGatherType(short s) {
        this.gatherType = s;
    }

    public void setHasLocation(Boolean bool) {
        this.hasLocation = bool;
    }

    public void setImei(String str) {
        this.imei = str;
    }

    public void setIp(String str) {
        this.ip = str;
    }

    public void setLatitude(Double d) {
        this.latitude = d;
    }

    public void setLongitude(Double d) {
        this.longitude = d;
    }

    public void setMacAddr(Long l) {
        this.macAddr = l;
    }

    public void setTime(long j) {
        this.time = j;
    }

    public void setTimeOnly(boolean z) {
        this.isTimeOnly = z;
    }

    public void setUtdId(String str) {
        this.utdid = str;
    }

    public void setVersion(int i) {
        this.version = i;
    }

    public void setWifiConn(Boolean bool) {
        this.wifiConn = bool;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
        r1 = r1 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int compareTo(com.taobao.passivelocation.domain.LBSDTO r15) {
        /*
            r14 = this;
            r0 = -1
            if (r15 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.Short r1 = r14.wifiNum
            r2 = 0
            if (r1 == 0) goto L_0x004e
            java.lang.Short r3 = r15.wifiNum
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x004e
            java.lang.Short r1 = r14.wifiNum
            short r1 = r1.shortValue()
            if (r1 == 0) goto L_0x004e
            r1 = 0
        L_0x001a:
            java.lang.Short r3 = r14.wifiNum
            short r3 = r3.shortValue()
            if (r1 >= r3) goto L_0x004e
            r3 = 0
        L_0x0023:
            java.lang.Short r4 = r14.wifiNum
            short r4 = r4.shortValue()
            if (r3 >= r4) goto L_0x004d
            com.taobao.passivelocation.domain.LBSWifiDTO[] r4 = r15.wifis
            r4 = r4[r3]
            java.lang.Long r4 = r4.getMac()
            long r4 = r4.longValue()
            com.taobao.passivelocation.domain.LBSWifiDTO[] r6 = r14.wifis
            r6 = r6[r1]
            java.lang.Long r6 = r6.getMac()
            long r6 = r6.longValue()
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x004a
            int r1 = r1 + 1
            goto L_0x001a
        L_0x004a:
            int r3 = r3 + 1
            goto L_0x0023
        L_0x004d:
            return r0
        L_0x004e:
            java.lang.Short r1 = r14.cellNum
            if (r1 == 0) goto L_0x007d
            java.lang.Short r3 = r15.cellNum
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x007d
            java.lang.Short r1 = r14.cellNum
            short r1 = r1.shortValue()
            if (r1 == 0) goto L_0x007d
            r1 = 0
        L_0x0063:
            java.lang.Short r3 = r14.cellNum
            short r3 = r3.shortValue()
            if (r1 >= r3) goto L_0x007d
            com.taobao.passivelocation.domain.LBSCellDTO[] r3 = r15.cells
            r3 = r3[r1]
            com.taobao.passivelocation.domain.LBSCellDTO[] r4 = r14.cells
            r4 = r4[r1]
            int r3 = r3.compareTo(r4)
            if (r3 == 0) goto L_0x007a
            return r0
        L_0x007a:
            int r1 = r1 + 1
            goto L_0x0063
        L_0x007d:
            java.lang.Double r1 = r15.latitude
            r3 = 1
            if (r1 == 0) goto L_0x00b3
            java.lang.Double r4 = r15.longitude
            if (r4 == 0) goto L_0x00b3
            java.lang.Double r4 = r14.latitude
            if (r4 == 0) goto L_0x00b3
            java.lang.Double r4 = r14.longitude
            if (r4 == 0) goto L_0x00b3
            float[] r3 = new float[r3]
            double r5 = r1.doubleValue()
            java.lang.Double r15 = r15.longitude
            double r7 = r15.doubleValue()
            java.lang.Double r15 = r14.latitude
            double r9 = r15.doubleValue()
            java.lang.Double r15 = r14.longitude
            double r11 = r15.doubleValue()
            r13 = r3
            android.location.Location.distanceBetween(r5, r7, r9, r11, r13)
            r15 = r3[r2]
            r1 = 1120403456(0x42c80000, float:100.0)
            int r15 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            if (r15 <= 0) goto L_0x00c2
            return r0
        L_0x00b3:
            if (r1 != 0) goto L_0x00b7
            r15 = 1
            goto L_0x00b8
        L_0x00b7:
            r15 = 0
        L_0x00b8:
            java.lang.Double r1 = r14.latitude
            if (r1 != 0) goto L_0x00bd
            goto L_0x00be
        L_0x00bd:
            r3 = 0
        L_0x00be:
            r15 = r15 & r3
            if (r15 != 0) goto L_0x00c2
            return r0
        L_0x00c2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.passivelocation.domain.LBSDTO.compareTo(com.taobao.passivelocation.domain.LBSDTO):int");
    }
}
