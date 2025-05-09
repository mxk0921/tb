package com.alibaba.poplayer.layermanager.config;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class ConfigItem implements Parcelable {
    public static final Parcelable.Creator<ConfigItem> CREATOR = new a();
    public boolean enqueue;
    public boolean exclusive;
    public boolean forcePopRespectingPriority;
    public int level;
    public int priority;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a implements Parcelable.Creator<ConfigItem> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public ConfigItem createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ConfigItem) ipChange.ipc$dispatch("8231798b", new Object[]{this, parcel});
            }
            return new ConfigItem(parcel);
        }

        /* renamed from: b */
        public ConfigItem[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ConfigItem[]) ipChange.ipc$dispatch("c1a00e42", new Object[]{this, new Integer(i)});
            }
            return new ConfigItem[i];
        }
    }

    static {
        t2o.a(625999960);
    }

    public ConfigItem() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "{level=" + this.level + ", priority=" + this.priority + ", enqueue=" + this.enqueue + ", force=" + this.forcePopRespectingPriority + ", exclusive=" + this.exclusive + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.level);
        parcel.writeInt(this.priority);
        parcel.writeByte(this.enqueue ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.forcePopRespectingPriority ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.exclusive ? (byte) 1 : (byte) 0);
    }

    public ConfigItem(Parcel parcel) {
        this.level = parcel.readInt();
        this.priority = parcel.readInt();
        boolean z = false;
        this.enqueue = parcel.readByte() != 0;
        this.forcePopRespectingPriority = parcel.readByte() != 0;
        this.exclusive = parcel.readByte() != 0 ? true : z;
    }
}
