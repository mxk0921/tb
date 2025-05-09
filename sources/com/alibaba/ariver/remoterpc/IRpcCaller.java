package com.alibaba.ariver.remoterpc;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface IRpcCaller extends IInterface {
    RpcCallRet call(RpcCallArgs rpcCallArgs) throws RemoteException;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static abstract class Stub extends Binder implements IRpcCaller {
        private static final String DESCRIPTOR = "com.alibaba.ariver.remoterpc.IRpcCaller";
        static final int TRANSACTION_call = 1;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static class Proxy implements IRpcCaller {

            /* renamed from: a  reason: collision with root package name */
            public final IBinder f2445a;

            public Proxy(IBinder iBinder) {
                this.f2445a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f2445a;
            }

            @Override // com.alibaba.ariver.remoterpc.IRpcCaller
            public RpcCallRet call(RpcCallArgs rpcCallArgs) throws RemoteException {
                RpcCallRet rpcCallRet;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (rpcCallArgs != null) {
                        obtain.writeInt(1);
                        rpcCallArgs.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2445a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        rpcCallRet = RpcCallRet.CREATOR.createFromParcel(obtain2);
                    } else {
                        rpcCallRet = null;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return rpcCallRet;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IRpcCaller asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IRpcCaller)) {
                return new Proxy(iBinder);
            }
            return (IRpcCaller) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            RpcCallArgs rpcCallArgs;
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                if (parcel.readInt() != 0) {
                    rpcCallArgs = RpcCallArgs.CREATOR.createFromParcel(parcel);
                } else {
                    rpcCallArgs = null;
                }
                RpcCallRet call = call(rpcCallArgs);
                parcel2.writeNoException();
                if (call != null) {
                    parcel2.writeInt(1);
                    call.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
