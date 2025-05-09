package com.alibaba.triver.cannal_engine.widgetInfo;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class TRWidgetInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<TRWidgetInfo> CREATOR = new a();
    String configData;
    String extData;
    String metaInfo;
    String orderId;
    @JSONField(name = "url")
    String relationUrl;
    viewConfig viewConfig;
    String widgetDataId;
    Long widgetId;
    String widgetVersion;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a implements Parcelable.Creator<TRWidgetInfo> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public TRWidgetInfo createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TRWidgetInfo) ipChange.ipc$dispatch("ea0e0c4e", new Object[]{this, parcel});
            }
            return new TRWidgetInfo(parcel);
        }

        /* renamed from: b */
        public TRWidgetInfo[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TRWidgetInfo[]) ipChange.ipc$dispatch("e4e2d1f7", new Object[]{this, new Integer(i)});
            }
            return new TRWidgetInfo[i];
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class viewConfig implements Parcelable, Serializable {
        public static final Parcelable.Creator<viewConfig> CREATOR = new a();
        String alignment;
        String height;
        String widgetDegradePic;
        String width;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static class a implements Parcelable.Creator<viewConfig> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a */
            public viewConfig createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (viewConfig) ipChange.ipc$dispatch("143bea3d", new Object[]{this, parcel});
                }
                return new viewConfig(parcel);
            }

            /* renamed from: b */
            public viewConfig[] newArray(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (viewConfig[]) ipChange.ipc$dispatch("957030f4", new Object[]{this, new Integer(i)});
                }
                return new viewConfig[i];
            }
        }

        public viewConfig() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String getAlignment() {
            return this.alignment;
        }

        public String getHeight() {
            return this.height;
        }

        public String getWidgetDegradePic() {
            return this.widgetDegradePic;
        }

        public String getWidth() {
            return this.width;
        }

        public void setAlignment(String str) {
            this.alignment = str;
        }

        public void setHeight(String str) {
            this.height = str;
        }

        public void setWidgetDegradePic(String str) {
            this.widgetDegradePic = str;
        }

        public void setWidth(String str) {
            this.width = str;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.height);
            parcel.writeString(this.width);
            parcel.writeString(this.alignment);
            parcel.writeString(this.widgetDegradePic);
        }

        public viewConfig(Parcel parcel) {
            this.height = parcel.readString();
            this.width = parcel.readString();
            this.alignment = parcel.readString();
            this.widgetDegradePic = parcel.readString();
        }
    }

    public TRWidgetInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getConfigData() {
        return this.configData;
    }

    public String getExtData() {
        return this.extData;
    }

    public String getMetaInfo() {
        return this.metaInfo;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public String getRelationUrl() {
        return this.relationUrl;
    }

    public viewConfig getViewConfig() {
        return this.viewConfig;
    }

    public String getWidgetDataId() {
        return this.widgetDataId;
    }

    public Long getWidgetId() {
        return this.widgetId;
    }

    public String getWidgetVersion() {
        return this.widgetVersion;
    }

    public void setConfigData(String str) {
        this.configData = str;
    }

    public void setExtData(String str) {
        this.extData = str;
    }

    public void setMetaInfo(String str) {
        this.metaInfo = str;
    }

    public void setOrderId(String str) {
        this.orderId = str;
    }

    public void setRelationUrl(String str) {
        this.relationUrl = str;
    }

    public void setViewConfig(viewConfig viewconfig) {
        this.viewConfig = viewconfig;
    }

    public void setWidgetDataId(String str) {
        this.widgetDataId = str;
    }

    public void setWidgetId(Long l) {
        this.widgetId = l;
    }

    public void setWidgetVersion(String str) {
        this.widgetVersion = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.configData);
        parcel.writeString(this.extData);
        parcel.writeString(this.metaInfo);
        parcel.writeString(this.orderId);
        parcel.writeLong(this.widgetId.longValue());
        parcel.writeString(this.widgetVersion);
        parcel.writeString(this.widgetDataId);
        parcel.writeParcelable(this.viewConfig, i);
        parcel.writeString(this.relationUrl);
    }

    public TRWidgetInfo(Parcel parcel) {
        this.configData = parcel.readString();
        this.extData = parcel.readString();
        this.metaInfo = parcel.readString();
        this.orderId = parcel.readString();
        this.widgetId = Long.valueOf(parcel.readLong());
        this.widgetVersion = parcel.readString();
        this.widgetDataId = parcel.readString();
        this.viewConfig = (viewConfig) parcel.readParcelable(viewConfig.class.getClassLoader());
        this.relationUrl = parcel.readString();
    }
}
