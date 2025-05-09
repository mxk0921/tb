package com.alibaba.ariver.resource.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;
import tb.gbs;
import tb.vas;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class PluginModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<PluginModel> CREATOR = new Parcelable.Creator<PluginModel>() { // from class: com.alibaba.ariver.resource.api.models.PluginModel.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PluginModel createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (PluginModel) ipChange.ipc$dispatch("a6f5e1aa", new Object[]{this, parcel}) : new PluginModel(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PluginModel[] newArray(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (PluginModel[]) ipChange.ipc$dispatch("fb965a13", new Object[]{this, new Integer(i)}) : new PluginModel[i];
        }
    };
    private static final long serialVersionUID = 5268600696037076004L;
    @JSONField
    private String appId;
    @JSONField
    private String appKey;
    @JSONField
    private String bytePackageUrl;
    @JSONField
    private String developerVersion;
    @JSONField
    private JSONObject extendInfo;
    @JSONField
    private String fallbackBaseUrl;
    @JSONField
    private String newFallbackBaseUrl;
    @JSONField
    private String newPackageSize;
    @JSONField
    private String newPackageUrl;
    @JSONField
    private String packageSize;
    @JSONField
    private String packageUrl;
    @JSONField
    private JSONObject permission;
    @JSONField
    private JSONObject permissionControl;
    @JSONField
    private String pluginScene;
    @JSONField
    private String pluginType;
    @JSONField
    private String requireVersion;
    private ConcurrentHashMap<String, String> startInfoData;
    @JSONField(name = "deployVersion")
    private String version;

    public PluginModel() {
        this.startInfoData = new ConcurrentHashMap<>();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAppId() {
        return this.appId;
    }

    public String getAppKey() {
        return this.appKey;
    }

    public String getBytePackageUrl() {
        return this.bytePackageUrl;
    }

    public String getData(String str) {
        ConcurrentHashMap<String, String> concurrentHashMap;
        if (str == null || (concurrentHashMap = this.startInfoData) == null || concurrentHashMap.isEmpty()) {
            return null;
        }
        return this.startInfoData.get(str);
    }

    public String getDeveloperVersion() {
        return this.developerVersion;
    }

    public JSONObject getExtendInfo() {
        return this.extendInfo;
    }

    public String getFallbackBaseUrl() {
        return this.fallbackBaseUrl;
    }

    public String getNewFallbackBaseUrl() {
        return this.newFallbackBaseUrl;
    }

    public String getNewPackageSize() {
        return this.newPackageSize;
    }

    public String getNewPackageUrl() {
        return this.newPackageUrl;
    }

    public String getPackageSize() {
        return this.packageSize;
    }

    public String getPackageUrl() {
        return this.packageUrl;
    }

    public JSONObject getPermission() {
        return this.permission;
    }

    public JSONObject getPermissionControl() {
        return this.permissionControl;
    }

    public String getPluginScene() {
        return this.pluginScene;
    }

    public String getPluginType() {
        return this.pluginType;
    }

    public String getRequireVersion() {
        return this.requireVersion;
    }

    public String getVersion() {
        return this.version;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setAppKey(String str) {
        this.appKey = str;
    }

    public void setBytePackageUrl(String str) {
        this.bytePackageUrl = str;
    }

    public void setData(String str, String str2) {
        if (str != null && str2 != null) {
            if (this.startInfoData == null) {
                this.startInfoData = new ConcurrentHashMap<>();
            }
            this.startInfoData.put(str, str2);
        }
    }

    public void setDeveloperVersion(String str) {
        this.developerVersion = str;
    }

    public void setExtendInfo(JSONObject jSONObject) {
        this.extendInfo = jSONObject;
    }

    public void setFallbackBaseUrl(String str) {
        this.fallbackBaseUrl = str;
    }

    public void setNewFallbackBaseUrl(String str) {
        this.newFallbackBaseUrl = str;
    }

    public void setNewPackageSize(String str) {
        this.newPackageSize = str;
    }

    public void setNewPackageUrl(String str) {
        this.newPackageUrl = str;
    }

    public void setPackageSize(String str) {
        this.packageSize = str;
    }

    public void setPackageUrl(String str) {
        this.packageUrl = str;
    }

    public void setPermission(JSONObject jSONObject) {
        this.permission = jSONObject;
    }

    public void setPermissionControl(JSONObject jSONObject) {
        this.permissionControl = jSONObject;
    }

    public void setPluginScene(String str) {
        this.pluginScene = str;
    }

    public void setPluginType(String str) {
        this.pluginType = str;
    }

    public void setRequireVersion(String str) {
        this.requireVersion = str;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public String toString() {
        return "PluginModel{appId='" + this.appId + "'pluginType='" + this.pluginType + "', appKey='" + this.appKey + "', packageUrl='" + this.packageUrl + "', packageSize='" + this.packageSize + "', newPackageUrl='" + this.newPackageUrl + "', newPackageSize='" + this.newPackageSize + "', fallbackBaseUrl='" + this.fallbackBaseUrl + "', newFallbackBaseUrl='" + this.newFallbackBaseUrl + "', developerVersion='" + this.developerVersion + "', requireVersion='" + this.requireVersion + "', pluginScene='" + this.pluginScene + "', version='" + this.version + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        int i3;
        parcel.writeString(this.appId);
        parcel.writeString(this.pluginType);
        parcel.writeString(this.appKey);
        parcel.writeString(this.packageUrl);
        parcel.writeString(this.newPackageUrl);
        parcel.writeString(this.bytePackageUrl);
        parcel.writeString(this.packageSize);
        parcel.writeString(this.newPackageSize);
        parcel.writeString(this.fallbackBaseUrl);
        parcel.writeString(this.newFallbackBaseUrl);
        parcel.writeString(this.developerVersion);
        parcel.writeString(this.requireVersion);
        parcel.writeString(this.pluginScene);
        parcel.writeString(this.version);
        byte[] g = gbs.g(this.permission);
        int i4 = 0;
        if (g == null) {
            i2 = 0;
        } else {
            i2 = g.length;
        }
        parcel.writeInt(i2);
        if (i2 > 0) {
            parcel.writeByteArray(g);
        }
        byte[] g2 = gbs.g(this.extendInfo);
        if (g2 == null) {
            i3 = 0;
        } else {
            i3 = g2.length;
        }
        parcel.writeInt(i3);
        if (i3 > 0) {
            parcel.writeByteArray(g2);
        }
        byte[] g3 = gbs.g(this.permissionControl);
        if (g3 != null) {
            i4 = g3.length;
        }
        parcel.writeInt(i4);
        if (i4 > 0) {
            parcel.writeByteArray(g3);
        }
        ConcurrentHashMap<String, String> concurrentHashMap = this.startInfoData;
        if (concurrentHashMap != null) {
            parcel.writeSerializable(concurrentHashMap);
        }
    }

    public PluginModel(Parcel parcel) {
        this.appId = parcel.readString();
        this.pluginType = parcel.readString();
        this.appKey = parcel.readString();
        this.packageUrl = parcel.readString();
        this.newPackageUrl = parcel.readString();
        this.bytePackageUrl = parcel.readString();
        this.packageSize = parcel.readString();
        this.newPackageSize = parcel.readString();
        this.fallbackBaseUrl = parcel.readString();
        this.newFallbackBaseUrl = parcel.readString();
        this.developerVersion = parcel.readString();
        this.requireVersion = parcel.readString();
        this.pluginScene = parcel.readString();
        this.version = parcel.readString();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            byte[] c = vas.c(readInt);
            parcel.readByteArray(c);
            this.permission = gbs.m(c);
        }
        int readInt2 = parcel.readInt();
        if (readInt2 > 0) {
            byte[] c2 = vas.c(readInt2);
            parcel.readByteArray(c2);
            this.extendInfo = gbs.m(c2);
        }
        int readInt3 = parcel.readInt();
        if (readInt3 > 0) {
            byte[] c3 = vas.c(readInt3);
            parcel.readByteArray(c3);
            this.permissionControl = gbs.m(c3);
        }
        Serializable readSerializable = parcel.readSerializable();
        if (readSerializable instanceof ConcurrentHashMap) {
            this.startInfoData = (ConcurrentHashMap) readSerializable;
        } else {
            this.startInfoData = new ConcurrentHashMap<>();
        }
    }
}
