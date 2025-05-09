package com.huawei.hms.core.aidl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class DataBuffer implements Parcelable {
    public static final Parcelable.Creator<DataBuffer> CREATOR = new a();
    public String URI;

    /* renamed from: a  reason: collision with root package name */
    private int f5329a;
    private Bundle b;
    public Bundle header;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Parcelable.Creator<DataBuffer> {
        /* renamed from: a */
        public DataBuffer createFromParcel(Parcel parcel) {
            return new DataBuffer(parcel, (a) null);
        }

        /* renamed from: a */
        public DataBuffer[] newArray(int i) {
            return new DataBuffer[i];
        }
    }

    public /* synthetic */ DataBuffer(Parcel parcel, a aVar) {
        this(parcel);
    }

    private static ClassLoader a(Class cls) {
        return cls.getClassLoader();
    }

    public DataBuffer addBody(Bundle bundle) {
        this.b = bundle;
        return this;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Bundle getBody() {
        return this.b;
    }

    public int getBodySize() {
        if (this.b == null) {
            return 0;
        }
        return 1;
    }

    public int getProtocol() {
        return this.f5329a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (parcel != null) {
            parcel.writeInt(this.f5329a);
            parcel.writeString(this.URI);
            parcel.writeBundle(this.header);
            parcel.writeBundle(this.b);
        }
    }

    private DataBuffer(Parcel parcel) {
        this.header = null;
        this.f5329a = 1;
        this.b = null;
        a(parcel);
    }

    private void a(Parcel parcel) {
        this.f5329a = parcel.readInt();
        this.URI = parcel.readString();
        this.header = parcel.readBundle(a(Bundle.class));
        this.b = parcel.readBundle(a(Bundle.class));
    }

    public DataBuffer() {
        this.header = null;
        this.f5329a = 1;
        this.b = null;
    }

    public DataBuffer(String str) {
        this.header = null;
        this.f5329a = 1;
        this.b = null;
        this.URI = str;
    }

    public DataBuffer(String str, int i) {
        this.header = null;
        this.b = null;
        this.URI = str;
        this.f5329a = i;
    }
}
