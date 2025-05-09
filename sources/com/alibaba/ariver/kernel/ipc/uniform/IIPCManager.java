package com.alibaba.ariver.kernel.ipc.uniform;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface IIPCManager extends IInterface {
    IPCResult call(IPCParameter iPCParameter) throws RemoteException;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static abstract class Stub extends Binder implements IIPCManager {
        private static final String DESCRIPTOR = "com.alibaba.ariver.kernel.ipc.uniform.IIPCManager";
        static final int TRANSACTION_call = 1;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static class Proxy implements IIPCManager {

            /* renamed from: a  reason: collision with root package name */
            public final IBinder f2444a;

            public Proxy(IBinder iBinder) {
                this.f2444a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f2444a;
            }

            @Override // com.alibaba.ariver.kernel.ipc.uniform.IIPCManager
            public IPCResult call(IPCParameter iPCParameter) throws RemoteException {
                IPCResult iPCResult;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (iPCParameter != null) {
                        obtain.writeInt(1);
                        iPCParameter.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2444a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        iPCResult = IPCResult.CREATOR.createFromParcel(obtain2);
                    } else {
                        iPCResult = null;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return iPCResult;
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

        public static IIPCManager asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IIPCManager)) {
                return new Proxy(iBinder);
            }
            return (IIPCManager) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            IPCParameter iPCParameter;
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                if (parcel.readInt() != 0) {
                    iPCParameter = IPCParameter.CREATOR.createFromParcel(parcel);
                } else {
                    iPCParameter = null;
                }
                IPCResult call = call(iPCParameter);
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
