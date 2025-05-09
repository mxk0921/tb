package com.taobao.accs.center;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.taobao.aranger.annotation.type.Callback;
import tb.t2o;

/* compiled from: Taobao */
@Callback
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public interface IAccsMainBinder extends IInterface {
    void onMessage(Intent intent) throws RemoteException;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static abstract class Stub extends Binder implements IAccsMainBinder {
        private static final String DESCRIPTOR = "com.taobao.accs.center.IAccsMainBinder";
        static final int TRANSACTION_onMessage = 1;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public static class Proxy implements IAccsMainBinder {
            public static IAccsMainBinder b;

            /* renamed from: a  reason: collision with root package name */
            public final IBinder f6027a;

            static {
                t2o.a(343933028);
                t2o.a(343933025);
            }

            public Proxy(IBinder iBinder) {
                this.f6027a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f6027a;
            }

            @Override // com.taobao.accs.center.IAccsMainBinder
            public void onMessage(Intent intent) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f6027a.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().onMessage(intent);
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
            t2o.a(343933027);
            t2o.a(343933025);
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IAccsMainBinder asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IAccsMainBinder)) {
                return new Proxy(iBinder);
            }
            return (IAccsMainBinder) queryLocalInterface;
        }

        public static IAccsMainBinder getDefaultImpl() {
            return Proxy.b;
        }

        public static boolean setDefaultImpl(IAccsMainBinder iAccsMainBinder) {
            if (Proxy.b != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            } else if (iAccsMainBinder == null) {
                return false;
            } else {
                Proxy.b = iAccsMainBinder;
                return true;
            }
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            Intent intent;
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                if (parcel.readInt() != 0) {
                    intent = (Intent) Intent.CREATOR.createFromParcel(parcel);
                } else {
                    intent = null;
                }
                onMessage(intent);
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

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class Default implements IAccsMainBinder {
        static {
            t2o.a(343933026);
            t2o.a(343933025);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.taobao.accs.center.IAccsMainBinder
        public void onMessage(Intent intent) throws RemoteException {
        }
    }
}
