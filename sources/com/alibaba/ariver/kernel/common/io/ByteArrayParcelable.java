package com.alibaba.ariver.kernel.common.io;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ByteArrayParcelable implements Parcelable {
    public static final Parcelable.Creator<ByteArrayParcelable> CREATOR = new Parcelable.Creator<ByteArrayParcelable>() { // from class: com.alibaba.ariver.kernel.common.io.ByteArrayParcelable.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ByteArrayParcelable createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ByteArrayParcelable) ipChange.ipc$dispatch("84c422a8", new Object[]{this, parcel}) : new ByteArrayParcelable(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ByteArrayParcelable[] newArray(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ByteArrayParcelable[]) ipChange.ipc$dispatch("8cdb83df", new Object[]{this, new Integer(i)}) : new ByteArrayParcelable[i];
        }
    };
    private byte[] bytes;

    public ByteArrayParcelable(byte[] bArr) {
        this.bytes = bArr;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public byte[] getBytes() {
        return this.bytes;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        byte[] bArr = this.bytes;
        if (bArr == null) {
            i2 = 0;
        } else {
            i2 = bArr.length;
        }
        parcel.writeInt(i2);
        if (i2 > 0) {
            parcel.writeByteArray(this.bytes);
        }
    }

    public ByteArrayParcelable(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt > 0) {
            byte[] bArr = new byte[readInt];
            this.bytes = bArr;
            parcel.readByteArray(bArr);
        }
    }
}
