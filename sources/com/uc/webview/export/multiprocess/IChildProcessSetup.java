package com.uc.webview.export.multiprocess;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface IChildProcessSetup extends IInterface {
    public static final String DESCRIPTOR = "com.uc.webview.export.multiprocess.IChildProcessSetup";

    IBinder preSetupConnection(Bundle bundle) throws RemoteException;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static abstract class Stub extends Binder implements IChildProcessSetup {
        static final int TRANSACTION_preSetupConnection = 1;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static class a implements IChildProcessSetup {

            /* renamed from: a  reason: collision with root package name */
            public static IChildProcessSetup f14317a;
            private IBinder b;

            public a(IBinder iBinder) {
                this.b = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.b;
            }

            @Override // com.uc.webview.export.multiprocess.IChildProcessSetup
            public final IBinder preSetupConnection(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IChildProcessSetup.DESCRIPTOR);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.b.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        IBinder readStrongBinder = obtain2.readStrongBinder();
                        obtain2.recycle();
                        obtain.recycle();
                        return readStrongBinder;
                    }
                    IBinder preSetupConnection = Stub.getDefaultImpl().preSetupConnection(bundle);
                    obtain2.recycle();
                    obtain.recycle();
                    return preSetupConnection;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }
        }

        public Stub() {
            attachInterface(this, IChildProcessSetup.DESCRIPTOR);
        }

        public static IChildProcessSetup asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IChildProcessSetup.DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IChildProcessSetup)) {
                return new a(iBinder);
            }
            return (IChildProcessSetup) queryLocalInterface;
        }

        public static IChildProcessSetup getDefaultImpl() {
            return a.f14317a;
        }

        public static boolean setDefaultImpl(IChildProcessSetup iChildProcessSetup) {
            if (a.f14317a != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            } else if (iChildProcessSetup == null) {
                return false;
            } else {
                a.f14317a = iChildProcessSetup;
                return true;
            }
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            Bundle bundle;
            if (i == 1598968902) {
                parcel2.writeString(IChildProcessSetup.DESCRIPTOR);
                return true;
            } else if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel.enforceInterface(IChildProcessSetup.DESCRIPTOR);
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                } else {
                    bundle = null;
                }
                IBinder preSetupConnection = preSetupConnection(bundle);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(preSetupConnection);
                return true;
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
