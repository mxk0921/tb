package com.alibaba.mtl.appmonitor.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import tb.nhh;
import tb.t2o;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Measure implements Parcelable {
    public static final Parcelable.Creator<Measure> CREATOR = new Parcelable.Creator<Measure>() { // from class: com.alibaba.mtl.appmonitor.model.Measure.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Measure createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Measure) ipChange.ipc$dispatch("c2989e21", new Object[]{this, parcel}) : Measure.readFromParcel(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Measure[] newArray(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Measure[]) ipChange.ipc$dispatch("dc97d5ca", new Object[]{this, new Integer(i)}) : new Measure[i];
        }
    };
    private static List<Double> nullList;
    private List<Double> bounds;
    protected Double constantValue;
    public String name;

    static {
        t2o.a(962593108);
        nullList = null;
        ArrayList arrayList = new ArrayList(1);
        nullList = arrayList;
        arrayList.add(null);
    }

    public Measure() {
        this.constantValue = Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT);
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
        Measure measure = (Measure) obj;
        String str = this.name;
        if (str == null) {
            if (measure.name != null) {
                return false;
            }
        } else if (!str.equals(measure.name)) {
            return false;
        }
        return true;
    }

    public List<Double> getBounds() {
        return this.bounds;
    }

    public Double getConstantValue() {
        return this.constantValue;
    }

    public Double getMax() {
        List<Double> list = this.bounds;
        if (list == null || list.size() < 2) {
            return null;
        }
        List<Double> list2 = this.bounds;
        return list2.get(list2.size() - 1);
    }

    public Double getMin() {
        List<Double> list = this.bounds;
        if (list == null || list.size() < 1) {
            return null;
        }
        return this.bounds.get(0);
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

    public void setConstantValue(Double d) {
        this.constantValue = d;
    }

    public boolean valid(MeasureValue measureValue) {
        double value = measureValue.getValue();
        if ((getMin() == null || value >= getMin().doubleValue()) && (getMax() == null || value < getMax().doubleValue())) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        try {
            parcel.writeList(this.bounds);
            parcel.writeString(this.name);
            parcel.writeInt(this.constantValue == null ? 0 : 1);
            Double d = this.constantValue;
            if (d != null) {
                parcel.writeDouble(d.doubleValue());
            }
        } catch (Throwable th) {
            nhh.h("writeToParcel", th, new Object[0]);
        }
    }

    public Measure(String str) {
        this(str, Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT));
    }

    public static Measure readFromParcel(Parcel parcel) {
        try {
            return new Measure(parcel.readString(), !(parcel.readInt() == 0) ? Double.valueOf(parcel.readDouble()) : null, parcel.readArrayList(Measure.class.getClassLoader()));
        } catch (Throwable th) {
            th.printStackTrace();
            nhh.h("readFromParcel", th, new Object[0]);
            return null;
        }
    }

    public Measure(String str, Double d, List<Double> list) {
        double d2 = vu3.b.GEO_NOT_SUPPORT;
        this.constantValue = Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT);
        if (list != null) {
            if (list.removeAll(nullList)) {
                nhh.v("bounds entity must not be null", new Object[0]);
            }
            Collections.sort(list);
            this.bounds = list;
        }
        this.name = str;
        this.constantValue = Double.valueOf(d != null ? d.doubleValue() : d2);
    }

    public void setRange(Double d, Double d2) {
        if (d == null || d2 == null) {
            nhh.v("min or max must not be null", new Object[0]);
            return;
        }
        ArrayList arrayList = new ArrayList(2);
        this.bounds = arrayList;
        arrayList.add(d);
        this.bounds.add(d2);
    }

    public Measure(String str, Double d) {
        this(str, d, null, null);
    }

    public Measure(String str, Double d, Double d2, Double d3) {
        this(str, d, null);
        if (d2 != null || d3 != null) {
            setRange(d2, d3);
        }
    }
}
