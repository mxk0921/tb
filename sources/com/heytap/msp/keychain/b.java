package com.heytap.msp.keychain;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public int f5210a;
    public String b;
    public Bundle c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Parcelable.Creator<b> {
        static {
            t2o.a(253755404);
        }

        @Override // android.os.Parcelable.Creator
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public b[] newArray(int i) {
            return new b[i];
        }
    }

    static {
        t2o.a(253755403);
    }

    public b() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "Response{code='" + this.f5210a + "', message='" + this.b + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f5210a);
        parcel.writeString(this.b);
        parcel.writeBundle(this.c);
    }

    public b(Parcel parcel) {
        this.f5210a = parcel.readInt();
        this.b = parcel.readString();
        this.c = parcel.readBundle();
    }
}
