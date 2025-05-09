package com.alipay.security.mobile.api;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class BICDataModel {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int AUTHTYPE_BARCODE = 3;
    public static final int AUTHTYPE_FINGERPRINT = 1;
    public static final int AUTHTYPE_PASSWORDLESS = 2;
    public static final int CLIENT_STATUS_CLOSED = 0;
    public static final int CLIENT_STATUS_DELETED = 1;
    public static final int CLIENT_STATUS_OPEN = 2;
    public static final int CLIENT_STATUS_UNKNOWN = 3;
    public static final int PROTOCOL_TYPE_ALIPAY = 2;
    public static final int PROTOCOL_TYPE_FIDO = 4;
    public static final int PROTOCOL_TYPE_FIDO_ALIPAY = 3;
    private static final int PROTOCOL_TYPE_IFAA = 2;
    public static final int PROTOCOL_TYPE_NNL_FIDO = 1;
    private static final int PROTOCOL_VERSION_2 = 20;
    public static final int WEARABLETYPE_BARCELET = 1;
    public static final int WEARABLETYPE_WATCH = 2;
    private final int BI_LENGTH;
    private int accessPermission;
    private String authParameter;
    private int authType;
    private int bioInput;
    private int clientStatus;
    private String cpModel;
    private String deviceId;
    private int deviceType;
    private int hardwareInfo;
    public boolean hasAi;
    private String phoneModel;
    private int protocalType;
    private int protocalVersion;
    private int rootStatus;
    private int secDataVersion;
    private int sensorSupport;
    private int serviceVersion;
    private int vendor;
    private int wearableType;

    public BICDataModel(String str, String str2, String str3, String str4) {
        this.hasAi = true;
        this.BI_LENGTH = 8;
        this.deviceType = 1;
        String[] split = str.split("#");
        int length = split.length;
        if (length >= 6) {
            if (length >= 11) {
                this.authType = Integer.parseInt(split[0]);
                this.sensorSupport = Integer.parseInt(split[1]);
                this.clientStatus = Integer.parseInt(split[2]);
                this.wearableType = Integer.parseInt(split[3]);
                this.protocalType = Integer.parseInt(split[4]);
                this.protocalVersion = Integer.parseInt(split[5]);
                this.vendor = Integer.parseInt(split[6]);
                this.serviceVersion = Integer.parseInt(split[7]);
                this.bioInput = Integer.parseInt(split[8]);
                this.accessPermission = Integer.parseInt(split[9]);
                this.hardwareInfo = Integer.parseInt(split[10]);
            } else {
                this.clientStatus = Integer.parseInt(split[0]);
                this.authType = Integer.parseInt(split[1]);
                this.wearableType = Integer.parseInt(split[2]);
                this.protocalType = Integer.parseInt(split[3]);
                this.protocalVersion = Integer.parseInt(split[4]);
                this.vendor = Integer.parseInt(split[5]);
                if (length >= 7) {
                    this.serviceVersion = Integer.parseInt(split[6]);
                } else {
                    this.serviceVersion = 100;
                }
            }
            this.deviceId = str2;
            this.phoneModel = str4;
            this.authParameter = str3;
        }
    }

    public int getAccessPermission() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f304c9c3", new Object[]{this})).intValue();
        }
        return this.accessPermission;
    }

    public final String getAuthInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("34d0ba8d", new Object[]{this});
        }
        return this.clientStatus + "#" + this.authType + "#" + this.wearableType + "#" + this.protocalType + "#" + this.protocalVersion + "#" + this.vendor + "#" + this.serviceVersion;
    }

    public String getAuthParameter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("748358ae", new Object[]{this});
        }
        return this.authParameter;
    }

    public int getAuthType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("205492f2", new Object[]{this})).intValue();
        }
        return this.authType;
    }

    public final String getBioInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("60d62559", new Object[]{this});
        }
        return this.authType + "#" + this.sensorSupport + "#" + this.clientStatus + "#" + this.wearableType + "#" + this.protocalType + "#" + this.protocalVersion + "#" + this.vendor + "#" + this.serviceVersion + "#" + this.bioInput + "#" + this.accessPermission + "#" + this.hardwareInfo;
    }

    public int getBioInput() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2db74592", new Object[]{this})).intValue();
        }
        return this.bioInput;
    }

    public int getClientStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d4f9410d", new Object[]{this})).intValue();
        }
        return this.clientStatus;
    }

    public String getCpModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8d5aa833", new Object[]{this});
        }
        return this.cpModel;
    }

    public String getDeviceId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("79a7d1d2", new Object[]{this});
        }
        return this.deviceId;
    }

    public final String getGlobalBioInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("22850a1c", new Object[]{this});
        }
        return this.authType + "#" + this.clientStatus + "#" + this.protocalType + "#" + this.protocalVersion + "#" + this.deviceType + "#" + this.bioInput + "#" + this.accessPermission + "#" + this.hardwareInfo;
    }

    public int getHardwareInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6b832ba6", new Object[]{this})).intValue();
        }
        return this.hardwareInfo;
    }

    public String getPhoneModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d049c148", new Object[]{this});
        }
        return this.phoneModel;
    }

    public int getProtocalType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("408af930", new Object[]{this})).intValue();
        }
        return this.protocalType;
    }

    public int getProtocalVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("855a8156", new Object[]{this})).intValue();
        }
        return this.protocalVersion;
    }

    public int getRootStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("415b02e4", new Object[]{this})).intValue();
        }
        return this.rootStatus;
    }

    public int getSecDataVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6cbcb0ad", new Object[]{this})).intValue();
        }
        return this.secDataVersion;
    }

    public int getSensorSupport() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6de3a7f9", new Object[]{this})).intValue();
        }
        return this.sensorSupport;
    }

    public int getServiceVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8824e553", new Object[]{this})).intValue();
        }
        return this.serviceVersion;
    }

    public int getVendor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1790fdb8", new Object[]{this})).intValue();
        }
        return this.vendor;
    }

    public int getWearableType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("14e9a6a3", new Object[]{this})).intValue();
        }
        return this.wearableType;
    }

    public int setAccessPermission(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3da7959a", new Object[]{this, new Integer(i)})).intValue();
        }
        this.accessPermission = i;
        return i;
    }

    public int setBioInput(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1c0847ab", new Object[]{this, new Integer(i)})).intValue();
        }
        this.bioInput = i;
        return i;
    }

    public String setCpModel(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("332ba4f5", new Object[]{this, str});
        }
        this.cpModel = str;
        return str;
    }

    public int setHardwareInfo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e078ca17", new Object[]{this, new Integer(i)})).intValue();
        }
        this.hardwareInfo = i;
        return i;
    }

    public int setRootStatus(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("20dc6799", new Object[]{this, new Integer(i)})).intValue();
        }
        this.rootStatus = i;
        return i;
    }

    public int setSecDataVersion(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("791e98f0", new Object[]{this, new Integer(i)})).intValue();
        }
        this.secDataVersion = i;
        return i;
    }

    public int setSensorSupport(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e5bd4dbc", new Object[]{this, new Integer(i)})).intValue();
        }
        this.sensorSupport = i;
        return i;
    }

    public int setServiceVersion(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cabcf90a", new Object[]{this, new Integer(i)})).intValue();
        }
        this.serviceVersion = i;
        return i;
    }

    public BICDataModel(int i, int i2, int i3, int i4, int i5, int i6, int i7, String str, String str2) {
        this.hasAi = true;
        this.BI_LENGTH = 8;
        this.deviceType = 1;
        this.clientStatus = i;
        this.authType = i2;
        this.wearableType = i3;
        this.protocalType = i4;
        this.protocalVersion = i5;
        this.vendor = i6;
        this.serviceVersion = i7;
        this.deviceId = str;
        this.phoneModel = str2;
        this.authParameter = "";
    }

    public BICDataModel(int i, int i2, int i3, int i4, int i5, int i6, int i7, String str, String str2, int i8, int i9, int i10, int i11) {
        this.hasAi = true;
        this.BI_LENGTH = 8;
        this.deviceType = 1;
        this.clientStatus = i;
        this.authType = i2;
        this.wearableType = i3;
        this.protocalType = i4;
        this.protocalVersion = i5;
        this.vendor = i6;
        this.serviceVersion = i7;
        this.deviceId = str;
        this.phoneModel = str2;
        this.sensorSupport = i8;
        this.bioInput = i9;
        this.accessPermission = i10;
        this.hardwareInfo = i11;
        this.authParameter = "";
    }

    public BICDataModel(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, int i6) {
        this.hasAi = true;
        this.BI_LENGTH = 8;
        this.deviceType = 1;
        this.deviceId = str;
        this.phoneModel = str3;
        this.rootStatus = i;
        this.authType = i2;
        this.clientStatus = i3;
        this.bioInput = i4;
        this.accessPermission = i5;
        this.hardwareInfo = i6;
        this.protocalType = 2;
        this.protocalVersion = 20;
    }
}
