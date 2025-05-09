package com.alipay.android.app;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface IRemoteServiceCallback extends IInterface {
    int getVersion() throws RemoteException;

    boolean isHideLoadingScreen() throws RemoteException;

    void payEnd(boolean z, String str) throws RemoteException;

    void r03(String str, String str2, Map map) throws RemoteException;

    void startActivity(String str, String str2, int i, Bundle bundle) throws RemoteException;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static abstract class Stub extends Binder implements IRemoteServiceCallback {
        static final int TRANSACTION_getVersion = 4;
        static final int TRANSACTION_isHideLoadingScreen = 3;
        static final int TRANSACTION_payEnd = 2;
        static final int TRANSACTION_r03 = 5;
        static final int TRANSACTION_startActivity = 1;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static class Proxy implements IRemoteServiceCallback {
            public static IRemoteServiceCallback sDefaultImpl;
            private IBinder b;

            public Proxy(IBinder iBinder) {
                this.b = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.b;
            }

            public String getInterfaceDescriptor() {
                return "com.alipay.android.app.IRemoteServiceCallback";
            }

            @Override // com.alipay.android.app.IRemoteServiceCallback
            public int getVersion() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alipay.android.app.IRemoteServiceCallback");
                    if (!this.b.transact(4, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getVersion();
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alipay.android.app.IRemoteServiceCallback
            public boolean isHideLoadingScreen() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alipay.android.app.IRemoteServiceCallback");
                    boolean z = false;
                    if (!this.b.transact(3, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isHideLoadingScreen();
                    }
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

            @Override // com.alipay.android.app.IRemoteServiceCallback
            public void payEnd(boolean z, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alipay.android.app.IRemoteServiceCallback");
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeString(str);
                    if (this.b.transact(2, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().payEnd(z, str);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alipay.android.app.IRemoteServiceCallback
            public void r03(String str, String str2, Map map) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alipay.android.app.IRemoteServiceCallback");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeMap(map);
                    if (!this.b.transact(5, obtain, null, 1) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().r03(str, str2, map);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.alipay.android.app.IRemoteServiceCallback
            public void startActivity(String str, String str2, int i, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alipay.android.app.IRemoteServiceCallback");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.b.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().startActivity(str, str2, i, bundle);
                    }
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
            attachInterface(this, "com.alipay.android.app.IRemoteServiceCallback");
        }

        public static IRemoteServiceCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.alipay.android.app.IRemoteServiceCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IRemoteServiceCallback)) {
                return new Proxy(iBinder);
            }
            return (IRemoteServiceCallback) queryLocalInterface;
        }

        public static IRemoteServiceCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IRemoteServiceCallback iRemoteServiceCallback) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            } else if (iRemoteServiceCallback == null) {
                return false;
            } else {
                Proxy.sDefaultImpl = iRemoteServiceCallback;
                return true;
            }
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            Bundle bundle;
            boolean z;
            if (i == 1) {
                parcel.enforceInterface("com.alipay.android.app.IRemoteServiceCallback");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                int readInt = parcel.readInt();
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                } else {
                    bundle = null;
                }
                startActivity(readString, readString2, readInt, bundle);
                parcel2.writeNoException();
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("com.alipay.android.app.IRemoteServiceCallback");
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                payEnd(z, parcel.readString());
                parcel2.writeNoException();
                return true;
            } else if (i == 3) {
                parcel.enforceInterface("com.alipay.android.app.IRemoteServiceCallback");
                boolean isHideLoadingScreen = isHideLoadingScreen();
                parcel2.writeNoException();
                parcel2.writeInt(isHideLoadingScreen ? 1 : 0);
                return true;
            } else if (i == 4) {
                parcel.enforceInterface("com.alipay.android.app.IRemoteServiceCallback");
                int version = getVersion();
                parcel2.writeNoException();
                parcel2.writeInt(version);
                return true;
            } else if (i == 5) {
                parcel.enforceInterface("com.alipay.android.app.IRemoteServiceCallback");
                r03(parcel.readString(), parcel.readString(), parcel.readHashMap(getClass().getClassLoader()));
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.alipay.android.app.IRemoteServiceCallback");
                return true;
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class Default implements IRemoteServiceCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public int getVersion() throws RemoteException {
            return 0;
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public boolean isHideLoadingScreen() throws RemoteException {
            return false;
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public void payEnd(boolean z, String str) throws RemoteException {
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public void r03(String str, String str2, Map map) throws RemoteException {
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public void startActivity(String str, String str2, int i, Bundle bundle) throws RemoteException {
        }
    }
}
