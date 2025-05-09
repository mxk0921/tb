package com.alibaba.security.realidentity.ui.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ImageData implements Parcelable {
    public static final Parcelable.Creator<ImageData> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public String f2866a;
    public int b;
    public String c;
    public String d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a implements Parcelable.Creator<ImageData> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public ImageData createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ImageData) ipChange.ipc$dispatch("b463d927", new Object[]{this, parcel}) : new ImageData(parcel);
        }

        /* renamed from: a */
        public ImageData[] newArray(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ImageData[]) ipChange.ipc$dispatch("fc99cc98", new Object[]{this, new Integer(i)}) : new ImageData[i];
        }
    }

    public ImageData() {
    }

    public void a(int i) {
        this.b = i;
    }

    public void b(String str) {
        this.f2866a = str;
    }

    public String c() {
        return this.d;
    }

    public int d() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ImageData{source='" + this.d + "', path='" + this.f2866a + "', type=" + this.b + ", gestureUrl='" + this.c + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2866a);
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }

    public ImageData(Parcel parcel) {
        this.f2866a = parcel.readString();
        this.b = parcel.readInt();
        this.c = parcel.readString();
    }

    public void a(String str) {
        this.c = str;
    }

    public String b() {
        return this.f2866a;
    }

    public void c(String str) {
        this.d = str;
    }

    public String a() {
        return this.c;
    }
}
