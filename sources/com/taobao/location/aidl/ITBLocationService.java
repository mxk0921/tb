package com.taobao.location.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.taobao.location.aidl.ITBLocationCallback;
import com.taobao.location.common.TBLocationOption;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface ITBLocationService extends IInterface {
    void onLocationChanged(TBLocationOption tBLocationOption, ITBLocationCallback iTBLocationCallback) throws RemoteException;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static abstract class Stub extends Binder implements ITBLocationService {
        private static final String DESCRIPTOR = "com.taobao.location.aidl.ITBLocationService";
        static final int TRANSACTION_onLocationChanged = 1;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public static class Proxy implements ITBLocationService {
            private IBinder mRemote;

            static {
                t2o.a(756023313);
                t2o.a(756023311);
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

            @Override // com.taobao.location.aidl.ITBLocationService
            public void onLocationChanged(TBLocationOption tBLocationOption, ITBLocationCallback iTBLocationCallback) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (tBLocationOption != null) {
                        obtain.writeInt(1);
                        tBLocationOption.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (iTBLocationCallback != null) {
                        iBinder = iTBLocationCallback.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
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
            t2o.a(756023312);
            t2o.a(756023311);
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static ITBLocationService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof ITBLocationService)) {
                return new Proxy(iBinder);
            }
            return (ITBLocationService) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            TBLocationOption tBLocationOption;
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                if (parcel.readInt() != 0) {
                    tBLocationOption = TBLocationOption.CREATOR.createFromParcel(parcel);
                } else {
                    tBLocationOption = null;
                }
                onLocationChanged(tBLocationOption, ITBLocationCallback.Stub.asInterface(parcel.readStrongBinder()));
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
}
