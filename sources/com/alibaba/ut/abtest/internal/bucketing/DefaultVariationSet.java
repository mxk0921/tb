package com.alibaba.ut.abtest.internal.bucketing;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.evo.internal.bucketing.model.ExperimentV5;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import tb.do8;
import tb.ku0;
import tb.mwa;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DefaultVariationSet implements VariationSet {
    public static final Parcelable.Creator<DefaultVariationSet> CREATOR = new a();
    private static final String TAG = "DefaultVariationSet";
    private long experimentGroupId;
    private long experimentId;
    private long experimentReleaseId;
    private Map<String, Variation> variations;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class a implements Parcelable.Creator<DefaultVariationSet> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public DefaultVariationSet createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DefaultVariationSet) ipChange.ipc$dispatch("dceb80ba", new Object[]{this, parcel});
            }
            try {
                return new DefaultVariationSet(parcel);
            } catch (Throwable th) {
                ku0.j("DefaultVariationSet.createFromParcel", th);
                return null;
            }
        }

        /* renamed from: b */
        public DefaultVariationSet[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DefaultVariationSet[]) ipChange.ipc$dispatch("2f2349e3", new Object[]{this, new Integer(i)});
            }
            return new DefaultVariationSet[i];
        }
    }

    static {
        t2o.a(961544317);
        t2o.a(961544259);
    }

    public DefaultVariationSet(Parcel parcel) {
        this.experimentId = parcel.readLong();
        this.experimentReleaseId = parcel.readLong();
        this.experimentGroupId = parcel.readLong();
        this.variations = parcel.readHashMap(DefaultVariationSet.class.getClassLoader());
    }

    @Override // com.alibaba.ut.abtest.VariationSet
    public boolean contains(String str) {
        return this.variations.containsKey(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.alibaba.ut.abtest.VariationSet
    @Deprecated
    public long getExperimentBucketId() {
        return this.experimentGroupId;
    }

    @Override // com.alibaba.ut.abtest.VariationSet
    public long getExperimentId() {
        return this.experimentId;
    }

    @Override // com.alibaba.ut.abtest.VariationSet
    public long getExperimentReleaseId() {
        return this.experimentReleaseId;
    }

    @Override // com.alibaba.ut.abtest.VariationSet
    public Variation getVariation(String str) {
        return this.variations.get(str);
    }

    @Override // com.alibaba.ut.abtest.VariationSet
    public Iterator<Variation> iterator() {
        return this.variations.values().iterator();
    }

    @Override // com.alibaba.ut.abtest.VariationSet
    public int size() {
        return this.variations.size();
    }

    public String toString() {
        return "DefaultVariationSet{experimentId=" + this.experimentId + ", experimentReleaseId=" + this.experimentReleaseId + ", experimentGroupId=" + this.experimentGroupId + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        try {
            parcel.writeLong(this.experimentId);
            parcel.writeLong(this.experimentReleaseId);
            parcel.writeLong(this.experimentGroupId);
            parcel.writeMap(this.variations);
        } catch (Throwable th) {
            ku0.j("DefaultVariationSet.writeToParcel", th);
        }
    }

    public DefaultVariationSet(mwa mwaVar) {
        this.experimentId = mwaVar.h();
        this.experimentReleaseId = mwaVar.j();
        this.experimentGroupId = mwaVar.g();
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, String> entry : mwaVar.l().entrySet()) {
            hashMap.put(entry.getKey(), new DefaultVariation(entry.getKey(), entry.getValue()));
        }
        this.variations = Collections.unmodifiableMap(hashMap);
    }

    public DefaultVariationSet(do8 do8Var) {
        HashMap hashMap = new HashMap();
        if (do8Var != null) {
            if (do8Var.e() != null && !do8Var.e().isEmpty()) {
                ExperimentV5 experimentV5 = do8Var.e().get(0);
                this.experimentId = experimentV5.getId();
                this.experimentReleaseId = experimentV5.getReleaseId();
                this.experimentGroupId = experimentV5.getGroups().get(0).getId();
            }
            if (do8Var.g() != null) {
                for (Map.Entry<String, String> entry : do8Var.g().entrySet()) {
                    hashMap.put(entry.getKey(), new DefaultVariation(entry.getKey(), entry.getValue()));
                }
            }
        }
        this.variations = Collections.unmodifiableMap(hashMap);
    }
}
