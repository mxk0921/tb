package com.zui.deviceidservice;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public interface IDeviceidInterface extends IInterface {
    boolean createAAIDForPackageName(String str) throws RemoteException;

    String getAAID(String str) throws RemoteException;

    String getOAID() throws RemoteException;

    String getUDID() throws RemoteException;

    String getVAID(String str) throws RemoteException;

    boolean isSupport() throws RemoteException;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static abstract class Stub extends Binder implements IDeviceidInterface {
        private static final String DESCRIPTOR = "com.zui.deviceidservice.IDeviceidInterface";
        static final int TRANSACTION_createAAIDForPackageName = 6;
        static final int TRANSACTION_getAAID = 5;
        static final int TRANSACTION_getOAID = 1;
        static final int TRANSACTION_getUDID = 2;
        static final int TRANSACTION_getVAID = 4;
        static final int TRANSACTION_isSupport = 3;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
        public static class Proxy implements IDeviceidInterface {

            /* renamed from: a  reason: collision with root package name */
            public final IBinder f15163a;

            static {
                t2o.a(147849275);
                t2o.a(147849273);
            }

            public Proxy(IBinder iBinder) {
                this.f15163a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f15163a;
            }

            @Override // com.zui.deviceidservice.IDeviceidInterface
            public boolean createAAIDForPackageName(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    boolean z = false;
                    this.f15163a.transact(6, obtain, obtain2, 0);
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

            @Override // com.zui.deviceidservice.IDeviceidInterface
            public String getAAID(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.f15163a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.zui.deviceidservice.IDeviceidInterface
            public String getOAID() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.f15163a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.zui.deviceidservice.IDeviceidInterface
            public String getUDID() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.f15163a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.zui.deviceidservice.IDeviceidInterface
            public String getVAID(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.f15163a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.zui.deviceidservice.IDeviceidInterface
            public boolean isSupport() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z = false;
                    this.f15163a.transact(3, obtain, obtain2, 0);
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
            t2o.a(147849274);
            t2o.a(147849273);
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IDeviceidInterface asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IDeviceidInterface)) {
                return new Proxy(iBinder);
            }
            return (IDeviceidInterface) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface(DESCRIPTOR);
                        String oaid = getOAID();
                        parcel2.writeNoException();
                        parcel2.writeString(oaid);
                        return true;
                    case 2:
                        parcel.enforceInterface(DESCRIPTOR);
                        String udid = getUDID();
                        parcel2.writeNoException();
                        parcel2.writeString(udid);
                        return true;
                    case 3:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean isSupport = isSupport();
                        parcel2.writeNoException();
                        parcel2.writeInt(isSupport ? 1 : 0);
                        return true;
                    case 4:
                        parcel.enforceInterface(DESCRIPTOR);
                        String vaid = getVAID(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeString(vaid);
                        return true;
                    case 5:
                        parcel.enforceInterface(DESCRIPTOR);
                        String aaid = getAAID(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeString(aaid);
                        return true;
                    case 6:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean createAAIDForPackageName = createAAIDForPackageName(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(createAAIDForPackageName ? 1 : 0);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
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
