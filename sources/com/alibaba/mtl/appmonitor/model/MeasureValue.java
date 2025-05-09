package com.alibaba.mtl.appmonitor.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.rbo;
import tb.t2o;
import tb.to1;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class MeasureValue implements IMerge<MeasureValue>, rbo, Parcelable {
    public static final Parcelable.Creator<MeasureValue> CREATOR = new Parcelable.Creator<MeasureValue>() { // from class: com.alibaba.mtl.appmonitor.model.MeasureValue.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MeasureValue createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (MeasureValue) ipChange.ipc$dispatch("2606aae4", new Object[]{this, parcel}) : MeasureValue.readFromParcel(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MeasureValue[] newArray(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (MeasureValue[]) ipChange.ipc$dispatch("6e54d4db", new Object[]{this, new Integer(i)}) : new MeasureValue[i];
        }
    };
    private List<Bucket> buckets;
    private boolean finish;
    private Double offset;
    private double value;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class Bucket {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private long count = 0;
        private Double max;
        private Double min;

        static {
            t2o.a(962593114);
        }

        public Bucket(Double d, Double d2) {
            this.min = d;
            this.max = d2;
        }

        public static /* synthetic */ long access$000(Bucket bucket) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b5e5fc70", new Object[]{bucket})).longValue();
            }
            return bucket.count;
        }

        public static /* synthetic */ Double access$100(Bucket bucket) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Double) ipChange.ipc$dispatch("4257ad83", new Object[]{bucket});
            }
            return bucket.min;
        }

        public static /* synthetic */ Double access$200(Bucket bucket) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Double) ipChange.ipc$dispatch("5b58ff22", new Object[]{bucket});
            }
            return bucket.max;
        }

        public boolean in(Double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f009fa3a", new Object[]{this, d})).booleanValue();
            }
            if (d == null) {
                return false;
            }
            Double d2 = this.min;
            Double d3 = this.max;
            if (d2 == null) {
                d2 = Double.valueOf(Double.MIN_VALUE);
            }
            if (d3 == null) {
                d3 = Double.valueOf(Double.MAX_VALUE);
            }
            if (d.doubleValue() < d2.doubleValue() || d.doubleValue() >= d3.doubleValue()) {
                return false;
            }
            return true;
        }

        public void increase() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("71f711c9", new Object[]{this});
            } else {
                this.count++;
            }
        }
    }

    static {
        t2o.a(962593112);
        t2o.a(962593107);
        t2o.a(962593059);
    }

    @Deprecated
    public MeasureValue() {
    }

    public static MeasureValue create() {
        return (MeasureValue) to1.a().d(MeasureValue.class, new Object[0]);
    }

    private Bucket getBucket(double d) {
        if (this.buckets == null) {
            return null;
        }
        for (int i = 0; i < this.buckets.size(); i++) {
            if (this.buckets.get(i).in(Double.valueOf(d))) {
                return this.buckets.get(i);
            }
        }
        return null;
    }

    public static MeasureValue readFromParcel(Parcel parcel) {
        boolean z;
        MeasureValue measureValue = null;
        try {
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            Double valueOf = Double.valueOf(parcel.readDouble());
            double readDouble = parcel.readDouble();
            measureValue = create();
            measureValue.finish = z;
            measureValue.offset = valueOf;
            measureValue.value = readDouble;
            return measureValue;
        } catch (Throwable th) {
            th.printStackTrace();
            return measureValue;
        }
    }

    @Override // tb.rbo
    public synchronized void clean() {
        this.value = vu3.b.GEO_NOT_SUPPORT;
        this.offset = null;
        this.finish = false;
        this.buckets = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // tb.rbo
    public synchronized void fill(Object... objArr) {
        if (objArr != null) {
            try {
                if (objArr.length > 0) {
                    this.value = ((Double) objArr[0]).doubleValue();
                }
                if (objArr.length > 1) {
                    this.offset = (Double) objArr[1];
                    this.finish = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized Map<String, Double> getBuckets() {
        Object obj;
        Object obj2;
        try {
            if (this.buckets == null) {
                return null;
            }
            HashMap hashMap = new HashMap();
            for (Bucket bucket : this.buckets) {
                if (Bucket.access$000(bucket) > 0) {
                    StringBuilder sb = new StringBuilder();
                    if (Bucket.access$100(bucket) == null) {
                        obj = "-∞";
                    } else {
                        obj = Bucket.access$100(bucket);
                    }
                    sb.append(obj);
                    sb.append(",");
                    if (Bucket.access$200(bucket) == null) {
                        obj2 = "∞";
                    } else {
                        obj2 = Bucket.access$200(bucket);
                    }
                    sb.append(obj2);
                    hashMap.put(sb.toString(), Long.valueOf(Bucket.access$000(bucket)));
                }
            }
            return hashMap;
        } catch (Throwable th) {
            throw th;
        }
    }

    public Double getOffset() {
        return this.offset;
    }

    public double getValue() {
        return this.value;
    }

    public boolean isFinish() {
        return this.finish;
    }

    public synchronized void setBuckets(Measure measure) {
        try {
            List<Double> bounds = measure.getBounds();
            if (bounds != null && bounds.size() >= 2) {
                if (this.buckets == null) {
                    this.buckets = new ArrayList();
                    int i = 0;
                    while (true) {
                        int i2 = i + 1;
                        if (i2 >= bounds.size()) {
                            break;
                        }
                        this.buckets.add(new Bucket(bounds.get(i), bounds.get(i2)));
                        i = i2;
                    }
                    Bucket bucket = getBucket(this.value);
                    if (bucket != null) {
                        bucket.increase();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void setFinish(boolean z) {
        this.finish = z;
    }

    public void setOffset(double d) {
        this.offset = Double.valueOf(d);
    }

    public void setValue(double d) {
        this.value = d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        double d;
        try {
            parcel.writeInt(this.finish ? 1 : 0);
            Double d2 = this.offset;
            if (d2 == null) {
                d = vu3.b.GEO_NOT_SUPPORT;
            } else {
                d = d2.doubleValue();
            }
            parcel.writeDouble(d);
            parcel.writeDouble(this.value);
        } catch (Throwable unused) {
        }
    }

    @Deprecated
    public MeasureValue(double d) {
        this.value = d;
    }

    public static MeasureValue create(double d) {
        return (MeasureValue) to1.a().d(MeasureValue.class, Double.valueOf(d));
    }

    public synchronized void merge(MeasureValue measureValue) {
        if (measureValue != null) {
            try {
                this.value += measureValue.getValue();
                if (measureValue.getOffset() != null) {
                    if (this.offset == null) {
                        this.offset = Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT);
                    }
                    this.offset = Double.valueOf(this.offset.doubleValue() + measureValue.getOffset().doubleValue());
                }
                Bucket bucket = getBucket(measureValue.getValue());
                if (bucket != null) {
                    bucket.increase();
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static MeasureValue create(double d, double d2) {
        return (MeasureValue) to1.a().d(MeasureValue.class, Double.valueOf(d), Double.valueOf(d2));
    }

    @Deprecated
    public MeasureValue(double d, double d2) {
        this.offset = Double.valueOf(d2);
        this.value = d;
        this.finish = false;
    }
}
