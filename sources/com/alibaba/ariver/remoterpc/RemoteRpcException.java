package com.alibaba.ariver.remoterpc;

import android.os.Parcel;
import android.os.Parcelable;
import com.alipay.mobile.common.rpc.RpcException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class RemoteRpcException extends RpcException implements Parcelable {
    public static final Parcelable.Creator<RemoteRpcException> CREATOR = new Parcelable.Creator<RemoteRpcException>() { // from class: com.alibaba.ariver.remoterpc.RemoteRpcException.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RemoteRpcException createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (RemoteRpcException) ipChange.ipc$dispatch("85ea1f25", new Object[]{this, parcel}) : new RemoteRpcException(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RemoteRpcException[] newArray(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (RemoteRpcException[]) ipChange.ipc$dispatch("f355a75c", new Object[]{this, new Integer(i)}) : new RemoteRpcException[i];
        }
    };

    public RemoteRpcException(Integer num, String str) {
        super(num, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mOperationType);
        parcel.writeInt(this.mCode);
        parcel.writeString(this.mMsg);
        parcel.writeString(this.mControl);
        parcel.writeByte(this.mIsControlOwn ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.errorSource);
        parcel.writeByte(this.isBgRpc ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.alert);
    }

    public RemoteRpcException(Integer num, Throwable th) {
        super(num, th);
    }

    public RemoteRpcException(String str) {
        super(str);
    }

    public RemoteRpcException(RpcException rpcException) {
        super("");
        this.mOperationType = rpcException.getOperationType();
        this.mCode = rpcException.getCode();
        this.mMsg = rpcException.getMsg();
        this.mControl = rpcException.getControl();
        this.mIsControlOwn = rpcException.isControlOwn();
        this.errorSource = rpcException.getErrorSource();
        this.isBgRpc = rpcException.isBgRpc();
        this.alert = rpcException.getAlert();
    }

    public RemoteRpcException() {
        super("");
    }

    public RemoteRpcException(Parcel parcel) {
        super("");
        this.mOperationType = parcel.readString();
        this.mCode = parcel.readInt();
        this.mMsg = parcel.readString();
        this.mControl = parcel.readString();
        boolean z = false;
        this.mIsControlOwn = parcel.readByte() != 0;
        this.errorSource = parcel.readInt();
        this.isBgRpc = parcel.readByte() != 0 ? true : z;
        this.alert = parcel.readInt();
    }
}
