package com.taobao.taobao.scancode.encode.aidlservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MaSizeType implements Parcelable {
    public static final Parcelable.Creator<MaSizeType> CREATOR = new a();
    public int size;
    public int x;
    public int y;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements Parcelable.Creator<MaSizeType> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public MaSizeType createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MaSizeType) ipChange.ipc$dispatch("c306c533", new Object[]{this, parcel});
            }
            return new MaSizeType(parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        /* renamed from: b */
        public MaSizeType[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MaSizeType[]) ipChange.ipc$dispatch("bddb8adc", new Object[]{this, new Integer(i)});
            }
            return new MaSizeType[i];
        }
    }

    static {
        t2o.a(656408598);
    }

    public MaSizeType(int i, int i2, int i3) {
        this.x = i;
        this.y = i2;
        this.size = i3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void readFromParcel(Parcel parcel) {
        this.x = parcel.readInt();
        this.y = parcel.readInt();
        this.size = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.x);
        parcel.writeInt(this.y);
        parcel.writeInt(this.size);
    }

    public MaSizeType(int i, int i2) {
        this.size = 0;
        this.x = i;
        this.y = i2;
    }

    public MaSizeType(int i) {
        this.x = 0;
        this.y = 0;
        this.size = i;
    }
}
