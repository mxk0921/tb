package com.alipay.mobile.accountauthbiz;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface IAlipayLoginService extends IInterface {
    String getLoginInfo() throws RemoteException;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static abstract class Stub extends Binder implements IAlipayLoginService {
        private static final String DESCRIPTOR = "com.alipay.mobile.accountauthbiz.IAlipayLoginService";
        static final int TRANSACTION_getLoginInfo = 1;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static class Proxy implements IAlipayLoginService {

            /* renamed from: a  reason: collision with root package name */
            public final IBinder f3873a;

            public Proxy(IBinder iBinder) {
                this.f3873a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f3873a;
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.alipay.mobile.accountauthbiz.IAlipayLoginService
            public String getLoginInfo() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.f3873a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IAlipayLoginService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IAlipayLoginService)) {
                return new Proxy(iBinder);
            }
            return (IAlipayLoginService) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                String loginInfo = getLoginInfo();
                parcel2.writeNoException();
                parcel2.writeString(loginInfo);
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
