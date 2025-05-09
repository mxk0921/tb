package com.taobao.android.modular;

import android.content.ComponentName;
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
public interface IServiceConnection extends IInterface {
    public static final String DESCRIPTOR = "com.taobao.android.modular.IServiceConnection";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(578814021);
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

    void connected(ComponentName componentName, IBinder iBinder) throws RemoteException;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static abstract class Stub extends Binder implements IServiceConnection {
        static final int TRANSACTION_connected = 1;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public static class Proxy implements IServiceConnection {

            /* renamed from: a  reason: collision with root package name */
            public final IBinder f8998a;

            static {
                t2o.a(578814020);
                t2o.a(578814017);
            }

            public Proxy(IBinder iBinder) {
                this.f8998a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f8998a;
            }

            @Override // com.taobao.android.modular.IServiceConnection
            public void connected(ComponentName componentName, IBinder iBinder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IServiceConnection.DESCRIPTOR);
                    a.b(obtain, componentName, 0);
                    obtain.writeStrongBinder(iBinder);
                    this.f8998a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        static {
            t2o.a(578814019);
            t2o.a(578814017);
        }

        public Stub() {
            attachInterface(this, IServiceConnection.DESCRIPTOR);
        }

        public static IServiceConnection asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IServiceConnection.DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IServiceConnection)) {
                return new Proxy(iBinder);
            }
            return (IServiceConnection) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IServiceConnection.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IServiceConnection.DESCRIPTOR);
                return true;
            } else if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                connected((ComponentName) a.a(parcel, ComponentName.CREATOR), parcel.readStrongBinder());
                return true;
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class Default implements IServiceConnection {
        static {
            t2o.a(578814018);
            t2o.a(578814017);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.taobao.android.modular.IServiceConnection
        public void connected(ComponentName componentName, IBinder iBinder) throws RemoteException {
        }
    }
}
