package com.amap.api.location;

import android.os.Parcel;
import android.os.Parcelable;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class DPoint implements Parcelable {
    public static final Parcelable.Creator<DPoint> CREATOR = new Parcelable.Creator<DPoint>() { // from class: com.amap.api.location.DPoint.1
        private static DPoint a(Parcel parcel) {
            return new DPoint(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DPoint createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DPoint[] newArray(int i) {
            return a(i);
        }

        private static DPoint[] a(int i) {
            return new DPoint[i];
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private double f4590a;
    private double b;

    public DPoint() {
        this.f4590a = vu3.b.GEO_NOT_SUPPORT;
        this.b = vu3.b.GEO_NOT_SUPPORT;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DPoint)) {
            return false;
        }
        DPoint dPoint = (DPoint) obj;
        if (this.b == dPoint.b && this.f4590a == dPoint.f4590a) {
            return true;
        }
        return false;
    }

    public double getLatitude() {
        return this.b;
    }

    public double getLongitude() {
        return this.f4590a;
    }

    public int hashCode() {
        return Double.valueOf((this.b + this.f4590a) * 1000000.0d).intValue();
    }

    public void setLatitude(double d) {
        if (d > 90.0d) {
            d = 90.0d;
        }
        if (d < -90.0d) {
            d = -90.0d;
        }
        this.b = d;
    }

    public void setLongitude(double d) {
        if (d > 180.0d) {
            d = 180.0d;
        }
        if (d < -180.0d) {
            d = -180.0d;
        }
        this.f4590a = d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.f4590a);
        parcel.writeDouble(this.b);
    }

    public DPoint(double d, double d2) {
        this.f4590a = vu3.b.GEO_NOT_SUPPORT;
        this.b = vu3.b.GEO_NOT_SUPPORT;
        d2 = d2 > 180.0d ? 180.0d : d2;
        d2 = d2 < -180.0d ? -180.0d : d2;
        d = d > 90.0d ? 90.0d : d;
        d = d < -90.0d ? -90.0d : d;
        this.f4590a = d2;
        this.b = d;
    }

    public DPoint(Parcel parcel) {
        this.f4590a = vu3.b.GEO_NOT_SUPPORT;
        this.b = vu3.b.GEO_NOT_SUPPORT;
        this.f4590a = parcel.readDouble();
        this.b = parcel.readDouble();
    }
}
