package com.ali.user.open.laxin;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.HashMap;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface LaxinDataCallback extends IInterface {
    void onData(Map map) throws RemoteException;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static abstract class Stub extends Binder implements LaxinDataCallback {
        private static final String DESCRIPTOR = "com.ali.user.open.laxin.LaxinDataCallback";
        static final int TRANSACTION_onData = 1;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static class Proxy implements LaxinDataCallback {
            public static LaxinDataCallback sDefaultImpl;
            private IBinder mRemote;

            static {
                t2o.a(73400326);
                t2o.a(73400323);
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

            @Override // com.ali.user.open.laxin.LaxinDataCallback
            public void onData(Map map) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeMap(map);
                    if (this.mRemote.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.readHashMap(getClass().getClassLoader());
                        return;
                    }
                    Stub.getDefaultImpl().onData(map);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        static {
            t2o.a(73400325);
            t2o.a(73400323);
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static LaxinDataCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof LaxinDataCallback)) {
                return new Proxy(iBinder);
            }
            return (LaxinDataCallback) queryLocalInterface;
        }

        public static LaxinDataCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(LaxinDataCallback laxinDataCallback) {
            if (Proxy.sDefaultImpl != null || laxinDataCallback == null) {
                return false;
            }
            Proxy.sDefaultImpl = laxinDataCallback;
            return true;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                HashMap readHashMap = parcel.readHashMap(getClass().getClassLoader());
                onData(readHashMap);
                parcel2.writeNoException();
                parcel2.writeMap(readHashMap);
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
    public static class Default implements LaxinDataCallback {
        static {
            t2o.a(73400324);
            t2o.a(73400323);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.ali.user.open.laxin.LaxinDataCallback
        public void onData(Map map) throws RemoteException {
        }
    }
}
