package com.taobao.taobao.scancode.encode.aidlservice;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public interface EncodeCallback extends IInterface {
    void onError(EncodeError encodeError) throws RemoteException;

    void onSuccess(BitmapHolder bitmapHolder) throws RemoteException;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static abstract class Stub extends Binder implements EncodeCallback {
        private static final String DESCRIPTOR = "com.taobao.taobao.scancode.encode.aidlservice.EncodeCallback";
        static final int TRANSACTION_onError = 2;
        static final int TRANSACTION_onSuccess = 1;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public static class Proxy implements EncodeCallback {

            /* renamed from: a  reason: collision with root package name */
            public final IBinder f12913a;

            static {
                t2o.a(656408591);
                t2o.a(656408589);
            }

            public Proxy(IBinder iBinder) {
                this.f12913a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f12913a;
            }

            @Override // com.taobao.taobao.scancode.encode.aidlservice.EncodeCallback
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
                    this.f12913a.transact(2, obtain, obtain2, 0);
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

            @Override // com.taobao.taobao.scancode.encode.aidlservice.EncodeCallback
            public void onSuccess(BitmapHolder bitmapHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (bitmapHolder != null) {
                        obtain.writeInt(1);
                        bitmapHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f12913a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        bitmapHolder.readFromParcel(obtain2);
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

        static {
            t2o.a(656408590);
            t2o.a(656408589);
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static EncodeCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof EncodeCallback)) {
                return new Proxy(iBinder);
            }
            return (EncodeCallback) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            BitmapHolder bitmapHolder = null;
            EncodeError encodeError = null;
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                if (parcel.readInt() != 0) {
                    bitmapHolder = BitmapHolder.CREATOR.createFromParcel(parcel);
                }
                onSuccess(bitmapHolder);
                parcel2.writeNoException();
                if (bitmapHolder != null) {
                    parcel2.writeInt(1);
                    bitmapHolder.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            } else if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                if (parcel.readInt() != 0) {
                    encodeError = EncodeError.CREATOR.createFromParcel(parcel);
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
