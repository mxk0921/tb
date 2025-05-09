package com.alibaba.ariver.remoterpc;

import android.os.Parcel;
import android.os.Parcelable;
import com.alipay.mobile.common.rpc.transport.InnerRpcInvokeContext;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class RpcCallArgs implements Parcelable {
    public static final Parcelable.Creator<RpcCallArgs> CREATOR = new Parcelable.Creator<RpcCallArgs>() { // from class: com.alibaba.ariver.remoterpc.RpcCallArgs.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RpcCallArgs createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (RpcCallArgs) ipChange.ipc$dispatch("b85e7fe1", new Object[]{this, parcel}) : new RpcCallArgs(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RpcCallArgs[] newArray(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (RpcCallArgs[]) ipChange.ipc$dispatch("d25db78a", new Object[]{this, new Integer(i)}) : new RpcCallArgs[i];
        }
    };
    public byte[] argsBody;
    public String className;
    public RemoteRpcInvokeContext invokeContext;
    public String methodName;
    public byte protoType;

    public RpcCallArgs() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "RpcCallArgs{className='" + this.className + "', methodName='" + this.methodName + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.className);
        parcel.writeString(this.methodName);
        parcel.writeByteArray(this.argsBody);
        parcel.writeByte(this.protoType);
        parcel.writeParcelable(this.invokeContext, i);
    }

    public RpcCallArgs(Parcel parcel) {
        this.className = parcel.readString();
        this.methodName = parcel.readString();
        this.argsBody = parcel.createByteArray();
        this.protoType = parcel.readByte();
        this.invokeContext = (RemoteRpcInvokeContext) parcel.readParcelable(InnerRpcInvokeContext.class.getClassLoader());
    }
}
