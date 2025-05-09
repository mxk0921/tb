package com.taobao.login4android.api.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface ICommonCallback extends IInterface {
    void onFail(int i, String str) throws RemoteException;

    void onSucess() throws RemoteException;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class Default implements ICommonCallback {
        static {
            t2o.a(512753715);
            t2o.a(512753714);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.taobao.login4android.api.aidl.ICommonCallback
        public void onSucess() throws RemoteException {
        }

        @Override // com.taobao.login4android.api.aidl.ICommonCallback
        public void onFail(int i, String str) throws RemoteException {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static abstract class Stub extends Binder implements ICommonCallback {
        private static final String DESCRIPTOR = "com.taobao.login4android.api.aidl.ICommonCallback";
        static final int TRANSACTION_onFail = 2;
        static final int TRANSACTION_onSucess = 1;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public static class Proxy implements ICommonCallback {
            public static ICommonCallback sDefaultImpl;
            private IBinder mRemote;

            static {
                t2o.a(512753717);
                t2o.a(512753714);
            }

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.taobao.login4android.api.aidl.ICommonCallback
            public void onFail(int i, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (this.mRemote.transact(2, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onFail(i, str);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.login4android.api.aidl.ICommonCallback
            public void onSucess() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onSucess();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        static {
            t2o.a(512753716);
            t2o.a(512753714);
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static ICommonCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof ICommonCallback)) {
                return new Proxy(iBinder);
            }
            return (ICommonCallback) queryLocalInterface;
        }

        public static ICommonCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(ICommonCallback iCommonCallback) {
            if (Proxy.sDefaultImpl != null || iCommonCallback == null) {
                return false;
            }
            Proxy.sDefaultImpl = iCommonCallback;
            return true;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                onSucess();
                parcel2.writeNoException();
                return true;
            } else if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                onFail(parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
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
