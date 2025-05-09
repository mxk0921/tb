package com.alibaba.evo;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ku0;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class EVOExperiment implements Parcelable {
    public static final Parcelable.Creator<EVOExperiment> CREATOR = new a();
    private static final String TAG = "EVOExperiment";
    private EVOExperimentConditions conditions;
    private long id;
    private String key;
    private String namespace;
    private long releaseId;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a implements Parcelable.Creator<EVOExperiment> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public EVOExperiment createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (EVOExperiment) ipChange.ipc$dispatch("3796765f", new Object[]{this, parcel});
            }
            try {
                return new EVOExperiment(parcel);
            } catch (Throwable th) {
                ku0.j("EVOExperiment.createFromParcel", th);
                return null;
            }
        }

        /* renamed from: b */
        public EVOExperiment[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (EVOExperiment[]) ipChange.ipc$dispatch("f2cd6e56", new Object[]{this, new Integer(i)});
            }
            return new EVOExperiment[i];
        }
    }

    static {
        t2o.a(961544201);
    }

    public EVOExperiment(long j, long j2, String str, String str2, EVOExperimentConditions eVOExperimentConditions) {
        this.id = j;
        this.releaseId = j2;
        this.namespace = str;
        this.key = str2;
        this.conditions = eVOExperimentConditions;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public EVOExperimentConditions getConditions() {
        return this.conditions;
    }

    public long getId() {
        return this.id;
    }

    public String getKey() {
        return this.key;
    }

    public String getNamespace() {
        return this.namespace;
    }

    public long getReleaseId() {
        return this.releaseId;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        try {
            parcel.writeLong(this.id);
            parcel.writeLong(this.releaseId);
            parcel.writeString(this.namespace);
            parcel.writeString(this.key);
            parcel.writeParcelable(this.conditions, i);
        } catch (Throwable th) {
            ku0.j("EVOExperiment.writeToParcel", th);
        }
    }

    public EVOExperiment(Parcel parcel) {
        this.id = parcel.readLong();
        this.releaseId = parcel.readLong();
        this.namespace = parcel.readString();
        this.key = parcel.readString();
        this.conditions = (EVOExperimentConditions) parcel.readParcelable(EVOExperiment.class.getClassLoader());
    }
}
