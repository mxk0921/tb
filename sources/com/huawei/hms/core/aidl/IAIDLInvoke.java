package com.huawei.hms.core.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.huawei.hms.core.aidl.IAIDLCallback;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public interface IAIDLInvoke extends IInterface {
    public static final String DESCRIPTOR = "com.huawei.hms.core.aidl.IAIDLInvoke";

    void asyncCall(DataBuffer dataBuffer, IAIDLCallback iAIDLCallback) throws RemoteException;

    void syncCall(DataBuffer dataBuffer) throws RemoteException;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static abstract class Stub extends Binder implements IAIDLInvoke {

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public static class a implements IAIDLInvoke {
            public static IAIDLInvoke b;

            /* renamed from: a  reason: collision with root package name */
            private IBinder f5331a;

            public a(IBinder iBinder) {
                this.f5331a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f5331a;
            }

            @Override // com.huawei.hms.core.aidl.IAIDLInvoke
            public void asyncCall(DataBuffer dataBuffer, IAIDLCallback iAIDLCallback) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IAIDLInvoke.DESCRIPTOR);
                    if (dataBuffer != null) {
                        obtain.writeInt(1);
                        dataBuffer.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (iAIDLCallback != null) {
                        iBinder = iAIDLCallback.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (this.f5331a.transact(2, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().asyncCall(dataBuffer, iAIDLCallback);
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.huawei.hms.core.aidl.IAIDLInvoke
            public void syncCall(DataBuffer dataBuffer) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IAIDLInvoke.DESCRIPTOR);
                    if (dataBuffer != null) {
                        obtain.writeInt(1);
                        dataBuffer.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f5331a.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().syncCall(dataBuffer);
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
            attachInterface(this, IAIDLInvoke.DESCRIPTOR);
        }

        public static IAIDLInvoke asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IAIDLInvoke.DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IAIDLInvoke)) {
                return new a(iBinder);
            }
            return (IAIDLInvoke) queryLocalInterface;
        }

        public static IAIDLInvoke getDefaultImpl() {
            return a.b;
        }

        public static boolean setDefaultImpl(IAIDLInvoke iAIDLInvoke) {
            if (a.b != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            } else if (iAIDLInvoke == null) {
                return false;
            } else {
                a.b = iAIDLInvoke;
                return true;
            }
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                DataBuffer dataBuffer = null;
                if (i == 1) {
                    parcel.enforceInterface(IAIDLInvoke.DESCRIPTOR);
                    if (parcel.readInt() != 0) {
                        dataBuffer = DataBuffer.CREATOR.createFromParcel(parcel);
                    }
                    syncCall(dataBuffer);
                    parcel2.writeNoException();
                    return true;
                } else if (i != 2) {
                    return super.onTransact(i, parcel, parcel2, i2);
                } else {
                    parcel.enforceInterface(IAIDLInvoke.DESCRIPTOR);
                    if (parcel.readInt() != 0) {
                        dataBuffer = DataBuffer.CREATOR.createFromParcel(parcel);
                    }
                    asyncCall(dataBuffer, IAIDLCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                }
            } else {
                parcel2.writeString(IAIDLInvoke.DESCRIPTOR);
                return true;
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
