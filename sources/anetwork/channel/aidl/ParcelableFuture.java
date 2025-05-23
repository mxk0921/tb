package anetwork.channel.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface ParcelableFuture extends IInterface {
    boolean cancel(boolean z) throws RemoteException;

    NetworkResponse get(long j) throws RemoteException;

    boolean isCancelled() throws RemoteException;

    boolean isDone() throws RemoteException;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static abstract class Stub extends Binder implements ParcelableFuture {
        private static final String DESCRIPTOR = "anetwork.channel.aidl.ParcelableFuture";
        static final int TRANSACTION_cancel = 1;
        static final int TRANSACTION_get = 4;
        static final int TRANSACTION_isCancelled = 2;
        static final int TRANSACTION_isDone = 3;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static class Proxy implements ParcelableFuture {
            private IBinder mRemote;

            static {
                t2o.a(607125997);
                t2o.a(607125995);
            }

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // anetwork.channel.aidl.ParcelableFuture
            public boolean cancel(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z2 = false;
                    obtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z2 = true;
                    }
                    return z2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // anetwork.channel.aidl.ParcelableFuture
            public NetworkResponse get(long j) throws RemoteException {
                NetworkResponse networkResponse;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeLong(j);
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        networkResponse = NetworkResponse.CREATOR.createFromParcel(obtain2);
                    } else {
                        networkResponse = null;
                    }
                    return networkResponse;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // anetwork.channel.aidl.ParcelableFuture
            public boolean isCancelled() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z = false;
                    this.mRemote.transact(2, obtain, obtain2, 0);
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

            @Override // anetwork.channel.aidl.ParcelableFuture
            public boolean isDone() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z = false;
                    this.mRemote.transact(3, obtain, obtain2, 0);
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
        }

        static {
            t2o.a(607125996);
            t2o.a(607125995);
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static ParcelableFuture asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof ParcelableFuture)) {
                return new Proxy(iBinder);
            }
            return (ParcelableFuture) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            boolean z = false;
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                if (parcel.readInt() != 0) {
                    z = true;
                }
                boolean cancel = cancel(z);
                parcel2.writeNoException();
                parcel2.writeInt(cancel ? 1 : 0);
                return true;
            } else if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                boolean isCancelled = isCancelled();
                parcel2.writeNoException();
                parcel2.writeInt(isCancelled ? 1 : 0);
                return true;
            } else if (i == 3) {
                parcel.enforceInterface(DESCRIPTOR);
                boolean isDone = isDone();
                parcel2.writeNoException();
                parcel2.writeInt(isDone ? 1 : 0);
                return true;
            } else if (i == 4) {
                parcel.enforceInterface(DESCRIPTOR);
                NetworkResponse networkResponse = get(parcel.readLong());
                parcel2.writeNoException();
                if (networkResponse != null) {
                    parcel2.writeInt(1);
                    networkResponse.writeToParcel(parcel2, 1);
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
