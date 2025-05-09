package com.ali.user.mobile;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface ITBLoginService extends IInterface {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class Default implements ITBLoginService {
        static {
            t2o.a(69206018);
            t2o.a(69206017);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.ali.user.mobile.ITBLoginService
        public String getLoginInfo() throws RemoteException {
            return null;
        }
    }

    String getLoginInfo() throws RemoteException;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static abstract class Stub extends Binder implements ITBLoginService {
        private static final String DESCRIPTOR = "com.ali.user.mobile.ITBLoginService";
        static final int TRANSACTION_getLoginInfo = 1;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static class Proxy implements ITBLoginService {
            public static ITBLoginService sDefaultImpl;
            private IBinder mRemote;

            static {
                t2o.a(69206020);
                t2o.a(69206017);
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

            @Override // com.ali.user.mobile.ITBLoginService
            public String getLoginInfo() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getLoginInfo();
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        static {
            t2o.a(69206019);
            t2o.a(69206017);
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static ITBLoginService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof ITBLoginService)) {
                return new Proxy(iBinder);
            }
            return (ITBLoginService) queryLocalInterface;
        }

        public static ITBLoginService getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(ITBLoginService iTBLoginService) {
            if (Proxy.sDefaultImpl != null || iTBLoginService == null) {
                return false;
            }
            Proxy.sDefaultImpl = iTBLoginService;
            return true;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                String loginInfo = getLoginInfo();
                parcel2.writeNoException();
                parcel2.writeString(loginInfo);
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
