package com.taobao.taobao.scancode.encode.aidlservice;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public interface DecodeCallback extends IInterface {
    void onError(EncodeError encodeError) throws RemoteException;

    void onSuccess(String str) throws RemoteException;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static abstract class Stub extends Binder implements DecodeCallback {
        private static final String DESCRIPTOR = "com.taobao.taobao.scancode.encode.aidlservice.DecodeCallback";
        static final int TRANSACTION_onError = 2;
        static final int TRANSACTION_onSuccess = 1;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public static class Proxy implements DecodeCallback {

            /* renamed from: a  reason: collision with root package name */
            public final IBinder f12912a;

            static {
                t2o.a(656408584);
                t2o.a(656408582);
            }

            public Proxy(IBinder iBinder) {
                this.f12912a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f12912a;
            }

            @Override // com.taobao.taobao.scancode.encode.aidlservice.DecodeCallback
            public void onError(EncodeError encodeError) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (encodeError != null) {
                        obtain.writeInt(1);
                        encodeError.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f12912a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        encodeError.readFromParcel(obtain2);
                    }
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.taobao.taobao.scancode.encode.aidlservice.DecodeCallback
            public void onSuccess(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.f12912a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        static {
            t2o.a(656408583);
            t2o.a(656408582);
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static DecodeCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof DecodeCallback)) {
                return new Proxy(iBinder);
            }
            return (DecodeCallback) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            EncodeError encodeError;
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                onSuccess(parcel.readString());
                parcel2.writeNoException();
                return true;
            } else if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                if (parcel.readInt() != 0) {
                    encodeError = EncodeError.CREATOR.createFromParcel(parcel);
                } else {
                    encodeError = null;
                }
                onError(encodeError);
                parcel2.writeNoException();
                if (encodeError != null) {
                    parcel2.writeInt(1);
                    encodeError.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
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
