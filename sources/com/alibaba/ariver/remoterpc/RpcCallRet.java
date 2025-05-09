package com.alibaba.ariver.remoterpc;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class RpcCallRet implements Parcelable {
    public static final Parcelable.Creator<RpcCallRet> CREATOR = new Parcelable.Creator<RpcCallRet>() { // from class: com.alibaba.ariver.remoterpc.RpcCallRet.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RpcCallRet createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (RpcCallRet) ipChange.ipc$dispatch("bba77e77", new Object[]{this, parcel}) : new RpcCallRet(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RpcCallRet[] newArray(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (RpcCallRet[]) ipChange.ipc$dispatch("bc7e2dae", new Object[]{this, new Integer(i)}) : new RpcCallRet[i];
        }
    };
    public byte[] data;
    public RemoteRpcInvokeContext invokeContext;
    public boolean isException;

    public RpcCallRet() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.data);
        parcel.writeParcelable(this.invokeContext, i);
        parcel.writeByte(this.isException ? (byte) 1 : (byte) 0);
    }

    public RpcCallRet(Parcel parcel) {
        this.data = parcel.createByteArray();
        this.invokeContext = (RemoteRpcInvokeContext) parcel.readParcelable(RemoteRpcInvokeContext.class.getClassLoader());
        this.isException = parcel.readByte() != 0;
    }
}
