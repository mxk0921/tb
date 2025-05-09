package com.alipay.mobile.common.ipc.api.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.alipay.mobile.common.ipc.api.aidl.IIPCCallBack;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface IIPCManager extends IInterface {
    IPCResult call(IPCParameter iPCParameter);

    boolean hashRegister();

    void registerCallBack(IIPCCallBack iIPCCallBack);

    void unregisterCallBack(IIPCCallBack iIPCCallBack);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static abstract class Stub extends Binder implements IIPCManager {
        private static final String DESCRIPTOR = "com.alipay.mobile.common.ipc.api.aidl.IIPCManager";
        static final int TRANSACTION_call = 1;
        static final int TRANSACTION_hashRegister = 4;
        static final int TRANSACTION_registerCallBack = 2;
        static final int TRANSACTION_unregisterCallBack = 3;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static class Proxy implements IIPCManager {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.alipay.mobile.common.ipc.api.aidl.IIPCManager
            public IPCResult call(IPCParameter iPCParameter) {
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
                    this.mRemote.transact(1, obtain, obtain2, 0);
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

            @Override // com.alipay.mobile.common.ipc.api.aidl.IIPCManager
            public boolean hashRegister() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z = false;
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alipay.mobile.common.ipc.api.aidl.IIPCManager
            public void registerCallBack(IIPCCallBack iIPCCallBack) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (iIPCCallBack != null) {
                        iBinder = iIPCCallBack.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.alipay.mobile.common.ipc.api.aidl.IIPCManager
            public void unregisterCallBack(IIPCCallBack iIPCCallBack) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (iIPCCallBack != null) {
                        iBinder = iIPCCallBack.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
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
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
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
            } else if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                registerCallBack(IIPCCallBack.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            } else if (i == 3) {
                parcel.enforceInterface(DESCRIPTOR);
                unregisterCallBack(IIPCCallBack.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            } else if (i == 4) {
                parcel.enforceInterface(DESCRIPTOR);
                boolean hashRegister = hashRegister();
                parcel2.writeNoException();
                parcel2.writeInt(hashRegister ? 1 : 0);
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
