package com.amap.api.location;

import com.amap.api.location.AMapLocationClientOption;
import com.loc.fr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AMapLocationQualityReport implements Cloneable {
    public static final int GPS_STATUS_MODE_SAVING = 3;
    public static final int GPS_STATUS_NOGPSPERMISSION = 4;
    public static final int GPS_STATUS_NOGPSPROVIDER = 1;
    public static final int GPS_STATUS_OFF = 2;
    public static final int GPS_STATUS_OK = 0;
    private boolean b = false;
    private int c = 2;
    private int d = 0;
    private String e = "UNKNOWN";
    private long f = 0;
    private boolean g = false;

    /* renamed from: a  reason: collision with root package name */
    AMapLocationClientOption.AMapLocationMode f4584a = AMapLocationClientOption.AMapLocationMode.Hight_Accuracy;

    public AMapLocationQualityReport clone() {
        AMapLocationQualityReport aMapLocationQualityReport = new AMapLocationQualityReport();
        try {
            super.clone();
        } catch (Throwable unused) {
        }
        try {
            aMapLocationQualityReport.setGpsStatus(this.c);
            aMapLocationQualityReport.setGPSSatellites(this.d);
            aMapLocationQualityReport.setWifiAble(this.b);
            aMapLocationQualityReport.setNetUseTime(this.f);
            aMapLocationQualityReport.setNetworkType(this.e);
            aMapLocationQualityReport.setLocationMode(this.f4584a);
            aMapLocationQualityReport.setInstallHighDangerMockApp(this.g);
        } catch (Throwable th) {
            fr.a(th, "AMapLocationQualityReport", "clone");
        }
        return aMapLocationQualityReport;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String getAdviseMessage() {
        /*
            r4 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            com.amap.api.location.AMapLocationClientOption$AMapLocationMode r1 = r4.f4584a
            com.amap.api.location.AMapLocationClientOption$AMapLocationMode r2 = com.amap.api.location.AMapLocationClientOption.AMapLocationMode.Battery_Saving
            if (r1 == r2) goto L_0x003b
            int r2 = r4.c
            r3 = 4
            if (r2 == 0) goto L_0x002f
            r1 = 1
            if (r2 == r1) goto L_0x002b
            r1 = 2
            if (r2 == r1) goto L_0x0027
            r1 = 3
            if (r2 == r1) goto L_0x0023
            if (r2 == r3) goto L_0x001c
            goto L_0x003b
        L_0x001c:
            java.lang.String r1 = "您的设置禁用了GPS定位权限，开启GPS定位权限有助于提高定位的精确度\n"
        L_0x001f:
            r0.append(r1)
            goto L_0x003b
        L_0x0023:
            java.lang.String r1 = "您的设备当前设置的定位模式不包含GPS定位，选择包含GPS模式的定位模式有助于提高定位的精确度\n"
            goto L_0x001f
        L_0x0027:
            java.lang.String r1 = "您的设备关闭了GPS定位功能，开启GPS定位功能有助于提高定位的精确度\n"
            goto L_0x001f
        L_0x002b:
            java.lang.String r1 = "您的设备没有GPS模块或者GPS模块异常，无法进行GPS定位\n"
            goto L_0x001f
        L_0x002f:
            com.amap.api.location.AMapLocationClientOption$AMapLocationMode r2 = com.amap.api.location.AMapLocationClientOption.AMapLocationMode.Device_Sensors
            if (r1 != r2) goto L_0x003b
            int r1 = r4.d
            if (r1 >= r3) goto L_0x003b
            java.lang.String r1 = "当前GPS信号弱，位置更新可能会延迟\n"
            goto L_0x001f
        L_0x003b:
            com.amap.api.location.AMapLocationClientOption$AMapLocationMode r1 = r4.f4584a
            com.amap.api.location.AMapLocationClientOption$AMapLocationMode r2 = com.amap.api.location.AMapLocationClientOption.AMapLocationMode.Device_Sensors
            if (r1 == r2) goto L_0x006a
            java.lang.String r1 = "DISCONNECTED"
            java.lang.String r2 = r4.e
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0052
            java.lang.String r1 = "您的设备未连接到网络，无法进行网络定位\n"
        L_0x004e:
            r0.append(r1)
            goto L_0x0060
        L_0x0052:
            java.lang.String r1 = "2G"
            java.lang.String r2 = r4.e
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0060
            java.lang.String r1 = "您的设备网络状态不太好，网络定位可能会有延迟\n"
            goto L_0x004e
        L_0x0060:
            boolean r1 = r4.b
            if (r1 != 0) goto L_0x006a
            java.lang.String r1 = "您的设备WIFI开关已关闭，打开WIFI开关有助于提高定位的成功率\n"
            r0.append(r1)
        L_0x006a:
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.location.AMapLocationQualityReport.getAdviseMessage():java.lang.String");
    }

    public int getGPSSatellites() {
        return this.d;
    }

    public int getGPSStatus() {
        return this.c;
    }

    public long getNetUseTime() {
        return this.f;
    }

    public String getNetworkType() {
        return this.e;
    }

    public boolean isInstalledHighDangerMockApp() {
        return this.g;
    }

    public boolean isWifiAble() {
        return this.b;
    }

    public void setGPSSatellites(int i) {
        this.d = i;
    }

    public void setGpsStatus(int i) {
        this.c = i;
    }

    public void setInstallHighDangerMockApp(boolean z) {
        this.g = z;
    }

    public void setLocationMode(AMapLocationClientOption.AMapLocationMode aMapLocationMode) {
        this.f4584a = aMapLocationMode;
    }

    public void setNetUseTime(long j) {
        this.f = j;
    }

    public void setNetworkType(String str) {
        this.e = str;
    }

    public void setWifiAble(boolean z) {
        this.b = z;
    }
}
