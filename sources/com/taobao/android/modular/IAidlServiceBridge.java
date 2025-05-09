package com.taobao.android.modular;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public interface IAidlServiceBridge extends IInterface {
    public static final String DESCRIPTOR = "com.taobao.android.modular.IAidlServiceBridge";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(578814016);
        }

        public static /* synthetic */ Object a(Parcel parcel, Parcelable.Creator creator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("66ef73d", new Object[]{parcel, creator});
            }
            return c(parcel, creator);
        }

        public static /* synthetic */ void b(Parcel parcel, Parcelable parcelable, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6c3e96c5", new Object[]{parcel, parcelable, new Integer(i)});
            } else {
                d(parcel, parcelable, i);
            }
        }

        public static <T> T c(Parcel parcel, Parcelable.Creator<T> creator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("4293affa", new Object[]{parcel, creator});
            }
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static <T extends Parcelable> void d(Parcel parcel, T t, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6888b16c", new Object[]{parcel, t, new Integer(i)});
            } else if (t != null) {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            } else {
                parcel.writeInt(0);
            }
        }
    }

    IBinder bindService(Intent intent) throws RemoteException;

    void unbindService(IBinder iBinder) throws RemoteException;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static abstract class Stub extends Binder implements IAidlServiceBridge {
        static final int TRANSACTION_bindService = 1;
        static final int TRANSACTION_unbindService = 2;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public static class Proxy implements IAidlServiceBridge {

            /* renamed from: a  reason: collision with root package name */
            public final IBinder f8997a;

            static {
                t2o.a(578814015);
                t2o.a(578814012);
            }

            public Proxy(IBinder iBinder) {
                this.f8997a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f8997a;
            }

            @Override // com.taobao.android.modular.IAidlServiceBridge
            public IBinder bindService(Intent intent) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IAidlServiceBridge.DESCRIPTOR);
                    a.b(obtain, intent, 0);
                    this.f8997a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readStrongBinder();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.android.modular.IAidlServiceBridge
            public void unbindService(IBinder iBinder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IAidlServiceBridge.DESCRIPTOR);
                    obtain.writeStrongBinder(iBinder);
                    this.f8997a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        static {
            t2o.a(578814014);
            t2o.a(578814012);
        }

        public Stub() {
            attachInterface(this, IAidlServiceBridge.DESCRIPTOR);
        }

        public static IAidlServiceBridge asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IAidlServiceBridge.DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IAidlServiceBridge)) {
                return new Proxy(iBinder);
            }
            return (IAidlServiceBridge) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IAidlServiceBridge.DESCRIPTOR);
            }
            if (i != 1598968902) {
                if (i == 1) {
                    IBinder bindService = bindService((Intent) a.a(parcel, Intent.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(bindService);
                } else if (i != 2) {
                    return super.onTransact(i, parcel, parcel2, i2);
                } else {
                    unbindService(parcel.readStrongBinder());
                }
                return true;
            }
            parcel2.writeString(IAidlServiceBridge.DESCRIPTOR);
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class Default implements IAidlServiceBridge {
        static {
            t2o.a(578814013);
            t2o.a(578814012);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.taobao.android.modular.IAidlServiceBridge
        public IBinder bindService(Intent intent) throws RemoteException {
            return null;
        }

        @Override // com.taobao.android.modular.IAidlServiceBridge
        public void unbindService(IBinder iBinder) throws RemoteException {
        }
    }
}
