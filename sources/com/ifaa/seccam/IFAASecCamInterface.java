package com.ifaa.seccam;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SharedMemory;
import com.ifaa.seccam.IFAASecCamCallback;
import tb.sec;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public interface IFAASecCamInterface extends IInterface {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class Default implements IFAASecCamInterface {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.ifaa.seccam.IFAASecCamInterface
        public int closeSecCam() throws RemoteException {
            return 0;
        }

        @Override // com.ifaa.seccam.IFAASecCamInterface
        public String getDeviceModel() throws RemoteException {
            return null;
        }

        @Override // com.ifaa.seccam.IFAASecCamInterface
        public int getSecImg(int i, SharedMemory sharedMemory) throws RemoteException {
            return 0;
        }

        @Override // com.ifaa.seccam.IFAASecCamInterface
        public int getVersion() throws RemoteException {
            return 0;
        }

        @Override // com.ifaa.seccam.IFAASecCamInterface
        public int initSecCam(SharedMemory sharedMemory) throws RemoteException {
            return 0;
        }

        @Override // com.ifaa.seccam.IFAASecCamInterface
        public int openSecCam(int i, IFAASecCamCallback iFAASecCamCallback) throws RemoteException {
            return 0;
        }
    }

    int closeSecCam() throws RemoteException;

    String getDeviceModel() throws RemoteException;

    int getSecImg(int i, SharedMemory sharedMemory) throws RemoteException;

    int getVersion() throws RemoteException;

    int initSecCam(SharedMemory sharedMemory) throws RemoteException;

    int openSecCam(int i, IFAASecCamCallback iFAASecCamCallback) throws RemoteException;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static abstract class Stub extends Binder implements IFAASecCamInterface {
        private static final String DESCRIPTOR = "com.ifaa.seccam.IFAASecCamInterface";
        static final int TRANSACTION_closeSecCam = 5;
        static final int TRANSACTION_getDeviceModel = 6;
        static final int TRANSACTION_getSecImg = 4;
        static final int TRANSACTION_getVersion = 1;
        static final int TRANSACTION_initSecCam = 2;
        static final int TRANSACTION_openSecCam = 3;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public static class Proxy implements IFAASecCamInterface {
            public static IFAASecCamInterface b;

            /* renamed from: a  reason: collision with root package name */
            public final IBinder f5540a;

            public Proxy(IBinder iBinder) {
                this.f5540a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f5540a;
            }

            @Override // com.ifaa.seccam.IFAASecCamInterface
            public int closeSecCam() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.f5540a.transact(5, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().closeSecCam();
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ifaa.seccam.IFAASecCamInterface
            public String getDeviceModel() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.f5540a.transact(6, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getDeviceModel();
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ifaa.seccam.IFAASecCamInterface
            public int getSecImg(int i, SharedMemory sharedMemory) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (sharedMemory != null) {
                        obtain.writeInt(1);
                        sharedMemory.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f5540a.transact(4, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        int readInt = obtain2.readInt();
                        obtain2.recycle();
                        obtain.recycle();
                        return readInt;
                    }
                    int secImg = Stub.getDefaultImpl().getSecImg(i, sharedMemory);
                    obtain2.recycle();
                    obtain.recycle();
                    return secImg;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.ifaa.seccam.IFAASecCamInterface
            public int getVersion() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.f5540a.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getVersion();
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ifaa.seccam.IFAASecCamInterface
            public int initSecCam(SharedMemory sharedMemory) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (sharedMemory != null) {
                        obtain.writeInt(1);
                        sharedMemory.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f5540a.transact(2, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        int readInt = obtain2.readInt();
                        obtain2.recycle();
                        obtain.recycle();
                        return readInt;
                    }
                    int initSecCam = Stub.getDefaultImpl().initSecCam(sharedMemory);
                    obtain2.recycle();
                    obtain.recycle();
                    return initSecCam;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.ifaa.seccam.IFAASecCamInterface
            public int openSecCam(int i, IFAASecCamCallback iFAASecCamCallback) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (iFAASecCamCallback != null) {
                        iBinder = iFAASecCamCallback.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (this.f5540a.transact(3, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        int readInt = obtain2.readInt();
                        obtain2.recycle();
                        obtain.recycle();
                        return readInt;
                    }
                    int openSecCam = Stub.getDefaultImpl().openSecCam(i, iFAASecCamCallback);
                    obtain2.recycle();
                    obtain.recycle();
                    return openSecCam;
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

        public static IFAASecCamInterface asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IFAASecCamInterface)) {
                return new Proxy(iBinder);
            }
            return (IFAASecCamInterface) queryLocalInterface;
        }

        public static IFAASecCamInterface getDefaultImpl() {
            return Proxy.b;
        }

        public static boolean setDefaultImpl(IFAASecCamInterface iFAASecCamInterface) {
            if (Proxy.b != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            } else if (iFAASecCamInterface == null) {
                return false;
            } else {
                Proxy.b = iFAASecCamInterface;
                return true;
            }
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            Parcelable.Creator creator;
            Parcelable.Creator creator2;
            if (i != 1598968902) {
                SharedMemory sharedMemory = null;
                switch (i) {
                    case 1:
                        parcel.enforceInterface(DESCRIPTOR);
                        int version = getVersion();
                        parcel2.writeNoException();
                        parcel2.writeInt(version);
                        return true;
                    case 2:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            creator = SharedMemory.CREATOR;
                            sharedMemory = sec.a(creator.createFromParcel(parcel));
                        }
                        int initSecCam = initSecCam(sharedMemory);
                        parcel2.writeNoException();
                        parcel2.writeInt(initSecCam);
                        return true;
                    case 3:
                        parcel.enforceInterface(DESCRIPTOR);
                        int openSecCam = openSecCam(parcel.readInt(), IFAASecCamCallback.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        parcel2.writeInt(openSecCam);
                        return true;
                    case 4:
                        parcel.enforceInterface(DESCRIPTOR);
                        int readInt = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            creator2 = SharedMemory.CREATOR;
                            sharedMemory = sec.a(creator2.createFromParcel(parcel));
                        }
                        int secImg = getSecImg(readInt, sharedMemory);
                        parcel2.writeNoException();
                        parcel2.writeInt(secImg);
                        return true;
                    case 5:
                        parcel.enforceInterface(DESCRIPTOR);
                        int closeSecCam = closeSecCam();
                        parcel2.writeNoException();
                        parcel2.writeInt(closeSecCam);
                        return true;
                    case 6:
                        parcel.enforceInterface(DESCRIPTOR);
                        String deviceModel = getDeviceModel();
                        parcel2.writeNoException();
                        parcel2.writeString(deviceModel);
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
