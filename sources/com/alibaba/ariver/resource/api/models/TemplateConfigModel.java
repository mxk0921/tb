package com.alibaba.ariver.resource.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class TemplateConfigModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<TemplateConfigModel> CREATOR = new Parcelable.Creator<TemplateConfigModel>() { // from class: com.alibaba.ariver.resource.api.models.TemplateConfigModel.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TemplateConfigModel createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (TemplateConfigModel) ipChange.ipc$dispatch("6a437313", new Object[]{this, parcel}) : new TemplateConfigModel(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TemplateConfigModel[] newArray(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (TemplateConfigModel[]) ipChange.ipc$dispatch("2fd727c", new Object[]{this, new Integer(i)}) : new TemplateConfigModel[i];
        }
    };
    private static final long serialVersionUID = 1908013183340485762L;
    @JSONField
    private String appKey;
    @JSONField(name = "ext")
    private TemplateExtModel extModel;
    @JSONField(name = "extUrl")
    private String extUrl;
    @JSONField(name = RVStartParams.KEY_TEMPLATE_ID)
    private String templateId;
    @JSONField
    private String templateVersion;

    public TemplateConfigModel() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAppKey() {
        return this.appKey;
    }

    public TemplateExtModel getExtModel() {
        return this.extModel;
    }

    public String getExtUrl() {
        return this.extUrl;
    }

    public String getTemplateId() {
        return this.templateId;
    }

    public String getTemplateVersion() {
        return this.templateVersion;
    }

    @JSONField(deserialize = false, serialize = false)
    public boolean isTemplateValid() {
        return !TextUtils.isEmpty(this.templateId);
    }

    public void setAppKey(String str) {
        this.appKey = str;
    }

    public void setExtModel(TemplateExtModel templateExtModel) {
        this.extModel = templateExtModel;
    }

    public void setExtUrl(String str) {
        this.extUrl = str;
    }

    public void setTemplateId(String str) {
        this.templateId = str;
    }

    public void setTemplateVersion(String str) {
        this.templateVersion = str;
    }

    public String toString() {
        return "TemplateConfigModel{ext=" + this.extModel + ", extUrl=" + this.extUrl + ", templateId='" + this.templateId + "', templateVersion='" + this.templateVersion + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.extUrl);
        parcel.writeParcelable(this.extModel, 0);
        parcel.writeString(this.templateId);
        parcel.writeString(this.templateVersion);
        parcel.writeString(this.appKey);
    }

    public TemplateConfigModel(Parcel parcel) {
        this.extUrl = parcel.readString();
        this.extModel = (TemplateExtModel) parcel.readParcelable(TemplateConfigModel.class.getClassLoader());
        this.templateId = parcel.readString();
        this.templateVersion = parcel.readString();
        this.appKey = parcel.readString();
    }
}
