package com.alibaba.evo;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import tb.ku0;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class EVOExperimentConditions implements Parcelable {
    public static final Parcelable.Creator<EVOExperimentConditions> CREATOR = new a();
    private static final String TAG = "EVOExperimentCondition";
    private ArrayList<EVOExperimentCondition> conditions;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a implements Parcelable.Creator<EVOExperimentConditions> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public EVOExperimentConditions createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (EVOExperimentConditions) ipChange.ipc$dispatch("3a106187", new Object[]{this, parcel});
            }
            try {
                return new EVOExperimentConditions(parcel);
            } catch (Throwable th) {
                ku0.j("EVOExperimentConditions.createFromParcel", th);
                return null;
            }
        }

        /* renamed from: b */
        public EVOExperimentConditions[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (EVOExperimentConditions[]) ipChange.ipc$dispatch("3ae710be", new Object[]{this, new Integer(i)});
            }
            return new EVOExperimentConditions[i];
        }
    }

    static {
        t2o.a(961544205);
    }

    public EVOExperimentConditions(ArrayList<EVOExperimentCondition> arrayList) {
        this.conditions = arrayList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ArrayList<EVOExperimentCondition> getConditions() {
        return this.conditions;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        try {
            parcel.writeList(this.conditions);
        } catch (Throwable th) {
            ku0.j("EVOExperimentConditions.writeToParcel", th);
        }
    }

    public EVOExperimentConditions(Parcel parcel) {
        this.conditions = parcel.readArrayList(EVOExperimentConditions.class.getClassLoader());
    }
}
