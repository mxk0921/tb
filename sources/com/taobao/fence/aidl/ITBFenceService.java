package com.taobao.fence.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.taobao.fence.common.FenceDataDTO;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface ITBFenceService extends IInterface {
    void gatherData(int i, String str) throws RemoteException;

    FenceDataDTO getData(int i, long j, String str) throws RemoteException;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static abstract class Stub extends Binder implements ITBFenceService {
        private static final String DESCRIPTOR = "com.taobao.fence.aidl.ITBFenceService";
        static final int TRANSACTION_gatherData = 1;
        static final int TRANSACTION_getData = 2;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public static class Proxy implements ITBFenceService {
            private IBinder mRemote;

            static {
                t2o.a(756023299);
                t2o.a(756023297);
            }

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.taobao.fence.aidl.ITBFenceService
            public void gatherData(int i, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.fence.aidl.ITBFenceService
            public FenceDataDTO getData(int i, long j, String str) throws RemoteException {
                FenceDataDTO fenceDataDTO;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeLong(j);
                    obtain.writeString(str);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        fenceDataDTO = FenceDataDTO.CREATOR.createFromParcel(obtain2);
                    } else {
                        fenceDataDTO = null;
                    }
                    return fenceDataDTO;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }
        }

        static {
            t2o.a(756023298);
            t2o.a(756023297);
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static ITBFenceService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof ITBFenceService)) {
                return new Proxy(iBinder);
            }
            return (ITBFenceService) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                gatherData(parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            } else if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                FenceDataDTO data = getData(parcel.readInt(), parcel.readLong(), parcel.readString());
                parcel2.writeNoException();
                if (data != null) {
                    parcel2.writeInt(1);
                    data.writeToParcel(parcel2, 1);
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
