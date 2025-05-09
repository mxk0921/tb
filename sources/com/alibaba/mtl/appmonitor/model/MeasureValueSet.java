package com.alibaba.mtl.appmonitor.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import tb.rbo;
import tb.t2o;
import tb.to1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class MeasureValueSet implements IMerge<MeasureValueSet>, rbo, Parcelable {
    public static final Parcelable.Creator<MeasureValueSet> CREATOR = new Parcelable.Creator<MeasureValueSet>() { // from class: com.alibaba.mtl.appmonitor.model.MeasureValueSet.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MeasureValueSet createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (MeasureValueSet) ipChange.ipc$dispatch("21f52cf0", new Object[]{this, parcel}) : MeasureValueSet.readFromParcel(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MeasureValueSet[] newArray(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (MeasureValueSet[]) ipChange.ipc$dispatch("61faab99", new Object[]{this, new Integer(i)}) : new MeasureValueSet[i];
        }
    };
    private Map<String, MeasureValue> map = new LinkedHashMap();

    static {
        t2o.a(962593115);
        t2o.a(962593107);
        t2o.a(962593059);
    }

    public static MeasureValueSet create() {
        return (MeasureValueSet) to1.a().d(MeasureValueSet.class, new Object[0]);
    }

    public static MeasureValueSet fromStringMap(Map<String, String> map) {
        MeasureValueSet measureValueSet = (MeasureValueSet) to1.a().d(MeasureValueSet.class, new Object[0]);
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                Double d = toDouble(entry.getValue());
                if (d != null) {
                    measureValueSet.map.put(entry.getKey(), (MeasureValue) to1.a().d(MeasureValue.class, d));
                }
            }
        }
        return measureValueSet;
    }

    private Measure getMeasure(List<Measure> list, String str) {
        for (Measure measure : list) {
            if (str.equalsIgnoreCase(measure.getName())) {
                return measure;
            }
        }
        return null;
    }

    public static MeasureValueSet readFromParcel(Parcel parcel) {
        try {
            MeasureValueSet create = create();
            try {
                create.map = parcel.readHashMap(DimensionValueSet.class.getClassLoader());
                return create;
            } catch (Throwable unused) {
                return create;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    private static Double toDouble(String str) {
        try {
            return Double.valueOf(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // tb.rbo
    public void clean() {
        for (MeasureValue measureValue : this.map.values()) {
            to1.a().c(measureValue);
        }
        this.map.clear();
    }

    public boolean containValue(String str) {
        return this.map.containsKey(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // tb.rbo
    public void fill(Object... objArr) {
        if (this.map == null) {
            this.map = new LinkedHashMap();
        }
    }

    public Map<String, MeasureValue> getMap() {
        return this.map;
    }

    public MeasureValue getValue(String str) {
        return this.map.get(str);
    }

    public boolean isEmpty() {
        return this.map.isEmpty();
    }

    public void setBuckets(List<Measure> list) {
        if (list != null) {
            for (String str : this.map.keySet()) {
                this.map.get(str).setBuckets(getMeasure(list, str));
            }
        }
    }

    public void setMap(Map<String, MeasureValue> map) {
        this.map = map;
    }

    public MeasureValueSet setValue(String str, double d) {
        this.map.put(str, (MeasureValue) to1.a().d(MeasureValue.class, Double.valueOf(d)));
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeMap(this.map);
    }

    @Deprecated
    public static MeasureValueSet create(int i) {
        return (MeasureValueSet) to1.a().d(MeasureValueSet.class, new Object[0]);
    }

    public void merge(MeasureValueSet measureValueSet) {
        for (String str : this.map.keySet()) {
            this.map.get(str).merge(measureValueSet.getValue(str));
        }
    }

    public void setValue(String str, MeasureValue measureValue) {
        this.map.put(str, measureValue);
    }

    public static MeasureValueSet create(Map<String, Double> map) {
        MeasureValueSet measureValueSet = (MeasureValueSet) to1.a().d(MeasureValueSet.class, new Object[0]);
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    Double d = map.get(str);
                    if (d != null) {
                        measureValueSet.map.put(str, (MeasureValue) to1.a().d(MeasureValue.class, d));
                    }
                }
            } catch (Exception unused) {
            }
        }
        return measureValueSet;
    }
}
