package com.taobao.android.ugc.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface ICallback extends IInterface {
    void onFailure(String str, String str2) throws RemoteException;

    void onResult(float f, float f2) throws RemoteException;

    void onSuccess(String str) throws RemoteException;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static abstract class Stub extends Binder implements ICallback {
        private static final String DESCRIPTOR = "com.taobao.android.ugc.service.ICallback";
        static final int TRANSACTION_onFailure = 3;
        static final int TRANSACTION_onResult = 1;
        static final int TRANSACTION_onSuccess = 2;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public static class Proxy implements ICallback {
            public static ICallback b;

            /* renamed from: a  reason: collision with root package name */
            public final IBinder f9831a;

            static {
                t2o.a(758120507);
                t2o.a(758120504);
            }

            public Proxy(IBinder iBinder) {
                this.f9831a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f9831a;
            }

            @Override // com.taobao.android.ugc.service.ICallback
            public void onFailure(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (this.f9831a.transact(3, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onFailure(str, str2);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.android.ugc.service.ICallback
            public void onResult(float f, float f2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeFloat(f);
                    obtain.writeFloat(f2);
                    if (this.f9831a.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onResult(f, f2);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.android.ugc.service.ICallback
            public void onSuccess(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    if (this.f9831a.transact(2, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onSuccess(str);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        static {
            t2o.a(758120506);
            t2o.a(758120504);
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static ICallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof ICallback)) {
                return new Proxy(iBinder);
            }
            return (ICallback) queryLocalInterface;
        }

        public static ICallback getDefaultImpl() {
            return Proxy.b;
        }

        public static boolean setDefaultImpl(ICallback iCallback) {
            if (Proxy.b != null || iCallback == null) {
                return false;
            }
            Proxy.b = iCallback;
            return true;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                onResult(parcel.readFloat(), parcel.readFloat());
                parcel2.writeNoException();
                return true;
            } else if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                onSuccess(parcel.readString());
                parcel2.writeNoException();
                return true;
            } else if (i == 3) {
                parcel.enforceInterface(DESCRIPTOR);
                onFailure(parcel.readString(), parcel.readString());
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

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class Default implements ICallback {
        static {
            t2o.a(758120505);
            t2o.a(758120504);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.taobao.android.ugc.service.ICallback
        public void onSuccess(String str) throws RemoteException {
        }

        @Override // com.taobao.android.ugc.service.ICallback
        public void onFailure(String str, String str2) throws RemoteException {
        }

        @Override // com.taobao.android.ugc.service.ICallback
        public void onResult(float f, float f2) throws RemoteException {
        }
    }
}
