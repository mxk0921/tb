package com.ali.user.open.laxin;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ali.user.open.laxin.LaxinDataCallback;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface LaxinLogin extends IInterface {
    void applyLaxinInfo(Map map, LaxinDataCallback laxinDataCallback) throws RemoteException;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static abstract class Stub extends Binder implements LaxinLogin {
        private static final String DESCRIPTOR = "com.ali.user.open.laxin.LaxinLogin";
        static final int TRANSACTION_applyLaxinInfo = 1;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static class Proxy implements LaxinLogin {
            public static LaxinLogin sDefaultImpl;
            private IBinder mRemote;

            static {
                t2o.a(73400330);
                t2o.a(73400327);
            }

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.ali.user.open.laxin.LaxinLogin
            public void applyLaxinInfo(Map map, LaxinDataCallback laxinDataCallback) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeMap(map);
                    if (laxinDataCallback != null) {
                        iBinder = laxinDataCallback.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (this.mRemote.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().applyLaxinInfo(map, laxinDataCallback);
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }
        }

        static {
            t2o.a(73400329);
            t2o.a(73400327);
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static LaxinLogin asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof LaxinLogin)) {
                return new Proxy(iBinder);
            }
            return (LaxinLogin) queryLocalInterface;
        }

        public static LaxinLogin getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(LaxinLogin laxinLogin) {
            if (Proxy.sDefaultImpl != null || laxinLogin == null) {
                return false;
            }
            Proxy.sDefaultImpl = laxinLogin;
            return true;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                applyLaxinInfo(parcel.readHashMap(getClass().getClassLoader()), LaxinDataCallback.Stub.asInterface(parcel.readStrongBinder()));
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
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class Default implements LaxinLogin {
        static {
            t2o.a(73400328);
            t2o.a(73400327);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.ali.user.open.laxin.LaxinLogin
        public void applyLaxinInfo(Map map, LaxinDataCallback laxinDataCallback) throws RemoteException {
        }
    }
}
