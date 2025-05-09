package com.amap.api.fence;

import android.os.Parcel;
import android.os.Parcelable;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class PoiItem implements Parcelable {
    public static final Parcelable.Creator<PoiItem> CREATOR = new Parcelable.Creator<PoiItem>() { // from class: com.amap.api.fence.PoiItem.1
        private static PoiItem a(Parcel parcel) {
            return new PoiItem(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PoiItem createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PoiItem[] newArray(int i) {
            return a(i);
        }

        private static PoiItem[] a(int i) {
            return new PoiItem[i];
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private String f4575a;
    private String b;
    private String c;
    private String d;
    private String e;
    private double f;
    private double g;
    private String h;
    private String i;
    private String j;
    private String k;

    public PoiItem() {
        this.f4575a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = vu3.b.GEO_NOT_SUPPORT;
        this.g = vu3.b.GEO_NOT_SUPPORT;
        this.h = "";
        this.i = "";
        this.j = "";
        this.k = "";
    }

    public static Parcelable.Creator<PoiItem> getCreator() {
        return CREATOR;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAddress() {
        return this.e;
    }

    public String getAdname() {
        return this.k;
    }

    public String getCity() {
        return this.j;
    }

    public double getLatitude() {
        return this.f;
    }

    public double getLongitude() {
        return this.g;
    }

    public String getPoiId() {
        return this.b;
    }

    public String getPoiName() {
        return this.f4575a;
    }

    public String getPoiType() {
        return this.c;
    }

    public String getProvince() {
        return this.i;
    }

    public String getTel() {
        return this.h;
    }

    public String getTypeCode() {
        return this.d;
    }

    public void setAddress(String str) {
        this.e = str;
    }

    public void setAdname(String str) {
        this.k = str;
    }

    public void setCity(String str) {
        this.j = str;
    }

    public void setLatitude(double d) {
        this.f = d;
    }

    public void setLongitude(double d) {
        this.g = d;
    }

    public void setPoiId(String str) {
        this.b = str;
    }

    public void setPoiName(String str) {
        this.f4575a = str;
    }

    public void setPoiType(String str) {
        this.c = str;
    }

    public void setProvince(String str) {
        this.i = str;
    }

    public void setTel(String str) {
        this.h = str;
    }

    public void setTypeCode(String str) {
        this.d = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f4575a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeDouble(this.f);
        parcel.writeDouble(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
        parcel.writeString(this.k);
    }

    public PoiItem(Parcel parcel) {
        this.f4575a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = vu3.b.GEO_NOT_SUPPORT;
        this.g = vu3.b.GEO_NOT_SUPPORT;
        this.h = "";
        this.i = "";
        this.j = "";
        this.k = "";
        this.f4575a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readDouble();
        this.g = parcel.readDouble();
        this.h = parcel.readString();
        this.i = parcel.readString();
        this.j = parcel.readString();
        this.k = parcel.readString();
    }
}
