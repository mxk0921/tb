package anetwork.channel.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import anetwork.channel.aidl.RemoteNetwork;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface IRemoteNetworkGetter extends IInterface {
    RemoteNetwork get(int i) throws RemoteException;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static abstract class Stub extends Binder implements IRemoteNetworkGetter {
        private static final String DESCRIPTOR = "anetwork.channel.aidl.IRemoteNetworkGetter";
        static final int TRANSACTION_get = 1;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static class Proxy implements IRemoteNetworkGetter {
            private IBinder mRemote;

            static {
                t2o.a(607125987);
                t2o.a(607125985);
            }

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // anetwork.channel.aidl.IRemoteNetworkGetter
            public RemoteNetwork get(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return RemoteNetwork.Stub.asInterface(obtain2.readStrongBinder());
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
            t2o.a(607125986);
            t2o.a(607125985);
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IRemoteNetworkGetter asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IRemoteNetworkGetter)) {
                return new Proxy(iBinder);
            }
            return (IRemoteNetworkGetter) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            IBinder iBinder;
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                RemoteNetwork remoteNetwork = get(parcel.readInt());
                parcel2.writeNoException();
                if (remoteNetwork != null) {
                    iBinder = remoteNetwork.asBinder();
                } else {
                    iBinder = null;
                }
                parcel2.writeStrongBinder(iBinder);
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
