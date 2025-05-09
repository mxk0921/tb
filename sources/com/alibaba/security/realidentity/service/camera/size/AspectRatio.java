package com.alibaba.security.realidentity.service.camera.size;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.SparseArrayCompat;
import com.alibaba.security.realidentity.c3;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AspectRatio implements Comparable<AspectRatio>, Parcelable {

    /* renamed from: a  reason: collision with root package name */
    public final int f2815a;
    public final int b;
    public static final AspectRatio c = new AspectRatio(4, 3);
    public static final SparseArrayCompat<SparseArrayCompat<AspectRatio>> d = new SparseArrayCompat<>(16);
    public static final Parcelable.Creator<AspectRatio> CREATOR = new a();

    public AspectRatio(int i, int i2) {
        this.f2815a = i;
        this.b = i2;
    }

    public static AspectRatio a(String str) {
        int indexOf = str.indexOf(58);
        if (indexOf != -1) {
            try {
                return b(Integer.parseInt(str.substring(0, indexOf)), Integer.parseInt(str.substring(indexOf + 1)));
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Malformed aspect ratio: ".concat(str), e);
            }
        } else {
            throw new IllegalArgumentException("Malformed aspect ratio: ".concat(str));
        }
    }

    public static AspectRatio b(int i, int i2) {
        int a2 = a(i, i2);
        int i3 = i / a2;
        int i4 = i2 / a2;
        SparseArrayCompat<SparseArrayCompat<AspectRatio>> sparseArrayCompat = d;
        SparseArrayCompat<AspectRatio> sparseArrayCompat2 = sparseArrayCompat.get(i3);
        if (sparseArrayCompat2 == null) {
            AspectRatio aspectRatio = new AspectRatio(i3, i4);
            SparseArrayCompat<AspectRatio> sparseArrayCompat3 = new SparseArrayCompat<>();
            sparseArrayCompat3.put(i4, aspectRatio);
            sparseArrayCompat.put(i3, sparseArrayCompat3);
            return aspectRatio;
        }
        AspectRatio aspectRatio2 = sparseArrayCompat2.get(i4);
        if (aspectRatio2 != null) {
            return aspectRatio2;
        }
        AspectRatio aspectRatio3 = new AspectRatio(i3, i4);
        sparseArrayCompat2.put(i4, aspectRatio3);
        return aspectRatio3;
    }

    public AspectRatio c() {
        return b(this.b, this.f2815a);
    }

    public float d() {
        return this.f2815a / this.b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AspectRatio)) {
            return false;
        }
        AspectRatio aspectRatio = (AspectRatio) obj;
        if (this.f2815a == aspectRatio.f2815a && this.b == aspectRatio.b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = this.b;
        int i2 = this.f2815a;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    public String toString() {
        return this.f2815a + ":" + this.b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2815a);
        parcel.writeInt(this.b);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a implements Parcelable.Creator<AspectRatio> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public AspectRatio createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (AspectRatio) ipChange.ipc$dispatch("ab966206", new Object[]{this, parcel}) : AspectRatio.b(parcel.readInt(), parcel.readInt());
        }

        /* renamed from: a */
        public AspectRatio[] newArray(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (AspectRatio[]) ipChange.ipc$dispatch("f34db3f7", new Object[]{this, new Integer(i)}) : new AspectRatio[i];
        }
    }

    public int a() {
        return this.f2815a;
    }

    public boolean a(c3 c3Var) {
        int a2 = a(c3Var.b(), c3Var.a());
        return this.f2815a == c3Var.b() / a2 && this.b == c3Var.a() / a2;
    }

    /* renamed from: a */
    public int compareTo(AspectRatio aspectRatio) {
        if (equals(aspectRatio)) {
            return 0;
        }
        return d() - aspectRatio.d() > 0.0f ? 1 : -1;
    }

    public int b() {
        return this.b;
    }

    public static int a(int i, int i2) {
        while (true) {
            i = i2;
            if (i == 0) {
                return i;
            }
            i2 = i % i;
        }
    }
}
