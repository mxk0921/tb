package com.taobao.android.ugc.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface ITaopai extends IInterface {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class Default implements ITaopai {
        static {
            t2o.a(758120514);
            t2o.a(758120513);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.taobao.android.ugc.service.ITaopai
        public boolean isPhoneSupport() throws RemoteException {
            return false;
        }
    }

    boolean isPhoneSupport() throws RemoteException;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static abstract class Stub extends Binder implements ITaopai {
        private static final String DESCRIPTOR = "com.taobao.android.ugc.service.ITaopai";
        static final int TRANSACTION_isPhoneSupport = 1;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public static class Proxy implements ITaopai {
            public static ITaopai b;

            /* renamed from: a  reason: collision with root package name */
            public final IBinder f9833a;

            static {
                t2o.a(758120516);
                t2o.a(758120513);
            }

            public Proxy(IBinder iBinder) {
                this.f9833a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f9833a;
            }

            @Override // com.taobao.android.ugc.service.ITaopai
            public boolean isPhoneSupport() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z = false;
                    if (!this.f9833a.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isPhoneSupport();
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
        }

        static {
            t2o.a(758120515);
            t2o.a(758120513);
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static ITaopai asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof ITaopai)) {
                return new Proxy(iBinder);
            }
            return (ITaopai) queryLocalInterface;
        }

        public static ITaopai getDefaultImpl() {
            return Proxy.b;
        }

        public static boolean setDefaultImpl(ITaopai iTaopai) {
            if (Proxy.b != null || iTaopai == null) {
                return false;
            }
            Proxy.b = iTaopai;
            return true;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                boolean isPhoneSupport = isPhoneSupport();
                parcel2.writeNoException();
                parcel2.writeInt(isPhoneSupport ? 1 : 0);
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
