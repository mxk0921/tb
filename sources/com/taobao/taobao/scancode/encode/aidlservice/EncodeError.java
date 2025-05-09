package com.taobao.taobao.scancode.encode.aidlservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class EncodeError implements Parcelable {
    public static final Parcelable.Creator<EncodeError> CREATOR = new a();
    public int errorCode;
    public String errorMessage;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements Parcelable.Creator<EncodeError> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public EncodeError createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (EncodeError) ipChange.ipc$dispatch("a6bf5a22", new Object[]{this, parcel});
            }
            return new EncodeError(parcel.readInt(), parcel.readString());
        }

        /* renamed from: b */
        public EncodeError[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (EncodeError[]) ipChange.ipc$dispatch("6834999", new Object[]{this, new Integer(i)});
            }
            return new EncodeError[i];
        }
    }

    static {
        t2o.a(656408592);
    }

    public EncodeError(int i) {
        this.errorCode = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void readFromParcel(Parcel parcel) {
        this.errorCode = parcel.readInt();
        this.errorMessage = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.errorCode);
        parcel.writeString(this.errorMessage);
    }

    public EncodeError(int i, String str) {
        this.errorCode = i;
        this.errorMessage = str;
    }
}
