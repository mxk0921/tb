package com.alibaba.mtl.appmonitor.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Dimension implements Parcelable {
    public static final Parcelable.Creator<Dimension> CREATOR = new Parcelable.Creator<Dimension>() { // from class: com.alibaba.mtl.appmonitor.model.Dimension.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Dimension createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Dimension) ipChange.ipc$dispatch("277c0619", new Object[]{this, parcel}) : Dimension.readFromParcel(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Dimension[] newArray(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Dimension[]) ipChange.ipc$dispatch("be8bf782", new Object[]{this, new Integer(i)}) : new Dimension[i];
        }
    };
    static final String DEFAULT_NULL_VALUE = "null";
    protected String constantValue;
    protected String name;

    static {
        t2o.a(962593101);
    }

    public Dimension() {
        this.constantValue = "null";
    }

    public static Dimension readFromParcel(Parcel parcel) {
        try {
            return new Dimension(parcel.readString(), parcel.readString());
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Dimension dimension = (Dimension) obj;
        String str = this.name;
        if (str == null) {
            if (dimension.name != null) {
                return false;
            }
        } else if (!str.equals(dimension.name)) {
            return false;
        }
        return true;
    }

    public String getConstantValue() {
        return this.constantValue;
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        int i;
        String str = this.name;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        return 31 + i;
    }

    public void setConstantValue(String str) {
        this.constantValue = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.constantValue);
        parcel.writeString(this.name);
    }

    public Dimension(String str) {
        this(str, null);
    }

    public Dimension(String str, String str2) {
        this.constantValue = "null";
        this.name = str;
        this.constantValue = str2 == null ? "null" : str2;
    }
}
