package com.alibaba.ariver.resource.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AppInfoModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<AppInfoModel> CREATOR = new Parcelable.Creator<AppInfoModel>() { // from class: com.alibaba.ariver.resource.api.models.AppInfoModel.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AppInfoModel createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (AppInfoModel) ipChange.ipc$dispatch("47431fbc", new Object[]{this, parcel}) : new AppInfoModel(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AppInfoModel[] newArray(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (AppInfoModel[]) ipChange.ipc$dispatch("86b1b473", new Object[]{this, new Integer(i)}) : new AppInfoModel[i];
        }
    };
    private static final long serialVersionUID = -5050984571826320290L;
    @JSONField
    private String alias;
    @JSONField
    private String appId;
    @JSONField
    private String appKey;
    @JSONField
    private String bytePackageUrl;
    @JSONField(name = "byteSubPackageUrls")
    private JSONObject byteSubPackages;
    @JSONField
    private String desc;
    @JSONField
    private String developerVersion;
    @JSONField
    private String fallbackBaseUrl;
    @JSONField
    private String logo;
    @JSONField
    private String mainUrl;
    @JSONField
    private String name;
    @JSONField
    private String newFallbackBaseUrl;
    @JSONField
    private String newPackageSize;
    @JSONField
    private String newPackageUrl;
    @JSONField(name = "newSubPackageUrls")
    private JSONObject newSubPackages;
    @JSONField
    private String origin;
    @JSONField
    private String packageSize;
    @JSONField
    private String packageUrl;
    @JSONField
    private String patchInfo;
    private List<PluginModel> plugins;
    @JSONField
    private String reqmode;
    @JSONField
    private String slogan;
    @JSONField
    private String sourcemap;
    @JSONField
    private String status;
    @JSONField(name = "subPackageUrls")
    private JSONObject subPackages;
    @JSONField
    private int subType;
    @JSONField
    private TemplateConfigModel templateConfig;
    @JSONField(name = "deployVersion")
    private String version;
    @JSONField
    private String vhost;

    public AppInfoModel() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAlias() {
        return this.alias;
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

    public JSONObject getByteSubPackages() {
        return this.byteSubPackages;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getDeveloperVersion() {
        return this.developerVersion;
    }

    public String getFallbackBaseUrl() {
        return this.fallbackBaseUrl;
    }

    public String getLogo() {
        return this.logo;
    }

    public String getMainUrl() {
        return this.mainUrl;
    }

    public String getName() {
        return this.name;
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

    public JSONObject getNewSubPackages() {
        return this.newSubPackages;
    }

    public String getOrigin() {
        return this.origin;
    }

    public String getPackageSize() {
        return this.packageSize;
    }

    public String getPackageUrl() {
        return this.packageUrl;
    }

    public String getPatchInfo() {
        return this.patchInfo;
    }

    public List<PluginModel> getPlugins() {
        return this.plugins;
    }

    public String getReqmode() {
        return this.reqmode;
    }

    public String getSlogan() {
        return this.slogan;
    }

    public String getSourcemap() {
        return this.sourcemap;
    }

    public String getStatus() {
        return this.status;
    }

    public JSONObject getSubPackages() {
        return this.subPackages;
    }

    public int getSubType() {
        return this.subType;
    }

    public TemplateConfigModel getTemplateConfig() {
        return this.templateConfig;
    }

    public String getVersion() {
        return this.version;
    }

    public String getVhost() {
        return this.vhost;
    }

    public void setAlias(String str) {
        this.alias = str;
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

    public void setByteSubPackages(JSONObject jSONObject) {
        this.byteSubPackages = jSONObject;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setDeveloperVersion(String str) {
        this.developerVersion = str;
    }

    public void setFallbackBaseUrl(String str) {
        this.fallbackBaseUrl = str;
    }

    public void setLogo(String str) {
        this.logo = str;
    }

    public void setMainUrl(String str) {
        this.mainUrl = str;
    }

    public void setName(String str) {
        this.name = str;
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

    public void setNewSubPackages(JSONObject jSONObject) {
        this.newSubPackages = jSONObject;
    }

    public void setOrigin(String str) {
        this.origin = str;
    }

    public void setPackageSize(String str) {
        this.packageSize = str;
    }

    public void setPackageUrl(String str) {
        this.packageUrl = str;
    }

    public void setPatchInfo(String str) {
        this.patchInfo = str;
    }

    public void setPlugins(List<PluginModel> list) {
        this.plugins = list;
    }

    public void setReqmode(String str) {
        this.reqmode = str;
    }

    public void setSlogan(String str) {
        this.slogan = str;
    }

    public void setSourcemap(String str) {
        this.sourcemap = str;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public void setSubPackages(JSONObject jSONObject) {
        this.subPackages = jSONObject;
    }

    public void setSubType(int i) {
        this.subType = i;
    }

    public void setTemplateConfig(TemplateConfigModel templateConfigModel) {
        this.templateConfig = templateConfigModel;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public void setVhost(String str) {
        this.vhost = str;
    }

    public String toString() {
        return "AppInfoModel{appId='" + this.appId + "', name='" + this.name + "', alias='" + this.alias + "', logo='" + this.logo + "', desc='" + this.desc + "', origin='" + this.origin + "', version='" + this.version + "', developerVersion='" + this.developerVersion + "', fallbackBaseUrl='" + this.fallbackBaseUrl + "', newFallbackBaseUrl='" + this.newFallbackBaseUrl + "', packageUrl='" + this.packageUrl + "', bytePackageUrl='" + this.bytePackageUrl + "', newPackageUrl='" + this.newPackageUrl + "', packageSize='" + this.packageSize + "', newPackageSize='" + this.newPackageSize + "', vhost='" + this.vhost + "', mainUrl='" + this.mainUrl + "', appKey='" + this.appKey + "', subPackages=" + this.subPackages + ", newSubPackages=" + this.newSubPackages + ", byteSubPackages=" + this.byteSubPackages + ", patchInfo=" + this.patchInfo + ", templateConfig=" + this.templateConfig + ", plugins=" + this.plugins + ", status='" + this.status + "', slogan=" + this.slogan + ", reqmode=" + this.reqmode + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeString(this.appId);
        parcel.writeString(this.name);
        parcel.writeString(this.alias);
        parcel.writeString(this.logo);
        parcel.writeString(this.desc);
        parcel.writeString(this.origin);
        parcel.writeString(this.version);
        parcel.writeString(this.developerVersion);
        parcel.writeString(this.fallbackBaseUrl);
        parcel.writeString(this.newFallbackBaseUrl);
        parcel.writeString(this.packageUrl);
        parcel.writeString(this.bytePackageUrl);
        parcel.writeString(this.newPackageUrl);
        parcel.writeString(this.packageSize);
        parcel.writeString(this.newPackageSize);
        parcel.writeString(this.vhost);
        parcel.writeString(this.mainUrl);
        parcel.writeString(this.appKey);
        parcel.writeString(this.patchInfo);
        parcel.writeSerializable(this.subPackages);
        parcel.writeSerializable(this.newSubPackages);
        parcel.writeSerializable(this.byteSubPackages);
        parcel.writeParcelable(this.templateConfig, 0);
        List<PluginModel> list = this.plugins;
        if (list == null) {
            i2 = 0;
        } else {
            i2 = list.size();
        }
        parcel.writeInt(i2);
        if (i2 > 0) {
            Parcelable[] parcelableArr = new Parcelable[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                parcelableArr[i3] = this.plugins.get(i3);
            }
            parcel.writeParcelableArray(parcelableArr, 0);
        }
        parcel.writeString(this.status);
        parcel.writeString(this.slogan);
        parcel.writeInt(this.subType);
        parcel.writeString(this.reqmode);
    }

    public AppInfoModel(Parcel parcel) {
        this.appId = parcel.readString();
        this.name = parcel.readString();
        this.alias = parcel.readString();
        this.logo = parcel.readString();
        this.desc = parcel.readString();
        this.origin = parcel.readString();
        this.version = parcel.readString();
        this.developerVersion = parcel.readString();
        this.fallbackBaseUrl = parcel.readString();
        this.newFallbackBaseUrl = parcel.readString();
        this.packageUrl = parcel.readString();
        this.bytePackageUrl = parcel.readString();
        this.newPackageUrl = parcel.readString();
        this.packageSize = parcel.readString();
        this.newPackageSize = parcel.readString();
        this.vhost = parcel.readString();
        this.mainUrl = parcel.readString();
        this.appKey = parcel.readString();
        this.patchInfo = parcel.readString();
        this.subPackages = (JSONObject) parcel.readSerializable();
        this.newSubPackages = (JSONObject) parcel.readSerializable();
        this.byteSubPackages = (JSONObject) parcel.readSerializable();
        this.templateConfig = (TemplateConfigModel) parcel.readParcelable(AppInfoModel.class.getClassLoader());
        int readInt = parcel.readInt();
        if (readInt > 0) {
            Parcelable[] readParcelableArray = parcel.readParcelableArray(PluginModel.class.getClassLoader());
            this.plugins = new ArrayList();
            for (int i = 0; i < readInt; i++) {
                Parcelable parcelable = readParcelableArray[i];
                if (parcelable instanceof PluginModel) {
                    this.plugins.add((PluginModel) parcelable);
                }
            }
        }
        this.status = parcel.readString();
        this.slogan = parcel.readString();
        this.subType = parcel.readInt();
        this.reqmode = parcel.readString();
    }
}
