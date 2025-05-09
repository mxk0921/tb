package com.taobao.widgetvivo.server;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface IDataRequestListener extends IInterface {
    void dataRequestFailure(String str) throws RemoteException;

    void dataRequestSuccess(String str) throws RemoteException;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static abstract class Stub extends Binder implements IDataRequestListener {
        private static final String DESCRIPTOR = "com.taobao.widgetvivo.server.IDataRequestListener";
        static final int TRANSACTION_dataRequestFailure = 2;
        static final int TRANSACTION_dataRequestSuccess = 1;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static class Proxy implements IDataRequestListener {

            /* renamed from: a  reason: collision with root package name */
            public final IBinder f14159a;

            static {
                t2o.a(437256356);
                t2o.a(437256354);
            }

            public Proxy(IBinder iBinder) {
                this.f14159a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14159a;
            }

            @Override // com.taobao.widgetvivo.server.IDataRequestListener
            public void dataRequestFailure(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.f14159a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.widgetvivo.server.IDataRequestListener
            public void dataRequestSuccess(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.f14159a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        static {
            t2o.a(437256355);
            t2o.a(437256354);
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IDataRequestListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IDataRequestListener)) {
                return new Proxy(iBinder);
            }
            return (IDataRequestListener) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                dataRequestSuccess(parcel.readString());
                parcel2.writeNoException();
                return true;
            } else if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                dataRequestFailure(parcel.readString());
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
