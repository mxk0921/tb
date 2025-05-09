package com.alipay.mobile.common.logging.api.monitor;

import android.os.Parcel;
import android.os.Parcelable;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class Performance implements Parcelable {
    public static final Parcelable.Creator<Performance> CREATOR = new Parcelable.Creator<Performance>() { // from class: com.alipay.mobile.common.logging.api.monitor.Performance.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Performance createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Performance) ipChange.ipc$dispatch("1b7d1dc6", new Object[]{this, parcel}) : new Performance(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Performance[] newArray(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Performance[]) ipChange.ipc$dispatch("1651e36f", new Object[]{this, new Integer(i)}) : new Performance[i];
        }
    };
    public static final String KEY_LOG_HEADER = "header";

    /* renamed from: a  reason: collision with root package name */
    private String f3955a;
    private String b;
    private String c;
    private String d;
    private Map<String, String> e;
    private String f;
    private int g;

    /* compiled from: Taobao */
    @MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class Builder {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Performance f3956a = new Performance();

        public Builder addExtParam(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("5171c9de", new Object[]{this, str, str2});
            }
            this.f3956a.addExtParam(str, str2);
            return this;
        }

        public Performance build() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Performance) ipChange.ipc$dispatch("9967f448", new Object[]{this});
            }
            return this.f3956a;
        }

        public void performance(PerformanceID performanceID) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3d28c103", new Object[]{this, performanceID});
            } else {
                LoggerFactory.getMonitorLogger().performance(performanceID, this.f3956a);
            }
        }

        public Builder setLoggerLevel(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("9906295c", new Object[]{this, new Integer(i)});
            }
            this.f3956a.setLoggerLevel(i);
            return this;
        }

        public Builder setPageId(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("9028cfa9", new Object[]{this, str});
            }
            this.f3956a.setPageId(str);
            return this;
        }

        public Builder setParam1(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("612b692f", new Object[]{this, str});
            }
            this.f3956a.setParam1(str);
            return this;
        }

        public Builder setParam2(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("c386800e", new Object[]{this, str});
            }
            this.f3956a.setParam2(str);
            return this;
        }

        public Builder setParam3(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("25e196ed", new Object[]{this, str});
            }
            this.f3956a.setParam3(str);
            return this;
        }

        public Builder setSubType(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("9d15a5d", new Object[]{this, str});
            }
            this.f3956a.setSubType(str);
            return this;
        }
    }

    public Performance() {
        this.e = new HashMap();
        this.g = 2;
    }

    public void addExtParam(String str, String str2) {
        this.e.put(str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Map<String, String> getExtPramas() {
        return this.e;
    }

    public int getLoggerLevel() {
        return this.g;
    }

    public String getPageId() {
        return this.f;
    }

    public String getParam1() {
        return this.b;
    }

    public String getParam2() {
        return this.c;
    }

    public String getParam3() {
        return this.d;
    }

    public String getSubType() {
        return this.f3955a;
    }

    public void removeExtParam(String str) {
        this.e.remove(str);
    }

    public void setLoggerLevel(int i) {
        this.g = i;
    }

    public void setPageId(String str) {
        this.f = str;
    }

    public void setParam1(String str) {
        this.b = str;
    }

    public void setParam2(String str) {
        this.c = str;
    }

    public void setParam3(String str) {
        this.d = str;
    }

    public void setSubType(String str) {
        this.f3955a = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3955a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.f);
        Map<String, String> map = this.e;
        if (map == null) {
            map = new HashMap<>();
        }
        this.e = map;
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : this.e.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
    }

    public Performance(Parcel parcel) {
        this.e = new HashMap();
        this.g = 2;
        this.f3955a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.f = parcel.readString();
        int readInt = parcel.readInt();
        this.e = new HashMap(readInt);
        for (int i = 0; i < readInt; i++) {
            this.e.put(parcel.readString(), parcel.readString());
        }
    }
}
