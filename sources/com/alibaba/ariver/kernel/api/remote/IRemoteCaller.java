package com.alibaba.ariver.kernel.api.remote;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface IRemoteCaller extends IInterface {
    RemoteCallResult remoteCall(RemoteCallArgs remoteCallArgs) throws RemoteException;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static abstract class Stub extends Binder implements IRemoteCaller {
        private static final String DESCRIPTOR = "com.alibaba.ariver.kernel.api.remote.IRemoteCaller";
        static final int TRANSACTION_remoteCall = 1;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static class Proxy implements IRemoteCaller {

            /* renamed from: a  reason: collision with root package name */
            public final IBinder f2435a;

            public Proxy(IBinder iBinder) {
                this.f2435a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f2435a;
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.alibaba.ariver.kernel.api.remote.IRemoteCaller
            public RemoteCallResult remoteCall(RemoteCallArgs remoteCallArgs) throws RemoteException {
                RemoteCallResult remoteCallResult;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (remoteCallArgs != null) {
                        obtain.writeInt(1);
                        remoteCallArgs.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2435a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        remoteCallResult = RemoteCallResult.CREATOR.createFromParcel(obtain2);
                    } else {
                        remoteCallResult = null;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return remoteCallResult;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IRemoteCaller asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IRemoteCaller)) {
                return new Proxy(iBinder);
            }
            return (IRemoteCaller) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            RemoteCallArgs remoteCallArgs;
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                if (parcel.readInt() != 0) {
                    remoteCallArgs = RemoteCallArgs.CREATOR.createFromParcel(parcel);
                } else {
                    remoteCallArgs = null;
                }
                RemoteCallResult remoteCall = remoteCall(remoteCallArgs);
                parcel2.writeNoException();
                if (remoteCall != null) {
                    parcel2.writeInt(1);
                    remoteCall.writeToParcel(parcel2, 1);
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
