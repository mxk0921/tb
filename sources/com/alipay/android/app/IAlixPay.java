package com.alipay.android.app;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.alipay.android.app.IRemoteServiceCallback;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface IAlixPay extends IInterface {
    String Pay(String str) throws RemoteException;

    void deployFastConnect() throws RemoteException;

    int getVersion() throws RemoteException;

    boolean manager(String str) throws RemoteException;

    String pay02(String str, Map map) throws RemoteException;

    String prePay(String str) throws RemoteException;

    void r03(String str, String str2, Map map) throws RemoteException;

    void registerCallback(IRemoteServiceCallback iRemoteServiceCallback) throws RemoteException;

    void registerCallback03(IRemoteServiceCallback iRemoteServiceCallback, String str, Map map) throws RemoteException;

    String test() throws RemoteException;

    void unregisterCallback(IRemoteServiceCallback iRemoteServiceCallback) throws RemoteException;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class Default implements IAlixPay {
        @Override // com.alipay.android.app.IAlixPay
        public String Pay(String str) throws RemoteException {
            return null;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.alipay.android.app.IAlixPay
        public int getVersion() throws RemoteException {
            return 0;
        }

        @Override // com.alipay.android.app.IAlixPay
        public boolean manager(String str) throws RemoteException {
            return false;
        }

        @Override // com.alipay.android.app.IAlixPay
        public String pay02(String str, Map map) throws RemoteException {
            return null;
        }

        @Override // com.alipay.android.app.IAlixPay
        public String prePay(String str) throws RemoteException {
            return null;
        }

        @Override // com.alipay.android.app.IAlixPay
        public String test() throws RemoteException {
            return null;
        }

        @Override // com.alipay.android.app.IAlixPay
        public void deployFastConnect() throws RemoteException {
        }

        @Override // com.alipay.android.app.IAlixPay
        public void registerCallback(IRemoteServiceCallback iRemoteServiceCallback) throws RemoteException {
        }

        @Override // com.alipay.android.app.IAlixPay
        public void unregisterCallback(IRemoteServiceCallback iRemoteServiceCallback) throws RemoteException {
        }

        @Override // com.alipay.android.app.IAlixPay
        public void r03(String str, String str2, Map map) throws RemoteException {
        }

        @Override // com.alipay.android.app.IAlixPay
        public void registerCallback03(IRemoteServiceCallback iRemoteServiceCallback, String str, Map map) throws RemoteException {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static abstract class Stub extends Binder implements IAlixPay {
        static final int TRANSACTION_Pay = 1;
        static final int TRANSACTION_deployFastConnect = 6;
        static final int TRANSACTION_getVersion = 8;
        static final int TRANSACTION_manager = 7;
        static final int TRANSACTION_pay02 = 9;
        static final int TRANSACTION_prePay = 5;
        static final int TRANSACTION_r03 = 10;
        static final int TRANSACTION_registerCallback = 3;
        static final int TRANSACTION_registerCallback03 = 11;
        static final int TRANSACTION_test = 2;
        static final int TRANSACTION_unregisterCallback = 4;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static class Proxy implements IAlixPay {
            public static IAlixPay sDefaultImpl;
            private IBinder b;

            public Proxy(IBinder iBinder) {
                this.b = iBinder;
            }

            @Override // com.alipay.android.app.IAlixPay
            public String Pay(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alipay.android.app.IAlixPay");
                    obtain.writeString(str);
                    if (!this.b.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().Pay(str);
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.b;
            }

            @Override // com.alipay.android.app.IAlixPay
            public void deployFastConnect() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alipay.android.app.IAlixPay");
                    if (this.b.transact(6, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().deployFastConnect();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return "com.alipay.android.app.IAlixPay";
            }

            @Override // com.alipay.android.app.IAlixPay
            public int getVersion() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alipay.android.app.IAlixPay");
                    if (!this.b.transact(8, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getVersion();
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alipay.android.app.IAlixPay
            public boolean manager(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alipay.android.app.IAlixPay");
                    obtain.writeString(str);
                    boolean z = false;
                    if (!this.b.transact(7, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().manager(str);
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

            @Override // com.alipay.android.app.IAlixPay
            public String pay02(String str, Map map) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alipay.android.app.IAlixPay");
                    obtain.writeString(str);
                    obtain.writeMap(map);
                    if (!this.b.transact(9, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().pay02(str, map);
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alipay.android.app.IAlixPay
            public String prePay(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alipay.android.app.IAlixPay");
                    obtain.writeString(str);
                    if (!this.b.transact(5, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().prePay(str);
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alipay.android.app.IAlixPay
            public void r03(String str, String str2, Map map) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alipay.android.app.IAlixPay");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeMap(map);
                    if (!this.b.transact(10, obtain, null, 1) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().r03(str, str2, map);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.alipay.android.app.IAlixPay
            public void registerCallback(IRemoteServiceCallback iRemoteServiceCallback) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alipay.android.app.IAlixPay");
                    if (iRemoteServiceCallback != null) {
                        iBinder = iRemoteServiceCallback.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (this.b.transact(3, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().registerCallback(iRemoteServiceCallback);
                    }
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.alipay.android.app.IAlixPay
            public void registerCallback03(IRemoteServiceCallback iRemoteServiceCallback, String str, Map map) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alipay.android.app.IAlixPay");
                    if (iRemoteServiceCallback != null) {
                        iBinder = iRemoteServiceCallback.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeString(str);
                    obtain.writeMap(map);
                    if (this.b.transact(11, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().registerCallback03(iRemoteServiceCallback, str, map);
                    }
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.alipay.android.app.IAlixPay
            public String test() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alipay.android.app.IAlixPay");
                    if (!this.b.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().test();
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alipay.android.app.IAlixPay
            public void unregisterCallback(IRemoteServiceCallback iRemoteServiceCallback) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alipay.android.app.IAlixPay");
                    if (iRemoteServiceCallback != null) {
                        iBinder = iRemoteServiceCallback.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (this.b.transact(4, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().unregisterCallback(iRemoteServiceCallback);
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
            attachInterface(this, "com.alipay.android.app.IAlixPay");
        }

        public static IAlixPay asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.alipay.android.app.IAlixPay");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IAlixPay)) {
                return new Proxy(iBinder);
            }
            return (IAlixPay) queryLocalInterface;
        }

        public static IAlixPay getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IAlixPay iAlixPay) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            } else if (iAlixPay == null) {
                return false;
            } else {
                Proxy.sDefaultImpl = iAlixPay;
                return true;
            }
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.alipay.android.app.IAlixPay");
                        String Pay = Pay(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeString(Pay);
                        return true;
                    case 2:
                        parcel.enforceInterface("com.alipay.android.app.IAlixPay");
                        String test = test();
                        parcel2.writeNoException();
                        parcel2.writeString(test);
                        return true;
                    case 3:
                        parcel.enforceInterface("com.alipay.android.app.IAlixPay");
                        registerCallback(IRemoteServiceCallback.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface("com.alipay.android.app.IAlixPay");
                        unregisterCallback(IRemoteServiceCallback.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        parcel.enforceInterface("com.alipay.android.app.IAlixPay");
                        String prePay = prePay(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeString(prePay);
                        return true;
                    case 6:
                        parcel.enforceInterface("com.alipay.android.app.IAlixPay");
                        deployFastConnect();
                        parcel2.writeNoException();
                        return true;
                    case 7:
                        parcel.enforceInterface("com.alipay.android.app.IAlixPay");
                        boolean manager = manager(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(manager ? 1 : 0);
                        return true;
                    case 8:
                        parcel.enforceInterface("com.alipay.android.app.IAlixPay");
                        int version = getVersion();
                        parcel2.writeNoException();
                        parcel2.writeInt(version);
                        return true;
                    case 9:
                        parcel.enforceInterface("com.alipay.android.app.IAlixPay");
                        String pay02 = pay02(parcel.readString(), parcel.readHashMap(getClass().getClassLoader()));
                        parcel2.writeNoException();
                        parcel2.writeString(pay02);
                        return true;
                    case 10:
                        parcel.enforceInterface("com.alipay.android.app.IAlixPay");
                        r03(parcel.readString(), parcel.readString(), parcel.readHashMap(getClass().getClassLoader()));
                        return true;
                    case 11:
                        parcel.enforceInterface("com.alipay.android.app.IAlixPay");
                        registerCallback03(IRemoteServiceCallback.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), parcel.readHashMap(getClass().getClassLoader()));
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.alipay.android.app.IAlixPay");
                return true;
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
