package com.taobao.widgetvivo.server;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.taobao.widgetvivo.server.IDataRequestListener;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface IWidgetVivoManager extends IInterface {
    void postOrderRequest() throws RemoteException;

    void postRequest() throws RemoteException;

    void postTaoGoldRequest() throws RemoteException;

    void registerListener(IDataRequestListener iDataRequestListener) throws RemoteException;

    void unregisterListener(IDataRequestListener iDataRequestListener) throws RemoteException;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static abstract class Stub extends Binder implements IWidgetVivoManager {
        private static final String DESCRIPTOR = "com.taobao.widgetvivo.server.IWidgetVivoManager";
        static final int TRANSACTION_postOrderRequest = 5;
        static final int TRANSACTION_postRequest = 3;
        static final int TRANSACTION_postTaoGoldRequest = 4;
        static final int TRANSACTION_registerListener = 1;
        static final int TRANSACTION_unregisterListener = 2;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static class Proxy implements IWidgetVivoManager {

            /* renamed from: a  reason: collision with root package name */
            public final IBinder f14160a;

            static {
                t2o.a(437256359);
                t2o.a(437256357);
            }

            public Proxy(IBinder iBinder) {
                this.f14160a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14160a;
            }

            @Override // com.taobao.widgetvivo.server.IWidgetVivoManager
            public void postOrderRequest() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.f14160a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.widgetvivo.server.IWidgetVivoManager
            public void postRequest() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.f14160a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.widgetvivo.server.IWidgetVivoManager
            public void postTaoGoldRequest() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.f14160a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.widgetvivo.server.IWidgetVivoManager
            public void registerListener(IDataRequestListener iDataRequestListener) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (iDataRequestListener != null) {
                        iBinder = iDataRequestListener.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f14160a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.taobao.widgetvivo.server.IWidgetVivoManager
            public void unregisterListener(IDataRequestListener iDataRequestListener) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (iDataRequestListener != null) {
                        iBinder = iDataRequestListener.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f14160a.transact(2, obtain, obtain2, 0);
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

        static {
            t2o.a(437256358);
            t2o.a(437256357);
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IWidgetVivoManager asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IWidgetVivoManager)) {
                return new Proxy(iBinder);
            }
            return (IWidgetVivoManager) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                registerListener(IDataRequestListener.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            } else if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                unregisterListener(IDataRequestListener.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            } else if (i == 3) {
                parcel.enforceInterface(DESCRIPTOR);
                postRequest();
                parcel2.writeNoException();
                return true;
            } else if (i == 4) {
                parcel.enforceInterface(DESCRIPTOR);
                postTaoGoldRequest();
                parcel2.writeNoException();
                return true;
            } else if (i == 5) {
                parcel.enforceInterface(DESCRIPTOR);
                postOrderRequest();
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
