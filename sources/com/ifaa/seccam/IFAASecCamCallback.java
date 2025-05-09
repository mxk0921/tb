package com.ifaa.seccam;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public interface IFAASecCamCallback extends IInterface {
    void onFrameEvent(int i, int i2) throws RemoteException;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static abstract class Stub extends Binder implements IFAASecCamCallback {
        private static final String DESCRIPTOR = "com.ifaa.seccam.IFAASecCamCallback";
        static final int TRANSACTION_onFrameEvent = 1;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public static class Proxy implements IFAASecCamCallback {
            public static IFAASecCamCallback b;

            /* renamed from: a  reason: collision with root package name */
            public final IBinder f5539a;

            public Proxy(IBinder iBinder) {
                this.f5539a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f5539a;
            }

            @Override // com.ifaa.seccam.IFAASecCamCallback
            public void onFrameEvent(int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    if (this.f5539a.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onFrameEvent(i, i2);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IFAASecCamCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IFAASecCamCallback)) {
                return new Proxy(iBinder);
            }
            return (IFAASecCamCallback) queryLocalInterface;
        }

        public static IFAASecCamCallback getDefaultImpl() {
            return Proxy.b;
        }

        public static boolean setDefaultImpl(IFAASecCamCallback iFAASecCamCallback) {
            if (Proxy.b != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            } else if (iFAASecCamCallback == null) {
                return false;
            } else {
                Proxy.b = iFAASecCamCallback;
                return true;
            }
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                onFrameEvent(parcel.readInt(), parcel.readInt());
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
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class Default implements IFAASecCamCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.ifaa.seccam.IFAASecCamCallback
        public void onFrameEvent(int i, int i2) throws RemoteException {
        }
    }
}
