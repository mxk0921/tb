package com.alibaba.ariver.kernel.api.remote;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class RemoteCallResult implements Parcelable {
    public static final Parcelable.Creator<RemoteCallResult> CREATOR = new Parcelable.Creator<RemoteCallResult>() { // from class: com.alibaba.ariver.kernel.api.remote.RemoteCallResult.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RemoteCallResult createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (RemoteCallResult) ipChange.ipc$dispatch("c92307a2", new Object[]{this, parcel}) : new RemoteCallResult(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RemoteCallResult[] newArray(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (RemoteCallResult[]) ipChange.ipc$dispatch("e73f4a99", new Object[]{this, new Integer(i)}) : new RemoteCallResult[i];
        }
    };
    private boolean isError;
    private Object value;

    public RemoteCallResult(Object obj) {
        this.isError = false;
        if (obj instanceof Throwable) {
            this.isError = true;
        }
        this.value = obj;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Object getValue() {
        return this.value;
    }

    public boolean isError() {
        return this.isError;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.isError ? (byte) 1 : (byte) 0);
        parcel.writeValue(this.value);
    }

    public RemoteCallResult(Parcel parcel) {
        boolean z = false;
        this.isError = false;
        this.isError = parcel.readByte() != 0 ? true : z;
        this.value = parcel.readValue(getClass().getClassLoader());
    }
}
