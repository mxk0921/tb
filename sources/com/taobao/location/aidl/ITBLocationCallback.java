package com.taobao.location.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.taobao.location.common.TBLocationDTO;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface ITBLocationCallback extends IInterface {
    void onLocationChanged(TBLocationDTO tBLocationDTO) throws RemoteException;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static abstract class Stub extends Binder implements ITBLocationCallback {
        private static final String DESCRIPTOR = "com.taobao.location.aidl.ITBLocationCallback";
        static final int TRANSACTION_onLocationChanged = 1;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public static class Proxy implements ITBLocationCallback {
            private IBinder mRemote;

            static {
                t2o.a(756023310);
                t2o.a(756023308);
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

            @Override // com.taobao.location.aidl.ITBLocationCallback
            public void onLocationChanged(TBLocationDTO tBLocationDTO) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (tBLocationDTO != null) {
                        obtain.writeInt(1);
                        tBLocationDTO.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        tBLocationDTO.readFromParcel(obtain2);
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
            t2o.a(756023309);
            t2o.a(756023308);
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static ITBLocationCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof ITBLocationCallback)) {
                return new Proxy(iBinder);
            }
            return (ITBLocationCallback) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            TBLocationDTO tBLocationDTO;
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                if (parcel.readInt() != 0) {
                    tBLocationDTO = TBLocationDTO.CREATOR.createFromParcel(parcel);
                } else {
                    tBLocationDTO = null;
                }
                onLocationChanged(tBLocationDTO);
                parcel2.writeNoException();
                if (tBLocationDTO != null) {
                    parcel2.writeInt(1);
                    tBLocationDTO.writeToParcel(parcel2, 1);
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
