package com.taobao.android.ugc.service;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.taobao.android.ugc.service.ICallback;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface IMicroPublishService extends IInterface {
    void dismiss(String str) throws RemoteException;

    void onActivityResult(String str, int i, int i2, Intent intent) throws RemoteException;

    void showView(String str, String str2, String str3, ICallback iCallback) throws RemoteException;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static abstract class Stub extends Binder implements IMicroPublishService {
        private static final String DESCRIPTOR = "com.taobao.android.ugc.service.IMicroPublishService";
        static final int TRANSACTION_dismiss = 3;
        static final int TRANSACTION_onActivityResult = 2;
        static final int TRANSACTION_showView = 1;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public static class Proxy implements IMicroPublishService {
            public static IMicroPublishService b;

            /* renamed from: a  reason: collision with root package name */
            public final IBinder f9832a;

            static {
                t2o.a(758120512);
                t2o.a(758120509);
            }

            public Proxy(IBinder iBinder) {
                this.f9832a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f9832a;
            }

            @Override // com.taobao.android.ugc.service.IMicroPublishService
            public void dismiss(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    if (this.f9832a.transact(3, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().dismiss(str);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.android.ugc.service.IMicroPublishService
            public void onActivityResult(String str, int i, int i2, Intent intent) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f9832a.transact(2, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().onActivityResult(str, i, i2, intent);
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.taobao.android.ugc.service.IMicroPublishService
            public void showView(String str, String str2, String str3, ICallback iCallback) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    if (iCallback != null) {
                        iBinder = iCallback.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (this.f9832a.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().showView(str, str2, str3, iCallback);
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
            t2o.a(758120511);
            t2o.a(758120509);
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IMicroPublishService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IMicroPublishService)) {
                return new Proxy(iBinder);
            }
            return (IMicroPublishService) queryLocalInterface;
        }

        public static IMicroPublishService getDefaultImpl() {
            return Proxy.b;
        }

        public static boolean setDefaultImpl(IMicroPublishService iMicroPublishService) {
            if (Proxy.b != null || iMicroPublishService == null) {
                return false;
            }
            Proxy.b = iMicroPublishService;
            return true;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            Intent intent;
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                showView(parcel.readString(), parcel.readString(), parcel.readString(), ICallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            } else if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                int readInt2 = parcel.readInt();
                if (parcel.readInt() != 0) {
                    intent = (Intent) Intent.CREATOR.createFromParcel(parcel);
                } else {
                    intent = null;
                }
                onActivityResult(readString, readInt, readInt2, intent);
                parcel2.writeNoException();
                return true;
            } else if (i == 3) {
                parcel.enforceInterface(DESCRIPTOR);
                dismiss(parcel.readString());
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
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class Default implements IMicroPublishService {
        static {
            t2o.a(758120510);
            t2o.a(758120509);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.taobao.android.ugc.service.IMicroPublishService
        public void dismiss(String str) throws RemoteException {
        }

        @Override // com.taobao.android.ugc.service.IMicroPublishService
        public void onActivityResult(String str, int i, int i2, Intent intent) throws RemoteException {
        }

        @Override // com.taobao.android.ugc.service.IMicroPublishService
        public void showView(String str, String str2, String str3, ICallback iCallback) throws RemoteException {
        }
    }
}
