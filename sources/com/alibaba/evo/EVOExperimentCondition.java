package com.alibaba.evo;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ku0;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class EVOExperimentCondition implements Parcelable {
    public static final Parcelable.Creator<EVOExperimentCondition> CREATOR = new a();
    public static final String NAME_APP_VERSION = "mtop.appVersion";
    public static final String NAME_PLATFORM = "mtop.platform";
    public static final String OPERATOR_EQUALS = "$eq";
    public static final String OPERATOR_GREATER_THAN = "$gt";
    public static final String OPERATOR_GREATER_THAN_OR_EQUALS = "$gte";
    private static final String TAG = "EVOExperimentConditionCriterion";
    private String name;
    private String operator;
    private String value;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a implements Parcelable.Creator<EVOExperimentCondition> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public EVOExperimentCondition createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (EVOExperimentCondition) ipChange.ipc$dispatch("64f844fc", new Object[]{this, parcel});
            }
            try {
                return new EVOExperimentCondition(parcel);
            } catch (Throwable th) {
                ku0.j("EVOExperimentCondition.createFromParcel", th);
                return null;
            }
        }

        /* renamed from: b */
        public EVOExperimentCondition[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (EVOExperimentCondition[]) ipChange.ipc$dispatch("758352e5", new Object[]{this, new Integer(i)});
            }
            return new EVOExperimentCondition[i];
        }
    }

    static {
        t2o.a(961544203);
    }

    public EVOExperimentCondition(String str, String str2, String str3) {
        this.name = str;
        this.value = str2;
        this.operator = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getName() {
        return this.name;
    }

    public String getOperator() {
        return this.operator;
    }

    public String getValue() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        try {
            parcel.writeString(this.name);
            parcel.writeString(this.value);
            parcel.writeString(this.operator);
        } catch (Throwable th) {
            ku0.j("EVOExperimentCondition.writeToParcel", th);
        }
    }

    public EVOExperimentCondition(Parcel parcel) {
        this.name = parcel.readString();
        this.value = parcel.readString();
        this.operator = parcel.readString();
    }
}
